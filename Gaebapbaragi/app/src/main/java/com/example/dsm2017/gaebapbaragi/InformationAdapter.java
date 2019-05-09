package com.example.dsm2017.gaebapbaragi;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;

public class InformationAdapter extends RecyclerView.Adapter<InformationAdapter.ViewHolder> {

    private ArrayList<InformationActivity.item> mInfoDataset;

    public InformationAdapter(ArrayList<InformationActivity.item> myInfoDataset) {
        mInfoDataset = myInfoDataset;
    }

    @Override
    public InformationAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_info, parent, false);

        ViewHolder holder = new ViewHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.mInfotitle.setText(mInfoDataset.get(position).getInfotitle());
        holder.mInfocontent.setText(String.valueOf(mInfoDataset.get(position).getInfocontent()));
    }

    @Override
    public int getItemCount() {
        return mInfoDataset.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView mInfotitle;
        public TextView mInfocontent;

        public ViewHolder(View v) {
            super(v);

            mInfotitle = (TextView) v.findViewById(R.id.cardview_info_title);
            mInfocontent = (TextView) v.findViewById(R.id.cardview_info_content);
        }
    }
}