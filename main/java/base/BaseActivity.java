package base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/*
 *@auther:郝世龙
 *@Date: 2019-12-02
 *@Time:8:43
 *@Description:${DESCRIPTION}
 **/public abstract class BaseActivity<P extends BasePresneter> extends AppCompatActivity {
    public P p;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(Layout());
        p=Payout();
        //绑定
        if (p!=null){
            p.attach(this);
        }
        initView();
        initData();
    }

    protected abstract void initData();

    protected abstract void initView();

    protected abstract int Layout();
    protected abstract P Payout();
    //解绑1

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (p!=null){
            p.Uattach();
            p=null;
        }
    }
}
