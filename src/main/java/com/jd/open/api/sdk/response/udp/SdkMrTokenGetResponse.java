// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   SdkMrTokenGetResponse.java

package com.jd.open.api.sdk.response.udp;

import com.jd.open.api.sdk.domain.udp.MRSDKService.ResponseMsg;
import com.jd.open.api.sdk.response.AbstractResponse;

public class SdkMrTokenGetResponse extends AbstractResponse {

    public SdkMrTokenGetResponse() {
    }

    public void setResult(ResponseMsg result) {
        this.result = result;
    }

    public ResponseMsg getResult() {
        return result;
    }

    private ResponseMsg result;
}
