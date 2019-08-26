package com.example.mekpartner.cart;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import com.example.mekpartner.R;


public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ViewHolder>{
    private MyListData[] listdata;

    // RecyclerView recyclerView;
    public ListAdapter(MyListData[] listdata) {
        this.listdata = listdata;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem= layoutInflater.inflate(R.layout.general_frag_items, parent, false);
        ViewHolder viewHolder = new ViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final MyListData myListData = listdata[position];
        holder.imageView.setImageResource(listdata[position].getImgId());
        holder.imageView1.setImageResource(listdata[position].getImgId1());
        holder.frameLayout.setOnClickListener
                (view -> Toast.makeText(view.getContext(),"click on item: "+myListData.getDescription(),Toast.LENGTH_LONG).show());
    }


    @Override
    public int getItemCount() {
        return listdata.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        ImageView imageView1;
        TextView textView;
        public FrameLayout frameLayout;

        public ViewHolder(View itemView) {
            super(itemView);
            this.imageView = itemView.findViewById(R.id.service_image);
            this.textView =  itemView.findViewById(R.id.service_name);
            this.imageView1= itemView.findViewById(R.id.icon_job_card);
            frameLayout=itemView.findViewById(R.id.frameLayoutCart);
        }
    }
}