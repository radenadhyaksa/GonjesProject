package com.rchospitals.raincityhospitals.DokterSpesialis.Fragment;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.rchospitals.raincityhospitals.R;

import me.biubiubiu.justifytext.library.JustifyTextView;

public class SPinfoFragment extends Fragment {

    JustifyTextView textNama, textInformasi;

    public SPinfoFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.spinfo_fragment, container, false);

        textNama = (JustifyTextView) view.findViewById(R.id.tvNama);
        textInformasi = (JustifyTextView) view.findViewById(R.id.tvInformasi);

        Intent intent = getActivity().getIntent();
        String nama = intent.getStringExtra("dataNama");
        String informasi = intent.getStringExtra("dataInformasi");
        String rumahsakit = intent.getStringExtra("dataRumahsakit");

        textNama.setText(nama);
        textInformasi.setText(informasi);
        return view;
    }
}