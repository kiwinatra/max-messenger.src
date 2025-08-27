package defpackage;

import java.util.ArrayList;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: qpe  reason: default package */
public final class qpe extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ upe b;
    public final /* synthetic */ Long c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qpe(upe upe, Long l, Continuation continuation) {
        super(2, continuation);
        this.b = upe;
        this.c = l;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        qpe qpe = new qpe(this.b, this.c, continuation);
        qpe.a = obj;
        return qpe;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((qpe) create((Pair) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        Pair pair = (Pair) this.a;
        bqe bqe = (bqe) pair.component1();
        xme xme = this.b.z0;
        boolean booleanValue = ((Boolean) pair.component2()).booleanValue();
        long j = bqe.a;
        String str = bqe.b;
        if (str == null) {
            str = "";
        }
        mgf mgf = new mgf(str);
        Iterable<boe> iterable = bqe.h;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
        for (boe k : iterable) {
            arrayList.add(upe.k(k, false, this.c));
        }
        mqe mqe = new mqe(j, mgf, bqe.c, (Integer) null, arrayList, booleanValue ? lqe.b : lqe.o, false, false, 200);
        xme.getClass();
        xme.m((Object) null, mqe);
        return Unit.INSTANCE;
    }
}
