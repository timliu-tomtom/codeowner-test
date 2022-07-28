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

package com.tomtom.sdk.search.structuredsearch.model

import com.tomtom.sdk.common.location.GeoBoundingBox
import com.tomtom.sdk.search.structuredsearch.ExperimentalStructuredSearchApi

/**
 * A class representing the current state of [StructuredSearchSession]
 *
 * @property selectedCandidates The previous selected list of [StructuredSearchCandidate] and
 * the clients might use this to display selection on each address level.
 * @property availableCandidates The available list of [StructuredSearchCandidate] for the address
 * level and the clients are expected to select a candidate via
 * [StructuredSearchSession.selectCandidate] to proceed to next step.
 * @property boundingBox The bounding box representing the search state which could be used to zoom
 * the map view to the specific area.
 *
 * @suppress API is created for internal use and should not be used publicly because
 * it might change without earlier notice.
 */
@ExperimentalStructuredSearchApi
data class StructuredSearchState(
    val selectedCandidates: List<StructuredSearchCandidate>,
    val availableCandidates: List<StructuredSearchCandidate>,
    val boundingBox: GeoBoundingBox
)
