package base;

/*
 *@auther:郝世龙
 *@Date: 2019-12-02
 *@Time:8:45
 *@Description:${DESCRIPTION}
 **/public class BasePresneter<V extends BaseActivity> {
    public V v;
    //绑定
    public void attach(V v){
        this.v=v;
    }
    //解绑
    public void Uattach(){
        if (v!=null){
            v=null;
        }
    }
}
