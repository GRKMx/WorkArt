package com.ersizer.artbooktesting.repo

import androidx.lifecycle.LiveData
import com.ersizer.artbooktesting.model.ImageResponse
import com.ersizer.artbooktesting.roomdb.Art
import com.ersizer.artbooktesting.util.Resource

interface ArtRepositoryInteface {

    suspend fun insertArt(art:Art)

    suspend fun deleteArt(art: Art)

    fun getArt():LiveData<List<Art>>

    suspend fun searchImage(imageString:String): Resource<ImageResponse>

}