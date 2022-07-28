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

import androidx.annotation.IntRange
import com.tomtom.sdk.common.Cancellable
import com.tomtom.sdk.common.Result
import com.tomtom.sdk.search.structuredsearch.StructuredSearchApi
import com.tomtom.sdk.search.structuredsearch.StructuredSearchCallback
import com.tomtom.sdk.search.structuredsearch.StructuredSearchError
import com.tomtom.sdk.search.structuredsearch.StructuredSearchResponse
import com.tomtom.sdk.search.structuredsearch.ExperimentalStructuredSearchApi
import java.lang.AutoCloseable
import java.util.Locale

/**
 * A class that manages a single structured search session against the [StructuredSearchApi]. The
 * search proceeds as a series of steps and intermediate searches.
 *
 * @suppress API is created for internal use and should not be used publicly because
 * it might change without earlier notice.
 */
@ExperimentalStructuredSearchApi
interface StructuredSearchSession : AutoCloseable {

    /**
     * Perform an asynchronous action to get the initial search state, which contains
     * a list of candidates representing the top level of an address, such as country.
     *
     * @param structuredSearchCallback The [StructuredSearchCallback] invoked when the search
     * has been finished either successfully or with an error.
     *
     * @return The [Cancellable] operation.
     */
    fun getInitialStructuredSearchState(
        structuredSearchCallback: StructuredSearchCallback
    ): Cancellable

    /**
     * Perform a synchronous action to get the initial search state, which contains
     * a list of candidates representing the top level of an address, such as country.
     *
     * @return The [Result] contains a [StructuredSearchResponse] if the call succeeds, or
     * a [StructuredSearchError] if it fails.
     */
    fun getInitialStructuredSearchState(): Result<StructuredSearchResponse, StructuredSearchError>

    /**
     * Perform an asynchronous action to select a specific candidate in the current step. This
     * will advance to the next step of the search path.
     *
     * @param candidate The candidate to select in the current step.
     * @param structuredSearchCallback The [StructuredSearchCallback] invoked when the selection
     * has been finished either successfully or with an error.
     *
     * @return The [Cancellable] operation.
     */
    fun selectCandidate(
        candidate: StructuredSearchCandidate,
        structuredSearchCallback: StructuredSearchCallback,
    ): Cancellable

    /**
     * Perform a synchronous action to select a specific candidate in the current step. This
     * will advance to the next step of the search path.
     *
     * @param candidate The candidate to select in the current step.
     *
     * @return The [Result] contains a [StructuredSearchResponse] if the call succeeds, or
     * a [StructuredSearchError] if it fails.
     */
    fun selectCandidate(
        candidate: StructuredSearchCandidate
    ): Result<StructuredSearchResponse, StructuredSearchError>

    /**
     * Perform an asynchronous action to go back to previous selection from current step.
     * [step] must be a positive value. If [step] is larger than the number of steps that have
     * been taken, e.g. [goBack] is called with [step] set to 9 at the third step, it goes back
     * to the first step.
     *
     * @param step The number of step to go back. Default to 1.
     * @param structuredSearchCallback The [StructuredSearchCallback] invoked when the going
     * back has been finished either successfully or with an error.
     *
     * @return The [Cancellable] operation.
     */
    fun goBack(
        @IntRange(from = 1)
        step: Int = 1,
        structuredSearchCallback: StructuredSearchCallback,
    ): Cancellable

    /**
     * Perform a synchronous action to go back to previous selection from current step.
     * [step] must be a positive value. If [step] is larger than the number of steps that have
     * been taken, e.g. [goBack] is called with [step] set to 9 at the third step, it goes back
     * to the first step.
     *
     * @param step The number of step to go back. Default to 1.
     *
     * @return The [Result] contains a [StructuredSearchResponse] if the call succeeds, or
     * a [StructuredSearchError] if it fails.
     */
    fun goBack(
        @IntRange(from = 1)
        step: Int = 1,
    ): Result<StructuredSearchResponse, StructuredSearchError>

    /**
     * Perform an asynchronous action to set the language for the whole search session.
     * If the language is invalid (e.g. Locale.ROOT), the session language remains the same,
     * while the callback will still be invoked to indicate the request is consumed.
     *
     * @param locale The [Locale] object, e.g. [Locale.UK] or [Locale.JAPAN].
     * @param structuredSearchCallback The [StructuredSearchCallback] invoked when changing locale
     * has been finished either successfully or with an error.
     *
     * @return The [Cancellable] operation.
     */
    fun setLocale(
        locale: Locale,
        structuredSearchCallback: StructuredSearchCallback,
    ): Cancellable

    /**
     * Perform a synchronous action to set the language for the whole search session.
     * If the language is invalid (e.g. Locale.ROOT), the session language remains the same.
     *
     * @param locale The [Locale] object, e.g. [Locale.UK] or [Locale.JAPAN].
     *
     * @return The [Result] contains a [StructuredSearchResponse] if the call succeeds, or
     * a [StructuredSearchError] if it fails.
     */
    fun setLocale(
        locale: Locale
    ): Result<StructuredSearchResponse, StructuredSearchError>
}
