package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: khb  reason: default package */
public final class khb extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ whb b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public khb(whb whb, Continuation continuation) {
        super(2, continuation);
        this.b = whb;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        khb khb = new khb(this.b, continuation);
        khb.a = obj;
        return khb;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((khb) create((Map) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        Map map = (Map) this.a;
        this.b.y.setValue(map);
        xme xme = this.b.X;
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            long longValue = ((Number) entry.getKey()).longValue();
            a32 a32 = (a32) entry.getValue();
            long g = a32.g();
            String r = a32.r();
            String h = a32.h(kl0.a, jl0.a);
            if (h == null) {
                h = "";
            }
            a32.m0();
            linkedHashMap.put(key, new njb(longValue, g, a32.v0, r, h));
        }
        xme.getClass();
        xme.m((Object) null, linkedHashMap);
        return Unit.INSTANCE;
    }
}
