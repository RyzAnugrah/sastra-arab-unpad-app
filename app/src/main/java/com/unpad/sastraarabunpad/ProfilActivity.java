package com.unpad.sastraarabunpad;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.tabs.TabLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager2.widget.ViewPager2;

public class ProfilActivity extends AppCompatActivity{
    Toolbar toolbar;
    TabLayout tabLayout;
    ViewPager2 view_pager2;
    ProfilFragmentAdapter fragment_adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Profil");

        toolbar.setNavigationIcon(R.drawable.ic_baseline_arrow_back_24);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        tabLayout = findViewById(R.id.tab_layout);
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        view_pager2 = findViewById(R.id.view_pager2);

        FragmentManager fm = getSupportFragmentManager();
        fragment_adapter = new ProfilFragmentAdapter(fm, getLifecycle());
        view_pager2.setAdapter(fragment_adapter);

        tabLayout.addTab(tabLayout.newTab().setText("Profil"));
        tabLayout.addTab(tabLayout.newTab().setText("Sejarah"));
        tabLayout.addTab(tabLayout.newTab().setText("Visi, Misi, dan Tujuan"));
        tabLayout.addTab(tabLayout.newTab().setText("Staf Pengajar"));

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                view_pager2.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        view_pager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                tabLayout.selectTab(tabLayout.getTabAt(position));
            }
        });
    }
}