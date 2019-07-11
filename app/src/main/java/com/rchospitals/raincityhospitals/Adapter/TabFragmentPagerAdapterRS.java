package com.rchospitals.raincityhospitals.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.rchospitals.raincityhospitals.RumahSakit.Fragment.infoFragment;
import com.rchospitals.raincityhospitals.RumahSakit.Fragment.mapFragment;

public class TabFragmentPagerAdapterRS extends FragmentPagerAdapter {
    //nama tab nya
    String[] title = new String[]{
            "Info", "Lokasi"
    };

    public TabFragmentPagerAdapterRS(FragmentManager fm) {
        super(fm);
    }

    //method ini yang akan memanipulasi penampilan Fragment dilayar
    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch (position) {
            case 0:
                fragment = new infoFragment();
                break;
            case 1:
                fragment = new mapFragment();
                break;
            default:
                fragment = null;
                break;
        }

        return fragment;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return title[position];
    }

    @Override
    public int getCount() {
        return title.length;
    }
}