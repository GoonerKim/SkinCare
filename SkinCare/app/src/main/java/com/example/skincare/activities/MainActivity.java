package com.example.skincare.activities;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.skincare.R;
import com.example.skincare.fragments.Cheek_Fragment;
import com.example.skincare.fragments.Chin_Fragment;
import com.example.skincare.fragments.Forehead_Fragment;
import com.example.skincare.fragments.Home_Fragment;
import com.example.skincare.fragments.Nose_Fragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    private FragmentManager fragmentManager = getSupportFragmentManager();

    private Home_Fragment home_fragment = new Home_Fragment();
    private Forehead_Fragment forehead_fragment = new Forehead_Fragment();
    private Cheek_Fragment cheek_fragment = new Cheek_Fragment();
    private Nose_Fragment nose_fragment = new Nose_Fragment();
    private Chin_Fragment chin_fragment = new Chin_Fragment();

    public static MainActivity newInstance() {
        return new MainActivity();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_view);

        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.main_frame, home_fragment).commitAllowingStateLoss();

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {

            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                FragmentTransaction transaction = fragmentManager.beginTransaction();

                switch (item.getItemId()) {
                    case R.id.navi_forehead:
                        transaction.replace(R.id.main_frame, forehead_fragment).addToBackStack(null).commitAllowingStateLoss();
                        break;

                    case R.id.navi_cheek:
                        transaction.replace(R.id.main_frame, cheek_fragment).addToBackStack(null).commitAllowingStateLoss();
                        break;

                    case R.id.navi_home:
                        transaction.replace(R.id.main_frame, home_fragment.newInstance()).addToBackStack(null).commitAllowingStateLoss();
                        break;

                    case R.id.navi_nose:
                        transaction.replace(R.id.main_frame, nose_fragment).addToBackStack(null).commitAllowingStateLoss();
                        break;

                    case R.id.navi_chin:
                        transaction.replace(R.id.main_frame, chin_fragment).addToBackStack(null).commitAllowingStateLoss();
                        break;
                }
                return true;
            }
        });

    }

    public void replaceFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.main_frame, fragment).addToBackStack(null).commitAllowingStateLoss();
    }
}
