package com.example.mekpartner.mekcoins_wallet;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.mekpartner.R;

import java.util.Objects;

public class MekcoinsWalletActivity extends AppCompatActivity {

	String promocode="";
	String prevbtnId = "";
	int prevresId = -1;

	Toolbar toolbar;
	EditText etEnterPromoText;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_mekcoins_wallet);

		toolbar = findViewById(R.id.toolbar_widget);
		etEnterPromoText = findViewById(R.id.et_enter_promo_code);

		toolbar.setTitle("Mekcoins Wallet");
		toolbar.setTitleTextAppearance(getApplicationContext(), R.style.custom_toolbar_style);
		toolbar.setNavigationOnClickListener(view -> onBackPressed());

		Button statement = findViewById(R.id.btn_statement);

		statement.setOnClickListener(view -> {
			prevbtnId = "";
			prevresId = -1;
			replaceFragment(new FragmentMekcoinsWalletStatement());

		});

	}

	private void replaceFragment(FragmentMekcoinsWalletStatement fragmentMekcoinsWalletStatement) {
		FragmentManager fragmentManager = getSupportFragmentManager();
		FragmentTransaction transaction = fragmentManager.beginTransaction();
		transaction.replace(R.id.parent_liear_wallet_history, fragmentMekcoinsWalletStatement);
		transaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
		transaction.addToBackStack("statement");
		transaction.commit();
	}

	public void viewText(View view) {

		String btnId = getResources().getResourceEntryName(view.getId());
		String tvId = "tv" + btnId;
		int resId = getResources().getIdentifier(tvId, "id", getApplicationContext().getPackageName());

		if (prevbtnId.equals("")) {
			setVisibilityVisible(view, btnId, resId);
		} else if (prevbtnId.equals(btnId)) {
			setVisibilityGone();
		} else {
			setVisibilityGone();
			setVisibilityVisible(view, btnId, resId);
		}

	}

	private void setVisibilityVisible(View view, String btnId, int resId) {
		((Button) view).setCompoundDrawablesWithIntrinsicBounds(null, null, getDrawable(R.drawable.ic_key_arrow_down), null);
		TextView textView = findViewById(resId);
		textView.setVisibility(View.VISIBLE);
		prevbtnId = btnId;
		prevresId = resId;
	}

	private void setVisibilityGone() {
		Button prevbtn = findViewById(getResources().getIdentifier(prevbtnId, "id", getApplicationContext().getPackageName()));
		prevbtn.setCompoundDrawablesWithIntrinsicBounds(null, null, getDrawable(R.drawable.ic_key_arrow_right), null);
		TextView prevtextView = findViewById(prevresId);
		prevtextView.setVisibility(View.GONE);
		prevbtnId = "";
		prevresId = -1;
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();

		prevresId = -1;
		prevbtnId = "";
	}

	public void enterPromocode(View view) {
		final AlertDialog alertDialog = new AlertDialog.Builder(this).create();
		LayoutInflater layoutInflater = getLayoutInflater();
		View dialogView = layoutInflater.inflate(R.layout.dialog_wallet_promocode, null);
		final EditText promoText = dialogView.findViewById(R.id.et_promocode);
		Button applyPromo = dialogView.findViewById(R.id.btn_promo_apply);

		promocode = promoText.getText().toString();
		applyPromo.setOnClickListener(view1 -> alertDialog.dismiss());

		alertDialog.setView(dialogView);
		alertDialog.setCancelable(false);
		alertDialog.setOnKeyListener((arg0, keyCode, event) -> {
			if (keyCode == KeyEvent.KEYCODE_BACK) {
				alertDialog.dismiss();
			}
			return true;
		});
		alertDialog.show();
	}

	@SuppressLint("SetTextI18n")
	public void setPromoText(View view) {
		String btnId = getResources().getResourceEntryName(view.getId());
		if (Objects.equals(btnId, "btn_100")) {
			etEnterPromoText.setText("100");
		} else if (Objects.equals(btnId, "btn_200")) {
			etEnterPromoText.setText("200");
		} else {
			etEnterPromoText.setText("500");
		}
	}
}
