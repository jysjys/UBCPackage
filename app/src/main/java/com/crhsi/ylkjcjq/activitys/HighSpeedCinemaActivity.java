package com.crhsi.ylkjcjq.activitys;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import com.crhsi.ylkjcjq.R;
import com.crhsi.ylkjcjq.fragments.Film01Fragment;
import com.crhsi.ylkjcjq.fragments.Film02Fragment;
import com.crhsi.ylkjcjq.fragments.Film03Fragment;
import com.crhsi.ylkjcjq.fragments.Film04Fragment;
import com.zhy.autolayout.AutoLayoutActivity;

//高铁院线
public class HighSpeedCinemaActivity extends AutoLayoutActivity implements View.OnClickListener {

    private FragmentManager fragmentManager;
    private FragmentTransaction transaction;
    private Film01Fragment mFilm01Fragment;
    private Film02Fragment mFilm02Fragment;
    private Film03Fragment mFilm03Fragment;
    private Film04Fragment mFilm04Fragment;
    private ImageView btn_tab1, btn_tab2, btn_tab3, btn_tab4, searchImg;
    private TextView jijiangshangying, yuanxianreying, tv_title;
    private View yuanxianreying_line, jijiangshangying_line;
    private FrameLayout tab1,tab2,tab3,tab4;

    private static HighSpeedCinemaActivity mHighSpeedCinemaActivity = null;
    public static HighSpeedCinemaActivity getInstass(){
        return mHighSpeedCinemaActivity;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_high_speed_cinema);
        initView();
        mHighSpeedCinemaActivity = this;
        fragmentManager = getSupportFragmentManager();
        transaction = fragmentManager.beginTransaction();
        mFilm01Fragment = new Film01Fragment();
        transaction.replace(R.id.fragment_stub, mFilm01Fragment);
        transaction.commit();
    }

    private void initView() {
        btn_tab1 = (ImageView) findViewById(R.id.btn_tab1);
        btn_tab2 = (ImageView) findViewById(R.id.btn_tab2);
        btn_tab3 = (ImageView) findViewById(R.id.btn_tab3);
        btn_tab4 = (ImageView) findViewById(R.id.btn_tab4);
        searchImg = (ImageView) findViewById(R.id.searchImg);

        jijiangshangying = (TextView) findViewById(R.id.jijiangshangying);
        yuanxianreying = (TextView) findViewById(R.id.yuanxianreying);
        tv_title = (TextView) findViewById(R.id.tv_title);

        yuanxianreying_line = (View) findViewById(R.id.yuanxianreying_line);
        jijiangshangying_line = (View) findViewById(R.id.jijiangshangying_line);

        tab1 = (FrameLayout) findViewById(R.id.tab1);
        tab2 = (FrameLayout) findViewById(R.id.tab2);
        tab3 = (FrameLayout) findViewById(R.id.tab3);
        tab4 = (FrameLayout) findViewById(R.id.tab4);
    }

    public void changeTab(String tab){
        if(tab.equals("tab3")){
            onClick(tab3);
        }else{
            onClick(tab4);
        }
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tab1:
                hide();
                changeTitle(01);
                btn_tab1.setVisibility(View.VISIBLE);
                mFilm01Fragment = new Film01Fragment();
                transaction = fragmentManager.beginTransaction();
                transaction.replace(R.id.fragment_stub, mFilm01Fragment);
                transaction.commit();
                break;
            case R.id.tab2:
                hide();
                changeTitle(02);
                btn_tab2.setVisibility(View.VISIBLE);
                mFilm02Fragment = new Film02Fragment();
                transaction = fragmentManager.beginTransaction();
                transaction.replace(R.id.fragment_stub, mFilm02Fragment);
                transaction.commit();
                break;
            case R.id.tab3:
                hide();
                changeTitle(03);
                btn_tab3.setVisibility(View.VISIBLE);
                mFilm03Fragment = new Film03Fragment();
                transaction = fragmentManager.beginTransaction();
                transaction.replace(R.id.fragment_stub, mFilm03Fragment);
                transaction.commit();
                break;
            case R.id.tab4:
                hide();
                changeTitle(04);
                btn_tab4.setVisibility(View.VISIBLE);
                mFilm04Fragment = new Film04Fragment();
                transaction = fragmentManager.beginTransaction();
                transaction.replace(R.id.fragment_stub, mFilm04Fragment);
                transaction.commit();
                break;
            case R.id.yuanxianreying:
                yuanxianreying_line.setVisibility(View.VISIBLE);
                jijiangshangying_line.setVisibility(View.INVISIBLE);
                yuanxianreying.setTextColor(getResources().getColor(R.color.fontRedColor));
                jijiangshangying.setTextColor(getResources().getColor(R.color.black));
                break;
            case R.id.jijiangshangying:
                yuanxianreying_line.setVisibility(View.INVISIBLE);
                jijiangshangying_line.setVisibility(View.VISIBLE);
                jijiangshangying.setTextColor(getResources().getColor(R.color.fontRedColor));
                yuanxianreying.setTextColor(getResources().getColor(R.color.black));
                break;
            case R.id.iv_close:
                finish();
                break;
        }
    }

    private void changeTitle(int title) {
        hideTitle();
        switch (title) {
            case 01:
                tv_title.setText("高铁院线");
                break;
            case 02:
                showCenterTitle();
                break;
            case 03:
                tv_title.setText("毒舌辣评");
                break;
            case 04:
                tv_title.setText("佳片观赏");
                break;
        }

    }

    private void showCenterTitle() {
        tv_title.setVisibility(View.GONE);
        searchImg.setVisibility(View.VISIBLE);
        jijiangshangying.setVisibility(View.VISIBLE);
        yuanxianreying.setVisibility(View.VISIBLE);
        yuanxianreying_line.setVisibility(View.INVISIBLE);
        jijiangshangying_line.setVisibility(View.VISIBLE);
        jijiangshangying.setTextColor(getResources().getColor(R.color.fontRedColor));
        yuanxianreying.setTextColor(getResources().getColor(R.color.black));
    }

    private void hideTitle(){
        tv_title.setVisibility(View.VISIBLE);
        searchImg.setVisibility(View.GONE);
        yuanxianreying_line.setVisibility(View.GONE);
        jijiangshangying_line.setVisibility(View.GONE);
        jijiangshangying.setVisibility(View.GONE);
        yuanxianreying.setVisibility(View.GONE);
    }

    private void hide() {
        btn_tab1.setVisibility(View.INVISIBLE);
        btn_tab2.setVisibility(View.INVISIBLE);
        btn_tab3.setVisibility(View.INVISIBLE);
        btn_tab4.setVisibility(View.INVISIBLE);
    }
}
