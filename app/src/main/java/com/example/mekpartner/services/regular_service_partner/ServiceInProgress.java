package com.example.mekpartner.services.regular_service_partner;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.example.mekpartner.R;
import com.example.mekpartner.cart.JobCartPartner;
import com.example.mekpartner.customer_report.ViewCustomerReport;
import com.example.mekpartner.services.sos_sp.for_rest_service.CustomerDropOff;

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

        Toolbar toolbar = findViewById(R.id.service_toolbar_widget);
        toolbar.setNavigationOnClickListener(view -> onBackPressed());

        Bundle extras=getIntent().getExtras();
        String value;
        if(extras!=null){
            value=extras.getString("key");

            if(value.contains("RestService")){
                bt_serviceComplete.setOnClickListener(view -> startActivity(new
                        Intent(ServiceInProgress.this, PickupConfirm.class)));
            }
            if(value.contains("SosRest")){
                fl_addMoreProblem.setVisibility(View.GONE);
                bt_serviceComplete.setOnClickListener(view -> startActivity(new
                        Intent(ServiceInProgress.this, CustomerDropOff.class)));
            }

        }

        bt_viewReport.setOnClickListener(view -> startActivity(new
                Intent(ServiceInProgress.this, ViewCustomerReport.class)));

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

        fl_addMoreProblem.setOnClickListener(view -> startActivity(new
                Intent(ServiceInProgress.this, JobCartPartner.class)));
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId() == android.R.id.home) {
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