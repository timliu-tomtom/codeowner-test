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

package com.tomtom.sdk.search.reversegeocoding.model.information

/**
 * The type of the entity.
 *
 * Important: This is a Public Preview API. It may be changed or removed at any time.
 */
@JvmInline
value class EntityType private constructor(public val value: Int) {
    companion object {
        val Country: EntityType = EntityType(0)
        val CountrySubdivision: EntityType = EntityType(1)
        val CountrySecondarySubdivision: EntityType = EntityType(2)
        val CountryTertiarySubdivision: EntityType = EntityType(3)
        val Municipality: EntityType = EntityType(4)
        val MunicipalitySubdivision: EntityType = EntityType(5)
        val Neighborhood: EntityType = EntityType(6)
        val PostalCodeArea: EntityType = EntityType(7)
    }
}
