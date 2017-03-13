package com.area.dailyoa.activity.guide;

import android.os.Build;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.area.dailyoa.R;
import com.area.dailyoa.activity.base.BaseActivity;

import java.util.ArrayList;
import java.util.List;

/**
 * class desc: 引导界面
 * Created by Administrator on 2017/3/13.
 */

public class GuideActivity extends BaseActivity implements ViewPager.OnPageChangeListener {

    private ViewPager vp;
    private ViewPagerAdapter vpAdapter;
    private List<View> views;

    // 底部小点图片
    private ImageView[] dots;

    // 记录当前选中位置
    private int currentIndex;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_guide;
    }

    @Override
    public void init() {
        if (Build.VERSION.SDK_INT > 16) {
            getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                    | View.SYSTEM_UI_LAYOUT_FLAGS | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                    | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION);
            getWindow().getDecorView().setFitsSystemWindows(true);
        }
        // 初始化页面
        initViews();
    }

    private void initViews() {
        LayoutInflater inflater = LayoutInflater.from(this);

        views = new ArrayList<View>();
        // 初始化引导图片列表
        views.add(inflater.inflate(R.layout.layout_what_new_one, null));
        views.add(inflater.inflate(R.layout.layout_what_new_two, null));
        views.add(inflater.inflate(R.layout.layout_what_new_three, null));

        // 初始化Adapter
        vpAdapter = new ViewPagerAdapter(views, this);

        vp = (ViewPager) findViewById(R.id.viewpager);
        vp.setAdapter(vpAdapter);
        // 绑定回调
        vp.setOnPageChangeListener(this);
    }

    // 当滑动状态改变时调用
    @Override
    public void onPageScrollStateChanged(int arg0) {
    }

    // 当当前页面被滑动时调用
    @Override
    public void onPageScrolled(int arg0, float arg1, int arg2) {

    }

    // 当新的页面被选中时调用
    @Override
    public void onPageSelected(int arg0) {

    }
}
