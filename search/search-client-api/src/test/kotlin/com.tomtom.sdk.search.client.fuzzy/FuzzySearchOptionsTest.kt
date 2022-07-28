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

package com.tomtom.sdk.search.client.fuzzy

import org.junit.Test
import kotlin.test.assertEquals

class FuzzySearchOptionsTest {

    @Test
    fun `search results limits should default to 10`() {
        val searchOptions = FuzzySearchOptions(query = "whatever")
        assertEquals(DEFAULT_RESULT_NUMBER, searchOptions.limit)
    }

    @Test
    fun `brand filter is set properly`() {
        val searchOptions = FuzzySearchOptions(query = "whatever", brandSet = brandFilterValue)
        assertEquals(brandFilterValue, searchOptions.brandSet)
    }

    @Test
    fun `country filter is set properly`() {
        val searchOptions = FuzzySearchOptions(query = "whatever", countrySet = countryFilterValue)
        assertEquals(countryFilterValue, searchOptions.countrySet)
    }

    @Test
    fun `category filter is set properly`() {
        val searchOptions =
            FuzzySearchOptions(query = "whatever", categorySet = categoryFilterValue)
        assertEquals(categoryFilterValue, searchOptions.categorySet)
    }

    private companion object {
        private const val DEFAULT_RESULT_NUMBER = 10
        private val brandFilterValue = setOf("BMW", "Audi", "Volvo")
        private val countryFilterValue = setOf("FR", "CH", "DE")
        private val categoryFilterValue = setOf(7320L, 9902L, 9910L)
    }
}
