package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;

/* renamed from: l59  reason: default package */
public final class l59 implements a59, y59 {
    public final eu3 a;
    public final qx2 b;
    public final Lazy c;
    public final Lazy d;
    public final Lazy e;
    public final jx3 f;
    public final AtomicBoolean g = new AtomicBoolean(false);
    public final xme h = f6e.a(CollectionsKt.emptyList());
    public final xme i = f6e.a(CollectionsKt.emptyList());
    public final xme j;
    public final etc k;
    public final n6e l;

    public l59(eu3 eu3, qx2 qx2, o39 o39, gaf gaf, Lazy lazy, Lazy lazy2, Lazy lazy3) {
        this.a = eu3;
        this.b = qx2;
        this.c = lazy;
        this.d = lazy2;
        this.e = lazy3;
        jx3 a2 = e14.a(((osa) gaf).b());
        this.f = a2;
        xme a3 = f6e.a(CollectionsKt.emptyList());
        this.j = a3;
        this.k = new etc(a3);
        this.l = m5a.b(0, 0, (cu0) null, 7);
        bs0.K(new ps5(((u39) o39).c, new c59(this, (Continuation) null), 5), a2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object a(defpackage.l59 r5, kotlin.coroutines.Continuation r6) {
        /*
            r5.getClass()
            boolean r0 = r6 instanceof defpackage.h59
            if (r0 == 0) goto L_0x0016
            r0 = r6
            h59 r0 = (defpackage.h59) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.v = r1
            goto L_0x001b
        L_0x0016:
            h59 r0 = new h59
            r0.<init>(r5, r6)
        L_0x001b:
            java.lang.Object r6 = r0.c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.v
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0041
            if (r2 == r4) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r5 = r0.b
            l59 r1 = r0.a
            kotlin.ResultKt.throwOnFailure(r6)
            goto L_0x0068
        L_0x0033:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x003b:
            l59 r5 = r0.a
            kotlin.ResultKt.throwOnFailure(r6)
            goto L_0x0053
        L_0x0041:
            kotlin.ResultKt.throwOnFailure(r6)
            r0.a = r5
            r0.v = r4
            eu3 r6 = r5.a
            km3 r6 = r6.a
            java.util.List r6 = r6.s()
            if (r6 != r1) goto L_0x0053
            goto L_0x0094
        L_0x0053:
            r2 = r6
            java.util.List r2 = (java.util.List) r2
            xme r4 = r5.h
            r0.a = r5
            r0.b = r6
            r0.v = r3
            r4.setValue(r2)
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            if (r2 != r1) goto L_0x0066
            goto L_0x0094
        L_0x0066:
            r1 = r5
            r5 = r6
        L_0x0068:
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            kotlin.sequences.Sequence r5 = kotlin.collections.CollectionsKt.asSequence(r5)
            wg7 r6 = new wg7
            r2 = 15
            r6.<init>(r2)
            kotlin.sequences.Sequence r5 = kotlin.sequences.SequencesKt.filterNot(r5, r6)
            f14 r6 = defpackage.f14.a
            kotlin.Lazy r6 = r1.e
            java.lang.Object r6 = r6.getValue()
            pjb r6 = (defpackage.pjb) r6
            kotlin.coroutines.CoroutineContext r0 = r0.getContext()
            jx3 r1 = defpackage.e14.a(r0)
            ib r2 = new ib
            r2.<init>((defpackage.jx3) r1, (kotlin.coroutines.CoroutineContext) r0, (defpackage.pjb) r6)
            kotlin.sequences.Sequence r1 = kotlin.sequences.SequencesKt.map(r5, r2)
        L_0x0094:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l59.a(l59, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x008f A[LOOP:0: B:20:0x0089->B:22:0x008f, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object b(defpackage.l59 r5, kotlin.coroutines.Continuation r6) {
        /*
            r5.getClass()
            boolean r0 = r6 instanceof defpackage.j59
            if (r0 == 0) goto L_0x0016
            r0 = r6
            j59 r0 = (defpackage.j59) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.v = r1
            goto L_0x001b
        L_0x0016:
            j59 r0 = new j59
            r0.<init>(r5, r6)
        L_0x001b:
            java.lang.Object r6 = r0.c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.v
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0041
            if (r2 == r4) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r5 = r0.b
            l59 r1 = r0.a
            kotlin.ResultKt.throwOnFailure(r6)
            goto L_0x0072
        L_0x0033:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x003b:
            l59 r5 = r0.a
            kotlin.ResultKt.throwOnFailure(r6)
            goto L_0x005d
        L_0x0041:
            kotlin.ResultKt.throwOnFailure(r6)
            r0.a = r5
            r0.v = r4
            qx2 r6 = r5.b
            my2 r6 = (defpackage.my2) r6
            r62 r6 = r6.n()
            zb2 r2 = new zb2
            r4 = 6
            r2.<init>(r4)
            java.util.ArrayList r6 = r6.B(r2)
            if (r6 != r1) goto L_0x005d
            goto L_0x00a3
        L_0x005d:
            r2 = r6
            java.util.List r2 = (java.util.List) r2
            xme r4 = r5.i
            r0.a = r5
            r0.b = r6
            r0.v = r3
            r4.setValue(r2)
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            if (r2 != r1) goto L_0x0070
            goto L_0x00a3
        L_0x0070:
            r1 = r5
            r5 = r6
        L_0x0072:
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            kotlin.coroutines.CoroutineContext r6 = r0.getContext()
            jx3 r6 = defpackage.e14.a(r6)
            java.util.ArrayList r0 = new java.util.ArrayList
            int r2 = kotlin.collections.CollectionsKt__IterablesKt.collectionSizeOrDefault(r5, 10)
            r0.<init>(r2)
            java.util.Iterator r5 = r5.iterator()
        L_0x0089:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L_0x00a2
            java.lang.Object r2 = r5.next()
            i59 r3 = new i59
            r4 = 0
            r3.<init>(r2, r4, r1)
            r2 = 3
            nk4 r2 = defpackage.ev0.d(r6, r4, r3, r2)
            r0.add(r2)
            goto L_0x0089
        L_0x00a2:
            r1 = r0
        L_0x00a3:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l59.b(l59, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final ArrayList c(l59 l59, List list, String str) {
        l59.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            vk3 vk3 = (vk3) next;
            if (!StringsKt__StringsJVMKt.startsWith$default(String.valueOf(vk3.s()), str, false, 2, (Object) null)) {
                Lazy lazy = l59.d;
                if (!((tld) lazy.getValue()).h(String.valueOf(vk3.f()), str)) {
                    String b2 = hhf.b(vk3.j());
                    if (b2 != null) {
                        if (!((tld) lazy.getValue()).h(b2, str)) {
                        }
                    }
                }
            }
            arrayList.add(next);
        }
        return arrayList;
    }
}
