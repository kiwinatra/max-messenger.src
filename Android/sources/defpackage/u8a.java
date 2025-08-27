package defpackage;

import java.util.ArrayList;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: u8a  reason: default package */
public final class u8a extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ x8a b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public u8a(x8a x8a, Continuation continuation) {
        super(2, continuation);
        this.b = x8a;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        u8a u8a = new u8a(this.b, continuation);
        u8a.a = obj;
        return u8a;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((u8a) create((gqd) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        gqd gqd = (gqd) this.a;
        fqd fqd = gqd.a;
        dqd dqd = fqd instanceof dqd ? (dqd) fqd : null;
        Long boxLong = dqd != null ? Boxing.boxLong(dqd.c) : null;
        rnb rnb = gqd.b;
        pnb pnb = rnb instanceof pnb ? (pnb) rnb : null;
        Long boxLong2 = pnb != null ? Boxing.boxLong(pnb.b) : null;
        if (boxLong == null) {
            boxLong = boxLong2;
        }
        xme xme = this.b.w;
        Iterable<q7a> iterable = (Iterable) xme.getValue();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
        for (q7a q7a : iterable) {
            arrayList.add(q7a.w(q7a, boxLong != null && q7a.a == boxLong.longValue()));
        }
        xme.getClass();
        xme.m((Object) null, arrayList);
        return Unit.INSTANCE;
    }
}
