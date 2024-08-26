package com.example.gradientlab;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.mygradient.GradientPreset;

import java.util.ArrayList;
import java.util.List;

public class GradientViewModel extends ViewModel {
    private MutableLiveData<List<GradientPreset>> presets;

    public LiveData<List<GradientPreset>> getPredefinedGradients() {
        if (presets == null) {
            presets = new MutableLiveData<>();
            loadPresets();
        }

        return presets;
    }

    private void loadPresets() {
        List<GradientPreset> presetList = new ArrayList<>();

        // 1. #ee9ca7 → #ffdde1
        int[] colors1 = {com.example.mygradient.R.color.gradient_ee9ca7, com.example.mygradient.R.color.gradient_ffdde1};
        presetList.add(new GradientPreset("Pink-Light Pink: Linear", colors1, null, GradientPreset.GradientType.LINEAR));
        presetList.add(new GradientPreset("Pink-Light Pink: Radial", colors1, null, GradientPreset.GradientType.RADIAL));
        presetList.add(new GradientPreset("Pink-Light Pink: Sweep", colors1, null, GradientPreset.GradientType.SWEEP));

        // 2. #2193b0 → #6dd5ed
        int[] colors2 = {com.example.mygradient.R.color.gradient_2193b0, com.example.mygradient.R.color.gradient_6dd5ed};
        presetList.add(new GradientPreset("Blue-Light Blue: Linear", colors2, null, GradientPreset.GradientType.LINEAR));
        presetList.add(new GradientPreset("Blue-Light Blue: Radial", colors2, null, GradientPreset.GradientType.RADIAL));
        presetList.add(new GradientPreset("Blue-Light Blue: Sweep", colors2, null, GradientPreset.GradientType.SWEEP));

        // 3. #ff0099 → #493240
        int[] colors3 = {com.example.mygradient.R.color.gradient_ff0099, com.example.mygradient.R.color.gradient_493240};
        presetList.add(new GradientPreset("Pink-Dark Purple: Linear", colors3, null, GradientPreset.GradientType.LINEAR));
        presetList.add(new GradientPreset("Pink-Dark Purple: Radial", colors3, null, GradientPreset.GradientType.RADIAL));
        presetList.add(new GradientPreset("Pink-Dark Purple: Sweep", colors3, null, GradientPreset.GradientType.SWEEP));

        // 4. #b92b27 → #1565c0
        int[] colors4 = {com.example.mygradient.R.color.gradient_b92b27, com.example.mygradient.R.color.gradient_1565c0};
        presetList.add(new GradientPreset("Red-Blue: Linear", colors4, null, GradientPreset.GradientType.LINEAR));
        presetList.add(new GradientPreset("Red-Blue: Radial", colors4, null, GradientPreset.GradientType.RADIAL));
        presetList.add(new GradientPreset("Red-Blue: Sweep", colors4, null, GradientPreset.GradientType.SWEEP));

        // 5. #1f4037 → #99f2c8
        int[] colors5 = {com.example.mygradient.R.color.gradient_1f4037, com.example.mygradient.R.color.gradient_99f2c8};
        presetList.add(new GradientPreset("Green-Light Green: Linear", colors5, null, GradientPreset.GradientType.LINEAR));
        presetList.add(new GradientPreset("Green-Light Green: Radial", colors5, null, GradientPreset.GradientType.RADIAL));
        presetList.add(new GradientPreset("Green-Light Green: Sweep", colors5, null, GradientPreset.GradientType.SWEEP));

        // 6. #659999 → #f4791f
        int[] colors6 = {com.example.mygradient.R.color.gradient_659999, com.example.mygradient.R.color.gradient_f4791f};
        presetList.add(new GradientPreset("Gray-Orange: Linear", colors6, null, GradientPreset.GradientType.LINEAR));
        presetList.add(new GradientPreset("Gray-Orange: Radial", colors6, null, GradientPreset.GradientType.RADIAL));
        presetList.add(new GradientPreset("Gray-Orange: Sweep", colors6, null, GradientPreset.GradientType.SWEEP));

        // 7. #283c86 → #45a247
        int[] colors7 = {com.example.mygradient.R.color.gradient_283c86, com.example.mygradient.R.color.gradient_45a247};
        presetList.add(new GradientPreset("Dark Blue-Green: Linear", colors7, null, GradientPreset.GradientType.LINEAR));
        presetList.add(new GradientPreset("Dark Blue-Green: Radial", colors7, null, GradientPreset.GradientType.RADIAL));
        presetList.add(new GradientPreset("Dark Blue-Green: Sweep", colors7, null, GradientPreset.GradientType.SWEEP));

        // 8. #654ea3 → #eaafc8
        int[] colors8 = {com.example.mygradient.R.color.gradient_654ea3, com.example.mygradient.R.color.gradient_eaafc8};
        presetList.add(new GradientPreset("Purple-Light Pink: Linear", colors8, null, GradientPreset.GradientType.LINEAR));
        presetList.add(new GradientPreset("Purple-Light Pink: Radial", colors8, null, GradientPreset.GradientType.RADIAL));
        presetList.add(new GradientPreset("Purple-Light Pink: Sweep", colors8, null, GradientPreset.GradientType.SWEEP));

        // 9. #fdc830 → #f37335
        int[] colors9 = {com.example.mygradient.R.color.gradient_fdc830, com.example.mygradient.R.color.gradient_f37335};
        presetList.add(new GradientPreset("Yellow-Orange: Linear", colors9, null, GradientPreset.GradientType.LINEAR));
        presetList.add(new GradientPreset("Yellow-Orange: Radial", colors9, null, GradientPreset.GradientType.RADIAL));
        presetList.add(new GradientPreset("Yellow-Orange: Sweep", colors9, null, GradientPreset.GradientType.SWEEP));

        // 10. #ad5389 → #3c1053
        int[] colors10 = {com.example.mygradient.R.color.gradient_ad5389, com.example.mygradient.R.color.gradient_3c1053};
        presetList.add(new GradientPreset("Pink-Dark Purple: Linear", colors10, null, GradientPreset.GradientType.LINEAR));
        presetList.add(new GradientPreset("Pink-Dark Purple: Radial", colors10, null, GradientPreset.GradientType.RADIAL));
        presetList.add(new GradientPreset("Pink-Dark Purple: Sweep", colors10, null, GradientPreset.GradientType.SWEEP));

        // 11. #23074d → #cc5333
        int[] colors11 = {com.example.mygradient.R.color.gradient_23074d, com.example.mygradient.R.color.gradient_cc5333};
        presetList.add(new GradientPreset("Dark Purple-Orange: Linear", colors11, null, GradientPreset.GradientType.LINEAR));
        presetList.add(new GradientPreset("Dark Purple-Orange: Radial", colors11, null, GradientPreset.GradientType.RADIAL));
        presetList.add(new GradientPreset("Dark Purple-Orange: Sweep", colors11, null, GradientPreset.GradientType.SWEEP));

        // 12. #74ebd5 → #acb6e5
        int[] colors12 = {com.example.mygradient.R.color.gradient_74ebd5, com.example.mygradient.R.color.gradient_acb6e5};
        presetList.add(new GradientPreset("Light Green-Light Blue: Linear", colors12, null, GradientPreset.GradientType.LINEAR));
        presetList.add(new GradientPreset("Light Green-Light Blue: Radial", colors12, null, GradientPreset.GradientType.RADIAL));
        presetList.add(new GradientPreset("Light Green-Light Blue: Sweep", colors12, null, GradientPreset.GradientType.SWEEP));

        // 13. #000000 → #0f9b0f
        int[] colors13 = {com.example.mygradient.R.color.gradient_000000, com.example.mygradient.R.color.gradient_0f9b0f};
        presetList.add(new GradientPreset("Black-Green: Linear", colors13, null, GradientPreset.GradientType.LINEAR));
        presetList.add(new GradientPreset("Black-Green: Radial", colors13, null, GradientPreset.GradientType.RADIAL));
        presetList.add(new GradientPreset("Black-Green: Sweep", colors13, null, GradientPreset.GradientType.SWEEP));

        // 14. #eb5757 → #000000
        int[] colors14 = {com.example.mygradient.R.color.gradient_eb5757, com.example.mygradient.R.color.gradient_000000};
        presetList.add(new GradientPreset("Red-Black: Linear", colors14, null, GradientPreset.GradientType.LINEAR));
        presetList.add(new GradientPreset("Red-Black: Radial", colors14, null, GradientPreset.GradientType.RADIAL));
        presetList.add(new GradientPreset("Red-Black: Sweep", colors14, null, GradientPreset.GradientType.SWEEP));

        // 15. #d66d75 → #e29587
        int[] colors15 = {com.example.mygradient.R.color.gradient_d66d75, com.example.mygradient.R.color.gradient_e29587};
        presetList.add(new GradientPreset("Pink-Light Pink: Linear", colors15, null, GradientPreset.GradientType.LINEAR));
        presetList.add(new GradientPreset("Pink-Light Pink: Radial", colors15, null, GradientPreset.GradientType.RADIAL));
        presetList.add(new GradientPreset("Pink-Light Pink: Sweep", colors15, null, GradientPreset.GradientType.SWEEP));

        // 16. #4568dc → #b06ab3
        int[] colors16 = {com.example.mygradient.R.color.gradient_4568dc, com.example.mygradient.R.color.gradient_b06ab3};
        presetList.add(new GradientPreset("Blue-Purple: Linear", colors16, null, GradientPreset.GradientType.LINEAR));
        presetList.add(new GradientPreset("Blue-Purple: Radial", colors16, null, GradientPreset.GradientType.RADIAL));
        presetList.add(new GradientPreset("Blue-Purple: Sweep", colors16, null, GradientPreset.GradientType.SWEEP));

        presets.setValue(presetList);
    }

}
