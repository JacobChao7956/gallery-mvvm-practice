package com.jacob.mvvmgallery;

import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.jacob.mvvmgallery.data.ImageInfo;
import com.jacob.mvvmgallery.databinding.ItemImageBinding;

import java.util.ArrayList;

/**
 * Created by JacobChao on 2017/5/16.
 */

public class GalleryAdapter extends RecyclerView.Adapter<ImageViewHolder> {

    private ArrayList<ImageInfo> images;

    public GalleryAdapter(ArrayList<ImageInfo> images) {
        this.images = images;
    }

    @Override
    public ImageViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        ItemImageBinding binding = DataBindingUtil.inflate(layoutInflater,
                R.layout.item_image, parent, false);
        ImageViewHolder holder = new ImageViewHolder(binding.getRoot());
        holder.setItemBinding(binding);
        return holder;
    }

    @Override
    public void onBindViewHolder(ImageViewHolder holder, int position) {
        ImageInfo imageInfo = images.get(position);
        holder.getItemBinding().setVariable(BR.imageinfo, imageInfo);
        holder.getItemBinding().image.setImageDrawable(imageInfo.getImage());
        holder.getItemBinding().executePendingBindings();
    }

    @Override
    public int getItemCount() {
        return images != null ? images.size() : 0;
    }
}
