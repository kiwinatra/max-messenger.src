package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;

/* renamed from: bgb  reason: default package */
public final class bgb extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ egb b;
    public final /* synthetic */ a32 c;
    public final /* synthetic */ long[] o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bgb(egb egb, a32 a32, long[] jArr, Continuation continuation) {
        super(2, continuation);
        this.b = egb;
        this.c = a32;
        this.o = jArr;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new bgb(this.b, this.c, this.o, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((bgb) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            KProperty[] kPropertyArr = egb.l;
            egb egb = this.b;
            if (!((rh3) egb.f.getValue()).e()) {
                n6e n6e = egb.g;
                yfb yfb = yfb.a;
                this.a = 1;
                if (n6e.a(yfb, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                egb.i.set(((jna) ((rl) egb.b.getValue())).e(egb.a, this.c.b.a, ArraysKt.toList(this.o), true));
                return Unit.INSTANCE;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.INSTANCE;
    }
}
