package com.tijiebo.easteregg.Fragments;

import android.support.v4.content.ContextCompat;
import android.view.View;
import android.widget.ImageView;

import com.tijiebo.easteregg.R;

public class ReplaceFragment extends BaseFragment {
    @Override
    protected View.OnClickListener getOnClickListener() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (egg.isEnabled()) {
                    ((ImageView) egg).setImageResource(R.drawable.ic_launcher_foreground);
                    egg.setEnabled(false);
                } else {
                    ((ImageView) egg).setImageResource(R.drawable.easter_egg);
                    egg.setEnabled(true);
                }
            }
        };
    }

    @Override
    protected int getCodeStringRes() {
        return R.string.code_replace;
    }

    @Override
    protected int getDescriptionStringRes() {
        return R.string.description_replace;
    }
}
