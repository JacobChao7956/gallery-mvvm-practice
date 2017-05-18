package com.jacob.mvvmgallery;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.jacob.mvvmgallery.databinding.ItemImageBinding;

/**
 * Created by JacobChao on 2017/5/16.
 */

public class ImageViewHolder extends RecyclerView.ViewHolder {
    private ItemImageBinding itemBinding;

    public ImageViewHolder(View itemView) {
        super(itemView);
    }

    public ItemImageBinding getItemBinding() {
        return itemBinding;
    }

    public void setItemBinding(ItemImageBinding itemBinding) {
        this.itemBinding = itemBinding;
    }
}
