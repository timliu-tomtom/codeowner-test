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
import java.lang.AutoCloseable
import java.util.Locale

/**
 * Interface of structured search API.
 *
 * @suppress API is created for internal use and should not be used publicly because
 * it might change without earlier notice.
 */
@ExperimentalStructuredSearchApi
interface StructuredSearchApi : AutoCloseable {

    /**
     * Start a new search session to find the full address hierarchically with preferred language.
     * The language can be changed later by [StructuredSearchSession.setLocale].
     * AAAAAAAAAAAAAAAAAAa
     * @param locale The [Locale] object, e.g. [Locale.UK] or [Locale.JAPAN].
     * @return A [StructuredSearchSession] object that could be used to perform structured search.
     */
    fun createSearchSession(
        locale: Locale
    ): StructuredSearchSession
}
