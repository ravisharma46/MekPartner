package com.example.mekpartner.mekcoins_wallet;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mekpartner.R;
import com.example.mekpartner.mekcoins_wallet.adapter.MekcoinsWalletAdapter;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class FragmentMekcoinsWalletStatement extends Fragment {

	private RecyclerView wallethistoryview;
	private RecyclerView.Adapter wallethistoryadapter;
	private Toolbar toolbar;

	public FragmentMekcoinsWalletStatement() {
	}

	private List<MekcoinsWalletHistoryData> initData() {
		List<MekcoinsWalletHistoryData> list = new ArrayList<>();
		list.add(new MekcoinsWalletHistoryData("Money added", "yesterday, 10 Aug 2018", "10:30 am", "100.00"));
		list.add(new MekcoinsWalletHistoryData("Money deducted", "yesterday, 10 Aug 2018", "10:30 am", "10.00"));
		list.add(new MekcoinsWalletHistoryData("Money deducted", "yesterday, 10 Aug 2018", "10:30 am", "10.00"));
		list.add(new MekcoinsWalletHistoryData("Money deducted", "yesterday, 10 Aug 2018", "10:30 am", "10.00"));
		list.add(new MekcoinsWalletHistoryData("Money added", "9 Aug 2018", "10:30 am", "100.00"));
		list.add(new MekcoinsWalletHistoryData("Money deducted", "9 Aug 2018", "10:30 am", "10.00"));
		list.add(new MekcoinsWalletHistoryData("Money deducted", "9 Aug 2018", "10:30 am", "10.00"));
		list.add(new MekcoinsWalletHistoryData("Money deducted", "9 Aug 2018", "10:30 am", "10.00"));

		return list;
	}

	@Nullable
	@Override
	public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
		View v = inflater.inflate(R.layout.fragment_wallet_statement, container, false);

		List<MekcoinsWalletHistoryData> historyDataList = initData();

		toolbar = Objects.requireNonNull(getActivity()).findViewById(R.id.toolbar_widget);
		toolbar.setTitle("Mekcoins Statement");

		wallethistoryview = v.findViewById(R.id.wallet_history_recycler_view);

		wallethistoryview.hasFixedSize();
		wallethistoryview.setLayoutManager(new LinearLayoutManager(getActivity()));

		wallethistoryadapter = new MekcoinsWalletAdapter(historyDataList, getContext());
		wallethistoryview.setAdapter(wallethistoryadapter);

		return v;
	}

	@Override
	public void onDestroy() {
		super.onDestroy();
		toolbar.setTitle("Mekcoins Wallet");
	}
}
