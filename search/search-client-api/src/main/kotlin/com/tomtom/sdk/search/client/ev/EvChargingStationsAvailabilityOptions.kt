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

package com.tomtom.sdk.search.client.ev

/**
 * Contains the parameters to use in an EV Charging Stations Availability search.
 *
 * @param chargingStationId The target charging station ID.
 * @param connectorTypeSet A set of connector types to restrict the results to
 * the availability of those specific connector types.
 * See https://developer.tomtom.com/search-api/search-api-documentation/supported-connector-types
 * for more details.
 * @param minPowerKw A parameter which to restrict the result to the availability of
 * connectors with a specific minimum power (expressed in kilowatts). Can be used with [maxPowerKw].
 * @param maxPowerKw A parameter to restrict the result to the availability of
 * connectors with a specific maximum power (expressed in kilowatts). Can be used with [minPowerKw].
 *
 * Important: This is a Public Preview API. It may be changed or removed at any time.
 */
data class EvChargingStationsAvailabilityOptions(
    val chargingStationId: String,
    val connectorTypeSet: Set<String> = emptySet(),
    val minPowerKw: Double? = null,
    val maxPowerKw: Double? = null
)
