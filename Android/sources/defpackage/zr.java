package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* renamed from: zr  reason: default package */
public final class zr extends SuspendLambda implements Function2 {
    public final /* synthetic */ as a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zr(as asVar, Continuation continuation) {
        super(2, continuation);
        this.a = asVar;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new zr(this.a, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((zr) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object value;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        as asVar = this.a;
        KProperty[] kPropertyArr = as.H0;
        kf0 kf0 = asVar.o() ? this.a.x0 : this.a.w0;
        Iterable<y32> values = (this.a.o() ? this.a.Z : this.a.v0).values();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(values, 10));
        for (y32 y32 : values) {
            kf0 kf02 = y32.b;
            arrayList.add(new y32(Boolean.valueOf(Intrinsics.areEqual((Object) kf0, (Object) kf02)), kf02, y32.c, y32.o));
        }
        xme xme = this.a.F0;
        do {
            value = xme.getValue();
            List list = (List) value;
        } while (!xme.b(value, arrayList));
        return Unit.INSTANCE;
    }
}
