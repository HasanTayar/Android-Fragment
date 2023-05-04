package com.example.test.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.test.R;

public class second extends Fragment {
    @Nullable
    Button age;

    public View onCreateView(@Nullable LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle saved) {
        View view = inflater.inflate(R.layout.second, container, false);

        age = (Button) view.findViewById(R.id.calucate);
        EditText InputYear = (EditText) view.findViewById(R.id.date);
        TextView answer = (TextView) view.findViewById(R.id.answer);

        age.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int res = Integer.parseInt(InputYear.getText().toString());
                int result = 2023 - res;
                answer.setText(String.valueOf(result));
            }
        });

        return view;
    }
}
