package defpackage;

/* renamed from: os2  reason: default package */
public final class os2 {
    public final x23 a;

    public os2(x23 x23) {
        this.a = x23;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:133:0x01da, code lost:
        if (r0 != false) goto L_0x01dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x01fe, code lost:
        if (r0 != false) goto L_0x01dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x021d, code lost:
        if (r0 != false) goto L_0x01dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0239, code lost:
        if (r0 != false) goto L_0x01dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0248, code lost:
        if (r0 != false) goto L_0x01dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x0259, code lost:
        if (r0 != false) goto L_0x01dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0019, code lost:
        r0 = r10.m();
     */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x019f  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x0264  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x0281  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x0284  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x0292  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x00ba A[EDGE_INSN: B:198:0x00ba->B:58:0x00ba ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00f0 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0136  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(java.util.Set r8, java.util.Map r9, defpackage.a32 r10) {
        /*
            r7 = this;
            boolean r0 = r8.isEmpty()
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            q82 r0 = defpackage.q82.y
            boolean r0 = r8.contains(r0)
            r2 = 1
            if (r0 == 0) goto L_0x0017
            boolean r0 = r10.N()
            if (r0 != 0) goto L_0x0019
        L_0x0017:
            r0 = r1
            goto L_0x002c
        L_0x0019:
            vk3 r0 = r10.m()
            if (r0 == 0) goto L_0x0017
            boolean r0 = r0.c()
            if (r0 == 0) goto L_0x0017
            boolean r0 = r10.J()
            if (r0 != 0) goto L_0x0017
            r0 = r2
        L_0x002c:
            if (r0 != 0) goto L_0x0055
            q82 r0 = defpackage.q82.z
            boolean r0 = r8.contains(r0)
            if (r0 == 0) goto L_0x003c
            boolean r0 = r10.N()
            if (r0 != 0) goto L_0x003e
        L_0x003c:
            r0 = r1
            goto L_0x0055
        L_0x003e:
            vk3 r0 = r10.m()
            if (r0 == 0) goto L_0x003c
            vm3 r0 = r0.a
            um3 r0 = r0.c
            tm3 r0 = r0.k
            tm3 r3 = defpackage.tm3.b
            if (r0 != r3) goto L_0x003c
            boolean r0 = r10.J()
            if (r0 != 0) goto L_0x003c
            r0 = r2
        L_0x0055:
            if (r0 != 0) goto L_0x0068
            q82 r0 = defpackage.q82.X
            boolean r0 = r8.contains(r0)
            if (r0 == 0) goto L_0x0067
            boolean r0 = r10.J()
            if (r0 == 0) goto L_0x0067
            r0 = r2
            goto L_0x0068
        L_0x0067:
            r0 = r1
        L_0x0068:
            if (r0 != 0) goto L_0x007d
            q82 r0 = defpackage.q82.v
            boolean r0 = r8.contains(r0)
            if (r0 == 0) goto L_0x007a
            boolean r0 = r10.K()
            if (r0 == 0) goto L_0x007a
            r0 = r2
            goto L_0x007b
        L_0x007a:
            r0 = r1
        L_0x007b:
            r3 = r0
            goto L_0x007e
        L_0x007d:
            r3 = r1
        L_0x007e:
            if (r0 != 0) goto L_0x00f6
            q82 r0 = defpackage.q82.w
            boolean r0 = r8.contains(r0)
            if (r0 == 0) goto L_0x00be
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L_0x008f
            goto L_0x00ad
        L_0x008f:
            java.util.Iterator r0 = r8.iterator()
        L_0x0093:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x00ad
            java.lang.Object r4 = r0.next()
            q82 r4 = (defpackage.q82) r4
            cd4 r5 = defpackage.q82.a
            r5.getClass()
            java.util.LinkedHashSet r5 = defpackage.q82.c
            boolean r4 = r5.contains(r4)
            if (r4 == 0) goto L_0x0093
            goto L_0x00be
        L_0x00ad:
            boolean r0 = r10.L()
            if (r0 != 0) goto L_0x00bc
            boolean r0 = r10.R()
            if (r0 == 0) goto L_0x00ba
            goto L_0x00bc
        L_0x00ba:
            r0 = r1
            goto L_0x00ee
        L_0x00bc:
            r0 = r2
            goto L_0x00ee
        L_0x00be:
            q82 r0 = defpackage.q82.w
            boolean r0 = r8.contains(r0)
            if (r0 == 0) goto L_0x00ba
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L_0x00cd
            goto L_0x00ba
        L_0x00cd:
            java.util.Iterator r0 = r8.iterator()
        L_0x00d1:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x00ba
            java.lang.Object r4 = r0.next()
            q82 r4 = (defpackage.q82) r4
            cd4 r5 = defpackage.q82.a
            r5.getClass()
            java.util.LinkedHashSet r5 = defpackage.q82.c
            boolean r4 = r5.contains(r4)
            if (r4 == 0) goto L_0x00d1
            boolean r0 = r10.L()
        L_0x00ee:
            if (r3 != 0) goto L_0x00f5
            if (r0 == 0) goto L_0x00f3
            goto L_0x00f5
        L_0x00f3:
            r3 = r1
            goto L_0x00f6
        L_0x00f5:
            r3 = r2
        L_0x00f6:
            if (r0 != 0) goto L_0x0109
            q82 r0 = defpackage.q82.x
            boolean r0 = r8.contains(r0)
            if (r0 == 0) goto L_0x0108
            boolean r0 = r10.N()
            if (r0 == 0) goto L_0x0108
            r0 = r2
            goto L_0x0109
        L_0x0108:
            r0 = r1
        L_0x0109:
            boolean r4 = r8.isEmpty()
            if (r4 == 0) goto L_0x0110
            goto L_0x012e
        L_0x0110:
            java.util.Iterator r4 = r8.iterator()
        L_0x0114:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x012e
            java.lang.Object r5 = r4.next()
            q82 r5 = (defpackage.q82) r5
            cd4 r6 = defpackage.q82.a
            r6.getClass()
            java.util.LinkedHashSet r6 = defpackage.q82.o
            boolean r5 = r6.contains(r5)
            if (r5 == 0) goto L_0x0114
            goto L_0x012f
        L_0x012e:
            r0 = r2
        L_0x012f:
            boolean r4 = r8.isEmpty()
            if (r4 == 0) goto L_0x0136
            goto L_0x0197
        L_0x0136:
            java.util.Iterator r4 = r8.iterator()
        L_0x013a:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0197
            java.lang.Object r5 = r4.next()
            q82 r5 = (defpackage.q82) r5
            cd4 r6 = defpackage.q82.a
            r6.getClass()
            java.util.LinkedHashSet r6 = defpackage.q82.c
            boolean r5 = r6.contains(r5)
            if (r5 == 0) goto L_0x013a
            if (r3 == 0) goto L_0x0197
            q82 r3 = defpackage.q82.Z
            boolean r4 = r8.contains(r3)
            if (r4 == 0) goto L_0x0177
            q82 r4 = defpackage.q82.Y
            boolean r4 = r8.contains(r4)
            if (r4 == 0) goto L_0x0177
            boolean r3 = r10.c0()
            if (r3 != 0) goto L_0x0171
            boolean r3 = r10.e0()
            if (r3 == 0) goto L_0x0175
        L_0x0171:
            if (r0 == 0) goto L_0x0175
        L_0x0173:
            r0 = r2
            goto L_0x0197
        L_0x0175:
            r0 = r1
            goto L_0x0197
        L_0x0177:
            q82 r4 = defpackage.q82.Y
            boolean r4 = r8.contains(r4)
            if (r4 == 0) goto L_0x0188
            boolean r3 = r10.e0()
            if (r3 == 0) goto L_0x0175
            if (r0 == 0) goto L_0x0175
            goto L_0x0173
        L_0x0188:
            boolean r3 = r8.contains(r3)
            if (r3 == 0) goto L_0x0175
            boolean r3 = r10.c0()
            if (r3 == 0) goto L_0x0175
            if (r0 == 0) goto L_0x0175
            goto L_0x0173
        L_0x0197:
            boolean r3 = r8.isEmpty()
            if (r3 == 0) goto L_0x019f
            goto L_0x025c
        L_0x019f:
            java.util.Iterator r3 = r8.iterator()
        L_0x01a3:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x025c
            java.lang.Object r4 = r3.next()
            q82 r4 = (defpackage.q82) r4
            cd4 r5 = defpackage.q82.a
            r5.getClass()
            java.util.LinkedHashSet r5 = defpackage.q82.b
            boolean r4 = r5.contains(r4)
            if (r4 == 0) goto L_0x01a3
            q82 r3 = defpackage.q82.v0
            boolean r4 = r8.contains(r3)
            if (r4 == 0) goto L_0x01e2
            q82 r4 = defpackage.q82.w0
            boolean r4 = r8.contains(r4)
            if (r4 == 0) goto L_0x01e2
            q82 r4 = defpackage.q82.x0
            boolean r4 = r8.contains(r4)
            if (r4 == 0) goto L_0x01e2
            m72 r7 = r10.b
            int r7 = r7.m
            if (r7 <= 0) goto L_0x01df
            if (r0 == 0) goto L_0x01df
        L_0x01dc:
            r0 = r2
            goto L_0x025c
        L_0x01df:
            r0 = r1
            goto L_0x025c
        L_0x01e2:
            boolean r4 = r8.contains(r3)
            x23 r7 = r7.a
            if (r4 == 0) goto L_0x0201
            q82 r4 = defpackage.q82.x0
            boolean r4 = r8.contains(r4)
            if (r4 == 0) goto L_0x0201
            m72 r3 = r10.b
            int r3 = r3.m
            if (r3 <= 0) goto L_0x01df
            boolean r7 = r10.X(r7)
            if (r7 == 0) goto L_0x01df
            if (r0 == 0) goto L_0x01df
            goto L_0x01dc
        L_0x0201:
            q82 r4 = defpackage.q82.w0
            boolean r5 = r8.contains(r4)
            if (r5 == 0) goto L_0x0220
            q82 r5 = defpackage.q82.x0
            boolean r5 = r8.contains(r5)
            if (r5 == 0) goto L_0x0220
            m72 r3 = r10.b
            int r3 = r3.m
            if (r3 <= 0) goto L_0x01df
            boolean r7 = r10.X(r7)
            if (r7 != 0) goto L_0x01df
            if (r0 == 0) goto L_0x01df
            goto L_0x01dc
        L_0x0220:
            boolean r5 = r8.contains(r3)
            if (r5 == 0) goto L_0x022d
            boolean r5 = r8.contains(r4)
            if (r5 == 0) goto L_0x022d
            goto L_0x025c
        L_0x022d:
            boolean r4 = r8.contains(r4)
            if (r4 == 0) goto L_0x023c
            boolean r7 = r10.X(r7)
            if (r7 != 0) goto L_0x01df
            if (r0 == 0) goto L_0x01df
            goto L_0x01dc
        L_0x023c:
            boolean r3 = r8.contains(r3)
            if (r3 == 0) goto L_0x024b
            boolean r7 = r10.X(r7)
            if (r7 == 0) goto L_0x01df
            if (r0 == 0) goto L_0x01df
            goto L_0x01dc
        L_0x024b:
            q82 r7 = defpackage.q82.x0
            boolean r7 = r8.contains(r7)
            if (r7 == 0) goto L_0x025c
            m72 r7 = r10.b
            int r7 = r7.m
            if (r7 <= 0) goto L_0x01df
            if (r0 == 0) goto L_0x01df
            goto L_0x01dc
        L_0x025c:
            q82 r7 = defpackage.q82.y0
            boolean r7 = r8.contains(r7)
            if (r7 == 0) goto L_0x026f
            if (r0 == 0) goto L_0x026e
            m72 r7 = r10.b
            boolean r7 = r7.k0
            if (r7 == 0) goto L_0x026e
            r0 = r2
            goto L_0x026f
        L_0x026e:
            r0 = r1
        L_0x026f:
            m72 r7 = r10.b
            e72 r7 = r7.C
            if (r0 != 0) goto L_0x029e
            if (r7 == 0) goto L_0x029e
            q82 r10 = defpackage.q82.z0
            java.lang.Object r9 = r9.get(r10)
            boolean r3 = r9 instanceof long[]
            if (r3 == 0) goto L_0x0284
            long[] r9 = (long[]) r9
            goto L_0x0285
        L_0x0284:
            r9 = 0
        L_0x0285:
            if (r9 == 0) goto L_0x029e
            boolean r8 = r8.contains(r10)
            if (r8 == 0) goto L_0x029e
            long[] r7 = r7.a
            int r8 = r7.length
        L_0x0290:
            if (r1 >= r8) goto L_0x029e
            r3 = r7[r1]
            boolean r10 = kotlin.collections.ArraysKt.contains((long[]) r9, (long) r3)
            if (r10 == 0) goto L_0x029b
            goto L_0x029f
        L_0x029b:
            int r1 = r1 + 1
            goto L_0x0290
        L_0x029e:
            r2 = r0
        L_0x029f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.os2.a(java.util.Set, java.util.Map, a32):boolean");
    }
}
