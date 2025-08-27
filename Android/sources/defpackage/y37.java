package defpackage;

/* renamed from: y37  reason: default package */
public final class y37 extends mdf {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y37(Object obj, int i, String str) {
        super(str, true);
        this.e = i;
        this.f = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0087, code lost:
        defpackage.u0g.d(r8.c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0094, code lost:
        if (((java.util.concurrent.ConcurrentLinkedQueue) r15.e).isEmpty() == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0096, code lost:
        ((defpackage.cef) r15.c).a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:?, code lost:
        return 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:?, code lost:
        return 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long a() {
        /*
            r15 = this;
            r0 = 0
            r1 = 1
            r2 = -1
            int r4 = r15.e
            switch(r4) {
                case 0: goto L_0x00a1;
                case 1: goto L_0x0011;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r15 = r15.f
            kotlin.jvm.functions.Function0 r15 = (kotlin.jvm.functions.Function0) r15
            r15.invoke()
            return r2
        L_0x0011:
            java.lang.Object r15 = r15.f
            ntc r15 = (defpackage.ntc) r15
            long r4 = java.lang.System.nanoTime()
            java.lang.Object r6 = r15.e
            java.util.concurrent.ConcurrentLinkedQueue r6 = (java.util.concurrent.ConcurrentLinkedQueue) r6
            java.util.Iterator r6 = r6.iterator()
            r7 = 0
            r8 = -9223372036854775808
            r9 = r8
            r8 = r7
            r7 = r0
        L_0x0027:
            boolean r11 = r6.hasNext()
            if (r11 == 0) goto L_0x0052
            java.lang.Object r11 = r6.next()
            mtc r11 = (defpackage.mtc) r11
            monitor-enter(r11)
            int r12 = r15.c(r11, r4)     // Catch:{ all -> 0x004a }
            if (r12 <= 0) goto L_0x003c
            int r7 = r7 + r1
            goto L_0x004e
        L_0x003c:
            int r0 = r0 + r1
            long r12 = r11.p     // Catch:{ all -> 0x004a }
            long r12 = r4 - r12
            int r14 = (r12 > r9 ? 1 : (r12 == r9 ? 0 : -1))
            if (r14 <= 0) goto L_0x004c
            kotlin.Unit r8 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x004a }
            r8 = r11
            r9 = r12
            goto L_0x004e
        L_0x004a:
            r15 = move-exception
            goto L_0x0050
        L_0x004c:
            kotlin.Unit r12 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x004a }
        L_0x004e:
            monitor-exit(r11)
            goto L_0x0027
        L_0x0050:
            monitor-exit(r11)
            throw r15
        L_0x0052:
            long r11 = r15.a
            int r6 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r6 >= 0) goto L_0x0066
            int r6 = r15.b
            if (r0 <= r6) goto L_0x005d
            goto L_0x0066
        L_0x005d:
            if (r0 <= 0) goto L_0x0062
            long r2 = r11 - r9
            goto L_0x009d
        L_0x0062:
            if (r7 <= 0) goto L_0x009d
            r2 = r11
            goto L_0x009d
        L_0x0066:
            monitor-enter(r8)
            java.util.ArrayList r0 = r8.o     // Catch:{ all -> 0x009e }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x009e }
            r0 = r0 ^ r1
            r2 = 0
            if (r0 == 0) goto L_0x0074
            monitor-exit(r8)
            goto L_0x009d
        L_0x0074:
            long r6 = r8.p     // Catch:{ all -> 0x009e }
            long r6 = r6 + r9
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x007d
            monitor-exit(r8)
            goto L_0x009d
        L_0x007d:
            r8.i = r1     // Catch:{ all -> 0x009e }
            java.lang.Object r0 = r15.e     // Catch:{ all -> 0x009e }
            java.util.concurrent.ConcurrentLinkedQueue r0 = (java.util.concurrent.ConcurrentLinkedQueue) r0     // Catch:{ all -> 0x009e }
            r0.remove(r8)     // Catch:{ all -> 0x009e }
            monitor-exit(r8)
            java.net.Socket r0 = r8.c
            defpackage.u0g.d(r0)
            java.lang.Object r0 = r15.e
            java.util.concurrent.ConcurrentLinkedQueue r0 = (java.util.concurrent.ConcurrentLinkedQueue) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x009d
            java.lang.Object r15 = r15.c
            cef r15 = (defpackage.cef) r15
            r15.a()
        L_0x009d:
            return r2
        L_0x009e:
            r15 = move-exception
            monitor-exit(r8)
            throw r15
        L_0x00a1:
            java.lang.Object r15 = r15.f
            a47 r15 = (defpackage.a47) r15
            r15.getClass()
            r1 = 2
            i47 r4 = r15.H0     // Catch:{ IOException -> 0x00af }
            r4.j(r1, r0, r0)     // Catch:{ IOException -> 0x00af }
            goto L_0x00b3
        L_0x00af:
            r0 = move-exception
            r15.a(r1, r1, r0)
        L_0x00b3:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y37.a():long");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public y37(String str, a47 a47) {
        super(str, true);
        this.e = 0;
        this.f = a47;
    }
}
