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

import com.tomtom.sdk.search.reversegeocoding.model.location.PlaceMatch
import com.tomtom.sdk.search.reversegeocoding.model.summary.Summary

/**
 * Response of the Reverse Geocoding API.
 *
 * @param summary The summary of the request to the Reverse Geocoding API.
 * @param places The result list, sorted in descending order by score.
 *
 * Important: This is a Public Preview API. It may be changed or removed at any time.
 */
data class ReverseGeocoderResponse(
    val summary: Summary,
    val places: List<PlaceMatch>
)
