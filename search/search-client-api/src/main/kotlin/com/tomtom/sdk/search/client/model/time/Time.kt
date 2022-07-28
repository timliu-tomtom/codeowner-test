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

/**
 * Defines a time.
 *
 * @param hour Hours are in the 24 hour format in the local time of the POI.
 * Value range is 0..23.
 * @param minutes Minutes are in the local time of the POI. Value range is 0..59.
 *
 * Important: This is a Public Preview API. It may be changed or removed at any time.
 */
data class Time internal constructor(
    val hour: Int,
    val minutes: Int
)
