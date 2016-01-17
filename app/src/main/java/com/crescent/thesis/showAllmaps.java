package com.crescent.thesis;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;

public class showAllmaps extends FragmentActivity implements OnMapReadyCallback {

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

        /* show cultural marks on map */
        double xCultural[] = {15.031871d,15.204365d};
        double yCultural[]={120.687923d,120.530284d};
        String markerCultural[] = {"Gabaldon Schoolhouse","Nayong Pilipino sa Clark"};
        for(int i=0;i<xCultural.length;i++){

            LatLng loc = new LatLng(xCultural[i], yCultural[i]);
            map.addMarker(new MarkerOptions().position(loc).title(markerCultural[i]).icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
            map.moveCamera(CameraUpdateFactory.newLatLngZoom(loc, 15));
        }

        /*show local wonders markers on map*/
        double xLwonders[] = {15.227107d,15.1291729d,14.986389d,15.0936517d,15.203948d,15.20404509d,15.1789517d,15.1182505d,15.1309d,15.2080546d,15.18796d,
                15.1355029d,15.0494099d,15.0380787d,15.2189844d,15.1475674d};
        double yLwonders[]={120.705893d,120.5945881d,120.4925d,120.8246962d,120.528105d,120.52671969d,120.5183007d,120.4195172d,120.573d,120.5449998d,120.549462d,
                120.5877344d,120.6942123d,120.6806302d,120.6949317d,120.5897851d};
        String markerLwonders[] = {"Abe's Farm","Bale Dutung","Basa Air Base","Candaba Hanging Bridge","Clark Education City","Clark Expo","Clark Freeport Zone","Dara Falls","Del-Marco Marble Marble Products","Dinosaurs Island at Clarkland","Diosdado Macapagal Intl Airport","Everybody's Cafe","Hilaga Cultural Village","Pampanga's Best","Pampanga Agricultural College","Sisig sa Pampanga"};
        for(int i1=0;i1<xLwonders.length;i1++){
            LatLng loc = new LatLng(xLwonders[i1], yLwonders[i1]);
            map.addMarker(new MarkerOptions().position(loc).title(markerLwonders[i1]).icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
            map.moveCamera(CameraUpdateFactory.newLatLngZoom(loc, 15));
        }

        /*show parks markers on map*/
        double xParks[] = {15.180407d,15.1128106d,15.168533d,15.18015348d,15.1802672d,15.1959299d};
        double yParks[]={120.533688d,120.5985566d,120.586776d,120.51460415d,120.5225122d,120.744301d};
        String markerParks[] = {"Air Force City Aircraft Park","Angeles Industrial Park","Bayanihan Park","Bicentennial Park","Clark Parade Ground","Mt. Arayat National Park"};
        for(int i=0;i<xParks.length;i++){
            LatLng loc = new LatLng(xParks[i], yParks[i]);
            map.addMarker(new MarkerOptions().position(loc).title(markerParks[i]).icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
            map.moveCamera(CameraUpdateFactory.newLatLngZoom(loc, 15));
        }

        /*show churches markers on map*/
        double xChurch[]={15.1342225d,15.1587186d,15.0593937d,15.0355222d,15.224404d,15.000325d,15.039046d,14.9536994d,15.0917703d,15.0946595d,15.0190639d,
                15.214533d,15.1512833d,14.9734732d,15.021907d,14.9683876d};
        double yChurch[]={120.5887984d,120.5915326d,120.6567054d,120.6940263d,120.572740d,120.648271d,120.790181d,120.7724905d,120.8277756d,120.7654274d,120.7019417d,
                120.660009d,120.7726997,120.5270013d,120.6897735d,120.6837497d};
        String markerChurch[]={"Holy Rosary Parish Church","Immaculate Conception Parish Church","Metropolitan Catherdral of San Fernando","Nuestra senyora del pila parish church","Our Lady of Divine Grace Parish Church",
                        "San Guillermo Parish Church","San Luis Church","Apalit Parochial Church","St. Andrew Parish Church","St. Anne Parish Church","San Agustin Church",
                        "San Bartolome Church","St. Catherine Alexandra Church","St. Joseph Parish Church","Sta. Lucia Parish Church","Minalin Church"};
        for(int i=0;i<xChurch.length;i++){
            LatLng loc = new LatLng(xChurch[i], yChurch[i]);
            map.addMarker(new MarkerOptions().position(loc).title(markerChurch[i]).icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE)));
            map.moveCamera(CameraUpdateFactory.newLatLngZoom(loc, 15));
        }
            /*show landmark marks on map*/
            double xLmarks[]={15.0343278d,15.027343d,14.998626d,15.200892d,15.0246954d,15.16849143d,15.1449611d,15.186921d};
            double yLmarks[]={120.6939018d,120.693754d,120.652829d,120.541573d,120.687029d,120.58660939d,120.5909658d,120.560656d};
            String markerLmarks[]={"Archdiocesan Chancery","Buluyut Bridge","Crissot Monument","El Kabayo","Macario Arnedo Park",
            "Salakot Arch","San Fernando railway station","President Roxas Marker"};
            for(int i=0;i<xLmarks.length;i++){
                LatLng loc = new LatLng(xLmarks[i], yLmarks[i]);
                map.addMarker(new MarkerOptions().position(loc).title(markerLmarks[i]).icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)));
                map.moveCamera(CameraUpdateFactory.newLatLngZoom(loc, 15));
            }

        /*show museum marks on map*/
        double xMuse[]={15.182173d,15.133113d,15.1347381d};
        double yMuse[]={120.526864d,120.5898535d,120.590997d};
        String markerMuse[]={"Clark Museum and Museong Kapampangan","Holy Angel University Center for Kapampangan Studies","Museo ning Angeles"};
        for(int i=0;i<xMuse.length;i++){
            LatLng loc = new LatLng(xMuse[i], yMuse[i]);
            map.addMarker(new MarkerOptions().position(loc).title(markerMuse[i]).icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));
            map.moveCamera(CameraUpdateFactory.newLatLngZoom(loc, 15));
        }

        LatLng Pampanga = new LatLng(15.156692, 120.5952847);
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(Pampanga, 10));
        map.getUiSettings().setZoomControlsEnabled(true);

    }


}