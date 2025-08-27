package defpackage;

import kotlin.Lazy;

/* renamed from: la3  reason: default package */
public final class la3 extends xag {
    public final long b;
    public final Lazy c;
    public final etc o;
    public final s85 v = new s85(0);

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x005a, code lost:
        r8 = (java.lang.String[]) r8.toArray(new java.lang.String[0]);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public la3(long r7) {
        /*
            r6 = this;
            r0 = 1
            r1 = 0
            ga3 r2 = defpackage.ga3.a
            q4 r3 = r2.getAccessor()
            java.lang.Class<jq6> r4 = defpackage.jq6.class
            java.lang.Object r3 = r3.g(r4)
            jq6 r3 = (defpackage.jq6) r3
            q4 r2 = r2.getAccessor()
            java.lang.Class<rl> r4 = defpackage.rl.class
            kotlin.Lazy r2 = r2.h(r4)
            r6.<init>()
            r6.b = r7
            r6.c = r2
            java.util.List r7 = kotlin.collections.CollectionsKt.emptyList()
            xme r7 = defpackage.f6e.a(r7)
            etc r8 = new etc
            r8.<init>(r7)
            r6.o = r8
            s85 r8 = new s85
            r8.<init>(r1)
            r6.v = r8
            r3.getClass()
            java.lang.Class<z93> r6 = defpackage.z93.class
            java.util.EnumSet r6 = java.util.EnumSet.noneOf(r6)
            kotlin.Lazy r8 = r3.a
            java.lang.Object r8 = r8.getValue()
            bud r8 = (defpackage.bud) r8
            akd r8 = (defpackage.akd) r8
            r8.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r2 = ru.ok.tamtam.android.prefs.PmsKey.f10availablecomplaints
            java.lang.String r2 = r2.name()
            r3 = 0
            java.util.List r8 = r8.g(r2, r3)
            if (r8 == 0) goto L_0x0066
            java.util.Collection r8 = (java.util.Collection) r8
            java.lang.String[] r2 = new java.lang.String[r1]
            java.lang.Object[] r8 = r8.toArray(r2)
            java.lang.String[] r8 = (java.lang.String[]) r8
            if (r8 != 0) goto L_0x0068
        L_0x0066:
            java.lang.String[] r8 = new java.lang.String[r1]
        L_0x0068:
            int r2 = r8.length
        L_0x0069:
            if (r1 >= r2) goto L_0x0093
            r4 = r8[r1]
            kotlin.Result$Companion r5 = kotlin.Result.Companion     // Catch:{ all -> 0x0078 }
            z93 r4 = defpackage.z93.a(r4)     // Catch:{ all -> 0x0078 }
            java.lang.Object r4 = kotlin.Result.m23constructorimpl(r4)     // Catch:{ all -> 0x0078 }
            goto L_0x0083
        L_0x0078:
            r4 = move-exception
            kotlin.Result$Companion r5 = kotlin.Result.Companion
            java.lang.Object r4 = kotlin.ResultKt.createFailure(r4)
            java.lang.Object r4 = kotlin.Result.m23constructorimpl(r4)
        L_0x0083:
            boolean r5 = kotlin.Result.m29isFailureimpl(r4)
            if (r5 == 0) goto L_0x008a
            r4 = r3
        L_0x008a:
            z93 r4 = (defpackage.z93) r4
            if (r4 == 0) goto L_0x0091
            r6.add(r4)
        L_0x0091:
            int r1 = r1 + r0
            goto L_0x0069
        L_0x0093:
            java.util.ArrayList r8 = new java.util.ArrayList
            int r1 = kotlin.collections.CollectionsKt__IterablesKt.collectionSizeOrDefault(r6, 10)
            r8.<init>(r1)
            java.util.Iterator r6 = r6.iterator()
        L_0x00a0:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L_0x0128
            java.lang.Object r1 = r6.next()
            z93 r1 = (defpackage.z93) r1
            int r2 = r1.ordinal()
            int r1 = r1.ordinal()
            if (r1 == 0) goto L_0x0115
            if (r1 == r0) goto L_0x0106
            r4 = 2
            if (r1 == r4) goto L_0x00f7
            r4 = 3
            if (r1 == r4) goto L_0x00e8
            r4 = 4
            if (r1 == r4) goto L_0x00d9
            r4 = 5
            if (r1 != r4) goto L_0x00d3
            pg3 r1 = new pg3
            int r4 = defpackage.gta.g
            igf r5 = new igf
            r5.<init>(r4)
            og3 r4 = defpackage.og3.b
            r1.<init>(r2, r5, r4)
            goto L_0x0123
        L_0x00d3:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        L_0x00d9:
            pg3 r1 = new pg3
            int r4 = defpackage.gta.j
            igf r5 = new igf
            r5.<init>(r4)
            og3 r4 = defpackage.og3.b
            r1.<init>(r2, r5, r4)
            goto L_0x0123
        L_0x00e8:
            pg3 r1 = new pg3
            int r4 = defpackage.gta.f
            igf r5 = new igf
            r5.<init>(r4)
            og3 r4 = defpackage.og3.b
            r1.<init>(r2, r5, r4)
            goto L_0x0123
        L_0x00f7:
            pg3 r1 = new pg3
            int r4 = defpackage.gta.e
            igf r5 = new igf
            r5.<init>(r4)
            og3 r4 = defpackage.og3.b
            r1.<init>(r2, r5, r4)
            goto L_0x0123
        L_0x0106:
            pg3 r1 = new pg3
            int r4 = defpackage.gta.h
            igf r5 = new igf
            r5.<init>(r4)
            og3 r4 = defpackage.og3.b
            r1.<init>(r2, r5, r4)
            goto L_0x0123
        L_0x0115:
            pg3 r1 = new pg3
            int r4 = defpackage.gta.i
            igf r5 = new igf
            r5.<init>(r4)
            og3 r4 = defpackage.og3.b
            r1.<init>(r2, r5, r4)
        L_0x0123:
            r8.add(r1)
            goto L_0x00a0
        L_0x0128:
            r7.m(r3, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.la3.<init>(long):void");
    }
}
