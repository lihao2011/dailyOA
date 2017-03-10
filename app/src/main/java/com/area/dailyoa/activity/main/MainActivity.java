package com.area.dailyoa.activity.main;

import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.area.dailyoa.R;
import com.area.dailyoa.activity.base.BaseActivity;

import butterknife.Bind;

public class MainActivity extends BaseActivity {//AppCompatActivity

    @Bind(R.id.tv_text)
    TextView tvText;
    @Bind(R.id.activity_main)
    RelativeLayout activityMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
