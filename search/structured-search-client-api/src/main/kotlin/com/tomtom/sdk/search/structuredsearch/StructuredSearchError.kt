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

import com.tomtom.sdk.search.structuredsearch.model.StructuredSearchSession

/**
 * Error from [StructuredSearchSession].
 *
 * @property message Optional error message for this structured search error.
 *
 * @suppress API is created for internal use and should not be used publicly because
 * it might change without earlier notice.
 */
@ExperimentalStructuredSearchApi
open class StructuredSearchError internal constructor(val message: String)

/** The selection is not valid in the current step. */
@OptIn(ExperimentalStructuredSearchApi::class)
class BadInputError(message: String = "") : StructuredSearchError(message)

/**
 * The map data to perform structured search i.e sqlite location input (SLI) building
 * block doesn't exist.
 */
@OptIn(ExperimentalStructuredSearchApi::class)
class NoDataError(message: String = "") : StructuredSearchError(message)

/** Other kinds of error. */
@OptIn(ExperimentalStructuredSearchApi::class)
class UnknownError(message: String = "") : StructuredSearchError(message)
