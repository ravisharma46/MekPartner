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

public class FaqAdapter extends RecyclerView.Adapter<FaqAdapter.ViewHolder> {

    private Context context;
    private ArrayList<FaqData> faqData;

    public FaqAdapter(Context context, ArrayList<FaqData> faqData) {
        this.context = context;
        this.faqData = faqData;
    }

    @NonNull
    @Override
    public FaqAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.faqitems, parent, false);
        return new FaqAdapter.ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull FaqAdapter.ViewHolder holder, int position) {

        final FaqData item = faqData.get(position);

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

                holder.mtextView.setTextSize(12);
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
        return faqData.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        public View view;
        public AppCompatTextView mtextView;

        public ViewHolder(@NonNull View view) {
            super(view);
            this.view = view;
            mtextView = view.findViewById(R.id.faqtext);
        }
    }
}
