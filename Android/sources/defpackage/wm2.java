package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.chatscreen.ChatScreen;

/* renamed from: wm2  reason: default package */
public final class wm2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ ChatScreen a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wm2(Continuation continuation, ChatScreen chatScreen) {
        super(2, continuation);
        this.a = chatScreen;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new wm2(continuation, this.a);
    }

    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((wm2) create(bool, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        KProperty[] kPropertyArr = ChatScreen.d1;
        this.a.m0();
        return Unit.INSTANCE;
    }
}
