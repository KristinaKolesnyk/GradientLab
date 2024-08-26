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

import java.util.ArrayList;
import java.util.List;

public class CustomGradientView extends RelativeLayout {
    private Context context;
    private AttributeSet attrs;
    private int style;
    private View view;

    private ImageView profile_IMG_image;
    private View profile_VI_view;

    private Drawable imageFile, imagePlaceholder, imageError, gradient;

    public CustomGradientView(Context context) {
        super(context);
        this.context = context;
        initViews();
    }

    public CustomGradientView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.context = context;
        this.attrs = attrs;
        initViews();
    }

    public CustomGradientView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.context = context;
        this.attrs = attrs;
        this.style = defStyleAttr;
        initViews();
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

    /*
        public void setDrawableImage(int mImageFile, int mImageError, int mImagePlaceholder, ImageView.ScaleType scaleType) {
            setScaleType(scaleType);
            Glide
                    .with(context)
                    .load(mImageFile)
                    .placeholder(mImagePlaceholder)
                    .transition(DrawableTransitionOptions.withCrossFade())
                    .error(mImageError)
                    .into(profile_IMG_image);
        }
        */
    public void setImage(Object imageSource, int mImageError, int mImagePlaceholder, ImageView.ScaleType scaleType) {
        setScaleType(scaleType);
        if (imageSource instanceof Integer) {
            Glide.with(context)
                    .load((int) imageSource)
                    .placeholder(mImagePlaceholder)
                    .error(mImageError)
                    .into(profile_IMG_image);
        } else if (imageSource instanceof String) {
            Glide.with(context)
                    .load((String) imageSource)
                    .placeholder(mImagePlaceholder)
                    .error(mImageError)
                    .into(profile_IMG_image);
        }
    }
/*
    public void setUrlImage(String url, int mImageError, int mImagePlaceholder, ImageView.ScaleType scaleType) {
        setScaleType(scaleType);
        Glide
                .with(context)
                .load(url)
                .placeholder(mImagePlaceholder)
                .transition(DrawableTransitionOptions.withCrossFade())
                .dontAnimate()
                .error(mImageError)
                .into(profile_IMG_image);
    }

    public void setResImage(int resID, ImageView.ScaleType scaleType) {
        setScaleType(scaleType);
        profile_IMG_image.setImageResource(resID);
    }*/

    public List<GradientPreset> getPredefinedGradients() {
        List<GradientPreset> presets = new ArrayList<>();

        // Define your preset gradients here
        int[] colors1 = {R.color.gradient_pink, R.color.gradient_purple};
        float[] positions1 = {0.0f, 0.75f};
        presets.add(new GradientPreset("Pink-Purple-Linear", colors1, positions1, GradientPreset.GradientType.LINEAR));
        presets.add(new GradientPreset("Pink-Purple-Radial", colors1, positions1, GradientPreset.GradientType.RADIAL));
        presets.add(new GradientPreset("Pink-Purple-Sweep", colors1, positions1, GradientPreset.GradientType.SWEEP));

        int[] colors2 = {R.color.gradient_yellow, R.color.gradient_white};
        float[] positions2 = {0.0f, 1.0f};
        presets.add(new GradientPreset("Yellow-White-Linear", colors2, positions2, GradientPreset.GradientType.LINEAR));
        presets.add(new GradientPreset("Yellow-White-Radial", colors2, positions2, GradientPreset.GradientType.RADIAL));
        presets.add(new GradientPreset("Yellow-White-Sweep", colors2, positions2, GradientPreset.GradientType.SWEEP));

        int[] colors3 = {R.color.gradient_dark_blue, R.color.gradient_light_blue};
        float[] positions3 = {0.0f, 0.75f};
        presets.add(new GradientPreset("Dark-Light Blue-Linear", colors3, positions3, GradientPreset.GradientType.LINEAR));
        presets.add(new GradientPreset("Dark-Light Blue-Radial", colors3, positions3, GradientPreset.GradientType.RADIAL));
        presets.add(new GradientPreset("Dark-Light Blue-Sweep", colors3, positions3, GradientPreset.GradientType.SWEEP));

        int[] colors4 = {R.color.gradient_orange, R.color.gradient_dark_pink};
        float[] positions4 = {0.0f, 1.0f};
        presets.add(new GradientPreset("Orange-Pink-Linear", colors4, positions4, GradientPreset.GradientType.LINEAR));
        presets.add(new GradientPreset("Orange-Pink-Radial", colors4, positions4, GradientPreset.GradientType.RADIAL));
        presets.add(new GradientPreset("Orange-Pink-Sweep", colors4, positions4, GradientPreset.GradientType.SWEEP));

        int[] colors5 = {R.color.gradient_green, R.color.gradient_black};
        float[] positions5 = {0.0f, 1.0f};
        presets.add(new GradientPreset("Green-Black-Linear", colors5, positions5, GradientPreset.GradientType.LINEAR));
        presets.add(new GradientPreset("Green-Black-Radial", colors5, positions5, GradientPreset.GradientType.RADIAL));
        presets.add(new GradientPreset("Green-Black-Sweep", colors5, positions5, GradientPreset.GradientType.SWEEP));

        int[] colors6 = {R.color.gradient_red, R.color.gradient_purple};
        float[] positions6 = {0.0f, 1.0f};
        presets.add(new GradientPreset("Red-Purple-Linear", colors6, positions6, GradientPreset.GradientType.LINEAR));
        presets.add(new GradientPreset("Red-Purple-Radial", colors6, positions6, GradientPreset.GradientType.RADIAL));
        presets.add(new GradientPreset("Red-Purple-Sweep", colors6, positions6, GradientPreset.GradientType.SWEEP));

        return presets;
    }

    public void applyPresetGradient(GradientPreset preset) {
        if (preset == null || preset.getColors() == null || preset.getColors().length == 0) {
            return;
        }

        Drawable currentDrawable = profile_VI_view.getBackground();

        int[] colors = new int[preset.getColors().length];
        for (int i = 0; i < preset.getColors().length; i++) {
            int colorResId = preset.getColors()[i];
            colors[i] = ContextCompat.getColor(context, colorResId);
        }

        GradientDrawable newGradient = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, colors);

        switch (preset.getGradientType()) {
            case LINEAR:
                newGradient.setGradientType(GradientDrawable.LINEAR_GRADIENT);
                break;
            case RADIAL:
                newGradient.setGradientType(GradientDrawable.RADIAL_GRADIENT);
                break;
            case SWEEP:
                newGradient.setGradientType(GradientDrawable.SWEEP_GRADIENT);
                break;
        }
        if (currentDrawable == null) {
            profile_VI_view.setBackground(newGradient);
            return;
        }

        TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{currentDrawable, newGradient});
        profile_VI_view.setBackground((transitionDrawable));
        transitionDrawable.startTransition(500);
    }

    private void initViews() {
        this.view = this;
        inflate(context, R.layout.image, this);

        TypedArray array = context.obtainStyledAttributes(attrs, R.styleable.Profile, style, 0);

        imageFile = array.getDrawable(R.styleable.Profile_imageSrc);
        imageError = array.getDrawable(R.styleable.Profile_imageError);
        imagePlaceholder = array.getDrawable(R.styleable.Profile_imagePlaceholder);
        gradient = array.getDrawable(R.styleable.Profile_gradient);

        profile_IMG_image = findViewById(R.id.profile_IMG_image);
        profile_VI_view = findViewById(R.id.profile_VI_view);

        if (imageFile != null) {
            setDrawableImage(imageFile);
        }

        if (gradient != null) {
            setGradient(gradient);
        }

        array.recycle();

    }
}
