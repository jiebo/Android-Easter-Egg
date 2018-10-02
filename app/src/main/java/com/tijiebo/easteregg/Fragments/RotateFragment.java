package com.tijiebo.easteregg.Fragments;

import android.animation.Animator;
import android.view.View;
import android.view.animation.LinearInterpolator;

import com.tijiebo.easteregg.R;

public class RotateFragment extends BaseFragment {

    @Override
    protected View.OnClickListener getOnClickListener() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                egg.animate()
                        .rotation(360)
                        .setDuration(1000)
                        .setInterpolator(new LinearInterpolator())
                        .setListener(new Animator.AnimatorListener() {
                            @Override
                            public void onAnimationStart(Animator animator) {

                            }

                            @Override
                            public void onAnimationEnd(Animator animator) {
                                click.setEnabled(true);
                                egg.setRotation(0);
                            }

                            @Override
                            public void onAnimationCancel(Animator animator) {

                            }

                            @Override
                            public void onAnimationRepeat(Animator animator) {

                            }
                        });
                click.setEnabled(false);
            }
        };
    }

    @Override
    protected int getCodeStringRes() {
        return R.string.code_rotate;
    }

    @Override
    protected int getDescriptionStringRes() {
        return R.string.description_rotate;
    }
}
