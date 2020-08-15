package com.innocyber.fitnesstracker.services

import android.content.Intent
import android.util.Log
import androidx.lifecycle.LifecycleService
import com.innocyber.fitnesstracker.util.Constants.ACTION_PAUSE_SERVICE
import com.innocyber.fitnesstracker.util.Constants.ACTION_START_OR_RESUME_SERVICE
import com.innocyber.fitnesstracker.util.Constants.ACTION_STOP_SERVICE

class TrackingService : LifecycleService() {

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {

        intent?.let {
            when (it.action) {
                ACTION_START_OR_RESUME_SERVICE -> {
                    Log.d("ServiceIntents", "started or resumed service")
                }
                ACTION_PAUSE_SERVICE -> {

                    Log.d("ServiceIntents", "paused service")
                }
                ACTION_STOP_SERVICE -> {

                    Log.d("ServiceIntents", "stopped service")
                }

                else -> {
                    Log.d("ServiceIntents", "no service")
                }
            }
        }

        return super.onStartCommand(intent, flags, startId)
    }
}