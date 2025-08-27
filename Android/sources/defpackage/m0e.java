package defpackage;

import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: m0e  reason: default package */
public final class m0e extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ n0e b;
    public final /* synthetic */ long c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m0e(n0e n0e, long j, Continuation continuation) {
        super(2, continuation);
        this.b = n0e;
        this.c = j;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new m0e(this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((m0e) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object value;
        Map mutableMap;
        long j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        n0e n0e = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            xme xme = n0e.z;
            do {
                value = xme.getValue();
                mutableMap = MapsKt.toMutableMap((Map) value);
                j = this.c;
                mutableMap.remove(Boxing.boxLong(j));
            } while (!xme.b(value, mutableMap));
            this.a = 1;
            if (((rs3) n0e.x.getValue()).a(j) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        xag.h(n0e.w0, new zzd(new igf(vza.f)));
        return Unit.INSTANCE;
    }
}
