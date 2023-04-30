# Android Fragments with Bottom Navigation

This is a simple Android application that demonstrates how to use fragments and bottom navigation to switch between different views in your app. The app contains three buttons at the bottom of the screen for navigating between three fragments: FirstFragment, SecondFragment, and ThirdFragment.

## Setup

1. Create a new Android Studio project with an Empty Activity.
2. Add the following dependencies in your app-level build.gradle file: `implementation 'com.google.android.material:material:1.4.0`

3. Sync your project to ensure the dependencies are properly added.

## Creating the Fragments

1. In the project's `java` folder, create three new classes: FirstFragment, SecondFragment, and ThirdFragment. Make sure each of these classes extend `Fragment` and override the `onCreateView` method.
2. In the project's `res/layout` folder, create three new XML layout files: fragment_first.xml, fragment_second.xml, and fragment_third.xml. Design the layout for each fragment according to your preferences.

## Adding Bottom Navigation

1. In the activity_main.xml file, add a BottomNavigationView widget below the existing ConstraintLayout. Assign it an ID, such as "bottom_navigation".

```xml
<com.google.android.material.bottomnavigation.BottomNavigationView
    android:id="@+id/bottom_navigation"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    app:menu="@menu/bottom_navigation_menu" />
```
2. Create a new resource directory named menu and a new menu resource file called bottom_navigation_menu.xml. Add three `menu` items for the FirstFragment, 
   
```xml
<menu xmlns:android="http://schemas.android.com/apk/res/android">
    <item
        android:id="@+id/firstFragment"
        android:title="First" />
    <item
        android:id="@+id/secondFragment"
        android:title="Second" />
    <item
        android:id="@+id/thirdFragment"
        android:title="Third" />
</menu>
```
3. In the MainActivity class, set up the BottomNavigationView to handle navigation between fragments:
```java
BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
bottomNavigationView.setOnNavigationItemSelectedListener(navListener);

// Set the initial fragment
getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new FirstFragment()).commit();

private final BottomNavigationView.OnNavigationItemSelectedListener navListener =
    item -> {
        Fragment selectedFragment = null;
        switch (item.getItemId()) {
            case R.id.firstFragment:
                selectedFragment = new FirstFragment();
                break;
            case R.id.secondFragment:
                selectedFragment = new SecondFragment();
                break;
            case R.id.thirdFragment:
                selectedFragment = new ThirdFragment();
                break;
        }
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, selectedFragment).commit();
        return true;
    };
```
4. Run the app on an emulator or physical device. You should see the bottom navigation with three buttons, and you can switch between the fragments by clicking on the buttons.
```vbnet
This README file provides step-by-step instructions to create an Android app with bottom navigation and 3 fragments. Follow these instructions to create the desired functionality in your app.
```
