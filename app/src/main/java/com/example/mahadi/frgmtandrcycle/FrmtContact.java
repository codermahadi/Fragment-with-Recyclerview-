package com.example.mahadi.frgmtandrcycle;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Mahadi on 3/7/2018.
 */

public class FrmtContact extends Fragment {

    View v;
    public FrmtContact() {

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        v = inflater.inflate(R.layout.contact_frmt,container,false);
        return v;
    }
}
