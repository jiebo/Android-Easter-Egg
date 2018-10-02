package com.tijiebo.easteregg.Fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Toast;

public class ToastFragment extends BaseFragment {
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        description.setText("Display a Toast");
        code.setText("Toast.makeText()");
        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "Greetings!", Toast.LENGTH_LONG).show();
            }
        });
    }
}
