package ru.ok.android.externcalls.sdk;

import ru.ok.android.externcalls.sdk.conversation.internal.actions.Prepare;

public final /* synthetic */ class l implements qk3 {
    public final /* synthetic */ ConversationImpl a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ rk3 c;
    public final /* synthetic */ boolean o;
    public final /* synthetic */ rk3 v;

    public /* synthetic */ l(ConversationImpl conversationImpl, boolean z, rk3 rk3, boolean z2, rk3 rk32) {
        this.a = conversationImpl;
        this.b = z;
        this.c = rk3;
        this.o = z2;
        this.v = rk32;
    }

    public final void accept(Object obj) {
        this.a.lambda$prepare$7(this.b, this.c, this.o, this.v, (Prepare.PrepareResult) obj);
    }
}
