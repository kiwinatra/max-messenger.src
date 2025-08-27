package defpackage;

import java.util.concurrent.atomic.AtomicLong;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: dr2  reason: default package */
public final class dr2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ fr2 a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dr2(fr2 fr2, Continuation continuation) {
        super(2, continuation);
        this.a = fr2;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new dr2(this.a, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((dr2) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        fr2 fr2 = this.a;
        AtomicLong atomicLong = fr2.B0;
        String str = fr2.F0;
        String str2 = fr2.G0;
        jna jna = (jna) ((rl) fr2.v.getValue());
        atomicLong.set(jna.z(jna, new z02(((ltb) jna.D()).a.n(), str, str2)));
        return Unit.INSTANCE;
    }
}
