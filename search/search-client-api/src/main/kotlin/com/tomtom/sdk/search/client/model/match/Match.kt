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

package com.tomtom.sdk.search.client.model.match

/**
 * Informs which part of the input is represented by the segment.
 *
 * @param offset Starting offset of the input substring matching the segment.
 * The offset of the first character is 0.
 * @param length Length of the matched substring.
 *
 * Important: This is a Public Preview API. It may be changed or removed at any time.
 */
data class Match(
    val offset: Int,
    val length: Int
)
