package zxw.cn.com.rrxjava.entity.api;

import com.trello.rxlifecycle.components.support.RxAppCompatActivity;

import java.util.Map;

import devin.cn.com.rxjavaretrofit.Api.HttpManagerApi;
import devin.cn.com.rxjavaretrofit.http.HttpManager;
import devin.cn.com.rxjavaretrofit.listener.HttpOnNextListener;
import devin.cn.com.rxjavaretrofit.listener.HttpOnNextSubListener;
import zxw.cn.com.rrxjava.http.HttpPostService;

/**
 * 请求数据统一封装类
 * Created by zengxiaowen on 2018/1/19.
 */

public class CombinApi extends HttpManagerApi{
    private HttpManager manager;

    public CombinApi(HttpOnNextListener onNextListener, RxAppCompatActivity appCompatActivity) {
        super(onNextListener, appCompatActivity);
        /*统一设置*/
        setCache(true);
    }

    public CombinApi(HttpOnNextSubListener onNextSubListener, RxAppCompatActivity appCompatActivity) {
        super(onNextSubListener, appCompatActivity);
        /*统一设置*/
        setCache(true);
    }


    /**
     * post请求演示
     * api-1
     * @param url api
     * @param maps 参数
     */
    public void postApi(String url, Map<String,Object> maps) {
        /*也可单独设置请求，会覆盖统一设置*/
        setCache(false);
        setMethod("AppFiftyToneGraph/videoLink");
        HttpPostService httpService = getRetrofit().create(HttpPostService.class);
        if (maps==null) doHttpDeal(httpService.getAllBy(url));
        else doHttpDeal(httpService.getAllBy(url,maps));
    }

    /**
     * post请求演示
     * api-2
     * @param url api
     * @param maps 参数
     */
    public void postApiOther(String url, Map<String,Object> maps) {
        setCache(true);
        setMethod("AppFiftyToneGraph/videoLink");
        HttpPostService httpService = getRetrofit().create(HttpPostService.class);
        if (maps==null) doHttpDeal(httpService.getAllBy(url));
        else doHttpDeal(httpService.getAllBy(url,maps));
    }
}
