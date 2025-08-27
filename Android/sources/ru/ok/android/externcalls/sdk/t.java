package ru.ok.android.externcalls.sdk;

import ru.ok.android.externcalls.sdk.api.CallInfo;
import ru.ok.android.externcalls.sdk.api.ConversationParams;
import ru.ok.android.externcalls.sdk.api.JoinByIdResponse;

public final /* synthetic */ class t implements qk3 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ ConversationImpl b;
    public final /* synthetic */ rk3 c;
    public final /* synthetic */ ConversationParams o;
    public final /* synthetic */ rk3 v;

    public /* synthetic */ t(ConversationImpl conversationImpl, rk3 rk3, ConversationParams conversationParams, rk3 rk32) {
        this.b = conversationImpl;
        this.c = rk3;
        this.o = conversationParams;
        this.v = rk32;
    }

    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                this.b.lambda$performConfroomJoin$11(this.o, this.c, this.v, (JoinByIdResponse) obj);
                return;
            default:
                this.b.lambda$runStartConversation$17(this.c, this.o, this.v, (CallInfo) obj);
                return;
        }
    }

    public /* synthetic */ t(ConversationImpl conversationImpl, ConversationParams conversationParams, rk3 rk3, rk3 rk32) {
        this.b = conversationImpl;
        this.o = conversationParams;
        this.c = rk3;
        this.v = rk32;
    }
}
