package com.epicodus.moneymanagement.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.epicodus.moneymanagement.R;

/**
 * Created by nataliyamiller on 11/29/15.
 */
public class InboxFragment extends android.support.v4.app.ListFragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_inbox, container, false);
        return rootView;
    }
}
