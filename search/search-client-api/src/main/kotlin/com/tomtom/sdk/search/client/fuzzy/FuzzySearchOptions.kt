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

package com.tomtom.sdk.search.client.fuzzy

import androidx.annotation.IntRange
import com.tomtom.sdk.common.location.GeoBoundingBox
import com.tomtom.sdk.common.location.GeoCoordinate
import com.tomtom.sdk.search.client.model.FuelType
import com.tomtom.sdk.search.client.model.IndexType
import com.tomtom.sdk.search.client.model.information.EntityType
import com.tomtom.sdk.search.client.model.poi.RequestedPoiRelationType
import com.tomtom.sdk.search.client.model.time.OpeningHoursMode
import com.tomtom.sdk.search.client.model.time.TimeZoneType
import com.tomtom.sdk.search.common.model.MapCodeType

/**
 * Defines the parameters of a Fuzzy Search.
 *
 * @param query The searched query.
 * @param typeAhead If this flag is set to true, the query will be interpreted
 * as a partial input and the search will enter predictive mode.
 * @param limit The maximum number of search results that will be returned. Default limit is 10.
 * @param offset The starting offset of the returned results within the full result set.
 * @param countrySet A set of ISO 3166-1 alpha3 country codes. (e.g., FRA, ESP).
 * This will limit the search to the specified countries.
 * ISO 3166-1 alpha2 country codes (e.g., FR, ES) are also supported,
 * but only for the online search mode.
 * @param position The [GeoCoordinate] position where results should be biased.
 * @param radius The radius parameter is specified in meters.
 * The results will be constrained to the defined area.
 * @param boundingBox The [GeoBoundingBox] for the search.
 * @param language The language in which search results should be returned.
 * Should be one of the supported IETF language tags.
 * See https://developer.tomtom.com/search-api/search-api/supported-languages for more details.
 * @param extendedPostalCodes Indexes for which extended postal codes should be included
 * in the results.
 * @param minFuzzyLevel The minimum fuzziness level to be used.
 * The default value is 1. The maximum value is 4.
 * @param maxFuzzyLevel The maximum fuzziness level to be used.
 * The default value is 2. The maximum value is 4.
 * @param idx A set of [IndexType] which should be utilized for the search.
 * @param categorySet Restricts the Points Of Interest in the response to those whose ID is listed.
 * @param brandSet A list of brand names which could be used to restrict the result
 * to specific brands.
 * @param connectorSet A list of connector types which could be used to restrict the result
 * to Points Of Interest of type Electric Vehicle Station, supporting specific connector types.
 * See https://developer.tomtom.com/search-api/search-api-documentation/supported-connector-types
 * for more details.
 * @param minPowerKW A double value representing the power rate in kilowatts which is used
 * to restrict the result to the Points Of Interest of type Electric Vehicle Station supporting
 * at least one connector with a specific minimal value of power in kilowatts.
 * @param maxPowerKW A double value representing the power rate in kilowatts which is used
 * to restrict the result to the Points Of Interest of type Electric Vehicle Station supporting
 * at least one connector with a specific maximum value of power in kilowatts.
 * @param fuelSet A set of a [FuelType] which will be used to restrict the result to
 * the Points Of Interest of specific fuels.
 * @param geopoliticalView Defines what kind of geopolitical view should be used.
 * @param openingHours The opening hours scope.
 * @param timeZone Used to indicate the mode in which the time zone object should be returned.
 * @param mapCodes The set of [MapCodeType] which will be supported.
 * @param relatedPois A [RequestedPoiRelationType] that provides the possibility to return related
 * Points Of Interest.
 * @param entityTypeSet A set of [EntityType] which will be used to restrict the result to
 * the Geography result of a specific entity type.
 * @param category Determines whether the Category Search is enabled.
 *
 * Important: This is a Public Preview API. It may be changed or removed at any time.
 */
@Suppress("TooManyFunctions")
data class FuzzySearchOptions(
    val query: String,
    val typeAhead: Boolean? = null,

    @IntRange(from = 1, to = 100)
    val limit: Int = DEFAULT_LIMIT,

    val offset: Int? = null,
    val countrySet: Set<String> = emptySet(),
    val position: GeoCoordinate? = null,
    val radius: Int? = null,
    val boundingBox: GeoBoundingBox? = null,
    val language: String? = null,
    val extendedPostalCodes: List<IndexType> = emptyList(),
    val minFuzzyLevel: Int? = null,
    val maxFuzzyLevel: Int? = null,
    val idx: Set<IndexType> = emptySet(),
    val categorySet: Set<Long> = emptySet(),
    val brandSet: Set<String> = emptySet(),
    val connectorSet: Set<String> = emptySet(),
    val minPowerKW: Double? = null,
    val maxPowerKW: Double? = null,
    val fuelSet: Set<FuelType> = emptySet(),
    val geopoliticalView: String? = null,
    val openingHours: OpeningHoursMode? = null,
    val timeZone: TimeZoneType? = null,
    val mapCodes: Set<MapCodeType> = emptySet(),
    val relatedPois: RequestedPoiRelationType? = null,
    val entityTypeSet: Set<EntityType> = emptySet(),
    val category: Boolean? = null
) {
    private companion object {
        private const val DEFAULT_LIMIT = 10
    }
}
