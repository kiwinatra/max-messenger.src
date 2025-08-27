package defpackage;

import androidx.media3.common.ParserException;
import java.nio.charset.Charset;
import java.util.Arrays;

/* renamed from: ld  reason: default package */
public final class ld implements tf5 {
    public static final byte[] A0;
    public static final byte[] B0;
    public static final int C0;
    public static final int[] y0 = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    public static final int[] z0;
    public int X;
    public long Y;
    public xf5 Z;
    public final byte[] a;
    public final int b;
    public boolean c;
    public long o;
    public int v;
    public zpf v0;
    public int w;
    public snd w0;
    public boolean x;
    public boolean x0;
    public long y;
    public int z;

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        z0 = iArr;
        int i = v0g.a;
        Charset charset = x22.c;
        A0 = "#!AMR\n".getBytes(charset);
        B0 = "#!AMR-WB\n".getBytes(charset);
        C0 = iArr[8];
    }

    public ld(int i) {
        this.b = (i & 2) != 0 ? i | 1 : i;
        this.a = new byte[1];
        this.z = -1;
    }

    public final void U(xf5 xf5) {
        this.Z = xf5;
        this.v0 = xf5.B(0, 1);
        xf5.v();
    }

    public final int a(hf4 hf4) {
        boolean z2;
        hf4.w = 0;
        byte[] bArr = this.a;
        hf4.q(bArr, 0, 1, false);
        byte b2 = bArr[0];
        if ((b2 & 131) <= 0) {
            int i = (b2 >> 3) & 15;
            if (i >= 0 && i <= 15 && (((z2 = this.c) && (i < 10 || i > 13)) || (!z2 && (i < 12 || i > 14)))) {
                return z2 ? z0[i] : y0[i];
            }
            StringBuilder sb = new StringBuilder("Illegal AMR ");
            sb.append(this.c ? "WB" : "NB");
            sb.append(" frame type ");
            sb.append(i);
            throw ParserException.a(sb.toString(), (RuntimeException) null);
        }
        throw ParserException.a("Invalid padding bits for frame header " + b2, (RuntimeException) null);
    }

    public final boolean b(hf4 hf4) {
        hf4.w = 0;
        byte[] bArr = A0;
        byte[] bArr2 = new byte[bArr.length];
        hf4.q(bArr2, 0, bArr.length, false);
        if (Arrays.equals(bArr2, bArr)) {
            this.c = false;
            hf4.z(bArr.length);
            return true;
        }
        hf4.w = 0;
        byte[] bArr3 = B0;
        byte[] bArr4 = new byte[bArr3.length];
        hf4.q(bArr4, 0, bArr3.length, false);
        if (!Arrays.equals(bArr4, bArr3)) {
            return false;
        }
        this.c = true;
        hf4.z(bArr3.length);
        return true;
    }

    public final void d(long j, long j2) {
        this.o = 0;
        this.v = 0;
        this.w = 0;
        if (j != 0) {
            snd snd = this.w0;
            if (snd instanceof ui3) {
                ui3 ui3 = (ui3) snd;
                this.Y = (Math.max(0, j - ui3.b) * 8000000) / ((long) ui3.v);
                return;
            }
        }
        this.Y = 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x00b8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int g(defpackage.vf5 r20, defpackage.yl4 r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = 1
            zpf r3 = r0.v0
            defpackage.n79.o(r3)
            int r3 = defpackage.v0g.a
            r3 = r1
            hf4 r3 = (defpackage.hf4) r3
            long r3 = r3.o
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x0029
            r3 = r1
            hf4 r3 = (defpackage.hf4) r3
            boolean r3 = r0.b(r3)
            if (r3 == 0) goto L_0x0021
            goto L_0x0029
        L_0x0021:
            java.lang.String r0 = "Could not find AMR header."
            r1 = 0
            androidx.media3.common.ParserException r0 = androidx.media3.common.ParserException.a(r0, r1)
            throw r0
        L_0x0029:
            boolean r3 = r0.x0
            if (r3 != 0) goto L_0x005c
            r0.x0 = r2
            boolean r3 = r0.c
            if (r3 == 0) goto L_0x0036
            java.lang.String r4 = "audio/amr-wb"
            goto L_0x0038
        L_0x0036:
            java.lang.String r4 = "audio/3gpp"
        L_0x0038:
            if (r3 == 0) goto L_0x003d
            r3 = 16000(0x3e80, float:2.2421E-41)
            goto L_0x003f
        L_0x003d:
            r3 = 8000(0x1f40, float:1.121E-41)
        L_0x003f:
            zpf r5 = r0.v0
            ba6 r6 = new ba6
            r6.<init>()
            java.lang.String r4 = defpackage.vq9.l(r4)
            r6.m = r4
            int r4 = C0
            r6.n = r4
            r6.A = r2
            r6.B = r3
            ea6 r3 = new ea6
            r3.<init>(r6)
            r5.e(r3)
        L_0x005c:
            int r3 = r0.w
            r4 = 20000(0x4e20, double:9.8813E-320)
            r6 = 0
            r7 = -1
            if (r3 != 0) goto L_0x0088
            r3 = r1
            hf4 r3 = (defpackage.hf4) r3     // Catch:{ EOFException -> 0x0086 }
            int r3 = r0.a(r3)     // Catch:{ EOFException -> 0x0086 }
            r0.v = r3     // Catch:{ EOFException -> 0x0086 }
            r0.w = r3
            int r8 = r0.z
            if (r8 != r7) goto L_0x007c
            r8 = r1
            hf4 r8 = (defpackage.hf4) r8
            long r8 = r8.o
            r0.y = r8
            r0.z = r3
        L_0x007c:
            int r8 = r0.z
            if (r8 != r3) goto L_0x0088
            int r3 = r0.X
            int r3 = r3 + r2
            r0.X = r3
            goto L_0x0088
        L_0x0086:
            r3 = r7
            goto L_0x00b1
        L_0x0088:
            zpf r3 = r0.v0
            int r8 = r0.w
            int r3 = r3.c(r1, r8, r2)
            if (r3 != r7) goto L_0x0093
            goto L_0x0086
        L_0x0093:
            int r8 = r0.w
            int r8 = r8 - r3
            r0.w = r8
            if (r8 <= 0) goto L_0x009c
        L_0x009a:
            r3 = r6
            goto L_0x00b1
        L_0x009c:
            zpf r9 = r0.v0
            long r10 = r0.Y
            long r12 = r0.o
            long r10 = r10 + r12
            int r13 = r0.v
            r12 = 1
            r14 = 0
            r15 = 0
            r9.a(r10, r12, r13, r14, r15)
            long r8 = r0.o
            long r8 = r8 + r4
            r0.o = r8
            goto L_0x009a
        L_0x00b1:
            hf4 r1 = (defpackage.hf4) r1
            boolean r8 = r0.x
            if (r8 == 0) goto L_0x00b8
            goto L_0x0110
        L_0x00b8:
            int r8 = r0.b
            r9 = r8 & 1
            if (r9 == 0) goto L_0x00fd
            r9 = -1
            long r12 = r1.c
            int r1 = (r12 > r9 ? 1 : (r12 == r9 ? 0 : -1))
            if (r1 == 0) goto L_0x00fd
            int r1 = r0.z
            if (r1 == r7) goto L_0x00cf
            int r9 = r0.v
            if (r1 == r9) goto L_0x00cf
            goto L_0x00fd
        L_0x00cf:
            int r9 = r0.X
            r10 = 20
            if (r9 >= r10) goto L_0x00d7
            if (r3 != r7) goto L_0x0110
        L_0x00d7:
            r7 = r8 & 2
            if (r7 == 0) goto L_0x00de
            r18 = r2
            goto L_0x00e0
        L_0x00de:
            r18 = r6
        L_0x00e0:
            long r6 = (long) r1
            r8 = 8000000(0x7a1200, double:3.952525E-317)
            long r6 = r6 * r8
            long r6 = r6 / r4
            int r4 = (int) r6
            ui3 r5 = new ui3
            long r14 = r0.y
            r11 = r5
            r16 = r4
            r17 = r1
            r11.<init>(r12, r14, r16, r17, r18)
            r0.w0 = r5
            xf5 r1 = r0.Z
            r1.M(r5)
            r0.x = r2
            goto L_0x0110
        L_0x00fd:
            me0 r1 = new me0
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r1.<init>(r4)
            r0.w0 = r1
            xf5 r4 = r0.Z
            r4.M(r1)
            r0.x = r2
        L_0x0110:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ld.g(vf5, yl4):int");
    }

    public final boolean n(vf5 vf5) {
        return b((hf4) vf5);
    }

    public final void release() {
    }
}
