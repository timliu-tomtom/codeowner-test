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

package com.tomtom.sdk.search.client.model.location

import com.tomtom.sdk.common.location.GeoCoordinate

/**
 * Address ranges on a street segment.
 *
 * @param rangeLeft An address range on the left side of a street segment
 * (assuming looking from the "from" end towards the "to" end).
 * @param rangeRight An address range on the right side of a street segment
 * (assuming looking from the "from" end towards the "to" end).
 * @param from The start point of a street segment.
 * @param to The end point of a street segment.
 *
 * Important: This is a Public Preview API. It may be changed or removed at any time.
 */
data class AddressRanges(
    val rangeLeft: String = "",
    val rangeRight: String = "",
    val from: GeoCoordinate?,
    val to: GeoCoordinate?
)
