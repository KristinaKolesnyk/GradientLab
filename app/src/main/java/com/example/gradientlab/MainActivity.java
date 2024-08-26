package com.example.gradientlab;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.ViewModelProvider;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

import com.example.mygradient.CustomGradientView;
import com.example.mygradient.GradientPreset;

import java.util.List;

        public class MainActivity extends AppCompatActivity {

            private GradientViewModel gradientViewModel;
            private List<GradientPreset> presets;

            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);

                Toolbar toolbar = findViewById(R.id.main_TOOL_toolbar);
                setSupportActionBar(toolbar);

                if (getSupportActionBar() != null) {
                    getSupportActionBar().setTitle("Gradient: Kristina.K");
                }

                Spinner presetSpinner = findViewById(R.id.presetSpinner);

                CustomGradientView gradient = findViewById(R.id.main_PRO_gradientImage);

                gradientViewModel = new ViewModelProvider(this).get(GradientViewModel.class);

                gradientViewModel.getPredefinedGradients().observe(this, gradientPresets -> {
                    presets = gradientPresets;
                    setupSpinner(presets, presetSpinner, gradient);
                });
            }

            private void setupSpinner(List<GradientPreset> presets, Spinner presetSpinner, CustomGradientView gradient) {
                ArrayAdapter<GradientPreset> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, presets);
                adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                presetSpinner.setAdapter(adapter);

                presetSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                        GradientPreset selectedPreset = presets.get(position);
                        gradient.applyPresetGradient(selectedPreset);
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> adapterView) {}
                });

                gradient.setImage("https://mixnews.lv/wp-content/uploads/2024/04/9/2024-04-09-mixnews-mycollages-3.jpg",
                        R.drawable.image_error, R.drawable.image_placeholder, ImageView.ScaleType.CENTER_CROP);
            }
        }

