package defpackage;

import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil$DecoderQueryException;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.uuid.Uuid;

/* renamed from: pk0  reason: default package */
public abstract class pk0 implements spb {
    public ea6[] X;
    public long Y;
    public long Z;
    public final Object a = new Object();
    public final int b;
    public final ox0 c;
    public s1d o;
    public int v;
    public long v0;
    public mpb w;
    public boolean w0;
    public c7f x;
    public boolean x0;
    public int y;
    public jkf y0;
    public lcd z;
    public q1d z0;

    public pk0(int i) {
        this.b = i;
        this.c = new ox0(12, false);
        this.v0 = Long.MIN_VALUE;
        this.y0 = jkf.a;
    }

    public static int b(int i, int i2, int i3, int i4) {
        return i | i2 | i3 | Uuid.SIZE_BITS | i4;
    }

    public static int i(int i) {
        return i & 384;
    }

    public static int j(int i) {
        return i & 64;
    }

    public static boolean o(int i, boolean z2) {
        int i2 = i & 7;
        return i2 == 4 || (z2 && i2 == 3);
    }

    public final void A(ea6[] ea6Arr, lcd lcd, long j, long j2, nz8 nz8) {
        n79.n(!this.w0);
        this.z = lcd;
        if (this.v0 == Long.MIN_VALUE) {
            this.v0 = j;
        }
        this.X = ea6Arr;
        this.Y = j2;
        x(ea6Arr, j, j2);
    }

    public final void B() {
        n79.n(this.y == 0);
        this.c.u();
        u();
    }

    public void C(float f, float f2) {
    }

    public abstract int D(ea6 ea6);

    public int E() {
        return 0;
    }

    public void a(int i, Object obj) {
    }

    public final ExoPlaybackException d(MediaCodecUtil$DecoderQueryException mediaCodecUtil$DecoderQueryException, ea6 ea6) {
        return g(mediaCodecUtil$DecoderQueryException, ea6, false, 4002);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.media3.exoplayer.ExoPlaybackException g(java.lang.Throwable r12, defpackage.ea6 r13, boolean r14, int r15) {
        /*
            r11 = this;
            r2 = 4
            if (r13 == 0) goto L_0x001b
            boolean r3 = r11.x0
            if (r3 != 0) goto L_0x001b
            r3 = 1
            r11.x0 = r3
            r3 = 0
            int r4 = r11.D(r13)     // Catch:{ ExoPlaybackException -> 0x0019, all -> 0x0014 }
            r4 = r4 & 7
            r11.x0 = r3
            goto L_0x001c
        L_0x0014:
            r0 = move-exception
            r2 = r0
            r11.x0 = r3
            throw r2
        L_0x0019:
            r11.x0 = r3
        L_0x001b:
            r4 = r2
        L_0x001c:
            java.lang.String r5 = r11.l()
            int r6 = r11.v
            androidx.media3.exoplayer.ExoPlaybackException r10 = new androidx.media3.exoplayer.ExoPlaybackException
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pk0.g(java.lang.Throwable, ea6, boolean, int):androidx.media3.exoplayer.ExoPlaybackException");
    }

    public void h() {
    }

    public cn8 k() {
        return null;
    }

    public abstract String l();

    public final boolean m() {
        return this.v0 == Long.MIN_VALUE;
    }

    public abstract boolean n();

    public abstract boolean p();

    public void q() {
    }

    public void r(boolean z2, boolean z3) {
    }

    public void s(long j, boolean z2) {
    }

    public void t() {
    }

    public void u() {
    }

    public void v() {
    }

    public void w() {
    }

    public abstract void x(ea6[] ea6Arr, long j, long j2);

    public final int y(ox0 ox0, ba4 ba4, int i) {
        lcd lcd = this.z;
        lcd.getClass();
        int f = lcd.f(ox0, ba4, i);
        if (f == -4) {
            if (ba4.h(4)) {
                this.v0 = Long.MIN_VALUE;
                return this.w0 ? -4 : -3;
            }
            long j = ba4.x + this.Y;
            ba4.x = j;
            this.v0 = Math.max(this.v0, j);
        } else if (f == -5) {
            ea6 ea6 = (ea6) ox0.b;
            ea6.getClass();
            long j2 = ea6.s;
            if (j2 != LongCompanionObject.MAX_VALUE) {
                ba6 a2 = ea6.a();
                a2.r = j2 + this.Y;
                ox0.b = a2.a();
            }
        }
        return f;
    }

    public abstract void z(long j, long j2);
}
