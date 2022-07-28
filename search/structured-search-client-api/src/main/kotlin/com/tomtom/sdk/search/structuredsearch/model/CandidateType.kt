/*
 * © 2022 TomTom NV. All rights reserved.
 *
 * This software is the proprietary copyright of TomTom NV and its subsidiaries and may be
 * used for internal evaluation purposes or commercial use strictly subject to separate
 * license agreement between you and TomTom NV. If you are the licensee, you are only permitted
 * to use this software in accordance with the terms of your license agreement. If you are
 * not the licensee, you are not authorized to use this software in any manner and should
 * immediately return or destroy it.
 */

package com.tomtom.sdk.search.structuredsearch.model

import com.tomtom.sdk.search.structuredsearch.ExperimentalStructuredSearchApi

/**
 * [CandidateType] represents the address level type for each [StructuredSearchCandidate].
 *
 * @suppress API is created for internal use and should not be used publicly because
 * it might change without earlier notice.
 */
@ExperimentalStructuredSearchApi
enum class CandidateType {
    /** Country.*/
    COUNTRY,
    /** The definition is country specific, e.g, prefecture(in Japan).*/
    SUB_COUNTRY,
    /** The municipality name.*/
    MUNICIPALITY,
    /** The definition is country specific, e.g, Oaza (in Japan).*/
    CITY_DISTRICT,
    /** Road.*/
    ROAD,
    /** City block.*/
    CITY_BLOCK,
    /** Neighborhood, e.g, Aza/Chome (in Japan).*/
    NEIGHBORHOOD,
    /** Postal code.*/
    POSTAL_CODE,
    /** House number.*/
    HOUSE,
}
