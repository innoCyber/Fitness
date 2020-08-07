package com.innocyber.fitnesstracker.db

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface RunDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertRun(run: Run)

    @Delete
    suspend fun deleteRun(run: Run)

    @Query("SELECT * FROM run_table ORDER BY timeStamp DESC")
    fun getRunsByDate(): LiveData<List<Run>>

    @Query("SELECT * FROM run_table ORDER BY timeInMillis DESC")
    fun getRunsByTime(): LiveData<List<Run>>

    @Query("SELECT * FROM run_table ORDER BY caloriesBurned DESC")
    fun getRunsByCalories(): LiveData<List<Run>>

    @Query("SELECT * FROM run_table ORDER BY averageSpeedInKMH DESC")
    fun getRunsBySpeed(): LiveData<List<Run>>

    @Query("SELECT * FROM run_table ORDER BY distanceInMeters DESC")
    fun getRunsByDistance(): LiveData<List<Run>>

    @Query("SELECT SUM(timeInMillis) FROM run_table")
    fun getTotalRunTime(): LiveData<Long>

    @Query("SELECT SUM(caloriesBurned) FROM run_table")
    fun getTotalCaloriesBurned(): LiveData<Int>

    @Query("SELECT AVG(averageSpeedInKMH) FROM run_table")
    fun getTotalAverageSpeed(): LiveData<Float>

    @Query("SELECT SUM(distanceInMeters) FROM run_table")
    fun getTotalDistance(): LiveData<Int>

}