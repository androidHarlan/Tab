package com.harlan.lhc.tab.fragment.home;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.harlan.lhc.tab.R;
import com.isanwenyu.lazyfragment.BaseLazyFragment;


public class SampleFragment extends BaseLazyFragment {

    private static final String ARG_POSITION = "position";

    private int position;

    public static SampleFragment newInstance(int position) {
        SampleFragment f = new SampleFragment();
        Bundle b = new Bundle();
        b.putInt(ARG_POSITION, position);
        f.setArguments(b);
        return f;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        position = getArguments().getInt(ARG_POSITION);
        View rootView = inflater.inflate(R.layout.page, container, false);


        return rootView;
    }

    @Override
    public void onBeforeSetContentLayout() {

    }

    @Override
    public void init(Bundle savedInstanceState) {

    }

    @Override
    public void initView() {

    }

    @Override
    public void initData() {

    }

    @Override
    public int getLayoutId() {
        return 0;
    }

    @Override
    public void lazyData() {
        Log.e("backinfo","lazyData");
    }

    @Override
    public void onAutoRefresh() {
        Log.e("backinfo","onAutoRefresh");
        super.onAutoRefresh();
    }
}