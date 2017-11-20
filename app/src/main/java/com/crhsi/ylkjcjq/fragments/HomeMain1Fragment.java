package com.crhsi.ylkjcjq.fragments;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.crhsi.ylkjcjq.activitys.HuiminServicePointActivity;
import com.crhsi.ylkjcjq.activitys.StationInformationActivity;
import com.crhsi.ylkjcjq.activitys.TicketHotelActivity;
import com.crhsi.ylkjcjq.activitys.TrainTravelActivity;
import com.crhsi.ylkjcjq.activitys.TravelLineActivity;
import com.crhsi.ylkjcjq.activitys.TravelReminderActivity;
import com.crhsi.ylkjcjq.activitys.WeatherInquiryActivity;
import com.crhsi.ylkjcjq.R;


/**
 * 首页
 *
 * @author CJQ
 */
public class HomeMain1Fragment extends Fragment implements View.OnClickListener {

    private ImageView tvTravelBtn;
    private TextView tvTraveltext01, tvTraveltext02;
    private Context mContext;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main1, null);
        mContext = view.getContext();
        initView(view);
        return view;
    }

    private void initView(View view) {
        view.findViewById(R.id.top5_1).setOnClickListener(this);
        view.findViewById(R.id.top5_2).setOnClickListener(this);
        view.findViewById(R.id.top5_3).setOnClickListener(this);
        view.findViewById(R.id.top5_4).setOnClickListener(this);
        view.findViewById(R.id.top5_5).setOnClickListener(this);

        view.findViewById(R.id.line_center4_1).setOnClickListener(this);
        view.findViewById(R.id.line_center4_2).setOnClickListener(this);
        view.findViewById(R.id.line_center4_3).setOnClickListener(this);
        view.findViewById(R.id.line_center4_4).setOnClickListener(this);
        view.findViewById(R.id.tvSearchChePiao).setOnClickListener(this);

        view.findViewById(R.id.tvSearchLvYouimg).setOnClickListener(this);
        view.findViewById(R.id.tvSearchLvYou).setOnClickListener(this);
        tvTraveltext01 = (TextView)view.findViewById(R.id.tvTraveltext01);
        tvTraveltext02 = (TextView)view.findViewById(R.id.tvTraveltext02);
        tvTravelBtn = (ImageView)view.findViewById(R.id.tvTravelBtn);
        tvTravelBtn.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.tvTravelBtn:
                String tv01 = tvTraveltext01.getText().toString();
                tvTraveltext01.setText(tvTraveltext02.getText().toString());
                tvTraveltext02.setText(tv01);
                break;
            case R.id.top5_1:
                startActivity(new Intent(mContext, TravelReminderActivity.class));
                break;
            case R.id.top5_2:
                startActivity(new Intent(mContext, TravelLineActivity.class));
                break;
            case R.id.top5_3:
                startActivity(new Intent(mContext, StationInformationActivity.class));
                break;
            case R.id.top5_4:
                startActivity(new Intent(mContext, TicketHotelActivity.class));
                break;
            case R.id.top5_5:
                startActivity(new Intent(mContext, WeatherInquiryActivity.class));
                break;
            case R.id.line_center4_1:
                break;
            case R.id.line_center4_2:
                startActivity(new Intent(mContext, HuiminServicePointActivity.class));
                break;
            case R.id.line_center4_3:
                break;
            case R.id.line_center4_4:
                break;
            case R.id.tvSearchChePiao:
                startActivity(new Intent(mContext,TicketHotelActivity.class));
                break;
            case R.id.tvSearchLvYou:
            case R.id.tvSearchLvYouimg:
                startActivity(new Intent(mContext,TrainTravelActivity.class));
                break;
           default:

                break;
        }
    }
}
