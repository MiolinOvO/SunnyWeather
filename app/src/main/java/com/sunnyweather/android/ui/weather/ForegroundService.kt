package com.sunnyweather.android.ui.weather

import android.app.*
import android.content.Context
import android.content.Intent
import android.graphics.BitmapFactory
import android.os.Build
import android.os.IBinder
import androidx.annotation.RequiresApi
import com.sunnyweather.android.MainActivity
import com.sunnyweather.android.R

class ForegroundService : Service() {

    override fun onBind(intent: Intent): IBinder {
        TODO("Return the communication channel to the service.")
    }

    override fun onCreate() {
        super.onCreate()
    }

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {

        val manager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val channel = NotificationChannel("my_service", "前台Service通知", NotificationManager.IMPORTANCE_DEFAULT)
            manager.createNotificationChannel(channel)
        }

        val placeName = intent?.getStringExtra("place_name")
        val currentTemp = intent?.getStringExtra("current_temp")
        val currentSky = intent?.getStringExtra("current_sky")
        val currentAQI = intent?.getStringExtra("current_aqi")
        val currentIcon = intent!!.getIntExtra("current_icon", 0)

        val pi = PendingIntent.getActivity(this, 0,
                Intent(this, MainActivity::class.java), 0)
        val notification = Notification.Builder(this, "my_service")
            .setContentTitle("$placeName  $currentTemp")
            .setContentText("$currentSky | $currentAQI")
            .setSmallIcon(R.drawable.small_icon)
            .setLargeIcon(BitmapFactory.decodeResource(resources, currentIcon))
            .setContentIntent(pi)
            .setAutoCancel(true)
            .build()
        startForeground(1, notification)

        return super.onStartCommand(intent, flags, startId)
    }
}


