package com.rchospitals.raincityhospitals.RumahSakit;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;

import com.rchospitals.raincityhospitals.DatabaseHandler.DatabaseHandlerRS;
import com.rchospitals.raincityhospitals.R;

public class rumahsakit_list extends AppCompatActivity {

    private ListView listViews;
    private DatabaseHandlerRS myDbHelper;
    private Cursor cursor;
    private ListAdapter adapter;
    private SQLiteDatabase db;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rumahsakit_list);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setTitle("Daftar RumahSakit");

        listViews = (ListView) findViewById(R.id.rumahsakit);
        myDbHelper = new DatabaseHandlerRS(this);
        db = myDbHelper.getReadableDatabase();


        try {
            cursor = db.rawQuery("SELECT * FROM rumahsakit ORDER BY nama ASC", null);
            adapter = new SimpleCursorAdapter(this, R.layout.list_rumahsakit, cursor,
                    new String[]{"gambar", "nama", "trs"},
                    new int[]{R.id.ivGambar, R.id.tvNama});
            listViews.setAdapter(adapter);
            listViews.setTextFilterEnabled(true);
            listViews.setOnItemClickListener(new AdapterView.OnItemClickListener() {

                @Override
                public void onItemClick(AdapterView<?> parent, View v,
                                        int position, long id) {
                    detail(position);
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void detail(int position) {
        int gambar = 0;
        String trs = "";
        String nama = "";
        String alamat = "";
        String type = "";
        String telepon = "";
        String website = "";
        String jambuka = "";
        String lat = "";
        String lng = "";

        if (cursor.moveToFirst()) {
            cursor.moveToPosition(position);
            trs = cursor.getString(cursor.getColumnIndex("trs"));
            nama = cursor.getString(cursor.getColumnIndex("nama"));
            alamat = cursor.getString(cursor.getColumnIndex("alamat"));
            type = cursor.getString(cursor.getColumnIndex("type"));
            telepon = cursor.getString(cursor.getColumnIndex("telepon"));
            website = cursor.getString(cursor.getColumnIndex("website"));
            jambuka = cursor.getString(cursor.getColumnIndex("jambuka"));
            lat = cursor.getString(cursor.getColumnIndex("lat"));
            lng = cursor.getString(cursor.getColumnIndex("lng"));
            gambar = cursor.getInt(cursor.getColumnIndex("gambar"));

        }

        Intent iIntent = new Intent(this, rumahsakit_infomap.class);
        iIntent.putExtra("dataTrs", trs);
        iIntent.putExtra("dataNama", nama);
        iIntent.putExtra("dataAlamat", alamat);
        iIntent.putExtra("dataType", type);
        iIntent.putExtra("dataTelepon", telepon);
        iIntent.putExtra("dataWebsite", website);
        iIntent.putExtra("dataJambuka", jambuka);
        iIntent.putExtra("dataLat", lat);
        iIntent.putExtra("dataLng", lng);
        iIntent.putExtra("dataGambar", gambar);

        setResult(RESULT_OK, iIntent);
        startActivityForResult(iIntent, 99);

    }
}