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

package com.tomtom.sdk.search.client.model.summary

/**
 * The summary of a Along Route Search API call.
 *
 * @param query The query that resulted in this response.
 * @param queryType The type of the query.
 * @param queryTime The time it took to process the query.
 * @param numResults The number of results returned in this batch.
 * @param offset The offset of the results in the collection of all results.
 * @param totalResults The total number of results.
 * @param fuzzyLevel The maximum fuzzy level required to provide results. Fuzzy level can be
 * in range of 1-4.
 *
 * Important: This is a Public Preview API. It may be changed or removed at any time.
 */
data class AlongRouteSummary(
    val query: String,
    val queryType: String,
    val queryTime: Int,
    val numResults: Int,
    val offset: Int,
    val totalResults: Int,
    val fuzzyLevel: Int
)
