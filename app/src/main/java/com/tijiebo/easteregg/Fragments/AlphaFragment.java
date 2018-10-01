package com.tijiebo.easteregg.Fragments;

import android.animation.Animator;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;

public class AlphaFragment extends BaseFragment {

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        description.setText("Fade in/out");
        code.setText("animate().alpha(0)");
        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                egg.animate()
                        .alpha(0)
                        .setDuration(1000)
                        .setInterpolator(new AccelerateDecelerateInterpolator())
                        .setListener(new Animator.AnimatorListener() {
                            @Override
                            public void onAnimationStart(Animator animator) {

                            }

                            @Override
                            public void onAnimationEnd(Animator animator) {
                                click.setEnabled(true);
                                egg.animate().setStartDelay(1000).alpha(1);
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
        });
    }
}
