// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   EccCategoryGetResponse.java

package com.jd.open.api.sdk.response.category;

import com.jd.open.api.sdk.request.category.CategoryResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class EccCategoryGetResponse extends AbstractResponse {

    public EccCategoryGetResponse() {
    }

    public void setCategoryResult(CategoryResult categoryResult) {
        this.categoryResult = categoryResult;
    }

    public CategoryResult getCategoryResult() {
        return categoryResult;
    }

    private CategoryResult categoryResult;
}
