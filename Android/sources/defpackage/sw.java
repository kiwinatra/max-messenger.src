package defpackage;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.reflect.KProperty;

/* renamed from: sw  reason: default package */
public final class sw extends SuspendLambda implements Function3 {
    public /* synthetic */ List a;
    public /* synthetic */ long b;
    public final /* synthetic */ gx c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public sw(gx gxVar, Continuation continuation) {
        super(3, continuation);
        this.c = gxVar;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long longValue = ((Number) obj2).longValue();
        sw swVar = new sw(this.c, (Continuation) obj3);
        swVar.a = (List) obj;
        swVar.b = longValue;
        return swVar.invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        List list = this.a;
        long j = this.b;
        KProperty[] kPropertyArr = gx.F;
        gx gxVar = this.c;
        List l = gxVar.l(j);
        kn5 kn5 = gxVar.c;
        if (kn5 != null) {
            StringBuilder n = a81.n("getHistoryItems return ", l.size(), " out of total ", list.size(), " around ");
            n.append(j);
            kn5.c(n.toString());
        }
        return l;
    }
}
