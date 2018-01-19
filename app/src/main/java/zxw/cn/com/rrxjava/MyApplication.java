package zxw.cn.com.rrxjava;

import android.app.Application;
import devin.cn.com.rxjavaretrofit.BaseApp;

/**
 * Created by zengxiaowen on 2018/1/19.
 */

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        BaseApp.init(this,BuildConfig.DEBUG);
    }
}
