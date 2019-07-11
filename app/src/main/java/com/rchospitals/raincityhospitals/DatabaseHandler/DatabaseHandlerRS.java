package com.rchospitals.raincityhospitals.DatabaseHandler;

import android.content.ContentValues;
import android.content.Context;
import android.content.res.Resources;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.rchospitals.raincityhospitals.R;


public class DatabaseHandlerRS extends SQLiteOpenHelper {
    // Versi Database
    public static final int DATABASE_VERSION = 29;

    // Nama Database
    public static final String DATABASE_NAME = "rumahsakit.db";

    // Nama Tabel
    public static final String TABLE_RS = "rumahsakit";

    // Field Tabel
    public static final String KEY_ID = "_id";
    public static final String KEY_TRS = "trs";
    public static final String KEY_NAMA = "nama";
    public static final String KEY_ALAMAT = "alamat";
    public static final String KEY_TYPE = "type";
    public static final String KEY_TELEPON = "telepon";
    public static final String KEY_WEBSITE = "website";
    public static final String KEY_JAMBUKA = "jambuka";
    public static final String KEY_LAT = "lat";
    public static final String KEY_LNG = "lng";
    public static final String KEY_GAMBAR = "gambar";

    public Resources res;

    public DatabaseHandlerRS(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        res = context.getResources();
    }

    // Method untuk membuat database
    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_TABLE_RS = "CREATE TABLE " + TABLE_RS + "("
                + KEY_ID + " INTEGER PRIMARY KEY,"
                + KEY_TRS + " TEXT,"
                + KEY_NAMA + " TEXT,"
                + KEY_ALAMAT + " TEXT,"
                + KEY_TYPE + " TEXT,"
                + KEY_TELEPON + " TEXT,"
                + KEY_WEBSITE + " TEXT,"
                + KEY_JAMBUKA + " TEXT,"
                + KEY_LAT + " TEXT,"
                + KEY_LNG + " TEXT,"
                + KEY_GAMBAR + " INTEGER);";

        db.execSQL(CREATE_TABLE_RS);

        ContentValues values = new ContentValues();
        //Database Daftar RumahSakit
        //1
        values.put(KEY_TRS, " ");
        values.put(KEY_NAMA, "Rumah Sakit Umum Daerah Kota Bogor");
        values.put(KEY_ALAMAT,
                "Alamat : Jl. DR. Sumeru No.120, Menteng, Bogor Bar., Kota Bogor, Jawa Barat 16112");
        values.put(KEY_TYPE, "RS");
        values.put(KEY_TELEPON, "No. Telp : (0251) 83113489");
        values.put(KEY_WEBSITE, "Website : rsudkotabogor.org/");
        values.put(KEY_JAMBUKA, "24.00");
        values.put(KEY_LAT, "-6.580461");
        values.put(KEY_LNG, "106.778061");
        values.put(KEY_GAMBAR, R.drawable.rsudkotabogor);
        db.insert(TABLE_RS, null, values);

        //2
        values.put(KEY_TRS, " ");
        values.put(KEY_NAMA, "Rumah Sakit Azra Bogor");
        values.put(KEY_ALAMAT,
                "Alamat : jl. Padjadjaran No.219, Bantarjati, Bogor utara, Kota Bogor, Jawa Barat 16153");
        values.put(KEY_TYPE, "RS");
        values.put(KEY_TELEPON, "No. Telp : (0251) 8318456");
        values.put(KEY_WEBSITE, "Website : rsazra.co.id ");
        values.put(KEY_JAMBUKA, "24.00");
        values.put(KEY_LAT, "-6.298582");
        values.put(KEY_LNG, "106.786177");
        values.put(KEY_GAMBAR, R.drawable.rsazra);
        db.insert(TABLE_RS, null, values);

        //3
        values.put(KEY_TRS, " ");
        values.put(KEY_NAMA, "Rumah Sakit Palang Merah Indonesia Bogor");
        values.put(KEY_ALAMAT,
                "Alamat : Jl. Padjadjaran No.80, Tegallega, Bogor Tengah, Kota Bogor, Jawa Barat 16143");
        values.put(KEY_TYPE, "RS");
        values.put(KEY_TELEPON, "No. Telp : (0251) 8393030");
        values.put(KEY_WEBSITE, "Website : rspmibogor.or.id");
        values.put(KEY_JAMBUKA, "24.00");
        values.put(KEY_LAT, "-6.598650");
        values.put(KEY_LNG, "106.805055");
        values.put(KEY_GAMBAR, R.drawable.rspmibogor);
        db.insert(TABLE_RS, null, values);

        //4
        values.put(KEY_TRS, " ");
        values.put(KEY_NAMA, "Rumah Sakit BMC Mayapada");
        values.put(KEY_ALAMAT,
                "Alamat : Jl. Pajajaran Indah V No.97, Baranangsiang, Bogor Tim., Kota Bogor, Jawa Barat 16143");
        values.put(KEY_TYPE, "RS");
        values.put(KEY_TELEPON, "No. Telp : (0251) 8307900");
        values.put(KEY_WEBSITE, "Website : mayapadahospital.com");
        values.put(KEY_JAMBUKA, "24.00");
        values.put(KEY_LAT, "-6.205007");
        values.put(KEY_LNG, "106.641550");
        values.put(KEY_GAMBAR, R.drawable.bmcmayapadabogor);
        db.insert(TABLE_RS, null, values);

