// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   LogisticsOrderSearchRequest.java

package com.jd.open.api.sdk.request.wms;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class LogisticsOrderSearchRequest extends AbstractRequest
        implements JdRequest {

    public LogisticsOrderSearchRequest() {
    }

    public void setReceiptNos(String receiptNos) {
        this.receiptNos = receiptNos;
    }

    public String getReceiptNos() {
        return receiptNos;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public String getApiMethod() {
        return "jingdong.logistics.order.search";
    }

    public String getAppJsonParams()
            throws IOException {
        Map pmap = new TreeMap();
        pmap.put("receipt_nos", receiptNos);
        pmap.put("status", status);
        return JsonUtil.toJson(pmap);
    }

    public Class getResponseClass() {
        return com.jd.open.api.sdk.response.wms.LogisticsOrderSearchResponse.class;
    }

    private String receiptNos;
    private String status;
}
