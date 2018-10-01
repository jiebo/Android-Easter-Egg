package com.tijiebo.easteregg.Fragments;

import android.animation.Animator;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.TextView;

import com.tijiebo.easteregg.R;

public class RotateFragment extends Fragment {

    private View click;
    private TextView code;
    private View egg;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_rotate, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        click = view.findViewById(R.id.click_here_btn);
        code = view.findViewById(R.id.code);
        egg = view.findViewById(R.id.egg);

        code.setText("animate().rotation(360).setDuration(1000)");
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
