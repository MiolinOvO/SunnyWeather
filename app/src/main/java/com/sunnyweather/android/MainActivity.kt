package com.sunnyweather.android

import android.Manifest
import android.content.Context
import android.content.pm.PackageManager
import android.location.Address
import android.location.Geocoder
import android.location.Location
import android.location.LocationManager
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.app.ActivityCompat
import java.io.IOException

class MainActivity : AppCompatActivity() {
//    private lateinit var locationManager: LocationManager
//    private var locationInfo: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        updateCurrentLocation()
        setContentView(R.layout.activity_main)
    }

//    fun getLocationInfo(): String? {
//        return locationInfo
//    }
//
//    private fun updateCurrentLocation(){
//        locationManager = getSystemService(Context.LOCATION_SERVICE) as LocationManager
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
//            if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED
//                    && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
//                ActivityCompat.requestPermissions(this, arrayOf(Manifest.permission.ACCESS_FINE_LOCATION, Manifest.permission.ACCESS_COARSE_LOCATION), 1)
//            } else {
//                locationInfo = getLocation()
//            }
//        }
//    }
//
//    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
//        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
//        when (requestCode) {
//            1 -> {
//                if (grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED && grantResults[1] == PackageManager.PERMISSION_GRANTED) {
//                    locationInfo = getLocation()
//                } else {
//                    Toast.makeText(this, "You denied the permission", Toast.LENGTH_SHORT).show()
//                }
//            }
//        }
//    }
//
//    private fun getLocation(): String? {
//        try {
//            var location = locationManager.getLastKnownLocation(LocationManager.NETWORK_PROVIDER)
//            if (location == null) {
//                location = locationManager.getLastKnownLocation(LocationManager.GPS_PROVIDER)
//            }
//            if (location != null){
//                return getGeoByLocation(location)
//            } else {
//                Toast.makeText(this, "未能获取位置信息", Toast.LENGTH_LONG).show()
//            }
//        } catch (e: SecurityException) {
//            e.printStackTrace()
//        }
//
//        return null
//    }
//
//    private fun getGeoByLocation(location: Location): String? {
//        val ge = Geocoder(this)
//        var addressList = ArrayList<Address>()
//        var placeName: String? = null
//        try {
//            addressList = ge.getFromLocation(location.latitude, location.longitude, 1) as ArrayList<Address>
//            placeName = addressList[0].locality
//            Toast.makeText(this, "第一个：$placeName", Toast.LENGTH_LONG).show()
//            return placeName
//        } catch (e: IOException) {
//            e.printStackTrace()
//        }
//        return null
//    }
}