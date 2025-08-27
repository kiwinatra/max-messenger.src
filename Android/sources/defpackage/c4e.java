package defpackage;

import kotlin.Lazy;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: c4e  reason: default package */
public final class c4e extends SuspendLambda implements Function2 {
    public final /* synthetic */ String a;
    public final /* synthetic */ d4e b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c4e(String str, d4e d4e, Continuation continuation) {
        super(2, continuation);
        this.a = str;
        this.b = d4e;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new c4e(this.a, this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((c4e) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        Lazy lazy = m65.a;
        xag.h(this.b.v, m65.a(this.a));
        return Unit.INSTANCE;
    }
}
