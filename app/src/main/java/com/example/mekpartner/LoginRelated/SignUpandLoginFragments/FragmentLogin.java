package com.example.mekpartner.LoginRelated.SignUpandLoginFragments;


import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.mekpartner.LoginRelated.Help_And_Support.Faq_activity;
import com.example.mekpartner.R;

import java.util.Objects;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentLogin extends Fragment {

    private View mRootView;
    private TextView faq;

    public FragmentLogin() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mRootView= inflater.inflate(R.layout.fragment_fragment_login, container, false);

        faq = mRootView.findViewById(R.id.faq);

        faq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent faqIntent = new Intent(getActivity(), Faq_activity.class);
                startActivity(faqIntent);
            }
        });


        clickListener();
        return mRootView;
    }

    private void clickListener() {

        mRootView.findViewById(R.id.login_btn).setOnClickListener(v -> {

            Fragment fragment = new FragmentPhone();
            FragmentManager fragmentManager = Objects.requireNonNull(getActivity()).getSupportFragmentManager();
            FragmentTransaction ft = fragmentManager.beginTransaction();
            ft.replace(R.id.fragment_container, fragment);
            ft.addToBackStack(null);
            ft.commit();
        });

    }

}
