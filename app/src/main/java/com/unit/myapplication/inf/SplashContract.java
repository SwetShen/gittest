package com.unit.myapplication.inf;

/**
 * Created by Administrator on 2016/10/11 0011.
 */

public interface SplashContract {

    interface Presenter extends BasePresenter {
        void initData();
    }

    interface View extends BaseView {
        void toMainActivity();
    }
}
