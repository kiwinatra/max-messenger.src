package ru.ok.android.externcalls.sdk;

import java.util.Collection;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class s implements rk3 {
    public final /* synthetic */ ConversationImpl a;
    public final /* synthetic */ Boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Function1 d;
    public final /* synthetic */ Function1 e;

    public /* synthetic */ s(ConversationImpl conversationImpl, Boolean bool, boolean z, Function1 function1, Function1 function12) {
        this.a = conversationImpl;
        this.b = bool;
        this.c = z;
        this.d = function1;
        this.e = function12;
    }

    public final void accept(Object obj) {
        this.a.lambda$addParticipants$30(this.b, this.c, this.d, this.e, (Collection) obj);
    }
}
