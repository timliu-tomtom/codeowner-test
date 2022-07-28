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

package com.tomtom.sdk.search.client.model.poi

/**
 * Point of Interest(POI) category.
 *
 * @param id The identifier for the POI category with semantic information.
 * @param mapSpecificId The map specific identifier without any semantic information.
 * @param name The name of the POI category.
 * @param parents The parents of the POI category.
 * @param children The sub-categories of the POI category.
 * @param synonyms The synonyms for the POI category.
 */
data class Category(
    val id: CategoryId,
    val mapSpecificId: String? = null,
    val name: String,
    val parents: Set<Category> = emptySet(),
    val children: Set<Category> = emptySet(),
    val synonyms: List<String> = emptyList(),
)
