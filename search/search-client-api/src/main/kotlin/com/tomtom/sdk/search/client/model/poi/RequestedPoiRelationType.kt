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

/**
 * Point Of Interest relationship type.
 *
 * Points Of Interest can be related to each other when the one is a real and physical part of
 * the other. For example, an airport terminal can physically belong to an airport.
 * This relationship is expressed as a parent/child relationship:
 * the airport terminal is a child of the airport.
 *
 * Important: This is a Public Preview API. It may be changed or removed at any time.
 */
enum class RequestedPoiRelationType {
    /**
     * Response contains children of the POI.
     */
    CHILD,

    /**
     * Response contains parents of the POI.
     */
    PARENT,

    /**
     * Response contains both children and parents of the POI.
     */
    ALL
}
