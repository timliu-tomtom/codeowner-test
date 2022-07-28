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

package com.tomtom.sdk.search.client.model.ev

/**
 * Information about the connectors available in the [ChargingPark].
 *
 * @param connectorType Type of connector available at the Electric Vehicle Station.
 * @param ratedPowerKw Rated power of the connector in kilowatts (kW).
 * @param currentA Current value of the connector in amperes (A).
 * @param currentType Electric current type of the connector.
 * @param voltageV Voltage of the connector in Volts (V).
 *
 * Important: This is a Public Preview API. It may be changed or removed at any time.
 */
data class ConnectorDetails(
    val connectorType: String,
    val ratedPowerKw: Double?,
    val currentA: Int?,
    val currentType: String = "",
    val voltageV: Int?
)
