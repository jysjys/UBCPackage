package com.crhsi.ylkjcjq.fragments;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

import com.crhsi.ylkjcjq.R;
import com.crhsi.ylkjcjq.activitys.HighSpeedCinemaActivity;
import com.crhsi.ylkjcjq.activitys.TravelReminderActivity;
import com.crhsi.ylkjcjq.adapters.GridAdapter;
import com.crhsi.ylkjcjq.adapters.HorizontalListViewAdapter;
import com.crhsi.ylkjcjq.views.HorizontalListView;

import java.util.ArrayList;
import java.util.List;


/**
 * 高铁院线
 *
 * @author CJQ
 */
public class Film02Fragment extends Fragment implements View.OnClickListener {

    private Context mContext;
    private HorizontalListView mHorizontalListView;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragmengt_film02, null);
        mContext = view.getContext();
        initView(view);
        return view;
    }

    private void initView(View view) {
        mHorizontalListView = (HorizontalListView) view.findViewById(R.id.mHorizontalListView);
        String[] titles = {"", "", "",""};
        final int[] ids = {R.mipmap.film_h_01, R.mipmap.film_h_01, R.mipmap.film_h_01,R.mipmap.film_h_01};
        HorizontalListViewAdapter adapter = new HorizontalListViewAdapter(mContext, titles, ids);
        mHorizontalListView.setAdapter(adapter);

        GridView mGridView = (GridView)view.findViewById(R.id.mGridView);

        final int[] idds = {R.mipmap.qidai01, R.mipmap.qidai02, R.mipmap.qidai01,R.mipmap.qidai01, R.mipmap.qidai02};
        GridAdapter ad = new GridAdapter(view.getContext(), idds);
        mGridView.setAdapter(ad);
    }


    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.top5_1:
                startActivity(new Intent(mContext, TravelReminderActivity.class));
                break;
            default:

                break;
        }
    }
}
