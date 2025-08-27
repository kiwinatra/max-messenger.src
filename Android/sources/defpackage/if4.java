package defpackage;

import android.net.Uri;
import java.util.HashMap;

/* renamed from: if4  reason: default package */
public final class if4 implements yf5 {
    public static final int[] a = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 14};
    public static final zqd b = new zqd(10);

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: sf5} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(int r6, java.util.ArrayList r7) {
        /*
            r0 = 0
            r1 = 0
            switch(r6) {
                case 0: goto L_0x0114;
                case 1: goto L_0x010b;
                case 2: goto L_0x0102;
                case 3: goto L_0x00f9;
                case 4: goto L_0x006d;
                case 5: goto L_0x0063;
                case 6: goto L_0x0059;
                case 7: goto L_0x004f;
                case 8: goto L_0x0039;
                case 9: goto L_0x002f;
                case 10: goto L_0x0025;
                case 11: goto L_0x001b;
                case 12: goto L_0x0011;
                case 13: goto L_0x0005;
                case 14: goto L_0x0007;
                default: goto L_0x0005;
            }
        L_0x0005:
            goto L_0x011c
        L_0x0007:
            eo7 r6 = new eo7
            r6.<init>()
            r7.add(r6)
            goto L_0x011c
        L_0x0011:
            dfg r6 = new dfg
            r6.<init>()
            r7.add(r6)
            goto L_0x011c
        L_0x001b:
            mtf r6 = new mtf
            r6.<init>()
            r7.add(r6)
            goto L_0x011c
        L_0x0025:
            x9c r6 = new x9c
            r6.<init>()
            r7.add(r6)
            goto L_0x011c
        L_0x002f:
            gla r6 = new gla
            r6.<init>()
            r7.add(r6)
            goto L_0x011c
        L_0x0039:
            ud6 r6 = new ud6
            java.util.List r2 = java.util.Collections.emptyList()
            r6.<init>(r1, r0, r2, r0)
            r7.add(r6)
            nu9 r6 = new nu9
            r6.<init>()
            r7.add(r6)
            goto L_0x011c
        L_0x004f:
            ju9 r6 = new ju9
            r6.<init>()
            r7.add(r6)
            goto L_0x011c
        L_0x0059:
            kh8 r6 = new kh8
            r6.<init>(r1)
            r7.add(r6)
            goto L_0x011c
        L_0x0063:
            px5 r6 = new px5
            r6.<init>()
            r7.add(r6)
            goto L_0x011c
        L_0x006d:
            zqd r6 = b
            java.lang.Object r2 = r6.b
            java.util.concurrent.atomic.AtomicBoolean r2 = (java.util.concurrent.atomic.AtomicBoolean) r2
            monitor-enter(r2)
            java.lang.Object r3 = r6.b     // Catch:{ all -> 0x0084 }
            java.util.concurrent.atomic.AtomicBoolean r3 = (java.util.concurrent.atomic.AtomicBoolean) r3     // Catch:{ all -> 0x0084 }
            boolean r3 = r3.get()     // Catch:{ all -> 0x0084 }
            if (r3 == 0) goto L_0x0086
            java.lang.Object r6 = r6.c     // Catch:{ all -> 0x0084 }
            java.lang.reflect.Constructor r6 = (java.lang.reflect.Constructor) r6     // Catch:{ all -> 0x0084 }
            monitor-exit(r2)     // Catch:{ all -> 0x0084 }
            goto L_0x00cd
        L_0x0084:
            r6 = move-exception
            goto L_0x00f7
        L_0x0086:
            java.lang.Boolean r3 = java.lang.Boolean.TRUE     // Catch:{ ClassNotFoundException -> 0x00c0, Exception -> 0x00b7 }
            java.lang.String r4 = "com.google.android.exoplayer2.ext.flac.FlacLibrary"
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch:{ ClassNotFoundException -> 0x00c0, Exception -> 0x00b7 }
            java.lang.String r5 = "isAvailable"
            java.lang.reflect.Method r4 = r4.getMethod(r5, r0)     // Catch:{ ClassNotFoundException -> 0x00c0, Exception -> 0x00b7 }
            java.lang.Object r4 = r4.invoke(r0, r0)     // Catch:{ ClassNotFoundException -> 0x00c0, Exception -> 0x00b7 }
            boolean r3 = r3.equals(r4)     // Catch:{ ClassNotFoundException -> 0x00c0, Exception -> 0x00b7 }
            if (r3 == 0) goto L_0x00c0
            java.lang.String r3 = "com.google.android.exoplayer2.ext.flac.FlacExtractor"
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch:{ ClassNotFoundException -> 0x00c0, Exception -> 0x00b7 }
            java.lang.Class<sf5> r4 = defpackage.sf5.class
            java.lang.Class r3 = r3.asSubclass(r4)     // Catch:{ ClassNotFoundException -> 0x00c0, Exception -> 0x00b7 }
            java.lang.Class r4 = java.lang.Integer.TYPE     // Catch:{ ClassNotFoundException -> 0x00c0, Exception -> 0x00b7 }
            java.lang.Class[] r4 = new java.lang.Class[]{r4}     // Catch:{ ClassNotFoundException -> 0x00c0, Exception -> 0x00b7 }
            java.lang.reflect.Constructor r3 = r3.getConstructor(r4)     // Catch:{ ClassNotFoundException -> 0x00c0, Exception -> 0x00b7 }
            r6.c = r3     // Catch:{ ClassNotFoundException -> 0x00c0, Exception -> 0x00b7 }
            goto L_0x00c0
        L_0x00b7:
            r6 = move-exception
            java.lang.RuntimeException r7 = new java.lang.RuntimeException     // Catch:{ all -> 0x0084 }
            java.lang.String r0 = "Error instantiating FLAC extension"
            r7.<init>(r0, r6)     // Catch:{ all -> 0x0084 }
            throw r7     // Catch:{ all -> 0x0084 }
        L_0x00c0:
            java.lang.Object r3 = r6.b     // Catch:{ all -> 0x0084 }
            java.util.concurrent.atomic.AtomicBoolean r3 = (java.util.concurrent.atomic.AtomicBoolean) r3     // Catch:{ all -> 0x0084 }
            r4 = 1
            r3.set(r4)     // Catch:{ all -> 0x0084 }
            java.lang.Object r6 = r6.c     // Catch:{ all -> 0x0084 }
            java.lang.reflect.Constructor r6 = (java.lang.reflect.Constructor) r6     // Catch:{ all -> 0x0084 }
            monitor-exit(r2)     // Catch:{ all -> 0x0084 }
        L_0x00cd:
            if (r6 != 0) goto L_0x00d0
            goto L_0x00df
        L_0x00d0:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)     // Catch:{ Exception -> 0x00ee }
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch:{ Exception -> 0x00ee }
            java.lang.Object r6 = r6.newInstance(r0)     // Catch:{ Exception -> 0x00ee }
            r0 = r6
            sf5 r0 = (defpackage.sf5) r0     // Catch:{ Exception -> 0x00ee }
        L_0x00df:
            if (r0 == 0) goto L_0x00e5
            r7.add(r0)
            goto L_0x011c
        L_0x00e5:
            pq5 r6 = new pq5
            r6.<init>()
            r7.add(r6)
            goto L_0x011c
        L_0x00ee:
            r6 = move-exception
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "Unexpected error creating FLAC extractor"
            r7.<init>(r0, r6)
            throw r7
        L_0x00f7:
            monitor-exit(r2)     // Catch:{ all -> 0x0084 }
            throw r6
        L_0x00f9:
            kd r6 = new kd
            r6.<init>()
            r7.add(r6)
            goto L_0x011c
        L_0x0102:
            zb r6 = new zb
            r6.<init>()
            r7.add(r6)
            goto L_0x011c
        L_0x010b:
            p3 r6 = new p3
            r6.<init>()
            r7.add(r6)
            goto L_0x011c
        L_0x0114:
            l3 r6 = new l3
            r6.<init>()
            r7.add(r6)
        L_0x011c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.if4.a(int, java.util.ArrayList):void");
    }

    public final synchronized sf5[] c() {
        return d(Uri.EMPTY, new HashMap());
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0029 A[Catch:{ all -> 0x0047 }] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003b A[Catch:{ all -> 0x0047 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized defpackage.sf5[] d(android.net.Uri r6, java.util.Map r7) {
        /*
            r5 = this;
            monitor-enter(r5)
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x0047 }
            r1 = 14
            r0.<init>(r1)     // Catch:{ all -> 0x0047 }
            java.lang.String r2 = "Content-Type"
            java.lang.Object r7 = r7.get(r2)     // Catch:{ all -> 0x0047 }
            java.util.List r7 = (java.util.List) r7     // Catch:{ all -> 0x0047 }
            r2 = 0
            if (r7 == 0) goto L_0x0021
            boolean r3 = r7.isEmpty()     // Catch:{ all -> 0x0047 }
            if (r3 == 0) goto L_0x001a
            goto L_0x0021
        L_0x001a:
            java.lang.Object r7 = r7.get(r2)     // Catch:{ all -> 0x0047 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x0047 }
            goto L_0x0022
        L_0x0021:
            r7 = 0
        L_0x0022:
            int r7 = defpackage.h88.E(r7)     // Catch:{ all -> 0x0047 }
            r3 = -1
            if (r7 == r3) goto L_0x002c
            a(r7, r0)     // Catch:{ all -> 0x0047 }
        L_0x002c:
            int r6 = defpackage.h88.F(r6)     // Catch:{ all -> 0x0047 }
            if (r6 == r3) goto L_0x0037
            if (r6 == r7) goto L_0x0037
            a(r6, r0)     // Catch:{ all -> 0x0047 }
        L_0x0037:
            int[] r3 = a     // Catch:{ all -> 0x0047 }
        L_0x0039:
            if (r2 >= r1) goto L_0x0049
            r4 = r3[r2]     // Catch:{ all -> 0x0047 }
            if (r4 == r7) goto L_0x0044
            if (r4 == r6) goto L_0x0044
            a(r4, r0)     // Catch:{ all -> 0x0047 }
        L_0x0044:
            int r2 = r2 + 1
            goto L_0x0039
        L_0x0047:
            r6 = move-exception
            goto L_0x0057
        L_0x0049:
            int r6 = r0.size()     // Catch:{ all -> 0x0047 }
            sf5[] r6 = new defpackage.sf5[r6]     // Catch:{ all -> 0x0047 }
            java.lang.Object[] r6 = r0.toArray(r6)     // Catch:{ all -> 0x0047 }
            sf5[] r6 = (defpackage.sf5[]) r6     // Catch:{ all -> 0x0047 }
            monitor-exit(r5)
            return r6
        L_0x0057:
            monitor-exit(r5)     // Catch:{ all -> 0x0047 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.if4.d(android.net.Uri, java.util.Map):sf5[]");
    }
}
