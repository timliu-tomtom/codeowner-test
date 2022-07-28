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

package com.tomtom.sdk.search.reversegeocoding.model.information

/**
 * The type of the road use.
 *
 * Important: This is a Public Preview API. It may be changed or removed at any time.
 */
@JvmInline
value class RoadUse private constructor(val use: Int) {
    companion object {
        val LimitedAccess = RoadUse(0)
        val Arterial = RoadUse(1)
        val Terminal = RoadUse(2)
        val Ramp = RoadUse(3)
        val Rotary = RoadUse(4)
        val LocalStreet = RoadUse(5)
    }
}
