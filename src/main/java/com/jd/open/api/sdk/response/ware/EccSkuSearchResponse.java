// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   EccSkuSearchResponse.java

package com.jd.open.api.sdk.response.ware;

import com.jd.open.api.sdk.response.AbstractResponse;

// Referenced classes of package com.jd.open.api.sdk.response.ware:
//            ItemSkuListResult

public class EccSkuSearchResponse extends AbstractResponse {

    public EccSkuSearchResponse() {
    }

    public void setItemSkuResultList(ItemSkuListResult itemSkuResultList) {
        this.itemSkuResultList = itemSkuResultList;
    }

    public ItemSkuListResult getItemSkuResultList() {
        return itemSkuResultList;
    }

    private ItemSkuListResult itemSkuResultList;
}
