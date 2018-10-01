package com.tijiebo.easteregg.Fragments;

import android.animation.Animator;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.animation.LinearInterpolator;

public class RotateFragment extends BaseFragment {

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        description.setText("Wanted to add this effect to one of our form icons. Don't forget to set the rotation back to 0");
        code.setText("animate().rotation(360)");
        click.setOnClickListener(new View.OnClickListener() {
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
        });
    }
}
