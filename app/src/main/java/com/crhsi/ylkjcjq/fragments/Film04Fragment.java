package com.crhsi.ylkjcjq.fragments;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.crhsi.ylkjcjq.R;
import com.crhsi.ylkjcjq.activitys.TravelReminderActivity;
import com.crhsi.ylkjcjq.adapters.HorizontalListViewAdapter;
import com.crhsi.ylkjcjq.views.HorizontalListView;


/**
 * 高铁院线
 *
 * @author CJQ
 */
public class Film04Fragment extends Fragment implements View.OnClickListener {

    private Context mContext;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragmengt_film04, null);
        mContext = view.getContext();
        initView(view);
        return view;
    }

    private void initView(View view) {
        HorizontalListView mHorizontalListView = (HorizontalListView) view.findViewById(R.id.mHorizontalListView);
        String[] titles = {"", "", "", "", ""};
        final int[] ids = {R.mipmap.film_img_1, R.mipmap.film_img_2, R.mipmap.film_img_3, R.mipmap.film_img_4, R.mipmap.film_img_5};
        HorizontalListViewAdapter adapter = new HorizontalListViewAdapter(mContext, titles, ids);
        mHorizontalListView.setAdapter(adapter);
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
