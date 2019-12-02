package presenter;

import android.app.Application;
import android.util.Log;

import com.bawei.day02ks.MainActivity;
import com.google.gson.Gson;

import base.BasePresneter;
import bean.Bean;
import contract.Icontract;
import model.Mymodel;

/*
 *@auther:郝世龙
 *@Date: 2019-12-02
 *@Time:8:48
 *@Description:${DESCRIPTION}
 **/public class MyPresenter extends BasePresneter implements Icontract.IPresenter {
    Mymodel mymodel;

    public MyPresenter() {
        mymodel=new Mymodel();
    }

    @Override
    public void success(String url) {
        mymodel.getTo(url, new Icontract.CallBack() {
            @Override
            public void success(String json) {
                //解析
                Gson gson=new Gson();
                Bean bean = gson.fromJson(json, Bean.class);
                Log.i("aa","gson"+gson);
                Log.i("aa","json"+json);
                MainActivity activity= (MainActivity) v;
                activity.success(bean);
            }

            @Override
            public void error(String er) {

            }
        });
    }
}
