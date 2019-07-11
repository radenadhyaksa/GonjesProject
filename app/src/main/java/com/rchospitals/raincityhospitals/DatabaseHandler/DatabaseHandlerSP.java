package com.rchospitals.raincityhospitals.DatabaseHandler;

import android.content.ContentValues;
import android.content.Context;
import android.content.res.Resources;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHandlerSP extends SQLiteOpenHelper {

    // Versi Database
    public static final int DATABASE_VERSION = 29;

    // Nama Database
    public static final String DATABASE_NAME = "spesialis.db";

    // Nama Tabel
    public static final String TABLE_SPESIALIS = "spesialis";

    // Field Tabel
    public static final String KEY_ID = "_id";
    public static final String KEY_NAMA = "nama";
    public static final String KEY_INFORMASI = "informasi";
    public static final String KEY_RS = "rumahsakit";

    public Resources res;

    public DatabaseHandlerSP(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        res = context.getResources();
    }

    // Method untuk membuat database
    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_TABLE_SPESIALIS = "CREATE TABLE " + TABLE_SPESIALIS + "("
                + KEY_ID + " INTEGER PRIMARY KEY,"
                + KEY_NAMA + " TEXT,"
                + KEY_INFORMASI + " TEXT,"
                + KEY_RS + " TEXT);";

        db.execSQL(CREATE_TABLE_SPESIALIS);

        ContentValues values = new ContentValues();
        //Database Daftar Spesialis

//1
        values.put(KEY_NAMA, "Spesialis Anak (Sp.A)");
        values.put(KEY_INFORMASI, "Dokter Spesialis anak atau yang memiliki kata lain Pediatri adalah dokter yang khusus menangani penyakit yang menyerang bayi sampai dengan anak-anak. Nah, ranah kerja dari dokter spesialis anak hampir sama dengan dokter penyakit dalam , hanya saja berbeda cakupan usia . Lama pendidikan menjadi seorang spesialis anak adalah +/- 8 semester");
        values.put(KEY_RS,
                "1. RS Umum Daerah  [1 Dokter]\n" +
                "2. RS Azra         [6 Dokter]\n" +
                "3. RS PMI          [6 Dokter]\n" +
                "4. RS BMC Mayapada [3 Dokter]\n" +
                "5. RS Siloam       [6 Dokter]\n" +
                "6. RS Mulia        [4 Dokter]\n" +
                "7. RS Salak        [2 Dokter]\n" +
                "8. RSIA Pasutri    [2 Dokter]\n" +
                "9/ RS Ummi         [4 Dokter]\n" +
                "10. RS Hermina     [16 Dokter]");

        db.insert(TABLE_SPESIALIS, null, values);

        //2
        values.put(KEY_NAMA, "Spesialis Anestesiologi dan Reanimasi (Sp.An)");
        values.put(KEY_INFORMASI, "seorang internist atau Sp.PD . Ranah kerja internist adalah mempelajari penyakit sistemik dalam tubuh kita diluar disiplin ilmu spesialisasi organ dalam selain jantung,pencernaan dan paru-paru. Seseorang yang memiliki keluhan dengan sistem hormonal tubuh juga menjadi tanggung jawab internist. Lama studi menjadi internist adalah kurang lebih 9 semester.");
        values.put(KEY_RS,
                "1. RS Mayapada\n" +
                "2. RS Medistra\n" +
                "3. RS Pondok Indah\n" +
                "4. RS Pusat Pertamina\n" +
                "5. RS Siloam TB Simatupang");
        db.insert(TABLE_SPESIALIS, null, values);

        //3
        values.put(KEY_NAMA, "Spesialis Jantung dan Pembuluh Darah (Sp.JP)");
        values.put(KEY_INFORMASI, "Sp.JP atau kardiolog menangani hal yang berhubungan dengan penyakit jantung dan pembuluh darah kita, Kardiolog pun dibedakan menjadi dokter ahli yang fokus mendiagnosis dan mengobati penyakit jantung serta dokter yang menangani masalah detak jantung yang tidak normal karena factor-faktor internal. Lama studi kardiolog adalah 10 semester");
        values.put(KEY_RS,
                "1. RS Gandaria\n" +
                "2. RS Mayapada\n" +
                "3. RS Medistra\n" +
                "4. RS Pondok Indah\n" +
                "5. RS Pusat Pertamina\n" +
                "6. RS Siloam TB Simatupang");
        db.insert(TABLE_SPESIALIS, null, values);

        //4
        values.put(KEY_NAMA, "Spesialis Kebidanan dan Kandungan (Sp.OG)");
        values.put(KEY_INFORMASI, "Dokter ObsGin atau Obstetri & Ginekologi adalah dokter yang bertanggung jawab dalam sebuah persalinan dan juga masalah-masalah tentang kewanitaan. Menjadi seorang dokter kandungan memiliki tingkat resiko yang cukup tinggi karena menangani dua nyawa sekaligus dalam sebuah persalinan, sehingga seorang dokter Sp.OG harus memiliki tingkat kesabaran dan keuletan yang tinggi dalam menangani pasien. Lama studi menjadi seorang dokter Sp.OG berkisar +/- 9 semester.");
        values.put(KEY_RS,
                "1. RS Gandaria\n" +
                "2. RS Mayapada\n" +
                "3. RS Medistra\n" +
                "4. RS Pondok Indah\n" +
                "5. RS Pusat Pertamina\n" +
                "6. RS Siloam TB Simatupang");
        db.insert(TABLE_SPESIALIS, null, values);

        //5
        values.put(KEY_NAMA, "Spesialis Andrologi (Sp.And)");
        values.put(KEY_INFORMASI, "Dokter Spesialisasi yang satu ini, namun seorang andrologist cukup penting dalam dunia medis. Disiplin ilmu seorang androlog adalah mempelajari tentang penyakit-penyakit pada reproduksi laki-laki. Saat ini sudah mulai banyak androlog yang ada di Indonesia dan masa studinya relatif singkat yaitu 6 semester.");
        values.put(KEY_RS,
                "1. RS Pondok Indah\n" +
                "2. RS Umum Fatmawati\n" +
                "3. RS Siloam TB Simatupang");
        db.insert(TABLE_SPESIALIS, null, values);

        //6
        values.put(KEY_NAMA, "Spesialis Mata (Sp.M)");
        values.put(KEY_INFORMASI, "Dokter Spesialis Mata memiliki disiplin ilmu yang cukup spesifik yaitu untuk menangani salah satu panca indera kita, yaitu indera penglihatan kita. Seorang dokter spesialis mata dapat membuka praktik mandiri ataupun bekerja di rumah sakit atapun klinik mata, bagi teman-teman yang ingin berkonsultasi dan merawat kesehatan mata sangat diajurkan untuk ke dokter mata walaupun hanya sekedar check up rutin. Lama studi untuk menjadi seorang oftamologist rata-rata adalah 7 semester.");
        values.put(KEY_RS,
                "1. RS Dr.Suyoto\n" +
                "2. RS Gandaria\n" +
                "3. RS Mayapada\n" +
                "4. RS Medistra\n" +
                "5. RS Pondok Indah\n" +
                "6. RS Pusat Pertamina\n" +
                "7. RS Siloam TB Simatupang");
        db.insert(TABLE_SPESIALIS, null, values);

        //7
        values.put(KEY_NAMA, "Spesialis Kulit dan Kelamin (Sp.KK)");
        values.put(KEY_INFORMASI, "Saat ini seorang dermatologist cukup digandrungi oleh khalayak remaja karena tuntutan penampilan dan tingkat stress yang semakin tinggi dapat berpengaruh ke kulit kita lhoo. Jadi apabila sobat ingin berkonsentrasi dan tertarik dengan kesehatan kulit , tidak ada salahnya mengambil spesialisasi ini , tentunya apabila sobat seorang mahasiswa kedokteran. Rata-rata waktu studi adalah 7 semester untuk menjadi seorang dermatologist.");
        values.put(KEY_RS,
                "1. RS Mayapada\n" +
                "2. RS Medistra\n" +
                "3. RS Pondok Indah\n" +
                "4. RS Pusat Pertamina\n" +
                "5. RS Tebet\n" +
                "6. RS Siloam TB Simatupang");
        db.insert(TABLE_SPESIALIS, null, values);


        //8
        values.put(KEY_NAMA, "Spesialis Saraf (Sp.S)");
        values.put(KEY_INFORMASI, "Seorang ahli saraf harus paham betul mengenai saraf yang ada di otak ataupun di tulang belakang , dan apabila membutuhkan tindakan operasi atau bedah, tindakan akan dibantu juga oleh Dokter spesialis bedah saraf .  Waktu studi yang diperlukan untuk menjadi seorang neurologist rata-rata adalah 8 semester .");
        values.put(KEY_RS,
                "1. RS Mayapada\n" +
                "2. RS Pondok Indah\n" +
                "3. RS Pusat Pertamina\n" +
                "4. RS Siloam TB Simatupang");
        db.insert(TABLE_SPESIALIS, null, values);

        //9
        values.put(KEY_NAMA, "Spesialis Radiologi (Sp.Rad)");
        values.put(KEY_INFORMASI, "seorang dokter spesialis radiologi bertanggung jawab penuh terhadap tindakan foto x-ray dan menginterpretasikan hasil foto tersebut . Kemudian yang khas juga , seorang radiologist memiliki ruangan tersendiri , dan memiliki persiapan khusus bagi pasien ataupun seseorang yang ingin memasuki ruangan ini. Lama studi menjadi seorang ahli radiologi adalah 7 semester .");
        values.put(KEY_RS,
                "1. RS Mayapada\n" +
                "2. RS Medistra\n" +
                "3. RS Pondok Indah\n" +
                "4. RS Pusat Pertamina\n" +
                "5. RS Siloam TB Simatupang");
        db.insert(TABLE_SPESIALIS, null, values);

        //10
        values.put(KEY_NAMA, "Spesialis Kedokteran Jiwa (Sp.KJ)");
        values.put(KEY_INFORMASI, " Dokter spesialis kedokteran jiwa atau biasa disebut psikiater memiliki perbedaan dengan seorang psikolog . Seorang psikiater harus mendiagnosa dan memberikan pengobatan agar seorang pasien yang mengalami gangguan dapat pulih atau tidak bertambah buruk. Seorang psikiater bekerja di RSJ , sedangkan psikolog dapat menjadi pendamping secara sosial dan memberikan psikoterapi. Masa studi menjadi psikiater adalah 8 semester.");
        values.put(KEY_RS,
                "1. RS Mayapada\n" +
                "2. RS Medistra\n" +
                "3. RS Pondok Indah\n" +
                "4. RS Pusat Pertamina\n" +
                "5. RS Umum Fatmawati");
        db.insert(TABLE_SPESIALIS, null, values);

    }

    // Method untuk memperbaharui database
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Drop older table if existed
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_SPESIALIS);

        // Create tables again
        onCreate(db);

    }
}
