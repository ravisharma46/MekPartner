package com.example.mekpartner.service_management;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.example.mekpartner.R;
import com.example.mekpartner.nav_drawer.NavActivity;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class ServiceManagement extends AppCompatActivity {
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private TextView tv_title;
    private ImageView iv_title,back;
    private int[] titleIcons = {
            R.drawable.bike_black,
            R.drawable.carblack,
            R.drawable.bike_black,
            R.drawable.carblack,
            R.drawable.cab_black,
    };

    private String[] title = {
           "Service Management",
            "Service Management",
            "SOS/Bike",
            "SOS/Car",
            "Cabs & More",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service_management);

        tv_title=findViewById(R.id.tv_title);
        iv_title=findViewById(R.id.iv_titleimage);
        back=findViewById(R.id.iv_back);

        iv_title.setImageResource(titleIcons[0]);
        tv_title.setText(title[0]);

        back.setOnClickListener(view -> onBackPressed());


        setTabLayout();

    }

    private void setTabLayout(){

        viewPager = findViewById(R.id.viewpager);
        setupViewPager(viewPager);

        tabLayout = findViewById(R.id.tabs);
        for (int i = 0; i < title.length; i++) {
            View view = getLayoutInflater().inflate(R.layout.customtabviewservice, null);

            TextView tv = view.findViewById(R.id.tab_title);
            tv.setText(title[i]);

            TabLayout.Tab tab = tabLayout.getTabAt(i);

            if (tab != null)
                tab.setCustomView(view);//set custom view
        }

        tabLayout.setupWithViewPager(viewPager);

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
             iv_title.setImageResource(titleIcons[tabLayout.getSelectedTabPosition()]);
             tv_title.setText(title[tabLayout.getSelectedTabPosition()]);
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    private void setupViewPager(ViewPager viewPager) {
        NavActivity.ViewPagerAdapter adapter = new NavActivity.ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new bike_fragment(), "Bike");
        adapter.addFragment(new car_management(), "Car");
        adapter.addFragment(new sosBike(), "SOS/Bike");
        adapter.addFragment(new sosCar(), "SOS/Car");
        adapter.addFragment(new sos_cabs_and_more(), "Cabs & More");
        viewPager.setAdapter(adapter);
    }

    public static class ViewPagerAdapter extends FragmentPagerAdapter {
        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();

        public ViewPagerAdapter(FragmentManager manager) {
            super(manager, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        public void addFragment(Fragment fragment, String title) {
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mFragmentTitleList.get(position);
        }
    }


}
