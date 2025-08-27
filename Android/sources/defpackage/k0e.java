package defpackage;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.RangesKt;

/* renamed from: k0e  reason: default package */
public final class k0e extends SuspendLambda implements Function2 {
    public final /* synthetic */ n0e a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k0e(n0e n0e, Continuation continuation) {
        super(2, continuation);
        this.a = n0e;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new k0e(this.a, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((k0e) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        xme xme;
        Object value;
        LinkedHashMap linkedHashMap;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        n0e n0e = this.a;
        List q = ((eu3) n0e.o.getValue()).a.q(km3.s, km3.v);
        ns3 ns3 = (ns3) n0e.w.getValue();
        ns3.getClass();
        Collections.sort(q, new ls3(ns3, 0));
        do {
            xme = n0e.z;
            value = xme.getValue();
            Map map = (Map) value;
            Iterable<vk3> iterable = q;
            linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10)), 16));
            for (vk3 vk3 : iterable) {
                Long boxLong = Boxing.boxLong(vk3.r());
                long r = vk3.r();
                String t = vk3.t(kl0.b);
                String f = vk3.f();
                if (f == null) {
                    f = "";
                }
                linkedHashMap.put(boxLong, new bp0(r, t, f, vk3.q()));
            }
        } while (!xme.b(value, linkedHashMap));
        return Unit.INSTANCE;
    }
}
