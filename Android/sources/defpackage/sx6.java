package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* renamed from: sx6  reason: default package */
public final class sx6 implements l07, gbf, qk3, epf, o8b, tja, oie, wv9 {
    public static final sx6 b = new sx6(1);
    public static final int[] c = {8, 13, 11, 2, 0, 1, 7};
    public static final /* synthetic */ sx6 o = new sx6(3);
    public static final wj5 v = new Object();
    public static final sx6 w = new sx6(4);
    public static final sx6 x = new sx6(5);
    public static final sx6 y = new sx6(6);
    public final /* synthetic */ int a;

    public /* synthetic */ sx6(int i) {
        this.a = i;
    }

    public static final long b(long j, Long l) {
        if (l != null) {
            return j - l.longValue();
        }
        return -1;
    }

    public static final String c(Uri uri) {
        String uri2 = uri.toString();
        return uri2.length() > 30 ? tr1.j(uri2.substring(0, 30), "...") : uri2;
    }

    public static final void d(qa7 qa7) {
        if (!(qa7.l.a <= 3)) {
            throw new IllegalArgumentException();
        }
    }

    public static void e(int i, ArrayList arrayList) {
        if (cvg.y(i, 0, 7, c) != -1 && !arrayList.contains(Integer.valueOf(i))) {
            arrayList.add(Integer.valueOf(i));
        }
    }

    public long a(int i, long j, float f) {
        long j2;
        switch (this.a) {
            case 4:
                if (j <= 0) {
                    return System.currentTimeMillis();
                }
                if (i > 10) {
                    j2 = (long) 300000;
                } else {
                    z68.c("sx6", "errorCount = %d^2 * 3 * 1000", Integer.valueOf(i));
                    j2 = (long) (i * i * 3000);
                }
                return j2 + j;
            default:
                if (i > 6) {
                    i = 6;
                }
                long pow = ((long) Math.pow(2.0d, (double) i)) * 1000;
                return pow + ((long) (((float) pow) * f)) + j;
        }
    }

    public void accept(Object obj) {
        z68.f(iac.A0, "onMessagePush: failed to store notification", (Throwable) obj);
    }

    public wja call() {
        return new zja();
    }

    public void f(s55 s55) {
        b90 b90 = b90.a;
        ep7 ep7 = (ep7) s55;
        ep7.a(gm0.class, b90);
        ep7.a(da0.class, b90);
        e90 e90 = e90.a;
        ep7.a(y78.class, e90);
        ep7.a(jb0.class, e90);
        c90 c90 = c90.a;
        ep7.a(v23.class, c90);
        ep7.a(ka0.class, c90);
        a90 a90 = a90.a;
        ep7.a(yd.class, a90);
        ep7.a(v90.class, a90);
        d90 d90 = d90.a;
        ep7.a(s78.class, d90);
        ep7.a(ib0.class, d90);
        f90 f90 = f90.a;
        ep7.a(s6a.class, f90);
        ep7.a(mb0.class, f90);
    }

