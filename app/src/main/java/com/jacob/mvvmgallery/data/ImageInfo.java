package com.jacob.mvvmgallery.data;

import android.graphics.drawable.Drawable;

/**
 * Created by JacobChao on 2017/5/17.
 */

public class ImageInfo {
    private String name;
    private Drawable image;

    public ImageInfo(String name, Drawable image) {
        this.name = name;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Drawable getImage() {
        return image;
    }

    public void setImage(Drawable image) {
        this.image = image;
    }
}
