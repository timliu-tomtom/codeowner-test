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

package com.tomtom.sdk.search.client

import com.tomtom.sdk.common.Cancellable
import com.tomtom.sdk.common.Disposable
import com.tomtom.sdk.common.Result
import com.tomtom.sdk.search.client.additionaldata.AdditionalDataSearchCallback
import com.tomtom.sdk.search.client.additionaldata.AdditionalDataSearchError
import com.tomtom.sdk.search.client.additionaldata.AdditionalDataSearchOptions
import com.tomtom.sdk.search.client.additionaldata.AdditionalDataSearchResponse
import com.tomtom.sdk.search.client.alongroute.AlongRouteSearchCallback
import com.tomtom.sdk.search.client.alongroute.AlongRouteSearchError
import com.tomtom.sdk.search.client.alongroute.AlongRouteSearchOptions
import com.tomtom.sdk.search.client.alongroute.AlongRouteSearchResponse
import com.tomtom.sdk.search.client.autocomplete.AutocompleteSearchCallback
import com.tomtom.sdk.search.client.autocomplete.AutocompleteSearchError
import com.tomtom.sdk.search.client.autocomplete.AutocompleteSearchOptions
import com.tomtom.sdk.search.client.autocomplete.AutocompleteSearchResponse
import com.tomtom.sdk.search.client.ev.EvChargingStationsAvailabilityCallback
import com.tomtom.sdk.search.client.ev.EvChargingStationsAvailabilityError
import com.tomtom.sdk.search.client.ev.EvChargingStationsAvailabilityOptions
import com.tomtom.sdk.search.client.ev.EvChargingStationsAvailabilityResponse
import com.tomtom.sdk.search.client.fuzzy.FuzzySearchCallback
import com.tomtom.sdk.search.client.fuzzy.FuzzySearchError
import com.tomtom.sdk.search.client.fuzzy.FuzzySearchOptions
import com.tomtom.sdk.search.client.fuzzy.FuzzySearchResponse
import com.tomtom.sdk.search.client.geometry.GeometrySearchCallback
import com.tomtom.sdk.search.client.geometry.GeometrySearchError
import com.tomtom.sdk.search.client.geometry.GeometrySearchOptions
import com.tomtom.sdk.search.client.geometry.GeometrySearchResponse
import com.tomtom.sdk.search.client.poicategories.PoiCategoriesSearchCallback
import com.tomtom.sdk.search.client.poicategories.PoiCategoriesSearchError
import com.tomtom.sdk.search.client.poicategories.PoiCategoriesSearchOptions
import com.tomtom.sdk.search.client.poicategories.PoiCategoriesSearchResponse

/**
 * Interface of the search API.
 * Hello
 * Important: This is a Public Preview API. It may be changed or removed at any time.
 */
@SuppressWarnings("TooManyFunctions")
interface SearchApi : Disposable {

    /**
     * Performs a synchronous Fuzzy Search computing action based on the provided
     * [FuzzySearchOptions] object and delivers the [Result] by the provided
     * an [FuzzySearchResponse] or a [FuzzySearchError] if the action fails.
     *
     * @param fuzzySearchOptions The object which contains the data necessary to execute
     * the Fuzzy Search action.
     *
     * @return The [Result] contains an [FuzzySearchResponse] in case of success or
     * an [FuzzySearchError] in case of failure.
     */
    fun fuzzySearch(
        fuzzySearchOptions: FuzzySearchOptions
    ): Result<FuzzySearchResponse, FuzzySearchError>

    /**
     * Performs an asynchronous Fuzzy Search computing action based on the provided
     * [FuzzySearchOptions] object and returns the result by the provided [FuzzySearchCallback].
     *
     * @param fuzzySearchOptions The object which contains the data necessary to execute
     * the Fuzzy Search action.
     * @param fuzzySearchCallback The [FuzzySearchCallback] invoked when the search operation
     * has been finished either successfully or with an error.
     * The callback will be executed in the main thread.
     */
    fun fuzzySearch(
        fuzzySearchOptions: FuzzySearchOptions,
        fuzzySearchCallback: FuzzySearchCallback
    ): Cancellable

