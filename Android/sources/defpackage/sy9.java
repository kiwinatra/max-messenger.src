package defpackage;

import android.os.Bundle;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: sy9  reason: default package */
public final class sy9 extends SuspendLambda implements Function2 {
    public final /* synthetic */ xy9 a;
    public final /* synthetic */ long b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public sy9(long j, xy9 xy9, Continuation continuation) {
        super(2, continuation);
        this.a = xy9;
        this.b = j;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new sy9(this.b, this.a, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((sy9) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        xy9 xy9 = this.a;
        xq6 xq6 = xy9.i;
        jr8 jr8 = jr8.v;
        Pair a2 = xq6.a((a32) null, jr8);
        po5 po5 = xy9.d;
        long j = this.b;
        xy9.t(po5.d(j).getAbsolutePath(), String.valueOf(j), jr8, (String) a2.getFirst(), (String) a2.getSecond(), (Bundle) null);
        return Unit.INSTANCE;
    }
}
