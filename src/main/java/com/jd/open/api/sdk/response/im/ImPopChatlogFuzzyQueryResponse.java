// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ImPopChatlogFuzzyQueryResponse.java

package com.jd.open.api.sdk.response.im;

import com.jd.open.api.sdk.domain.im.ApiService.ChatLogPage;
import com.jd.open.api.sdk.response.AbstractResponse;

public class ImPopChatlogFuzzyQueryResponse extends AbstractResponse {

    public ImPopChatlogFuzzyQueryResponse() {
    }

    public void setChatLog(ChatLogPage ChatLog) {
        this.ChatLog = ChatLog;
    }

    public ChatLogPage getChatLog() {
        return ChatLog;
    }

    private ChatLogPage ChatLog;
}
