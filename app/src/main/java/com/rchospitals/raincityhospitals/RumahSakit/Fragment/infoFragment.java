package com.rchospitals.raincityhospitals.RumahSakit.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.rchospitals.raincityhospitals.R;


public class infoFragment extends Fragment {

    TextView textTrs, textNama, textAlamat, textTelepon, textWebsite, textJambuka;
    ImageView imageGambar;

    public infoFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.infofragment, container, false);

        //textTrs = (TextView) view.findViewById(R.id.tvTrs);
        textNama = (TextView) view.findViewById(R.id.tvNama);
        textAlamat = (TextView) view.findViewById(R.id.tvAlamat);
        textTelepon = (TextView) view.findViewById(R.id.tvTelepon);
        textWebsite = (TextView) view.findViewById(R.id.tvWebsite);
        textJambuka = (TextView) view.findViewById(R.id.tvJambuka);
        imageGambar = (ImageView) view.findViewById(R.id.ivGambar);

        Intent intent = getActivity().getIntent();
        //String trs = intent.getStringExtra("dataTrs");
        String nama = intent.getStringExtra("dataNama");
        String alamat = intent.getStringExtra("dataAlamat");
        String telepon = intent.getStringExtra("dataTelepon");
        String website = intent.getStringExtra("dataWebsite");
        String jambuka = intent.getStringExtra("dataJambuka");
        String lat = intent.getStringExtra("dataLat");
        String lng = intent.getStringExtra("dataLng");
        int gambar = intent.getIntExtra("dataGambar", 0);

        //textTrs.setText(trs);
        textNama.setText(nama);
        textAlamat.setText(alamat);
        textTelepon.setText(telepon);
        textWebsite.setText(website);
        textJambuka.setText(jambuka);
        imageGambar.setImageResource(gambar);
        return view;
    }

}

