package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: a5f  reason: default package */
public final class a5f extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ h5f b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a5f(h5f h5f, Continuation continuation) {
        super(2, continuation);
        this.b = h5f;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        a5f a5f = new a5f(this.b, continuation);
        a5f.a = obj;
        return a5f;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((a5f) create((bxf) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        bxf bxf = (bxf) this.a;
        String str = this.b.b;
        a67 a67 = z68.b;
        if (a67 != null && a67.c()) {
            w78 w78 = w78.o;
            a67.d(w78, str, "uploadFile: " + bxf, (Throwable) null);
        }
        return Unit.INSTANCE;
    }
}
