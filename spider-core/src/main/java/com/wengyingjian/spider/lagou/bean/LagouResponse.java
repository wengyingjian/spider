package com.wengyingjian.spider.lagou.bean;

import java.io.Serializable;

/**
 * Created by wengyingjian on 16/2/21.
 */
public class LagouResponse implements Serializable{
    String msg;
    String success;
    String requestId;
    String resubmitToken;
    String code;
    Content content;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getResubmitToken() {
        return resubmitToken;
    }

    public void setResubmitToken(String resubmitToken) {
        this.resubmitToken = resubmitToken;
    }

    public String getCode() {
        return code;
    }

    public Content getContent() {
        return content;
    }

    public void setContent(Content content) {
        this.content = content;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
