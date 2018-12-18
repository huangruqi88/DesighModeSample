package com.example.huangruqi.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.huangruqi.pattern.R;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * author: xiaokang
 * time  : 17/3/29
 * desc  :
 */

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.ViewHolder> {
    private List<String> mList;

    public MainAdapter() {

    }

    public List<String> getDate() {
        return mList;
    }

    public void setDate(List<String> list) {
        mList = list;
    }

    @NonNull
    @Override
    public MainAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_container, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {
        viewHolder.mTvName.setText(mList.get(position));
        viewHolder.itemView.setOnClickListener(v -> mOnItemClickListener.onItemClick(position));
    }


    @Override
    public int getItemCount() {
        return mList.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.tv_name)
        TextView mTvName;

        ViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }

    private onItemClickListener mOnItemClickListener;

    public void setOnItemClickListener(onItemClickListener onItemClickListener) {
        this.mOnItemClickListener = onItemClickListener;
    }

    /**
     * item 点击事件的监听
     */
    public interface onItemClickListener {
        /**
         * item点击事件
         *
         * @param position
         */
        void onItemClick(int position);
    }
}
