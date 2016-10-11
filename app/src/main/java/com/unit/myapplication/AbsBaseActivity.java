package com.unit.myapplication;

import android.support.v7.app.AppCompatActivity;

import com.unit.myapplication.inf.ActivityComponent;
import com.unit.myapplication.inf.SplashContract;

/**
 * Created by Administrator on 2016/10/11 0011.
 */

public abstract class AbsBaseActivity extends AppCompatActivity implements SplashContract.View {

    abstract int getContentViewID();
    abstract void injectDagger(ActivityComponent activityComponent );

}
