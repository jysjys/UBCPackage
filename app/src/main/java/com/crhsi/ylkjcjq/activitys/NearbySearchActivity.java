package com.crhsi.ylkjcjq.activitys;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.crhsi.ylkjcjq.R;
import com.crhsi.ylkjcjq.views.CommonPopuWindow;
import com.zhy.autolayout.AutoLayoutActivity;

import es.dmoral.toasty.Toasty;

public class NearbySearchActivity extends AutoLayoutActivity implements View.OnClickListener {

    private View tab1_line, tab2_line,tab3,tab4;
    private TextView tvtab4,tvtab3;
    private ImageView dibioazhilv,dibioazhilv1,dibioazhilv2,dibioazhilv3,dibioazhilv4,dibioazhilv5,dibioazhilv6;

    private int isinit = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nearby_search);
        initView();
        initPopup();
    }

    private void initView() {
        TextView tv_title = (TextView) findViewById(R.id.tv_title);
        tab1_line = (View) findViewById(R.id.tab1_line);
        tab2_line = (View) findViewById(R.id.tab2_line);
        tab3 = (View) findViewById(R.id.tab3);
        tab4 = (View) findViewById(R.id.tab4);
        tvtab3 = (TextView) findViewById(R.id.tvtab3);
        tvtab4 = (TextView) findViewById(R.id.tvtab4);

        dibioazhilv = (ImageView) findViewById(R.id.dibioazhilv);
        dibioazhilv1 = (ImageView) findViewById(R.id.dibioazhilv1);
        dibioazhilv2 = (ImageView) findViewById(R.id.dibioazhilv2);
        dibioazhilv3 = (ImageView) findViewById(R.id.dibioazhilv3);
        dibioazhilv4 = (ImageView) findViewById(R.id.dibioazhilv4);
        dibioazhilv5 = (ImageView) findViewById(R.id.dibioazhilv5);
        dibioazhilv6 = (ImageView) findViewById(R.id.dibioazhilv6);
        tv_title.setText("北京");
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.iv_close:
                finish();
                break;
            case R.id.tab1:
                tab1_line.setVisibility(View.VISIBLE);
                tab2_line.setVisibility(View.INVISIBLE);
                isinit++;
                changeback();
                break;
            case R.id.tab2:
                tab1_line.setVisibility(View.INVISIBLE);
                tab2_line.setVisibility(View.VISIBLE);
                isinit++;
                changeback();
                break;
            case R.id.tab3:
                if (mSmsMorePopup.isShowing()) {
                    mSmsMorePopup.dismiss();// 关闭
                }
                mSmsMorePopup.showAsDropDown(tab3);
                break;
            case R.id.tab4:
                if (mSmsMorePopup2.isShowing()) {
                    mSmsMorePopup2.dismiss();// 关闭
                }
                mSmsMorePopup2.showAsDropDown(tab4);
                break;
            case R.id.dibioazhilv:
            case R.id.dibioazhilv1:
            case R.id.dibioazhilv2:
            case R.id.dibioazhilv3:
            case R.id.dibioazhilv4:
            case R.id.dibioazhilv5:
            case R.id.dibioazhilv6:
                if(isinit%2 != 1){
                    startActivity(new Intent(this, DiBiaoZhiLvActivity.class));
                }else {
                    startActivity(new Intent(this, DiBiaoZhiLv2Activity.class));
                }

                break;
        }
    }

    private CommonPopuWindow mSmsMorePopup,mSmsMorePopup2;

    private void initPopup() {
        mSmsMorePopup = new CommonPopuWindow(this, new CommonPopuWindow.ItemClickCallBack() {

                    @Override
                    public void callBack(final int position) {
                        new Handler().post(new Runnable() {
                            @Override
                            public void run() {
                                tvtab3.setText(getResources().getStringArray(R.array.messagePopuWindowmore)[position]);
                                mSmsMorePopup.dismiss();
                                isinit++;
                                changeback();
                            }
                        });
                    }
                });
        mSmsMorePopup.initData(R.array.messagePopuWindowmore);

        mSmsMorePopup2 = new CommonPopuWindow(this, new CommonPopuWindow.ItemClickCallBack() {

            @Override
            public void callBack(final int position) {
                new Handler().post(new Runnable() {
                    @Override
                    public void run() {
                        tvtab4.setText(getResources().getStringArray(R.array.messagePopuWindowmore2)[position]);
                        mSmsMorePopup2.dismiss();
                        isinit++;
                        changeback();
                    }
                });
            }
        });
        mSmsMorePopup2.initData(R.array.messagePopuWindowmore2);
    }

    private void changeback(){
        if(isinit%2 != 1){
            dibioazhilv.setBackgroundResource(R.mipmap.lvyouicon);
            dibioazhilv1.setBackgroundResource(R.mipmap.lvyouicon2);
            dibioazhilv2.setBackgroundResource(R.mipmap.lvyouicon);
            dibioazhilv3.setBackgroundResource(R.mipmap.lvyouicon2);
            dibioazhilv4.setBackgroundResource(R.mipmap.lvyouicon);
            dibioazhilv5.setBackgroundResource(R.mipmap.lvyouicon2);
            dibioazhilv6.setBackgroundResource(R.mipmap.lvyouicon);
        }else {
            dibioazhilv.setBackgroundResource(R.mipmap.sheying01);
            dibioazhilv1.setBackgroundResource(R.mipmap.sheying02);
            dibioazhilv2.setBackgroundResource(R.mipmap.sheying01);
            dibioazhilv3.setBackgroundResource(R.mipmap.sheying02);
            dibioazhilv4.setBackgroundResource(R.mipmap.sheying01);
            dibioazhilv5.setBackgroundResource(R.mipmap.sheying02);
            dibioazhilv6.setBackgroundResource(R.mipmap.sheying01);
        }
    }

}
