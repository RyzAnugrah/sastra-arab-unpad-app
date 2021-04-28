package com.unpad.sastraarabunpad;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class HomeFragment extends Fragment implements View.OnClickListener {

    private CardView profil, mahasiswa, kurikulum, berita;

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_home, container, false);

        profil = rootView.findViewById(R.id.profil);
        profil.setOnClickListener(this);

        mahasiswa = rootView.findViewById(R.id.mahasiswa);
        mahasiswa.setOnClickListener(this);

        kurikulum = rootView.findViewById(R.id.kurikulum);
        kurikulum.setOnClickListener(this);

        berita = rootView.findViewById(R.id.berita);
        berita.setOnClickListener(this);

        return rootView ;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.profil:
                Intent intent_profil = new Intent(v.getContext(), ProfilActivity.class);
                startActivity(intent_profil);
                break;
            case R.id.mahasiswa:
                Intent intent_mahasiswa = new Intent(v.getContext(), MahasiswaActivity.class);
                startActivity(intent_mahasiswa);
                break;
            case R.id.kurikulum:
                Intent intent_kurikulum = new Intent(v.getContext(), KurikulumActivity.class);
                startActivity(intent_kurikulum);
                break;
            case R.id.berita:
                Intent intent_berita = new Intent(v.getContext(), BeritaActivity.class);
                startActivity(intent_berita);
                break;
        }
    }
}