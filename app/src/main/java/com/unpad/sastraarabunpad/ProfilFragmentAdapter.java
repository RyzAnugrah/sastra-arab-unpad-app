package com.unpad.sastraarabunpad;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class ProfilFragmentAdapter extends FragmentStateAdapter {
    public ProfilFragmentAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 1:
                return new SejarahFragment();
            case 2:
                return new TujuanFragment();
            case 3:
                return new StafFragment();
        }
        return new ProfilFragment();
    }

    @Override
    public int getItemCount() {
        return 4;
    }
}
