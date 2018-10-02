package com.tijiebo.easteregg;

import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.StringRes;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.tijiebo.easteregg.Fragments.AlphaFragment;
import com.tijiebo.easteregg.Fragments.ClipboardFragment;
import com.tijiebo.easteregg.Fragments.PopupFragment;
import com.tijiebo.easteregg.Fragments.RotateFragment;
import com.tijiebo.easteregg.Fragments.ToastFragment;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private SectionsPagerAdapter mSectionsPagerAdapter;
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        for (EasterEggs easterEgg : EasterEggs.values()) {
            tabLayout.addTab(tabLayout.newTab().setText(easterEgg.mTitleRes));
        }

        mViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.addOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(mViewPager));

    }

    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        private List<Fragment> fragments;

        SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
            initialiseFragments();
        }

        private void initialiseFragments() {
            this.fragments = new ArrayList<>();
            fragments.add(new RotateFragment());
            fragments.add(new AlphaFragment());
            fragments.add(new ToastFragment());
            fragments.add(new PopupFragment());
            fragments.add(new ClipboardFragment());
        }

        @Override
        public Fragment getItem(int position) {
            return fragments.get(position);
        }

        @Override
        public int getCount() {
            return EasterEggs.values().length;
        }
    }

    public enum EasterEggs {
        ROTATE(R.string.title_rotate),
        ALPHA(R.string.title_alpha),
        TOAST(R.string.title_toast),
        POPUP(R.string.title_popup),
        CLIPBOARD(R.string.title_clipboard);

        private @StringRes
        int mTitleRes;

        EasterEggs(@StringRes int mTitleRes) {
            this.mTitleRes = mTitleRes;
        }
    }
}
