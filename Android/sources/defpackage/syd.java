package defpackage;

import android.graphics.RectF;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: syd  reason: default package */
public final class syd extends SuspendLambda implements Function2 {
    public final /* synthetic */ RectF a;
    public final /* synthetic */ wyd b;
    public final /* synthetic */ String c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public syd(RectF rectF, wyd wyd, String str, Continuation continuation) {
        super(2, continuation);
        this.a = rectF;
        this.b = wyd;
        this.c = str;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new syd(this.a, this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((syd) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        a20 n = m5a.n(this.a);
        wyd wyd = this.b;
        wyd.C0.set(((jna) ((rl) wyd.X.getValue())).N(this.c, n));
        xag.h(wyd.v0, new z2e(new igf(xza.q), Boxing.boxInt(cad.n)));
        return Unit.INSTANCE;
    }
}
