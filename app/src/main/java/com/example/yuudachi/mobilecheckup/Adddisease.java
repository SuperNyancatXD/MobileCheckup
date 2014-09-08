package com.example.yuudachi.mobilecheckup;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Yuudachi on 8/31/2014.
 */
public class Adddisease extends Fragment {
    public Adddisease() {
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_my_activity5, container, false);
        rootView.setVisibility(rootView.INVISIBLE);
        return rootView;
    }
}
