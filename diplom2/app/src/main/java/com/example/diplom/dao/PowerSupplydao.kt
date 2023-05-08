package com.example.diplom.dao

import androidx.room.*
import com.example.diplom.model.GPU
import com.example.diplom.model.PowerSupply

@Dao
interface PowerSupplydao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(powerSupply: PowerSupply)

    @Delete
    suspend fun delete(powerSupply: PowerSupply)

    @Update
    suspend fun  update(powerSupply: PowerSupply)

    @Query("SELECT COUNT(*) FROM power_supply")
    suspend fun count() : Int

    @Query("SELECT * FROM power_supply")
    fun getAllPowerSupply(): List<PowerSupply>
}