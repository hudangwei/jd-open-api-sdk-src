// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   OrderFbpGetRequest.java

package com.jd.open.api.sdk.request.order;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class OrderFbpGetRequest extends AbstractRequest
        implements JdRequest {

    public OrderFbpGetRequest() {
    }

    public String getApiMethod() {
        return "360buy.order.fbp.get";
    }

    public Class getResponseClass() {
        return com.jd.open.api.sdk.response.order.OrderFbpGetResponse.class;
    }

    public String getAppJsonParams()
            throws IOException {
        Map map = new TreeMap();
        map.put("order_id", orderId);
        map.put("optional_fields", optionalFields);
        return JsonUtil.toJson(map);
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOptionalFields() {
        return optionalFields;
    }

    public void setOptionalFields(String optionalFields) {
        this.optionalFields = optionalFields;
    }

    private String orderId;
    private String optionalFields;
}
