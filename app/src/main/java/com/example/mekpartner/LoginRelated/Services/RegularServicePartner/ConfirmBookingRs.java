package com.example.mekpartner.LoginRelated.Services.RegularServicePartner;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Html;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;

import com.example.mekpartner.R;
import com.tooltip.Tooltip;

import java.util.Objects;

public class ConfirmBookingRs extends AppCompatActivity {

    private  ImageView fourthButton;
    private int toggle;
    private Tooltip tooltip;
    private LinearLayout ll_availdelivery;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm_booking_rs);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#ffffff")));
        getSupportActionBar().setTitle(Html.fromHtml("<font color='#000000'>New Booking</font>"));
        final Drawable upArrow = getResources().getDrawable(R.drawable.ic_keyboard_backspace_black_24dp);
        upArrow.setColorFilter(getResources().getColor(R.color.chart_deep_red), PorterDuff.Mode.SRC_ATOP);
        getSupportActionBar().setHomeAsUpIndicator(upArrow);

        ll_availdelivery=findViewById(R.id.ll_availdelivery);


        Bundle extras= getIntent().getExtras();
        if(extras!=null){
            String value= extras.getString("key");
            if(value.contains("chauffer")){
                ll_availdelivery.setVisibility(View.GONE);
            }
        }



    }

    public void onAcceptButtonClick(View view) {
        // inflate the layout of the popup window
        LayoutInflater inflater = (LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE);
        View popupView = Objects.requireNonNull(inflater).inflate(R.layout.popup_window, null);


        //popupView.setBackgroundDrawable(new ColorDrawable(Color.WHITE));
        popupView.setElevation(10);


        // create the popup window
        int width = LinearLayout.LayoutParams.WRAP_CONTENT;
        int height = LinearLayout.LayoutParams.WRAP_CONTENT;
        boolean focusable = true; // lets taps outside the popup also dismiss it
        final PopupWindow popupWindow = new PopupWindow(popupView, width, height, focusable);

        // show the popup window
        // which view you pass in doesn't matter, it is only used for the window tolken
        popupWindow.showAtLocation(view, Gravity.CENTER, 0, 0);

        // dismiss the popup window when touched
        popupView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                popupWindow.dismiss();
                return true;
            }
        });
    }


    public void infoButton(View view) {
        if (toggle == 0) {
            tooltip = new Tooltip.Builder(view)
                    .setText(Html.fromHtml(getString(R.string.popup)))
                    .setBackgroundColor(Color.WHITE)
                    .setCornerRadius(3f)
                    .setMargin(20f)
                    .show();
            toggle = 1;
        } else {
            tooltip.dismiss();
            toggle = 0;
        }
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
