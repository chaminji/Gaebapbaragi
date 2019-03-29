package com.example.dsm2017.gaebapbaragi;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.zip.InflaterInputStream;

public class InfoMealAdapter extends RecyclerView.Adapter<InfoMealAdapter.ViewHolder> {

    private ArrayList<InfoMealActivity.item> mMealDataset;

    public InfoMealAdapter(ArrayList<InfoMealActivity.item> myMealDataset) {
        mMealDataset = myMealDataset;
    }

    @Override
    public InfoMealAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_meal, parent, false);

        ViewHolder holder = new ViewHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.mMealdate.setText(mMealDataset.get(position).getMealdate());
        holder.mMealcnt.setText(String.valueOf(mMealDataset.get(position).getMealcnt())+"그릇");
    }

    @Override
    public int getItemCount() {
        return mMealDataset.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView mMealdate;
        public TextView mMealcnt;

        public ViewHolder(View v) {
            super(v);

            mMealdate = (TextView) v.findViewById(R.id.cardview_meal_date);
            mMealcnt = (TextView) v.findViewById(R.id.cardview_meal_cnt);
        }
    }
}