package com.example.dsm2017.gaebapbaragi;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class InfoSnackAdapter extends RecyclerView.Adapter<InfoSnackAdapter.ViewHolder> {

    private ArrayList<InfoSnackActivity.item> mSnackDataset;

    InfoSnackAdapter(ArrayList<InfoSnackActivity.item> mySnackDataset) {
        mSnackDataset = mySnackDataset;
    }

    @Override
    public InfoSnackAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_snack, parent, false);
        ViewHolder holder = new ViewHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.mSnackname.setText(mSnackDataset.get(position).getSnackname());
        holder.mSnackdate.setText(mSnackDataset.get(position).getSnackdate());
        holder.mSnackcnt.setText(mSnackDataset.get(position).getSnackcnt() + "개");
    }

    @Override
    public int getItemCount() {
        return mSnackDataset.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        TextView mSnackname;
        TextView mSnackdate;
        TextView mSnackcnt;

        ViewHolder(View v) {
            super(v);
            mSnackname = v.findViewById(R.id.cardview_snack_text1);
            mSnackdate = v.findViewById(R.id.cardview_snack_text2);
            mSnackcnt = v.findViewById(R.id.cardview_snack_text3);
        }
    }
}