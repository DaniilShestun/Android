package ru.mirea.shestun.lifecycleactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    private String TAG = MainActivity.class.getSimpleName();
    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart()");
    }
}
