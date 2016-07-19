package com.megliosolutions.pobail.Fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.megliosolutions.pobail.R;

/**
 * Created by Meglio on 7/12/16.
 */
public class HashTag extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tag,container,false);
        UpdateTitle();

        return view;
    }

    private void UpdateTitle() {

        //Set Title to Description
        getActivity().setTitle("Tags");

    }
}
