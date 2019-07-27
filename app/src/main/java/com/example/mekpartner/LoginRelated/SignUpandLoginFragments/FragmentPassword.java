package com.example.mekpartner.LoginRelated.SignUpandLoginFragments;


import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mekpartner.LoginRelated.NavDrawer.NavActivity;
import com.example.mekpartner.R;

import java.util.Objects;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentPassword extends Fragment {

    private final String TAG = "FragmentPassword";
    private View mRootView;
    private ProgressDialog mProgressDialog;

  //  private LoginSessionManager mLoginSession;



    public FragmentPassword() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        mRootView= inflater.inflate(R.layout.fragment_fragment_password, container, false);

//        String phone = getArguments().getString("phone");
//        Log.e(TAG,phone);
//
//        TextView tv_phone = mRootView.findViewById(R.id.phone_no);
//        tv_phone.setText(phone);
//
//        mLoginSession = new LoginSessionManager(getActivity());
//
//        mProgressDialog = new ProgressDialog(getActivity());
//        mProgressDialog.setMessage("Please wait...");
//        mProgressDialog.setCancelable(false);

        clickListener();
        return mRootView;

    }
    private void clickListener() {

        mRootView.findViewById(R.id.back_btn).setOnClickListener(v -> Objects.requireNonNull(getActivity()).onBackPressed());

        mRootView.findViewById(R.id.login_to_app).setOnClickListener(v -> {

//                TextView tv_pass = mRootView.findViewById(R.id.password);
//                String pass = tv_pass.getText().toString().trim();
//
//                if(pass.length()==0){
//                    Toast.makeText(getActivity(),"Enter password",Toast.LENGTH_SHORT).show();
//                    return;
//                }
//
//                TextView tv_phone = mRootView.findViewById(R.id.phone_no);
//                String phone = tv_phone.getText().toString().trim();
            //loginToApp(phone,pass);

            startActivity(new Intent(getActivity(), NavActivity.class));
            Objects.requireNonNull(getActivity()).finish();
        });



    }

}
