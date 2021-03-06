package com.tijiebo.easteregg.Fragments;

import android.view.View;
import android.widget.Toast;

import com.tijiebo.easteregg.R;

public class ToastFragment extends BaseFragment {

    @Override
    protected View.OnClickListener getOnClickListener() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "Greetings!", Toast.LENGTH_LONG).show();
            }
        };
    }

    @Override
    protected int getCodeStringRes() {
        return R.string.code_toast;
    }

    @Override
    protected int getDescriptionStringRes() {
        return R.string.description_toast;
    }
}
