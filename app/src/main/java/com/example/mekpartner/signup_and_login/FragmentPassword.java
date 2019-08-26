package com.example.mekpartner.signup_and_login;


import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.mekpartner.R;
import com.example.mekpartner.nav_drawer.NavActivity;

import java.util.Objects;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentPassword extends Fragment {

    private final String TAG = "FragmentPassword";
    private View mRootView;
//    private ProgressDialog mProgressDialog;

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

        mRootView.findViewById(R.id.forgot_password).setOnClickListener(view -> replaceFragment(new FragmentOTP()));

    }

    private void replaceFragment(Fragment fragment){

        FragmentManager fragmentManager = Objects.requireNonNull(getActivity()).getSupportFragmentManager();
        FragmentTransaction ft = fragmentManager.beginTransaction();
        ft.replace(R.id.fragment_container, fragment);
        ft.addToBackStack("password");
        //ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        ft.commit();

    }

}
