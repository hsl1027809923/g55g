package util;

import android.util.Log;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import app.MyApp;
import contract.Icontract;

/*
 *@auther:郝世龙
 *@Date: 2019-12-02
 *@Time:8:49
 *@Description:${DESCRIPTION}
 **/public class VolleyUtil {
    //队列
    RequestQueue queue= Volley.newRequestQueue(MyApp.context);
    //单例模式
    private static class VolleyUU{
        private static final VolleyUtil util=new VolleyUtil();
    }
    private VolleyUtil() {
    }

    public static VolleyUtil getInstance() {
        return VolleyUU.util;
    }
    //get请求
    public void toGet(String url, final Icontract.CallBack callBack){
        StringRequest request=new StringRequest(1, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                callBack.success(response);
                Log.i("response",response);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                callBack.error(error.getMessage());
            }
        });
        queue.add(request);
    }
}
