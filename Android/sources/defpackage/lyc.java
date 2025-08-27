package defpackage;

import android.media.MediaMuxer;
import android.net.Uri;
import android.util.Size;
import android.view.Surface;
import androidx.camera.video.internal.audio.AudioSourceAccessException;
import androidx.camera.video.internal.compat.quirk.DeactivateEncoderSurfaceBeforeStopEncoderQuirk;
import androidx.camera.video.internal.compat.quirk.EncoderNotUsePersistentInputSurfaceQuirk;
import androidx.camera.video.internal.encoder.InvalidConfigException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.LongCompanionObject;

/* renamed from: lyc  reason: default package */
public final class lyc implements h7g {
    public static final Set h0 = Collections.unmodifiableSet(EnumSet.of(kyc.b, kyc.c));
    public static final Set i0 = Collections.unmodifiableSet(EnumSet.of(kyc.a, kyc.o, kyc.y, kyc.x, kyc.z));
    public static final zqd j0;
    public static final yc0 k0;
    public static final lb0 l0;
    public static final RuntimeException m0 = new RuntimeException("The video frame producer became inactive before any data was received.");
    public static final ts1 n0 = new Object();
    public static final tsd o0 = new tsd(ryg.F());
    public static final int p0 = 3;
    public static final long q0 = 1000;
    public Surface A;
    public Surface B;
    public MediaMuxer C;
    public final bs6 D;
    public m70 E;
    public q55 F;
    public rt3 G;
    public g65 H;
    public rt3 I;
    public Uri J;
    public long K;
    public long L;
    public long M;
    public long N;
    public long O;
    public long P;
    public long Q;
    public long R;
    public int S;
    public Throwable T;
    public g55 U;
    public final f7a V;
    public Throwable W;
    public boolean X;
    public ScheduledFuture Y;
    public boolean Z;
    public final bs6 a;
    public nr4 a0;
    public final bs6 b;
    public nr4 b0;
    public final Executor c;
    public double c0;
    public final Executor d;
    public boolean d0;
    public final tsd e;
    public mo4 e0;
    public final ts1 f;
    public int f0;
    public final ts1 g;
    public int g0;
    public final Object h = new Object();
    public final boolean i;
    public final int j;
    public kyc k;
    public kyc l;
    public int m;
    public zb0 n;
    public zb0 o;
    public long p;
    public zb0 q;
    public boolean r;
    public oc0 s;
    public oc0 t;
    public zc0 u;
    public final ArrayList v;
    public Integer w;
    public Integer x;
    public z3f y;
    public xjf z;

    /* JADX WARNING: type inference failed for: r0v12, types: [ts1, java.lang.Object] */
    static {
        yb0 yb0 = yb0.f;
        zqd u2 = zqd.u(Arrays.asList(new yb0[]{yb0, yb0.e, yb0.d}), new wa0(yb0, 1));
        j0 = u2;
        xc0 a2 = yc0.a();
        a2.a = u2;
        a2.d = -1;
        yc0 a3 = a2.a();
        k0 = a3;
        d19 a4 = lb0.a();
        a4.a = -1;
        a4.b = a3;
        l0 = a4.f();
    }

