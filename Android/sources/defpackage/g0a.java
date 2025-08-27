package defpackage;

import android.media.MediaCodec;
import android.util.SparseArray;
import androidx.media3.muxer.Muxer$MuxerException;
import java.io.File;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: g0a  reason: default package */
public final class g0a {
    public static final long x = v0g.S(500);
    public final String a;
    public final b0a b;
    public final bpa c;
    public final boolean d;
    public final SparseArray e;
    public final ScheduledExecutorService f;
    public final ea6 g;
    public final long h;
    public final MediaCodec.BufferInfo i;
    public boolean j;
    public boolean k;
    public int l;
    public long m;
    public long n;
    public ScheduledFuture o;
    public boolean p;
    public e0a q;
    public int r;
    public boolean s;
    public boolean t;
    public long u;
    public volatile int v;
    public volatile int w;

    public g0a(String str, b0a b0a, bpa bpa, int i2, boolean z, ea6 ea6, long j2) {
        this.a = str;
        this.b = b0a;
        this.c = bpa;
        boolean z2 = false;
        n79.g(i2 == 0 || i2 == 1);
        this.r = i2;
        this.d = z;
        if ((i2 == 0 && ea6 == null) || (i2 == 1 && ea6 != null)) {
            z2 = true;
        }
        n79.f("appendVideoFormat must be present if and only if muxerMode is MUXER_MODE_MUX_PARTIAL.", z2);
        this.g = ea6;
        this.h = j2;
        this.e = new SparseArray();
        this.l = -2;
        this.u = -9223372036854775807L;
        this.f = Executors.newSingleThreadScheduledExecutor(new td3(3, "Muxer:Timer"));
        this.i = new MediaCodec.BufferInfo();
    }

    public static f0a e(SparseArray sparseArray) {
        if (sparseArray.size() == 0) {
            return null;
        }
        f0a f0a = (f0a) sparseArray.valueAt(0);
        for (int i2 = 1; i2 < sparseArray.size(); i2++) {
            f0a f0a2 = (f0a) sparseArray.valueAt(i2);
            if (f0a2.e < f0a.e) {
                f0a = f0a2;
            }
        }
        return f0a;
    }

