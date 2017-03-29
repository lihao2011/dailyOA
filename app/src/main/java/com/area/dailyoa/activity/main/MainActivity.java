package com.area.dailyoa.activity.main;

import com.area.dailyoa.R;
import com.area.dailyoa.activity.base.BaseActivity;



public class MainActivity extends BaseActivity {//AppCompatActivity


//    @Bind(R.id.main_viewpager)
//    ViewPager main_viewpager;
    //消息
//    @Bind(R.id.tab_img_message)
//    ImageView tab_img_message;
//    @Bind(R.id.tab_text_message)
//    TextView tab_text_message;
//    @Bind(R.id.message_num)
//    DragPointView message_num;
//    //项目部
//    @Bind(R.id.tab_img_project)
//    ImageView tab_img_project;
//    @Bind(R.id.tab_text_project)
//    TextView tab_text_project;
//    @Bind(R.id.project_red)
//    ImageView project_red;
//    //联系人
//    @Bind(R.id.tab_img_contacts)
//    ImageView tab_img_contacts;
//    @Bind(R.id.tab_text_contacts)
//    TextView tab_text_contacts;
//    @Bind(R.id.contacts_num)
//    DragPointView contacts_num;
//    //我的
//    @Bind(R.id.tab_img_me)
//    ImageView tab_img_me;
//    @Bind(R.id.tab_text_me)
//    TextView tab_text_me;
//    @Bind(R.id.mine_red)
//    ImageView mine_red;

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
