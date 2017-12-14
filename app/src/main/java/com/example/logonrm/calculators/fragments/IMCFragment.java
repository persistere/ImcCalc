package com.example.logonrm.calculators.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.example.logonrm.calculators.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class IMCFragment extends Fragment {


    public IMCFragment() {
        // Required empty public constructor
    }


    private EditText et_altura;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_imc, container, false);
        et_altura = (EditText) v.findViewById(R.id.et_altura);
        return v;
    }

}
