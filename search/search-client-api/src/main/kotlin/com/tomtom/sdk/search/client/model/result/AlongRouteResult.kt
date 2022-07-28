/*
 * © 2021 TomTom NV. All rights reserved.
 *
 * This software is the proprietary copyright of TomTom NV and its subsidiaries and may be
 * used for internal evaluation purposes or commercial use strictly subject to separate
 * license agreement between you and TomTom NV. If you are the licensee, you are only permitted
 * to use this software in accordance with the terms of your license agreement. If you are
 * not the licensee, you are not authorized to use this software in any manner and should
 * immediately return or destroy it.
 */

package com.tomtom.sdk.search.client.model.result

import com.tomtom.sdk.common.location.GeoBoundingBox
import com.tomtom.sdk.common.location.GeoCoordinate
import com.tomtom.sdk.common.measures.Distance
import com.tomtom.sdk.search.client.model.ev.ChargingPark
import com.tomtom.sdk.search.client.model.information.AdditionalDataSources
import com.tomtom.sdk.search.client.model.information.EntryPoint
import com.tomtom.sdk.search.client.model.location.Address
import com.tomtom.sdk.search.client.model.poi.Poi
import com.tomtom.sdk.search.client.model.poi.RelatedPoi
import com.tomtom.sdk.search.common.model.MapCode

/**
 * Describes the details of a single result item returned by the Search API.
 *
 * @param type The type of result.
 * @param id The ID of the result.
 * @param score The score of the result.
 * @param distance [Distance] from the provided route.
 * @param info Additional information.
 * @param poi Information about the Point Of Interest.
 * @param relatedPois List of related Points Of Interest.
 * @param address The detailed address of the result.
 * @param position The geographical position of the Point Of Interest.
 * @param mapCodes A list of [MapCode] objects.
 * @param viewport The viewport.
 * @param entryPoints A list of entrances to the Point Of Interest.
 * @param detourTime Detour time in seconds.
 * @param detourOffset Detour offset in meters.
 * @param chargingPark Present only when the Points of Interest are of the Electric Vehicle Station
 * type.
 * @param dataSources Information about the sources of additional data that can be used
 * with the Additional Data service.
 *
 * Important: This is a Public Preview API. It may be changed or removed at any time.
 */
data class AlongRouteResult(
    val type: String,
    val id: String,
    val score: Double,
    val distance: Double,
    val info: String = "",
    val poi: Poi,
    val relatedPois: List<RelatedPoi>? = null,
    val address: Address?,
    val position: GeoCoordinate,
    val mapCodes: List<MapCode>? = null,
    val viewport: GeoBoundingBox? = null,
    val entryPoints: Set<EntryPoint>? = null,
    val detourTime: Int? = null,
    val detourOffset: Int? = null,
    val chargingPark: ChargingPark? = null,
    val dataSources: AdditionalDataSources? = null,
)
