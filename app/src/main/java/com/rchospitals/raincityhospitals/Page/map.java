package com.rchospitals.raincityhospitals.Page;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.rchospitals.raincityhospitals.R;

public class map extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.map);
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
        mMap = googleMap;

        //1
        LatLng rsby = new LatLng(-6.580461, 106.778061);
        mMap.addMarker(new MarkerOptions().position(rsby).title("Rumah Sakit Umum Daerah Kota Bogor"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(rsby, 12));

        //2
        LatLng rsbb = new LatLng(-6.298582, 106.786177);
        mMap.addMarker(new MarkerOptions().position(rsbb).title("Rumah Sakit Azra Bogor"));

        //3
        LatLng rsmd = new LatLng(-6.598650, 106.805055);
        mMap.addMarker(new MarkerOptions().position(rsmd).title("Rumah Sakit Palang Merah Indonesia Bogor"));

        //4
        LatLng rshga = new LatLng(-6.205007, 106.641550);
        mMap.addMarker(new MarkerOptions().position(rshga).title("Rumah Sakit BMC Mayapada"));

        //5
        LatLng rshd = new LatLng(-6.595176, 106.804950);
        mMap.addMarker(new MarkerOptions().position(rshd).title("Rumah Sakit Siloam Bogor"));

        //6
        LatLng rsida = new LatLng(-6.575561, 106.807378);
        mMap.addMarker(new MarkerOptions().position(rsida).title("Rumah Sakit Mulia"));

        //7
        LatLng rsml = new LatLng(-6.591100, 106.797297);
        mMap.addMarker(new MarkerOptions().position(rsml).title("Rumah Sakit Salak Bogor"));

        //8
        LatLng rsmkd = new LatLng(-6.570685, 106.798553);
        mMap.addMarker(new MarkerOptions().position(rsmkd).title("Rumah Sakit Ibu dan Anak Pasutri Bogor"));

        //9
        LatLng rspd = new LatLng(-6.608406, 106.794644);
        mMap.addMarker(new MarkerOptions().position(rspd).title("Rumah Sakit UMMI"));

        //10
        LatLng rspc = new LatLng(-6.556842, 106.775066);
        mMap.addMarker(new MarkerOptions().position(rspc).title("Rumah Sakit Hermina Bogor"));
    }
}
