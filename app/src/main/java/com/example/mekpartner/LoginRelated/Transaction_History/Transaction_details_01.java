package com.example.mekpartner.LoginRelated.Transaction_History;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import com.example.mekpartner.R;

import java.util.ArrayList;

public class Transaction_details_01 extends AppCompatActivity {

    private RecyclerView mrecyclerView;
    private RecyclerView.Adapter madapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transaction_details_01);

        ArrayList<TransactionData> list = initCarData();
        mrecyclerView = findViewById(R.id.transaction_details_02_recyclerView);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        mrecyclerView.setLayoutManager(layoutManager);

        madapter = new TransactionAdapter(this,list);
        mrecyclerView.setAdapter(madapter);
    }

    private ArrayList<TransactionData> initCarData(){

        ArrayList<TransactionData> list = new ArrayList<>();

        list.add(new TransactionData("152290722651","28th July, 2018" ,"$3200","Debited From", R.drawable.wallet_xhdpi));
        list.add(new TransactionData("152290722651","28th July, 2018" ,"$3200","Debited From", R.drawable.mastercard_xhdpi));
        list.add(new TransactionData("152290722651","28th July, 2018" ,"$3200","Debited From", R.drawable.visa_xhdpi));
        list.add(new TransactionData("152290722651","28th July, 2018" ,"$3200","Paid through", R.drawable.paytm_xhdpi));
        list.add(new TransactionData("152290722651","28th July, 2018" ,"$3200","Paid through", R.drawable.payu_xhdpi));
        list.add(new TransactionData("152290722651","28th July, 2018" ,"$3200","Debited From", R.drawable.wallet_xhdpi));
        list.add(new TransactionData("152290722651","28th July, 2018" ,"$3200","Debited From", R.drawable.mastercard_xhdpi));


        return list;

    }


}
