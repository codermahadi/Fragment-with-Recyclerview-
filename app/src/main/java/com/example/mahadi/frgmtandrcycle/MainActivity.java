package com.example.mahadi.frgmtandrcycle;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TableLayout;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ViewPageAdapter viewPageAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = (TabLayout) findViewById(R.id.tabLayout_id);
        viewPager = (ViewPager) findViewById(R.id.pageViewId);

        viewPageAdapter = new ViewPageAdapter(getSupportFragmentManager());

   //     Add Fragment
        viewPageAdapter.AddFrmt(new Frmt_call(),"Call");
        viewPageAdapter.AddFrmt(new FrmtContact(),"Contact");
        viewPageAdapter.AddFrmt(new Frmt_fav(),"Favorite");

        viewPager.setAdapter(viewPageAdapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}
