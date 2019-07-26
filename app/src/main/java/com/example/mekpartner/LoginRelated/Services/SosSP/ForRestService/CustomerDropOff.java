package com.example.mekpartner.LoginRelated.Services.SosSP.ForRestService;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Html;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.example.mekpartner.LoginRelated.CustomerReport.ViewCustomerReport;
import com.example.mekpartner.LoginRelated.Services.RegularServicePartner.ServiceInProgress;
import com.example.mekpartner.R;

public class CustomerDropOff extends AppCompatActivity {

    private Button bt_viewReport,bt_serviceComplete;
    private LinearLayout ll_opt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_drop_off);


        bt_viewReport=findViewById(R.id.bt_report_view);
        ll_opt=findViewById(R.id.ll_otp);

        Bundle extras= getIntent().getExtras();

        if(extras!=null){
            String value=extras.getString("key");
            if(value.contains("chauffer")){
                ll_opt.setVisibility(View.VISIBLE);
            }
        }

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#ffffff")));
        getSupportActionBar().setTitle(Html.fromHtml("<font color='#000000'>#123</font>"));
        final Drawable upArrow = getResources().getDrawable(R.drawable.ic_keyboard_backspace_black_24dp);
        upArrow.setColorFilter(getResources().getColor(R.color.chart_deep_red), PorterDuff.Mode.SRC_ATOP);
        getSupportActionBar().setHomeAsUpIndicator(upArrow);


        bt_viewReport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CustomerDropOff.this, ViewCustomerReport.class));
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                return true;

        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}

