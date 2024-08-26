package com.example.gradientlab;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

import com.example.mygradient.CustomGradientView;
import com.example.mygradient.GradientPreset;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private CustomGradientView gradient;
    private Toolbar toolbar;

    private Spinner presetSpinner;
    private List<GradientPreset> presets;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.main_TOOL_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Adi");

        presetSpinner = findViewById(R.id.presetSpinner);
        gradient = (CustomGradientView) findViewById(R.id.main_PRO_gradientImage);
        presets = gradient.getPredefinedGradients();


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
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        gradient.setImage("https://www.deutschland.de/sites/default/files/media/image/tdt_15052020_wie_familien_in_deutschland_leben_gemeinsam.jpg", R.drawable.image_error, R.drawable.image_placeholder, ImageView.ScaleType.CENTER_CROP);
    }
}