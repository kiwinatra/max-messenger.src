package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.exoplayer2.upstream.HttpDataSource$HttpDataSourceException;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.io.ConstantsKt;

/* renamed from: waf  reason: default package */
public final class waf implements o47 {
    public static final AtomicReference v0 = new AtomicReference();
    public long X;
    public long Y;
    public long Z;
    public final String a;
    public final HashMap b;
    public final fz0 c;
    public final arf o;
    public p74 v;
    public k4d w;
    public y2d x;
    public boolean y;
    public long z;

    public waf(fz0 fz0, String str, arf arf) {
        if (!TextUtils.isEmpty(str)) {
            this.a = str;
            this.o = arf;
            this.b = new HashMap();
            this.c = fz0;
            return;
        }
        throw new IllegalArgumentException();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:57:0x012e, code lost:
        if (r1 != 0) goto L_0x0134;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long N(defpackage.p74 r22) {
        /*
            r21 = this;
            r0 = r21
            r5 = r22
            r0.v = r5
            r1 = 0
            r0.Z = r1
            r0.Y = r1
            long r3 = r5.f
            long r6 = r5.g
            int r8 = r5.i
            r9 = 1
            r8 = r8 & r9
            if (r8 == 0) goto L_0x0018
            r8 = r9
            goto L_0x0019
        L_0x0018:
            r8 = 0
        L_0x0019:
            android.net.Uri r11 = r5.a
            java.lang.String r11 = r11.toString()
            r12 = 0
            sd3 r13 = new sd3     // Catch:{ IllegalArgumentException -> 0x002e }
            r13.<init>()     // Catch:{ IllegalArgumentException -> 0x002e }
            r13.n(r12, r11)     // Catch:{ IllegalArgumentException -> 0x002e }
            m57 r11 = r13.c()     // Catch:{ IllegalArgumentException -> 0x002e }
            r14 = r11
            goto L_0x002f
        L_0x002e:
            r14 = r12
        L_0x002f:
            java.util.LinkedHashMap r11 = new java.util.LinkedHashMap
            r11.<init>()
            java.lang.String r15 = "GET"
            e4 r13 = new e4
            r10 = 20
            r13.<init>((int) r10)
            java.util.UUID r10 = java.util.UUID.randomUUID()
            java.lang.String r10 = r10.toString()
            java.lang.Class<java.lang.Object> r12 = java.lang.Object.class
            if (r10 != 0) goto L_0x004d
            r11.remove(r12)
            goto L_0x005f
        L_0x004d:
            boolean r16 = r11.isEmpty()
            if (r16 == 0) goto L_0x0058
            java.util.LinkedHashMap r11 = new java.util.LinkedHashMap
            r11.<init>()
        L_0x0058:
            java.lang.Object r10 = r12.cast(r10)
            r11.put(r12, r10)
        L_0x005f:
            java.util.HashMap r10 = r0.b
            monitor-enter(r10)
            java.util.HashMap r12 = r0.b     // Catch:{ all -> 0x008f }
            java.util.Set r12 = r12.entrySet()     // Catch:{ all -> 0x008f }
            java.util.Iterator r12 = r12.iterator()     // Catch:{ all -> 0x008f }
        L_0x006c:
            boolean r16 = r12.hasNext()     // Catch:{ all -> 0x008f }
            if (r16 == 0) goto L_0x0092
            java.lang.Object r16 = r12.next()     // Catch:{ all -> 0x008f }
            java.util.Map$Entry r16 = (java.util.Map.Entry) r16     // Catch:{ all -> 0x008f }
            java.lang.Object r17 = r16.getKey()     // Catch:{ all -> 0x008f }
            r9 = r17
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x008f }
            java.lang.Object r16 = r16.getValue()     // Catch:{ all -> 0x008f }
            r1 = r16
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x008f }
            r13.k(r9, r1)     // Catch:{ all -> 0x008f }
            r1 = 0
            r9 = 1
            goto L_0x006c
        L_0x008f:
            r0 = move-exception
            goto L_0x0207
        L_0x0092:
            monitor-exit(r10)     // Catch:{ all -> 0x008f }
            r1 = 0
            int r9 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            r19 = -1
            if (r9 != 0) goto L_0x009f
            int r9 = (r6 > r19 ? 1 : (r6 == r19 ? 0 : -1))
            if (r9 == 0) goto L_0x00c5
        L_0x009f:
            long r3 = java.lang.Math.max(r1, r3)
            int r1 = (r6 > r19 ? 1 : (r6 == r19 ? 0 : -1))
            if (r1 == 0) goto L_0x00ac
            long r6 = r6 + r3
            r1 = 1
            long r6 = r6 - r1
            goto L_0x00ad
        L_0x00ac:
            r6 = r3
        L_0x00ad:
            int r1 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r1 >= 0) goto L_0x00c5
            java.lang.String r1 = "Range"
            java.lang.String r2 = "bytes="
            java.lang.String r9 = "-"
            java.lang.StringBuilder r2 = defpackage.tr1.n(r3, r2, r9)
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            r13.k(r1, r2)
        L_0x00c5:
            java.lang.String r1 = "User-Agent"
            java.lang.String r2 = r0.a
            r13.k(r1, r2)
            if (r8 != 0) goto L_0x00d5
            java.lang.String r1 = "Accept-Encoding"
            java.lang.String r2 = "identity"
            r13.k(r1, r2)
        L_0x00d5:
            if (r14 == 0) goto L_0x01fb
            lx6 r16 = r13.n()
            byte[] r1 = defpackage.u0g.a
            boolean r1 = r11.isEmpty()
            if (r1 == 0) goto L_0x00ea
            java.util.Map r1 = kotlin.collections.MapsKt.emptyMap()
        L_0x00e7:
            r18 = r1
            goto L_0x00f4
        L_0x00ea:
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>(r11)
            java.util.Map r1 = java.util.Collections.unmodifiableMap(r1)
            goto L_0x00e7
        L_0x00f4:
            y2d r1 = new y2d
            r17 = 0
            r13 = r1
            r13.<init>(r14, r15, r16, r17, r18)
            r0.x = r1
            fz0 r2 = r0.c     // Catch:{ IOException -> 0x01de }
            rla r2 = (defpackage.rla) r2     // Catch:{ IOException -> 0x01de }
            jtc r1 = r2.b(r1)     // Catch:{ IOException -> 0x01de }
            k4d r1 = r1.h()     // Catch:{ IOException -> 0x01de }
            r0.w = r1     // Catch:{ IOException -> 0x01de }
            int r2 = r1.o
            boolean r1 = r1.isSuccessful()
            if (r1 == 0) goto L_0x017c
            k4d r1 = r0.w
            ptc r1 = r1.x
            f19 r1 = r1.o()
            java.lang.String r1 = r1.a
            boolean r3 = r1.isEmpty()
            if (r3 != 0) goto L_0x016c
            r1 = 200(0xc8, float:2.8E-43)
            if (r2 != r1) goto L_0x0131
            long r1 = r5.f
            r3 = 0
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 == 0) goto L_0x0133
            goto L_0x0134
        L_0x0131:
            r3 = 0
        L_0x0133:
            r1 = r3
        L_0x0134:
            r0.z = r1
            int r1 = r5.i
            r2 = 1
            r1 = r1 & r2
            if (r1 != 0) goto L_0x0159
            k4d r1 = r0.w
            ptc r1 = r1.x
            long r1 = r1.n()
            long r3 = r5.g
            int r6 = (r3 > r19 ? 1 : (r3 == r19 ? 0 : -1))
            if (r6 == 0) goto L_0x014b
            goto L_0x0155
        L_0x014b:
            int r3 = (r1 > r19 ? 1 : (r1 == r19 ? 0 : -1))
            if (r3 == 0) goto L_0x0153
            long r3 = r0.z
            long r19 = r1 - r3
        L_0x0153:
            r3 = r19
        L_0x0155:
            r0.X = r3
        L_0x0157:
            r1 = 1
            goto L_0x015e
        L_0x0159:
            long r1 = r5.g
            r0.X = r1
            goto L_0x0157
        L_0x015e:
            r0.y = r1
            arf r2 = r0.o
            if (r2 == 0) goto L_0x0169
            vc4 r2 = (defpackage.vc4) r2
            r2.g(r5, r1)
        L_0x0169:
            long r0 = r0.X
            return r0
        L_0x016c:
            k4d r2 = r0.w
            ptc r2 = r2.x
            defpackage.u0g.c(r2)
            r2 = 0
            r0.w = r2
            com.google.android.exoplayer2.upstream.HttpDataSource$InvalidContentTypeException r0 = new com.google.android.exoplayer2.upstream.HttpDataSource$InvalidContentTypeException
            r0.<init>(r1, r5)
            throw r0
        L_0x017c:
            y2d r1 = r0.x
            lx6 r1 = r1.d
            r1.getClass()
            java.util.TreeMap r4 = new java.util.TreeMap
            kotlin.jvm.internal.StringCompanionObject r3 = kotlin.jvm.internal.StringCompanionObject.INSTANCE
            java.util.Comparator r3 = kotlin.text.StringsKt.getCASE_INSENSITIVE_ORDER(r3)
            r4.<init>(r3)
            int r3 = r1.size()
            r10 = 0
        L_0x0193:
            if (r10 >= r3) goto L_0x01c4
            java.lang.String r6 = r1.d(r10)
            java.util.Locale r7 = java.util.Locale.US
            if (r6 == 0) goto L_0x01bc
            java.lang.String r6 = r6.toLowerCase(r7)
            java.lang.Object r7 = r4.get(r6)
            java.util.List r7 = (java.util.List) r7
            if (r7 != 0) goto L_0x01b2
            java.util.ArrayList r7 = new java.util.ArrayList
            r8 = 2
            r7.<init>(r8)
            r4.put(r6, r7)
        L_0x01b2:
            java.lang.String r6 = r1.f(r10)
            r7.add(r6)
            r6 = 1
            int r10 = r10 + r6
            goto L_0x0193
        L_0x01bc:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "null cannot be cast to non-null type java.lang.String"
            r0.<init>(r1)
            throw r0
        L_0x01c4:
            k4d r1 = r0.w
            ptc r1 = r1.x
            defpackage.u0g.c(r1)
            r1 = 0
            r0.w = r1
            com.google.android.exoplayer2.upstream.HttpDataSource$InvalidResponseCodeException r6 = new com.google.android.exoplayer2.upstream.HttpDataSource$InvalidResponseCodeException
            int r0 = defpackage.t0g.a
            r3 = 0
            r7 = 0
            r0 = r6
            r1 = r2
            r2 = r3
            r3 = r7
            r5 = r22
            r0.<init>(r1, r2, r3, r4, r5)
            throw r6
        L_0x01de:
            r0 = move-exception
            com.google.android.exoplayer2.upstream.HttpDataSource$HttpDataSourceException r1 = new com.google.android.exoplayer2.upstream.HttpDataSource$HttpDataSourceException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Unable to connect to "
            r2.<init>(r3)
            android.net.Uri r3 = r5.a
            java.lang.String r3 = r3.toString()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r3 = 2000(0x7d0, float:2.803E-42)
            r1.<init>((java.lang.String) r2, (java.io.IOException) r0, (defpackage.p74) r5, (int) r3)
            throw r1
        L_0x01fb:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "url == null"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0207:
            monitor-exit(r10)     // Catch:{ all -> 0x008f }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.waf.N(p74):long");
    }

    public final void O(arf arf) {
    }

    public final int a(int i, byte[] bArr, int i2) {
        long j = this.X;
        if (j != -1) {
            i2 = (int) Math.min((long) i2, j - this.Z);
        }
        if (i2 == 0) {
            return -1;
        }
        int read = this.w.x.m().read(bArr, i, i2);
        if (read == -1) {
            long j2 = this.X;
            if (j2 == -1 || j2 == this.Z) {
                return -1;
            }
            throw new EOFException();
        }
        this.Z += (long) read;
        arf arf = this.o;
        if (arf != null) {
            ((vc4) arf).e(this.v, true, read);
        }
        return read;
    }

    public final void b() {
        if (this.Y != this.z) {
            AtomicReference atomicReference = v0;
            byte[] bArr = (byte[]) atomicReference.getAndSet((Object) null);
            if (bArr == null) {
                bArr = new byte[ConstantsKt.DEFAULT_BLOCK_SIZE];
            }
            while (true) {
                long j = this.Y;
                long j2 = this.z;
                if (j != j2) {
                    int read = this.w.x.m().read(bArr, 0, (int) Math.min(j2 - j, (long) bArr.length));
                    if (Thread.interrupted()) {
                        throw new InterruptedIOException();
                    } else if (read != -1) {
                        this.Y += (long) read;
                        arf arf = this.o;
                        if (arf != null) {
                            ((vc4) arf).e(this.v, true, read);
                        }
                    } else {
                        throw new EOFException();
                    }
                } else {
                    atomicReference.set(bArr);
                    return;
                }
            }
        }
    }

    public final void close() {
        if (this.y) {
            this.y = false;
            arf arf = this.o;
            if (arf != null) {
                ((vc4) arf).f(this.v, true);
            }
            u0g.c(this.w.x);
            this.w = null;
        }
    }

    public final Uri getUri() {
        y2d y2d = this.x;
        if (y2d == null) {
            return null;
        }
        return Uri.parse(y2d.b.j);
    }

    public final int read(byte[] bArr, int i, int i2) {
        try {
            b();
            return a(i, bArr, i2);
        } catch (IOException e) {
            throw HttpDataSource$HttpDataSourceException.b(e, this.v, 2);
        }
    }

    public final Map x() {
        return Collections.emptyMap();
    }
}
