package com.skooltchdev.multiplechoicequiz;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;

public class SelectMajor  extends android.app.Activity{

    private final String ACTIVITY_TAG = "SelectMajor";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.w(ACTIVITY_TAG, "inside onStart()");
        setContentView(R.layout.select_major);
    }

    public void goBack(View v) {
        this.finish();
    }
}