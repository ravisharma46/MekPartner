package com.example.mekpartner.LoginRelated.SignUpandLoginFragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.mekpartner.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentLogin extends Fragment {

    private View mRootView;

    public FragmentLogin() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mRootView= inflater.inflate(R.layout.fragment_fragment_login, container, false);


        String mekpark ="<b><font color=#da1f26>mek</font><font color=#000000>Park</font></b>";
        mekpark = "&#160 "+mekpark;
        TextView tv_mekpark = mRootView.findViewById(R.id.logo);
        tv_mekpark.setText(Html.fromHtml(mekpark));

        clickListener();
        return mRootView;
    }

    private void clickListener() {

        mRootView.findViewById(R.id.login_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Fragment fragment = new FragmentPhone();
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction ft = fragmentManager.beginTransaction();
                ft.replace(R.id.fragment_container, fragment);
                ft.addToBackStack(null);
                ft.commit();
            }
        });

    }

}
