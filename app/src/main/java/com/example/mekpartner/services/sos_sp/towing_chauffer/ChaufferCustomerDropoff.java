package com.example.mekpartner.services.sos_sp.towing_chauffer;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mekpartner.R;
import com.example.mekpartner.customer_report.ViewCustomerReport;
import com.example.mekpartner.services.sos_sp.for_rest_service.CustomerDropOff;

public class ChaufferCustomerDropoff extends AppCompatActivity {

    private LinearLayout paint_linear,navigation;
    private TextView tvDetails, date, time;
    private ImageView call;
    private Button report_show,drop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chauffer_customer_dropoff);

        paint_linear = findViewById(R.id.linear_paint_1);
        tvDetails = findViewById(R.id.tvDetails_1);

        report_show=findViewById(R.id.report_view);

        call = findViewById(R.id.call);
        drop=findViewById(R.id.bt_drop);
        navigation=findViewById(R.id.ll_navigation);

        drop.setOnClickListener(view -> {
            Intent i=new Intent(ChaufferCustomerDropoff.this, CustomerDropOff.class);
            i.putExtra("key","chauffer");
           startActivity(i);
        });

        navigation.setOnClickListener(view -> {
            //sendNavigateIntent(OnGoingBookingVendorDrop.this,28.717010,77.102364);
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

        call.setOnClickListener(view -> {
            Intent callIntent = new Intent(Intent.ACTION_DIAL);
            callIntent.setData(Uri.parse("tel:123456789"));
            startActivity(callIntent);
        });

        report_show.setOnClickListener(view -> startActivity(new
                Intent(ChaufferCustomerDropoff.this, ViewCustomerReport.class)));

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




