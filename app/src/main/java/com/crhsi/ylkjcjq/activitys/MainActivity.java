package com.crhsi.ylkjcjq.activitys;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.widget.TextView;

import com.crhsi.ylkjcjq.fragments.HomeMain1Fragment;
import com.crhsi.ylkjcjq.fragments.HomeMain2Fragment;
import com.crhsi.ylkjcjq.R;
import com.crhsi.ylkjcjq.fragments.HomeMain3Fragment;
import com.crhsi.ylkjcjq.fragments.HomeMain4Fragment;
import com.crhsi.ylkjcjq.fragments.HomeMain5Fragment;
import com.crhsi.ylkjcjq.fragments.HomeMain6Fragment;
import com.zhy.autolayout.AutoLayoutActivity;

public class MainActivity extends AutoLayoutActivity implements View.OnClickListener {
    private FragmentManager fragmentManager;
    private FragmentTransaction transaction;
    private HomeMain1Fragment mHomeMain1Fragment;
    private HomeMain2Fragment mHomeMain2Fragment;
    private HomeMain3Fragment mHomeMain3Fragment;
    private HomeMain4Fragment mHomeMain4Fragment;
    private HomeMain5Fragment mHomeMain5Fragment;
    private HomeMain6Fragment mHomeMain6Fragment;
    private ImageView btn_tab1, btn_tab2, btn_tab3, btn_tab4, btn_tab5, btn_tab6;
    private TextView tv_tab1, tv_tab2, tv_tab3, tv_tab4, tv_tab5, tv_tab6;
    private FrameLayout fmpan;
    private LayoutInflater inflater;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

        fragmentManager = getSupportFragmentManager();
        transaction = fragmentManager.beginTransaction();
        mHomeMain1Fragment = new HomeMain1Fragment();
        transaction.replace(R.id.fragment_stub, mHomeMain1Fragment);
        transaction.commit();
    }

    private void initView() {
        inflater = (LayoutInflater) this
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        fmpan = (FrameLayout) findViewById(R.id.bottom);
        btn_tab1 = (ImageView) findViewById(R.id.btn_tab1);
        tv_tab1 = (TextView) findViewById(R.id.tv_tab1);

        btn_tab2 = (ImageView) findViewById(R.id.btn_tab2);
        tv_tab2 = (TextView) findViewById(R.id.tv_tab2);
        btn_tab3 = (ImageView) findViewById(R.id.btn_tab3);
        tv_tab3 = (TextView) findViewById(R.id.tv_tab3);
        btn_tab4 = (ImageView) findViewById(R.id.btn_tab4);
        tv_tab4 = (TextView) findViewById(R.id.tv_tab4);
        btn_tab5 = (ImageView) findViewById(R.id.btn_tab5);
        tv_tab5 = (TextView) findViewById(R.id.tv_tab5);

        btn_tab6 = (ImageView) findViewById(R.id.btn_tab6);
        tv_tab6 = (TextView) findViewById(R.id.tv_tab6);
        btn_tab1.setVisibility(View.VISIBLE);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.tab1:
                hidebtn();
                btn_tab1.setVisibility(View.VISIBLE);
                tv_tab1.setVisibility(View.VISIBLE);
                transaction = fragmentManager.beginTransaction();
                mHomeMain1Fragment = new HomeMain1Fragment();
                transaction.replace(R.id.fragment_stub, mHomeMain1Fragment);
                transaction.commit();
                break;
            case R.id.tab2:
//                btn_tab2.setVisibility(View.VISIBLE);
//                tv_tab2.setVisibility(View.VISIBLE);
                startActivity(new Intent(this, TrainTravelActivity.class));
                break;
            case R.id.tab3:
//                btn_tab3.setVisibility(View.VISIBLE);
//                tv_tab3.setVisibility(View.VISIBLE);
                startActivity(new Intent(this, HighSpeedCinemaActivity.class));
                break;
            case R.id.tab4:
                hidebtn();
                btn_tab4.setVisibility(View.VISIBLE);
                tv_tab4.setVisibility(View.VISIBLE);
//                transaction = fragmentManager.beginTransaction();
//                mHomeMain4Fragment = new HomeMain4Fragment();
//                transaction.replace(R.id.fragment_stub, mHomeMain4Fragment);
//                transaction.commit();
                break;
            case R.id.tab5:
                hidebtn();
                btn_tab5.setVisibility(View.VISIBLE);
                tv_tab5.setVisibility(View.VISIBLE);
//                transaction = fragmentManager.beginTransaction();
//                mHomeMain5Fragment = new HomeMain5Fragment();
//                transaction.replace(R.id.fragment_stub, mHomeMain5Fragment);
//                transaction.commit();
                break;
            case R.id.tab6:
                hidebtn();
                btn_tab6.setVisibility(View.VISIBLE);
                tv_tab6.setVisibility(View.VISIBLE);
//                transaction = fragmentManager.beginTransaction();
//                mHomeMain6Fragment = new HomeMain6Fragment();
//                transaction.replace(R.id.fragment_stub, mHomeMain6Fragment);
//                transaction.commit();
                break;
            default:

                break;
        }
    }

    private void hidebtn() {
        btn_tab1.setVisibility(View.GONE);
        tv_tab1.setVisibility(View.GONE);
        btn_tab2.setVisibility(View.GONE);
        tv_tab2.setVisibility(View.GONE);
        btn_tab3.setVisibility(View.GONE);
        tv_tab3.setVisibility(View.GONE);
        btn_tab4.setVisibility(View.GONE);
        tv_tab4.setVisibility(View.GONE);
        btn_tab5.setVisibility(View.GONE);
        tv_tab5.setVisibility(View.GONE);
        btn_tab6.setVisibility(View.GONE);
        tv_tab6.setVisibility(View.GONE);
    }

}

