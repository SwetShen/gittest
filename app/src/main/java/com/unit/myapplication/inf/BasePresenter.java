package com.unit.myapplication.inf;

/**
 * Created by Administrator on 2016/10/11 0011.
 */

public interface BasePresenter<T extends BaseView> {

    void attachView(T view);

    void detachView();
}
