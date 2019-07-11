package com.rchospitals.raincityhospitals.DokterSpesialis.Fragment;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.rchospitals.raincityhospitals.R;

import me.biubiubiu.justifytext.library.JustifyTextView;

public class SPrsFragment extends Fragment {

    JustifyTextView textSpesialis, textRumahsakit;

    public SPrsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.sprs_fragment, container, false);

        textRumahsakit = (JustifyTextView) view.findViewById(R.id.tvRumahsakit);
        textSpesialis = (JustifyTextView) view.findViewById(R.id.tvSpesialis);

        Intent intent = getActivity().getIntent();
        String nama = intent.getStringExtra("dataNama");
        String informasi = intent.getStringExtra("dataInformasi");
        String rumahsakit = intent.getStringExtra("dataRumahsakit");

        textSpesialis.setText("Berikut adalah daftar nama Rumahsakit yang memiliki Dokter Spesialis " + nama + " :");
        textRumahsakit.setText(rumahsakit);
        return view;
    }
}
