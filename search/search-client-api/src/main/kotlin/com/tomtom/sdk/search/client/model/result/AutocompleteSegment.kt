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

import com.tomtom.sdk.search.client.model.match.Matches

/**
 * Describes an entity found within the autocomplete search term. An entity is a distinct part
 * of the search term that can be used to generate a query.
 *
 * @param type The type of entity detected.
 * @param value The value of the entity. It may be a category name, brand name, or a piece
 * of unrecognized text. If it's a brand segment, the content of this field can be used
 * to restrict results of other search endpoints to Points Of Interest (POI) for specific brands.
 * See the brandSet parameter in the Fuzzy Search service
 * [documentation][https://developer.tomtom.com/search-api/search-api-documentation-search/fuzzy-search].
 * @param matches Reports which part of the input query contains the matched segment. Input query
 * matching may not be continuous, so the mapping is defined by an array of matched substrings.
 * @param id Category segment type. Can be used to restrict the results of other
 * search endpoints to Points Of Interest (POI) from specific categories. See the categorySet
 * parameter in the Fuzzy Search service
 * [documentation][https://developer.tomtom.com/search-api/search-api-documentation-search/fuzzy-search].
 * @param matchedAlternativeName (Optional) category segment type. Present only if
 * a part of the user query matches an alternative name instead of a primary name. For example,
 * for the input query "petrol station" the category segment value is "gas station" and the
 * matchedAlternativeName is "petrol station".
 *
 * @see [Fuzzy Search Service][https://developer.tomtom.com/search-api/search-api-documentation-search/fuzzy-search]
 *
 * Important: This is a Public Preview API. It may be changed or removed at any time.
 */
data class AutocompleteSegment(
    val type: String,
    val value: String,
    val matches: Matches,
    val id: String? = null,
    val matchedAlternativeName: String? = null
)
