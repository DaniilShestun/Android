package ru.mirea.shestun.multiactivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickNewActivity(View view) {
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        TextView textV1 = (TextView)findViewById(R.id.editText);
        intent.putExtra("key", textV1.getText().toString() );
        startActivity(intent);

    }
}
