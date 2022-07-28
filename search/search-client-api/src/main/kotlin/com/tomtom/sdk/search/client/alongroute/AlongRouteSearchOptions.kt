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

package com.tomtom.sdk.search.client.alongroute

import com.tomtom.sdk.common.location.GeoCoordinate
import com.tomtom.sdk.common.time.Duration
import com.tomtom.sdk.search.client.model.FuelType
import com.tomtom.sdk.search.client.model.information.SpreadingMode
import com.tomtom.sdk.search.client.model.poi.RequestedPoiRelationType
import com.tomtom.sdk.search.client.model.sorting.SortBy
import com.tomtom.sdk.search.client.model.time.OpeningHoursMode
import com.tomtom.sdk.search.client.model.time.TimeZoneType
import com.tomtom.sdk.search.common.model.MapCodeType

/**
 * Defines the parameters of a Search Along the Route query.
 *
 * @param query The search query.
 * @param route The route points.
 * @param maxDetourTime The maximum detour time. The maximum value is 3600 seconds.
 * @param typeAhead If this flag is set to true, the query will be interpreted
 * as a partial input and the search will enter predictive mode.
 * @param limit The maximum number of search results that will be returned.
 * @param categorySet Restricts the Points Of Interest in the response to those whose category ID is listed.
 * @param brandSet A list of brand names used to restrict the result to POIs associated
 * with those brands.
 * @param connectorSet A list of connector types used to restrict the results to
 * electric vehicle stations that support those connector types.
 * See https://developer.tomtom.com/search-api/search-api-documentation/supported-connector-types
 * for more details.
 * @param minPowerKw A double value representing a power rate in kilowatts, used to restrict
 * the results to electric vehicle stations with at least one connector with that minimum power.
 * @param maxPowerKw A double value representing a power rate in kilowatts, used
 * the results to electric vehicle stations with at least one connector with that maximum power.
 * @param fuelSet A set of [FuelType]s, used to restrict the results to ones with specific fuels.
 * @param geopoliticalView Defines what kind of geopolitical view should be used.
 * @param detourOffset Parameter which turns on calculation of the distance between the start
 * of the route and the starting point of the detour to a POI.
 * @param sortBy Defines how the results will be sorted.
 * @param openingHours Scope of the opening hours to be provided.
 * @param spreadingMode Defines the spreading of returned results along the route.
 * @param mapCodes The set of [MapCodeType]s which will be supported.
 * @param timeZone Used to indicate the mode in which the time zone object will be returned.
 * @param relatedPois Uses the [RequestedPoiRelationType] to specify what kinds of related POIs to return.
 * Points Of Interest.
 *
 * Important: This is a Public Preview API. It may be changed or removed at any time.
 */
data class AlongRouteSearchOptions(
    val query: String,
    val route: List<GeoCoordinate>,
    val maxDetourTime: Duration,
    val typeAhead: Boolean? = null,
    val limit: Int? = null,
    val categorySet: Set<Long> = emptySet(),
    val brandSet: Set<String> = emptySet(),
    val connectorSet: Set<String> = emptySet(),
    val minPowerKw: Double? = null,
    val maxPowerKw: Double? = null,
    val fuelSet: Set<FuelType> = emptySet(),
    val geopoliticalView: String? = null,
    val detourOffset: Boolean? = null,
    val sortBy: SortBy? = null,
    val openingHours: OpeningHoursMode? = null,
    val spreadingMode: SpreadingMode? = null,
    val mapCodes: Set<MapCodeType> = emptySet(),
    val timeZone: TimeZoneType? = null,
    val relatedPois: RequestedPoiRelationType? = null
)
