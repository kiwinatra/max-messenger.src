package defpackage;

import java.lang.Thread;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;

/* renamed from: tif  reason: default package */
public final class tif implements ome {
    public final /* synthetic */ lpa a;

    public tif(lpa lpa) {
        this.a = lpa;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x006f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object e(defpackage.ds5 r9, kotlin.coroutines.Continuation r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.sif
            if (r0 == 0) goto L_0x0013
            r0 = r10
            sif r0 = (defpackage.sif) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.v = r1
            goto L_0x0018
        L_0x0013:
            sif r0 = new sif
            r0.<init>(r8, r10)
        L_0x0018:
            java.lang.Object r10 = r0.c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.v
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0043
            if (r2 == r4) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            ds5 r8 = r0.b
            tif r9 = r0.a
            kotlin.ResultKt.throwOnFailure(r10)
        L_0x002f:
            r7 = r9
            r9 = r8
            r8 = r7
            goto L_0x0046
        L_0x0033:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x003b:
            ds5 r8 = r0.b
            tif r9 = r0.a
            kotlin.ResultKt.throwOnFailure(r10)
            goto L_0x0061
        L_0x0043:
            kotlin.ResultKt.throwOnFailure(r10)
        L_0x0046:
            kotlin.coroutines.CoroutineContext r10 = r0.getContext()
            defpackage.kv0.q(r10)
            java.util.List r10 = r8.getValue()
            r0.a = r8
            r0.b = r9
            r0.v = r4
            java.lang.Object r10 = r9.a(r10, r0)
            if (r10 != r1) goto L_0x005e
            return r1
        L_0x005e:
            r7 = r9
            r9 = r8
            r8 = r7
        L_0x0061:
            r0.a = r9
            r0.b = r8
            r0.v = r3
            r5 = 5000(0x1388, double:2.4703E-320)
            java.lang.Object r10 = defpackage.xk4.b(r5, r0)
            if (r10 != r1) goto L_0x002f
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tif.e(ds5, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* renamed from: h */
    public final List getValue() {
        int i;
        lpa lpa = this.a;
        lpa.getClass();
        List mutableListOf = CollectionsKt.mutableListOf(new o94(lpa.c, new igf(flc.oneme_settings_dump_threads), cad.t, (ngf) null, l94.m, 8));
        Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
        Map a2 = fif.a(allStackTraces);
        Iterator it = rif.a.iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            Collection collection = mutableListOf;
            Thread.State state = (Thread.State) it.next();
            long longValue = ((Long) ((EnumMap) lpa.w).computeIfAbsent(state, new yi(19, new duc(22)))).longValue();
            int i2 = flc.oneme_settings_thread_state_count;
            String name = state.name();
            Integer num = (Integer) a2.get(state);
            if (num != null) {
                i = num.intValue();
            }
            o94 o94 = r9;
            o94 o942 = new o94(longValue, new kgf(i2, ArraysKt.toList((T[]) new Object[]{name, Integer.valueOf(i)})), cad.e1, (ngf) null, (ev0) null, 24);
            collection.add(o94);
        }
        Collection collection2 = mutableListOf;
        mutableListOf.add(new o94(lpa.o, new kgf(flc.oneme_settings_thread_state_count, ArraysKt.toList((T[]) new Object[]{"Total", Integer.valueOf(CollectionsKt.sumOfInt(a2.values()))})), cad.e1, (ngf) null, (ev0) null, 24));
        if (!allStackTraces.isEmpty()) {
            for (Map.Entry<Thread, StackTraceElement[]> key : allStackTraces.entrySet()) {
                if (StringsKt__StringsJVMKt.startsWith$default(((Thread) key.getKey()).getName(), "tracer-", false, 2, (Object) null)) {
                    i++;
                }
            }
        }
        mutableListOf.add(new o94(lpa.v, new kgf(flc.oneme_settings_thread_tracer, ArraysKt.toList((T[]) new Object[]{Integer.valueOf(i)})), cad.X0, (ngf) null, (ev0) null, 24));
        return mutableListOf;
    }
}
