// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   WarePromotionSearchCatelogyListRequest.java

package com.jd.open.api.sdk.request.ware;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class WarePromotionSearchCatelogyListRequest extends AbstractRequest
        implements JdRequest {

    public WarePromotionSearchCatelogyListRequest() {
    }

    public void setCatelogyId(String catelogyId) {
        this.catelogyId = catelogyId;
    }

    public String getCatelogyId() {
        return catelogyId;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getPage() {
        return page;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getClient() {
        return client;
    }

    public String getApiMethod() {
        return "jingdong.ware.promotion.search.catelogy.list";
    }

    public String getAppJsonParams()
            throws IOException {
        Map pmap = new TreeMap();
        pmap.put("catelogyId", catelogyId);
        pmap.put("page", page);
        pmap.put("pageSize", pageSize);
        pmap.put("client", client);
        return JsonUtil.toJson(pmap);
    }

    public Class getResponseClass() {
        return com.jd.open.api.sdk.response.ware.WarePromotionSearchCatelogyListResponse.class;
    }

    private String catelogyId;
    private Integer page;
    private Integer pageSize;
    private String client;
}
