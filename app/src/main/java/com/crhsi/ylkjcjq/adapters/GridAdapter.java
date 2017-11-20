package com.crhsi.ylkjcjq.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.crhsi.ylkjcjq.R;
import com.zhy.autolayout.utils.AutoUtils;


public class GridAdapter extends BaseAdapter {
    private int[] mIconIDs;
    private LayoutInflater mInflater;
    private Context mContext;
    LinearLayout.LayoutParams params;

    public GridAdapter(Context mContext2, int[] mIconIDs) {
        this.mIconIDs = mIconIDs;
        this.mContext = mContext2;
    }

    public int getCount() {
        return mIconIDs.length;
    }

    public Object getItem(int position) {
        return mIconIDs[position];
    }

    public long getItemId(int position) {
        return position;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;

        if (convertView == null) {
            viewHolder = new ViewHolder();
            LayoutInflater mInflater = (LayoutInflater) mContext
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = mInflater.inflate(R.layout.horizontal_list_item, null);
            viewHolder.mImage = (ImageView) convertView.findViewById(R.id.img_list_item);
            viewHolder.mTitle = (TextView) convertView.findViewById(R.id.text_list_item);
            convertView.setTag(viewHolder);
            AutoUtils.autoSize(convertView);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        viewHolder.mImage.setBackground(mContext.getResources().getDrawable(mIconIDs[position]));
        return convertView;
    }

    class ViewHolder {
        private TextView mTitle;
        private ImageView mImage;
    }
}
