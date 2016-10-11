package com.unit.myapplication.inf;

/**
 * Created by Administrator on 2016/10/11 0011.
 */

public interface BaseView {
    void showMessage(String msg);

    void close();

    void showProgress(String msg);

    void showProgress(String msg, int progress);

    void hideProgress();

    void showErrorMessage(String msg, String content);
}
