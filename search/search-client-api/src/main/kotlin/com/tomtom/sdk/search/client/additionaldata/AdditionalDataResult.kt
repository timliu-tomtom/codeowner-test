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

package com.tomtom.sdk.search.client.additionaldata

import com.tomtom.sdk.common.geojson.GeoJsonObject

/**
 * Describes the details of a single result item returned by the Additional Data Search API.
 *
 * @param providerId The ID of the returned entity.
 * @param error The reason for the failure to obtain data for this provider.
 * @param geometryData The GeoJSON geometry data. Only present if an "error" is not present.
 *
 * Important: This is a Public Preview API. It may be changed or removed at any time.
 */
data class AdditionalDataResult(
    val providerId: String,
    val error: String?,
    val geometryData: GeoJsonObject?
)
