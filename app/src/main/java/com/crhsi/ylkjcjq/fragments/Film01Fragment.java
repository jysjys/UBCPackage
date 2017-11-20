package com.crhsi.ylkjcjq.fragments;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;

import com.crhsi.ylkjcjq.R;
import com.crhsi.ylkjcjq.activitys.HighSpeedCinemaActivity;
import com.crhsi.ylkjcjq.activitys.TravelReminderActivity;
import com.crhsi.ylkjcjq.adapters.HorizontalListViewAdapter;
import com.crhsi.ylkjcjq.utils.PicassoImageLoader;
import com.crhsi.ylkjcjq.views.HorizontalListView;
import com.youth.banner.Banner;
import com.youth.banner.BannerConfig;
import com.youth.banner.Transformer;
import com.youth.banner.listener.OnBannerListener;

import java.util.ArrayList;
import java.util.List;


/**
 * 高铁院线
 *
 * @author CJQ
 */
public class Film01Fragment extends Fragment implements View.OnClickListener {

    private Context mContext;
    private HorizontalListView mHorizontalListView;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragmengt_film01, null);
        mContext = view.getContext();
        initView(view);
        initBanners(view);
        return view;
    }

    private void initView(View view) {
        view.findViewById(R.id.imgchange01).setOnClickListener(this);
        view.findViewById(R.id.imgchange02).setOnClickListener(this);
        mHorizontalListView = (HorizontalListView) view.findViewById(R.id.mHorizontalListView);
        String[] titles = {"", "", "",""};
        final int[] ids = {R.mipmap.gaotieyingyuancenter01, R.mipmap.gaotieyingyuancenter02, R.mipmap.gaotieyingyuancenter01,R.mipmap.gaotieyingyuancenter02};
        HorizontalListViewAdapter adapter = new HorizontalListViewAdapter(mContext, titles, ids);
        mHorizontalListView.setAdapter(adapter);
        mHorizontalListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                HighSpeedCinemaActivity.getInstass().changeTab("tab4");
            }
        });
    }

    private void initBanners(View view) {
        List<String> imageUrls = new ArrayList<String>();
        List<String> titles = new ArrayList<String>();
        imageUrls.add("01");
        imageUrls.add("http://pic35.photophoto.cn/20150528/0005018358146030_b.jpg");
        titles.add("");
        titles.add("");
        Banner banner = (Banner) view.findViewById(R.id.banner);
        //设置banner样式
        banner.setBannerStyle(BannerConfig.CIRCLE_INDICATOR);
        //设置图片加载器
        banner.setImageLoader(new PicassoImageLoader());
        //设置图片集合
        banner.setImages(imageUrls);
        //设置banner动画效果
        banner.setBannerAnimation(Transformer.Tablet);
        //设置标题集合（当banner样式有显示title时）
//        banner.setBannerTitles(titles);
        //设置自动轮播，默认为true
        banner.isAutoPlay(true);
        //设置轮播时间
        banner.setDelayTime(1500);
        //设置指示器位置（当banner模式中有指示器时）
        banner.setIndicatorGravity(BannerConfig.CENTER);
        //banner设置方法全部调用完毕时最后调用
        banner.start();
        banner.setOnBannerListener(new OnBannerListener() {
            @Override
            public void OnBannerClick(int position) {

            }
        });
    }


    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.top5_1:
                startActivity(new Intent(mContext, TravelReminderActivity.class));
                break;
            case R.id.imgchange01:
            case R.id.imgchange02:
                HighSpeedCinemaActivity.getInstass().changeTab("tab3");
                break;
            default:

                break;
        }
    }
}
