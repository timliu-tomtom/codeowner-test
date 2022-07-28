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
 * The charging connector availability data per power level.
 *
 * @param powerKw Power value in kilowatts(kW).
 * @param available The number of charging points at this power level that are available.
 * @param occupied The number of charging points at this power level that are occupied.
 * @param reserved The number of charging points at this power level that are reserved.
 * @param unknown The number of charging points at this power level whose availability is not known.
 * @param outOfService The number of charging points at this power level that are out of service.
 *
 * Important: This is a Public Preview API. It may be changed or removed at any time.
 */
data class PowerKwAvailabilityDetails(
    val powerKw: Double,
    val available: Int,
    val occupied: Int,
    val reserved: Int,
    val unknown: Int,
    val outOfService: Int
)