    public final void a(ea6 ea6) {
        String str = ea6.n;
        int g2 = vq9.g(str);
        int i2 = 0;
        n79.f("Unsupported track format: " + str, g2 == 1 || g2 == 2);
        if (g2 == 2) {
            ba6 a2 = ea6.a();
            a2.v = (ea6.w + this.v) % 360;
            ea6 = new ea6(a2);
            if (this.r == 1) {
                ea6 ea62 = this.g;
                ea62.getClass();
                boolean c2 = ea6.c(ea62);
                List list = ea6.q;
                if (!c2) {
                    if (Objects.equals(ea62.n, "video/avc") && Objects.equals(ea6.n, "video/avc")) {
                        List list2 = ea62.q;
                        if (list2.size() == 2 && list.size() == 2 && Arrays.equals((byte[]) list2.get(1), (byte[]) list.get(1))) {
                            byte[] bArr = (byte[]) list2.get(0);
                            byte[] bArr2 = (byte[]) list.get(0);
                            if (7 < bArr.length && bArr.length == bArr2.length) {
                                int i3 = 0;
                                while (true) {
                                    if (i3 < bArr.length) {
                                        if (i3 != 7 && bArr[i3] != bArr2[i3]) {
                                            break;
                                        }
                                        i3++;
                                    } else {
                                        int i4 = 0;
                                        while (true) {
                                            if (i4 < 4) {
                                                if (bArr[i4] != b0h.b[i4]) {
                                                    break;
                                                }
                                                i4++;
                                            } else if ((bArr[4] & 31) == 7 && bArr[5] != 0) {
                                                if (bArr2[7] < bArr[7]) {
                                                    list = list2;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    list = null;
                }
                if (list != null) {
                    ba6 a3 = ea6.a();
                    a3.p = list;
                    ea6 = new ea6(a3);
                } else {
                    throw new Exception("Switching to MUXER_MODE_APPEND will fail.");
                }
            }
        }
        if (this.r == 2) {
            if (g2 == 2) {
                n79.n(v0g.l(this.e, 2));
                ea6 ea63 = ((f0a) this.e.get(2)).a;
                if (!v0g.a(ea63.n, ea6.n)) {
                    throw new Exception("Video format mismatch - sampleMimeType: " + ea63.n + " != " + ea6.n);
                } else if (ea63.t != ea6.t) {
                    throw new Exception("Video format mismatch - width: " + ea63.t + " != " + ea6.t);
                } else if (ea63.u != ea6.u) {
                    throw new Exception("Video format mismatch - height: " + ea63.u + " != " + ea6.u);
                } else if (ea63.w == ea6.w) {
                    ea6 ea64 = this.g;
                    ea64.getClass();
                    if (!ea6.c(ea64)) {
                        throw new Exception("The initialization data of the newly added track format doesn't match appendVideoFormat.");
                    }
                } else {
                    throw new Exception("Video format mismatch - rotationDegrees: " + ea63.w + " != " + ea6.w);
                }
            } else if (g2 == 1) {
                n79.n(v0g.l(this.e, 1));
                ea6 ea65 = ((f0a) this.e.get(1)).a;
                if (!v0g.a(ea65.n, ea6.n)) {
                    throw new Exception("Audio format mismatch - sampleMimeType: " + ea65.n + " != " + ea6.n);
                } else if (ea65.B != ea6.B) {
                    throw new Exception("Audio format mismatch - channelCount: " + ea65.B + " != " + ea6.B);
                } else if (ea65.C != ea6.C) {
                    throw new Exception("Audio format mismatch - sampleRate: " + ea65.C + " != " + ea6.C);
                } else if (!ea65.c(ea6)) {
                    throw new Exception("Audio format mismatch - initializationData.");
                }
            }
            g();
            return;
        }
        int i5 = this.w;
        n79.m("The track count should be set before the formats are added.", i5 > 0);
        n79.m("All track formats have already been added.", this.e.size() < i5);
        n79.m("There is already a track of type " + g2, !v0g.l(this.e, g2));
        if (this.q == null) {
            this.q = this.b.N(this.a);
        }
        this.e.put(g2, new f0a(ea6, this.q.i(ea6)));
        v0g.H(g2);
        LinkedHashMap linkedHashMap = p94.a;
        synchronized (p94.class) {
        }
        if (ea6.k != null) {
            while (true) {
                qp9[] qp9Arr = ea6.k.a;
                if (i2 >= qp9Arr.length) {
                    break;
                }
                this.q.c(qp9Arr[i2]);
                i2++;
            }
        }
        if (this.e.size() == i5) {
            this.j = true;
            g();
        }
    }

    public final void b() {
        boolean z = true;
        if (this.r != 1) {
            z = false;
        }
        n79.n(z);
        this.r = 2;
    }

    public final void c(int i2) {
        if (i2 != 0 || this.r != 1) {
            this.j = false;
            this.f.shutdownNow();
            e0a e0a = this.q;
            if (e0a != null) {
                try {
                    e0a.close();
                } catch (Muxer$MuxerException e2) {
                    if (i2 == 1) {
                        String message = e2.getMessage();
                        message.getClass();
                        if (message.equals("Failed to stop the MediaMuxer")) {
                            return;
                        }
                    }
                    throw e2;
                }
            }
        }
    }

    public final long d() {
        long length = new File(this.a).length();
        if (length > 0) {
            return length;
        }
        return -1;
    }

    public final boolean f() {
        if (!this.k) {
            return this.r == 1 && this.s && (this.t || this.w == 1);
        }
        return true;
    }

    public final void g() {
        n79.o(this.q);
        long j2 = this.h;
        if (j2 != -9223372036854775807L) {
            ScheduledFuture scheduledFuture = this.o;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            this.o = this.f.schedule(new o99(6, this), j2, TimeUnit.MILLISECONDS);
        }
    }

    public final boolean h(String str) {
        return this.b.C(vq9.g(str)).contains(str);
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final boolean i(int r19, java.nio.ByteBuffer r20, boolean r21, long r22) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r21
            r5 = r22
            r3 = 4
            android.util.SparseArray r4 = r0.e
            boolean r4 = defpackage.v0g.l(r4, r1)
            defpackage.n79.g(r4)
            android.util.SparseArray r4 = r0.e
            java.lang.Object r4 = r4.get(r1)
            r8 = r4
            f0a r8 = (defpackage.f0a) r8
            boolean r4 = r0.d
            android.util.SparseArray r7 = r0.e
            r9 = 1
            r10 = 0
            r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r13 = 2
            if (r4 == 0) goto L_0x0039
            if (r1 == r13) goto L_0x0039
            boolean r4 = defpackage.v0g.l(r7, r13)
            if (r4 == 0) goto L_0x0039
            long r14 = r0.u
            int r4 = (r14 > r11 ? 1 : (r14 == r11 ? 0 : -1))
            if (r4 != 0) goto L_0x0039
        L_0x0037:
            r4 = r10
            goto L_0x0080
        L_0x0039:
            boolean r4 = r0.j
            if (r4 != 0) goto L_0x003e
            goto L_0x0037
        L_0x003e:
            int r4 = r7.size()
            if (r4 != r9) goto L_0x0046
        L_0x0044:
            r4 = r9
            goto L_0x0080
        L_0x0046:
            java.lang.Object r4 = r7.get(r1)
            f0a r4 = (defpackage.f0a) r4
            long r14 = r4.e
            long r14 = r5 - r14
            long r16 = x
            int r4 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r4 <= 0) goto L_0x0068
            f0a r4 = e(r7)
            r4.getClass()
            ea6 r4 = r4.a
            java.lang.String r4 = r4.n
            int r4 = defpackage.vq9.g(r4)
            if (r4 != r1) goto L_0x0068
        L_0x0067:
            goto L_0x0044
        L_0x0068:
            int r4 = r0.l
            if (r1 == r4) goto L_0x0077
            f0a r4 = e(r7)
            r4.getClass()
            long r14 = r4.e
            r0.m = r14
        L_0x0077:
            long r14 = r0.m
            long r14 = r5 - r14
            int r4 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r4 > 0) goto L_0x0037
            goto L_0x0067
        L_0x0080:
            defpackage.v0g.H(r19)
            java.util.LinkedHashMap r7 = defpackage.p94.a
            java.lang.Class<p94> r7 = defpackage.p94.class
            monitor-enter(r7)
            monitor-exit(r7)
            if (r1 != r13) goto L_0x0094
            long r13 = r0.u
            int r7 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r7 != 0) goto L_0x00b0
            r0.u = r5
            goto L_0x00b0
        L_0x0094:
            if (r1 != r9) goto L_0x00b0
            boolean r7 = r0.d
            if (r7 == 0) goto L_0x00b0
            android.util.SparseArray r7 = r0.e
            boolean r7 = defpackage.v0g.l(r7, r13)
            if (r7 == 0) goto L_0x00b0
            long r13 = r0.u
            int r7 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r7 == 0) goto L_0x00b0
            int r7 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r7 >= 0) goto L_0x00b0
            r18.g()
            return r9
        L_0x00b0:
            if (r4 != 0) goto L_0x00b3
            return r10
        L_0x00b3:
            int r4 = r8.d
            int r4 = r4 + r9
            r8.d = r4
            long r11 = r8.c
            int r4 = r20.remaining()
            long r13 = (long) r4
            long r11 = r11 + r13
            r8.c = r11
            long r11 = r8.e
            long r11 = java.lang.Math.max(r11, r5)
            r8.e = r11
            r18.g()
            e0a r4 = r0.q
            defpackage.n79.o(r4)
            android.media.MediaCodec$BufferInfo r4 = r0.i
            int r7 = r20.position()
            int r11 = r20.remaining()
            if (r2 != r9) goto L_0x00df
            r10 = r9
        L_0x00df:
            r2 = r2 & r3
            if (r2 != r3) goto L_0x00e5
            r2 = r10 | 4
            r10 = r2
        L_0x00e5:
            r2 = r4
            r3 = r7
            r4 = r11
            r5 = r22
            r7 = r10
            r2.set(r3, r4, r5, r7)
            e0a r2 = r0.q
            we6 r3 = r8.b
            android.media.MediaCodec$BufferInfo r4 = r0.i
            r5 = r20
            r2.h(r3, r5, r4)
            defpackage.v0g.H(r19)
            java.lang.Class<p94> r2 = defpackage.p94.class
            monitor-enter(r2)
            monitor-exit(r2)
            r0.l = r1
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g0a.i(int, java.nio.ByteBuffer, boolean, long):boolean");
    }
}
