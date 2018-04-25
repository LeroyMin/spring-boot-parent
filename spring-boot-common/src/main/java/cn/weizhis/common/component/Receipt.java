package cn.weizhis.common.component;

/**
 * Created by minlee on 2018/3/17.
 */
public class Receipt<T> {
    private T data;

    private Integer code;

    private String msg;

    private Boolean success;

    public Receipt(){
        code = 200;
        success = true;
    }

    public void failure(String msg){
        this.msg = msg;
        this.code = 500;
        this.success = false;
    }

    public void failure(Integer code, String msg){
        this.code = code;
        this.msg = msg;
        this.success = false;
    }

    public void setData(T obj){
        this.data = obj;
    }

    public Receipt success(){
        return this;
    }
}
