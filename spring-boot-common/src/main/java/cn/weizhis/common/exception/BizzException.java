package cn.weizhis.common.exception;

/**
 * Created by minlee on 2018/4/15.
 */
public class BizzException extends Exception {

    private Integer errCode;

    public BizzException(){
        super();
    }

    public BizzException(String message){
        super(message);
    }

    public BizzException(Integer errCode, String message){
        super(message);
        this.setErrCode(errCode);
    }

    public BizzException(String message, Throwable cause){
        super(message, cause);
    }

    public BizzException(Throwable cause){
        super(cause);
    }

    public Integer getErrCode() {
        return errCode;
    }

    public void setErrCode(Integer errCode) {
        this.errCode = errCode;
    }
}
