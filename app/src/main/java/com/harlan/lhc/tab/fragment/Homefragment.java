package com.harlan.lhc.tab.fragment;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.harlan.lhc.tab.R;
import com.harlan.lhc.tab.tabhost.SlidingTabLayout;
import com.harlan.lhc.tab.tabhost.ViewPagerAdapter;

import butterknife.ButterKnife;


public class Homefragment extends Fragment {

    View view;
   // @Bind(R.id.sliding_tabs)
    SlidingTabLayout slidingTabs;
  //  @Bind(R.id.viewpager)
    ViewPager viewpager;
    private String[] titles = new String[]{"Sample Tab 1", "Sample Tab 2", "Sample Tab 3", "Sample Tab 4"
           };
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_homefragment, null);
        slidingTabs= (SlidingTabLayout) view.findViewById(R.id.sliding_tabs);
        viewpager= (ViewPager) view.findViewById(R.id.viewpager);
      //  ButterKnife.bind(this, view);
        viewpager.setAdapter(new ViewPagerAdapter(getFragmentManager(), titles));
        slidingTabs.setViewPager(viewpager);

        slidingTabs.setCustomTabColorizer(new SlidingTabLayout.TabColorizer() {
            @Override
            public int getIndicatorColor(int position) {

                return Color.RED;
            }
        });
        return view;
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }
}
