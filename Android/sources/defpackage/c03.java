package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: c03  reason: default package */
public final class c03 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ fu4 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c03(fu4 fu4, Continuation continuation) {
        super(2, continuation);
        this.b = fu4;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        c03 c03 = new c03(this.b, continuation);
        c03.a = obj;
        return c03;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((c03) create((k2b) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        k2b k2b = (k2b) this.a;
        ((xme) this.b.h).setValue(k2b);
        String str = (String) this.b.b;
        a67 a67 = z68.b;
        if (a67 != null && a67.c()) {
            w78 w78 = w78.o;
            a67.d(w78, str, "big_flow: onEach " + k2b + ", isEmitted=true", (Throwable) null);
        }
        return Unit.INSTANCE;
    }
}
