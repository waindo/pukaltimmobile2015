package com.matos.mygis.libraries;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by matOS on 8/11/2015.
 */
public class RecyclerItemClickListener implements RecyclerView.OnItemTouchListener {

    public interface OnItemClickListener {
        public void onItemClick(View view, int position);
    }

    private OnItemClickListener mItemClickListener;
    GestureDetector mGestureDetector;

    public RecyclerItemClickListener(Context pContext, OnItemClickListener onItemClickListener) {
        mItemClickListener = onItemClickListener;
        mGestureDetector = new GestureDetector(pContext, new GestureDetector.SimpleOnGestureListener() {
            @Override
            public boolean onSingleTapUp(MotionEvent e) {
                return true;
            }
        });
    }

    @Override
    public boolean onInterceptTouchEvent(RecyclerView rv, MotionEvent e) {
        View childView = rv.findChildViewUnder(e.getX(), e.getY());

        if (childView != null && mItemClickListener != null && mGestureDetector.onTouchEvent(e)) {
            mItemClickListener.onItemClick(childView, rv.getChildPosition(childView));
            return true;
        }

        return false;
    }

    @Override
    public void onTouchEvent(RecyclerView rv, MotionEvent e) {
    }
}
