package com.example.sky.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

public class Main2Activity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);
        setContentView(R.layout.activity_main2);
        getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE, R.layout.mytitle);
//        findViewById(R.id.fab).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view,"Helloo Snackbar",Snackbar.LENGTH_LONG).show();
//            }
//        });
    }

}