    /**
     * Performs a synchronous Autocomplete Search using the provided
     * [AutocompleteSearchOptions] object. Delivers the [Result] using
     * an [AutocompleteSearchResponse], or an [AutocompleteSearchError] if the action fails.
     *
     * @param autocompleteSearchOptions The object which contains the data for the autocomplete search.
     *
     * @return The [Result] contains an [AutocompleteSearchResponse] if the call succeeds, or
     * an [AutocompleteSearchError] if it fails.
     */
    fun autocompleteSearch(
        autocompleteSearchOptions: AutocompleteSearchOptions
    ): Result<AutocompleteSearchResponse, AutocompleteSearchError>

    /**
     * Performs an asynchronous autocomplete search using the provided
     * [AutocompleteSearchOptions] object. Returns the result using the provided
     * [AutocompleteSearchCallback].
     *
     * @param autocompleteSearchOptions The object which contains the data for
     * the autocomplete search.
     * @param autocompleteSearchCallback The [AutocompleteSearchCallback] invoked when the search
     * operation has finished, either successfully or with an error.
     * The callback will be executed in the main thread.
     */
    fun autocompleteSearch(
        autocompleteSearchOptions: AutocompleteSearchOptions,
        autocompleteSearchCallback: AutocompleteSearchCallback
    ): Cancellable

    /**
     * Performs a synchronous search along the route described by the provided
     * [AlongRouteSearchOptions] object. Delivers the [Result] containing
     * an [AlongRouteSearchResponse], or an [AlongRouteSearchError] if the action fails.
     *
     * @param alongRouteSearchOptions The object which contains search properties for the given
     * search request.
     *
     * @return The [Result] containing an [AlongRouteSearchResponse] if the call succeeds, or
     * an [AlongRouteSearchError] if it fails.
     */
    fun alongRouteSearch(
        alongRouteSearchOptions: AlongRouteSearchOptions
    ): Result<AlongRouteSearchResponse, AlongRouteSearchError>

    /**
     * Performs an asynchronous search along the route described by the provided
     * [AlongRouteSearchOptions] object. Returns the result using the provided
     * [AlongRouteSearchCallback].
     *
     * @param alongRouteSearchOptions The object which contains properties for
     * the given search request.
     *
     * @param alongRouteSearchCallback The [AlongRouteSearchCallback] invoked when the search
     * operation has finished, either successfully or with an error.
     * The callback will be executed on the main thread.
     */
    fun alongRouteSearch(
        alongRouteSearchOptions: AlongRouteSearchOptions,
        alongRouteSearchCallback: AlongRouteSearchCallback
    ): Cancellable

    /**
     * Performs a synchronous additional data search described by the provided
     * [AdditionalDataSearchOptions] object. Delivers the [Result] containing
     * an [AdditionalDataSearchResponse], or an [AdditionalDataSearchError] if the action fails.
     *
     * @param additionalDataSearchOptions The object which contains search properties for the given
     * search request.
     *
     * @return The [Result] containing an [AdditionalDataSearchResponse] if the call succeeds, or
     * an [AdditionalDataSearchError] if it fails.
     */
    fun additionalDataSearch(
        additionalDataSearchOptions: AdditionalDataSearchOptions
    ): Result<AdditionalDataSearchResponse, AdditionalDataSearchError>

    /**
     * Performs an asynchronous additional data search described by the provided
     * [AdditionalDataSearchOptions] object. Returns the result using the provided
     * [AdditionalDataSearchCallback].
     *
     * @param additionalDataSearchOptions The object which contains properties for
     * the given search request.
     *
     * @param additionalDataSearchCallback The [AdditionalDataSearchCallback] invoked when the search
     * operation has finished, either successfully or with an error.
     * The callback will be executed on the main thread.
     */
    fun additionalDataSearch(
        additionalDataSearchOptions: AdditionalDataSearchOptions,
        additionalDataSearchCallback: AdditionalDataSearchCallback
    ): Cancellable

