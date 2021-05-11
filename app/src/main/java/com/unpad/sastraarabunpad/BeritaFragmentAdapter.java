package com.unpad.sastraarabunpad;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class BeritaFragmentAdapter extends FragmentStateAdapter {
    public BeritaFragmentAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        return new BeritaFragment();
    }

    @Override
    public int getItemCount() {
        return 1;
    }
}
