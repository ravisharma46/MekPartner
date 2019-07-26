package com.example.mekpartner.LoginRelated.Services.RegularServicePartner;

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
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.mekpartner.LoginRelated.CustomerReport.ViewCustomerReport;
import com.example.mekpartner.LoginRelated.Services.SosSP.ForRestService.CustomerDropOff;
import com.example.mekpartner.R;

public class ServiceInProgress extends AppCompatActivity {

    private TextView tvDetails;
    private Button bt_viewReport,bt_serviceComplete;
    private FrameLayout fl_addMoreProblem;

    private LinearLayout paint_linear;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service_in_progress);

        tvDetails=findViewById(R.id.tvDetails_1);
        paint_linear=findViewById(R.id.linear_paint_1);
        bt_viewReport=findViewById(R.id.bt_report_view);
        bt_serviceComplete=findViewById(R.id.bt_serviceComplete);
        fl_addMoreProblem=findViewById(R.id.fl_addmoreproblem);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#ffffff")));
        getSupportActionBar().setTitle(Html.fromHtml("<font color='#000000'>#123</font>"));
        final Drawable upArrow = getResources().getDrawable(R.drawable.ic_keyboard_backspace_black_24dp);
        upArrow.setColorFilter(getResources().getColor(R.color.chart_deep_red), PorterDuff.Mode.SRC_ATOP);
        getSupportActionBar().setHomeAsUpIndicator(upArrow);


       Bundle extras=getIntent().getExtras();
       String value="";
       if(extras!=null){
           value=extras.getString("key");

           if(value.contains("RestService")){
               bt_serviceComplete.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View view) {
                       startActivity(new Intent(ServiceInProgress.this, PickupConfirm.class));
                   }
               });
           }
           if(value.contains("SosRest")){
               fl_addMoreProblem.setVisibility(View.GONE);
               bt_serviceComplete.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View view) {
                       startActivity(new Intent(ServiceInProgress.this, CustomerDropOff.class));
                   }
               });
           }

       }


        bt_viewReport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ServiceInProgress.this, ViewCustomerReport.class));
            }
        });



        tvDetails.setOnClickListener(new View.OnClickListener() {
            int check = 1;

            @Override
            public void onClick(View view) {

                if (check == 1) {
                    paint_linear.setVisibility(View.VISIBLE);
                    check = 0;
                } else {
                    paint_linear.setVisibility(View.GONE);
                    check = 1;
                }


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




