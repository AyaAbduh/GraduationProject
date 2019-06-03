package com.example.graduationproject;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private ViewPager viewPager;
    private ViewPagerAdapter Adapter;
    private TabLayout tabLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar=findViewById(R.id.my_toolbar);
        viewPager=findViewById(R.id.pager);
        Adapter=new ViewPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(Adapter);
        tabLayout=findViewById(R.id.tab);
        tabLayout.setupWithViewPager(viewPager);
    }
}
