package com.example.pawel.scorecounter;


import android.app.DialogFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class AddCounterDialogFragment extends DialogFragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_add_counter, container, false);
        getDialog().setTitle(getResources().getString(R.string.add_counter_title));
        return rootView;
    }

}