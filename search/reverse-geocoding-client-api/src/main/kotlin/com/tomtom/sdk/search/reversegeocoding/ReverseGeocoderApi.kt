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

package com.tomtom.sdk.search.reversegeocoding

import com.tomtom.sdk.common.Cancellable
import com.tomtom.sdk.common.Disposable
import com.tomtom.sdk.common.Result

/**
 * Interface of the Reverse geocoding API for turning a location on the map into a
 * human-readable address.
 *
 * Important: This is a Public Preview API. It may be changed or removed at any time.
 */
interface ReverseGeocoderApi : Disposable {
    /**
     * Performs a synchronous Reverse Geocoding call using the provided
     * [ReverseGeocoderOptions] object and delivers the [Result] by the provided
     * [ReverseGeocoderResponse], or a [ReverseGeocoderError] if the action fails.
     *
     * @param reverseGeocoderOptions The object containing the data for the Reverse Geocoding call.
     *
     * @return The [Result] contains a [ReverseGeocoderResponse] if the call succeeds, or
     * a [ReverseGeocoderError] if it fails.
     */
    fun reverseGeocode(
        reverseGeocoderOptions: ReverseGeocoderOptions
    ): Result<ReverseGeocoderResponse, ReverseGeocoderError>

    /**
     * Performs an asynchronous Reverse Geocoding call using the provided
     * [ReverseGeocoderOptions] object and returns the result
     * with the provided [ReverseGeocoderCallback].
     *
     * @param reverseGeocoderOptions The object containing the data for the Reverse Geocoding call.
     * @param reverseGeocoderCallback The [ReverseGeocoderCallback] invoked when the search operation
     * has finished, either successfully or with an error.
     * The callback will be executed in the main thread.
     */
    fun reverseGeocode(
        reverseGeocoderOptions: ReverseGeocoderOptions,
        reverseGeocoderCallback: ReverseGeocoderCallback
    ): Cancellable
}
