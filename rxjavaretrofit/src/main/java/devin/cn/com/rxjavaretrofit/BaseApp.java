package devin.cn.com.rxjavaretrofit;

import android.app.Application;

/**
 * 全局app
 * Created by zengxiaowen on 2018/1/19.
 */

public class BaseApp {
    private static Application application;
    private static boolean debug;


    public static void init(Application app){
        setApplication(app);
        setDebug(true);
    }

    public static void init(Application app,boolean debug){
        setApplication(app);
        setDebug(debug);
    }

    public static Application getApplication() {
        return application;
    }

    private static void setApplication(Application application) {
        BaseApp.application = application;
    }

    public static boolean isDebug() {
        return debug;
    }

    public static void setDebug(boolean debug) {
        BaseApp.debug = debug;
    }
}
