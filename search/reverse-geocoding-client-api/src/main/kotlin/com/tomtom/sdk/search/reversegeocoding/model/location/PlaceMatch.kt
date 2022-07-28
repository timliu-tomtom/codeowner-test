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

package com.tomtom.sdk.search.reversegeocoding.model.location

import com.tomtom.sdk.common.location.GeoBoundingBox
import com.tomtom.sdk.common.location.GeoCoordinate
import com.tomtom.sdk.common.location.Place
import com.tomtom.sdk.search.common.model.MapCode
import com.tomtom.sdk.search.reversegeocoding.ReverseGeocoderOptions
import com.tomtom.sdk.search.reversegeocoding.model.information.GeoGeometry
import com.tomtom.sdk.search.reversegeocoding.model.information.MatchType
import com.tomtom.sdk.search.reversegeocoding.model.information.RoadUse

/**
 * Describes the place details retrieved from reverse geocoding.
 *
 * @param place The result of the reverse geocoding that is matching the request.
 * @param navigablePosition Position of the result.
 * @param roadUse List of road usage types at the place.
 * @param matchType Information on the type of match.
 * The value is null when [ReverseGeocoderOptions.entityTypes] filter is not empty.
 * @param mapCodes The set of [MapCode]s for the place match.
 * The value is null when [ReverseGeocoderOptions.mapCodeTypes] is null or empty.
 * @param geometry The geographical geometry of the place match. (where available)
 * The value is null when [ReverseGeocoderOptions.fetchGeometry] is not set to true.
 * The geometry fetching feature isn't implemented yet (this response field is reserved
 * for the future extension).
 * @param routeNumbers The codes used to unambiguously identify the street.
 * @param speedLimit The speed limit for the street (where available) in the form DD.DDUUU,
 * For example: 30.00KPH D is a digit (for example, 30.00). UUU is either KPH
 * or MPH (whichever is correct for the address).
 * @param boundingBox The bounding box of the place match.
 *
 * Important: This is a Public Preview API. It may be changed or removed at any time.
 */
data class PlaceMatch(
    val place: Place,
    val navigablePosition: GeoCoordinate,
    val roadUse: Set<RoadUse> = emptySet(),
    val matchType: MatchType? = null,
    val mapCodes: Set<MapCode> = emptySet(),
    val geometry: GeoGeometry? = null,
    val routeNumbers: List<String> = emptyList(),
    val speedLimit: String = "",
    val boundingBox: GeoBoundingBox? = null,
)
