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

package com.tomtom.sdk.search.client.model.time

import java.util.Date

/**
 * Opening hours for a Point Of Interest.
 *
 * @param startTime The point in the next 7 days range when a given Point Of Interest is being
 * opened (or the beginning of the range if it was opened before the range) inclusive.
 * @param endTime The point in the next 7 days range when a given Point Of Interest is being opened
 * (or the beginning of the range if it was opened before the range) exclusive.
 *
 * Important: This is a Public Preview API. It may be changed or removed at any time.
 */
data class TimeRange(
    val startTime: Date,
    val endTime: Date
)
