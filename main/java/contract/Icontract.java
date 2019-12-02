package contract;

import bean.Bean;

/*
 *@auther:郝世龙
 *@Date: 2019-12-02
 *@Time:8:58
 *@Description:${DESCRIPTION}
 **/public interface Icontract {
    //IView
    public interface IView{
        void success(Bean bean);
    }

    //p
    public interface IPresenter{
        void success(String url);
    }
    //callback
    public interface CallBack{
        void success(String json);
        void error(String er);
    }
}
