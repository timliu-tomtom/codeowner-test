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

package com.tomtom.sdk.search.client.geometry

import com.tomtom.sdk.search.client.model.FuelType
import com.tomtom.sdk.search.client.model.IndexType
import com.tomtom.sdk.search.client.model.information.EntityType
import com.tomtom.sdk.search.client.model.poi.RequestedPoiRelationType
import com.tomtom.sdk.search.client.model.time.OpeningHoursMode
import com.tomtom.sdk.search.client.model.time.TimeZoneType
import com.tomtom.sdk.search.common.model.MapCodeType

/**
 * Defines the parameters of a Geometry Search.
 * Use [GeometrySearchOptions.Builder] to create a new instance of the object.
 *
 * @param query The searched query.
 * @param geometries The list of geometries to search in.
 * @param limit The maximum number of search results that will be returned.
 * @param language The language in which search results should be returned.
 * Should be one of the supported IETF language tags.
 * See https://developer.tomtom.com/search-api/search-api/supported-languages for more details.
 * @param extendedPostalCodes Indexes for which extended postal codes should be included
 * in the results.
 * @param idx A set of [IndexType]s which should be utilized for the search.
 * @param categorySet Restricts the Points Of Interest in the response to those whose ID is listed.
 * @param brandSet A list of brand names used to restrict the result
 * to specific brands.
 * @param connectorSet A list of connector types used to restrict the result
 * to Electric Vehicle Station POIs that support those specific connector types.
 * See https://developer.tomtom.com/search-api/search-api-documentation/supported-connector-types
 * for more details.
 * @param minPowerKW A double value representing a power rate in kilowatts, used
 * to restrict the result to Electric Vehicle Station POIs with
 * at least one connector with that minimum power rate.
 * @param maxPowerKW A double value representing a power rate in kilowatts, used
 * to restrict the result to Electric Vehicle Station POIs with
 * at least one connector with that maximum power rate.
 * @param fuelSet A set of [FuelType]s used to restrict the result to
 * Points Of Interest that sell specific fuels.
 * @param geopoliticalView Defines what kind of geopolitical view should be used.
 * @param openingHours The opening hours scope.
 * @param timeZone Used to indicate the mode in which the time zone object should be returned.
 * @param mapCodes The set of [MapCodeType] which will be supported.
 * @param relatedPois A [RequestedPoiRelationType] that allows related
 * Points Of Interest to be returned.
 * @param entityTypeSet A set of [EntityType]s used to restrict the result to
 * Geography results of a specific entity type.
 *
 * Important: This is a Public Preview API. It may be changed or removed at any time.
 */
