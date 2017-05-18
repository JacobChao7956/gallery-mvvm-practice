package com.jacob.mvvmgallery;

import android.databinding.DataBindingUtil;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;

import com.jacob.mvvmgallery.data.ImageInfo;
import com.jacob.mvvmgallery.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = MainActivity.class.getSimpleName();
    private ArrayList<ImageInfo> images = new ArrayList<>();
    private GalleryAdapter galleryAdapter;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        binding.recyclerview.setHasFixedSize(true);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        binding.recyclerview.setLayoutManager(layoutManager);
        binding.recyclerview.setItemAnimator(new DefaultItemAnimator());

        initData();
    }

    private void initData() {
        String[] imageNames = getResources().getStringArray(R.array.image_names);
        Drawable[] imageDrawables = new Drawable[]{
                getResources().getDrawable(R.drawable.sakura, null),
                getResources().getDrawable(R.drawable.pitch, null),
                getResources().getDrawable(R.drawable.horo, null),
                getResources().getDrawable(R.drawable.enoshima_junko, null),
                getResources().getDrawable(R.drawable.black_magician_girl, null)
        };
        for (int i = 0; i < imageDrawables.length; i++) {
            ImageInfo imageInfo = new ImageInfo(imageNames[i], imageDrawables[i]);
            images.add(imageInfo);
        }
        galleryAdapter = new GalleryAdapter(images);
        binding.recyclerview.setAdapter(galleryAdapter);
    }
}
