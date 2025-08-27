package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* renamed from: et2  reason: default package */
public final class et2 extends SuspendLambda implements Function1 {
    public final /* synthetic */ wt2 a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public et2(wt2 wt2, Continuation continuation) {
        super(1, continuation);
        this.a = wt2;
    }

    public final Continuation create(Continuation continuation) {
        return new et2(this.a, continuation);
    }

    public final Object invoke(Object obj) {
        return ((et2) create((Continuation) obj)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        wt2 wt2 = this.a;
        ArrayList e = wt2.a.e();
        boolean z = CollectionsKt.lastOrNull(e) instanceof fz6;
        ArrayList arrayList = new ArrayList();
        Iterator it = e.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof xk2) {
                arrayList.add(next);
            }
        }
        List plus = CollectionsKt.plus(wt2.Z, CollectionsKt.sortedWith(arrayList, new cx4(13)));
        ss2 ss2 = new ss2(plus, z);
        String str = wt2.x0;
        a67 a67 = z68.b;
        if (a67 != null && a67.c()) {
            a67.d(w78.o, str, wj6.h(plus.size(), "emitHistory "), (Throwable) null);
        }
        xme xme = wt2.v0;
        xme.getClass();
        xme.m((Object) null, ss2);
        wt2.X.set(e.isEmpty() && !z);
        return Unit.INSTANCE;
    }
}
