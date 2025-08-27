package defpackage;

import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Lazy;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: z13  reason: default package */
public final class z13 extends SuspendLambda implements Function2 {
    public final /* synthetic */ a23 a;
    public final /* synthetic */ long b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public z13(a23 a23, long j, Continuation continuation) {
        super(2, continuation);
        this.a = a23;
        this.b = j;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new z13(this.a, this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((z13) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        a23 a23 = this.a;
        String str = a23.a;
        Lazy lazy = a23.c;
        String str2 = a23.a;
        StringBuilder sb = new StringBuilder("cancelAllRunningDraftTasks for chat ");
        long j = this.b;
        sb.append(j);
        z68.c(str, sb.toString(), new Object[0]);
        try {
            List<tdf> i = ((eef) lazy.getValue()).i(a23.d);
            int size = i.size();
            z68.c(str2, "cancelAllRunningDraftTasks: all tasks count = " + size, new Object[0]);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (tdf tdf : i) {
                hdb hdb = tdf.f;
                if (hdb instanceof qt4) {
                    if (((qt4) hdb).o == j) {
                    }
                } else if (hdb instanceof vt4) {
                    if (((vt4) hdb).o != j) {
                    }
                }
                linkedHashSet.add(Boxing.boxLong(tdf.a));
            }
            ((eef) lazy.getValue()).e(linkedHashSet);
            int size2 = linkedHashSet.size();
            z68.c(str2, "cancelAllRunningDraftTasks: removed tasks count = " + size2, new Object[0]);
        } catch (Throwable th) {
            z68.f(str2, "cancelAllRunningDraftTasks: error!", th);
        }
        return Unit.INSTANCE;
    }
}
