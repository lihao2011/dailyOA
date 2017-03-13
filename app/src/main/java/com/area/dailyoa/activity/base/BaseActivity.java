package com.area.dailyoa.activity.base;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import butterknife.ButterKnife;


/**
 * Created by Administrator on 2017/3/9.
 */

public abstract class BaseActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //用户在继承BaseActivity页面可以使用
        setContentView(getLayoutId());
        ButterKnife.bind(this);
        //初始化
        init();
    }

    /**
     * 这里用来返回res-->layout 里面布局
     */
    protected abstract int getLayoutId();

    public void init() {
    }
}
