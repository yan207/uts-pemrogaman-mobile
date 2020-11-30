package com.example.katalogsmartphone;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.katalogsmartphone.model.Hp;

import java.util.List;



public class GaleriActivity extends AppCompatActivity {

    List<Hp> hps;
    int indeksTampil = 0;
    String merekHP;
    Button btnPertama,btnTerakhir,btnSebelumnya,btnBerikutnya;
    TextView txFlatform,txDeskripsi,txJudul,txNama;
    ImageView ivFotoHp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activiti_profile);
        Intent intent = getIntent();
        merekHP= intent.getStringExtra(MainActivity.JENIS_GALERI_KEY);
        hps = DataProvider.getHpsByTipe(this, merekHP);
        inisialisasiView();
        tampilkanProfil();
    }

    private void inisialisasiView() {
        btnPertama = findViewById(R.id.btnPertama);
        btnSebelumnya = findViewById(R.id.btnSebelumnya);
        btnBerikutnya = findViewById(R.id.btnBerikutnya);
        btnTerakhir = findViewById(R.id.btnTerakhir);

        btnPertama.setOnClickListener(view -> hpPertama());
        btnTerakhir.setOnClickListener(view -> hpTerakhir());
        btnSebelumnya.setOnClickListener(view -> pahlawanSebelumnya());
        btnBerikutnya.setOnClickListener(view -> hpBerikutnya());

        txNama = findViewById(R.id.txNama);
        txFlatform = findViewById(R.id.txFlatform);
        txDeskripsi = findViewById(R.id.txDeskripsi);
        ivFotoHp = findViewById(R.id.gambarHp);

        txJudul = findViewById(R.id.txJudul);
        txJudul.setText("Berbagai Macam Smarphone "+merekHP);
    }

    private void tampilkanProfil() {
        Hp p = hps.get(indeksTampil);
        Log.d("Xiomi","Menampilkan xiomi"+p.getMerek());
        txFlatform.setText(p.getFlatfrorm());
        txNama.setText(p.getNama());
        txDeskripsi.setText(p.getDeskripsi());
        ivFotoHp.setImageDrawable(this.getDrawable(p.getDrawableRes()));
    }

    private void hpPertama() {
        int posAwal = 0;
        if (indeksTampil == posAwal) {
            Toast.makeText(this,"Sudah di posisi pertama",Toast.LENGTH_SHORT).show();
            return;
        } else {
            indeksTampil = posAwal;
            tampilkanProfil();
        }
    }

    private void hpTerakhir() {
        int posAkhir = hps.size() - 1;
        if (indeksTampil == posAkhir) {
            Toast.makeText(this,"Sudah di posisi_terakhir",Toast.LENGTH_SHORT).show();
            return;
        } else {
            indeksTampil = posAkhir;
            tampilkanProfil();
        }
    }

    private void hpBerikutnya() {
        if (indeksTampil == hps.size() - 1) {
            Toast.makeText(this,"Sudah di posisi terakhir",Toast.LENGTH_SHORT).show();
            return;
        } else {
            indeksTampil++;
            tampilkanProfil();
        }
    }

    private void pahlawanSebelumnya() {
        if (indeksTampil == 0) {
            Toast.makeText(this,"Sudah di posisi pertama",Toast.LENGTH_SHORT).show();
            return;
        } else {
            indeksTampil--;
            tampilkanProfil();
        }
    }
}