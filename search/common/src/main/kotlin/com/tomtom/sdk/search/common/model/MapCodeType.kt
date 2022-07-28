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

package com.tomtom.sdk.search.common.model

/**
 * The type of map code.
 *
 * Important: This is a Public Preview API. It may be changed or removed at any time.
 */
@JvmInline
value class MapCodeType private constructor(val type: Int) {
    companion object {
        /**
         * The shortest (and easiest to remember) [MapCode].
         * Local mapcodes are especially useful when the user knows what territory the mapcode is in
         * (for example, when an application is designed to be used inside just
         * one European country or US state).
         */
        val Local = MapCodeType(0)

        /**
         * This mapcode is unambiguous. It is also the longest.
         */
        val International = MapCodeType(1)

        /**
         * Alternatives to [MapCodeType.Local].
         * Each Alternative mapcode points to slightly different coordinates due to
         * the way mapcodes are computed.
         */
        val Alternative = MapCodeType(2)
    }
}