        //5
        values.put(KEY_TRS, " ");
        values.put(KEY_NAMA, "Rumah Sakit Siloam Bogor");
        values.put(KEY_ALAMAT,
                "Alamat : Jl. Padjadjaran No.27, Babakan, Bogor Tengah, Kota Bogor, Jawa Barat 14140");
        values.put(KEY_TYPE, "RS");
        values.put(KEY_TELEPON, "No. Telp : (0251) 8303900");
        values.put(KEY_WEBSITE, "Website : siloamhospitals.com/id");
        values.put(KEY_JAMBUKA, "24.00");
        values.put(KEY_LAT, "-6.595176");
        values.put(KEY_LNG, "106.804950");
        values.put(KEY_GAMBAR, R.drawable.siloambogor);
        db.insert(TABLE_RS, null, values);

        //6
        values.put(KEY_TRS, " ");
        values.put(KEY_NAMA, "Rumah Sakit Mulia");
        values.put(KEY_ALAMAT,
                "Alamat : Jalan Raya Pajajaran No.98 Kp. Kalibata Rt. 003/III, Kelurahan, Bantarjati, Bogor Utara, Kota Bogor, Jawa Barat 16153");
        values.put(KEY_TYPE, "RS");
        values.put(KEY_TELEPON, "No. Telp : (0251) 8379898");
        values.put(KEY_WEBSITE, "Website : rsmulia.co.id ");
        values.put(KEY_JAMBUKA, "24.00");
        values.put(KEY_LAT, "-6.575561");
        values.put(KEY_LNG, "106.807378");
        values.put(KEY_GAMBAR, R.drawable.rsmuliabogor);
        db.insert(TABLE_RS, null, values);


        //7
        values.put(KEY_TRS, " ");
        values.put(KEY_NAMA, "Rumah Sakit Salak Bogor");
        values.put(KEY_ALAMAT,
                "Alamat : sempur, Bogor Tengah, Kota Bogor, Jawa Barat 16121");
        values.put(KEY_TYPE, "RS");
        values.put(KEY_TELEPON, "No. Telp : (0251) 8345222");
        values.put(KEY_WEBSITE, "Website : rssalakbogor.com");
        values.put(KEY_JAMBUKA, "24.00");
        values.put(KEY_LAT, "-6.591100");
        values.put(KEY_LNG, "106.797297");
        values.put(KEY_GAMBAR, R.drawable.rssalakbogor);
        db.insert(TABLE_RS, null, values);

        //8
        values.put(KEY_TRS, " ");
        values.put(KEY_NAMA, "Rumah Sakit Ibu dan Anak Pasutri Bogor");
        values.put(KEY_ALAMAT,
                "Alamat : Jl. Merak No.3, Tanah Sareal, Tanah Sereal, Kota Bogor, Jawa Barat 16161");
        values.put(KEY_TYPE, "RS");
        values.put(KEY_TELEPON, "No. Telp : (0251) 8349707");
        values.put(KEY_WEBSITE, "Website : rsiapasturi.co.id");
        values.put(KEY_JAMBUKA, "24.00");
        values.put(KEY_LAT, "-6.570685");
        values.put(KEY_LNG, "106.798553");
        values.put(KEY_GAMBAR, R.drawable.rsiapasutribogor);
        db.insert(TABLE_RS, null, values);

        //9
        values.put(KEY_TRS, " ");
        values.put(KEY_NAMA, "Rumah Sakit UMMI");
        values.put(KEY_ALAMAT,
                "Alamat :Jl. Empang II No.2, Empang, Bogor Sel., Kota Bogor, Jawa Barat 16132");
        values.put(KEY_TYPE, "RS");
        values.put(KEY_TELEPON, "No. Telp : (0251) 83471600");
        values.put(KEY_WEBSITE, "Website : rsummi.com");
        values.put(KEY_JAMBUKA, "24.00");
        values.put(KEY_LAT, "-6.608406");
        values.put(KEY_LNG, "106.794644");
        values.put(KEY_GAMBAR, R.drawable.rsummibogor);
        db.insert(TABLE_RS, null, values);

        //10
        values.put(KEY_TRS, " ");
        values.put(KEY_NAMA, "Rumah Sakit Hermina Bogor");
        values.put(KEY_ALAMAT,
                "Alamat : Perumahan taman Yasmin, Jl. Ring Road I Kav. 23, 25, 27, Curugmekar, Bogor Barat, Curugmekar, Bogor Bar., Kota Bogor, Jawa Barat 16113");
        values.put(KEY_TYPE, "RS");
        values.put(KEY_TELEPON, "No. Telp : (0251) 8382525");
        values.put(KEY_WEBSITE, "Website : herminahospitals.com");
        values.put(KEY_JAMBUKA, "24.00");
        values.put(KEY_LAT, "-6.556842");
        values.put(KEY_LNG, "106.775066");
        values.put(KEY_GAMBAR, R.drawable.herminabogor);
        db.insert(TABLE_RS, null, values);

    }

    // Method untuk memperbaharui database
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Drop older table if existed
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_RS);

        // Create tables again
        onCreate(db);

    }
}
