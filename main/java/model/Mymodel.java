package model;

import contract.Icontract;
import util.VolleyUtil;

/*
 *@auther:郝世龙
 *@Date: 2019-12-02
 *@Time:8:48
 *@Description:${DESCRIPTION}
 **/public class Mymodel {
    public void getTo(String url, Icontract.CallBack callBack){
        VolleyUtil.getInstance().toGet(url, callBack);
    }
}
