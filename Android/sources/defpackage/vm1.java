package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: vm1  reason: default package */
public final class vm1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Set a;
    public final /* synthetic */ ym1 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vm1(ws wsVar, ym1 ym1, Continuation continuation) {
        super(2, continuation);
        this.a = wsVar;
        this.b = ym1;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new vm1((ws) this.a, this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((vm1) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [qae, ts] */
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        Set set = this.a;
        if (set.isEmpty()) {
            return MapsKt.emptyMap();
        }
        km3 km3 = ((eu3) this.b.b.getValue()).a;
        km3.d();
        ? qae = new qae(0);
        km3.a.forEach(new gm3((ws) set, qae));
        if (qae.isEmpty()) {
            return MapsKt.emptyMap();
        }
        qae qae2 = new qae(qae.c);
        Iterator it = ((os) qae.entrySet()).iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            long longValue = ((Number) entry.getKey()).longValue();
            vk3 vk3 = (vk3) entry.getValue();
            Long boxLong = Boxing.boxLong(longValue);
            String f = vk3.f();
            if (f == null) {
                f = "";
            }
            long r = vk3.r();
            qae2.put(boxLong, new j0g(r, f, vk3.q(), vk3.B(), vk3.t(kl0.o)));
        }
        return qae2;
    }
}
