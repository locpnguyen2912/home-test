package com.poccupine.hometest.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

public class ReqPurchaseDTO implements Serializable {
    @JsonProperty("user_id")
    private Long userId;

    @JsonProperty("phone")
    private String phone;

    @JsonProperty("is_paid")
    @NotNull
    private Boolean isPaid;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Boolean getPaid() {
        return isPaid;
    }

    public void setPaid(Boolean paid) {
        isPaid = paid;
    }

    @Override
    public String toString() {
        return "ReqPurchaseDTO{" +
                "userId=" + userId +
                ", phone='" + phone + '\'' +
                ", isPaid=" + isPaid +
                '}';
    }
}
