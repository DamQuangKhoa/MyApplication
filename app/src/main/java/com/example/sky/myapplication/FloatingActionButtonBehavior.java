package com.example.sky.myapplication;

import android.content.Context;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Sky on 22/01/2017.
 */

public class FloatingActionButtonBehavior extends CoordinatorLayout.Behavior<FloatingActionButton> {
    public FloatingActionButtonBehavior(Context context, AttributeSet attrs) {}

    @RequiresApi(api = Build.VERSION_CODES.HONEYCOMB)
    public boolean layoutDependsOn(CoordinatorLayout parent, FloatingActionButton child, View dependency) {
        float translationY;

        translationY = Math.min(0, dependency.getTranslationY() - dependency.getHeight());
        child.setTranslationY(translationY);
        return true;
    }
}
