package com.example.mekpartner.LoginRelated.Help_And_Support;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import com.example.mekpartner.R;

public class Help_and_Support extends AppCompatActivity {

    LinearLayout Reschedule_my_booking ,Change_my_pickup_address, Change_my_drop_address, Cancel_my_order, Talk_to_the_support_team;
    private Button chat_with_us;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help_and__support);

        Reschedule_my_booking = findViewById(R.id.Reschedule_my_booking);
        Change_my_pickup_address = findViewById(R.id.Change_my_pickup_address);
        Change_my_drop_address = findViewById(R.id.Change_my_drop_address);
        Cancel_my_order = findViewById(R.id.Cancel_my_order);
        Talk_to_the_support_team = findViewById(R.id.Talk_to_the_support_team);

        chat_with_us = findViewById(R.id.chat_with_us);

        chat_with_us.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent chatIntent  = new Intent(Help_and_Support.this,Need_help.class);
                startActivity(chatIntent);
            }
        });


        //Action Bar
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#ffffff")));
        actionBar.setTitle(Html.fromHtml("<font color='#000000'>Help & Support</font>"));

        final Drawable upArrow =  ContextCompat.getDrawable(this, R.drawable.ic_keyboard_backspace_black_24dp);
        upArrow.setColorFilter(ContextCompat.getColor(this, R.color.chart_deep_red), PorterDuff.Mode.SRC_ATOP);
        getSupportActionBar().setHomeAsUpIndicator(upArrow);
    }
}
