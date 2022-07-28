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

package com.tomtom.sdk.search.client.model

/**
 * Restricts the result to the Points Of Interest for specific fuels.
 *
 * Important: This is a Public Preview API. It may be changed or removed at any time.
 */
@JvmInline
value class FuelType private constructor(val type: Int) {
    companion object {
        /** Petroleum. */
        val Petrol = FuelType(0)
        /** Liquefied petroleum gas (LPG). */
        val Lpg = FuelType(1)
        /** Diesel fuel. */
        val Diesel = FuelType(2)
        /** Renewable, biodegradable fuel (BioDiesel). */
        val BioDiesel = FuelType(3)
        /** Diesel for commercial vehicles. */
        val CommercialVehicleDiesel = FuelType(4)
        /** Flex fuel, high-level combination of ethanol and gasoline (E85). */
        val E85 = FuelType(5)
        /** Liquefied natural gas (LNG). */
        val Lng = FuelType(6)
        /** Compressed natural gas (CNG). */
        val Cng = FuelType(7)
        /** Zero-carbon fuel burned with oxygen (Hydrogen). */
        val Hydrogen = FuelType(8)
        /** Diesel fuel with liquid that reduces the harmful emissions (AdBlue). */
        val AdBlue = FuelType(9)
    }
}
