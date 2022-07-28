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

package com.tomtom.sdk.search.reversegeocoding

import com.tomtom.sdk.common.location.GeoCoordinate
import org.junit.Test
import kotlin.test.assertEquals

class ReverseGeocoderOptionsTest {

    @Test
    fun `default radius in meters is 500 meters`() {
        val reverseGeocoderOptions = ReverseGeocoderOptions(
            position = GeoCoordinate(TEST_LATITUDE, TEST_LONGITUDE)
        )
        assertEquals(EXPECTED_RADIUS_IN_METERS, reverseGeocoderOptions.radiusInMeters)
    }

    private companion object {
        private const val TEST_LATITUDE = 51.1
        private const val TEST_LONGITUDE = 4.4444
        // 500 meters is the default value
        private const val EXPECTED_RADIUS_IN_METERS = 100
    }
}
