package com.example.mekpartner.help_and_support;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Html;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import com.example.mekpartner.R;

public class Mek_Legel_Activity extends AppCompatActivity {

    private TextView txtdisclaimer, terms_and_conditions, terms_of_use, privacy_policy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mek__legel_);

        txtdisclaimer = findViewById(R.id.disclaimer);
        terms_and_conditions = findViewById(R.id.terms_and_conditions);
        terms_of_use = findViewById(R.id.terms_of_use);
        privacy_policy = findViewById(R.id.privacy_policy);

        txtdisclaimer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent disclaimIntent = new Intent(Mek_Legel_Activity.this, Disclaimer.class);
                startActivity(disclaimIntent);
            }
        });

        terms_and_conditions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent disclaimIntent = new Intent(Mek_Legel_Activity.this, Terms_and_Conditions.class);
                startActivity(disclaimIntent);
            }
        });

        terms_of_use.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent disclaimIntent = new Intent(Mek_Legel_Activity.this, Terms_Of_Use.class);
                startActivity(disclaimIntent);
            }
        });

        privacy_policy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent disclaimIntent = new Intent(Mek_Legel_Activity.this, Privacy_policy.class);
                startActivity(disclaimIntent);
            }
        });


        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#ffffff")));
        actionBar.setTitle(Html.fromHtml("<font color='#000000'>Order #123</font>"));

        final Drawable upArrow = ContextCompat.getDrawable(this, R.drawable.ic_keyboard_backspace_black_24dp);
        upArrow.setColorFilter(ContextCompat.getColor(this, R.color.chart_deep_red), PorterDuff.Mode.SRC_ATOP);
        getSupportActionBar().setHomeAsUpIndicator(upArrow);
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
