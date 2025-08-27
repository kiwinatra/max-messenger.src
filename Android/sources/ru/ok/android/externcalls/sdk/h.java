package ru.ok.android.externcalls.sdk;

import ru.ok.android.externcalls.sdk.conversation.internal.actions.Prepare;

public final /* synthetic */ class h implements qk3 {
    public final /* synthetic */ ConversationImpl a;
    public final /* synthetic */ rk3 b;
    public final /* synthetic */ rk3 c;

    public /* synthetic */ h(ConversationImpl conversationImpl, rk3 rk3, rk3 rk32) {
        this.a = conversationImpl;
        this.b = rk3;
        this.c = rk32;
    }

    public final void accept(Object obj) {
        this.a.lambda$prepareJoinByLink$9(this.b, this.c, (Prepare.PrepareResult) obj);
    }
}
