package com.example.ilmi.myrecyclerview;

import android.view.View;

/**
 * Created by ILMI on 8/14/2018.
 */

public class CustomOnItemClickListener implements View.OnClickListener {

    private int position;
    private OnItemClickCallback onItemClickCallback;
    public CustomOnItemClickListener(int position, OnItemClickCallback onItemClickCallback) {
        this.position = position;
        this.onItemClickCallback = onItemClickCallback;
    }

    @Override
    public void onClick(View v) {
        onItemClickCallback.onItemClicked(v, position);
    }

    private interface OnItemClickCallback {
        void onItemClicked(View view, int posotion);
    }
}
