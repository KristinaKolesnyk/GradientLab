# GradientLab Library

**GradientLab** is a comprehensive Android library that allows developers to easily apply visually appealing gradient backgrounds to their app's UI elements. The library features a variety of predefined gradient presets, allowing for the quick and easy customization of views, as well as support for creating custom gradients tailored to specific design needs. With its intuitive API, GradientLab also enables image loading from drawable resources or remote URLs, allowing for seamless integration of images with gradient overlays.

## Key Features

- **Predefined Gradients:** Choose from a collection of vibrant, hand-crafted gradient presets that can be applied instantly to any view.
- **Custom Gradients:** Define your own gradients by setting specific colors, orientations, and gradient types (Linear, Radial, or Sweep).
- **Drawable Image Support:** Easily load and display images from local drawable resources alongside gradient backgrounds.
- **Remote Image Loading:** Fetch and display images directly from URLs, complete with customizable error and placeholder images.
<img width="250" height = "250" alt="Screenshot 2024-08-26 at 22 18 12" src="https://github.com/user-attachments/assets/54ebea33-e97c-4f92-b4ab-161d49ea3b6f">
<img width="250" height = "250" alt="Screenshot 2024-08-26 at 22 18 39" src="https://github.com/user-attachments/assets/02b77126-b04b-4446-b7fa-733beb3ff629">
<img width="250" height = "250" alt="Screenshot 2024-08-26 at 22 19 05" src="https://github.com/user-attachments/assets/bfac3923-70b3-4390-aa02-4b7f011e32d7">


## Getting Started

To integrate **GradientLab** into your Android project, follow these steps:

### Step 1. Add the JitPack Repository

Add the following to your root `build.gradle` file at the project level:

```gradle
allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}
```

### Step 2. Add the Dependency

In your app-level `build.gradle` file, include the following dependency:

```gradle
dependencies {
    implementation 'com.github.kristinakolesnyk:GradientLab:1.0.0'
}
```

## Usage Guide

### 1. Initializing the Gradient View

To start using the library, instantiate and configure the `Gradient` view in your activity or fragment.

```java
private Gradient gradient;
private List<PreDefinedGradient> presets;

gradient = findViewById(R.id.main_PRO_gradientImage);
presets = gradient.getPredefinedGradients(); // Load predefined gradient options
```

### 2. Applying Predefined Gradients

Choose a gradient from the preset list and apply it to your view with the following code:

```java
gradient.applyPresetGradient(selectedGradient); // Apply the selected gradient
```

### 3. Loading Images from Drawable Resources

Load a drawable resource into the `Gradient` view along with error and placeholder handling:

```java
gradient.setImage(R.drawable.family, R.drawable.image_error, R.drawable.image_placeholder, ImageView.ScaleType.CENTER_CROP);
```

### 4. Loading Images from a URL

To display an image from a URL with graceful loading and error handling:

```java
gradient.setImage("https://example.com/image.jpg", R.drawable.image_error, R.drawable.image_placeholder, ImageView.ScaleType.CENTER_CROP);
```

### 5. Custom Gradients

With the `CustomGradientView` class, you can easily create and apply custom gradients (Linear, Radial, and Sweep) to your views. Additionally, you can overlay gradients on images for a dynamic visual effect.

#### Usage:

1. **Create and Apply Custom Gradients:**

   Define your gradient colors and type, then apply it to the view.

   ```java
   int[] customColors = {ContextCompat.getColor(this, R.color.colorStart), ContextCompat.getColor(this, R.color.colorEnd)};
   GradientPreset customPreset = new GradientPreset("Custom Gradient", customColors, null, GradientPreset.GradientType.LINEAR);
   gradient.applyPresetGradient(customPreset);
   ```

2. **Combine with Image:**

   Set an image and apply a gradient on top.

   ```java
   gradient.setImage("https://example.com/image.jpg", R.drawable.image_error, R.drawable.image_placeholder, ImageView.ScaleType.CENTER_CROP);
   gradient.applyPresetGradient(customPreset);
   ```

#### Example in XML:

```xml
<com.example.mygradient.CustomGradientView
    android:id="@+id/main_PRO_gradientImage"
    android:layout_width="match_parent"
    android:layout_height="300dp"
    app:imagePlaceholder="@drawable/image_placeholder"
    app:imageError="@drawable/image_error"/>
```

## Contributing

Contributions are welcome! If you'd like to contribute to **GradientLab**, feel free to submit issues, feature requests, or pull requests via GitHub.

## License

GradientLab is available under the MIT License. See the LICENSE file for more information.

---

Developed and maintained by **Kristina Kolesnyk**.
```
