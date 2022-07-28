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

import com.tomtom.sdk.search.client.model.time.TimeRange

/**
 * Returns the most popular times for people visiting the POI on the given day of the week.
 *
 * @param dayOfWeek A number from 1 to 7, corresponding to the days of the week, starting
 * from Monday, ISO_8601 format.
 * @param timeRanges List of the time ranges when the POI is most popular.
 *
 * Important: This is a Public Preview API. It may be changed or removed at any time.
 */
data class PopularHour(
    val dayOfWeek: Int,
    val timeRanges: List<TimeRange>
)
