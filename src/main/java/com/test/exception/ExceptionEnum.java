package com.test.exception;

public enum ExceptionEnum{

    SUCCESS(200, true, "成功！"),
    SIGNATURE_NOT_MATCH(403,false,"服务器拒绝！"),
    NOT_FOUND(404, false,"未找到该资源!"),
    URL_NOT_FOUND(404, false,"URL不存在！"),
    INTERNAL_SERVER_ERROR(500, false,"服务器内部错误！");

    private final Integer resultCode;
    private final Boolean resultStatus;
    private final String resultMsg;

    ExceptionEnum(Integer resultCode, Boolean resultStatus, String resultMsg) {
        this.resultCode = resultCode;
        this.resultStatus = resultStatus;
        this.resultMsg = resultMsg;
    }



    public Integer getResultCode() { return resultCode;  }
    public Boolean getResultStatus() { return resultStatus; }
    public String getResultMsg() {
        return resultMsg;
    }
}
