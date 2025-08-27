package defpackage;

import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: ukd  reason: default package */
public final class ukd extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ wkd b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ukd(wkd wkd, Continuation continuation) {
        super(2, continuation);
        this.b = wkd;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        ukd ukd = new ukd(this.b, continuation);
        ukd.a = obj;
        return ukd;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ukd) create((qkd) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        fu4 fu4;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        qkd qkd = (qkd) this.a;
        boolean z = qkd instanceof pkd;
        wkd wkd = this.b;
        if (z) {
            fu4 fu42 = wkd.o;
            sk2 sk2 = ((pkd) qkd).a;
            rk2 rk2 = (rk2) fu42.c;
            rk2.getClass();
            if (sk2.a == rk2.i) {
                rk2.h = true;
                rk2.k = sk2.v;
                rk2.c = sk2.b;
                rk2.j = sk2.o;
                ArrayList arrayList = rk2.f;
                arrayList.addAll(sk2.c);
                if (rk2.k > 0) {
                    if (rk2.d == 0) {
                        rk2.d = 1;
                        if (1 + 1 <= arrayList.size() && rk2.g != null) {
                            he9 he9 = (he9) arrayList.get(rk2.d - 1);
                        }
                    }
                    fu4 fu43 = rk2.g;
                    if (fu43 != null) {
                        fu43.k(rk2.d, rk2.k);
                    }
                    fu4 fu44 = rk2.g;
                    if (fu44 != null) {
                        fu44.m((he9) arrayList.get(rk2.d - 1));
                    }
                }
                if (rk2.k == 0 && (fu4 = rk2.g) != null) {
                    fu4.n();
                }
            }
        } else if (qkd instanceof okd) {
            fu4 fu45 = wkd.o;
            hj0 hj0 = ((okd) qkd).a;
            fu45.getClass();
            long j = hj0.a;
            rk2 rk22 = (rk2) fu45.c;
            if (j == rk22.i) {
                rk22.a();
                fu4 fu46 = rk22.g;
                if (fu46 != null) {
                    fu46.n();
                }
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.INSTANCE;
    }
}
