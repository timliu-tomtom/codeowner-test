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

package com.tomtom.sdk.search.client.autocomplete

import com.tomtom.sdk.common.location.GeoCoordinate

/**
 * Contains the parameters to use in an autocomplete search.
 *
 * @param query The search query.
 * @param language Language in which the autocomplete results should be returned.
 * Must be one of the TomTom-supported IETF language tags.
 * See https://developer.tomtom.com/search-api/search-api/supported-languages for more details.
 * @param limit The maximum number of autocomplete results that will be returned.
 * @param position The position around which results should be biased.
 * @param radius The search radius in meters.
 * @param countryCodes A set of country codes (e.g., FR,ES). This limits the autocomplete
 * results to the specified countries.
 * @param resultTypes Restricts the results to specific segments (e.g., "category",
 * "brand", or "category,brand"). A result is only included if at least one segment is any
 * of the indicated types.
 *
 * Important: This is a Public Preview API. It may be changed or removed at any time.
 */
data class AutocompleteSearchOptions(
    val query: String,
    val language: String,
    val limit: Int? = null,
    val position: GeoCoordinate? = null,
    val radius: Int? = null,
    val countryCodes: Set<String> = emptySet(),
    val resultTypes: Set<String> = setOf(RESULT_TYPE_CATEGORY, RESULT_TYPE_BRAND)
) {
    companion object {
        /**
         * Autocomplete result of type POI category suggestion.
         */
        const val RESULT_TYPE_CATEGORY = "category"

        /**
         * Autocomplete result of type POI brand suggestion.
         */
        const val RESULT_TYPE_BRAND = "brand"
    }
}
