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

package com.tomtom.sdk.search.structuredsearch

import com.tomtom.sdk.search.structuredsearch.model.StructuredSearchCandidate
import com.tomtom.sdk.search.structuredsearch.model.StructuredSearchSession
import com.tomtom.sdk.search.structuredsearch.model.StructuredSearchState

/**
 * Response from the [StructuredSearchSession].
 *
 * @suppress API is created for internal use and should not be used publicly because
 * it might change without earlier notice.
 */
@ExperimentalStructuredSearchApi
sealed class StructuredSearchResponse {
    /**
     * Contains a [StructuredSearchState] when the search path hasn't ended.
     */
    data class NextState(
        val structuredSearchState: StructuredSearchState
    ) : StructuredSearchResponse()

    /**
     * Contains a [StructuredSearchCandidate] as destination when the search path ended.
     */
    data class Destination(
        val structuredSearchCandidate: StructuredSearchCandidate
    ) : StructuredSearchResponse()
}
