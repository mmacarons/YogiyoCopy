package com.example.yogiyocopy;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;

public abstract class BaseActivity extends AppCompatActivity {
    public Context mContext = this;

    public abstract void bindViews();
    public abstract void setupEvents();
    public abstract void setValues();

}
