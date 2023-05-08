package com.example.diplom.dao
import androidx.room.*
import com.example.diplom.model.CPU
import com.example.diplom.model.GPU

@Dao
interface GPUdao {

    @Query("SELECT * FROM gpu")
    fun getAllGpu(): List<GPU>

    @Query("SELECT COUNT(*) FROM gpu")
    suspend fun count() : Int

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(gpu: GPU)

    @Delete
    fun delete(gpu: GPU)

    @Update
    fun update(gpu: GPU)

}