package defpackage;

import java.util.HashMap;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;

/* renamed from: s2c  reason: default package */
public final class s2c extends SuspendLambda implements Function2 {
    public final /* synthetic */ z2c a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public s2c(z2c z2c, Continuation continuation) {
        super(2, continuation);
        this.a = z2c;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new s2c(this.a, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((s2c) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        KProperty[] kPropertyArr = z2c.C0;
        z2c z2c = this.a;
        a32 k = z2c.k();
        if (k == null) {
            return Unit.INSTANCE;
        }
        if (!k.a0()) {
            return Unit.INSTANCE;
        }
        z2c.v0.set(((jna) ((rl) z2c.v.getValue())).o(k.a, k.b.a, 0, (String) null, true, (HashMap) null));
        return Unit.INSTANCE;
    }
}
