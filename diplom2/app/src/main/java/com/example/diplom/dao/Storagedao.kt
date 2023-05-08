package com.example.diplom.dao

import androidx.room.*
import com.example.diplom.model.GPU
import com.example.diplom.model.Storage


@Dao
interface Storagedao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(storage: Storage)

    @Delete
    suspend fun delete(storage: Storage )

    @Update
    suspend fun  update(storage: Storage)

    @Query("SELECT COUNT(*) FROM storage")
    suspend fun count() : Int

    @Query("SELECT * FROM storage")
    fun getAllStorage(): List<Storage>
}