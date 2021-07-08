package com.mr.fragmentandroid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.mr.fragmentandroid.adapter.TabAdapter;
import com.mr.fragmentandroid.fragment.TabLayoutDua;
import com.mr.fragmentandroid.fragment.TabLayoutSatu;
import com.mr.fragmentandroid.fragment.TabLayoutTiga;

public class MainActivity extends AppCompatActivity {

    private TabAdapter adapter;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = (ViewPager) findViewById(R.id.vp_isi);
        tabLayout = (TabLayout) findViewById(R.id.tl_atas);

        adapter = new TabAdapter(getSupportFragmentManager());
        adapter.addFragment(new TabLayoutSatu(), "Calls");
        adapter.addFragment(new TabLayoutDua(), "Chats");
        adapter.addFragment(new TabLayoutTiga(), "Contacts");

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}