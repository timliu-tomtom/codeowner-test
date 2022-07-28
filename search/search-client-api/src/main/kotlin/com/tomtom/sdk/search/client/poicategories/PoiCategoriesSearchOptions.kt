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

package com.tomtom.sdk.search.client.poicategories

/**
 * Defines the parameters of a POI Categories Search query.
 *
 * @param language Language in which the category tree should be returned.
 * One of the TomTom supported IETF language tags except NGT and NGT-Latn.
 * When language parameters are not set then category tree will be returned in English.
 *
 * @see [Supported languages](https://developer.tomtom.com/search-api/search-api/supported-languages)
 *
 * Important: This is a Public Preview API. It may be changed or removed at any time.
 */
data class PoiCategoriesSearchOptions @JvmOverloads constructor(val language: String? = null)
