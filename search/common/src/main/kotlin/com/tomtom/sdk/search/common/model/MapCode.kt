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
 * MapCodes are designed to be short, easy to recognize, remember, and communicate.
 * Every location on Earth can be represented by a MapCode.
 * A MapCode represents a specific location to within a few meters.
 *
 * @param type The type of MapCode.
 * @param fullMapCode The full form of a MapCode (territory + code). It is always unambiguous.
 * @param territory The territory element of the MapCode.
 * The territory element is always in the Latin alphabet.
 * It is empty for an [MapCodeType.International].
 * @param code The MapCode without the territory element.
 * It consists of two groups of letters and digits separated by a dot.
 * It is empty for an International MapCode.
 *
 * Important: This is a Public Preview API. It may be changed or removed at any time.
 */

data class MapCode(
    val type: MapCodeType,
    val fullMapCode: String,
    val territory: String? = null,
    val code: String? = null,
)
