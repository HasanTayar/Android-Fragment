package com.example.test.Fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.test.R;

public class third extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@Nullable LayoutInflater inflater , @Nullable ViewGroup container , @Nullable Bundle saved){
        View view =inflater.inflate(R.layout.third,container, false );

        return view;
    }
}
