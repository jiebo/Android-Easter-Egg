package com.tijiebo.easteregg.Fragments;

import android.app.AlertDialog;
import android.view.View;

import com.tijiebo.easteregg.R;

public class PopupFragment extends BaseFragment {

    @Override
    protected View.OnClickListener getOnClickListener() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new AlertDialog.Builder(getContext())
                        .setMessage("Greetings!")
                        .show();
            }
        };
    }

    @Override
    protected int getCodeStringRes() {
        return R.string.code_popup;
    }

    @Override
    protected int getDescriptionStringRes() {
        return R.string.description_popup;
    }
}
