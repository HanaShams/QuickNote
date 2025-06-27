# 📝 QuickNote

QuickNote is a clean, lightweight Android note-taking app that allows users to easily create, edit, and manage personal notes. Built using Java, the app features a simple UI and reliable local storage using Room Database.

---

## 🚀 Features

- ✍️ Create and save notes  
- 📝 Edit existing notes  
- ❌ Delete notes  
- 📋 Display notes in a RecyclerView  
- 💾 Local storage using Room database  
- 🎨 Custom app theme  

---

## 🛠️ Built With

- Java  
- Android Studio (Koala version)  
- Room Database  
- RecyclerView  
- Material Components  
- MVVM Architecture (ViewModel + Repository)

---

## 📸 Screenshots

> app.png
> add_note.png
> edit_note.png
> delete_note.png

---

## 📦 How to Run

1. **Clone the repository**
   git clone https://github.com/HanaShams/QuickNote.git

2. **Open in Android Studio**

3. **Sync Gradle** (ensure all dependencies download correctly)

4. **Build and run** on an emulator or physical Android device

---

## 🎨 Customization

To change the app's toolbar and status bar color to **maroon** (or any custom color):

1. In `res/values/colors.xml`, define your color:

   <color name="status_bar_color">#800000</color> <!-- Maroon -->

2. In `res/values/themes.xml`, update your app theme:

  <style name="Base.Theme.QuickNote" parent="Theme.Material3.DayNight.NoActionBar">
    <item name="colorPrimary">@color/status_bar_color</item>
    <item name="colorPrimaryContainer">@color/status_bar_color</item>
    <item name="android:statusBarColor">@color/status_bar_color</item>
   </style>

3. (Optional) In `MainActivity.java`, set the status bar color:

   getWindow().setStatusBarColor(ContextCompat.getColor(this, R.color.status_bar_color));