data class GeometrySearchOptions(
    val query: String,
    val geometries: List<Geometry>,
    val limit: Int? = null,
    val language: String? = null,
    val extendedPostalCodes: List<IndexType>,
    val idx: Set<IndexType>,
    val categorySet: Set<Long>,
    val brandSet: Set<String>,
    val connectorSet: Set<String>,
    val minPowerKW: Double? = null,
    val maxPowerKW: Double? = null,
    val fuelSet: Set<FuelType>,
    val geopoliticalView: String? = null,
    val openingHours: OpeningHoursMode? = null,
    val timeZone: TimeZoneType? = null,
    val mapCodes: Set<MapCodeType>,
    val relatedPois: RequestedPoiRelationType? = null,
    val entityTypeSet: Set<EntityType>,
) {

    private constructor(builder: Builder) : this(
        query = builder.query,
        geometries = builder.geometries,
        limit = builder.limit,
        language = builder.language,
        extendedPostalCodes = builder.extendedPostalCodes,
        idx = builder.idxSet,
        categorySet = builder.categorySet,
        brandSet = builder.brandSet,
        connectorSet = builder.connectorSet,
        minPowerKW = builder.minPowerKW,
        maxPowerKW = builder.maxPowerKW,
        fuelSet = builder.fuelSet,
        geopoliticalView = builder.geopoliticalView,
        openingHours = builder.openingHours,
        timeZone = builder.timeZone,
        mapCodes = builder.mapCodes,
        relatedPois = builder.relatedPois,
        entityTypeSet = builder.entityTypeSet
    )

    /**
     * Builder used to create an instance of [GeometrySearchOptions].
     * Once constructed, the user cannot change the field values.
     *
     * @param query The searched query.
     * @param geometries The list of geometries to search in.
     */
    class Builder(
        internal var query: String,
        internal var geometries: List<Geometry>,
    ) {
        internal var limit: Int? = null
        internal var language: String? = null
        internal var extendedPostalCodes: List<IndexType> = emptyList()
        internal var idxSet: Set<IndexType> = emptySet()
        internal var categorySet: Set<Long> = emptySet()
        internal var brandSet: Set<String> = emptySet()
        internal var connectorSet: Set<String> = emptySet()
        internal var minPowerKW: Double? = null
        internal var maxPowerKW: Double? = null
        internal var fuelSet: Set<FuelType> = emptySet()
        internal var geopoliticalView: String? = null
        internal var openingHours: OpeningHoursMode? = null
        internal var timeZone: TimeZoneType? = null
        internal var mapCodes: Set<MapCodeType> = emptySet()
        internal var relatedPois: RequestedPoiRelationType? = null
        internal var entityTypeSet: Set<EntityType> = emptySet()

        /**
         * The searched query.
         *
         * @return The builder of the [GeometrySearchOptions] with the provided [query].
         */
        fun query(query: String) = apply { this.query = query }

        /**
         * The list of geometries to search in.
         *
         * @return The builder of the [GeometrySearchOptions] with the provided [geometries].
         */
        fun geometries(geometries: List<Geometry>) = apply { this.geometries = geometries }

        /**
         * The maximum number of search results that will be returned.
         *
         * @return The builder of the [GeometrySearchOptions] with the provided [limit].
         */
        fun limit(limit: Int): Builder = apply { this.limit = limit }

        /**
         * The language in which search results should be returned.
         * Should be one of the supported IETF language tags.
         * See https://developer.tomtom.com/search-api/search-api/supported-languages for more details.
         *
         * @return The builder of the [GeometrySearchOptions] with the provided [language].
         */
        fun language(language: String): Builder = apply { this.language = language }

        /**
         * Indexes for which extended postal codes should be included
         * in the results.
         *
         * @return The builder of the [GeometrySearchOptions] with the provided [extendedPostalCodes].
         */
        fun extendedPostalCodes(extendedPostalCodes: List<IndexType>): Builder =
            apply { this.extendedPostalCodes = extendedPostalCodes }

        /**
         * A set of [IndexType]s which should be utilized for the search.
         *
         * @return The builder of the [GeometrySearchOptions] with the provided [idxSet].
         */
        fun idxSet(idxSet: Set<IndexType>): Builder = apply { this.idxSet = idxSet }

        /**
         * Restricts the Points Of Interest in the response to those whose ID is listed.
         *
         * @return The builder of the [GeometrySearchOptions] with the provided [categorySet].
         */
        fun categorySet(categorySet: Set<Long>): Builder =
            apply { this.categorySet = categorySet }

        /**
         * A list of brand names used to restrict the result
         * to specific brands.
         *
         * @return The builder of the [GeometrySearchOptions] with the provided [brandSet].
         */
        fun brandSet(brandSet: Set<String>): Builder =
            apply { this.brandSet = brandSet }

        /**
         * A list of connector types used to restrict the result
         * to Electric Vehicle Station POIs with specific connector types.
         * See https://developer.tomtom.com/search-api/search-api-documentation/supported-connector-types
         * for more details.
         *
         * @return The builder of the [GeometrySearchOptions] with the provided [connectorSet].
         */
        fun connectorSet(connectorSet: Set<String>): Builder =
            apply { this.connectorSet = connectorSet }

        /**
         * A double value representing a power rate in kilowatts, used
         * to restrict the result to Electric Vehicle Station POIs with
         * at least one connector with that minimum power rate.
         *
         * @return The builder of the [GeometrySearchOptions] with the provided [minPowerKW].
         */
        fun minPowerKW(minPowerKW: Double): Builder =
            apply { this.minPowerKW = minPowerKW }

        /**
         * A double value representing a power rate in kilowatts, used
         * to restrict the result to Electric Vehicle Station POIs with
         * at least one connector with that maximum power rate.
         *
         * @return The builder of the [GeometrySearchOptions] with the provided [maxPowerKW].
         */
        fun maxPowerKW(maxPowerKW: Double): Builder =
            apply { this.maxPowerKW = maxPowerKW }

        /**
         * A set of [FuelType]s used to restrict the result to
         * Points Of Interest that sell those specific fuels.
         *
         * @return The builder of the [GeometrySearchOptions] with the provided [fuelSet].
         */
        fun fuelSet(fuelSet: Set<FuelType>): Builder =
            apply { this.fuelSet = fuelSet }

        /**
         * Defines what kind of geopolitical view should be used.
         *
         * @return The builder of the [GeometrySearchOptions] with the provided [geopoliticalView].
         */
        fun geopoliticalView(geopoliticalView: String): Builder =
            apply { this.geopoliticalView = geopoliticalView }

        /**
         * The opening hours scope.
         *
         * @return The builder of the [GeometrySearchOptions] with the provided [openingHours].
         */
        fun openingHours(openingHours: OpeningHoursMode): Builder =
            apply { this.openingHours = openingHours }

        /**
         * Used to indicate the mode in which the time zone object should be returned.
         *
         * @return The builder of the [GeometrySearchOptions] with the provided [timeZone].
         */
        fun timeZone(timeZone: TimeZoneType): Builder =
            apply { this.timeZone = timeZone }

        /**
         * The set of [MapCodeType] which will be supported.
         *
         * @return The builder of the [GeometrySearchOptions] with the provided [mapCodes].
         */
        fun mapCodes(mapCodes: Set<MapCodeType>): Builder =
            apply { this.mapCodes = mapCodes }

        /**
         * A [RequestedPoiRelationType] that allows related
         * Points Of Interest to be returned.
         *
         * @return The builder of the [GeometrySearchOptions] with
         * the provided [RequestedPoiRelationType].
         */
        fun relatedPois(relatedPois: RequestedPoiRelationType): Builder =
            apply { this.relatedPois = relatedPois }

        /**
         * A set of [EntityType]s used to restrict the result to
         * Geography results of a specific entity type.
         *
         * @return The builder of the [GeometrySearchOptions] with the provided [entityTypeSet].
         */
        fun entityTypeSet(entityTypeSet: Set<EntityType>): Builder =
            apply { this.entityTypeSet = entityTypeSet }

        /**
         * Construct a new [GeometrySearchOptions].
         *
         * @return The instance of [GeometrySearchOptions] with options provided with the [Builder].
         */
        fun build(): GeometrySearchOptions = GeometrySearchOptions(this)
    }
}
