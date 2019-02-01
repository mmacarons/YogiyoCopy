package com.example.yogiyocopy;

import android.os.Bundle;
import android.widget.LinearLayout;

public class MainActivity extends BaseActivity {

    private android.widget.LinearLayout allLayout;
    private android.widget.LinearLayout oneLayout;
    private android.widget.LinearLayout chickenLayout;
    private android.widget.LinearLayout chineseLayout;
    private android.widget.LinearLayout pizzaLayout;
    private android.widget.LinearLayout koreanLayout;
    private android.widget.LinearLayout bunsikLayout;
    private android.widget.LinearLayout cafeLayout;
    private android.widget.LinearLayout pigfeetLayout;
    private android.widget.LinearLayout japaneseLayout;
    private android.widget.LinearLayout yasikLayout;
    private android.widget.LinearLayout franchiseLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bindViews();
        setupEvents();
        setValues();
    }

    @Override
    public void setupEvents() {


    }

    @Override
    public void setValues() {

    }


    @Override
    public void bindViews() {

        this.franchiseLayout = (LinearLayout) findViewById(R.id.franchiseLayout);
        this.yasikLayout = (LinearLayout) findViewById(R.id.yasikLayout);
        this.japaneseLayout = (LinearLayout) findViewById(R.id.japaneseLayout);
        this.pigfeetLayout = (LinearLayout) findViewById(R.id.pigfeetLayout);
        this.cafeLayout = (LinearLayout) findViewById(R.id.cafeLayout);
        this.bunsikLayout = (LinearLayout) findViewById(R.id.bunsikLayout);
        this.koreanLayout = (LinearLayout) findViewById(R.id.koreanLayout);
        this.pizzaLayout = (LinearLayout) findViewById(R.id.pizzaLayout);
        this.chineseLayout = (LinearLayout) findViewById(R.id.chineseLayout);
        this.chickenLayout = (LinearLayout) findViewById(R.id.chickenLayout);
        this.oneLayout = (LinearLayout) findViewById(R.id.oneLayout);
        this.allLayout = (LinearLayout) findViewById(R.id.allLayout);

    }

}
