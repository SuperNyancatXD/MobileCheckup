package com.example.yuudachi.mobilecheckup;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Yuudachi on 8/31/2014.
 */
public class Checkup extends Fragment {
        public Checkup() {

        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {

            View rootView = inflater.inflate(R.layout.fragment_my_activity2, container, false);
            return rootView;
        }
}