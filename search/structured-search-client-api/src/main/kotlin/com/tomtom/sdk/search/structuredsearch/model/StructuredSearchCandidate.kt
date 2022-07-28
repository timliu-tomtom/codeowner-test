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

import com.tomtom.sdk.common.location.Place
import com.tomtom.sdk.search.structuredsearch.StructuredSearchApi
import com.tomtom.sdk.search.structuredsearch.ExperimentalStructuredSearchApi

/**
 * Class representing a single candidate item.
 *
 * @property localizedString The string representing the localized string which depends on the
 * language when invoking [StructuredSearchApi.createSearchSession], e.g, `Tokyo` in English
 * ,`東京都` in Japanese.
 * @property locationInputString Useful for situations where the input script may not match the
 * display script, e.g. Japanese, and the usage is dependent on language and region, e.g, `トウキョウ`
 * may be returned for Tokyo while the corresponding [localizedString] is `東京都`.
 * @property candidateType The address level type.
 * @property place The [Place] object associated to it.
 *
 * @suppress API is created for internal use and should not be used publicly because
 * it might change without earlier notice.
 */
@ExperimentalStructuredSearchApi
data class StructuredSearchCandidate(
    val localizedString: String,
    val locationInputString: String,
    val candidateType: CandidateType,
    val place: Place
)
