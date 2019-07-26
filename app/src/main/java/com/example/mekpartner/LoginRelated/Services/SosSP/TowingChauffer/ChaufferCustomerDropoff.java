package com.example.mekpartner.LoginRelated.Services.SosSP.TowingChauffer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.mekpartner.LoginRelated.CustomerReport.ViewCustomerReport;
import com.example.mekpartner.LoginRelated.Services.SosSP.ForRestService.CustomerDropOff;
import com.example.mekpartner.R;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;

import java.util.HashMap;
import java.util.Map;

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


        drop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(ChaufferCustomerDropoff.this, CustomerDropOff.class);
                i.putExtra("key","chauffer");
               startActivity(i);
            }
        });



        navigation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //sendNavigateIntent(OnGoingBookingVendorDrop.this,28.717010,77.102364);
            }
        });





        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#ffffff")));
        getSupportActionBar().setTitle(Html.fromHtml("<font color='#000000'>#123</font>"));
        final Drawable upArrow = getResources().getDrawable(R.drawable.ic_keyboard_backspace_black_24dp);
        upArrow.setColorFilter(getResources().getColor(R.color.chart_deep_red), PorterDuff.Mode.SRC_ATOP);
        getSupportActionBar().setHomeAsUpIndicator(upArrow);


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

        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:123456789"));
                startActivity(callIntent);
            }
        });
        report_show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ChaufferCustomerDropoff.this, ViewCustomerReport.class));
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




