package com.rchospitals.raincityhospitals.DokterSpesialis;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;

import com.rchospitals.raincityhospitals.DatabaseHandler.DatabaseHandlerSP;
import com.rchospitals.raincityhospitals.R;

public class spesialis_list extends AppCompatActivity {

    private ListView listViews;
    private DatabaseHandlerSP myDbHelper;
    private Cursor cursor;
    private ListAdapter adapter;
    private SQLiteDatabase db;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spesialis_list);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setTitle("Daftar Dokter Spesialis");

        listViews = (ListView) findViewById(R.id.lvSpesialist);
        myDbHelper = new DatabaseHandlerSP(this);
        db = myDbHelper.getReadableDatabase();

        try {
            cursor = db.rawQuery("SELECT * FROM spesialis ORDER BY nama ASC", null);
            adapter = new SimpleCursorAdapter(this, R.layout.list_spesialis, cursor,
                    new String[]{"nama"},
                    new int[]{R.id.tvNama});
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
        String nama = "";
        String informasi = "";
        String rumahsakit = "";

        if (cursor.moveToFirst()) {
            cursor.moveToPosition(position);
            nama = cursor.getString(cursor.getColumnIndex("nama"));
            informasi = cursor.getString(cursor.getColumnIndex("informasi"));
            rumahsakit = cursor.getString(cursor.getColumnIndex("rumahsakit"));

        }

        Intent iIntent = new Intent(this, spesialis_info.class);
        iIntent.putExtra("dataNama", nama);
        iIntent.putExtra("dataInformasi", informasi);
        iIntent.putExtra("dataRumahsakit", rumahsakit);

        setResult(RESULT_OK, iIntent);
        startActivityForResult(iIntent, 99);

    }
}
