package com.example.katalogsmartphone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton btnOppo,btnXiomi,btnSamsung;
    public static final String JENIS_GALERI_KEY = "JENIS_GALERI";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inisialisasiView();

    }

    private void inisialisasiView() {
        btnOppo= findViewById(R.id.btn_buka_nama_oppo);
        btnXiomi= findViewById(R.id.btn_buka_nama_xiomi);
        btnSamsung= findViewById(R.id.btn_buka_nama_samsung);
        btnOppo.setOnClickListener(view -> bukaGaleri("Oppo"));
        btnXiomi.setOnClickListener(view -> bukaGaleri("Xiomi"));
        btnSamsung.setOnClickListener(view -> bukaGaleri("Samsung"));
    }

    private void bukaGaleri(String merekHp) {
        Log.d("MAIN","Buka activity Oppo");
        Intent intent = new Intent(this, GaleriActivity.class);
        intent.putExtra(JENIS_GALERI_KEY, merekHp);
        startActivity(intent);
    }

}