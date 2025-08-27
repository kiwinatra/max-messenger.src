package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;

/* renamed from: js2  reason: default package */
public final class js2 implements i74 {
    public final Lazy a;
    public final Lazy b;
    public final Lazy c;

    public js2(Lazy lazy, Lazy lazy2, Lazy lazy3) {
        this.a = lazy;
        this.b = lazy2;
        this.c = lazy3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(java.util.Set r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.is2
            if (r0 == 0) goto L_0x0013
            r0 = r7
            is2 r0 = (defpackage.is2) r0
            int r1 = r0.o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.o = r1
            goto L_0x0018
        L_0x0013:
            is2 r0 = new is2
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.o
            r3 = 1
            if (r2 == 0) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            js2 r5 = r0.a
            kotlin.ResultKt.throwOnFailure(r7)
            goto L_0x00af
        L_0x002c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0034:
            kotlin.ResultKt.throwOnFailure(r7)
            kotlin.Lazy r7 = r5.b
            java.lang.Object r7 = r7.getValue()
            fu2 r7 = (defpackage.fu2) r7
            au2 r2 = r5.b()
            r0.a = r5
            r0.o = r3
            my2 r7 = (defpackage.my2) r7
            r62 r0 = r7.n()
            r0.getClass()
            if (r6 == 0) goto L_0x009a
            boolean r3 = r6.isEmpty()
            if (r3 == 0) goto L_0x0059
            goto L_0x009a
        L_0x0059:
            r0.f()
            java.util.concurrent.ConcurrentHashMap r0 = r0.f
            java.util.Objects.requireNonNull(r0)
            boolean r3 = r6.isEmpty()
            if (r3 == 0) goto L_0x006c
            java.util.List r6 = java.util.Collections.emptyList()
            goto L_0x009e
        L_0x006c:
            java.util.ArrayList r3 = new java.util.ArrayList
            int r4 = r6.size()
            r3.<init>(r4)
            java.util.Iterator r6 = r6.iterator()
        L_0x0079:
            boolean r4 = r6.hasNext()
            if (r4 == 0) goto L_0x0098
            java.lang.Object r4 = r6.next()
            java.lang.Long r4 = (java.lang.Long) r4     // Catch:{ all -> 0x0091 }
            java.lang.Object r4 = r0.get(r4)     // Catch:{ all -> 0x0091 }
            a32 r4 = (defpackage.a32) r4     // Catch:{ all -> 0x0091 }
            if (r4 == 0) goto L_0x0079
            r3.add(r4)     // Catch:{ all -> 0x0091 }
            goto L_0x0079
        L_0x0091:
            r5 = move-exception
            java.lang.RuntimeException r6 = new java.lang.RuntimeException
            r6.<init>(r5)
            throw r6
        L_0x0098:
            r6 = r3
            goto L_0x009e
        L_0x009a:
            java.util.List r6 = java.util.Collections.emptyList()
        L_0x009e:
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            kotlin.sequences.Sequence r6 = kotlin.collections.CollectionsKt.asSequence(r6)
            kotlin.sequences.Sequence r6 = r7.j(r6, r2)
            java.util.List r7 = kotlin.sequences.SequencesKt.toList(r6)
            if (r7 != r1) goto L_0x00af
            return r1
        L_0x00af:
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r7 = r7.iterator()
        L_0x00ba:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x00e1
            java.lang.Object r0 = r7.next()
            r1 = r0
            a32 r1 = (defpackage.a32) r1
            boolean r2 = r1.i0()
            if (r2 == 0) goto L_0x00ba
            boolean r2 = r1.f0()
            if (r2 == 0) goto L_0x00ba
            m72 r1 = r1.b
            long r1 = r1.k
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x00ba
            r6.add(r0)
            goto L_0x00ba
        L_0x00e1:
            java.util.ArrayList r5 = r5.d(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.js2.a(java.util.Set, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final au2 b() {
        zx5 a2 = ((ct2) this.a.getValue()).a();
        if (a2.b()) {
            return yt2.a;
        }
        return new zt2(a2.Y, a2.w, a2.Z, a2.v0, a2.y0);
    }

    public final List c(long j, gz6 gz6, int i, int i2, long j2, long j3) {
        return d(((my2) ((fu2) this.b.getValue())).s(b(), j, gz6 != null ? Long.valueOf(gz6.getId()) : null, i2));
    }

    public final ArrayList d(List list) {
        Iterable<a32> iterable = list;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
        for (a32 a2 : iterable) {
            arrayList.add(((cu2) this.c.getValue()).a(a2));
        }
        return arrayList;
    }
}
