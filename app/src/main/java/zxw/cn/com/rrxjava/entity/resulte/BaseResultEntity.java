package zxw.cn.com.rrxjava.entity.resulte;

/**
 * 回调信息统一封装类
 * Created by zengxiaowen on 2018/1/19.
 */

public class BaseResultEntity<T> {
    private String sessionConfirmationNumber;
    private String shopId;
    private T location;

    public String getSessionConfirmationNumber() {
        return sessionConfirmationNumber;
    }

    public void setSessionConfirmationNumber(String sessionConfirmationNumber) {
        this.sessionConfirmationNumber = sessionConfirmationNumber;
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public T getLocation() {
        return location;
    }

    public void setLocation(T location) {
        this.location = location;
    }
}