    /* JADX WARNING: type inference failed for: r6v4, types: [xc0, java.lang.Object] */
    public lyc(ExecutorService executorService, lb0 lb0, ts1 ts1, ts1 ts12) {
        this.i = on4.a.g(EncoderNotUsePersistentInputSurfaceQuirk.class) != null;
        this.k = kyc.a;
        this.l = null;
        this.m = 0;
        this.n = null;
        this.o = null;
        this.p = 0;
        this.q = null;
        this.r = false;
        this.s = null;
        this.t = null;
        this.u = null;
        this.v = new ArrayList();
        this.w = null;
        this.x = null;
        this.A = null;
        this.B = null;
        this.C = null;
        this.E = null;
        this.F = null;
        this.G = null;
        this.H = null;
        this.I = null;
        this.f0 = 1;
        this.J = Uri.EMPTY;
        this.K = 0;
        this.L = 0;
        this.M = LongCompanionObject.MAX_VALUE;
        this.N = LongCompanionObject.MAX_VALUE;
        this.O = LongCompanionObject.MAX_VALUE;
        this.P = LongCompanionObject.MAX_VALUE;
        this.Q = 0;
        this.R = 0;
        this.S = 1;
        this.T = null;
        this.U = null;
        this.V = new f7a(60, (ts1) null);
        this.W = null;
        this.X = false;
        this.g0 = 3;
        this.Y = null;
        this.Z = false;
        this.b0 = null;
        this.c0 = 0.0d;
        this.d0 = false;
        this.e0 = null;
        this.c = executorService;
        Executor F2 = executorService == null ? ryg.F() : executorService;
        this.d = F2;
        tsd tsd = new tsd(F2);
        this.e = tsd;
        yc0 yc0 = lb0.a;
        z90 z90 = lb0.b;
        Integer valueOf = Integer.valueOf(lb0.c);
        if (lb0.a.d == -1) {
            l3a l3a = new l3a(26);
            if (yc0 != null) {
                ? obj = new Object();
                obj.a = yc0.a;
                obj.b = yc0.b;
                obj.c = yc0.c;
                obj.d = Integer.valueOf(yc0.d);
                l3a.accept(obj);
                yc0 = obj.a();
            } else {
                throw new IllegalStateException("Property \"videoSpec\" has not been set");
            }
        }
        String str = yc0 == null ? " videoSpec" : "";
        str = z90 == null ? str.concat(" audioSpec") : str;
        if (str.isEmpty()) {
            this.D = new bs6(new lb0(yc0, z90, valueOf.intValue()));
            this.j = 0;
            this.a = new bs6(new gc0(this.m, m(this.k), (oc0) null));
            this.b = new bs6(Boolean.FALSE);
            this.f = ts1;
            this.g = ts12;
            this.a0 = new nr4(ts1, tsd, F2);
            return;
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public static Object l(bs6 bs6) {
        try {
            return bs6.e().get();
        } catch (InterruptedException | ExecutionException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static int m(kyc kyc) {
        return (kyc == kyc.v || (kyc == kyc.x && ((DeactivateEncoderSurfaceBeforeStopEncoderQuirk) on4.a.g(DeactivateEncoderSurfaceBeforeStopEncoderQuirk.class)) == null)) ? 1 : 2;
    }

    public static boolean p(nyc nyc, zb0 zb0) {
        return zb0 != null && nyc.c == zb0.v0;
    }

    public static void r(q55 q55) {
        if (q55 instanceof g65) {
            g65 g65 = (g65) q55;
            g65.h.execute(new u55(g65, 5));
        }
    }

    public final void A(Surface surface) {
        int i2;
        if (this.A != surface) {
            this.A = surface;
            synchronized (this.h) {
                if (surface != null) {
                    try {
                        i2 = surface.hashCode();
                    } catch (Throwable th) {
                        throw th;
                    }
                } else {
                    i2 = 0;
                }
                if (this.m != i2) {
                    this.m = i2;
                    this.a.s(new gc0(i2, m(this.k), this.s));
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x004f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void B(defpackage.kyc r4) {
        /*
            r3 = this;
            kyc r0 = r3.k
            if (r0 == r4) goto L_0x0062
            java.util.Objects.toString(r0)
            java.util.Objects.toString(r4)
            java.util.Set r0 = h0
            boolean r1 = r0.contains(r4)
            if (r1 == 0) goto L_0x0043
            kyc r1 = r3.k
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L_0x004a
            java.util.Set r0 = i0
            kyc r1 = r3.k
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x002d
            kyc r0 = r3.k
            r3.l = r0
            int r0 = m(r0)
            goto L_0x004b
        L_0x002d:
            java.lang.AssertionError r4 = new java.lang.AssertionError
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Invalid state transition. Should not be transitioning to a PENDING state from state "
            r0.<init>(r1)
            kyc r3 = r3.k
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3)
            throw r4
        L_0x0043:
            kyc r0 = r3.l
            if (r0 == 0) goto L_0x004a
            r0 = 0
            r3.l = r0
        L_0x004a:
            r0 = 0
        L_0x004b:
            r3.k = r4
            if (r0 != 0) goto L_0x0053
            int r0 = m(r4)
        L_0x0053:
            int r4 = r3.m
            oc0 r1 = r3.s
            gc0 r2 = new gc0
            r2.<init>(r4, r0, r1)
            bs6 r3 = r3.a
            r3.s(r2)
            return
        L_0x0062:
            java.lang.AssertionError r3 = new java.lang.AssertionError
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Attempted to transition to state "
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r1 = ", but Recorder is already in state "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lyc.B(kyc):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:57:0x00c8 A[Catch:{ all -> 0x005d, all -> 0x0129 }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00ed A[Catch:{ all -> 0x005d, all -> 0x0129 }] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x010f A[Catch:{ all -> 0x005d, all -> 0x0129 }, LOOP:2: B:62:0x0109->B:64:0x010f, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void C(defpackage.zb0 r11) {
        /*
            r10 = this;
            android.media.MediaMuxer r0 = r10.C
            if (r0 != 0) goto L_0x0136
            boolean r0 = r10.n()
            f7a r1 = r10.V
            if (r0 == 0) goto L_0x001b
            boolean r0 = r1.f()
            if (r0 != 0) goto L_0x0013
            goto L_0x001b
        L_0x0013:
            java.lang.AssertionError r10 = new java.lang.AssertionError
            java.lang.String r11 = "Audio is enabled but no audio sample is ready. Cannot start media muxer."
            r10.<init>(r11)
            throw r10
        L_0x001b:
            g55 r0 = r10.U
            if (r0 == 0) goto L_0x012e
            r2 = 0
            r10.U = r2     // Catch:{ all -> 0x005d }
            long r3 = r0.Z()     // Catch:{ all -> 0x005d }
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x005d }
            r5.<init>()     // Catch:{ all -> 0x005d }
        L_0x002b:
            boolean r6 = r1.f()     // Catch:{ all -> 0x005d }
            if (r6 != 0) goto L_0x0043
            java.lang.Object r6 = r1.c()     // Catch:{ all -> 0x005d }
            g55 r6 = (defpackage.g55) r6     // Catch:{ all -> 0x005d }
            long r7 = r6.Z()     // Catch:{ all -> 0x005d }
            int r7 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r7 < 0) goto L_0x002b
            r5.add(r6)     // Catch:{ all -> 0x005d }
            goto L_0x002b
        L_0x0043:
            long r3 = r0.size()     // Catch:{ all -> 0x005d }
            java.util.Iterator r1 = r5.iterator()     // Catch:{ all -> 0x005d }
        L_0x004b:
            boolean r6 = r1.hasNext()     // Catch:{ all -> 0x005d }
            if (r6 == 0) goto L_0x0060
            java.lang.Object r6 = r1.next()     // Catch:{ all -> 0x005d }
            g55 r6 = (defpackage.g55) r6     // Catch:{ all -> 0x005d }
            long r6 = r6.size()     // Catch:{ all -> 0x005d }
            long r3 = r3 + r6
            goto L_0x004b
        L_0x005d:
            r10 = move-exception
            goto L_0x0125
        L_0x0060:
            long r6 = r10.Q     // Catch:{ all -> 0x005d }
            r8 = 0
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            r8 = 2
            if (r1 == 0) goto L_0x0087
            int r1 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r1 <= 0) goto L_0x0087
            java.lang.String r1 = "Initial data exceeds file size limit %d > %d"
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x005d }
            long r4 = r10.Q     // Catch:{ all -> 0x005d }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x005d }
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r4}     // Catch:{ all -> 0x005d }
            java.lang.String.format(r1, r3)     // Catch:{ all -> 0x005d }
            r10.s(r11, r8, r2)     // Catch:{ all -> 0x005d }
            r0.close()
            return
        L_0x0087:
            bs6 r1 = r10.D     // Catch:{ IOException -> 0x00b2 }
            java.lang.Object r1 = l(r1)     // Catch:{ IOException -> 0x00b2 }
            lb0 r1 = (defpackage.lb0) r1     // Catch:{ IOException -> 0x00b2 }
            int r1 = r1.c     // Catch:{ IOException -> 0x00b2 }
            r2 = -1
            r3 = 0
            r4 = 1
            if (r1 != r2) goto L_0x00b4
            zc0 r1 = r10.u     // Catch:{ IOException -> 0x00b2 }
            lb0 r2 = l0     // Catch:{ IOException -> 0x00b2 }
            int r2 = r2.c     // Catch:{ IOException -> 0x00b2 }
            if (r2 == r4) goto L_0x00a0
            r2 = r3
            goto L_0x00a1
        L_0x00a0:
            r2 = r4
        L_0x00a1:
            if (r1 == 0) goto L_0x00b0
            int r1 = r1.b     // Catch:{ IOException -> 0x00b2 }
            if (r1 == r4) goto L_0x00b9
            if (r1 == r8) goto L_0x00b8
            r3 = 9
            if (r1 == r3) goto L_0x00ae
            goto L_0x00b0
        L_0x00ae:
            r8 = r4
            goto L_0x00b9
        L_0x00b0:
            r8 = r2
            goto L_0x00b9
        L_0x00b2:
            r1 = move-exception
            goto L_0x011d
        L_0x00b4:
            if (r1 == r4) goto L_0x00b7
            goto L_0x00b8
        L_0x00b7:
            r3 = r4
        L_0x00b8:
            r8 = r3
        L_0x00b9:
            a0 r1 = new a0     // Catch:{ IOException -> 0x00b2 }
            r2 = 15
            r1.<init>(r2, r10)     // Catch:{ IOException -> 0x00b2 }
            android.media.MediaMuxer r1 = r11.g(r8, r1)     // Catch:{ IOException -> 0x00b2 }
            oc0 r2 = r10.t     // Catch:{ all -> 0x005d }
            if (r2 == 0) goto L_0x00d0
            r10.z(r2)     // Catch:{ all -> 0x005d }
            int r2 = r2.b     // Catch:{ all -> 0x005d }
            r1.setOrientationHint(r2)     // Catch:{ all -> 0x005d }
        L_0x00d0:
            an5 r2 = r11.y     // Catch:{ all -> 0x005d }
            xa0 r2 = r2.a     // Catch:{ all -> 0x005d }
            r2.getClass()     // Catch:{ all -> 0x005d }
            rt3 r2 = r10.G     // Catch:{ all -> 0x005d }
            java.lang.Object r2 = r2.b     // Catch:{ all -> 0x005d }
            android.media.MediaFormat r2 = (android.media.MediaFormat) r2     // Catch:{ all -> 0x005d }
            int r2 = r1.addTrack(r2)     // Catch:{ all -> 0x005d }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x005d }
            r10.x = r2     // Catch:{ all -> 0x005d }
            boolean r2 = r10.n()     // Catch:{ all -> 0x005d }
            if (r2 == 0) goto L_0x00fd
            rt3 r2 = r10.I     // Catch:{ all -> 0x005d }
            java.lang.Object r2 = r2.b     // Catch:{ all -> 0x005d }
            android.media.MediaFormat r2 = (android.media.MediaFormat) r2     // Catch:{ all -> 0x005d }
            int r2 = r1.addTrack(r2)     // Catch:{ all -> 0x005d }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x005d }
            r10.w = r2     // Catch:{ all -> 0x005d }
        L_0x00fd:
            r1.start()     // Catch:{ all -> 0x005d }
            r10.C = r1     // Catch:{ all -> 0x005d }
            r10.K(r0, r11)     // Catch:{ all -> 0x005d }
            java.util.Iterator r1 = r5.iterator()     // Catch:{ all -> 0x005d }
        L_0x0109:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x005d }
            if (r2 == 0) goto L_0x0119
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x005d }
            g55 r2 = (defpackage.g55) r2     // Catch:{ all -> 0x005d }
            r10.J(r2, r11)     // Catch:{ all -> 0x005d }
            goto L_0x0109
        L_0x0119:
            r0.close()
            return
        L_0x011d:
            r2 = 5
            r10.s(r11, r2, r1)     // Catch:{ all -> 0x005d }
            r0.close()
            return
        L_0x0125:
            r0.close()     // Catch:{ all -> 0x0129 }
            goto L_0x012d
        L_0x0129:
            r11 = move-exception
            r10.addSuppressed(r11)
        L_0x012d:
            throw r10
        L_0x012e:
            java.lang.AssertionError r10 = new java.lang.AssertionError
            java.lang.String r11 = "Media muxer cannot be started without an encoded video frame."
            r10.<init>(r11)
            throw r10
        L_0x0136:
            java.lang.AssertionError r10 = new java.lang.AssertionError
            java.lang.String r11 = "Unable to set up media muxer when one already exists."
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lyc.C(zb0):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v9, resolved type: u9} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v15, resolved type: mqf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v16, resolved type: u9} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: u9} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00ff  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void D(defpackage.zb0 r13) {
        /*
            r12 = this;
            bs6 r0 = r12.D
            java.lang.Object r0 = l(r0)
            lb0 r0 = (defpackage.lb0) r0
            zc0 r1 = r12.u
            int r2 = r0.c
            java.lang.String r3 = "audio/vorbis"
            r4 = 1
            java.lang.String r5 = "audio/mp4a-latm"
            if (r2 == r4) goto L_0x0015
            r6 = r5
            goto L_0x0016
        L_0x0015:
            r6 = r3
        L_0x0016:
            if (r2 == r4) goto L_0x0019
            r3 = r5
        L_0x0019:
            boolean r3 = r3.equals(r5)
            r4 = -1
            if (r3 == 0) goto L_0x0022
            r3 = 2
            goto L_0x0023
        L_0x0022:
            r3 = r4
        L_0x0023:
            r5 = 0
            if (r1 == 0) goto L_0x0044
            qa0 r1 = r1.e
            if (r1 == 0) goto L_0x0044
            java.lang.String r7 = r1.b
            java.lang.String r8 = "audio/none"
            boolean r8 = java.util.Objects.equals(r7, r8)
            if (r8 == 0) goto L_0x0035
            goto L_0x0044
        L_0x0035:
            int r8 = r1.f
            if (r2 != r4) goto L_0x003a
            goto L_0x0047
        L_0x003a:
            boolean r2 = r6.equals(r7)
            if (r2 == 0) goto L_0x0044
            if (r3 != r8) goto L_0x0044
            r8 = r3
            goto L_0x0047
        L_0x0044:
            r8 = r3
            r1 = r5
            r7 = r6
        L_0x0047:
            if (r7 == 0) goto L_0x00ff
            if (r1 == 0) goto L_0x004d
            r11 = r1
            goto L_0x004e
        L_0x004d:
            r11 = r5
        L_0x004e:
            z90 r1 = r0.b
            if (r11 == 0) goto L_0x0059
            zqd r2 = new zqd
            r3 = 3
            r2.<init>(r3, r1, r11)
            goto L_0x005f
        L_0x0059:
            u6h r2 = new u6h
            r3 = 4
            r2.<init>(r3, r1)
        L_0x005f:
            java.lang.Object r1 = r2.get()
            r10 = r1
            y90 r10 = (defpackage.y90) r10
            m70 r1 = r12.E
            if (r1 == 0) goto L_0x006d
            r12.u()
        L_0x006d:
            boolean r1 = r13.Y
            if (r1 == 0) goto L_0x00eb
            java.util.concurrent.atomic.AtomicReference r1 = r13.o
            java.lang.Object r1 = r1.getAndSet(r5)
            jyc r1 = (defpackage.jyc) r1
            if (r1 == 0) goto L_0x00d7
            tsd r13 = o0
            m70 r13 = r1.a(r10, r13)
            r12.E = r13
            int r13 = r13.hashCode()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            java.lang.Object[] r13 = new java.lang.Object[]{r13}
            java.lang.String r1 = "Set up new audio source: 0x%x"
            java.lang.String.format(r1, r13)
            z90 r9 = r0.b
            if (r11 == 0) goto L_0x009f
            u9 r13 = new u9
            r6 = r13
            r6.<init>(r7, r8, r9, r10, r11)
            goto L_0x00a4
        L_0x009f:
            mqf r13 = new mqf
            r13.<init>((java.lang.String) r7, (int) r8, (defpackage.z90) r9, (defpackage.y90) r10)
        L_0x00a4:
            java.lang.Object r13 = r13.get()
            x90 r13 = (defpackage.x90) r13
            ts1 r0 = r12.g
            r0.getClass()
            g65 r0 = new g65
            java.util.concurrent.Executor r1 = r12.d
            r0.<init>(r1, r13)
            r12.H = r0
            n55 r13 = r0.f
            boolean r0 = r13 instanceof defpackage.c65
            if (r0 == 0) goto L_0x00cf
            m70 r12 = r12.E
            c65 r13 = (defpackage.c65) r13
            tsd r0 = r12.a
            c r1 = new c
            r2 = 10
            r1.<init>(r2, r12, r13)
            r0.execute(r1)
            return
        L_0x00cf:
            java.lang.AssertionError r12 = new java.lang.AssertionError
            java.lang.String r13 = "The EncoderInput of audio isn't a ByteBufferInput."
            r12.<init>(r13)
            throw r12
        L_0x00d7:
            java.lang.AssertionError r12 = new java.lang.AssertionError
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "One-time audio source creation has already occurred for recording "
            r0.<init>(r1)
            r0.append(r13)
            java.lang.String r13 = r0.toString()
            r12.<init>(r13)
            throw r12
        L_0x00eb:
            java.lang.AssertionError r12 = new java.lang.AssertionError
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Recording does not have audio enabled. Unable to create audio source for recording "
            r0.<init>(r1)
            r0.append(r13)
            java.lang.String r13 = r0.toString()
            r12.<init>(r13)
            throw r12
        L_0x00ff:
            java.lang.NullPointerException r12 = new java.lang.NullPointerException
            java.lang.String r13 = "Null mimeType"
            r12.<init>(r13)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lyc.D(zb0):void");
    }

    public final void E(zb0 zb0, boolean z2) {
        if (this.q == null) {
            an5 an5 = zb0.y;
            xa0 xa0 = an5.a;
            if (xa0.a > 0) {
                this.Q = Math.round(((double) xa0.a) * 0.95d);
            } else {
                this.Q = 0;
            }
            xa0 xa02 = an5.a;
            if (xa02.b > 0) {
                this.R = TimeUnit.MILLISECONDS.toNanos(xa02.b);
            } else {
                this.R = 0;
            }
            this.q = zb0;
            int y2 = tr1.y(this.f0);
            int i2 = 5;
            int i3 = 4;
            boolean z3 = zb0.Y;
            if (y2 != 0) {
                if (y2 == 1) {
                    if (!z3) {
                        i3 = 3;
                    }
                    this.f0 = i3;
                } else if (y2 == 2 || y2 == 3 || y2 == 4 || y2 == 5) {
                    throw new AssertionError("Incorrectly invoke startInternal in audio state ".concat(i2a.u(this.f0)));
                }
            } else if (z3) {
                if (((lb0) l(this.D)).b.e != 0) {
                    try {
                        if (this.q.Z) {
                            if (this.H == null) {
                            }
                            this.f0 = 4;
                        }
                        D(zb0);
                        this.f0 = 4;
                    } catch (AudioSourceAccessException | InvalidConfigException e2) {
                        if (!(e2 instanceof InvalidConfigException)) {
                            i2 = 6;
                        }
                        this.f0 = i2;
                        this.W = e2;
                    }
                } else {
                    throw new AssertionError("The Recorder doesn't support recording with audio");
                }
            }
            G(zb0, false);
            if (n()) {
                m70 m70 = this.E;
                m70.a.execute(new k70(m70, zb0.w.get(), 0));
                this.H.k();
            }
            ((g65) this.F).k();
            zb0 zb02 = this.q;
            zb02.j(new h8g(zb02.y, k()));
            if (z2) {
                t(zb0);
                return;
            }
            return;
        }
        throw new AssertionError("Attempted to start a new recording while another was in progress.");
    }

    public final void F(zb0 zb0, long j2, int i2, Exception exc) {
        if (this.q == zb0 && !this.r) {
            this.r = true;
            this.S = i2;
            this.T = exc;
            if (n()) {
                while (true) {
                    f7a f7a = this.V;
                    if (f7a.f()) {
                        break;
                    }
                    f7a.c();
                }
                g65 g65 = this.H;
                g65.q.getClass();
                g65.h.execute(new y55(0, j2, ejd.f(), g65));
            }
            g55 g55 = this.U;
            if (g55 != null) {
                g55.close();
                this.U = null;
            }
            if (this.g0 != 2) {
                o99 o99 = new o99(26, this.F);
                this.Y = ryg.G().schedule((Runnable) new ovb(10, this.e, o99), 1000, TimeUnit.MILLISECONDS);
            } else {
                r(this.F);
            }
            g65 g652 = (g65) this.F;
            g652.q.getClass();
            g652.h.execute(new y55(0, j2, ejd.f(), g652));
        }
    }

    public final void G(zb0 zb0, boolean z2) {
        ArrayList arrayList = this.v;
        if (!arrayList.isEmpty()) {
            kz7 b2 = hd8.b(arrayList);
            if (!b2.isDone()) {
                b2.cancel(true);
            }
            arrayList.clear();
        }
        arrayList.add(m5a.F(new fyc(this, zb0, 0)));
        if (n() && !z2) {
            arrayList.add(m5a.F(new fyc(this, zb0, 1)));
        }
        hd8.a(hd8.b(arrayList), new nob((Object) this), ryg.j());
    }

    public final void H() {
        zb0 zb0 = this.q;
        if (zb0 != null) {
            zb0.j(new h8g(zb0.y, k()));
        }
    }

    public final void I(kyc kyc) {
        if (!h0.contains(this.k)) {
            throw new AssertionError("Can only updated non-pending state from a pending state, but state is " + this.k);
        } else if (!i0.contains(kyc)) {
            throw new AssertionError("Invalid state transition. State is not a valid non-pending state while in a pending state: " + kyc);
        } else if (this.l != kyc) {
            this.l = kyc;
            this.a.s(new gc0(this.m, m(kyc), this.s));
        }
    }

    public final void J(g55 g55, zb0 zb0) {
        zb0 zb02 = zb0;
        long size = g55.size() + this.K;
        long j2 = this.Q;
        if (j2 == 0 || size <= j2) {
            long Z2 = g55.Z();
            long j3 = this.N;
            if (j3 == LongCompanionObject.MAX_VALUE) {
                this.N = Z2;
                String.format("First audio time: %d (%s)", new Object[]{Long.valueOf(Z2), n54.M(this.N)});
            } else {
                TimeUnit timeUnit = TimeUnit.MICROSECONDS;
                long nanos = timeUnit.toNanos(Z2 - Math.min(this.M, j3));
                bs0.r("There should be a previous data for adjusting the duration.", this.P != LongCompanionObject.MAX_VALUE);
                long nanos2 = timeUnit.toNanos(Z2 - this.P) + nanos;
                long j4 = this.R;
                if (j4 != 0 && nanos2 > j4) {
                    String.format("Audio data reaches duration limit %d > %d", new Object[]{Long.valueOf(nanos2), Long.valueOf(this.R)});
                    s(zb02, 9, (IOException) null);
                    return;
                }
            }
            this.C.writeSampleData(this.w.intValue(), g55.s(), g55.G());
            this.K = size;
            this.P = Z2;
            return;
        }
        String.format("Reach file size limit %d > %d", new Object[]{Long.valueOf(size), Long.valueOf(this.Q)});
        s(zb02, 2, (IOException) null);
    }

    public final void K(g55 g55, zb0 zb0) {
        zb0 zb02 = zb0;
        if (this.x != null) {
            long size = g55.size() + this.K;
            long j2 = this.Q;
            long j3 = 0;
            if (j2 == 0 || size <= j2) {
                long Z2 = g55.Z();
                long j4 = this.M;
                if (j4 == LongCompanionObject.MAX_VALUE) {
                    this.M = Z2;
                    String.format("First video time: %d (%s)", new Object[]{Long.valueOf(Z2), n54.M(this.M)});
                } else {
                    TimeUnit timeUnit = TimeUnit.MICROSECONDS;
                    long nanos = timeUnit.toNanos(Z2 - Math.min(j4, this.N));
                    bs0.r("There should be a previous data for adjusting the duration.", this.O != LongCompanionObject.MAX_VALUE);
                    long nanos2 = timeUnit.toNanos(Z2 - this.O) + nanos;
                    long j5 = this.R;
                    if (j5 == 0 || nanos2 <= j5) {
                        j3 = nanos;
                    } else {
                        String.format("Video data reaches duration limit %d > %d", new Object[]{Long.valueOf(nanos2), Long.valueOf(this.R)});
                        s(zb02, 9, (IOException) null);
                        return;
                    }
                }
                this.C.writeSampleData(this.x.intValue(), g55.s(), g55.G());
                this.K = size;
                this.L = j3;
                this.O = Z2;
                H();
                return;
            }
            String.format("Reach file size limit %d > %d", new Object[]{Long.valueOf(size), Long.valueOf(this.Q)});
            s(zb02, 2, (IOException) null);
            return;
        }
        throw new AssertionError("Video data comes before the track is added to MediaMuxer.");
    }

    public final kha a() {
        return this.D;
    }

    public final void b(int i2) {
        this.e.execute(new l40(this, i2, 14));
    }

    public final void c(z3f z3f) {
        f(z3f, xjf.a);
    }

    public final kha d() {
        return this.a;
    }

    public final kha e() {
        return this.b;
    }

    public final void f(z3f z3f, xjf xjf) {
        synchronized (this.h) {
            try {
                Objects.toString(this.k);
                if (this.k == kyc.z) {
                    B(kyc.a);
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        this.e.execute(new x55((Object) this, (Object) z3f, (Object) xjf, 27));
    }

    public final k3g g(qu1 qu1) {
        return new myc(this.j, qu1);
    }

    public final void h(z3f z3f, xjf xjf, boolean z2) {
        yb0 yb0;
        Object obj;
        if (!z3f.a()) {
            byc byc = new byc(this);
            tsd tsd = this.e;
            z3f.c(tsd, byc);
            int i2 = 0;
            myc myc = new myc(0, z3f.e.n());
            vy4 vy4 = z3f.c;
            xw1 d2 = myc.d(vy4);
            Size size = z3f.b;
            if (d2 == null) {
                yb0 = yb0.j;
            } else {
                TreeMap treeMap = d2.b;
                Size size2 = pde.a;
                Map.Entry ceilingEntry = treeMap.ceilingEntry(size);
                if (ceilingEntry != null) {
                    obj = ceilingEntry.getValue();
                } else {
                    Map.Entry floorEntry = treeMap.floorEntry(size);
                    obj = floorEntry != null ? floorEntry.getValue() : null;
                }
                yb0 = (yb0) obj;
                if (yb0 == null) {
                    yb0 = yb0.j;
                }
            }
            Objects.toString(yb0);
            Objects.toString(size);
            if (yb0 != yb0.j) {
                zc0 b2 = myc.b(yb0, vy4);
                this.u = b2;
                if (b2 == null) {
                    throw new AssertionError("Camera advertised available quality but did not produce EncoderProfiles  for advertised quality.");
                }
            }
            mo4 mo4 = this.e0;
            if (mo4 != null && !mo4.b) {
                mo4.b = true;
                ScheduledFuture scheduledFuture = (ScheduledFuture) mo4.f;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                    mo4.f = null;
                }
            }
            if (z2) {
                i2 = p0;
            }
            mo4 mo42 = new mo4(this, z3f, xjf, i2);
            this.e0 = mo42;
            Objects.toString(this.F);
            nr4 nr4 = this.a0;
            nr4.e();
            hd8.J((zz7) nr4.k).d(new x55((Object) mo42, (Object) z3f, (Object) xjf, 28), tsd);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: java.lang.RuntimeException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: zb0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: java.lang.RuntimeException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: zb0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v8, resolved type: zb0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v9, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: java.lang.RuntimeException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v10, resolved type: zb0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v11, resolved type: zb0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v12, resolved type: zb0} */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0115, code lost:
        r8 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x011d, code lost:
        r4 = null;
        r5 = null;
        r7 = null;
        r0 = false;
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0122, code lost:
        r3 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x013d, code lost:
        if (r1.g0 != 3) goto L_0x0151;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x013f, code lost:
        r2 = r1.o;
        r1.o = null;
        B(defpackage.kyc.a);
        r5 = r2;
        r8 = 4;
        r2 = 0;
        r7 = m0;
        r4 = null;
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0153, code lost:
        if (r1.i == false) goto L_0x016d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0155, code lost:
        r1.B = null;
        r4 = r1.y;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0159, code lost:
        if (r4 == null) goto L_0x0162;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x015f, code lost:
        if (r4.a() != false) goto L_0x0162;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0162, code lost:
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0163, code lost:
        I(defpackage.kyc.a);
        r4 = null;
        r5 = null;
        r7 = null;
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x016f, code lost:
        if (r1.F == null) goto L_0x017c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0171, code lost:
        r4 = q(r1.k);
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0179, code lost:
        r7 = r5;
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x017c, code lost:
        r4 = null;
        r5 = null;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x01b2  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x00a8 A[EDGE_INSN: B:104:0x00a8->B:27:0x00a8 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00a4 A[LOOP:0: B:24:0x009c->B:26:0x00a4, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00b3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void i(java.lang.Throwable r17, int r18) {
        /*
            r16 = this;
            r1 = r16
            zb0 r0 = r1.q
            if (r0 == 0) goto L_0x01ba
            android.media.MediaMuxer r0 = r1.C
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x0023
            r0.stop()     // Catch:{ IllegalStateException -> 0x0015 }
            android.media.MediaMuxer r0 = r1.C     // Catch:{ IllegalStateException -> 0x0015 }
            r0.release()     // Catch:{ IllegalStateException -> 0x0015 }
            goto L_0x001d
        L_0x0015:
            r0 = move-exception
            r0.getMessage()
            if (r18 != 0) goto L_0x001d
            r0 = r2
            goto L_0x001f
        L_0x001d:
            r0 = r18
        L_0x001f:
            r1.C = r3
        L_0x0021:
            r8 = r0
            goto L_0x002a
        L_0x0023:
            if (r18 != 0) goto L_0x0028
            r0 = 8
            goto L_0x0021
        L_0x0028:
            r8 = r18
        L_0x002a:
            zb0 r0 = r1.q
            android.net.Uri r4 = r1.J
            r0.a(r4)
            zb0 r0 = r1.q
            an5 r10 = r0.y
            ac0 r11 = r16.k()
            android.net.Uri r0 = r1.J
            java.lang.String r4 = "OutputUri cannot be null."
            defpackage.bs0.q(r0, r4)
            ob0 r12 = new ob0
            r12.<init>(r0)
            zb0 r0 = r1.q
            r15 = 0
            if (r8 != 0) goto L_0x0053
            c8g r4 = new c8g
            r13 = 0
            r14 = 0
            r9 = r4
            r9.<init>(r10, r11, r12, r13, r14)
            goto L_0x0069
        L_0x0053:
            if (r8 == 0) goto L_0x0057
            r4 = r2
            goto L_0x0058
        L_0x0057:
            r4 = r15
        L_0x0058:
            java.lang.String r5 = "An error type is required."
            defpackage.bs0.m(r5, r4)
            c8g r13 = new c8g
            r4 = r13
            r5 = r10
            r6 = r11
            r7 = r12
            r9 = r17
            r4.<init>(r5, r6, r7, r8, r9)
            r4 = r13
        L_0x0069:
            r0.j(r4)
            zb0 r0 = r1.q
            r1.q = r3
            r1.r = r15
            r1.w = r3
            r1.x = r3
            java.util.ArrayList r4 = r1.v
            r4.clear()
            android.net.Uri r4 = android.net.Uri.EMPTY
            r1.J = r4
            r4 = 0
            r1.K = r4
            r1.L = r4
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r1.M = r4
            r1.N = r4
            r1.O = r4
            r1.P = r4
            r1.S = r2
            r1.T = r3
            r1.W = r3
            r4 = 0
            r1.c0 = r4
        L_0x009c:
            f7a r4 = r1.V
            boolean r5 = r4.f()
            if (r5 != 0) goto L_0x00a8
            r4.c()
            goto L_0x009c
        L_0x00a8:
            r1.z(r3)
            int r4 = r1.f0
            int r4 = defpackage.tr1.y(r4)
            if (r4 == r2) goto L_0x01b2
            r5 = 3
            r6 = 2
            r7 = 4
            if (r4 == r6) goto L_0x00c3
            if (r4 == r5) goto L_0x00c3
            if (r4 == r7) goto L_0x00c0
            r6 = 5
            if (r4 == r6) goto L_0x00c0
            goto L_0x00d3
        L_0x00c0:
            r1.f0 = r2
            goto L_0x00d3
        L_0x00c3:
            r1.f0 = r6
            m70 r4 = r1.E
            tsd r6 = r4.a
            b r8 = new b
            r9 = 12
            r8.<init>((int) r9, (java.lang.Object) r4)
            r6.execute(r8)
        L_0x00d3:
            java.lang.String r4 = "Unexpected state on finalize of recording: "
            java.lang.Object r6 = r1.h
            monitor-enter(r6)
            zb0 r8 = r1.n     // Catch:{ all -> 0x0107 }
            if (r8 != r0) goto L_0x01a8
            bs6 r0 = r8.x     // Catch:{ all -> 0x0107 }
            r0.k()     // Catch:{ all -> 0x0107 }
            r1.n = r3     // Catch:{ all -> 0x0107 }
            kyc r0 = r1.k     // Catch:{ all -> 0x0107 }
            int r0 = r0.ordinal()     // Catch:{ all -> 0x0107 }
            switch(r0) {
                case 1: goto L_0x013a;
                case 2: goto L_0x0138;
                case 3: goto L_0x0124;
                case 4: goto L_0x00f6;
                case 5: goto L_0x00f6;
                case 6: goto L_0x00f6;
                case 7: goto L_0x00ed;
                default: goto L_0x00ec;
            }     // Catch:{ all -> 0x0107 }
        L_0x00ec:
            goto L_0x011d
        L_0x00ed:
            r4 = r3
            r5 = r4
            r7 = r5
            r0 = r15
            r8 = r0
            r3 = r2
            r2 = r8
            goto L_0x017f
        L_0x00f6:
            boolean r0 = r1.i     // Catch:{ all -> 0x0107 }
            if (r0 == 0) goto L_0x0118
            r1.B = r3     // Catch:{ all -> 0x0107 }
            z3f r0 = r1.y     // Catch:{ all -> 0x0107 }
            if (r0 == 0) goto L_0x010a
            boolean r0 = r0.a()     // Catch:{ all -> 0x0107 }
            if (r0 != 0) goto L_0x010a
            goto L_0x010b
        L_0x0107:
            r0 = move-exception
            goto L_0x01b0
        L_0x010a:
            r2 = r15
        L_0x010b:
            kyc r0 = defpackage.kyc.a     // Catch:{ all -> 0x0107 }
            r1.B(r0)     // Catch:{ all -> 0x0107 }
            r4 = r3
            r5 = r4
            r7 = r5
            r0 = r15
            r3 = r0
        L_0x0115:
            r8 = r3
            goto L_0x017f
        L_0x0118:
            kyc r0 = defpackage.kyc.o     // Catch:{ all -> 0x0107 }
            r1.B(r0)     // Catch:{ all -> 0x0107 }
        L_0x011d:
            r4 = r3
            r5 = r4
            r7 = r5
            r0 = r15
            r2 = r0
        L_0x0122:
            r3 = r2
            goto L_0x0115
        L_0x0124:
            java.lang.AssertionError r0 = new java.lang.AssertionError     // Catch:{ all -> 0x0107 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0107 }
            r2.<init>(r4)     // Catch:{ all -> 0x0107 }
            kyc r1 = r1.k     // Catch:{ all -> 0x0107 }
            r2.append(r1)     // Catch:{ all -> 0x0107 }
            java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x0107 }
            r0.<init>(r1)     // Catch:{ all -> 0x0107 }
            throw r0     // Catch:{ all -> 0x0107 }
        L_0x0138:
            r0 = r2
            goto L_0x013b
        L_0x013a:
            r0 = r15
        L_0x013b:
            int r4 = r1.g0     // Catch:{ all -> 0x0107 }
            if (r4 != r5) goto L_0x0151
            zb0 r2 = r1.o     // Catch:{ all -> 0x0107 }
            r1.o = r3     // Catch:{ all -> 0x0107 }
            kyc r4 = defpackage.kyc.a     // Catch:{ all -> 0x0107 }
            r1.B(r4)     // Catch:{ all -> 0x0107 }
            java.lang.RuntimeException r4 = m0     // Catch:{ all -> 0x0107 }
            r5 = r2
            r8 = r7
            r2 = r15
            r7 = r4
            r4 = r3
            r3 = r2
            goto L_0x017f
        L_0x0151:
            boolean r4 = r1.i     // Catch:{ all -> 0x0107 }
            if (r4 == 0) goto L_0x016d
            r1.B = r3     // Catch:{ all -> 0x0107 }
            z3f r4 = r1.y     // Catch:{ all -> 0x0107 }
            if (r4 == 0) goto L_0x0162
            boolean r4 = r4.a()     // Catch:{ all -> 0x0107 }
            if (r4 != 0) goto L_0x0162
            goto L_0x0163
        L_0x0162:
            r2 = r15
        L_0x0163:
            kyc r4 = defpackage.kyc.a     // Catch:{ all -> 0x0107 }
            r1.I(r4)     // Catch:{ all -> 0x0107 }
            r4 = r3
            r5 = r4
            r7 = r5
            r3 = r15
            goto L_0x0115
        L_0x016d:
            q55 r2 = r1.F     // Catch:{ all -> 0x0107 }
            if (r2 == 0) goto L_0x017c
            kyc r2 = r1.k     // Catch:{ all -> 0x0107 }
            zb0 r2 = r1.q(r2)     // Catch:{ all -> 0x0107 }
            r4 = r2
            r5 = r3
        L_0x0179:
            r7 = r5
            r2 = r15
            goto L_0x0122
        L_0x017c:
            r4 = r3
            r5 = r4
            goto L_0x0179
        L_0x017f:
            monitor-exit(r6)     // Catch:{ all -> 0x0107 }
            if (r2 == 0) goto L_0x018a
            z3f r0 = r1.y
            xjf r2 = r1.z
            r1.h(r0, r2, r15)
            goto L_0x01a7
        L_0x018a:
            if (r3 == 0) goto L_0x0190
            r16.w()
            goto L_0x01a7
        L_0x0190:
            if (r4 == 0) goto L_0x01a2
            boolean r2 = r1.i
            if (r2 != 0) goto L_0x019a
            r1.E(r4, r0)
            goto L_0x01a7
        L_0x019a:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.String r1 = "Attempt to start a pending recording while the Recorder is waiting for a new surface request."
            r0.<init>(r1)
            throw r0
        L_0x01a2:
            if (r5 == 0) goto L_0x01a7
            r1.j(r5, r8, r7)
        L_0x01a7:
            return
        L_0x01a8:
            java.lang.AssertionError r0 = new java.lang.AssertionError     // Catch:{ all -> 0x0107 }
            java.lang.String r1 = "Active recording did not match finalized recording on finalize."
            r0.<init>(r1)     // Catch:{ all -> 0x0107 }
            throw r0     // Catch:{ all -> 0x0107 }
        L_0x01b0:
            monitor-exit(r6)     // Catch:{ all -> 0x0107 }
            throw r0
        L_0x01b2:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.String r1 = "Incorrectly finalize recording when audio state is IDLING"
            r0.<init>(r1)
            throw r0
        L_0x01ba:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.String r1 = "Attempted to finalize in-progress recording, but no recording is in progress."
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lyc.i(java.lang.Throwable, int):void");
    }

    public final void j(zb0 zb0, int i2, Throwable th) {
        Uri uri = Uri.EMPTY;
        zb0.a(uri);
        boolean z2 = true;
        ac0 a2 = ac0.a(0, 0, new aa0(1, 0.0d, this.W));
        bs0.q(uri, "OutputUri cannot be null.");
        ob0 ob0 = new ob0(uri);
        if (i2 == 0) {
            z2 = false;
        }
        bs0.m("An error type is required.", z2);
        zb0.j(new c8g(zb0.y, a2, ob0, i2, th));
    }

    public final ac0 k() {
        int i2;
        long j2 = this.L;
        long j3 = this.K;
        int i3 = this.f0;
        int y2 = tr1.y(i3);
        if (y2 != 0) {
            i2 = 2;
            if (y2 != 2) {
                if (y2 != 3) {
                    i2 = 4;
                    if (y2 == 4) {
                        i2 = 3;
                    } else if (y2 != 5) {
                        throw new AssertionError("Invalid internal audio state: ".concat(i2a.u(i3)));
                    }
                } else {
                    zb0 zb0 = this.q;
                    if (zb0 != null && zb0.w.get()) {
                        i2 = 5;
                    } else if (!this.X) {
                        i2 = 0;
                    }
                }
                return ac0.a(j2, j3, new aa0(i2, this.c0, this.W));
            }
        }
        i2 = 1;
        return ac0.a(j2, j3, new aa0(i2, this.c0, this.W));
    }

    public final boolean n() {
        return this.f0 == 4;
    }

    public final boolean o() {
        zb0 zb0 = this.q;
        return zb0 != null && zb0.Z;
    }

    public final zb0 q(kyc kyc) {
        boolean z2;
        if (kyc == kyc.c) {
            z2 = true;
        } else if (kyc == kyc.b) {
            z2 = false;
        } else {
            throw new AssertionError("makePendingRecordingActiveLocked() can only be called from a pending state.");
        }
        if (this.n == null) {
            zb0 zb0 = this.o;
            if (zb0 != null) {
                this.n = zb0;
                zb0.x.d(ryg.j(), new kcc(1, this));
                this.o = null;
                if (z2) {
                    B(kyc.w);
                } else {
                    B(kyc.v);
                }
                return zb0;
            }
            throw new AssertionError("Pending recording should exist when in a PENDING state.");
        }
        throw new AssertionError("Cannot make pending recording active because another recording is already active.");
    }

    public final void s(zb0 zb0, int i2, IOException iOException) {
        boolean z2;
        if (zb0 == this.q) {
            synchronized (this.h) {
                try {
                    z2 = false;
                    switch (this.k.ordinal()) {
                        case 0:
                        case 3:
                        case 8:
                            throw new AssertionError("In-progress recording error occurred while in unexpected state: " + this.k);
                        case 1:
                        case 2:
                        case 6:
                        case 7:
                            break;
                        case 4:
                        case 5:
                            B(kyc.x);
                            z2 = true;
                            break;
                    }
                    if (zb0 != this.n) {
                        throw new AssertionError("Internal error occurred for recording but it is not the active recording.");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z2) {
                F(zb0, -1, i2, iOException);
                return;
            }
            return;
        }
        throw new AssertionError("Internal error occurred on recording that is not the current in-progress recording.");
    }

    public final void t(zb0 zb0) {
        if (this.q == zb0 && !this.r) {
            if (n()) {
                this.H.e();
            }
            ((g65) this.F).e();
            zb0 zb02 = this.q;
            zb02.j(new h8g(zb02.y, k()));
        }
    }

    public final void u() {
        m70 m70 = this.E;
        if (m70 != null) {
            this.E = null;
            String.format("Releasing audio source: 0x%x", new Object[]{Integer.valueOf(m70.hashCode())});
            hd8.a(m5a.F(new d9d(10, m70)), new xga(3, m70), ryg.j());
            return;
        }
        throw new AssertionError("Cannot release null audio source.");
    }

    public final void v(boolean z2) {
        boolean z3;
        boolean z4;
        synchronized (this.h) {
            try {
                z3 = true;
                z4 = false;
                switch (this.k.ordinal()) {
                    case 0:
                    case 3:
                    case 8:
                        break;
                    case 1:
                    case 2:
                        I(kyc.y);
                        break;
                    case 4:
                    case 5:
                        bs0.r("In-progress recording shouldn't be null when in state " + this.k, this.q != null);
                        if (this.n == this.q) {
                            if (!o()) {
                                B(kyc.y);
                                z4 = true;
                                z3 = false;
                                break;
                            } else {
                                break;
                            }
                        } else {
                            throw new AssertionError("In-progress recording does not match the active recording. Unable to reset encoder.");
                        }
                    case 6:
                        B(kyc.y);
                        break;
                }
                z3 = false;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        if (z3) {
            if (z2) {
                x();
            } else {
                w();
            }
        } else if (z4) {
            F(this.q, -1, 4, (Exception) null);
        }
    }

    public final void w() {
        g65 g65 = this.H;
        if (g65 != null) {
            g65.h.execute(new u55(g65, 4));
            this.H = null;
            this.I = null;
        }
        if (this.E != null) {
            u();
        }
        this.f0 = 1;
        x();
    }

    public final void x() {
        z3f z3f;
        q55 q55 = this.F;
        boolean z2 = true;
        if (q55 != null) {
            nr4 nr4 = this.b0;
            if (nr4 != null) {
                bs0.r((String) null, ((g65) nr4.f) == q55);
                Objects.toString(this.F);
                this.b0.s();
                this.b0 = null;
                this.F = null;
                this.G = null;
                A((Surface) null);
            } else {
                Objects.toString(q55);
                nr4 nr42 = this.a0;
                nr42.e();
                hd8.J((zz7) nr42.k);
            }
        }
        synchronized (this.h) {
            try {
                switch (this.k.ordinal()) {
                    case 1:
                    case 2:
                        I(kyc.a);
                        break;
                    case 4:
                    case 5:
                    case 8:
                        if (o()) {
                            z2 = false;
                            break;
                        }
                    case 3:
                    case 6:
                    case 7:
                        B(kyc.a);
                        break;
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        this.Z = false;
        if (z2 && (z3f = this.y) != null && !z3f.a()) {
            h(this.y, this.z, false);
        }
    }

    public final void y() {
        if (h0.contains(this.k)) {
            B(this.l);
            return;
        }
        throw new AssertionError("Cannot restore non-pending state when in state " + this.k);
    }

    public final void z(oc0 oc0) {
        Objects.toString(oc0);
        this.s = oc0;
        synchronized (this.h) {
            this.a.s(new gc0(this.m, m(this.k), oc0));
        }
    }
}
