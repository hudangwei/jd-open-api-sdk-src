// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   EccUserGetResponse.java

package com.jd.open.api.sdk.response.user;

import com.jd.open.api.sdk.response.AbstractResponse;

// Referenced classes of package com.jd.open.api.sdk.response.user:
//            UserResult

public class EccUserGetResponse extends AbstractResponse {

    public EccUserGetResponse() {
    }

    public void setUserResult(UserResult userResult) {
        this.userResult = userResult;
    }

    public UserResult getUserResult() {
        return userResult;
    }

    private UserResult userResult;
}
