package defpackage;

import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil$DecoderQueryException;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.uuid.Uuid;

/* renamed from: ok0  reason: default package */
public abstract class ok0 implements rpb {
    public long X = Long.MIN_VALUE;
    public boolean Y;
    public boolean Z;
    public final int a;
    public final xe8 b = new xe8(13, false);
    public r1d c;
    public int o;
    public lpb v;
    public int w;
    public kcd x;
    public ca6[] y;
    public long z;

    public ok0(int i) {
        this.a = i;
    }

    public static int b(int i, int i2, int i3) {
        return i | i2 | i3 | Uuid.SIZE_BITS;
    }

    public static int h(int i) {
        return i & Uuid.SIZE_BITS;
    }

    public static int i(int i) {
        return i & 64;
    }

    public abstract int A(ca6 ca6);

    public int B() {
        return 0;
    }

    public void a(int i, Object obj) {
    }

    public final ExoPlaybackException d(MediaCodecUtil$DecoderQueryException mediaCodecUtil$DecoderQueryException, ca6 ca6) {
        return f(mediaCodecUtil$DecoderQueryException, ca6, false, 4002);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.exoplayer2.ExoPlaybackException f(java.lang.Exception r12, defpackage.ca6 r13, boolean r14, int r15) {
        /*
            r11 = this;
            r2 = 4
            if (r13 == 0) goto L_0x001b
            boolean r3 = r11.Z
            if (r3 != 0) goto L_0x001b
            r3 = 1
            r11.Z = r3
            r3 = 0
            int r4 = r11.A(r13)     // Catch:{ ExoPlaybackException -> 0x0019, all -> 0x0014 }
            r4 = r4 & 7
            r11.Z = r3
            goto L_0x001c
        L_0x0014:
            r0 = move-exception
            r2 = r0
            r11.Z = r3
            throw r2
        L_0x0019:
            r11.Z = r3
        L_0x001b:
            r4 = r2
        L_0x001c:
            java.lang.String r5 = r11.k()
            int r6 = r11.o
            com.google.android.exoplayer2.ExoPlaybackException r10 = new com.google.android.exoplayer2.ExoPlaybackException
            if (r13 != 0) goto L_0x0028
            r8 = r2
            goto L_0x0029
        L_0x0028:
            r8 = r4
        L_0x0029:
            r2 = 1
            r1 = r10
            r3 = r12
            r4 = r15
            r7 = r13
            r9 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ok0.f(java.lang.Exception, ca6, boolean, int):com.google.android.exoplayer2.ExoPlaybackException");
    }

    public bn8 j() {
        return null;
    }

    public abstract String k();

    public final boolean l() {
        return this.X == Long.MIN_VALUE;
    }

    public abstract boolean m();

    public abstract boolean n();

    public abstract void o();

    public void p(boolean z2, boolean z3) {
    }

    public abstract void q(long j, boolean z2);

    public void r() {
    }

    public void s() {
    }

    public void t() {
    }

    public abstract void u(ca6[] ca6Arr, long j, long j2);

    public final int v(xe8 xe8, aa4 aa4, int i) {
        kcd kcd = this.x;
        kcd.getClass();
        int f = kcd.f(xe8, aa4, i);
        if (f == -4) {
            if (aa4.h(4)) {
                this.X = Long.MIN_VALUE;
                return this.Y ? -4 : -3;
            }
            long j = aa4.w + this.z;
            aa4.w = j;
            this.X = Math.max(this.X, j);
        } else if (f == -5) {
            ca6 ca6 = (ca6) xe8.c;
            ca6.getClass();
            long j2 = ca6.y0;
            if (j2 != LongCompanionObject.MAX_VALUE) {
                aa6 a2 = ca6.a();
                a2.o = j2 + this.z;
                xe8.c = a2.a();
            }
        }
        return f;
    }

    public abstract void w(long j, long j2);

    public final void x(ca6[] ca6Arr, kcd kcd, long j, long j2) {
        y64.j(!this.Y);
        this.x = kcd;
        if (this.X == Long.MIN_VALUE) {
            this.X = j;
        }
        this.y = ca6Arr;
        this.z = j2;
        u(ca6Arr, j, j2);
    }

    public final void y() {
        y64.j(this.w == 0);
        this.b.j();
        r();
    }

    public void z(float f, float f2) {
    }
}