    public int g(Context context, String str) {
        return cz4.a(context, str);
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:31:0x005c=Splitter:B:31:0x005c, B:47:0x008d=Splitter:B:47:0x008d, B:18:0x003f=Splitter:B:18:0x003f} */
    public int h(android.content.Context r11, java.lang.String r12, boolean r13) {
        /*
            r10 = this;
            java.lang.Class<cz4> r10 = defpackage.cz4.class
            monitor-enter(r10)     // Catch:{ all -> 0x00bc }
            java.lang.Boolean r0 = defpackage.cz4.c     // Catch:{ all -> 0x004c }
            r1 = 1
            r2 = 0
            r3 = 0
            if (r0 != 0) goto L_0x00af
            android.content.Context r0 = r11.getApplicationContext()     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchFieldException -> 0x00a7 }
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchFieldException -> 0x00a7 }
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader> r4 = com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader.class
            java.lang.String r4 = r4.getName()     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchFieldException -> 0x00a7 }
            java.lang.Class r0 = r0.loadClass(r4)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchFieldException -> 0x00a7 }
            java.lang.String r4 = "sClassLoader"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r4)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchFieldException -> 0x00a7 }
            java.lang.Class r4 = r0.getDeclaringClass()     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchFieldException -> 0x00a7 }
            monitor-enter(r4)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchFieldException -> 0x00a7 }
            java.lang.Object r5 = r0.get(r3)     // Catch:{ all -> 0x0037 }
            java.lang.ClassLoader r5 = (java.lang.ClassLoader) r5     // Catch:{ all -> 0x0037 }
            java.lang.ClassLoader r6 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x0037 }
            if (r5 != r6) goto L_0x003a
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0037 }
            goto L_0x00a3
        L_0x0037:
            r0 = move-exception
            goto L_0x00a5
        L_0x003a:
            if (r5 == 0) goto L_0x0042
            defpackage.cz4.d(r5)     // Catch:{ DynamiteModule$LoadingException -> 0x003f }
        L_0x003f:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0037 }
            goto L_0x00a3
        L_0x0042:
            boolean r5 = defpackage.cz4.e(r11)     // Catch:{ all -> 0x0037 }
            if (r5 != 0) goto L_0x004f
            monitor-exit(r4)     // Catch:{ all -> 0x0037 }
            monitor-exit(r10)     // Catch:{ all -> 0x004c }
            goto L_0x0196
        L_0x004c:
            r12 = move-exception
            goto L_0x019d
        L_0x004f:
            boolean r5 = defpackage.cz4.e     // Catch:{ all -> 0x0037 }
            if (r5 != 0) goto L_0x009a
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0037 }
            boolean r6 = r5.equals(r3)     // Catch:{ all -> 0x0037 }
            if (r6 == 0) goto L_0x005c
            goto L_0x009a
        L_0x005c:
            int r6 = defpackage.cz4.c(r11, r12, r13, r1)     // Catch:{ DynamiteModule$LoadingException -> 0x0090 }
            java.lang.String r7 = defpackage.cz4.d     // Catch:{ DynamiteModule$LoadingException -> 0x0090 }
            if (r7 == 0) goto L_0x008d
            boolean r7 = r7.isEmpty()     // Catch:{ DynamiteModule$LoadingException -> 0x0090 }
            if (r7 == 0) goto L_0x006b
            goto L_0x008d
        L_0x006b:
            java.lang.ClassLoader r7 = defpackage.cvg.T()     // Catch:{ DynamiteModule$LoadingException -> 0x0090 }
            if (r7 == 0) goto L_0x0072
            goto L_0x0080
        L_0x0072:
            dalvik.system.DelegateLastClassLoader r7 = new dalvik.system.DelegateLastClassLoader     // Catch:{ DynamiteModule$LoadingException -> 0x0090 }
            java.lang.String r8 = defpackage.cz4.d     // Catch:{ DynamiteModule$LoadingException -> 0x0090 }
            defpackage.vzg.m(r8)     // Catch:{ DynamiteModule$LoadingException -> 0x0090 }
            java.lang.ClassLoader r9 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ DynamiteModule$LoadingException -> 0x0090 }
            r7.<init>(r8, r9)     // Catch:{ DynamiteModule$LoadingException -> 0x0090 }
        L_0x0080:
            defpackage.cz4.d(r7)     // Catch:{ DynamiteModule$LoadingException -> 0x0090 }
            r0.set(r3, r7)     // Catch:{ DynamiteModule$LoadingException -> 0x0090 }
            defpackage.cz4.c = r5     // Catch:{ DynamiteModule$LoadingException -> 0x0090 }
            monitor-exit(r4)     // Catch:{ all -> 0x0037 }
            monitor-exit(r10)     // Catch:{ all -> 0x004c }
        L_0x008a:
            r2 = r6
            goto L_0x0196
        L_0x008d:
            monitor-exit(r4)     // Catch:{ all -> 0x0037 }
            monitor-exit(r10)     // Catch:{ all -> 0x004c }
            goto L_0x008a
        L_0x0090:
            java.lang.ClassLoader r5 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x0037 }
            r0.set(r3, r5)     // Catch:{ all -> 0x0037 }
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0037 }
            goto L_0x00a3
        L_0x009a:
            java.lang.ClassLoader r5 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x0037 }
            r0.set(r3, r5)     // Catch:{ all -> 0x0037 }
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0037 }
        L_0x00a3:
            monitor-exit(r4)     // Catch:{ all -> 0x0037 }
            goto L_0x00ad
        L_0x00a5:
            monitor-exit(r4)     // Catch:{ all -> 0x0037 }
            throw r0     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchFieldException -> 0x00a7 }
        L_0x00a7:
            r0 = move-exception
            r0.toString()     // Catch:{ all -> 0x004c }
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x004c }
        L_0x00ad:
            defpackage.cz4.c = r0     // Catch:{ all -> 0x004c }
        L_0x00af:
            monitor-exit(r10)     // Catch:{ all -> 0x004c }
            boolean r10 = r0.booleanValue()     // Catch:{ all -> 0x00bc }
            if (r10 == 0) goto L_0x00c5
            int r2 = defpackage.cz4.c(r11, r12, r13, r2)     // Catch:{ DynamiteModule$LoadingException -> 0x00bf }
            goto L_0x0196
        L_0x00bc:
            r10 = move-exception
            goto L_0x019f
        L_0x00bf:
            r10 = move-exception
            r10.getMessage()     // Catch:{ all -> 0x00bc }
            goto L_0x0196
        L_0x00c5:
            o6h r4 = defpackage.cz4.f(r11)     // Catch:{ all -> 0x00bc }
            if (r4 != 0) goto L_0x00cd
            goto L_0x0196
        L_0x00cd:
            android.os.Parcel r10 = r4.H0()     // Catch:{ RemoteException -> 0x014b }
            r0 = 6
            android.os.Parcel r10 = r4.l(r10, r0)     // Catch:{ RemoteException -> 0x014b }
            int r0 = r10.readInt()     // Catch:{ RemoteException -> 0x014b }
            r10.recycle()     // Catch:{ RemoteException -> 0x014b }
            r10 = 3
            if (r0 < r10) goto L_0x014d
            java.lang.ThreadLocal r10 = defpackage.cz4.h     // Catch:{ RemoteException -> 0x014b }
            java.lang.Object r0 = r10.get()     // Catch:{ RemoteException -> 0x014b }
            d6h r0 = (defpackage.d6h) r0     // Catch:{ RemoteException -> 0x014b }
            if (r0 == 0) goto L_0x00f4
            android.database.Cursor r0 = r0.a     // Catch:{ RemoteException -> 0x014b }
            if (r0 == 0) goto L_0x00f4
            int r2 = r0.getInt(r2)     // Catch:{ RemoteException -> 0x014b }
            goto L_0x0196
        L_0x00f4:
            hha r5 = new hha     // Catch:{ RemoteException -> 0x014b }
            r5.<init>(r11)     // Catch:{ RemoteException -> 0x014b }
            qv0 r0 = defpackage.cz4.i     // Catch:{ RemoteException -> 0x014b }
            java.lang.Object r0 = r0.get()     // Catch:{ RemoteException -> 0x014b }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ RemoteException -> 0x014b }
            long r8 = r0.longValue()     // Catch:{ RemoteException -> 0x014b }
            r6 = r12
            r7 = r13
            p67 r12 = r4.M0(r5, r6, r7, r8)     // Catch:{ RemoteException -> 0x014b }
            java.lang.Object r12 = defpackage.hha.M0(r12)     // Catch:{ RemoteException -> 0x014b }
            android.database.Cursor r12 = (android.database.Cursor) r12     // Catch:{ RemoteException -> 0x014b }
            if (r12 == 0) goto L_0x0143
            boolean r13 = r12.moveToFirst()     // Catch:{ RemoteException -> 0x013d, all -> 0x013b }
            if (r13 != 0) goto L_0x011a
            goto L_0x0143
        L_0x011a:
            int r13 = r12.getInt(r2)     // Catch:{ RemoteException -> 0x013d, all -> 0x013b }
            if (r13 <= 0) goto L_0x0133
            java.lang.Object r10 = r10.get()     // Catch:{ RemoteException -> 0x013d, all -> 0x013b }
            d6h r10 = (defpackage.d6h) r10     // Catch:{ RemoteException -> 0x013d, all -> 0x013b }
            if (r10 == 0) goto L_0x012f
            android.database.Cursor r0 = r10.a     // Catch:{ RemoteException -> 0x013d, all -> 0x013b }
            if (r0 != 0) goto L_0x012f
            r10.a = r12     // Catch:{ RemoteException -> 0x013d, all -> 0x013b }
            goto L_0x0130
        L_0x012f:
            r1 = r2
        L_0x0130:
            if (r1 == 0) goto L_0x0133
            goto L_0x0134
        L_0x0133:
            r3 = r12
        L_0x0134:
            if (r3 == 0) goto L_0x0139
            r3.close()     // Catch:{ all -> 0x00bc }
        L_0x0139:
            r2 = r13
            goto L_0x0196
        L_0x013b:
            r10 = move-exception
            goto L_0x013f
        L_0x013d:
            r10 = move-exception
            goto L_0x0141
        L_0x013f:
            r3 = r12
            goto L_0x0197
        L_0x0141:
            r3 = r12
            goto L_0x018e
        L_0x0143:
            if (r12 == 0) goto L_0x0196
            r12.close()     // Catch:{ all -> 0x00bc }
            goto L_0x0196
        L_0x0149:
            r10 = move-exception
            goto L_0x0197
        L_0x014b:
            r10 = move-exception
            goto L_0x018e
        L_0x014d:
            r1 = 2
            if (r0 != r1) goto L_0x0170
            hha r10 = new hha     // Catch:{ RemoteException -> 0x014b }
            r10.<init>(r11)     // Catch:{ RemoteException -> 0x014b }
            android.os.Parcel r0 = r4.H0()     // Catch:{ RemoteException -> 0x014b }
            defpackage.szg.c(r0, r10)     // Catch:{ RemoteException -> 0x014b }
            r0.writeString(r12)     // Catch:{ RemoteException -> 0x014b }
            r0.writeInt(r13)     // Catch:{ RemoteException -> 0x014b }
            r10 = 5
            android.os.Parcel r10 = r4.l(r0, r10)     // Catch:{ RemoteException -> 0x014b }
            int r12 = r10.readInt()     // Catch:{ RemoteException -> 0x014b }
            r10.recycle()     // Catch:{ RemoteException -> 0x014b }
        L_0x016e:
            r2 = r12
            goto L_0x0196
        L_0x0170:
            hha r0 = new hha     // Catch:{ RemoteException -> 0x014b }
            r0.<init>(r11)     // Catch:{ RemoteException -> 0x014b }
            android.os.Parcel r1 = r4.H0()     // Catch:{ RemoteException -> 0x014b }
            defpackage.szg.c(r1, r0)     // Catch:{ RemoteException -> 0x014b }
            r1.writeString(r12)     // Catch:{ RemoteException -> 0x014b }
            r1.writeInt(r13)     // Catch:{ RemoteException -> 0x014b }
            android.os.Parcel r10 = r4.l(r1, r10)     // Catch:{ RemoteException -> 0x014b }
            int r12 = r10.readInt()     // Catch:{ RemoteException -> 0x014b }
            r10.recycle()     // Catch:{ RemoteException -> 0x014b }
            goto L_0x016e
        L_0x018e:
            r10.getMessage()     // Catch:{ all -> 0x0149 }
            if (r3 == 0) goto L_0x0196
            r3.close()     // Catch:{ all -> 0x00bc }
        L_0x0196:
            return r2
        L_0x0197:
            if (r3 == 0) goto L_0x019c
            r3.close()     // Catch:{ all -> 0x00bc }
        L_0x019c:
            throw r10     // Catch:{ all -> 0x00bc }
        L_0x019d:
            monitor-exit(r10)     // Catch:{ all -> 0x004c }
            throw r12     // Catch:{ all -> 0x00bc }
        L_0x019f:
            defpackage.vzg.m(r11)     // Catch:{ Exception -> 0x01a2 }
        L_0x01a2:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sx6.h(android.content.Context, java.lang.String, boolean):int");
    }

    public Object j(Uri uri, l74 l74) {
        return Long.valueOf(v0g.V(new BufferedReader(new InputStreamReader(l74)).readLine()));
    }

    public Object m(pf9 pf9) {
        int e0 = ryg.e0(pf9);
        b89 b89 = null;
        if (e0 == 0) {
            return null;
        }
        long j = 0;
        for (int i = 0; i < e0; i++) {
            String A0 = pf9.A0();
            A0.getClass();
            if (A0.equals(ApiProtocol.PARAM_CHAT_ID)) {
                j = pf9.x0();
            } else if (!A0.equals("message")) {
                pf9.A();
            } else {
                b89 = z79.a(pf9);
            }
        }
        return new t61(j, b89);
    }

    public long o(long j) {
        return -1;
    }
}
