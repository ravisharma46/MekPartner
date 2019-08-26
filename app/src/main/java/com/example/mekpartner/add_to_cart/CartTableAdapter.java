package com.example.mekpartner.add_to_cart;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mekpartner.R;

import java.util.List;

public class CartTableAdapter extends RecyclerView.Adapter<CartTableAdapter.CartViewHolder> {

    private Context mCtx;
    public List<CartTable> mCartList;



    public CartTableAdapter(Context mCtx, List<CartTable> mCartList) {
        this.mCtx = mCtx;
        this.mCartList = mCartList;
    }



    @NonNull
    @Override
    public CartViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new CartViewHolder(LayoutInflater.from(mCtx).inflate(R.layout.row_cart,viewGroup,false));
    }

    @Override
    public void onBindViewHolder(@NonNull final CartViewHolder holder, int i) {

        final int subTotal = 500;

        holder.iv_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int count    = Integer.parseInt(holder.tv_count.getText().toString().trim());
                count++;
                holder.tv_count.setText(""+count);
                holder.tv_subTotal.setText(""+count*subTotal);

            }
        });

        holder.iv_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int count = Integer.parseInt(holder.tv_count.getText().toString().trim());
                if(count == 1)
                    return;
                count--;
                holder.tv_count.setText(""+count);
                holder.tv_subTotal.setText(""+count*subTotal);

            }
        });

    }

    @Override
    public int getItemCount() {
        return mCartList.size();
    }

    public class CartViewHolder extends RecyclerView.ViewHolder {
        ImageView iv_image, iv_plus, iv_minus;
        TextView tv_name, tv_size, tv_subTotal, tv_count;

        public CartViewHolder(@NonNull View itemView) {
            super(itemView);

            iv_image    = itemView.findViewById(R.id.product_image);
            iv_plus     = itemView.findViewById(R.id.plus);
            iv_minus    = itemView.findViewById(R.id.minus);
            tv_name     = itemView.findViewById(R.id.product_name);
            tv_size     = itemView.findViewById(R.id.size);
            tv_subTotal = itemView.findViewById(R.id.subtotal);
            tv_count    = itemView.findViewById(R.id.count);


        }
    }
}
