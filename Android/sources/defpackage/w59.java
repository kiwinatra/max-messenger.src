package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* renamed from: w59  reason: default package */
public final class w59 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ x59 b;
    public final /* synthetic */ boolean c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public w59(x59 x59, boolean z, Continuation continuation) {
        super(2, continuation);
        this.b = x59;
        this.c = z;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        w59 w59 = new w59(this.b, this.c, continuation);
        w59.a = obj;
        return w59;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((w59) create((d39) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        d39 d39 = (d39) this.a;
        KProperty[] kPropertyArr = x59.I0;
        x59 x59 = this.b;
        a32 m = x59.m();
        if (m == null) {
            return Unit.INSTANCE;
        }
        if (Intrinsics.areEqual((Object) d39, (Object) b39.a)) {
            aje g = xag.g(x59, ((osa) x59.x).a(), (f14) null, new u59(x59, m, (Continuation) null), 2);
            x59.A0.setValue(x59, x59.I0[1], g);
        } else if (!Intrinsics.areEqual((Object) d39, (Object) c39.a)) {
            throw new NoWhenBranchMatchedException();
        } else if (!this.c) {
            return Unit.INSTANCE;
        } else {
            aje g2 = xag.g(x59, ((osa) x59.x).a(), (f14) null, new v59(x59, m, (Continuation) null), 2);
            x59.B0.setValue(x59, x59.I0[2], g2);
        }
        return Unit.INSTANCE;
    }
}
