package com.rchospitals.raincityhospitals.Page;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;

import com.rchospitals.raincityhospitals.DokterSpesialis.spesialis_list;
import com.rchospitals.raincityhospitals.R;
import com.rchospitals.raincityhospitals.RumahSakit.rumahsakit_list;

public class menu extends AppCompatActivity {

    private AlertDialog.Builder alertDialogBuilder;
    Button rs, maps, spesial, about, exit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);

        rs = (Button) findViewById(R.id.rs);
        rs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(menu.this, rumahsakit_list.class));
            }
        });

        maps = (Button) findViewById(R.id.maps);
        maps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(menu.this, map.class));
            }
        });

        spesial = (Button) findViewById(R.id.spesialist);
        spesial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(menu.this, spesialis_list.class));
            }
        });

        about = (Button) findViewById(R.id.about);
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(menu.this, about.class));
            }
        });

        exit = (Button) findViewById(R.id.Exit);
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(menu.this)
                        .setMessage("Yakin Keluar Dari Aplikasi ini?")
                        .setCancelable(false)
                        .setPositiveButton("Lanjutkan", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                menu.this.finish();
                            }
                        })
                        .setNegativeButton("Tidak", null)
                        .show();
            }
        });
    }

    // override method onKeyUp
    public boolean onKeyUp(int keyCode, KeyEvent event) {
        // filter keyCode, apabila back button yang di click, maka berikan
        // action untuk menampikan alert dialog
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            if (alertDialogBuilder == null) {
                alertDialogBuilder = new AlertDialog.Builder(this);
            }
            alertDialogBuilder.setTitle("Yakin Keluar Dari Aplikasi ini?");
            alertDialogBuilder
                    .setCancelable(false)
                    .setPositiveButton("Lanjutkan",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int id) {
                                    // menghancurkan activity / keluar aplikasi
                                    setTitleColor(R.color.colorLightTurquoise);
                                    finish();
                                }
                            })

                    .setNegativeButton("Tidak",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog,
                                                    int id) {
                                    dialog.cancel();
                                    setTitleColor(R.color.colorLightTurquoise);
                                }
                            }).create().show();
        }

        return false;
    }

}
