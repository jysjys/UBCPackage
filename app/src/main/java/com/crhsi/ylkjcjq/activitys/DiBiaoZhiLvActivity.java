package com.crhsi.ylkjcjq.activitys;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.crhsi.ylkjcjq.R;
import com.zhy.autolayout.AutoLayoutActivity;

public class DiBiaoZhiLvActivity extends AutoLayoutActivity implements View.OnClickListener {

    private ImageView img01, img02, img03, img04;
    private View btn01_bottom, btn02_bottom, btn03_bottom, btn04_bottom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_di_biao_zhi_lv);
        initView();
    }

    private void initView() {
        TextView tv_title = (TextView)findViewById(R.id.tv_title);
        tv_title.setText("地标之旅");
        img01 = (ImageView) findViewById(R.id.img01);
        img02 = (ImageView) findViewById(R.id.img02);
        img03 = (ImageView) findViewById(R.id.img03);
        img04 = (ImageView) findViewById(R.id.img04);
        btn01_bottom = (View) findViewById(R.id.btn01_bottom);
        btn02_bottom = (View) findViewById(R.id.btn02_bottom);
        btn03_bottom = (View) findViewById(R.id.btn03_bottom);
        btn04_bottom = (View) findViewById(R.id.btn04_bottom);
    }

    @Override
    public void onClick(View view) {
        hideall();
        switch (view.getId()) {
            case R.id.iv_close:
                finish();
                break;
            case R.id.btn01:
                img01.setVisibility(View.VISIBLE);
                btn01_bottom.setVisibility(View.VISIBLE);
                break;
            case R.id.btn02:
                img02.setVisibility(View.VISIBLE);
                btn02_bottom.setVisibility(View.VISIBLE);
                break;
            case R.id.btn03:
                img03.setVisibility(View.VISIBLE);
                btn03_bottom.setVisibility(View.VISIBLE);
                break;
            case R.id.btn04:
                img04.setVisibility(View.VISIBLE);
                btn04_bottom.setVisibility(View.VISIBLE);
                break;
        }
    }

    private void hideall(){
        img01.setVisibility(View.GONE);
        img02.setVisibility(View.GONE);
        img03.setVisibility(View.GONE);
        img04.setVisibility(View.GONE);
        btn01_bottom.setVisibility(View.INVISIBLE);
        btn02_bottom.setVisibility(View.INVISIBLE);
        btn03_bottom.setVisibility(View.INVISIBLE);
        btn04_bottom.setVisibility(View.INVISIBLE);
    }
}
