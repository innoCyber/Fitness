package com.innocyber.fitnesstracker.repository

import com.innocyber.fitnesstracker.db.Run
import com.innocyber.fitnesstracker.db.RunDao
import javax.inject.Inject

class MainRepository @Inject constructor(val runDao: RunDao){

    suspend fun insertRun(run: Run) = runDao.insertRun(run)
    suspend fun deleteRun(run: Run) = runDao.deleteRun(run)

    fun getRunsByDate() = runDao.getRunsByDate()
    fun getRunsByDistance() = runDao.getRunsByDistance()
    fun getRunsByTime() = runDao.getRunsByTime()
    fun getRunsByAvgSpeed() = runDao.getRunsBySpeed()
    fun getRunsByCaloriesBurned() = runDao.getRunsByDate()

    fun getTotalDistance() = runDao.getTotalDistance()
    fun getTotalRunTime() = runDao.getTotalRunTime()
    fun getTotalAvgSpeed() = runDao.getTotalAverageSpeed()
    fun getTotalCaloriesBurned() = runDao.getTotalCaloriesBurned()

}