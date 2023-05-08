package com.example.diplom.dao

import androidx.room.*
import com.example.diplom.model.CPU

@Dao
interface CPUdao {


    @Query("SELECT * FROM cpu")
    fun getAllCpu(): List<CPU>

    @Query("SELECT COUNT(*) FROM cpu")
    suspend fun count() : Int

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(cpu: CPU)

    @Update
    fun update(cpu: CPU)

    @Delete
    fun delete(cpu: CPU)
}