package defpackage;

import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.internal.http2.StreamResetException;

/* renamed from: b47  reason: default package */
public final class b47 implements s95 {
    public static final List x = u0g.k("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");
    public static final List y = u0g.k("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");
    public volatile h47 a;
    public final y8c b;
    public volatile boolean c;
    public final mtc o;
    public final otc v;
    public final a47 w;

    public b47(rla rla, mtc mtc, otc otc, a47 a47) {
        this.o = mtc;
        this.v = otc;
        this.w = a47;
        List list = rla.B0;
        y8c y8c = y8c.H2_PRIOR_KNOWLEDGE;
        this.b = !list.contains(y8c) ? y8c.HTTP_2 : y8c;
    }

    public final yfe a(k4d k4d) {
        return this.a.g;
    }

    public final void b() {
        this.a.g().close();
    }

    public final nde c(y2d y2d, long j) {
        return this.a.g();
    }

    public final void cancel() {
        this.c = true;
        h47 h47 = this.a;
        if (h47 != null) {
            h47.e(9);
        }
    }

    public final long d(k4d k4d) {
        if (!d57.a(k4d)) {
            return 0;
        }
        return u0g.j(k4d);
    }

    /* JADX INFO: finally extract failed */
    public final j4d e(boolean z) {
        lx6 lx6;
        h47 h47 = this.a;
        synchronized (h47) {
            h47.i.i();
            while (h47.e.isEmpty() && h47.k == 0) {
                try {
                    h47.k();
                } catch (Throwable th) {
                    h47.i.m();
                    throw th;
                }
            }
            h47.i.m();
            if (!h47.e.isEmpty()) {
                lx6 = (lx6) h47.e.removeFirst();
            } else {
                Throwable th2 = h47.l;
                if (th2 == null) {
                    th2 = new StreamResetException(h47.k);
                }
                throw th2;
            }
        }
        y8c y8c = this.b;
        ArrayList arrayList = new ArrayList(20);
        int size = lx6.size();
        cs csVar = null;
        for (int i = 0; i < size; i++) {
            String d = lx6.d(i);
            String f = lx6.f(i);
            if (Intrinsics.areEqual((Object) d, (Object) ":status")) {
                csVar = ryg.Q("HTTP/1.1 " + f);
            } else if (!y.contains(d)) {
                arrayList.add(d);
                arrayList.add(StringsKt.trim((CharSequence) f).toString());
            }
        }
        if (csVar != null) {
            j4d j4d = new j4d();
            j4d.b = y8c;
            j4d.c = csVar.b;
            j4d.d = (String) csVar.o;
            Object[] array = arrayList.toArray(new String[0]);
            if (array != null) {
                e4 e4Var = new e4(20);
                CollectionsKt__MutableCollectionsKt.addAll((ArrayList) e4Var.b, (T[]) (String[]) array);
                j4d.f = e4Var;
                if (!z || j4d.c != 100) {
                    return j4d;
                }
                return null;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        throw new ProtocolException("Expected ':status' header not present");
    }

    public final mtc f() {
        return this.o;
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x0106 A[Catch:{ all -> 0x00ce }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g(defpackage.y2d r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = 1
            h47 r3 = r0.a
            if (r3 == 0) goto L_0x000a
            return
        L_0x000a:
            hd8 r3 = r1.e
            if (r3 == 0) goto L_0x0010
            r3 = r2
            goto L_0x0011
        L_0x0010:
            r3 = 0
        L_0x0011:
            lx6 r5 = r1.d
            java.util.ArrayList r6 = new java.util.ArrayList
            int r7 = r5.size()
            r8 = 4
            int r7 = r7 + r8
            r6.<init>(r7)
            zw6 r7 = new zw6
            vw0 r9 = defpackage.zw6.f
            java.lang.String r10 = r1.c
            r7.<init>((defpackage.vw0) r9, (java.lang.String) r10)
            r6.add(r7)
            zw6 r7 = new zw6
            vw0 r9 = defpackage.zw6.g
            m57 r10 = r1.b
            java.lang.String r11 = r10.b()
            java.lang.String r12 = r10.d()
            if (r12 == 0) goto L_0x004e
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r11)
            r11 = 63
            r13.append(r11)
            r13.append(r12)
            java.lang.String r11 = r13.toString()
        L_0x004e:
            r7.<init>((defpackage.vw0) r9, (java.lang.String) r11)
            r6.add(r7)
            lx6 r1 = r1.d
            java.lang.String r7 = "Host"
            java.lang.String r1 = r1.b(r7)
            if (r1 == 0) goto L_0x0068
            zw6 r7 = new zw6
            vw0 r9 = defpackage.zw6.i
            r7.<init>((defpackage.vw0) r9, (java.lang.String) r1)
            r6.add(r7)
        L_0x0068:
            zw6 r1 = new zw6
            vw0 r7 = defpackage.zw6.h
            java.lang.String r9 = r10.b
            r1.<init>((defpackage.vw0) r7, (java.lang.String) r9)
            r6.add(r1)
            int r1 = r5.size()
            r7 = 0
        L_0x0079:
            if (r7 >= r1) goto L_0x00b9
            java.lang.String r9 = r5.d(r7)
            java.util.Locale r10 = java.util.Locale.US
            if (r9 == 0) goto L_0x00b1
            java.lang.String r9 = r9.toLowerCase(r10)
            java.util.List r10 = x
            boolean r10 = r10.contains(r9)
            if (r10 == 0) goto L_0x00a3
            java.lang.String r10 = "te"
            boolean r10 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r10)
            if (r10 == 0) goto L_0x00af
            java.lang.String r10 = r5.f(r7)
            java.lang.String r11 = "trailers"
            boolean r10 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r10, (java.lang.Object) r11)
            if (r10 == 0) goto L_0x00af
        L_0x00a3:
            zw6 r10 = new zw6
            java.lang.String r11 = r5.f(r7)
            r10.<init>((java.lang.String) r9, (java.lang.String) r11)
            r6.add(r10)
        L_0x00af:
            int r7 = r7 + r2
            goto L_0x0079
        L_0x00b1:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "null cannot be cast to non-null type java.lang.String"
            r0.<init>(r1)
            throw r0
        L_0x00b9:
            a47 r1 = r0.w
            r5 = r3 ^ 1
            i47 r7 = r1.H0
            monitor-enter(r7)
            monitor-enter(r1)     // Catch:{ all -> 0x018f }
            int r9 = r1.w     // Catch:{ all -> 0x00ce }
            r10 = 1073741823(0x3fffffff, float:1.9999999)
            if (r9 <= r10) goto L_0x00d1
            r9 = 8
            r1.j(r9)     // Catch:{ all -> 0x00ce }
            goto L_0x00d1
        L_0x00ce:
            r0 = move-exception
            goto L_0x0197
        L_0x00d1:
            boolean r9 = r1.x     // Catch:{ all -> 0x00ce }
            if (r9 != 0) goto L_0x0191
            int r15 = r1.w     // Catch:{ all -> 0x00ce }
            int r9 = r15 + 2
            r1.w = r9     // Catch:{ all -> 0x00ce }
            h47 r14 = new h47     // Catch:{ all -> 0x00ce }
            r16 = 0
            r13 = 0
            r9 = r14
            r10 = r15
            r11 = r1
            r12 = r5
            r4 = r14
            r14 = r16
            r9.<init>(r10, r11, r12, r13, r14)     // Catch:{ all -> 0x00ce }
            if (r3 == 0) goto L_0x00ff
            long r9 = r1.E0     // Catch:{ all -> 0x00ce }
            long r11 = r1.F0     // Catch:{ all -> 0x00ce }
            int r3 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r3 >= 0) goto L_0x00ff
            long r9 = r4.c     // Catch:{ all -> 0x00ce }
            long r11 = r4.d     // Catch:{ all -> 0x00ce }
            int r3 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r3 < 0) goto L_0x00fd
            goto L_0x00ff
        L_0x00fd:
            r3 = 0
            goto L_0x0100
        L_0x00ff:
            r3 = r2
        L_0x0100:
            boolean r9 = r4.i()     // Catch:{ all -> 0x00ce }
            if (r9 == 0) goto L_0x010f
            java.util.LinkedHashMap r9 = r1.c     // Catch:{ all -> 0x00ce }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r15)     // Catch:{ all -> 0x00ce }
            r9.put(r10, r4)     // Catch:{ all -> 0x00ce }
        L_0x010f:
            kotlin.Unit r9 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x00ce }
            monitor-exit(r1)     // Catch:{ all -> 0x018f }
            i47 r9 = r1.H0     // Catch:{ all -> 0x018f }
            monitor-enter(r9)     // Catch:{ all -> 0x018f }
            boolean r10 = r9.c     // Catch:{ all -> 0x014a }
            if (r10 != 0) goto L_0x0185
            f37 r10 = r9.o     // Catch:{ all -> 0x014a }
            r10.d(r6)     // Catch:{ all -> 0x014a }
            rt0 r6 = r9.a     // Catch:{ all -> 0x014a }
            long r10 = r6.b     // Catch:{ all -> 0x014a }
            int r6 = r9.b     // Catch:{ all -> 0x014a }
            long r12 = (long) r6     // Catch:{ all -> 0x014a }
            long r12 = java.lang.Math.min(r12, r10)     // Catch:{ all -> 0x014a }
            int r6 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r6 != 0) goto L_0x0130
            r17 = r8
            goto L_0x0132
        L_0x0130:
            r17 = 0
        L_0x0132:
            if (r5 == 0) goto L_0x0136
            r17 = r17 | 1
        L_0x0136:
            r5 = r17
            int r8 = (int) r12     // Catch:{ all -> 0x014a }
            r9.d(r15, r8, r2, r5)     // Catch:{ all -> 0x014a }
            wu0 r2 = r9.v     // Catch:{ all -> 0x014a }
            rt0 r5 = r9.a     // Catch:{ all -> 0x014a }
            r2.O(r5, r12)     // Catch:{ all -> 0x014a }
            if (r6 <= 0) goto L_0x014c
            long r10 = r10 - r12
            r9.o(r15, r10)     // Catch:{ all -> 0x014a }
            goto L_0x014c
        L_0x014a:
            r0 = move-exception
            goto L_0x018d
        L_0x014c:
            monitor-exit(r9)     // Catch:{ all -> 0x018f }
            monitor-exit(r7)
            if (r3 == 0) goto L_0x0155
            i47 r1 = r1.H0
            r1.flush()
        L_0x0155:
            r0.a = r4
            boolean r1 = r0.c
            if (r1 != 0) goto L_0x0176
            h47 r1 = r0.a
            g47 r1 = r1.i
            otc r2 = r0.v
            int r2 = r2.h
            long r2 = (long) r2
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS
            r1.g(r2, r4)
            h47 r1 = r0.a
            g47 r1 = r1.j
            otc r0 = r0.v
            int r0 = r0.i
            long r2 = (long) r0
            r1.g(r2, r4)
            return
        L_0x0176:
            h47 r0 = r0.a
            r1 = 9
            r0.e(r1)
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Canceled"
            r0.<init>(r1)
            throw r0
        L_0x0185:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x014a }
            java.lang.String r1 = "closed"
            r0.<init>(r1)     // Catch:{ all -> 0x014a }
            throw r0     // Catch:{ all -> 0x014a }
        L_0x018d:
            monitor-exit(r9)     // Catch:{ all -> 0x014a }
            throw r0     // Catch:{ all -> 0x018f }
        L_0x018f:
            r0 = move-exception
            goto L_0x0199
        L_0x0191:
            okhttp3.internal.http2.ConnectionShutdownException r0 = new okhttp3.internal.http2.ConnectionShutdownException     // Catch:{ all -> 0x00ce }
            r0.<init>()     // Catch:{ all -> 0x00ce }
            throw r0     // Catch:{ all -> 0x00ce }
        L_0x0197:
            monitor-exit(r1)     // Catch:{ all -> 0x018f }
            throw r0     // Catch:{ all -> 0x018f }
        L_0x0199:
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b47.g(y2d):void");
    }

    public final void h() {
        this.w.flush();
    }
}
