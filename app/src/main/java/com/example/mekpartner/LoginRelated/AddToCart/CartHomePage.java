package com.example.vendorapp.AddToCart;


import android.content.Intent;
import android.graphics.Canvas;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import com.example.vendorapp.R;

import java.util.ArrayList;
import java.util.List;

public class CartHomePage extends AppCompatActivity {

    private final String TAG = getClass().getSimpleName();
    private List<CartTable> mCartList;
    private SwipeController swipeController = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart_home_page);

//        ((TextView)findViewById(R.id.toolbar_title)).setText("My Cart");

        mCartList = new ArrayList<>();

        fetchCartItem();

//        clickListener();



    }

//    private void clickListener() {
//
//        findViewById(R.id.back_btn).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                onBackPressed();
//            }
//        });
//
//        findViewById(R.id.continue_shopping).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                onBackPressed();
//            }
//        });
//
//        findViewById(R.id.proceed).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(CartHomePage.this, DateAndTimePage.class));
//            }
//        });
//    }

    private void fetchCartItem() {

        mCartList.add(new CartTable(1));
        mCartList.add(new CartTable(1));
        mCartList.add(new CartTable(1));
        mCartList.add(new CartTable(1));
        mCartList.add(new CartTable(1));
        mCartList.add(new CartTable(1));



        if(mCartList.size() == 0){
            findViewById(R.id.empty_cart).setVisibility(View.VISIBLE);
            findViewById(R.id.payment_layout).setVisibility(View.GONE);
        }
        else {
            findViewById(R.id.empty_cart).setVisibility(View.GONE);
            findViewById(R.id.payment_layout).setVisibility(View.VISIBLE);
        }

        RecyclerView recyclerView = findViewById(R.id.recycler_view_carts);
        recyclerView.setLayoutManager(new LinearLayoutManager(CartHomePage.this));
        final CartTableAdapter adapter = new CartTableAdapter(CartHomePage.this, mCartList);
        recyclerView.setAdapter(adapter);

        swipeController = new SwipeController(new SwipeControllerActions() {
            @Override
            public void onRightClicked(int position) {
                Log.e(TAG,"Right swiped");
                adapter.mCartList.remove(position);
                adapter.notifyItemRemoved(position);
                adapter.notifyItemRangeChanged(position, adapter.getItemCount());

                if(adapter.mCartList.size() == 0){
                    findViewById(R.id.empty_cart).setVisibility(View.VISIBLE);
                    findViewById(R.id.payment_layout).setVisibility(View.GONE);
                }
            }
        }, CartHomePage.this);

        ItemTouchHelper itemTouchhelper = new ItemTouchHelper(swipeController);
        itemTouchhelper.attachToRecyclerView(recyclerView);

        recyclerView.addItemDecoration(new RecyclerView.ItemDecoration() {
            @Override
            public void onDraw(Canvas c, RecyclerView parent, RecyclerView.State state) {
                swipeController.onDraw(c);
            }
        });
    }
}
