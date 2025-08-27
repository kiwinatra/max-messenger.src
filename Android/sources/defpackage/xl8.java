package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.chatscreen.mediabar.MediaBarWidget;

/* renamed from: xl8  reason: default package */
public final class xl8 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ MediaBarWidget b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xl8(Continuation continuation, MediaBarWidget mediaBarWidget) {
        super(2, continuation);
        this.b = mediaBarWidget;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        xl8 xl8 = new xl8(continuation, this.b);
        xl8.a = obj;
        return xl8;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((xl8) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        KProperty[] kPropertyArr = MediaBarWidget.c1;
        this.b.u0((prd) this.a);
        return Unit.INSTANCE;
    }
}
