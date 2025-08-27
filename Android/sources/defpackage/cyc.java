package defpackage;

/* renamed from: cyc  reason: default package */
public final /* synthetic */ class cyc implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ lyc b;

    public /* synthetic */ cyc(lyc lyc, int i) {
        this.a = i;
        this.b = lyc;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: zb0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.lang.RuntimeException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: zb0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: java.lang.RuntimeException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: java.lang.RuntimeException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: zb0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v16, resolved type: zb0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0036 A[Catch:{ all -> 0x004e }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r7 = this;
            int r0 = r7.a
            switch(r0) {
                case 0: goto L_0x001a;
                default: goto L_0x0005;
            }
        L_0x0005:
            lyc r7 = r7.b
            z3f r0 = r7.y
            if (r0 == 0) goto L_0x0012
            xjf r1 = r7.z
            r2 = 0
            r7.h(r0, r1, r2)
            return
        L_0x0012:
            java.lang.AssertionError r7 = new java.lang.AssertionError
            java.lang.String r0 = "surface request is required to retry initialization."
            r7.<init>(r0)
            throw r7
        L_0x001a:
            lyc r7 = r7.b
            java.lang.Object r0 = r7.h
            monitor-enter(r0)
            kyc r1 = r7.k     // Catch:{ all -> 0x004e }
            int r1 = r1.ordinal()     // Catch:{ all -> 0x004e }
            r2 = 1
            r3 = 0
            r4 = 0
            if (r1 == r2) goto L_0x0031
            r5 = 2
            if (r1 == r5) goto L_0x0032
            r5 = r3
            r1 = r4
        L_0x002f:
            r2 = r1
            goto L_0x0064
        L_0x0031:
            r2 = r3
        L_0x0032:
            zb0 r1 = r7.n     // Catch:{ all -> 0x004e }
            if (r1 != 0) goto L_0x0060
            boolean r1 = r7.Z     // Catch:{ all -> 0x004e }
            if (r1 == 0) goto L_0x003b
            goto L_0x0060
        L_0x003b:
            int r1 = r7.g0     // Catch:{ all -> 0x004e }
            r5 = 3
            if (r1 != r5) goto L_0x0050
            zb0 r1 = r7.o     // Catch:{ all -> 0x004e }
            r7.o = r4     // Catch:{ all -> 0x004e }
            r7.y()     // Catch:{ all -> 0x004e }
            java.lang.RuntimeException r3 = defpackage.lyc.m0     // Catch:{ all -> 0x004e }
            r5 = 4
            r6 = r3
            r3 = r2
            r2 = r6
            goto L_0x0064
        L_0x004e:
            r7 = move-exception
            goto L_0x0071
        L_0x0050:
            q55 r1 = r7.F     // Catch:{ all -> 0x004e }
            if (r1 == 0) goto L_0x0060
            kyc r1 = r7.k     // Catch:{ all -> 0x004e }
            zb0 r1 = r7.q(r1)     // Catch:{ all -> 0x004e }
            r5 = r3
            r3 = r2
            r2 = r4
            r4 = r1
            r1 = r2
            goto L_0x0064
        L_0x0060:
            r5 = r3
            r1 = r4
            r3 = r2
            goto L_0x002f
        L_0x0064:
            monitor-exit(r0)     // Catch:{ all -> 0x004e }
            if (r4 == 0) goto L_0x006b
            r7.E(r4, r3)
            goto L_0x0070
        L_0x006b:
            if (r1 == 0) goto L_0x0070
            r7.j(r1, r5, r2)
        L_0x0070:
            return
        L_0x0071:
            monitor-exit(r0)     // Catch:{ all -> 0x004e }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cyc.run():void");
    }
}
