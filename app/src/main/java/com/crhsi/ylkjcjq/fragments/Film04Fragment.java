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
//        view.findViewById(R.id.top5_1).setOnClickListener(this);
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
