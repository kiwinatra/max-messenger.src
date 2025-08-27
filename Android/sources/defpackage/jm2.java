package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import one.me.chatscreen.ChatScreen;

/* renamed from: jm2  reason: default package */
public final class jm2 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ ChatScreen b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jm2(Continuation continuation, ChatScreen chatScreen) {
        super(2, continuation);
        this.b = chatScreen;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        jm2 jm2 = new jm2(continuation, this.b);
        jm2.a = obj;
        return jm2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((jm2) create((as0) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object value;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        as0 as0 = (as0) this.a;
        KProperty[] kPropertyArr = ChatScreen.d1;
        ChatScreen chatScreen = this.b;
        rk9 s0 = chatScreen.s0();
        boolean areEqual = Intrinsics.areEqual((Object) as0.name(), (Object) "SEARCH");
        xme xme = s0.b;
        do {
            value = xme.getValue();
            ((Boolean) value).getClass();
        } while (!xme.b(value, Boolean.valueOf(areEqual)));
        ChatScreen.l0(chatScreen, as0);
        return Unit.INSTANCE;
    }
}
