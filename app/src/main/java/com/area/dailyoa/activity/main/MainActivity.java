package com.area.dailyoa.activity.main;

import android.support.v4.view.ViewPager;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.area.dailyoa.R;
import com.area.dailyoa.activity.base.BaseActivity;

import butterknife.Bind;


public class MainActivity extends BaseActivity {//AppCompatActivity


    //viewpager
    @Bind(R.id.main_viewpager)
    ViewPager main_viewpager;
    //消息
    @Bind(R.id.rlyt_message)
    RelativeLayout rlyt_message;//Tab
    @Bind(R.id.tab_message)
    TextView tab_message;//文字图片
    @Bind(R.id.red_message)
    TextView red_message;//红点
    //项目部
    @Bind(R.id.rlyt_workgroup)
    RelativeLayout rlyt_workgroup;//Tab
    @Bind(R.id.tab_workgroup)
    TextView tab_workgroup;//文字图片
    @Bind(R.id.red_workgroup)
    ImageView red_workgroup;//红点
    //联系人
    @Bind(R.id.rlyt_contacts)
    RelativeLayout rlyt_contacts;//Tab
    @Bind(R.id.tab_contacts)
    TextView tab_contacts;//文字图片
    @Bind(R.id.red_contacts)
    TextView red_contacts;//红点
    //我的
    @Bind(R.id.rlyt_mine)
    RelativeLayout rlyt_mine;//Tab
    @Bind(R.id.tab_mine)
    TextView tab_mine;//文字图片
    @Bind(R.id.red_mine)
    ImageView red_mine;//红点

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void init() {
        changeTextViewColor();
    }

    private void changeTextViewColor() {

    }
}
