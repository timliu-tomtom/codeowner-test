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

package com.tomtom.sdk.search.client.model

/**
 * Passes a list of indexes as a parameter to a query, which should be listed with their abbreviations.
 *
 * Important: This is a Public Preview API. It may be changed or removed at any time.
 */
enum class IndexType {

    /**
     *  Instead of having specific coordinates for house numbers, some streets have address points
     *  interpolated from both ends of the street. These points are represented as address ranges.
     */
    ADDRESS_RANGES,

    /**
     * Areas on the map which represent administrative divisions such as countries, states, or cities.
     */
    GEOGRAPHIES,

    /**
     * Points on the map associated with a specific address (street name and house number).
     */
    POINT_ADDRESSES,

    /**
     * Points of Interest: specific locations that users may find useful or noteworthy,
     * such as businesses and landmarks.
     */
    POI,

    /**
     * Representation of streets on the map.
     */
    STREETS,

    /**
     * Representations of junctions where two streets intersect.
     */
    CROSS_STREET
}
