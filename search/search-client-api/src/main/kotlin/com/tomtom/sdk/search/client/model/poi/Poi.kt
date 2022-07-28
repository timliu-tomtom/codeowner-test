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

package com.tomtom.sdk.search.client.model.poi

import com.tomtom.sdk.search.client.model.time.OpeningHours
import com.tomtom.sdk.search.client.model.time.TimeZone

/**
 * Point Of Interest retrieved via a Search API call.
 *
 * @param name The name of the Point Of Interest.
 * @param phone The phone number of the Point Of Interest.
 * @param brands The brands this Point Of Interest belongs to.
 * @param url The URL address of the Point Of Interest website.
 * @param categorySet The list of Point Of Interest [CategoryId].
 * @param openingHours The Point Of Interest opening hours.
 * @param classifications The classifications this Point Of Interest belongs to.
 * @param timeZone The Point Of Interest [TimeZone].
 *
 * Important: This is a Public Preview API. It may be changed or removed at any time.
 */
data class Poi(
    val name: String,
    val phone: String = "",
    val brands: List<Brand> = emptyList(),
    val url: String = "",
    val categorySet: List<CategoryId> = emptyList(),
    val openingHours: OpeningHours?,
    val classifications: List<Classification> = emptyList(),
    val timeZone: TimeZone?
)
