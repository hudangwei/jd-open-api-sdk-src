// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   EccMallRecommendListGetResponse.java

package com.jd.open.api.sdk.response.mall;

import com.jd.open.api.sdk.response.AbstractResponse;

import java.util.List;

public class EccMallRecommendListGetResponse extends AbstractResponse {

    public EccMallRecommendListGetResponse() {
    }

    public void setMallRecommendResults(List MallRecommendResults) {
        this.MallRecommendResults = MallRecommendResults;
    }

    public List getMallRecommendResults() {
        return MallRecommendResults;
    }

    private List MallRecommendResults;
}
