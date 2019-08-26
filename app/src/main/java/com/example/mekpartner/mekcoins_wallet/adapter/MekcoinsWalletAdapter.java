package com.example.mekpartner.mekcoins_wallet.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mekpartner.R;
import com.example.mekpartner.mekcoins_wallet.MekcoinsWalletHistoryData;

import java.util.List;

public class MekcoinsWalletAdapter extends RecyclerView.Adapter<MekcoinsWalletAdapter.ViewHolder> {

	private List<MekcoinsWalletHistoryData> historyDataList;
	private String tmpdata = "";

	private Context context;

	public MekcoinsWalletAdapter(List<MekcoinsWalletHistoryData> historyDataList, Context context) {
		this.historyDataList = historyDataList;
		this.context = context;
	}


	@NonNull
	@Override
	public MekcoinsWalletAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
		View v = LayoutInflater.from(parent.getContext()).
				inflate(R.layout.mekcoins_wallet_history_content, parent, false);
		return new MekcoinsWalletAdapter.ViewHolder(v);
	}

	@Override
	public void onBindViewHolder(@NonNull MekcoinsWalletAdapter.ViewHolder holder, int position) {
		final MekcoinsWalletHistoryData data = historyDataList.get(position);

		if (data.getDate().equalsIgnoreCase(tmpdata)) {
			tmpdata = data.getDate();
			holder.tvdate.setVisibility(View.GONE);
			holder.tvevent.setText(data.getEvent());
			holder.tvtime.setText(data.getTime());
			holder.tvamount.setText("\u20B9" + data.getAmount());

			if (data.getEvent().equalsIgnoreCase("money added")) {
				holder.ivevent.setImageResource(R.drawable.money_added);
				holder.tvamount.setTextColor(context.getColor(R.color.mek_red));
			} else {
				holder.ivevent.setImageResource(R.drawable.money_deducted);
			}
		} else {
			tmpdata = data.getDate();
			holder.tvdate.setVisibility(View.VISIBLE);
			holder.tvevent.setText(data.getEvent());
			holder.tvtime.setText(data.getTime());
			holder.tvdate.setText(data.getDate());
			holder.tvamount.setText("\u20B9" + data.getAmount());

			if (data.getEvent().equalsIgnoreCase("money added")) {
				holder.ivevent.setImageResource(R.drawable.money_added);
				holder.tvamount.setTextColor(context.getColor(R.color.mek_red));
			} else {
				holder.ivevent.setImageResource(R.drawable.money_deducted);
			}
		}

	}

	@Override
	public int getItemCount() {
		if (historyDataList != null) {
			return historyDataList.size();
		} else {
			return 0;
		}
	}

	class ViewHolder extends RecyclerView.ViewHolder {

		TextView tvevent, tvtime, tvamount, tvdate;
		ImageView ivevent;

		ViewHolder(@NonNull View itemView) {
			super(itemView);

			tvevent = itemView.findViewById(R.id.tv_wallet_history_event);
			tvdate = itemView.findViewById(R.id.tv_wallet_history_date);
			tvtime = itemView.findViewById(R.id.tv_wallet_history_time);
			tvamount = itemView.findViewById(R.id.tv_wallet_history_amount);
			ivevent = itemView.findViewById(R.id.iv_wallet_history_image);
		}
	}

}
