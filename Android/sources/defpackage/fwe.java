package defpackage;

import java.util.ArrayList;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* renamed from: fwe  reason: default package */
public final class fwe extends SuspendLambda implements Function2 {
    public final /* synthetic */ Function1 a;
    public final /* synthetic */ long b;
    public final /* synthetic */ hwe c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fwe(Function1 function1, long j, hwe hwe, Continuation continuation) {
        super(2, continuation);
        this.a = function1;
        this.b = j;
        this.c = hwe;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new fwe(this.a, this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((fwe) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        wx1 wx1;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        long j = this.b;
        Function1 function1 = this.a;
        if (function1 != null) {
            function1.invoke(Boxing.boxLong(j));
        }
        hwe hwe = this.c;
        Iterable<wx1> iterable = ((rve) hwe.z.getValue()).a;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
        for (wx1 wx12 : iterable) {
            mqe mqe = wx12.b;
            int i = (mqe.a > j ? 1 : (mqe.a == j ? 0 : -1));
            long j2 = wx12.a;
            if (i == 0) {
                wx1 = new wx1(j2, mqe.h(mqe, (ArrayList) null, true, false, 191));
            } else if (mqe.x) {
                wx1 = new wx1(j2, mqe.h(mqe, (ArrayList) null, false, false, 191));
            } else {
                arrayList.add(wx12);
            }
            wx12 = wx1;
            arrayList.add(wx12);
        }
        xme xme = hwe.z;
        rve rve = new rve(arrayList, ((rve) xme.getValue()).b);
        xme.getClass();
        xme.m((Object) null, rve);
        return Unit.INSTANCE;
    }
}
