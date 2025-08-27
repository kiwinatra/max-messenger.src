package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: cn9  reason: default package */
public final class cn9 extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ en9 c;
    public final /* synthetic */ long o;
    public final /* synthetic */ long v;
    public final /* synthetic */ long w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cn9(en9 en9, long j, long j2, long j3, Continuation continuation) {
        super(2, continuation);
        this.c = en9;
        this.o = j;
        this.v = j2;
        this.w = j3;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        cn9 cn9 = new cn9(this.c, this.o, this.v, this.w, continuation);
        cn9.b = obj;
        return cn9;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((cn9) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        d14 d14;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        en9 en9 = this.c;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            d14 = (d14) this.b;
            qx2 qx2 = en9.y;
            this.b = d14;
            this.a = 1;
            r62 n = ((my2) qx2).n();
            Long boxLong = Boxing.boxLong(this.o);
            n.getClass();
            n.d(boxLong.longValue(), x62.o);
            n.i(boxLong.longValue(), false, new fm0(21));
            if (Unit.INSTANCE == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            d14 = (d14) this.b;
            ResultKt.throwOnFailure(obj);
        } else if (i == 2) {
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        sa3 b2 = kne.b();
        CoroutineContext plus = ((osa) en9.w).b().plus(caa.a);
        f14 f14 = f14.c;
        sa3 sa3 = b2;
        Object obj2 = coroutine_suspended;
        an9 an9 = r6;
        an9 an92 = new an9(sa3, this.c, this.o, this.v, this.w, (Continuation) null);
        ev0.c(d14, plus, f14, an9);
        gc8 c2 = ((osa) en9.w).c();
        bn9 bn9 = new bn9(en9, b2, (Continuation) null);
        this.b = null;
        this.a = 2;
        Object I = ev0.I(c2, bn9, this);
        Object obj3 = obj2;
        if (I == obj3) {
            return obj3;
        }
        return Unit.INSTANCE;
    }
}
