package com.example.diplom.dao

import androidx.room.*
import com.example.diplom.model.GPU
import com.example.diplom.model.RamMemory

@Dao
interface RamMemorydao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(ramMemory: RamMemory)

    @Delete
    suspend fun delete(ramMemory: RamMemory)

    @Update
    suspend fun  update(ramMemory: RamMemory)

    @Query("SELECT COUNT(*) FROM ram")
    suspend fun count() : Int

    @Query("SELECT * FROM ram")
    fun getAllRam(): List<RamMemory>
}