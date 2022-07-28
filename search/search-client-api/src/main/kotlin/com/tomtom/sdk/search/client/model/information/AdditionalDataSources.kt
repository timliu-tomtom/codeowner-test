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

package com.tomtom.sdk.search.client.model.information

/**
 * Contains information about the Points Of Interest details.
 *
 * @param chargingAvailability Information about the charging stations availability.
 * @param geometry Information about the geometric shape of the result.
 *
 * Important: This is a Public Preview API. It may be changed or removed at any time.
 */
data class AdditionalDataSources(
    val chargingAvailability: ChargingAvailabilityDataSource?,
    val geometry: GeometryDataSource?,
)
