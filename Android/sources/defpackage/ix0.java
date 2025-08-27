package defpackage;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.cache.Cache$CacheException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.LongCompanionObject;

/* renamed from: ix0  reason: default package */
public final class ix0 implements h74 {
    public boolean A0;
    public long B0;
    public p74 X;
    public p74 Y;
    public h74 Z;
    public final cx0 a;
    public final h74 b;
    public final kef c;
    public final h74 o;
    public final rx0 v;
    public long v0;
    public final boolean w;
    public long w0;
    public final boolean x;
    public long x0;
    public final boolean y;
    public vae y0;
    public Uri z;
    public boolean z0;

    public ix0(cx0 cx0, h74 h74, h74 h742, fx0 fx0, int i) {
        rx0 rx0 = rx0.b;
        this.a = cx0;
        this.b = h742;
        this.v = rx0;
        boolean z2 = true;
        this.w = (i & 1) != 0;
        this.x = (i & 2) != 0;
        this.y = (i & 4) == 0 ? false : z2;
        kef kef = null;
        if (h74 != null) {
            this.o = h74;
            this.c = fx0 != null ? new kef(h74, fx0) : kef;
            return;
        }
        this.o = ux4.a;
        this.c = null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0070 A[Catch:{ all -> 0x0073 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0075 A[Catch:{ all -> 0x0073 }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0099 A[Catch:{ all -> 0x0073 }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00b6 A[Catch:{ all -> 0x0073 }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00b7 A[Catch:{ all -> 0x0073 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long N(defpackage.p74 r17) {
        /*
            r16 = this;
            r1 = r16
            r0 = r17
            cx0 r2 = r1.a
            rx0 r4 = r1.v     // Catch:{ all -> 0x0073 }
            r4.getClass()     // Catch:{ all -> 0x0073 }
            java.lang.String r4 = r0.h     // Catch:{ all -> 0x0073 }
            if (r4 == 0) goto L_0x0010
            goto L_0x0016
        L_0x0010:
            android.net.Uri r4 = r0.a     // Catch:{ all -> 0x0073 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0073 }
        L_0x0016:
            long r5 = r0.f
            o74 r7 = r17.a()     // Catch:{ all -> 0x0073 }
            r7.i = r4     // Catch:{ all -> 0x0073 }
            p74 r7 = r7.a()     // Catch:{ all -> 0x0073 }
            r1.X = r7     // Catch:{ all -> 0x0073 }
            android.net.Uri r8 = r7.a     // Catch:{ all -> 0x0073 }
            r9 = r2
            sae r9 = (defpackage.sae) r9     // Catch:{ all -> 0x0073 }
            nd4 r9 = r9.g(r4)     // Catch:{ all -> 0x0073 }
            java.util.Map r9 = r9.b     // Catch:{ all -> 0x0073 }
            java.lang.String r10 = "exo_redir"
            java.lang.Object r9 = r9.get(r10)     // Catch:{ all -> 0x0073 }
            byte[] r9 = (byte[]) r9     // Catch:{ all -> 0x0073 }
            r10 = 0
            if (r9 == 0) goto L_0x0042
            java.lang.String r11 = new java.lang.String     // Catch:{ all -> 0x0073 }
            java.nio.charset.Charset r12 = defpackage.x22.c     // Catch:{ all -> 0x0073 }
            r11.<init>(r9, r12)     // Catch:{ all -> 0x0073 }
            goto L_0x0043
        L_0x0042:
            r11 = r10
        L_0x0043:
            if (r11 != 0) goto L_0x0046
            goto L_0x004a
        L_0x0046:
            android.net.Uri r10 = android.net.Uri.parse(r11)     // Catch:{ all -> 0x0073 }
        L_0x004a:
            if (r10 == 0) goto L_0x004d
            r8 = r10
        L_0x004d:
            r1.z = r8     // Catch:{ all -> 0x0073 }
            r1.w0 = r5     // Catch:{ all -> 0x0073 }
            boolean r8 = r1.x     // Catch:{ all -> 0x0073 }
            r9 = 0
            r10 = -1
            long r12 = r0.g
            if (r8 == 0) goto L_0x005f
            boolean r0 = r1.z0     // Catch:{ all -> 0x0073 }
            if (r0 == 0) goto L_0x005f
            goto L_0x0067
        L_0x005f:
            boolean r0 = r1.y     // Catch:{ all -> 0x0073 }
            if (r0 == 0) goto L_0x0069
            int r0 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r0 != 0) goto L_0x0069
        L_0x0067:
            r0 = 1
            goto L_0x006a
        L_0x0069:
            r0 = r9
        L_0x006a:
            r1.A0 = r0     // Catch:{ all -> 0x0073 }
            r14 = 0
            if (r0 == 0) goto L_0x0075
            r1.x0 = r10     // Catch:{ all -> 0x0073 }
            goto L_0x0095
        L_0x0073:
            r0 = move-exception
            goto L_0x00ba
        L_0x0075:
            sae r2 = (defpackage.sae) r2     // Catch:{ all -> 0x0073 }
            nd4 r0 = r2.g(r4)     // Catch:{ all -> 0x0073 }
            long r3 = defpackage.mv3.a(r0)     // Catch:{ all -> 0x0073 }
            r1.x0 = r3     // Catch:{ all -> 0x0073 }
            int r0 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r0 == 0) goto L_0x0095
            long r3 = r3 - r5
            r1.x0 = r3     // Catch:{ all -> 0x0073 }
            int r0 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r0 < 0) goto L_0x008d
            goto L_0x0095
        L_0x008d:
            com.google.android.exoplayer2.upstream.DataSourceException r0 = new com.google.android.exoplayer2.upstream.DataSourceException     // Catch:{ all -> 0x0073 }
            r3 = 2008(0x7d8, float:2.814E-42)
            r0.<init>(r3)     // Catch:{ all -> 0x0073 }
            throw r0     // Catch:{ all -> 0x0073 }
        L_0x0095:
            int r0 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r0 == 0) goto L_0x00a7
            long r3 = r1.x0     // Catch:{ all -> 0x0073 }
            int r5 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r5 != 0) goto L_0x00a1
            r3 = r12
            goto L_0x00a5
        L_0x00a1:
            long r3 = java.lang.Math.min(r3, r12)     // Catch:{ all -> 0x0073 }
        L_0x00a5:
            r1.x0 = r3     // Catch:{ all -> 0x0073 }
        L_0x00a7:
            long r3 = r1.x0     // Catch:{ all -> 0x0073 }
            int r5 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r5 > 0) goto L_0x00b1
            int r3 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r3 != 0) goto L_0x00b4
        L_0x00b1:
            r1.b(r7, r9)     // Catch:{ all -> 0x0073 }
        L_0x00b4:
            if (r0 == 0) goto L_0x00b7
            goto L_0x00b9
        L_0x00b7:
            long r12 = r1.x0     // Catch:{ all -> 0x0073 }
        L_0x00b9:
            return r12
        L_0x00ba:
            h74 r3 = r1.Z
            h74 r4 = r1.b
            if (r3 == r4) goto L_0x00c4
            boolean r3 = r0 instanceof com.google.android.exoplayer2.upstream.cache.Cache$CacheException
            if (r3 == 0) goto L_0x00c7
        L_0x00c4:
            r2 = 1
            r1.z0 = r2
        L_0x00c7:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ix0.N(p74):long");
    }

    public final void O(arf arf) {
        arf.getClass();
        this.b.O(arf);
        this.o.O(arf);
    }

    public final void a() {
        cx0 cx0 = this.a;
        h74 h74 = this.Z;
        if (h74 != null) {
            try {
                h74.close();
            } finally {
                this.Y = null;
                this.Z = null;
                vae vae = this.y0;
                if (vae != null) {
                    ((sae) cx0).i(vae);
                    this.y0 = null;
                }
            }
        }
    }

    public final void b(p74 p74, boolean z2) {
        vae vae;
        p74 p742;
        h74 h74;
        p74 p743 = p74;
        String str = p743.h;
        int i = t0g.a;
        Uri uri = null;
        if (this.A0) {
            vae = null;
        } else if (this.w) {
            try {
                cx0 cx0 = this.a;
                long j = this.w0;
                long j2 = this.x0;
                sae sae = (sae) cx0;
                synchronized (sae) {
                    sae.d();
                    while (true) {
                        vae = sae.l(j, str, j2);
                        if (vae != null) {
                            break;
                        }
                        sae.wait();
                    }
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                throw new InterruptedIOException();
            }
        } else {
            vae = ((sae) this.a).l(this.w0, str, this.x0);
        }
        if (vae == null) {
            h74 = this.o;
            o74 a2 = p74.a();
            a2.g = this.w0;
            a2.h = this.x0;
            p742 = a2.a();
        } else if (vae.o) {
            Uri fromFile = Uri.fromFile(vae.v);
            long j3 = vae.b;
            long j4 = this.w0 - j3;
            long j5 = vae.c - j4;
            long j6 = this.x0;
            if (j6 != -1) {
                j5 = Math.min(j5, j6);
            }
            o74 a3 = p74.a();
            a3.b = fromFile;
            a3.c = j3;
            a3.g = j4;
            a3.h = j5;
            p742 = a3.a();
            h74 = this.b;
        } else {
            long j7 = vae.c;
            if (j7 == -1) {
                j7 = this.x0;
            } else {
                long j8 = this.x0;
                if (j8 != -1) {
                    j7 = Math.min(j7, j8);
                }
            }
            o74 a4 = p74.a();
            a4.g = this.w0;
            a4.h = j7;
            p742 = a4.a();
            h74 = this.c;
            if (h74 == null) {
                h74 = this.o;
                ((sae) this.a).i(vae);
                vae = null;
            }
        }
        this.B0 = (this.A0 || h74 != this.o) ? LongCompanionObject.MAX_VALUE : this.w0 + 102400;
        boolean z3 = false;
        if (z2) {
            y64.j(this.Z == this.o);
            if (h74 != this.o) {
                try {
                    a();
                } catch (Throwable th) {
                    Throwable th2 = th;
                    if (!vae.o) {
                        ((sae) this.a).i(vae);
                    }
                    throw th2;
                }
            } else {
                return;
            }
        }
        if (vae != null && (!vae.o)) {
            this.y0 = vae;
        }
        this.Z = h74;
        this.Y = p742;
        this.v0 = 0;
        long N = h74.N(p742);
        npg npg = new npg(8);
        if (p742.g == -1 && N != -1) {
            this.x0 = N;
            npg.v(Long.valueOf(this.w0 + N), "exo_len");
        }
        if (this.Z == this.b) {
            z3 = true;
        }
        if (!z3) {
            Uri uri2 = h74.getUri();
            this.z = uri2;
            if (!p743.a.equals(uri2)) {
                uri = this.z;
            }
            if (uri == null) {
                ((ArrayList) npg.c).add("exo_redir");
                ((HashMap) npg.b).remove("exo_redir");
            } else {
                npg.v(uri.toString(), "exo_redir");
            }
        }
        if (this.Z == this.c) {
            ((sae) this.a).c(str, npg);
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
        h74 h74 = this.b;
        boolean z2 = false;
        if (i4 == 0) {
            return 0;
        }
        if (this.x0 == 0) {
            return -1;
        }
        p74 p74 = this.X;
        p74.getClass();
        p74 p742 = this.Y;
        p742.getClass();
        try {
            if (this.w0 >= this.B0) {
                b(p74, true);
            }
            h74 h742 = this.Z;
            h742.getClass();
            int read = h742.read(bArr, i, i4);
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
            h74 h743 = this.Z;
            if (!(h743 == h74)) {
                i3 = read;
                long j3 = p742.g;
                if (j3 == -1 || this.v0 < j3) {
                    String str = p74.h;
                    int i5 = t0g.a;
                    this.x0 = 0;
                    if (h743 == this.c) {
                        z2 = true;
                    }
                    if (!z2) {
                        return i3;
                    }
                    npg npg = new npg(8);
                    npg.v(Long.valueOf(this.w0), "exo_len");
                    ((sae) this.a).c(str, npg);
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
            b(p74, false);
            return read(bArr, i, i2);
        } catch (Throwable th) {
            if (this.Z == h74 || (th instanceof Cache$CacheException)) {
                this.z0 = true;
            }
            throw th;
        }
    }

    public final Map x() {
        return (this.Z == this.b) ^ true ? this.o.x() : Collections.emptyMap();
    }
}