    /**
     * Performs a synchronous POI categories search using the provided
     * [PoiCategoriesSearchOptions] object. Delivers a [Result] containing
     * a [PoiCategoriesSearchResponse], or a [PoiCategoriesSearchError] if the call fails.
     *
     * @param poiCategoriesSearchOptions The object containing the properties to use in the
     * search request.
     *
     * @return The [Result] containing a [PoiCategoriesSearchResponse] if the call succeeds, or
     * a [PoiCategoriesSearchError] if it fails.
     */
    fun poiCategoriesSearch(
        poiCategoriesSearchOptions: PoiCategoriesSearchOptions
    ): Result<PoiCategoriesSearchResponse, PoiCategoriesSearchError>

    /**
     * Performs an asynchronous POI categories search using the provided
     * [PoiCategoriesSearchOptions] object. Returns the result using the provided
     * [PoiCategoriesSearchCallback].
     *
     * @param poiCategoriesSearchOptions The object containing the properties to
     * use in the search request.
     *
     * @param poiCategoriesSearchCallback The [PoiCategoriesSearchCallback] invoked when the search
     * operation has finished, either successfully or with an error.
     * The callback will be executed on the main thread.
     */
    fun poiCategoriesSearch(
        poiCategoriesSearchOptions: PoiCategoriesSearchOptions,
        poiCategoriesSearchCallback: PoiCategoriesSearchCallback
    ): Cancellable

    /**
     * Performs a synchronous EV Charging Stations Availability search using the provided
     * [EvChargingStationsAvailabilityOptions] object. Delivers a [Result] containing
     * an [EvChargingStationsAvailabilityResponse], or an [EvChargingStationsAvailabilityError]
     * if the call fails.
     *
     * @param evChargingStationsAvailabilityOptions The object containing the properties to use in
     * the search request.
     *
     * @return The [Result] containing an [EvChargingStationsAvailabilityResponse] if the call
     * succeeds, or  an [EvChargingStationsAvailabilityError] if it fails.
     */
    fun evChargingStationSearch(
        evChargingStationsAvailabilityOptions: EvChargingStationsAvailabilityOptions
    ): Result<EvChargingStationsAvailabilityResponse, EvChargingStationsAvailabilityError>

    /**
     * Performs an asynchronous EV Charging Stations Availability search using the provided
     * [EvChargingStationsAvailabilityOptions] object. Returns the result using the provided
     * [EvChargingStationsAvailabilityCallback].
     *
     * @param evChargingStationsAvailabilityOptions The object containing the properties to
     * use in the search request.
     *
     * @param evChargingStationsAvailabilityCallback The [EvChargingStationsAvailabilityCallback]
     * invoked when the search operation has finished, either successfully or with an error.
     * The callback will be executed on the main thread.
     */
    fun evChargingStationSearch(
        evChargingStationsAvailabilityOptions: EvChargingStationsAvailabilityOptions,
        evChargingStationsAvailabilityCallback: EvChargingStationsAvailabilityCallback
    ): Cancellable

    /**
     * Performs a synchronous Geometry Search based on the provided
     * [GeometrySearchOptions] object and delivers the [Result] by the provided
     * [GeometrySearchResponse] or a [GeometrySearchError] if the search fails.
     *
     * @param geometrySearchOptions The object which contains the data necessary to execute
     * the Geometry Search.
     *
     * @return If the search succeeds, the [Result] contains a [GeometrySearchResponse].
     * If it fails, it contains a [GeometrySearchError].
     */
    fun geometrySearch(
        geometrySearchOptions: GeometrySearchOptions
    ): Result<GeometrySearchResponse, GeometrySearchError>

    /**
     * Performs an asynchronous Geometry Search based on the provided
     * [GeometrySearchOptions] object and returns the result by the provided [GeometrySearchCallback].
     *
     * @param geometrySearchOptions The object which contains the data necessary to execute
     * the Geometry Search.
     * @param geometrySearchCallback The [GeometrySearchCallback] invoked when the search operation
     * has been finished either successfully or with an error.
     * The callback will be executed in the main thread.
     */
    fun geometrySearch(
        geometrySearchOptions: GeometrySearchOptions,
        geometrySearchCallback: GeometrySearchCallback
    ): Cancellable
}
