package defpackage;

import java.util.ArrayList;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;

/* renamed from: nwc  reason: default package */
public final class nwc extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ pwc b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public nwc(pwc pwc, Continuation continuation) {
        super(2, continuation);
        this.b = pwc;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new nwc(this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((nwc) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.a = 1;
            if (xk4.b(50, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1 || i == 2) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        do {
            KProperty[] kPropertyArr = pwc.H0;
            pwc pwc = this.b;
            a80 a80 = (a80) pwc.Y.getValue();
            if (a80 != null) {
                int a2 = pwc.o().a();
                ArrayList arrayList = a80.a;
                double log10 = a2 == 0 ? -45.0d : Math.log10(((double) a2) / ((double) 32768)) * 20.0d;
                if (log10 < -45.0d) {
                    log10 = -45.0d;
                }
                arrayList.add(Integer.valueOf((int) (((log10 - -45.0d) * ((double) 32768)) / 45.0d)));
                a80.a();
            }
            pwc.w0.setValue(Boxing.boxLong((System.currentTimeMillis() - pwc.w) + pwc.v));
            this.a = 2;
        } while (xk4.b(50, this) != coroutine_suspended);
        return coroutine_suspended;
    }
}
