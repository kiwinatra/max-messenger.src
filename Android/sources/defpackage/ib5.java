package defpackage;

import android.media.MediaCodec;
import java.util.ArrayList;

/* renamed from: ib5  reason: default package */
public final class ib5 extends hb5 {
    public final boolean N0;
    public final e43 O0;
    public final int P0;
    public final ArrayList Q0 = new ArrayList();
    public god R0;
    public int S0;

    public ib5(boolean z, o5h o5h, int i, jz2 jz2, ut utVar) {
        super(2, jz2, utVar);
        this.N0 = z;
        this.O0 = o5h;
        this.P0 = i;
    }

    public final boolean G() {
        if (this.D0.d()) {
            this.C0.e();
            this.E0 = true;
            return false;
        }
        md4 md4 = this.D0;
        MediaCodec.BufferInfo bufferInfo = md4.f(false) ? md4.a : null;
        if (bufferInfo == null) {
            return false;
        }
        long j = bufferInfo.presentationTimeUs;
        long j2 = j - this.A0;
        if (j2 >= 0) {
            ArrayList arrayList = this.Q0;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                if (((Long) arrayList.get(i)).longValue() == j) {
                    arrayList.remove(i);
                } else {
                    i++;
                }
            }
            if (this.C0.c() == this.S0 || !this.C0.h(j2)) {
                return false;
            }
            this.D0.j(j2, true);
            return true;
        }
        this.D0.i();
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0010, code lost:
        if (r3.P0 == 1) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void H(defpackage.ea6 r4) {
        /*
            r3 = this;
            bcd r0 = r3.C0
            defpackage.n79.o(r0)
            m53 r0 = r4.A
            boolean r0 = defpackage.m53.g(r0)
            if (r0 == 0) goto L_0x0013
            int r0 = r3.P0
            r1 = 1
            if (r0 != r1) goto L_0x0013
            goto L_0x0014
        L_0x0013:
            r1 = 0
        L_0x0014:
            bcd r0 = r3.C0
            android.view.Surface r0 = r0.a()
            r0.getClass()
            e43 r2 = r3.O0
            md4 r4 = r2.k(r4, r0, r1)
            r3.D0 = r4
            int r4 = r4.f
            r3.S0 = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ib5.H(ea6):void");
    }

    public final void I(ba4 ba4) {
        long j = ba4.x;
        if (j < this.Z) {
            this.Q0.add(Long.valueOf(j));
        }
    }

    public final void K(ea6 ea6) {
        if (this.N0) {
            this.R0 = new god(ea6);
        }
    }

    public final ea6 L(ea6 ea6) {
        if (this.P0 != 3 || !m53.g(ea6.A)) {
            return ea6;
        }
        ba6 a = ea6.a();
        a.z = m53.h;
        return a.a();
    }

    public final ea6 M(ea6 ea6) {
        m53 m53 = ea6.A;
        if (m53 == null || !m53.e()) {
            m53 = m53.h;
        }
        if (this.P0 == 1 && m53.g(m53)) {
            m53 = m53.h;
        }
        ba6 a = ea6.a();
        a.z = m53;
        return new ea6(a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x012c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean P(defpackage.ba4 r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = 4
            boolean r3 = r1.h(r2)
            r4 = 0
            if (r3 == 0) goto L_0x000d
            return r4
        L_0x000d:
            java.nio.ByteBuffer r3 = r1.v
            r3.getClass()
            god r5 = r0.R0
            r6 = 1
            if (r5 == 0) goto L_0x0136
            long r7 = r1.x
            long r9 = r0.B0
            long r7 = r7 - r9
            hee r9 = r5.b
            if (r9 != 0) goto L_0x0024
            r5.k = r7
            goto L_0x0111
        L_0x0024:
            int r9 = r3.position()
            int r10 = r9 + 4
            r3.position(r10)
            byte[] r10 = r5.a
            r3.get(r10, r4, r2)
            java.lang.String r2 = "video/avc"
            java.lang.String r11 = r5.c
            boolean r2 = r11.equals(r2)
            if (r2 == 0) goto L_0x0061
            byte r2 = r10[r4]
            r2 = r2 & 31
            byte r11 = r10[r6]
            r11 = r11 & 255(0xff, float:3.57E-43)
            int r11 = r11 >> 7
            if (r11 != r6) goto L_0x004a
            r11 = r6
            goto L_0x004b
        L_0x004a:
            r11 = r4
        L_0x004b:
            r12 = 14
            if (r2 != r12) goto L_0x0053
            if (r11 == 0) goto L_0x0053
            r2 = r6
            goto L_0x0054
        L_0x0053:
            r2 = r4
        L_0x0054:
            java.lang.String r11 = "Missing SVC extension prefix NAL unit."
            defpackage.n79.m(r11, r2)
            r2 = 3
            byte r2 = r10[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 >> 5
            goto L_0x006e
        L_0x0061:
            java.lang.String r2 = "video/hevc"
            boolean r2 = r11.equals(r2)
            if (r2 == 0) goto L_0x0130
            byte r2 = r10[r6]
            r2 = r2 & 7
            int r2 = r2 - r6
        L_0x006e:
            fod r10 = r5.i
            if (r10 == 0) goto L_0x007c
            long r11 = r10.b
            int r11 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r11 < 0) goto L_0x007c
            r5.a()
            goto L_0x006e
        L_0x007c:
            if (r10 == 0) goto L_0x0089
            long r10 = r10.a
            int r10 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r10 < 0) goto L_0x0089
            r5.a()
        L_0x0087:
            r4 = r5
            goto L_0x00a7
        L_0x0089:
            fod r10 = r5.h
            if (r10 == 0) goto L_0x0087
            long r11 = r10.b
            int r13 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r13 < 0) goto L_0x0087
            long r13 = r5.j
            r16 = r5
            long r4 = r10.a
            long r11 = r11 - r4
            int r4 = r10.c
            int r4 = r4 - r6
            long r4 = (long) r4
            long r11 = r11 * r4
            long r11 = r11 + r13
            r4 = r16
            r4.j = r11
            r5 = 0
            r4.h = r5
        L_0x00a7:
            fod r5 = r4.h
            if (r5 == 0) goto L_0x00ae
            int r5 = r5.d
            goto L_0x00b0
        L_0x00ae:
            int r5 = r4.g
        L_0x00b0:
            r10 = 30
            if (r2 <= r5) goto L_0x00ed
            fod r5 = r4.i
            if (r5 == 0) goto L_0x00eb
            int r12 = r5.d
            if (r2 < r12) goto L_0x00bd
            goto L_0x00eb
        L_0x00bd:
            long r13 = r5.a
            long r13 = r13 - r7
            long r13 = r13 * r10
            r16 = 1000000(0xf4240, double:4.940656E-318)
            long r13 = r13 / r16
            int r5 = r4.f
            int r12 = r5 - r12
            int r12 = r6 << r12
            int r12 = -r12
            float r12 = (float) r12
            r16 = 1055286886(0x3ee66666, float:0.45)
            float r12 = r12 + r16
            r15 = r6
        L_0x00d4:
            fod r10 = r4.i
            int r10 = r10.d
            if (r15 >= r10) goto L_0x00eb
            float r10 = (float) r13
            int r11 = r5 - r15
            int r11 = r6 << r11
            float r11 = (float) r11
            float r11 = r11 + r12
            int r10 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r10 >= 0) goto L_0x00eb
            if (r2 > r15) goto L_0x00e8
            goto L_0x00ed
        L_0x00e8:
            int r15 = r15 + 1
            goto L_0x00d4
        L_0x00eb:
            r2 = 0
            goto L_0x00ee
        L_0x00ed:
            r2 = r6
        L_0x00ee:
            long r10 = r4.j
            long r10 = r10 + r7
            fod r5 = r4.h
            if (r5 == 0) goto L_0x00fe
            long r12 = r5.a
            long r7 = r7 - r12
            int r5 = r5.c
            int r5 = r5 - r6
            long r12 = (long) r5
            long r7 = r7 * r12
            long r10 = r10 + r7
        L_0x00fe:
            r7 = 30
            long r10 = r10 * r7
            float r5 = (float) r10
            float r7 = r4.e
            float r5 = r5 / r7
            int r5 = java.lang.Math.round(r5)
            long r7 = (long) r5
            r4.k = r7
            if (r2 == 0) goto L_0x012c
            r3.position(r9)
        L_0x0111:
            long r2 = r0.B0
            god r4 = r0.R0
            long r7 = r4.k
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r5 == 0) goto L_0x0122
            r5 = r6
            goto L_0x0123
        L_0x0122:
            r5 = 0
        L_0x0123:
            defpackage.n79.n(r5)
            long r4 = r4.k
            long r2 = r2 + r4
            r1.x = r2
            goto L_0x0136
        L_0x012c:
            r3.clear()
            return r6
        L_0x0130:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x0136:
            md4 r2 = r0.D0
            if (r2 != 0) goto L_0x014b
            long r2 = r1.x
            long r4 = r0.A0
            long r2 = r2 - r4
            r1.x = r2
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x014b
            r19.z()
            return r6
        L_0x014b:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ib5.P(ba4):boolean");
    }

    public final String l() {
        return "ExoAssetLoaderVideoRenderer";
    }
}
