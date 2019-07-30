package com.example.mekpartner.LoginRelated.Help_And_Support;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mekpartner.R;

import java.util.ArrayList;

public class General_queries_adapter extends RecyclerView.Adapter<General_queries_adapter.ViewHolder> {

    private Context context;
    private ArrayList<General_Queeries_data> queeriesData;

    public General_queries_adapter(Context context, ArrayList<General_Queeries_data> queeriesData) {
        this.context = context;
        this.queeriesData = queeriesData;
    }

    @NonNull
    @Override
    public General_queries_adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.queries_item, parent, false);
        return new General_queries_adapter.ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull General_queries_adapter.ViewHolder holder, int position) {

        final General_Queeries_data item = queeriesData.get(position);

        final Typeface fontHeading = ResourcesCompat.getFont(context,R.font.gotham_medium_regular);
        final Typeface fontnormal = ResourcesCompat.getFont(context,R.font.montserrat_regular);

        if (item != null)
        {
            if(item.getId().equals(1)){

                holder.mtextView.setTextColor(Color.BLACK);
                holder.mtextView.setPadding(0,24,0,24);
                holder.mtextView.setTypeface(holder.mtextView.getTypeface(), Typeface.BOLD);
                holder.mtextView.setTypeface(fontHeading);
                holder.mtextView.setTextSize(20);
                holder.mtextView.setText(item.getmString());

            }

            else if(item.getId().equals(2) ){

                holder.mtextView.setTextSize(14);
                holder.mtextView.setTextColor(Color.BLACK);
                holder.mtextView.setPadding(8,0,0,0);
                holder.mtextView.setTypeface(fontHeading);
                holder.mtextView.setText(item.getmString());

            }

            else if(item.getId().equals(3) ){

                holder.mtextView.setTextSize(12);
                holder.mtextView.setTextColor(Color.BLACK);
                holder.mtextView.setPadding(8,0,0,0);
                holder.mtextView.setTypeface(fontnormal);
                holder.mtextView.setText(item.getmString());

            }

        }
        else {

        }
    }

    @Override
    public int getItemCount() {
        return queeriesData.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        public View view;
        public AppCompatTextView mtextView;

        public ViewHolder(@NonNull View view) {
            super(view);
            this.view = view;
            mtextView = view.findViewById(R.id.txtQueries);
        }
    }
}
