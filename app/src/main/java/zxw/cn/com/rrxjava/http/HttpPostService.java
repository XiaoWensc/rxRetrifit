package zxw.cn.com.rrxjava.http;

import java.util.Map;

import retrofit2.http.GET;
import retrofit2.http.HTTP;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;
import retrofit2.http.Url;
import rx.Observable;

/**
 * 测试接口service-post相关
 * Created by zengxiaowen on 2018/1/19.
 */

public interface HttpPostService {

    @POST
    Observable<String> getAllBy(@Url String url);


    @POST
    Observable<String> getAllBy(@Url String url, @QueryMap Map<String ,Object> maps);

}
