package com.crescent.thesis;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
        // Set the camera to the greatest possible zoom level that includes the
        // bounds

    }

    @Override
    public void onMapReady(GoogleMap map) {

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String x = extras.getString("coordX");
            String y = extras.getString("coordY");
            String marker = extras.getString("marker");

            Float x1 = Float.parseFloat(x);
            Float y1 = Float.parseFloat(y);

            LatLng Pampanga = new LatLng(15.156692, 120.5952847);
            map.moveCamera(CameraUpdateFactory.newLatLngZoom(Pampanga, 10));

            // Add a marker in x,y coord, and move the camera.
            LatLng sm_pampanga = new LatLng(x1, y1);
            map.addMarker(new MarkerOptions().position(sm_pampanga).title(marker));
            map.moveCamera(CameraUpdateFactory.newLatLngZoom(sm_pampanga, 15));

            map.setMyLocationEnabled(true);
            map.getUiSettings().setMapToolbarEnabled(false);
            map.getUiSettings().setZoomControlsEnabled(true);

        }
    }


}