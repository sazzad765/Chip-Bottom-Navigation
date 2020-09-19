package com.team15.chipbottomnavigation;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.ismaeldivita.chipnavigation.ChipNavigationBar;

public class MainActivity extends AppCompatActivity {
    private ChipNavigationBar bottom_menu;
    private ActionBar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = getSupportActionBar();
        toolbar.setTitle("Home");
        bottom_menu = findViewById(R.id.bottom_menu);

        bottom_menu.setItemSelected(R.id.home, true);
        bottom_menu.showBadge(R.id.cart, 5);
        bottom_menu.setOnItemSelectedListener(listener);
    }

    ChipNavigationBar.OnItemSelectedListener listener = new ChipNavigationBar.OnItemSelectedListener() {
        @Override
        public void onItemSelected(int i) {
            switch (i) {
                case R.id.home:
                    toolbar.setTitle("Home");
//                        fragment = new HomeFragment();
//                        loadFragment(fragment);
                    break;
                case R.id.store:
                    toolbar.setTitle("Shop");
//                        fragment = new StoreFragment();
//                        loadFragment(fragment);
                    break;
                case R.id.cart:
                    toolbar.setTitle("Cart");
//                        fragment = new GiftsFragment();
//                        loadFragment(fragment);
                    break;
                case R.id.account:
                    toolbar.setTitle("Account");
//                        fragment = new CartFragment();
//                        loadFragment(fragment);
                    break;
                default:
                    break;
            }
        }

    };

//    private void loadFragment(Fragment fragment) {
//        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
//        transaction.replace(R.id.frame_container, fragment);
//        transaction.addToBackStack(null);
//        transaction.commit();
//    }
}