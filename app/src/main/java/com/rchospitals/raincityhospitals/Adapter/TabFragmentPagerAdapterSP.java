package com.rchospitals.raincityhospitals.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.rchospitals.raincityhospitals.DokterSpesialis.Fragment.SPinfoFragment;
import com.rchospitals.raincityhospitals.DokterSpesialis.Fragment.SPrsFragment;

public class TabFragmentPagerAdapterSP extends FragmentPagerAdapter {
    //nama tab nya
    String[] title = new String[]{
            "Info", "Rumahsakit"
    };

    public TabFragmentPagerAdapterSP(FragmentManager fm) {
        super(fm);
    }

    //method ini yang akan memanipulasi penampilan Fragment dilayar
    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch (position) {
            case 0:
                fragment = new SPinfoFragment();
                break;
            case 1:
                fragment = new SPrsFragment();
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