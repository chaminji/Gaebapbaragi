package com.example.dsm2017.gaebapbaragi;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;

public class InfoDrugAdapter extends RecyclerView.Adapter<InfoDrugAdapter.ViewHolder> {

    private ArrayList<InfoDrugActivity.item> mDrugDataset;

    public InfoDrugAdapter(ArrayList<InfoDrugActivity.item> myDrugDataset) {
        mDrugDataset = myDrugDataset;
    }

    @Override
    public InfoDrugAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_meal, parent, false);

        ViewHolder holder = new ViewHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.mDrugdate.setText(mDrugDataset.get(position).getDrugdate());
        holder.mDrugcnt.setText(String.valueOf(mDrugDataset.get(position).getDrugcnt()));
    }

    @Override
    public int getItemCount() {
        return mDrugDataset.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView mDrugdate;
        public TextView mDrugcnt;

        public ViewHolder(View v) {
            super(v);

            mDrugdate = (TextView) v.findViewById(R.id.cardview_meal_date);
            mDrugcnt = (TextView) v.findViewById(R.id.cardview_meal_cnt);
        }
    }
}