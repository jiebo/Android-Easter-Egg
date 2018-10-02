package com.tijiebo.easteregg.Fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.StringRes;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.tijiebo.easteregg.R;

public abstract class BaseFragment extends Fragment {

    protected View click;
    protected View egg;
    protected TextView description;
    protected TextView code;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_with_egg, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        click = view.findViewById(R.id.click_here_btn);
        egg = view.findViewById(R.id.egg);
        description = view.findViewById(R.id.description);
        code = view.findViewById(R.id.code);

        click.setOnClickListener(getOnClickListener());
        description.setText(getDescriptionStringRes());
        code.setText(getCodeStringRes());
    }

    protected abstract View.OnClickListener getOnClickListener();

    protected abstract @StringRes int getCodeStringRes();

    protected abstract @StringRes int getDescriptionStringRes();
}
