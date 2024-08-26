package com.example.mygradient;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.TransitionDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import androidx.core.content.ContextCompat;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;

public class CustomGradientView extends RelativeLayout {
    private Context context;
    private ImageView profile_IMG_image;
    private View profile_VI_view;

    public CustomGradientView(Context context) {
        super(context);
        this.context = context;
        init(context, null, 0);
    }

    public CustomGradientView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.context = context;
        init(context, attrs, 0);
    }

    public CustomGradientView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.context = context;
        init(context, attrs, defStyleAttr);
    }

    private void init(Context context, AttributeSet attrs, int defStyleAttr) {
        inflate(context, R.layout.image, this);

        profile_IMG_image = findViewById(R.id.profile_IMG_image);
        profile_VI_view = findViewById(R.id.profile_VI_view);

        try (TypedArray array = context.obtainStyledAttributes(attrs, R.styleable.Profile, defStyleAttr, 0)) {
            Drawable imageFile = array.getDrawable(R.styleable.Profile_imageSrc);
            Drawable gradient = array.getDrawable(R.styleable.Profile_gradient);

            if (imageFile != null) {
                setDrawableImage(imageFile);
            }

            if (gradient != null) {
                setGradient(gradient);
            }
        }
    }

    public void setScaleType(ImageView.ScaleType scaleType) {
        profile_IMG_image.setScaleType(scaleType);
    }

    public void setGradient(Drawable gradient) {
        profile_VI_view.setBackground(gradient);
    }

    public void setDrawableImage(Drawable imageFile) {
        profile_IMG_image.setImageDrawable(imageFile);
    }

    public void setImage(Object imageSource, int imageError, int imagePlaceholder, ImageView.ScaleType scaleType) {
        setScaleType(scaleType);

        if (imageSource instanceof Integer) {
            Glide.with(context)
                    .load((int) imageSource)
                    .placeholder(imagePlaceholder)
                    .error(imageError)
                    .into(profile_IMG_image);

        } else if (imageSource instanceof String) {
            Glide.with(context)
                    .load((String) imageSource)
                    .placeholder(imagePlaceholder)
                    .transition(DrawableTransitionOptions.withCrossFade())
                    .error(imageError)
                    .into(profile_IMG_image);
        } else if (imageSource instanceof Drawable) {
            profile_IMG_image.setImageDrawable((Drawable) imageSource);
        } else {
            throw new IllegalArgumentException("Unsupported image source type");
        }
    }

    public void applyPresetGradient(GradientPreset preset) {
        if (preset == null || preset.getColors() == null || preset.getColors().length == 0) {
            return;
        }
        int[] colors = new int[preset.getColors().length];
        for (int i = 0; i < preset.getColors().length; i++) {
            int colorResId = preset.getColors()[i];
            colors[i] = ContextCompat.getColor(context, colorResId);
        }

        profile_VI_view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, colors));
        GradientDrawable drawable = (GradientDrawable) profile_VI_view.getBackground();

        switch (preset.getGradientType()) {
            case LINEAR:
                drawable.setGradientType(GradientDrawable.LINEAR_GRADIENT);
                break;
            case RADIAL:
                drawable.setGradientType(GradientDrawable.RADIAL_GRADIENT);
                break;
            case SWEEP:
                drawable.setGradientType(GradientDrawable.SWEEP_GRADIENT);
                break;

        }
    }
}
