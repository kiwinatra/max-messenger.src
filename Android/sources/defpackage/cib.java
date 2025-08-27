package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;

/* renamed from: cib  reason: default package */
public final class cib extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ jib b;
    public final /* synthetic */ String c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cib(jib jib, String str, Continuation continuation) {
        super(2, continuation);
        this.b = jib;
        this.c = str;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new cib(this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((cib) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        jib jib = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            String str = this.c;
            this.a = 1;
            lw1 lw1 = new lw1(1, IntrinsicsKt.intercepted(this));
            lw1.u();
            KProperty[] kPropertyArr = jib.D0;
            jib.k().d();
            jib.k().h = new l15(jib, str, lw1);
            jib.k().f(str);
            lw1.k(new hw2(6, jib));
            obj = lw1.t();
            if (obj == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(this);
            }
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else if (i == 2) {
            ResultKt.throwOnFailure(obj);
            jib.y0.setValue((List) obj);
            return Unit.INSTANCE;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ArrayList arrayList = new ArrayList();
        for (Object next : (List) obj) {
            ald ald = (ald) next;
            boolean z = false;
            boolean z2 = ald.a == 4;
            if (z2 && ald.v.x()) {
                z = true;
            }
            if (ald.a == 1 || z || (((Boolean) jib.w.invoke()).booleanValue() && z2)) {
                arrayList.add(next);
            }
        }
        jx3 a2 = e14.a(getContext());
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(ev0.d(a2, (q04) null, new bib(it.next(), (Continuation) null, jib), 3));
        }
        this.a = 2;
        obj = j4b.g(arrayList2, this);
        if (obj == coroutine_suspended) {
            return coroutine_suspended;
        }
        jib.y0.setValue((List) obj);
        return Unit.INSTANCE;
    }
}
