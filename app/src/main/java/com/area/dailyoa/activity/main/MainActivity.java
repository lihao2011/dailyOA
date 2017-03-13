package com.area.dailyoa.activity.main;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.widget.ImageView;
import android.widget.TextView;

import com.area.dailyoa.R;
import com.area.dailyoa.activity.base.BaseActivity;
import com.area.dailyoa.widget.DragPointView;

import butterknife.Bind;
import butterknife.ButterKnife;


public class MainActivity extends BaseActivity {//AppCompatActivity


    @Bind(R.id.main_viewpager)
    ViewPager main_viewpager;
    //消息
    @Bind(R.id.tab_img_message)
    ImageView tab_img_message;
    @Bind(R.id.tab_text_message)
    TextView tab_text_message;
    @Bind(R.id.message_num)
    DragPointView message_num;
    //项目部
    @Bind(R.id.tab_img_project)
    ImageView tab_img_project;
    @Bind(R.id.tab_text_project)
    TextView tab_text_project;
    @Bind(R.id.project_red)
    ImageView project_red;
    //联系人
    @Bind(R.id.tab_img_contacts)
    ImageView tab_img_contacts;
    @Bind(R.id.tab_text_contacts)
    TextView tab_text_contacts;
    @Bind(R.id.contacts_num)
    DragPointView contacts_num;
    //我的
    @Bind(R.id.tab_img_me)
    ImageView tab_img_me;
    @Bind(R.id.tab_text_me)
    TextView tab_text_me;
    @Bind(R.id.mine_red)
    ImageView mine_red;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void init() {
        changeTextViewColor();
    }

    private void changeTextViewColor() {
        tab_img_message.setBackgroundDrawable(getResources().getDrawable(R.mipmap.ic_message_nomal));
        tab_img_project.setBackgroundDrawable(getResources().getDrawable(R.mipmap.ic_project_nomal));
        tab_img_contacts.setBackgroundDrawable(getResources().getDrawable(R.mipmap.ic_contact_normal));
        tab_img_me.setBackgroundDrawable(getResources().getDrawable(R.mipmap.ic_mine_normal));
        tab_text_message.setTextColor(Color.parseColor("#abadbb"));
        tab_text_project.setTextColor(Color.parseColor("#abadbb"));
        tab_text_contacts.setTextColor(Color.parseColor("#abadbb"));
        tab_text_me.setTextColor(Color.parseColor("#abadbb"));
    }
}
