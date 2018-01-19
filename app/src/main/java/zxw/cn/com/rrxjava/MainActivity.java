package zxw.cn.com.rrxjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.trello.rxlifecycle.components.support.RxAppCompatActivity;


import java.util.ArrayList;

import devin.cn.com.rxjavaretrofit.exception.ApiException;
import devin.cn.com.rxjavaretrofit.http.HttpManager;
import devin.cn.com.rxjavaretrofit.listener.HttpOnNextListener;
import zxw.cn.com.rrxjava.entity.api.CombinApi;
import zxw.cn.com.rrxjava.entity.resulte.BaseResultEntity;
import zxw.cn.com.rrxjava.entity.resulte.SubjectResulte;

public class MainActivity extends RxAppCompatActivity {

    public static final String TAG = "zxw";
    private TextView tvMsg;

    private CombinApi api;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvMsg = findViewById(R.id.tvMsg);
        api = new CombinApi(new HttpOnNextListener() {
            @Override
            public void onNext(String resulte, String method) {
//                if (method.equals(postEntity.getMethod())) {
                    BaseResultEntity<SubjectResulte> subjectResulte = JSONObject.parseObject(resulte, new
                            TypeReference<BaseResultEntity<SubjectResulte>>() {
                            });
                    tvMsg.setText("成功返回：\n"+ subjectResulte.getLocation().toString());
//                }
            }

            @Override
            public void onError(ApiException e, String method) {
                tvMsg.setText("失败："+method+"\ncode=" + e.getCode() + "\nmsg:" + e.getDisplayMessage());
            }
        },this);

        findViewById(R.id.btnObs).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                manager.doHttpDeal(postEntity);
                api.postApi("rest/model/com/yatang/general/GeneralActor/svipShopLocation",null);
            }
        });
    }
}
