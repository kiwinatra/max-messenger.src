package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: bua  reason: default package */
public final class bua extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ fua b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bua(fua fua, Continuation continuation) {
        super(2, continuation);
        this.b = fua;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        bua bua = new bua(this.b, continuation);
        bua.a = obj;
        return bua;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((bua) create((List) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        fua fua = this.b;
        HashSet<String> hashSet = CollectionsKt.toHashSet((List) this.a);
        pm7 pm7 = fua.h;
        if (pm7 != null) {
            pm7.b((CancellationException) null);
        }
        fua.h = null;
        q04 s0 = ((osa) fua.b).a().s0(1, "folders-counters");
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(hashSet, 10));
        for (String str : hashSet) {
            if (Intrinsics.areEqual((Object) str, (Object) "all.chat.folder")) {
                obj2 = new fs5(3, new cua(str, r14.b));
            } else {
                obj2 = new tx7(new jy5(str, fua.c, fua.a, fua.d, s0).e, str, 1);
            }
            arrayList.add(obj2);
        }
        fua.h = bs0.K(new ps5(new zm4((bs5[]) CollectionsKt.toList(arrayList).toArray(new bs5[0]), 2), new zqa(1, (Object) fua.e), 5), fua.g);
        return Unit.INSTANCE;
    }
}
