package com.example.diplom.dao

import androidx.room.Dao
import androidx.room.*
import com.example.diplom.model.GPU
import com.example.diplom.model.PcBox

@Dao
interface PcBoxDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(pcbox: PcBox)

    @Delete
    suspend fun delete(pcbox: PcBox)

    @Update
    suspend fun  update(pcbox: PcBox)

    @Query("SELECT COUNT(*) FROM pcbox")
    suspend fun count() : Int

    @Query("SELECT * FROM pcbox")
    fun getAllPcBox(): List<PcBox>

}