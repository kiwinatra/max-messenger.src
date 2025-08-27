package defpackage;

import android.net.Uri;
import androidx.media3.datasource.cache.Cache$CacheException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.LongCompanionObject;

/* renamed from: jx0  reason: default package */
public final class jx0 implements j74 {
    public boolean A0;
    public long B0;
    public q74 X;
    public q74 Y;
    public j74 Z;
    public final bx0 a;
    public final j74 b;
    public final lef c;
    public final j74 o;
    public final rx0 v;
    public long v0;
    public final boolean w;
    public long w0;
    public final boolean x;
    public long x0;
    public final boolean y;
    public wae y0;
    public Uri z;
    public boolean z0;

    public jx0(bx0 bx0, j74 j74, j74 j742, fx0 fx0, int i) {
        rx0 rx0 = rx0.c;
        this.a = bx0;
        this.b = j742;
        this.v = rx0;
        boolean z2 = true;
        this.w = (i & 1) != 0;
        this.x = (i & 2) != 0;
        this.y = (i & 4) == 0 ? false : z2;
        lef lef = null;
        if (j74 != null) {
            this.o = j74;
            this.c = fx0 != null ? new lef(j74, fx0) : lef;
            return;
        }
        this.o = snb.a;
        this.c = null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0066 A[Catch:{ all -> 0x0069 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x006b A[Catch:{ all -> 0x0069 }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x008f A[Catch:{ all -> 0x0069 }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00ac A[Catch:{ all -> 0x0069 }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00ad A[Catch:{ all -> 0x0069 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long G(defpackage.q74 r17) {
        /*
            r16 = this;
            r1 = r16
            r0 = r17
            bx0 r2 = r1.a
            rx0 r4 = r1.v     // Catch:{ all -> 0x0069 }
            java.lang.String r4 = r4.b(r0)     // Catch:{ all -> 0x0069 }
            long r5 = r0.f
            o74 r7 = r17.a()     // Catch:{ all -> 0x0069 }
            r7.i = r4     // Catch:{ all -> 0x0069 }
            q74 r7 = r7.b()     // Catch:{ all -> 0x0069 }
            r1.X = r7     // Catch:{ all -> 0x0069 }
            android.net.Uri r8 = r7.a     // Catch:{ all -> 0x0069 }
            r9 = r2
            tae r9 = (defpackage.tae) r9     // Catch:{ all -> 0x0069 }
            od4 r9 = r9.i(r4)     // Catch:{ all -> 0x0069 }
            java.util.Map r9 = r9.b     // Catch:{ all -> 0x0069 }
            java.lang.String r10 = "exo_redir"
            java.lang.Object r9 = r9.get(r10)     // Catch:{ all -> 0x0069 }
            byte[] r9 = (byte[]) r9     // Catch:{ all -> 0x0069 }
            r10 = 0
            if (r9 == 0) goto L_0x0038
            java.lang.String r11 = new java.lang.String     // Catch:{ all -> 0x0069 }
            java.nio.charset.Charset r12 = defpackage.x22.c     // Catch:{ all -> 0x0069 }
            r11.<init>(r9, r12)     // Catch:{ all -> 0x0069 }
            goto L_0x0039
        L_0x0038:
            r11 = r10
        L_0x0039:
            if (r11 != 0) goto L_0x003c
            goto L_0x0040
        L_0x003c:
            android.net.Uri r10 = android.net.Uri.parse(r11)     // Catch:{ all -> 0x0069 }
        L_0x0040:
            if (r10 == 0) goto L_0x0043
            r8 = r10
        L_0x0043:
            r1.z = r8     // Catch:{ all -> 0x0069 }
            r1.w0 = r5     // Catch:{ all -> 0x0069 }
            boolean r8 = r1.x     // Catch:{ all -> 0x0069 }
            r9 = 0
            r10 = -1
            long r12 = r0.g
            if (r8 == 0) goto L_0x0055
            boolean r0 = r1.z0     // Catch:{ all -> 0x0069 }
            if (r0 == 0) goto L_0x0055
            goto L_0x005d
        L_0x0055:
            boolean r0 = r1.y     // Catch:{ all -> 0x0069 }
            if (r0 == 0) goto L_0x005f
            int r0 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r0 != 0) goto L_0x005f
        L_0x005d:
            r0 = 1
            goto L_0x0060
        L_0x005f:
            r0 = r9
        L_0x0060:
            r1.A0 = r0     // Catch:{ all -> 0x0069 }
            r14 = 0
            if (r0 == 0) goto L_0x006b
            r1.x0 = r10     // Catch:{ all -> 0x0069 }
            goto L_0x008b
        L_0x0069:
            r0 = move-exception
            goto L_0x00b0
        L_0x006b:
            tae r2 = (defpackage.tae) r2     // Catch:{ all -> 0x0069 }
            od4 r0 = r2.i(r4)     // Catch:{ all -> 0x0069 }
            long r3 = defpackage.nv3.a(r0)     // Catch:{ all -> 0x0069 }
            r1.x0 = r3     // Catch:{ all -> 0x0069 }
            int r0 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r0 == 0) goto L_0x008b
            long r3 = r3 - r5
            r1.x0 = r3     // Catch:{ all -> 0x0069 }
            int r0 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r0 < 0) goto L_0x0083
            goto L_0x008b
        L_0x0083:
            androidx.media3.datasource.DataSourceException r0 = new androidx.media3.datasource.DataSourceException     // Catch:{ all -> 0x0069 }
            r3 = 2008(0x7d8, float:2.814E-42)
            r0.<init>(r3)     // Catch:{ all -> 0x0069 }
            throw r0     // Catch:{ all -> 0x0069 }
        L_0x008b:
            int r0 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r0 == 0) goto L_0x009d
            long r3 = r1.x0     // Catch:{ all -> 0x0069 }
            int r5 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r5 != 0) goto L_0x0097
            r3 = r12
            goto L_0x009b
        L_0x0097:
            long r3 = java.lang.Math.min(r3, r12)     // Catch:{ all -> 0x0069 }
        L_0x009b:
            r1.x0 = r3     // Catch:{ all -> 0x0069 }
        L_0x009d:
            long r3 = r1.x0     // Catch:{ all -> 0x0069 }
            int r5 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r5 > 0) goto L_0x00a7
            int r3 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r3 != 0) goto L_0x00aa
        L_0x00a7:
            r1.b(r7, r9)     // Catch:{ all -> 0x0069 }
        L_0x00aa:
            if (r0 == 0) goto L_0x00ad
            goto L_0x00af
        L_0x00ad:
            long r12 = r1.x0     // Catch:{ all -> 0x0069 }
        L_0x00af:
            return r12
        L_0x00b0:
            j74 r3 = r1.Z
            j74 r4 = r1.b
            if (r3 == r4) goto L_0x00ba
            boolean r3 = r0 instanceof androidx.media3.datasource.cache.Cache$CacheException
            if (r3 == 0) goto L_0x00bd
        L_0x00ba:
            r2 = 1
            r1.z0 = r2
        L_0x00bd:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jx0.G(q74):long");
    }

    public final void H(brf brf) {
        brf.getClass();
        this.b.H(brf);
        this.o.H(brf);
    }

    public final void a() {
        bx0 bx0 = this.a;
        j74 j74 = this.Z;
        if (j74 != null) {
            try {
                j74.close();
            } finally {
                this.Y = null;
                this.Z = null;
                wae wae = this.y0;
                if (wae != null) {
                    ((tae) bx0).k(wae);
                    this.y0 = null;
                }
            }
        }
    }

    public final void b(q74 q74, boolean z2) {
        wae wae;
        q74 q742;
        j74 j74;
        q74 q743 = q74;
        String str = q743.h;
        int i = v0g.a;
        Uri uri = null;
        if (this.A0) {
            wae = null;
        } else if (this.w) {
            try {
                bx0 bx0 = this.a;
                long j = this.w0;
                long j2 = this.x0;
                tae tae = (tae) bx0;
                synchronized (tae) {
                    tae.d();
                    while (true) {
                        wae = tae.o(j, str, j2);
                        if (wae != null) {
                            break;
                        }
                        tae.wait();
                    }
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                throw new InterruptedIOException();
            }
        } else {
            wae = ((tae) this.a).o(this.w0, str, this.x0);
        }
        if (wae == null) {
            j74 = this.o;
            o74 a2 = q74.a();
            a2.g = this.w0;
            a2.h = this.x0;
            q742 = a2.b();
        } else if (wae.o) {
            Uri fromFile = Uri.fromFile(wae.v);
            long j3 = wae.b;
            long j4 = this.w0 - j3;
            long j5 = wae.c - j4;
            long j6 = this.x0;
            if (j6 != -1) {
                j5 = Math.min(j5, j6);
            }
            o74 a3 = q74.a();
            a3.b = fromFile;
            a3.c = j3;
            a3.g = j4;
            a3.h = j5;
            q742 = a3.b();
            j74 = this.b;
        } else {
            long j7 = wae.c;
            if (j7 == -1) {
                j7 = this.x0;
            } else {
                long j8 = this.x0;
                if (j8 != -1) {
                    j7 = Math.min(j7, j8);
                }
            }
            o74 a4 = q74.a();
            a4.g = this.w0;
            a4.h = j7;
            q742 = a4.b();
            j74 = this.c;
            if (j74 == null) {
                j74 = this.o;
                ((tae) this.a).k(wae);
                wae = null;
            }
        }
        this.B0 = (this.A0 || j74 != this.o) ? LongCompanionObject.MAX_VALUE : this.w0 + 102400;
        boolean z3 = false;
        if (z2) {
            n79.n(this.Z == this.o);
            if (j74 != this.o) {
                try {
                    a();
                } catch (Throwable th) {
                    Throwable th2 = th;
                    if (!wae.o) {
                        ((tae) this.a).k(wae);
                    }
                    throw th2;
                }
            } else {
                return;
            }
        }
        if (wae != null && (!wae.o)) {
            this.y0 = wae;
        }
        this.Z = j74;
        this.Y = q742;
        this.v0 = 0;
        long G = j74.G(q742);
        dm4 dm4 = new dm4(9);
        if (q742.g == -1 && G != -1) {
            this.x0 = G;
            dm4.h(Long.valueOf(this.w0 + G), "exo_len");
        }
        if (this.Z == this.b) {
            z3 = true;
        }
        if (!z3) {
            Uri uri2 = j74.getUri();
            this.z = uri2;
            if (!q743.a.equals(uri2)) {
                uri = this.z;
            }
            if (uri == null) {
                ((ArrayList) dm4.c).add("exo_redir");
                ((HashMap) dm4.b).remove("exo_redir");
            } else {
                dm4.h(uri.toString(), "exo_redir");
            }
        }
        if (this.Z == this.c) {
            ((tae) this.a).c(str, dm4);
        }
    }

    public final void close() {
        this.X = null;
        this.z = null;
        this.w0 = 0;
        try {
            a();
        } catch (Throwable th) {
            if (this.Z == this.b || (th instanceof Cache$CacheException)) {
                this.z0 = true;
            }
            throw th;
        }
    }

    public final Uri getUri() {
        return this.z;
    }

    public final int read(byte[] bArr, int i, int i2) {
        int i3;
        int i4 = i2;
        j74 j74 = this.b;
        boolean z2 = false;
        if (i4 == 0) {
            return 0;
        }
        if (this.x0 == 0) {
            return -1;
        }
        q74 q74 = this.X;
        q74.getClass();
        q74 q742 = this.Y;
        q742.getClass();
        try {
            if (this.w0 >= this.B0) {
                b(q74, true);
            }
            j74 j742 = this.Z;
            j742.getClass();
            int read = j742.read(bArr, i, i4);
            if (read != -1) {
                long j = (long) read;
                this.w0 += j;
                this.v0 += j;
                long j2 = this.x0;
                if (j2 != -1) {
                    this.x0 = j2 - j;
                }
                return read;
            }
            j74 j743 = this.Z;
            if (!(j743 == j74)) {
                i3 = read;
                long j3 = q742.g;
                if (j3 == -1 || this.v0 < j3) {
                    String str = q74.h;
                    int i5 = v0g.a;
                    this.x0 = 0;
                    if (j743 == this.c) {
                        z2 = true;
                    }
                    if (!z2) {
                        return i3;
                    }
                    dm4 dm4 = new dm4(9);
                    dm4.h(Long.valueOf(this.w0), "exo_len");
                    ((tae) this.a).c(str, dm4);
                    return i3;
                }
            } else {
                i3 = read;
            }
            long j4 = this.x0;
            if (j4 <= 0) {
                if (j4 != -1) {
                    return i3;
                }
            }
            a();
            b(q74, false);
            return read(bArr, i, i2);
        } catch (Throwable th) {
            if (this.Z == j74 || (th instanceof Cache$CacheException)) {
                this.z0 = true;
            }
            throw th;
        }
    }

    public final Map x() {
        return (this.Z == this.b) ^ true ? this.o.x() : Collections.emptyMap();
    }
}
