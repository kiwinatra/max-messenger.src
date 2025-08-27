package defpackage;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.exoplayer2.audio.AudioProcessor$UnhandledAudioFormatException;
import com.google.android.exoplayer2.audio.AudioSink$ConfigurationException;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;

/* renamed from: rc4  reason: default package */
public final class rc4 {
    public int A;
    public long B;
    public long C;
    public long D;
    public long E;
    public int F;
    public boolean G;
    public boolean H;
    public long I;
    public float J;
    public k60[] K;
    public ByteBuffer[] L;
    public ByteBuffer M;
    public int N;
    public ByteBuffer O;
    public byte[] P;
    public int Q;
    public int R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public int W;
    public bd0 X;
    public boolean Y;
    public long Z;
    public final t30 a;
    public boolean a0;
    public final g6d b;
    public boolean b0;
    public final boolean c;
    public final x12 d;
    public final btf e;
    public final k60[] f;
    public final k60[] g;
    public final ConditionVariable h;
    public final w70 i;
    public final ArrayDeque j;
    public final boolean k;
    public final int l;
    public o5h m;
    public final nc4 n;
    public final nc4 o;
    public final v02 p;
    public lpb q;
    public wie r;
    public hc4 s;
    public hc4 t;
    public AudioTrack u;
    public h30 v;
    public jc4 w;
    public jc4 x;
    public fob y;
    public ByteBuffer z;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: pi0[]} */
    /* JADX WARNING: type inference failed for: r10v5, types: [pi0, x12] */
    /* JADX WARNING: type inference failed for: r3v3, types: [btf, pi0] */
    /* JADX WARNING: type inference failed for: r10v15, types: [java.lang.Object, bd0] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public rc4(defpackage.fc4 r10) {
        /*
            r9 = this;
            r0 = 1
            r1 = 0
            r9.<init>()
            java.lang.Object r2 = r10.d
            t30 r2 = (defpackage.t30) r2
            r9.a = r2
            java.lang.Object r2 = r10.e
            g6d r2 = (defpackage.g6d) r2
            r9.b = r2
            int r3 = defpackage.t0g.a
            r4 = 21
            if (r3 < r4) goto L_0x001d
            boolean r4 = r10.b
            if (r4 == 0) goto L_0x001d
            r4 = r0
            goto L_0x001e
        L_0x001d:
            r4 = r1
        L_0x001e:
            r9.c = r4
            r4 = 23
            if (r3 < r4) goto L_0x002a
            boolean r4 = r10.c
            if (r4 == 0) goto L_0x002a
            r4 = r0
            goto L_0x002b
        L_0x002a:
            r4 = r1
        L_0x002b:
            r9.k = r4
            r4 = 29
            if (r3 < r4) goto L_0x0034
            int r3 = r10.a
            goto L_0x0035
        L_0x0034:
            r3 = r1
        L_0x0035:
            r9.l = r3
            java.lang.Object r10 = r10.f
            v02 r10 = (defpackage.v02) r10
            r9.p = r10
            android.os.ConditionVariable r10 = new android.os.ConditionVariable
            r10.<init>(r0)
            r9.h = r10
            w70 r10 = new w70
            er7 r3 = new er7
            r4 = 16
            r3.<init>((int) r4, (java.lang.Object) r9)
            r10.<init>(r3)
            r9.i = r10
            x12 r10 = new x12
            r10.<init>()
            r9.d = r10
            btf r3 = new btf
            r3.<init>()
            byte[] r4 = defpackage.t0g.f
            r3.m = r4
            r9.e = r3
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            o3d r5 = new o3d
            r5.<init>()
            r6 = 3
            pi0[] r6 = new defpackage.pi0[r6]
            r6[r1] = r5
            r6[r0] = r10
            r10 = 2
            r6[r10] = r3
            java.util.Collections.addAll(r4, r6)
            java.lang.Object r10 = r2.b
            k60[] r10 = (defpackage.k60[]) r10
            java.util.Collections.addAll(r4, r10)
            k60[] r10 = new defpackage.k60[r1]
            java.lang.Object[] r10 = r4.toArray(r10)
            k60[] r10 = (defpackage.k60[]) r10
            r9.f = r10
            hr5 r10 = new hr5
            r10.<init>()
            k60[] r0 = new defpackage.k60[r0]
            r0[r1] = r10
            r9.g = r0
            r10 = 1065353216(0x3f800000, float:1.0)
            r9.J = r10
            h30 r10 = defpackage.h30.x
            r9.v = r10
            r9.W = r1
            bd0 r10 = new bd0
            r10.<init>()
            r9.X = r10
            jc4 r10 = new jc4
            fob r0 = defpackage.fob.o
            r5 = 0
            r7 = 0
            r4 = 0
            r2 = r10
            r3 = r0
            r2.<init>(r3, r4, r5, r7)
            r9.x = r10
            r9.y = r0
            r10 = -1
            r9.R = r10
            k60[] r10 = new defpackage.k60[r1]
            r9.K = r10
            java.nio.ByteBuffer[] r10 = new java.nio.ByteBuffer[r1]
            r9.L = r10
            java.util.ArrayDeque r10 = new java.util.ArrayDeque
            r10.<init>()
            r9.j = r10
            nc4 r10 = new nc4
            r10.<init>(r1)
            r9.n = r10
            nc4 r10 = new nc4
            r10.<init>(r1)
            r9.o = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rc4.<init>(fc4):void");
    }

    public static AudioFormat e(int i2, int i3, int i4) {
        return new AudioFormat.Builder().setSampleRate(i2).setChannelMask(i3).setEncoding(i4).build();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00ae, code lost:
        if (r9 != 5) goto L_0x00b1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00c9 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00ca  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.util.Pair f(defpackage.ca6 r12, defpackage.t30 r13) {
        /*
            java.lang.String r0 = r12.Z
            r0.getClass()
            java.lang.String r1 = r12.z
            int r0 = defpackage.uq9.b(r0, r1)
            r1 = 5
            r2 = 7
            r3 = 6
            r4 = 0
            r5 = 8
            r6 = 18
            if (r0 == r1) goto L_0x0027
            if (r0 == r3) goto L_0x0027
            if (r0 == r6) goto L_0x0027
            r7 = 17
            if (r0 == r7) goto L_0x0027
            if (r0 == r2) goto L_0x0027
            if (r0 == r5) goto L_0x0027
            r7 = 14
            if (r0 != r7) goto L_0x0026
            goto L_0x0027
        L_0x0026:
            return r4
        L_0x0027:
            if (r0 != r6) goto L_0x0034
            int[] r7 = r13.a
            int r7 = java.util.Arrays.binarySearch(r7, r6)
            if (r7 < 0) goto L_0x0032
            goto L_0x0034
        L_0x0032:
            r0 = r3
            goto L_0x0040
        L_0x0034:
            if (r0 != r5) goto L_0x0040
            int[] r7 = r13.a
            int r7 = java.util.Arrays.binarySearch(r7, r5)
            if (r7 < 0) goto L_0x003f
            goto L_0x0040
        L_0x003f:
            r0 = r2
        L_0x0040:
            int[] r7 = r13.a
            int r7 = java.util.Arrays.binarySearch(r7, r0)
            if (r7 < 0) goto L_0x00d7
            r7 = 3
            r8 = 1
            if (r0 != r6) goto L_0x0098
            int r13 = defpackage.t0g.a
            r9 = 29
            if (r13 < r9) goto L_0x0096
            r13 = -1
            int r12 = r12.I0
            if (r12 == r13) goto L_0x0058
            goto L_0x005b
        L_0x0058:
            r12 = 48000(0xbb80, float:6.7262E-41)
        L_0x005b:
            android.media.AudioAttributes$Builder r13 = new android.media.AudioAttributes$Builder
            r13.<init>()
            android.media.AudioAttributes$Builder r13 = r13.setUsage(r8)
            android.media.AudioAttributes$Builder r13 = r13.setContentType(r7)
            android.media.AudioAttributes r13 = r13.build()
            r9 = r5
        L_0x006d:
            if (r9 <= 0) goto L_0x0092
            android.media.AudioFormat$Builder r10 = new android.media.AudioFormat$Builder
            r10.<init>()
            android.media.AudioFormat$Builder r10 = r10.setEncoding(r6)
            android.media.AudioFormat$Builder r10 = r10.setSampleRate(r12)
            int r11 = defpackage.t0g.o(r9)
            android.media.AudioFormat$Builder r10 = r10.setChannelMask(r11)
            android.media.AudioFormat r10 = r10.build()
            boolean r10 = android.media.AudioTrack.isDirectPlaybackSupported(r10, r13)
            if (r10 == 0) goto L_0x008f
            goto L_0x0093
        L_0x008f:
            int r9 = r9 + -1
            goto L_0x006d
        L_0x0092:
            r9 = 0
        L_0x0093:
            if (r9 != 0) goto L_0x009f
            return r4
        L_0x0096:
            r9 = r3
            goto L_0x009f
        L_0x0098:
            int r13 = r13.b
            int r9 = r12.H0
            if (r9 <= r13) goto L_0x009f
            return r4
        L_0x009f:
            int r12 = defpackage.t0g.a
            r13 = 28
            if (r12 > r13) goto L_0x00b1
            if (r9 != r2) goto L_0x00a9
            r3 = r5
            goto L_0x00b2
        L_0x00a9:
            if (r9 == r7) goto L_0x00b2
            r13 = 4
            if (r9 == r13) goto L_0x00b2
            if (r9 != r1) goto L_0x00b1
            goto L_0x00b2
        L_0x00b1:
            r3 = r9
        L_0x00b2:
            r13 = 26
            if (r12 > r13) goto L_0x00c3
            java.lang.String r12 = "fugu"
            java.lang.String r13 = defpackage.t0g.b
            boolean r12 = r12.equals(r13)
            if (r12 == 0) goto L_0x00c3
            if (r3 != r8) goto L_0x00c3
            r3 = 2
        L_0x00c3:
            int r12 = defpackage.t0g.o(r3)
            if (r12 != 0) goto L_0x00ca
            return r4
        L_0x00ca:
            java.lang.Integer r13 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            android.util.Pair r12 = android.util.Pair.create(r13, r12)
            return r12
        L_0x00d7:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rc4.f(ca6, t30):android.util.Pair");
    }

    public static boolean o(AudioTrack audioTrack) {
        return t0g.a >= 29 && audioTrack.isOffloadedPlayback();
    }

    public final void a(long j2) {
        fob fob;
        boolean z2;
        boolean u2 = u();
        g6d g6d = this.b;
        if (u2) {
            fob = h().a;
            g6d.getClass();
            float f2 = fob.a;
            ufe ufe = (ufe) g6d.o;
            if (ufe.c != f2) {
                ufe.c = f2;
                ufe.i = true;
            }
            float f3 = ufe.d;
            float f4 = fob.b;
            if (f3 != f4) {
                ufe.d = f4;
                ufe.i = true;
            }
        } else {
            fob = fob.o;
        }
        fob fob2 = fob;
        int i2 = 0;
        if (u()) {
            z2 = h().b;
            ((hae) g6d.c).m = z2;
        } else {
            z2 = false;
        }
        this.j.add(new jc4(fob2, z2, Math.max(0, j2), (j() * 1000000) / ((long) this.t.e)));
        k60[] k60Arr = this.t.i;
        ArrayList arrayList = new ArrayList();
        for (k60 k60 : k60Arr) {
            if (k60.isActive()) {
                arrayList.add(k60);
            } else {
                k60.flush();
            }
        }
        int size = arrayList.size();
        this.K = (k60[]) arrayList.toArray(new k60[size]);
        this.L = new ByteBuffer[size];
        while (true) {
            k60[] k60Arr2 = this.K;
            if (i2 >= k60Arr2.length) {
                break;
            }
            k60 k602 = k60Arr2[i2];
            k602.flush();
            this.L[i2] = k602.a();
            i2++;
        }
        wie wie = this.r;
        if (wie != null) {
            wsb wsb = ((kn8) wie.b).P1;
            Handler handler = (Handler) wsb.a;
            if (handler != null) {
                handler.post(new c70((Object) wsb, z2, 0));
            }
        }
    }

    public final void b(ca6 ca6, int[] iArr) {
        k60[] k60Arr;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        k60[] k60Arr2;
        int i9;
        int i10;
        int i11;
        int i12;
        int intValue;
        int[] iArr2;
        ca6 ca62 = ca6;
        boolean equals = "audio/raw".equals(ca62.Z);
        int i13 = ca62.I0;
        int i14 = ca62.H0;
        if (equals) {
            int i15 = ca62.J0;
            y64.g(t0g.B(i15));
            int v2 = t0g.v(i15, i14);
            k60[] k60Arr3 = (!this.c || !(i15 == 536870912 || i15 == 805306368 || i15 == 4)) ? this.f : this.g;
            int i16 = ca62.K0;
            btf btf = this.e;
            btf.i = i16;
            btf.j = ca62.L0;
            if (t0g.a < 21 && i14 == 8 && iArr == null) {
                iArr2 = new int[6];
                for (int i17 = 0; i17 < 6; i17++) {
                    iArr2[i17] = i17;
                }
            } else {
                iArr2 = iArr;
            }
            this.d.i = iArr2;
            i60 i60 = new i60(i13, i14, i15);
            int length = k60Arr3.length;
            int i18 = 0;
            while (i18 < length) {
                k60 k60 = k60Arr3[i18];
                try {
                    i60 e2 = k60.e(i60);
                    if (k60.isActive()) {
                        i60 = e2;
                    }
                    i18++;
                } catch (AudioProcessor$UnhandledAudioFormatException e3) {
                    throw new AudioSink$ConfigurationException(e3, ca62);
                }
            }
            int i19 = i60.c;
            int i20 = i60.b;
            int o2 = t0g.o(i20);
            int v3 = t0g.v(i19, i20);
            i3 = i60.a;
            i2 = i19;
            k60Arr = k60Arr3;
            i4 = v2;
            i5 = o2;
            i6 = v3;
            i7 = 0;
        } else {
            k60[] k60Arr4 = new k60[0];
            i4 = -1;
            if (v(ca62, this.v)) {
                String str = ca62.Z;
                str.getClass();
                int b2 = uq9.b(str, ca62.z);
                intValue = t0g.o(i14);
                k60Arr = k60Arr4;
                i3 = i13;
                i2 = b2;
                i7 = 1;
            } else {
                Pair f2 = f(ca62, this.a);
                if (f2 != null) {
                    int intValue2 = ((Integer) f2.first).intValue();
                    intValue = ((Integer) f2.second).intValue();
                    k60Arr = k60Arr4;
                    i3 = i13;
                    i2 = intValue2;
                    i7 = 2;
                } else {
                    String valueOf = String.valueOf(ca6);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 37);
                    sb.append("Unable to configure passthrough for: ");
                    sb.append(valueOf);
                    throw new AudioSink$ConfigurationException(sb.toString(), ca62);
                }
            }
            i5 = intValue;
            i6 = -1;
        }
        int minBufferSize = AudioTrack.getMinBufferSize(i3, i5, i2);
        y64.j(minBufferSize != -2);
        double d2 = this.k ? 8.0d : 1.0d;
        this.p.getClass();
        int i21 = 250000;
        if (i7 != 0) {
            if (i7 == 1) {
                i8 = i7;
                i12 = cvg.r((((long) 50000000) * ((long) v02.h(i2))) / 1000000);
            } else if (i7 == 2) {
                if (i2 == 5) {
                    i21 = 500000;
                }
                i12 = cvg.r((((long) i21) * ((long) v02.h(i2))) / 1000000);
                i8 = i7;
            } else {
                throw new IllegalArgumentException();
            }
            i11 = i4;
            i10 = i3;
            i9 = i2;
            k60Arr2 = k60Arr;
        } else {
            i8 = i7;
            long j2 = (long) i3;
            i11 = i4;
            i10 = i3;
            long j3 = (long) i6;
            i9 = i2;
            k60Arr2 = k60Arr;
            i12 = t0g.j(minBufferSize * 4, cvg.r(((((long) 250000) * j2) * j3) / 1000000), cvg.r(((((long) 750000) * j2) * j3) / 1000000));
        }
        int max = (((Math.max(minBufferSize, (int) (((double) i12) * d2)) + i6) - 1) / i6) * i6;
        if (i9 == 0) {
            String valueOf2 = String.valueOf(ca6);
            StringBuilder sb2 = new StringBuilder(valueOf2.length() + 48);
            sb2.append("Invalid output encoding (mode=");
            sb2.append(i8);
            sb2.append(") for: ");
            sb2.append(valueOf2);
            throw new AudioSink$ConfigurationException(sb2.toString(), ca6);
        } else if (i5 != 0) {
            this.a0 = false;
            hc4 hc4 = new hc4(ca6, i11, i8, i6, i10, i5, i9, max, k60Arr2);
            if (n()) {
                this.s = hc4;
            } else {
                this.t = hc4;
            }
        } else {
            String valueOf3 = String.valueOf(ca6);
            StringBuilder sb3 = new StringBuilder(valueOf3.length() + 54);
            sb3.append("Invalid output channel config (mode=");
            sb3.append(i8);
            sb3.append(") for: ");
            sb3.append(valueOf3);
            throw new AudioSink$ConfigurationException(sb3.toString(), ca6);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0018  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean c() {
        /*
            r9 = this;
            int r0 = r9.R
            r1 = 1
            r2 = 0
            r3 = -1
            if (r0 != r3) goto L_0x000b
            r9.R = r2
        L_0x0009:
            r0 = r1
            goto L_0x000c
        L_0x000b:
            r0 = r2
        L_0x000c:
            int r4 = r9.R
            k60[] r5 = r9.K
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L_0x002f
            r4 = r5[r4]
            if (r0 == 0) goto L_0x001f
            r4.c()
        L_0x001f:
            r9.q(r7)
            boolean r0 = r4.d()
            if (r0 != 0) goto L_0x0029
            return r2
        L_0x0029:
            int r0 = r9.R
            int r0 = r0 + r1
            r9.R = r0
            goto L_0x0009
        L_0x002f:
            java.nio.ByteBuffer r0 = r9.O
            if (r0 == 0) goto L_0x003b
            r9.w(r7, r0)
            java.nio.ByteBuffer r0 = r9.O
            if (r0 == 0) goto L_0x003b
            return r2
        L_0x003b:
            r9.R = r3
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rc4.c():boolean");
    }

    public final void d() {
        if (n()) {
            this.B = 0;
            this.C = 0;
            this.D = 0;
            this.E = 0;
            this.b0 = false;
            this.F = 0;
            this.x = new jc4(h().a, h().b, 0, 0);
            this.I = 0;
            this.w = null;
            this.j.clear();
            this.M = null;
            this.N = 0;
            this.O = null;
            this.T = false;
            this.S = false;
            this.R = -1;
            this.z = null;
            this.A = 0;
            this.e.o = 0;
            int i2 = 0;
            while (true) {
                k60[] k60Arr = this.K;
                if (i2 >= k60Arr.length) {
                    break;
                }
                k60 k60 = k60Arr[i2];
                k60.flush();
                this.L[i2] = k60.a();
                i2++;
            }
            w70 w70 = this.i;
            AudioTrack audioTrack = w70.c;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 3) {
                this.u.pause();
            }
            if (o(this.u)) {
                o5h o5h = this.m;
                o5h.getClass();
                this.u.unregisterStreamEventCallback((pc4) o5h.b);
                ((Handler) o5h.a).removeCallbacksAndMessages((Object) null);
            }
            AudioTrack audioTrack2 = this.u;
            this.u = null;
            if (t0g.a < 21 && !this.V) {
                this.W = 0;
            }
            hc4 hc4 = this.s;
            if (hc4 != null) {
                this.t = hc4;
                this.s = null;
            }
            w70.l = 0;
            w70.w = 0;
            w70.v = 0;
            w70.m = 0;
            w70.C = 0;
            w70.F = 0;
            w70.k = false;
            w70.c = null;
            w70.f = null;
            this.h.close();
            new bc4(this, audioTrack2).start();
        }
        this.o.b = null;
        this.n.b = null;
    }

    public final int g(ca6 ca6) {
        if (!"audio/raw".equals(ca6.Z)) {
            return ((this.a0 || !v(ca6, this.v)) && f(ca6, this.a) == null) ? 0 : 2;
        }
        int i2 = ca6.J0;
        if (!t0g.B(i2)) {
            return 0;
        }
        return (i2 == 2 || (this.c && i2 == 4)) ? 2 : 1;
    }

    public final jc4 h() {
        jc4 jc4 = this.w;
        if (jc4 != null) {
            return jc4;
        }
        ArrayDeque arrayDeque = this.j;
        return !arrayDeque.isEmpty() ? (jc4) arrayDeque.getLast() : this.x;
    }

    public final long i() {
        hc4 hc4 = this.t;
        return hc4.c == 0 ? this.B / ((long) hc4.b) : this.C;
    }

    public final long j() {
        hc4 hc4 = this.t;
        return hc4.c == 0 ? this.D / ((long) hc4.d) : this.E;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x01fa, code lost:
        r13 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x02bc, code lost:
        r0.F = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x02be, code lost:
        if (r13 != 0) goto L_0x02c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x02c0, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00f5, code lost:
        if (r10.a() == 0) goto L_0x00f7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean k(java.nio.ByteBuffer r25, long r26, int r28) {
        /*
            r24 = this;
            r0 = r24
            r1 = r25
            r2 = r26
            r4 = r28
            java.nio.ByteBuffer r5 = r0.M
            r6 = 1
            r7 = 0
            if (r5 == 0) goto L_0x0013
            if (r1 != r5) goto L_0x0011
            goto L_0x0013
        L_0x0011:
            r5 = r7
            goto L_0x0014
        L_0x0013:
            r5 = r6
        L_0x0014:
            defpackage.y64.g(r5)
            hc4 r5 = r0.s
            r8 = 3
            r9 = 0
            if (r5 == 0) goto L_0x0080
            boolean r5 = r24.c()
            if (r5 != 0) goto L_0x0024
            return r7
        L_0x0024:
            hc4 r5 = r0.s
            hc4 r10 = r0.t
            r5.getClass()
            int r11 = r10.c
            int r12 = r5.c
            if (r11 != r12) goto L_0x0070
            int r11 = r10.g
            int r12 = r5.g
            if (r11 != r12) goto L_0x0070
            int r11 = r10.e
            int r12 = r5.e
            if (r11 != r12) goto L_0x0070
            int r11 = r10.f
            int r12 = r5.f
            if (r11 != r12) goto L_0x0070
            int r10 = r10.d
            int r5 = r5.d
            if (r10 != r5) goto L_0x0070
            hc4 r5 = r0.s
            r0.t = r5
            r0.s = r9
            android.media.AudioTrack r5 = r0.u
            boolean r5 = o(r5)
            if (r5 == 0) goto L_0x007d
            int r5 = r0.l
            if (r5 == r8) goto L_0x007d
            android.media.AudioTrack r5 = r0.u
            r5.setOffloadEndOfStream()
            android.media.AudioTrack r5 = r0.u
            hc4 r10 = r0.t
            ca6 r10 = r10.a
            int r11 = r10.K0
            int r10 = r10.L0
            r5.setOffloadDelayPadding(r11, r10)
            r0.b0 = r6
            goto L_0x007d
        L_0x0070:
            r24.p()
            boolean r5 = r24.l()
            if (r5 == 0) goto L_0x007a
            return r7
        L_0x007a:
            r24.d()
        L_0x007d:
            r0.a(r2)
        L_0x0080:
            boolean r5 = r24.n()
            nc4 r10 = r0.n
            if (r5 != 0) goto L_0x0097
            r24.m()     // Catch:{ AudioSink$InitializationException -> 0x008c }
            goto L_0x0097
        L_0x008c:
            r0 = move-exception
            r1 = r0
            boolean r0 = r1.a
            if (r0 != 0) goto L_0x0096
            r10.a(r1)
            return r7
        L_0x0096:
            throw r1
        L_0x0097:
            r10.b = r9
            boolean r5 = r0.H
            w70 r10 = r0.i
            r11 = 0
            if (r5 == 0) goto L_0x00d6
            long r13 = java.lang.Math.max(r11, r2)
            r0.I = r13
            r0.G = r7
            r0.H = r7
            boolean r5 = r0.k
            if (r5 == 0) goto L_0x00ba
            int r5 = defpackage.t0g.a
            r13 = 23
            if (r5 < r13) goto L_0x00ba
            fob r5 = r0.y
            r0.t(r5)
        L_0x00ba:
            r0.a(r2)
            boolean r5 = r0.U
            if (r5 == 0) goto L_0x00d6
            r0.U = r6
            boolean r5 = r24.n()
            if (r5 == 0) goto L_0x00d6
            v70 r5 = r10.f
            r5.getClass()
            r5.a()
            android.media.AudioTrack r5 = r0.u
            r5.play()
        L_0x00d6:
            long r13 = r24.j()
            android.media.AudioTrack r5 = r10.c
            r5.getClass()
            int r5 = r5.getPlayState()
            boolean r15 = r10.h
            r9 = 2
            if (r15 == 0) goto L_0x00f8
            if (r5 != r9) goto L_0x00ed
            r10.p = r7
            goto L_0x00f7
        L_0x00ed:
            if (r5 != r6) goto L_0x00f8
            long r16 = r10.a()
            int r15 = (r16 > r11 ? 1 : (r16 == r11 ? 0 : -1))
            if (r15 != 0) goto L_0x00f8
        L_0x00f7:
            return r7
        L_0x00f8:
            boolean r15 = r10.p
            boolean r13 = r10.b(r13)
            r10.p = r13
            if (r15 == 0) goto L_0x013e
            if (r13 != 0) goto L_0x013e
            if (r5 == r6) goto L_0x013e
            int r5 = r10.e
            long r13 = r10.i
            long r19 = defpackage.t0g.M(r13)
            er7 r13 = r10.a
            java.lang.Object r13 = r13.b
            rc4 r13 = (defpackage.rc4) r13
            wie r14 = r13.r
            if (r14 == 0) goto L_0x013e
            long r14 = android.os.SystemClock.elapsedRealtime()
            long r11 = r13.Z
            long r21 = r14 - r11
            wie r11 = r13.r
            java.lang.Object r11 = r11.b
            kn8 r11 = (defpackage.kn8) r11
            wsb r11 = r11.P1
            java.lang.Object r12 = r11.a
            android.os.Handler r12 = (android.os.Handler) r12
            if (r12 == 0) goto L_0x013e
            b70 r13 = new b70
            r18 = 0
            r16 = r13
            r17 = r5
            r23 = r11
            r16.<init>(r17, r18, r19, r21, r23)
            r12.post(r13)
        L_0x013e:
            java.nio.ByteBuffer r5 = r0.M
            if (r5 != 0) goto L_0x036a
            java.nio.ByteOrder r5 = r25.order()
            java.nio.ByteOrder r11 = java.nio.ByteOrder.LITTLE_ENDIAN
            if (r5 != r11) goto L_0x014c
            r5 = r6
            goto L_0x014d
        L_0x014c:
            r5 = r7
        L_0x014d:
            defpackage.y64.g(r5)
            boolean r5 = r25.hasRemaining()
            if (r5 != 0) goto L_0x0157
            return r6
        L_0x0157:
            hc4 r5 = r0.t
            int r11 = r5.c
            if (r11 == 0) goto L_0x02c1
            int r11 = r0.F
            if (r11 != 0) goto L_0x02c1
            int r5 = r5.g
            r11 = -2
            r12 = 10
            r13 = 1024(0x400, float:1.435E-42)
            r14 = 16
            r15 = -1
            switch(r5) {
                case 5: goto L_0x0282;
                case 6: goto L_0x0282;
                case 7: goto L_0x0226;
                case 8: goto L_0x0226;
                case 9: goto L_0x0201;
                case 10: goto L_0x02bc;
                case 11: goto L_0x01fd;
                case 12: goto L_0x01fd;
                case 13: goto L_0x016e;
                case 14: goto L_0x0199;
                case 15: goto L_0x0195;
                case 16: goto L_0x02bc;
                case 17: goto L_0x017c;
                case 18: goto L_0x0282;
                default: goto L_0x016e;
            }
        L_0x016e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = 38
            java.lang.String r2 = "Unexpected audio encoding: "
            java.lang.String r1 = defpackage.i2a.h(r1, r5, r2)
            r0.<init>(r1)
            throw r0
        L_0x017c:
            byte[] r5 = new byte[r14]
            int r8 = r25.position()
            r1.get(r5)
            r1.position(r8)
            ky1 r8 = new ky1
            r8.<init>((byte[]) r5, (byte) r7, (int) r14, (int) r6)
            r3 r5 = defpackage.kv0.W(r8)
            int r13 = r5.c
            goto L_0x02bc
        L_0x0195:
            r13 = 512(0x200, float:7.175E-43)
            goto L_0x02bc
        L_0x0199:
            int r5 = r25.position()
            int r8 = r25.limit()
            int r8 = r8 - r12
            r9 = r5
        L_0x01a3:
            if (r9 > r8) goto L_0x01c6
            int r12 = r9 + 4
            int r13 = defpackage.t0g.a
            int r12 = r1.getInt(r12)
            java.nio.ByteOrder r13 = r25.order()
            java.nio.ByteOrder r7 = java.nio.ByteOrder.BIG_ENDIAN
            if (r13 != r7) goto L_0x01b6
            goto L_0x01ba
        L_0x01b6:
            int r12 = java.lang.Integer.reverseBytes(r12)
        L_0x01ba:
            r7 = r12 & -2
            r12 = -126718022(0xfffffffff8726fba, float:-1.966878E34)
            if (r7 != r12) goto L_0x01c3
            int r9 = r9 - r5
            goto L_0x01c7
        L_0x01c3:
            int r9 = r9 + r6
            r7 = 0
            goto L_0x01a3
        L_0x01c6:
            r9 = r15
        L_0x01c7:
            if (r9 != r15) goto L_0x01cc
            r13 = 0
            goto L_0x02bc
        L_0x01cc:
            int r5 = r25.position()
            int r5 = r5 + r9
            int r5 = r5 + 7
            byte r5 = r1.get(r5)
            r5 = r5 & 255(0xff, float:3.57E-43)
            r7 = 187(0xbb, float:2.62E-43)
            if (r5 != r7) goto L_0x01df
            r5 = r6
            goto L_0x01e0
        L_0x01df:
            r5 = 0
        L_0x01e0:
            int r7 = r25.position()
            int r7 = r7 + r9
            if (r5 == 0) goto L_0x01ea
            r5 = 9
            goto L_0x01ec
        L_0x01ea:
            r5 = 8
        L_0x01ec:
            int r7 = r7 + r5
            byte r5 = r1.get(r7)
            int r5 = r5 >> 4
            r5 = r5 & 7
            r7 = 40
            int r5 = r7 << r5
            int r5 = r5 * r14
        L_0x01fa:
            r13 = r5
            goto L_0x02bc
        L_0x01fd:
            r13 = 2048(0x800, float:2.87E-42)
            goto L_0x02bc
        L_0x0201:
            int r5 = r25.position()
            int r7 = defpackage.t0g.a
            int r5 = r1.getInt(r5)
            java.nio.ByteOrder r7 = r25.order()
            java.nio.ByteOrder r8 = java.nio.ByteOrder.BIG_ENDIAN
            if (r7 != r8) goto L_0x0214
            goto L_0x0218
        L_0x0214:
            int r5 = java.lang.Integer.reverseBytes(r5)
        L_0x0218:
            int r13 = defpackage.gsg.u(r5)
            if (r13 == r15) goto L_0x0220
            goto L_0x02bc
        L_0x0220:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L_0x0226:
            int r5 = r25.position()
            byte r7 = r1.get(r5)
            if (r7 == r11) goto L_0x026e
            if (r7 == r15) goto L_0x025d
            r8 = 31
            if (r7 == r8) goto L_0x024a
            int r7 = r5 + 4
            byte r7 = r1.get(r7)
            r7 = r7 & r6
            int r7 = r7 << 6
            int r5 = r5 + 5
            byte r5 = r1.get(r5)
        L_0x0245:
            r5 = r5 & 252(0xfc, float:3.53E-43)
        L_0x0247:
            int r5 = r5 >> r9
            r5 = r5 | r7
            goto L_0x027e
        L_0x024a:
            int r7 = r5 + 5
            byte r7 = r1.get(r7)
            r7 = r7 & 7
            int r7 = r7 << 4
            int r5 = r5 + 6
            byte r5 = r1.get(r5)
        L_0x025a:
            r5 = r5 & 60
            goto L_0x0247
        L_0x025d:
            int r7 = r5 + 4
            byte r7 = r1.get(r7)
            r7 = r7 & 7
            int r7 = r7 << 4
            int r5 = r5 + 7
            byte r5 = r1.get(r5)
            goto L_0x025a
        L_0x026e:
            int r7 = r5 + 5
            byte r7 = r1.get(r7)
            r7 = r7 & r6
            int r7 = r7 << 6
            int r5 = r5 + 4
            byte r5 = r1.get(r5)
            goto L_0x0245
        L_0x027e:
            int r5 = r5 + r6
            int r13 = r5 * 32
            goto L_0x02bc
        L_0x0282:
            int r5 = r25.position()
            int r5 = r5 + 5
            byte r5 = r1.get(r5)
            r5 = r5 & 248(0xf8, float:3.48E-43)
            int r5 = r5 >> r8
            if (r5 <= r12) goto L_0x02b8
            int r5 = r25.position()
            int r5 = r5 + 4
            byte r5 = r1.get(r5)
            r5 = r5 & 192(0xc0, float:2.69E-43)
            int r5 = r5 >> 6
            if (r5 != r8) goto L_0x02a2
            goto L_0x02b0
        L_0x02a2:
            int r5 = r25.position()
            int r5 = r5 + 4
            byte r5 = r1.get(r5)
            r5 = r5 & 48
            int r8 = r5 >> 4
        L_0x02b0:
            int[] r5 = defpackage.bs0.a
            r5 = r5[r8]
            int r5 = r5 * 256
            goto L_0x01fa
        L_0x02b8:
            r5 = 1536(0x600, float:2.152E-42)
            goto L_0x01fa
        L_0x02bc:
            r0.F = r13
            if (r13 != 0) goto L_0x02c1
            return r6
        L_0x02c1:
            jc4 r5 = r0.w
            if (r5 == 0) goto L_0x02d3
            boolean r5 = r24.c()
            if (r5 != 0) goto L_0x02cd
            r5 = 0
            return r5
        L_0x02cd:
            r0.a(r2)
            r5 = 0
            r0.w = r5
        L_0x02d3:
            long r7 = r0.I
            hc4 r5 = r0.t
            long r11 = r24.i()
            btf r9 = r0.e
            long r13 = r9.o
            long r11 = r11 - r13
            r13 = 1000000(0xf4240, double:4.940656E-318)
            long r11 = r11 * r13
            ca6 r5 = r5.a
            int r5 = r5.I0
            long r13 = (long) r5
            long r11 = r11 / r13
            long r11 = r11 + r7
            boolean r5 = r0.G
            if (r5 != 0) goto L_0x0323
            long r7 = r11 - r2
            long r7 = java.lang.Math.abs(r7)
            r13 = 200000(0x30d40, double:9.8813E-319)
            int r5 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r5 <= 0) goto L_0x0323
            wie r5 = r0.r
            com.google.android.exoplayer2.audio.AudioSink$UnexpectedDiscontinuityException r7 = new com.google.android.exoplayer2.audio.AudioSink$UnexpectedDiscontinuityException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r9 = 103(0x67, float:1.44E-43)
            r8.<init>(r9)
            java.lang.String r9 = "Unexpected audio track timestamp discontinuity: expected "
            r8.append(r9)
            r8.append(r11)
            java.lang.String r9 = ", got "
            r8.append(r9)
            r8.append(r2)
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            r5.i0(r7)
            r0.G = r6
        L_0x0323:
            boolean r5 = r0.G
            if (r5 == 0) goto L_0x034c
            boolean r5 = r24.c()
            if (r5 != 0) goto L_0x032f
            r5 = 0
            return r5
        L_0x032f:
            r5 = 0
            long r7 = r2 - r11
            long r11 = r0.I
            long r11 = r11 + r7
            r0.I = r11
            r0.G = r5
            r0.a(r2)
            wie r5 = r0.r
            if (r5 == 0) goto L_0x034c
            r11 = 0
            int r7 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r7 == 0) goto L_0x034c
            java.lang.Object r5 = r5.b
            kn8 r5 = (defpackage.kn8) r5
            r5.W1 = r6
        L_0x034c:
            hc4 r5 = r0.t
            int r5 = r5.c
            if (r5 != 0) goto L_0x035d
            long r7 = r0.B
            int r5 = r25.remaining()
            long r11 = (long) r5
            long r7 = r7 + r11
            r0.B = r7
            goto L_0x0366
        L_0x035d:
            long r7 = r0.C
            int r5 = r0.F
            int r5 = r5 * r4
            long r11 = (long) r5
            long r7 = r7 + r11
            r0.C = r7
        L_0x0366:
            r0.M = r1
            r0.N = r4
        L_0x036a:
            r0.q(r2)
            java.nio.ByteBuffer r1 = r0.M
            boolean r1 = r1.hasRemaining()
            if (r1 != 0) goto L_0x037c
            r1 = 0
            r0.M = r1
            r1 = 0
            r0.N = r1
            return r6
        L_0x037c:
            long r1 = r24.j()
            long r3 = r10.y
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r3 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r3 == 0) goto L_0x03a2
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 <= 0) goto L_0x03a2
            long r1 = android.os.SystemClock.elapsedRealtime()
            long r3 = r10.y
            long r1 = r1 - r3
            r3 = 200(0xc8, double:9.9E-322)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 < 0) goto L_0x03a2
            r24.d()
            return r6
        L_0x03a2:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rc4.k(java.nio.ByteBuffer, long, int):boolean");
    }

    public final boolean l() {
        return n() && this.i.b(j());
    }

    /* JADX WARNING: type inference failed for: r2v22, types: [o5h, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0155  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m() {
        /*
            r15 = this;
            android.os.ConditionVariable r0 = r15.h
            r0.block()
            r0 = 1
            hc4 r1 = r15.t     // Catch:{ AudioSink$InitializationException -> 0x001f }
            r1.getClass()     // Catch:{ AudioSink$InitializationException -> 0x001f }
            boolean r2 = r15.Y     // Catch:{ AudioSink$InitializationException -> 0x0016 }
            h30 r3 = r15.v     // Catch:{ AudioSink$InitializationException -> 0x0016 }
            int r4 = r15.W     // Catch:{ AudioSink$InitializationException -> 0x0016 }
            android.media.AudioTrack r1 = r1.a(r2, r3, r4)     // Catch:{ AudioSink$InitializationException -> 0x0016 }
            goto L_0x004f
        L_0x0016:
            r1 = move-exception
            wie r2 = r15.r     // Catch:{ AudioSink$InitializationException -> 0x001f }
            if (r2 == 0) goto L_0x001e
            r2.i0(r1)     // Catch:{ AudioSink$InitializationException -> 0x001f }
        L_0x001e:
            throw r1     // Catch:{ AudioSink$InitializationException -> 0x001f }
        L_0x001f:
            r1 = move-exception
            hc4 r2 = r15.t
            int r3 = r2.h
            r4 = 1000000(0xf4240, float:1.401298E-39)
            if (r3 <= r4) goto L_0x014f
            hc4 r3 = new hc4
            int r11 = r2.f
            int r12 = r2.g
            ca6 r6 = r2.a
            int r7 = r2.b
            int r8 = r2.c
            int r9 = r2.d
            int r10 = r2.e
            r13 = 1000000(0xf4240, float:1.401298E-39)
            k60[] r14 = r2.i
            r5 = r3
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            boolean r2 = r15.Y     // Catch:{ AudioSink$InitializationException -> 0x0143 }
            h30 r4 = r15.v     // Catch:{ AudioSink$InitializationException -> 0x0143 }
            int r5 = r15.W     // Catch:{ AudioSink$InitializationException -> 0x0143 }
            android.media.AudioTrack r2 = r3.a(r2, r4, r5)     // Catch:{ AudioSink$InitializationException -> 0x0143 }
            r15.t = r3     // Catch:{ AudioSink$InitializationException -> 0x0141 }
            r1 = r2
        L_0x004f:
            r15.u = r1
            boolean r1 = o(r1)
            if (r1 == 0) goto L_0x009d
            android.media.AudioTrack r1 = r15.u
            o5h r2 = r15.m
            if (r2 != 0) goto L_0x0075
            o5h r2 = new o5h
            r2.<init>()
            r2.c = r15
            android.os.Handler r3 = new android.os.Handler
            r3.<init>()
            r2.a = r3
            pc4 r3 = new pc4
            r4 = 0
            r3.<init>(r4, r2)
            r2.b = r3
            r15.m = r2
        L_0x0075:
            o5h r2 = r15.m
            java.lang.Object r3 = r2.a
            android.os.Handler r3 = (android.os.Handler) r3
            java.util.Objects.requireNonNull(r3)
            oc4 r4 = new oc4
            r5 = 0
            r4.<init>(r3, r5)
            java.lang.Object r2 = r2.b
            pc4 r2 = (defpackage.pc4) r2
            r1.registerStreamEventCallback(r4, r2)
            int r1 = r15.l
            r2 = 3
            if (r1 == r2) goto L_0x009d
            android.media.AudioTrack r1 = r15.u
            hc4 r2 = r15.t
            ca6 r2 = r2.a
            int r3 = r2.K0
            int r2 = r2.L0
            r1.setOffloadDelayPadding(r3, r2)
        L_0x009d:
            int r1 = defpackage.t0g.a
            r2 = 31
            if (r1 < r2) goto L_0x00ac
            lpb r2 = r15.q
            if (r2 == 0) goto L_0x00ac
            android.media.AudioTrack r3 = r15.u
            defpackage.dc4.a(r3, r2)
        L_0x00ac:
            android.media.AudioTrack r2 = r15.u
            int r2 = r2.getAudioSessionId()
            r15.W = r2
            android.media.AudioTrack r2 = r15.u
            hc4 r3 = r15.t
            int r4 = r3.c
            r5 = 2
            r6 = 0
            if (r4 != r5) goto L_0x00c0
            r4 = r0
            goto L_0x00c1
        L_0x00c0:
            r4 = r6
        L_0x00c1:
            w70 r5 = r15.i
            r5.c = r2
            int r7 = r3.d
            r5.d = r7
            int r8 = r3.h
            r5.e = r8
            v70 r9 = new v70
            r10 = 0
            r9.<init>(r2, r10)
            r5.f = r9
            int r2 = r2.getSampleRate()
            r5.g = r2
            int r2 = r3.g
            if (r4 == 0) goto L_0x00eb
            r3 = 23
            if (r1 >= r3) goto L_0x00eb
            r3 = 5
            if (r2 == r3) goto L_0x00e9
            r3 = 6
            if (r2 != r3) goto L_0x00eb
        L_0x00e9:
            r3 = r0
            goto L_0x00ec
        L_0x00eb:
            r3 = r6
        L_0x00ec:
            r5.h = r3
            boolean r2 = defpackage.t0g.B(r2)
            r5.q = r2
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r2 == 0) goto L_0x0106
            int r8 = r8 / r7
            long r7 = (long) r8
            r9 = 1000000(0xf4240, double:4.940656E-318)
            long r7 = r7 * r9
            int r2 = r5.g
            long r9 = (long) r2
            long r7 = r7 / r9
            goto L_0x0107
        L_0x0106:
            r7 = r3
        L_0x0107:
            r5.i = r7
            r7 = 0
            r5.s = r7
            r5.t = r7
            r5.u = r7
            r5.p = r6
            r5.x = r3
            r5.y = r3
            r5.r = r7
            r5.o = r7
            r2 = 1065353216(0x3f800000, float:1.0)
            r5.j = r2
            boolean r2 = r15.n()
            if (r2 != 0) goto L_0x0126
            goto L_0x0139
        L_0x0126:
            r2 = 21
            if (r1 < r2) goto L_0x0132
            android.media.AudioTrack r1 = r15.u
            float r2 = r15.J
            r1.setVolume(r2)
            goto L_0x0139
        L_0x0132:
            android.media.AudioTrack r1 = r15.u
            float r2 = r15.J
            r1.setStereoVolume(r2, r2)
        L_0x0139:
            bd0 r1 = r15.X
            r1.getClass()
            r15.H = r0
            return
        L_0x0141:
            r2 = move-exception
            goto L_0x014c
        L_0x0143:
            r2 = move-exception
            wie r3 = r15.r     // Catch:{ AudioSink$InitializationException -> 0x0141 }
            if (r3 == 0) goto L_0x014b
            r3.i0(r2)     // Catch:{ AudioSink$InitializationException -> 0x0141 }
        L_0x014b:
            throw r2     // Catch:{ AudioSink$InitializationException -> 0x0141 }
        L_0x014c:
            r1.addSuppressed(r2)
        L_0x014f:
            hc4 r2 = r15.t
            int r2 = r2.c
            if (r2 != r0) goto L_0x0157
            r15.a0 = r0
        L_0x0157:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rc4.m():void");
    }

    public final boolean n() {
        return this.u != null;
    }

    public final void p() {
        if (!this.T) {
            this.T = true;
            long j2 = j();
            w70 w70 = this.i;
            w70.z = w70.a();
            w70.x = SystemClock.elapsedRealtime() * 1000;
            w70.A = j2;
            this.u.stop();
            this.A = 0;
        }
    }

    public final void q(long j2) {
        ByteBuffer byteBuffer;
        int length = this.K.length;
        int i2 = length;
        while (i2 >= 0) {
            if (i2 > 0) {
                byteBuffer = this.L[i2 - 1];
            } else {
                byteBuffer = this.M;
                if (byteBuffer == null) {
                    byteBuffer = k60.a;
                }
            }
            if (i2 == length) {
                w(j2, byteBuffer);
            } else {
                k60 k60 = this.K[i2];
                if (i2 > this.R) {
                    k60.b(byteBuffer);
                }
                ByteBuffer a2 = k60.a();
                this.L[i2] = a2;
                if (a2.hasRemaining()) {
                    i2++;
                }
            }
            if (!byteBuffer.hasRemaining()) {
                i2--;
            } else {
                return;
            }
        }
    }

    public final void r() {
        d();
        for (k60 reset : this.f) {
            reset.reset();
        }
        for (k60 reset2 : this.g) {
            reset2.reset();
        }
        this.U = false;
        this.a0 = false;
    }

    public final void s(fob fob, boolean z2) {
        jc4 h2 = h();
        if (!fob.equals(h2.a) || z2 != h2.b) {
            jc4 jc4 = new jc4(fob, z2, -9223372036854775807L, -9223372036854775807L);
            if (n()) {
                this.w = jc4;
            } else {
                this.x = jc4;
            }
        }
    }

    public final void t(fob fob) {
        if (n()) {
            try {
                this.u.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(fob.a).setPitch(fob.b).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e2) {
                iq.a("Failed to set playback params", e2);
            }
            fob = new fob(this.u.getPlaybackParams().getSpeed(), this.u.getPlaybackParams().getPitch());
            float f2 = fob.a;
            w70 w70 = this.i;
            w70.j = f2;
            v70 v70 = w70.f;
            if (v70 != null) {
                v70.a();
            }
        }
        this.y = fob;
    }

    public final boolean u() {
        if (!this.Y && "audio/raw".equals(this.t.a.Z)) {
            int i2 = this.t.a.J0;
            if (this.c) {
                int i3 = t0g.a;
                if (i2 == 536870912 || i2 == 805306368 || i2 == 4) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public final boolean v(ca6 ca6, h30 h30) {
        int i2;
        int o2;
        int i3 = t0g.a;
        if (i3 < 29 || (i2 = this.l) == 0) {
            return false;
        }
        String str = ca6.Z;
        str.getClass();
        int b2 = uq9.b(str, ca6.z);
        if (b2 == 0 || (o2 = t0g.o(ca6.H0)) == 0) {
            return false;
        }
        AudioFormat e2 = e(ca6.I0, o2, b2);
        AudioAttributes a2 = h30.a();
        int a3 = i3 >= 31 ? AudioManager.getPlaybackOffloadSupport(e2, a2) : !AudioManager.isOffloadedPlaybackSupported(e2, a2) ? 0 : (i3 != 30 || !t0g.d.startsWith("Pixel")) ? 1 : 2;
        if (a3 == 0) {
            return false;
        }
        if (a3 == 1) {
            return !(ca6.K0 != 0 || ca6.L0 != 0) || !(i2 == 1);
        } else if (a3 == 2) {
            return true;
        } else {
            throw new IllegalStateException();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00e3, code lost:
        if (r14 < r13) goto L_0x0075;
     */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0134  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void w(long r13, java.nio.ByteBuffer r15) {
        /*
            r12 = this;
            boolean r0 = r15.hasRemaining()
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            java.nio.ByteBuffer r0 = r12.O
            r1 = 1
            r2 = 21
            r3 = 0
            if (r0 == 0) goto L_0x0018
            if (r0 != r15) goto L_0x0013
            r0 = r1
            goto L_0x0014
        L_0x0013:
            r0 = r3
        L_0x0014:
            defpackage.y64.g(r0)
            goto L_0x003b
        L_0x0018:
            r12.O = r15
            int r0 = defpackage.t0g.a
            if (r0 >= r2) goto L_0x003b
            int r0 = r15.remaining()
            byte[] r4 = r12.P
            if (r4 == 0) goto L_0x0029
            int r4 = r4.length
            if (r4 >= r0) goto L_0x002d
        L_0x0029:
            byte[] r4 = new byte[r0]
            r12.P = r4
        L_0x002d:
            int r4 = r15.position()
            byte[] r5 = r12.P
            r15.get(r5, r3, r0)
            r15.position(r4)
            r12.Q = r3
        L_0x003b:
            int r0 = r15.remaining()
            int r4 = defpackage.t0g.a
            w70 r5 = r12.i
            if (r4 >= r2) goto L_0x0078
            long r13 = r12.D
            long r6 = r5.a()
            int r2 = r5.d
            long r8 = (long) r2
            long r6 = r6 * r8
            long r13 = r13 - r6
            int r13 = (int) r13
            int r14 = r5.e
            int r14 = r14 - r13
            if (r14 <= 0) goto L_0x0075
            int r13 = java.lang.Math.min(r0, r14)
            android.media.AudioTrack r14 = r12.u
            byte[] r2 = r12.P
            int r6 = r12.Q
            int r13 = r14.write(r2, r6, r13)
            if (r13 <= 0) goto L_0x00fb
            int r14 = r12.Q
            int r14 = r14 + r13
            r12.Q = r14
            int r14 = r15.position()
            int r14 = r14 + r13
            r15.position(r14)
            goto L_0x00fb
        L_0x0075:
            r13 = r3
            goto L_0x00fb
        L_0x0078:
            boolean r2 = r12.Y
            if (r2 == 0) goto L_0x00f5
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r2 == 0) goto L_0x0087
            r2 = r1
            goto L_0x0088
        L_0x0087:
            r2 = r3
        L_0x0088:
            defpackage.y64.j(r2)
            android.media.AudioTrack r6 = r12.u
            r2 = 26
            r7 = 1000(0x3e8, double:4.94E-321)
            if (r4 < r2) goto L_0x009d
            r9 = 1
            long r10 = r13 * r7
            r7 = r15
            r8 = r0
            int r13 = r6.write(r7, r8, r9, r10)
            goto L_0x00fb
        L_0x009d:
            java.nio.ByteBuffer r2 = r12.z
            if (r2 != 0) goto L_0x00b6
            r2 = 16
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r2)
            r12.z = r2
            java.nio.ByteOrder r9 = java.nio.ByteOrder.BIG_ENDIAN
            r2.order(r9)
            java.nio.ByteBuffer r2 = r12.z
            r9 = 1431633921(0x55550001, float:1.46372496E13)
            r2.putInt(r9)
        L_0x00b6:
            int r2 = r12.A
            if (r2 != 0) goto L_0x00cf
            java.nio.ByteBuffer r2 = r12.z
            r9 = 4
            r2.putInt(r9, r0)
            java.nio.ByteBuffer r2 = r12.z
            r9 = 8
            long r13 = r13 * r7
            r2.putLong(r9, r13)
            java.nio.ByteBuffer r13 = r12.z
            r13.position(r3)
            r12.A = r0
        L_0x00cf:
            java.nio.ByteBuffer r13 = r12.z
            int r13 = r13.remaining()
            if (r13 <= 0) goto L_0x00e6
            java.nio.ByteBuffer r14 = r12.z
            int r14 = r6.write(r14, r13, r1)
            if (r14 >= 0) goto L_0x00e3
            r12.A = r3
            r13 = r14
            goto L_0x00fb
        L_0x00e3:
            if (r14 >= r13) goto L_0x00e6
            goto L_0x0075
        L_0x00e6:
            int r13 = r6.write(r15, r0, r1)
            if (r13 >= 0) goto L_0x00ef
            r12.A = r3
            goto L_0x00fb
        L_0x00ef:
            int r14 = r12.A
            int r14 = r14 - r13
            r12.A = r14
            goto L_0x00fb
        L_0x00f5:
            android.media.AudioTrack r13 = r12.u
            int r13 = r13.write(r15, r0, r1)
        L_0x00fb:
            long r6 = android.os.SystemClock.elapsedRealtime()
            r12.Z = r6
            nc4 r14 = r12.o
            if (r13 >= 0) goto L_0x0134
            r15 = 24
            if (r4 < r15) goto L_0x010c
            r15 = -6
            if (r13 == r15) goto L_0x0110
        L_0x010c:
            r15 = -32
            if (r13 != r15) goto L_0x0111
        L_0x0110:
            r3 = r1
        L_0x0111:
            if (r3 == 0) goto L_0x011b
            hc4 r15 = r12.t
            int r15 = r15.c
            if (r15 != r1) goto L_0x011b
            r12.a0 = r1
        L_0x011b:
            com.google.android.exoplayer2.audio.AudioSink$WriteException r15 = new com.google.android.exoplayer2.audio.AudioSink$WriteException
            hc4 r0 = r12.t
            ca6 r0 = r0.a
            r15.<init>(r13, r0, r3)
            wie r12 = r12.r
            if (r12 == 0) goto L_0x012b
            r12.i0(r15)
        L_0x012b:
            boolean r12 = r15.a
            if (r12 != 0) goto L_0x0133
            r14.a(r15)
            return
        L_0x0133:
            throw r15
        L_0x0134:
            r2 = 0
            r14.b = r2
            android.media.AudioTrack r14 = r12.u
            boolean r14 = o(r14)
            if (r14 == 0) goto L_0x017c
            long r6 = r12.E
            r8 = 0
            int r14 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r14 <= 0) goto L_0x0149
            r12.b0 = r3
        L_0x0149:
            boolean r14 = r12.U
            if (r14 == 0) goto L_0x017c
            wie r14 = r12.r
            if (r14 == 0) goto L_0x017c
            if (r13 >= r0) goto L_0x017c
            boolean r14 = r12.b0
            if (r14 != 0) goto L_0x017c
            long r8 = r5.a()
            long r6 = r6 - r8
            r8 = 1000000(0xf4240, double:4.940656E-318)
            long r6 = r6 * r8
            int r14 = r5.g
            long r4 = (long) r14
            long r6 = r6 / r4
            long r4 = defpackage.t0g.M(r6)
            wie r14 = r12.r
            java.lang.Object r14 = r14.b
            kn8 r14 = (defpackage.kn8) r14
            uc5 r14 = r14.Y1
            if (r14 == 0) goto L_0x017c
            r6 = 2000(0x7d0, double:9.88E-321)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 < 0) goto L_0x017c
            ed5 r14 = r14.a
            r14.P0 = r1
        L_0x017c:
            hc4 r14 = r12.t
            int r14 = r14.c
            if (r14 != 0) goto L_0x0188
            long r4 = r12.D
            long r6 = (long) r13
            long r4 = r4 + r6
            r12.D = r4
        L_0x0188:
            if (r13 != r0) goto L_0x01a2
            if (r14 == 0) goto L_0x01a0
            java.nio.ByteBuffer r13 = r12.M
            if (r15 != r13) goto L_0x0191
            goto L_0x0192
        L_0x0191:
            r1 = r3
        L_0x0192:
            defpackage.y64.j(r1)
            long r13 = r12.E
            int r15 = r12.F
            int r0 = r12.N
            int r15 = r15 * r0
            long r0 = (long) r15
            long r13 = r13 + r0
            r12.E = r13
        L_0x01a0:
            r12.O = r2
        L_0x01a2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rc4.w(long, java.nio.ByteBuffer):void");
    }
}
