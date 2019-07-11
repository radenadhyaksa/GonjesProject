package com.rchospitals.raincityhospitals.RumahSakit.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.rchospitals.raincityhospitals.R;


public class mapFragment extends Fragment implements OnMapReadyCallback {

    public mapFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.map_fragment, container, false);
        SupportMapFragment mapFragment = (SupportMapFragment) this.getChildFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);


        return view;
    }


    @Override
    public void onMapReady(GoogleMap googleMap) {


        Intent intent = getActivity().getIntent();
        String trs = intent.getStringExtra("dataTrs");
        String nama = intent.getStringExtra("dataNama");
        String alamat = intent.getStringExtra("dataAlamat");
        String status = intent.getStringExtra("dataStatus");
        String telepon = intent.getStringExtra("dataTelepon");
        String website = intent.getStringExtra("dataWebsite");
        String jurusan = intent.getStringExtra("dataJurusan");
        String lat = intent.getStringExtra("dataLat");
        String lng = intent.getStringExtra("dataLng");
        int gambar = intent.getIntExtra("dataGambar", 0);

        Double Lat = Double.parseDouble(lat);
        Double Lng = Double.parseDouble(lng);

        LatLng loc = new LatLng(Lat, Lng);
        googleMap.addMarker(new MarkerOptions().position(loc).title(nama));
        googleMap.animateCamera(CameraUpdateFactory.newLatLngZoom(loc, 16.0f));

        //LatLng loc = new LatLng(-6.522153, 106.807730);
        // googleMap.addMarker(new MarkerOptions().position(loc).title("Tes"));
        //googleMap.animateCamera(CameraUpdateFactory.newLatLngZoom(loc, 16.0f));
    }
}

