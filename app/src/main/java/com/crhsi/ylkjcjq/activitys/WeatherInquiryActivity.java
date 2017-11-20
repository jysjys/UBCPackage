package com.crhsi.ylkjcjq.activitys;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.crhsi.ylkjcjq.R;
import com.zhy.autolayout.AutoLayoutActivity;

public class WeatherInquiryActivity extends AutoLayoutActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather_inquiry);
        initView();
    }

    private void initView() {
        TextView tv_title = (TextView) findViewById(R.id.tv_title);
        tv_title.setText("天气查询");
    }

    @Override
    public void onClick(View view) {
        finish();
    }
}
