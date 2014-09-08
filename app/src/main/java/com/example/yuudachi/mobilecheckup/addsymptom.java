package com.example.yuudachi.mobilecheckup;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Yuudachi on 8/31/2014.
 */
public class addsymptom extends Fragment {
    public addsymptom() {
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_my_activity3, container, false);
        rootView.setVisibility(rootView.INVISIBLE);
        return rootView;
    }
}
