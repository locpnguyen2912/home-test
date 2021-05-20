package com.poccupine.hometest.payload;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class CustomPayload implements Serializable {

    private Boolean status = true;
    private String message;
    private Object data;
    private Object pagination;
    private Map<String, Object> extra = new HashMap<>();

    public CustomPayload() {}

    public CustomPayload(Object data) {
        this.data = data;
    }

    public CustomPayload(Object data, Object pagination) {
        this.data = data;
        this.pagination = pagination;
    }

    public CustomPayload(String message, Object data, Object pagination) {
        this.message = message;
        this.data = data;
        this.pagination = pagination;
    }

    public CustomPayload(Boolean status, String message, Object data, Object pagination, Map<String, Object> extra) {
        this.status = status;
        this.message = message;
        this.data = data;
        this.pagination = pagination;
        this.extra = extra;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Object getPagination() {
        return pagination;
    }

    public void setPagination(Object pagination) {
        this.pagination = pagination;
    }

    public Map<String, Object> getExtra() {
        return extra;
    }

    public void setExtra(Map<String, Object> extra) {
        this.extra = extra;
    }

    @Override
    public String toString() {
        return "Payload{" +
                "status=" + status +
                ", message='" + message + '\'' +
                ", data=" + data +
                ", pagination=" + pagination +
                ", extra=" + extra +
                '}';
    }
}
