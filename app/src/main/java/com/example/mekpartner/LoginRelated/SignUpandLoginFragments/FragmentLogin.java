package com.example.mekpartner.LoginRelated.SignUpandLoginFragments;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mekpartner.R;

import java.util.Objects;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentLogin extends Fragment {

    private View mRootView;

    public FragmentLogin() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mRootView= inflater.inflate(R.layout.fragment_fragment_login, container, false);



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
