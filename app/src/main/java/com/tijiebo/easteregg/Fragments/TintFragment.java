package com.tijiebo.easteregg.Fragments;

import android.support.v4.content.ContextCompat;
import android.view.View;
import android.widget.ImageView;

import com.tijiebo.easteregg.R;

public class TintFragment extends BaseFragment {
    @Override
    protected View.OnClickListener getOnClickListener() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (egg.isEnabled()) {
                    ((ImageView) egg).setColorFilter(ContextCompat.getColor(getContext(), android.R.color.holo_green_light));
                    egg.setEnabled(false);
                } else {
                    ((ImageView) egg).clearColorFilter();
                    egg.setEnabled(true);
                }
            }
        };
    }

    @Override
    protected int getCodeStringRes() {
        return R.string.code_tint;
    }

    @Override
    protected int getDescriptionStringRes() {
        return R.string.description_tint;
    }
}
