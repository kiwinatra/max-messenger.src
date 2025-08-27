package ru.ok.android.externcalls.sdk;

import java.util.Collection;

public final /* synthetic */ class c implements rk3 {
    public final /* synthetic */ ConversationImpl a;
    public final /* synthetic */ Boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ rk3 d;

    public /* synthetic */ c(ConversationImpl conversationImpl, Boolean bool, boolean z, rk3 rk3) {
        this.a = conversationImpl;
        this.b = bool;
        this.c = z;
        this.d = rk3;
    }

    public final void accept(Object obj) {
        this.a.lambda$addParticipant$26(this.b, this.c, this.d, (Collection) obj);
    }
}
