package com.example.googlemapexample


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions


lateinit var mapFragment : SupportMapFragment
lateinit var googleMap: GoogleMap

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mapFragment = supportFragmentManager.findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(OnMapReadyCallback {
            googleMap = it


        val location1 = LatLng(13.03, 77.60)
        googleMap.addMarker(MarkerOptions().position(location1).title("My Location"))
        googleMap.animateCamera(CameraUpdateFactory.newLatLngZoom(location1, 5f))




        val location2 = LatLng(13.00, 77.00)
        googleMap.addMarker(MarkerOptions().position(location1).title("Bangalore"))

            val location3 = LatLng(9.89, 78.11)
            googleMap.addMarker(MarkerOptions().position(location1).title("Madurai"))


    })
    }
}


