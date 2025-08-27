package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: f0f  reason: default package */
public final class f0f extends SuspendLambda implements Function2 {
    public final /* synthetic */ b33 a;
    public final /* synthetic */ Set b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f0f(b33 b33, LinkedHashSet linkedHashSet, Continuation continuation) {
        super(2, continuation);
        this.a = b33;
        this.b = linkedHashSet;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new f0f(this.a, (LinkedHashSet) this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((f0f) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        b33 b33 = this.a;
        boolean z = ((l72) b33.a) == l72.b;
        Set set = this.b;
        Iterable<tze> c = z ? ((o1f) b33.c).c((LinkedHashSet) set) : ((su3) b33.o).c((LinkedHashSet) set);
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(c, 10));
        for (tze t1f : c) {
            arrayList.add(new t1f(t1f, !z));
        }
        return arrayList;
    }
}
