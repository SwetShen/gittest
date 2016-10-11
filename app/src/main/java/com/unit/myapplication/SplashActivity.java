package com.unit.myapplication;

import android.content.Intent;

import com.unit.myapplication.inf.ActivityComponent;
import com.unit.myapplication.inf.SplashContract;

import javax.inject.Inject;

/**
 * Created by Administrator on 2016/10/11 0011.
 */

public class SplashActivity extends AbsBaseActivity implements SplashContract.View {

    @Inject
    SplashPresenter mPresenter;

    @Override
    public void toMainActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    @Override
    public void showMessage(String msg) {
        mPresenter.attachView(this);
        mPresenter.initData();
    }

    @Override
    public void close() {

    }

    @Override
    public void showProgress(String msg) {

    }

    @Override
    public void showProgress(String msg, int progress) {

    }

    @Override
    public void hideProgress() {

    }

    @Override
    public void showErrorMessage(String msg, String content) {

    }

    @Override
    int getContentViewID() {
        return R.layout.activity_splash;
    }

    @Override
    void injectDagger(ActivityComponent activityComponent) {

    }


}
