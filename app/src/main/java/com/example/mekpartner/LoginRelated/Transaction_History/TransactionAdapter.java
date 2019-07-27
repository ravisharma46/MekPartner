package com.example.mekpartner.LoginRelated.Transaction_History;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.example.mekpartner.R;

import java.util.ArrayList;

public class TransactionAdapter extends RecyclerView.Adapter<TransactionAdapter.ViewHolder> {

    Context context;
    ArrayList<TransactionData> transactionDatalist;

    public TransactionAdapter(Context context, ArrayList<TransactionData> transactionDatalist) {
        this.context = context;
        this.transactionDatalist = transactionDatalist;
    }

    @NonNull
    @Override
    public TransactionAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.transaction_details_01_items, parent, false);
        return new TransactionAdapter.ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull TransactionAdapter.ViewHolder holder, int position) {

        TransactionData transactionData = transactionDatalist.get(position);

        holder.img.setImageResource(transactionData.getImg());
        holder.orderId.setText(transactionData.getOrderId());
        holder.orderDate.setText(transactionData.getOrderDate());
        holder.debitedFrom.setText(transactionData.getDebitedFrom());
        holder.amount.setText(transactionData.getAmount());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent transactionDetails_02 = new Intent(view.getContext(),Transaction_details_02.class);
                view.getContext().startActivity(transactionDetails_02);
            }
        });



    }




    @Override
    public int getItemCount() {
        return transactionDatalist.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final Context context;
        private TextView orderId, orderDate, amount, debitedFrom;
        private ImageView img;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            context = itemView.getContext();

            orderDate = itemView.findViewById(R.id.order_date);
            orderId  = itemView.findViewById(R.id.order_id);
            amount = itemView.findViewById(R.id.amount);
            debitedFrom = itemView.findViewById(R.id.debited_from);
            img = itemView.findViewById(R.id.imagefrom);
        }
    }
}
