package com.robotoworks.example.ghissues.ui;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.Menu;

import com.robotoworks.example.ghissues.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

}
