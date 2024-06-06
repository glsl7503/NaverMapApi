package com.foreknowledge.navermapapi.model.repository

import android.content.Context
import com.foreknowledge.navermapapi.model.data.Place
import com.foreknowledge.navermapapi.model.room.DatabaseService
import com.foreknowledge.navermapapi.model.room.PlaceEntity

/**
 * Created by Yeji on 08,April,2020.
 */
class PlaceDataSource(context: Context) {
    private val placeDao = DatabaseService.getInstance(context).placeDao()

    suspend fun getAll(): List<Place> = placeDao.getAllPlaceEntities().map { it.toPlace() }

    suspend fun add(placeEntity: PlaceEntity) = placeDao.addPlaceEntity(placeEntity)

    suspend fun delete(placeEntity: PlaceEntity) = placeDao.deletePlaceEntity(placeEntity)
}