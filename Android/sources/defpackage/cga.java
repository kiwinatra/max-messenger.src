package defpackage;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function5;
import kotlin.reflect.KProperty;

/* renamed from: cga  reason: default package */
public final class cga extends SuspendLambda implements Function5 {
    public final /* synthetic */ fga a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cga(fga fga, Continuation continuation) {
        super(5, continuation);
        this.a = fga;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        Integer num = (Integer) obj;
        Integer num2 = (Integer) obj2;
        ((Boolean) obj3).booleanValue();
        ((Number) obj4).intValue();
        return new cga(this.a, (Continuation) obj5).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        KProperty[] kPropertyArr = fga.A0;
        fga fga = this.a;
        fga.getClass();
        List createListBuilder = CollectionsKt.createListBuilder();
        boolean z = ((hq) fga.j()).z() == 0;
        igf k = fga.k(((pid) fga.j()).o());
        igf k2 = fga.k(((pid) fga.j()).n());
        boolean B = ((hq) fga.j()).B();
        s1e s1e = r6;
        s1e s1e2 = new s1e((long) rwa.m, 0, new igf(swa.j), (h1e) null, (ngf) null, (Integer) null, new d1e(z, true), (y0e) null, (ngf) null, 0, 952);
        createListBuilder.add(s1e);
        if (z) {
            createListBuilder.add(new s1e((long) rwa.k, 1, new igf(swa.h), (h1e) null, (ngf) null, (Integer) null, new b1e(k, (Integer) null), (y0e) null, (ngf) null, 0, 952));
            createListBuilder.add(new s1e((long) rwa.d, 1, new igf(swa.c), (h1e) null, (ngf) null, (Integer) null, new b1e(k2, (Integer) null), (y0e) null, (ngf) null, 0, 952));
            igf igf = new igf(swa.n);
            a1e a1e = a1e.a;
            createListBuilder.add(new s1e((long) rwa.s, 1, igf, (h1e) null, (ngf) null, (Integer) null, a1e, (y0e) null, (ngf) null, 0, 952));
            createListBuilder.add(new s1e((long) rwa.w, 0, new igf(swa.q), (h1e) null, (ngf) null, (Integer) null, new d1e(B, true), (y0e) null, (ngf) null, 0, 952));
            createListBuilder.add(new s1e((long) rwa.o, 2, new igf(swa.l), (h1e) null, new igf(swa.k), (Integer) null, a1e, (y0e) null, (ngf) null, 0, 808));
        }
        return CollectionsKt.build(createListBuilder);
    }
}
