package com.example.mekpartner.cart;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import com.example.mekpartner.R;
import com.example.mekpartner.add_to_cart.CartHomePage;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class JobCartPartner extends AppCompatActivity {

     private RecyclerView recyclerView;
     private ListAdapter adapter;
     private Button pay;
    private List<Fragment> mFragmentList;
    private TabLayout mTabLayout;
    private List<String> titles ;
    private int selected_position=0;

    private int[] tabIcons = {
            R.drawable.gs_tab,
            R.drawable.repairing_tab,
            R.drawable.wc_tab,
            R.drawable.dp_tab,
            R.drawable.cc_tab,
            R.drawable.others_tab
    };

    private int[] tabIconsselect = {
            R.drawable.gs_tabselect,
            R.drawable.repairingselect_tab,
            R.drawable.wc_tabselect,
            R.drawable.dp_tabselect,
            R.drawable.cc_tabselect,
            R.drawable.others_tabselect
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_job_cart_partner);

        titles = new ArrayList<>();

        titles.add("General Service");
        titles.add("Repairing");
        titles.add("Wheel Car");
        titles.add("Denting Painting");
        titles.add("Car Care");
        titles.add("Others");

        mTabLayout  = findViewById(R.id.tabs_car_services);





        MyListData[] myListData = new MyListData[] {
                new MyListData("Primary Service", R.drawable.primary_service,R.drawable.primary_service),
                new MyListData("Secondary Service", R.drawable.secondary_service,R.drawable.secondary_service),
                new MyListData("Primary Service", R.drawable.primary_service,R.drawable.primary_service),
                new MyListData("Secondary Service", R.drawable.secondary_service,R.drawable.secondary_service),
                new MyListData("Primary Service", R.drawable.primary_service,R.drawable.primary_service),
                new MyListData("Secondary Service", R.drawable.secondary_service,R.drawable.secondary_service)
        };

        recyclerView =  findViewById(R.id.recyclerViewCart);
        adapter = new ListAdapter(myListData);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        Objects.requireNonNull(recyclerView.getLayoutManager()).scrollToPosition(0);
        recyclerView.setAdapter(adapter);

        pay=findViewById(R.id.pay);

        pay.setOnClickListener(view -> startActivity(new Intent(JobCartPartner.this, CartHomePage.class)));

      setViewPager();
    }


    private void setViewPager(){

        ViewPager viewPager  = findViewById(R.id.viewpager_car_services);

        ServicesFragmentPagerAdapter adapter = new ServicesFragmentPagerAdapter(
                getSupportFragmentManager(),mFragmentList);
        mTabLayout.setupWithViewPager(viewPager);
        viewPager.setAdapter(adapter);
        viewPager.setCurrentItem(selected_position);

        setUpCustomTabs();

    }

    private void setUpCustomTabs() {

        for (int i = 0; i < titles.size(); i++) {
            View view = getLayoutInflater().inflate(R.layout.custom_tabview, null);

            TextView tv = view.findViewById(R.id.tab_title);
            tv.setText(titles.get(i));

            ImageView img   =  view.findViewById(R.id.tab_icon);
            img.setImageResource(tabIcons[i]);
            TabLayout.Tab tab = mTabLayout.getTabAt(i);

            if (tab != null)
                tab.setCustomView(view);//set custom view
        }

        ((ImageView) mTabLayout
                .getTabAt(selected_position).getCustomView().findViewById(R.id.tab_icon))
                .setImageResource(tabIconsselect[selected_position]);

        mTabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                ((ImageView) tab.getCustomView().findViewById(R.id.tab_icon)).setImageResource(tabIconsselect[tab.getPosition()]);
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                ((ImageView) tab.getCustomView().findViewById(R.id.tab_icon)).setImageResource(tabIcons[tab.getPosition()]);
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        //clickListener();
    }

}
