package com.example.mekpartner.LoginRelated.Cart;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.mekpartner.LoginRelated.AddToCart.CartHomePage;
import com.example.mekpartner.LoginRelated.Services.RegularServicePartner.ServiceInProgress;
import com.example.mekpartner.R;

import java.util.Objects;

public class JobCartPartner extends AppCompatActivity {

    RecyclerView recyclerView;
    ListAdapter adapter;
    Button pay;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_job_cart_partner);

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


    }
}
