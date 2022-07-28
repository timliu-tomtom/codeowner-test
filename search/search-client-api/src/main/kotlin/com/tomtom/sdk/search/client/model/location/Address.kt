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

package com.tomtom.sdk.search.client.model.location

/**
 * Describes the detailed address.
 *
 * @param streetNumber The building's number.
 * @param streetName The street name.
 * @param municipalitySubdivision The sub/super city.
 * @param municipality The city/town.
 * @param countrySecondarySubdivision The county.
 * @param countryTertiarySubdivision The named area.
 * @param countrySubdivision The state or province.
 * @param postalCode The postal code.
 * @param extendedPostalCode The extended postal code (availability dependent on region).
 * @param countryCode The country code.
 * @param country The name of the country.
 * @param countryCodeISO3 The ISO3-standard country code.
 * See https://www.iso.org/obp/ui/#search for more details.
 * @param freeformAddress The freeform address - the full address in a usable form.
 * @param countrySubdivisionName The full name of the first level of a country
 * administrative hierarchy.
 * This field only appears in case countrySubdivision is presented in an abbreviated form.
 * Supported only for USA, Canada, and Great Britain.
 * @param localName An address component which represents the name of a geographic area or
 * locality that groups a number of addressable objects for addressing purposes,
 * without being an administrative unit.
 *
 * Important: This is a Public Preview API. It may be changed or removed at any time.
 */
data class Address(
    val streetNumber: String = "",
    val streetName: String = "",
    val municipalitySubdivision: String = "",
    val municipality: String = "",
    val countrySecondarySubdivision: String = "",
    val countryTertiarySubdivision: String = "",
    val countrySubdivision: String = "",
    val postalCode: String = "",
    val extendedPostalCode: String = "",
    val countryCode: String = "",
    val country: String = "",
    val countryCodeISO3: String = "",
    val freeformAddress: String = "",
    val countrySubdivisionName: String = "",
    val localName: String = ""
)
