package com.example.mekpartner.nav_drawer;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.example.mekpartner.R;
import com.example.mekpartner.about_us.AboutUs;
import com.example.mekpartner.bookings.history.History;
import com.example.mekpartner.bookings.new_booking.NewBooking;
import com.example.mekpartner.bookings.ongoing_booking.OngoingBooking;
import com.example.mekpartner.bookings.upcoming_booking.UpcomingBooking;
import com.example.mekpartner.help_and_support.Help;
import com.example.mekpartner.mekcoins_wallet.MekcoinsWalletActivity;
import com.example.mekpartner.profile_related.InitialProfilePage;
import com.example.mekpartner.service_management.ServiceManagement;
import com.example.mekpartner.sp_cabs_more.Spcabs_more;
import com.example.mekpartner.technical_support.Technical_support;
import com.example.mekpartner.transaction_history.Transaction_details_01;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public class NavActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private final String TAG = this.getClass().getSimpleName();
    // private LoginSessionManager mSession;
    HashMap<String, String> mUserInfo;

    ExpandableListAdapter expandableListAdapter;
    ExpandableListView expandableListView;
    List<MenuModel> headerList = new ArrayList<>();
    HashMap<MenuModel, List<MenuModel>> childList = new HashMap<>();

    private int lastExpandedPosition = -1;

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ImageView iv_serviceManagement;
    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = item -> {
//                Fragment fragment;
        switch (item.getItemId()) {
            case R.id.navigation_home:
                //toolbar.setTitle("Shop");
//                        Toast.makeText(getApplicationContext(),"Home",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.navigation_location:
                startActivity(new Intent(NavActivity.this, Spcabs_more.class));
                return true;
            // case R.id.navigation_sm:
            //  return true;
            case R.id.navigation_walet:
                startActivity(new Intent(NavActivity.this, MekcoinsWalletActivity.class));
                return true;
            case R.id.navigation_profile:
                startActivity(new Intent(NavActivity.this, InitialProfilePage.class));
                return true;
        }
        return false;
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        mSession  = new LoginSessionManager(getApplicationContext());
//        mUserInfo = mSession.getUserDetailsFromSP();
//
//        if (!mSession.isLoggedIn()) {
//            mSession.checkLogin();
//            finish();
//            return;
//        }

        setContentView(R.layout.activity_nav);
        Log.e(TAG, "Login successfully");

        iv_serviceManagement = findViewById(R.id.iv_sm);
        iv_serviceManagement.setOnClickListener(view -> startActivity(new
                Intent(NavActivity.this, ServiceManagement.class)));

        setNavigationDrawer();

        setBottomNavigation();

        setTabLayout();

    }

    private void setTabLayout() {

        viewPager = findViewById(R.id.viewpager);
        setupViewPager(viewPager);

        tabLayout = findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
    }

    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new NewBooking(), "New");
        adapter.addFragment(new UpcomingBooking(), "Upcoming");
        adapter.addFragment(new OngoingBooking(), "Ongoing");
        adapter.addFragment(new History(), "history");
        viewPager.setAdapter(adapter);
    }

    private void setBottomNavigation() {

        BottomNavigationView navigation = findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

    private void setNavigationDrawer() {

        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setNavigationIcon(R.drawable.drawer_icon);
        setSupportActionBar(toolbar);

        expandableListView = findViewById(R.id.expandableListView);
        prepareMenuData();
        populateExpandableList();

        final DrawerLayout drawer = findViewById(R.id.drawer_layout);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(

                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);

        toggle.setDrawerIndicatorEnabled(false);
//        Drawable icon = ResourcesCompat.getDrawable(getResources(), R.drawable.drawer_icon,NavActivity.this.getTheme());
//        toggle.setHomeAsUpIndicator(icon);

        toggle.setToolbarNavigationClickListener(v -> {
//                mMenuMyVehicleLayout.setVisibility(View.GONE);
            if (drawer.isDrawerVisible(GravityCompat.START)) {
                drawer.closeDrawer(GravityCompat.START);
            } else {
                drawer.openDrawer(GravityCompat.START);
            }
        });

        toggle.syncState();

        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        // Set Navigation Header
        View headerView = navigationView.getHeaderView(0);

        ImageView iv_profile = headerView.findViewById(R.id.profile_pic);
//        TextView tv_name     =  headerView.findViewById(R.id.name);
//        TextView tv_mobile   =  headerView.findViewById(R.id.mobile);

        // need to set a profile pic -
        iv_profile.setOnClickListener(v -> {
            //startActivity(new Intent(AppHomePage.this,Profile.class));
            drawer.closeDrawer(GravityCompat.START);
        });
        //tv_name.setText(mUserInfo.get(LoginSessionManager.NAME));
        //tv_mobile.setText(mUserInfo.get(LoginSessionManager.MOBILE));

    }

    private void prepareMenuData() {

        List<MenuModel> childModelsList = new ArrayList<>();

        MenuModel menuModel = new MenuModel(1, "Home", false, true, R.drawable.ic_home);
        headerList.add(menuModel);
        if (!menuModel.isHasChildren()) {
            childList.put(menuModel, null);
        }

        menuModel = new MenuModel(2, "Profile", false, true, R.drawable.ic_profile);
        headerList.add(menuModel);
        if (!menuModel.isHasChildren()) {
            childList.put(menuModel, null);
        }

        menuModel = new MenuModel(3, "bookings", true, true, R.drawable.ic_bookings);
        headerList.add(menuModel);

        MenuModel childModel = new MenuModel(31, "New bookings", false, false, 0);
        childModelsList.add(childModel);
        childModel = new MenuModel(32, "Upcoming bookings", false, false, 0);
        childModelsList.add(childModel);
        childModel = new MenuModel(33, "Ongoing bookings", false, false, 0);
        childModelsList.add(childModel);
        childModel = new MenuModel(34, "history", false, false, 0);
        childModelsList.add(childModel);

        if (menuModel.isHasChildren()) {
            childList.put(menuModel, childModelsList);
        }

        menuModel = new MenuModel(4, "Transaction history", false, true, R.drawable.ic_transaction_history);
        headerList.add(menuModel);
        if (!menuModel.isHasChildren()) {
            childList.put(menuModel, null);
        }

        menuModel = new MenuModel(5, "Notifications", false, true, R.drawable.ic_notification);
        headerList.add(menuModel);
        if (!menuModel.isHasChildren()) {
            childList.put(menuModel, null);
        }

        menuModel = new MenuModel(6, "About Us", false, true, R.drawable.ic_about_us);
        headerList.add(menuModel);
        if (!menuModel.isHasChildren()) {
            childList.put(menuModel, null);
        }

        menuModel = new MenuModel(7, "Support", false, true, R.drawable.ic_help);
        headerList.add(menuModel);
        if (!menuModel.isHasChildren()) {
            childList.put(menuModel, null);
        }


        menuModel = new MenuModel(8, "", false, false, 0);  //Blank Space
        headerList.add(menuModel);
        if (!menuModel.isHasChildren()) {
            childList.put(menuModel, null);
        }

        menuModel = new MenuModel(9, "Logout", false, true, R.drawable.ic_logout);
        headerList.add(menuModel);
        if (!menuModel.isHasChildren()) {
            childList.put(menuModel, null);
        }

    }

    private void populateExpandableList() {

        expandableListAdapter = new ExpandableListAdapter(this, headerList, childList);

        ViewGroup footerView = (ViewGroup) getLayoutInflater().inflate(R.layout.home_page_expandable_view_footer, expandableListView, false);
        expandableListView.addFooterView(footerView);

        expandableListView.setAdapter(expandableListAdapter);

        expandableListView.setOnGroupClickListener((parent, v, groupPosition, id) -> {

//            DrawerLayout drawer = findViewById(R.id.drawer_layout);
            MenuModel menuModel = headerList.get(groupPosition);
            int id_int = (int) id;

            if (menuModel.isGroup()) {

                if (!menuModel.isHasChildren()) {
                    switch (id_int) {
                        case 0:
//                            startActivity(new Intent(NavActivity.this, UserProfile.class));
                            break;
                        case 1:
                            delay(new InitialProfilePage());
                            break;
                        case 2:
                        case 4:
                        case 7:
                            break;
                        case 3:
                            delay(new Transaction_details_01());
                            //delay(new OrderHistory());
                            break;
                        case 5:
                            delay(new AboutUs());
                            // delay(new AboutUs());
                            break;
                        case 6:
                            delay(new Help());
                            //delay(new Help());
                            break;
                        case 8:
                            // mSession.logoutUser();
                            // finish();
                            break;
                    }
                    onBackPressed();
                }
            }

            return false;
        });

        expandableListView.setOnChildClickListener((parent, v, groupPosition, childPosition, id) -> {

            if (childList.get(headerList.get(groupPosition)) != null) {

                if (groupPosition == 2) {
                    switch (childPosition) {

                        case 0:
                            Objects.requireNonNull(tabLayout.getTabAt(0)).select();
                            break;
                        case 1:
                            Objects.requireNonNull(tabLayout.getTabAt(1)).select();
                            break;
                        case 2:
                            Objects.requireNonNull(tabLayout.getTabAt(2)).select();
                            break;
                        case 3:
                            Objects.requireNonNull(tabLayout.getTabAt(3)).select();
                            break;
                    }
                }

                onBackPressed();

            }

            return false;

        });

        expandableListView.setOnGroupExpandListener(groupPosition -> {

            if (lastExpandedPosition != -1
                    && groupPosition != lastExpandedPosition) {
                expandableListView.collapseGroup(lastExpandedPosition);
            }
            lastExpandedPosition = groupPosition;

        });
    }

    @Override
    public void onBackPressed() {
//        mMenuMyVehicleLayout.setVisibility(View.GONE);
        DrawerLayout drawer = findViewById(R.id.drawer_layout);

        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
            finish();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_home, menu);
        return true;
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(TAG, "onResume");
//        fetchSavedVehicle();
//        loadFragment();
    }

    public void delay(Activity activity) {
        Handler handler = new Handler();

        handler.postDelayed(() -> {
            Intent intent = new Intent(NavActivity.this, activity.getClass());
            startActivity(intent);

        }, 250);
    }

//    public void loadFragment(){
//        replaceFragment(new FragmentMainContent());
//    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {


        if (item.getItemId() == R.id.menu_support) {
            startActivity(new Intent(NavActivity.this, Technical_support.class));
            return true;
        }
        return super.onOptionsItemSelected(item);

    }

    public static class ViewPagerAdapter extends FragmentPagerAdapter {
        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();

        public ViewPagerAdapter(FragmentManager manager) {
            super(manager, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        }

        @NonNull
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