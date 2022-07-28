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

package com.tomtom.sdk.search.reversegeocoding.model.information

/**
 * The type of supported geometry for the reverse geocoding result.
 *
 * Important: This is a Public Preview API. It may be changed or removed at any time.
 */
@JvmInline
value class GeometryType private constructor(val type: Int) {
    companion object {
        val Point = GeometryType(0)
        val MultiPoint = GeometryType(1)
        val LineString = GeometryType(2)
        val MultiLineString = GeometryType(3)
        val Polygon = GeometryType(4)
        val MultiPolygon = GeometryType(5)
    }
}
