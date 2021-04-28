package com.unpad.sastraarabunpad;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private CardView profil, mahasiswa, kurikulum, berita;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initControl();

    }

    private void initControl() {
        profil = findViewById(R.id.profil);
        profil.setOnClickListener(this);

        mahasiswa = findViewById(R.id.mahasiswa);
        mahasiswa.setOnClickListener(this);

        kurikulum = findViewById(R.id.kurikulum);
        kurikulum.setOnClickListener(this);

        berita = findViewById(R.id.berita);
        berita.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.profil:
                Intent intent_profil = new Intent(this, ProfilActivity.class);
                startActivity(intent_profil);
                break;
            case R.id.mahasiswa:
                Intent intent_mahasiswa = new Intent(this, MahasiswaActivity.class);
                startActivity(intent_mahasiswa);
                break;
            case R.id.kurikulum:
                Intent intent_kurikulum = new Intent(this, KurikulumActivity.class);
                startActivity(intent_kurikulum);
                break;
            case R.id.berita:
                Intent intent_berita = new Intent(this, BeritaActivity.class);
                startActivity(intent_berita);
                break;
        }
    }
}