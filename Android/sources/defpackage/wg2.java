package defpackage;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;

/* renamed from: wg2  reason: default package */
public final class wg2 extends SuspendLambda implements Function2 {
    public Object a;
    public List b;
    public int c;
    public final /* synthetic */ gh2 o;
    public final /* synthetic */ se2 v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wg2(gh2 gh2, se2 se2, Continuation continuation) {
        super(2, continuation);
        this.o = gh2;
        this.v = se2;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new wg2(this.o, this.v, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((wg2) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        tz9 tz9;
        gh2 gh2;
        List list;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.c;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            KProperty[] kPropertyArr = gh2.P0;
            gh2 gh22 = this.o;
            a32 o2 = gh22.o();
            a89 a89 = o2 != null ? o2.c : null;
            Long valueOf = a89 != null ? Long.valueOf(a89.h()) : null;
            if (valueOf != null) {
                long longValue = valueOf.longValue();
                se2 se2 = this.v;
                z68.c(se2.a, "getHistoryItems: %d", Long.valueOf(longValue));
                list = se2.b.f(longValue);
                this.a = gh22;
                this.b = list;
                this.c = 1;
                if (gh2.m(gh22, list, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                gh2 = gh22;
            }
            return Unit.INSTANCE;
        } else if (i == 1) {
            list = this.b;
            gh2 = (gh2) this.a;
            ResultKt.throwOnFailure(obj);
        } else if (i == 2) {
            tz9 = (tz9) this.a;
            ResultKt.throwOnFailure(obj);
            tz9.setValue(obj);
            return Unit.INSTANCE;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        xme xme = gh2.M0;
        this.a = xme;
        this.b = null;
        this.c = 2;
        Object v2 = gh2.v(list, (Long) null, this);
        if (v2 == coroutine_suspended) {
            return coroutine_suspended;
        }
        xme xme2 = xme;
        obj = v2;
        tz9 = xme2;
        tz9.setValue(obj);
        return Unit.INSTANCE;
    }
}
