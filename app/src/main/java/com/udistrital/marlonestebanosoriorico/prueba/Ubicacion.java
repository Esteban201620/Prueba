package com.udistrital.marlonestebanosoriorico.prueba;

import android.app.Dialog;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.UiSettings;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.udistrital.marlonestebanosoriorico.prueba.R;

import java.util.ArrayList;

public class Ubicacion extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private GoogleMap mMap2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ubicacion);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {


        Iglesia miIglesia;
        mMap = googleMap;
        mMap2 = googleMap;
        mMap2.setMapType(GoogleMap.MAP_TYPE_NORMAL);
        UiSettings uisettings= mMap2.getUiSettings();
        uisettings.setZoomControlsEnabled(true);

        // Add a marker in Sydney and move the camera/*
        LatLng bogota = new LatLng(4.6097100, -74.0817500);
        //mMap2.addMarker(new MarkerOptions().position(new LatLng(4.6097100, -74.0817500)).title("Bogotá").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));
/*        mMap2.addMarker(new MarkerOptions().position(new LatLng(4.583861, -74.097587)).title("Iglesia Bethel").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));
        mMap2.addMarker(new MarkerOptions().position(new LatLng(4.636405, -74.162686)).title("Iglesia Cristiana Cuadrangular").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));
        mMap2.addMarker(new MarkerOptions().position(new LatLng(0.464166, -74.114267)).title("Iglesia Cristiana Filadelfia JV").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));
        mMap2.addMarker(new MarkerOptions().position(new LatLng(4.650266, -74.135558)).title("Iglesia Cristiana Manantial de Vida Eterna- Cll 13").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));
        mMap2.addMarker(new MarkerOptions().position(new LatLng(4.592833, -74.096187)).title("Iglesia Cristiana Manantial de Vida Eterna- Cll 3a sur").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));
        mMap2.addMarker(new MarkerOptions().position(new LatLng(4.592147, -74.106237)).title("Iglesia Cristiana Manantial de Vida Eterna- Cra. 27").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));
        mMap2.addMarker(new MarkerOptions().position(new LatLng(4.722823, -74.053098)).title("Iglesia Cristiana Rios de Alabanza").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));
        mMap2.addMarker(new MarkerOptions().position(new LatLng(4.758565, -74.048529)).title("Iglesia Pentecostal Unida de Colombia").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));
        mMap2.addMarker(new MarkerOptions().position(new LatLng(4.614602, -74.175891)).title("Iglesia Pentecostal Unida de Colombia *").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));
        mMap2.addMarker(new MarkerOptions().position(new LatLng(4.705876, -7.410649)).title("Iglesia Pentecostal Unida de Colombia- Bachue").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));
        mMap2.addMarker(new MarkerOptions().position(new LatLng(4.609321, -74.135497)).title("Iglesia Pentecostal Unida de Colombia- Carvajal").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));
        mMap2.addMarker(new MarkerOptions().position(new LatLng(4.621692, -7.406887)).title("Iglesia Pentecostal Unida de Colombia- Central").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));
        mMap2.addMarker(new MarkerOptions().position(new LatLng(0.456468, -74.153394)).title("Iglesia Pentecostal Unida de Colombia- Juan José Rondón").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));
        mMap2.addMarker(new MarkerOptions().position(new LatLng(4.619881, -74.155128)).title("Iglesia Pentecostal Unida de Colombia- Kennedy").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));
        mMap2.addMarker(new MarkerOptions().position(new LatLng(4.593301, -74.171277)).title("Iglesia Pentecostal Unida de Colombia- La Estancia").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));
        mMap2.addMarker(new MarkerOptions().position(new LatLng(4.565885, -74.127027)).title("Iglesia Pentecostal Unida de Colombia- San Carlos").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));
        mMap2.addMarker(new MarkerOptions().position(new LatLng(4.696611, -74.031968)).title("Iglesia Pentecostal Unida de Colombia- Usaquen").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));
        mMap2.addMarker(new MarkerOptions().position(new LatLng(4.594859, -74.191247)).title("IV Iglesia Cristiana Presbiteriana Maranatha").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));
        mMap2.addMarker(new MarkerOptions().position(new LatLng(4.623598, -74.085496)).title("Mision Carismatica Internacional").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));
        mMap2.addMarker(new MarkerOptions().position(new LatLng(0.462374, -74.084546)).title("Mision Carismatica Internacional(G12)").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));
        mMap2.addMarker(new MarkerOptions().position(new LatLng(4.654757, -74.067059)).title("Sin Muros Ministerio INternacional").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));
*/
        float zoomlevel=11;

        for (int i = 0; i< Controlador.iglesias.size(); i++){
            mMap2.addMarker(new MarkerOptions().position(Controlador.iglesias.get(i).posicion).title(Controlador.iglesias.get(i).nombre).icon(BitmapDescriptorFactory.defaultMarker((int)Math.random()*300
            )));
        }

        mMap2.moveCamera(CameraUpdateFactory.newLatLngZoom(bogota,zoomlevel));
    }
}
