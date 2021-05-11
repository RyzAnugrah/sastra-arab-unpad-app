package com.unpad.sastraarabunpad;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.tabs.TabLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager2.widget.ViewPager2;

public class KurikulumActivity extends AppCompatActivity {
    Toolbar toolbar;

    ViewPager2 view_pager2;
    KurikulumFragmentAdapter fragment_adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kurikulum);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Kurikulum");

        toolbar.setNavigationIcon(R.drawable.ic_baseline_arrow_back_24);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        view_pager2 = findViewById(R.id.view_pager2);

        FragmentManager fm = getSupportFragmentManager();
        fragment_adapter = new KurikulumFragmentAdapter(fm, getLifecycle());
        view_pager2.setAdapter(fragment_adapter);

    }
}