package com.tijiebo.easteregg.Fragments;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.view.View;
import android.widget.Toast;

import com.tijiebo.easteregg.R;

public class ClipboardFragment extends BaseFragment {
    @Override
    protected View.OnClickListener getOnClickListener() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClipboardManager clipboard = (ClipboardManager) getContext().getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("easteregg", "Greetings!");
                clipboard.setPrimaryClip(clip);
                Toast.makeText(getContext(), "Text added to your clipboard", Toast.LENGTH_LONG).show();
            }
        };
    }

    @Override
    protected int getCodeStringRes() {
        return R.string.code_clipboard;
    }

    @Override
    protected int getDescriptionStringRes() {
        return R.string.description_clipboard;
    }
}
