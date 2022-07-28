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

package com.tomtom.sdk.search.reversegeocoding

import androidx.annotation.FloatRange
import androidx.annotation.IntRange
import com.tomtom.sdk.common.location.GeoCoordinate
import com.tomtom.sdk.search.common.model.MapCodeType
import com.tomtom.sdk.search.reversegeocoding.model.information.EntityType
import com.tomtom.sdk.search.reversegeocoding.model.information.RoadUse

/**
 * Defines the parameters of a Reverse Geocoding query.
 *
 * @param position Coordinate that will be translated into a human-understandable
 * street address, street element, or geography.
 * @param heading The directional heading of the vehicle in degrees when it is traveling
 * along a segment of roadway. Zero is North, 90 is East and so on.
 * @param radiusInMeters The maximum distance in meters from the specified position
 * that the reverseGeocode will deliver results for.
 * @param roadUses Restricts reverse geocoding to certain types of road uses.
 * @param entityTypes This parameter specifies the level of filtering performed on geographies.
 * Providing this parameter narrows the search to specified geography entity types.
 * The resulting response will contain the geography ID as well as the matched entity type.
 * This ID is a token that can be used to get the geometry of that geography.
 * The following parameters are ignored when entityType is set: [heading], [roadUses]
 * @param language IETF language tag (case insensitive), for the language in which search results
 * should be returned. When the language tag is invalid or data in a specified language is not
 * available for a specific field, the default value is used.
 * The default language value is NGT (Neutral Ground Truth), that means official languages for all
 * regions in local scripts if available.
 * @param geoPoliticalView An ISO 3166-1 alpha3 country code, that gives the context used to resolve
 * the handling of disputed territories. If there are no geopolitical views for the provided country
 * code then the default view is used.
 * @param mapCodeTypes Enables the return of map codes. Can also filter the response to only show
 * selected [MapCodeType]s.
 * @param preferClosestAccurateAddress Gives the preference to the closest accurate address
 * over the address with the closest navigable coordinates.
 * @param fetchGeometry Enables the return of geometry shapes for the provided reverse geocoding
 * results. (where available)
 * The geometry fetching feature isn't implemented yet (this option was added for the future
 * extension).
 *
 * Important: This is a Public Preview API. It may be changed or removed at any time.
 **/
data class ReverseGeocoderOptions(
    val position: GeoCoordinate,
    @FloatRange(from = 0.0, to = 360.0) val heading: Float? = null,
    @IntRange(from = 1, to = MAX_RADIUS_IN_METERS)
    val radiusInMeters: Int = DEFAULT_RADIUS_IN_METERS,
    val roadUses: Set<RoadUse> = emptySet(),
    val entityTypes: Set<EntityType> = emptySet(),
    val language: String = DEFAULT_LANGUAGE,
    val geoPoliticalView: String = "",
    val mapCodeTypes: Set<MapCodeType> = emptySet(),
    val preferClosestAccurateAddress: Boolean = false,
    val fetchGeometry: Boolean = false,
) {
    private companion object {
        private const val MAX_RADIUS_IN_METERS: Long = 5000
        private const val DEFAULT_RADIUS_IN_METERS: Int = 500
        private const val DEFAULT_LANGUAGE: String = "NGT"
    }
}
