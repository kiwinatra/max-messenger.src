package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.chatscreen.mediabar.MediaBarWidget;

/* renamed from: rl8  reason: default package */
public final class rl8 extends SuspendLambda implements Function2 {
    public final /* synthetic */ MediaBarWidget a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rl8(Continuation continuation, MediaBarWidget mediaBarWidget) {
        super(2, continuation);
        this.a = mediaBarWidget;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new rl8(continuation, this.a);
    }

    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((rl8) create(bool, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        KProperty[] kPropertyArr = MediaBarWidget.c1;
        h88.f(this.a.h0(), MediaBarWidget.d1, (Function1) null);
        return Unit.INSTANCE;
    }
}
