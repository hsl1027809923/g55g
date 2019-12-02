package com.bawei.day02ks;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import base.BaseActivity;
import base.BasePresneter;
import bean.Bean;
import contract.Icontract;
import presenter.MyPresenter;

public class MainActivity extends BaseActivity implements Icontract.IView {


    private MyPresenter myPresenter;

    @Override
    protected void initData() {
        myPresenter.success("http://172.17.8.100/small/commodity/v1/bannerShow");
    }

    @Override
    protected void initView() {

    }

    @Override
    protected int Layout() {
        return R.layout.activity_main;
    }

    @Override
    protected BasePresneter Payout() {
        myPresenter = new MyPresenter();
        return myPresenter;
    }

    @Override
    public void success(Bean bean) {

    }
}
