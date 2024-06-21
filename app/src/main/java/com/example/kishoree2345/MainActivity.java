package com.example.kishoree2345;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.appsflyer.AppsFlyerLib;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AppsFlyerLib.getInstance().setDebugLog(true);
        AppsFlyerLib.getInstance().init("fb8Q2zo9PAxeMYGSwXo6Bo", null, this);
        AppsFlyerLib.getInstance().start(this);
    }
    }
