package defpackage;

import android.content.Context;
import android.media.MediaCodecInfo;
import android.media.MediaFormat;
import android.view.Surface;
import androidx.media3.transformer.ExportException;
import java.util.ArrayList;

/* renamed from: cf4  reason: default package */
public final class cf4 implements f43 {
    public final Context a;
    public final rx0 b;
    public f5g c;
    public boolean o;
    public final int v;

    public cf4(Context context) {
        this.a = context.getApplicationContext();
        this.b = rx0.v;
        this.c = f5g.i;
        this.o = true;
        this.v = -2000;
    }

    public static ExportException a(ea6 ea6, String str) {
        return ExportException.c(new IllegalArgumentException(str), 4003, new ci3(ea6.toString(), (String) null, vq9.k(ea6.n), false));
    }

    public static tb7 b(tb7 tb7, df4 df4) {
        ArrayList arrayList = new ArrayList(tb7.size());
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < tb7.size(); i2++) {
            MediaCodecInfo mediaCodecInfo = (MediaCodecInfo) tb7.get(i2);
            int a2 = df4.a(mediaCodecInfo);
            if (a2 != Integer.MAX_VALUE) {
                if (a2 < i) {
                    arrayList.clear();
                    arrayList.add(mediaCodecInfo);
                    i = a2;
                } else if (a2 == i) {
                    arrayList.add(mediaCodecInfo);
                }
            }
        }
        return tb7.p(arrayList);
    }

    public boolean l() {
        return !this.c.equals(f5g.i);
    }

    public md4 m(ea6 ea6) {
        if (ea6.i == -1) {
            ba6 a2 = ea6.a();
            a2.b(131072);
            ea6 = a2.a();
        }
        ea6 ea62 = ea6;
        String str = ea62.n;
        n79.j(str);
        MediaFormat i = hsg.i(ea62);
        tb7 f = k65.f(str);
        if (!f.isEmpty()) {
            return new md4(this.a, ea62, i, ((MediaCodecInfo) f.get(0)).getName(), false, (Surface) null);
        }
        throw a(ea62, "No audio media codec found");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00cf, code lost:
        if (r3.isEmpty() != false) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x021c, code lost:
        if (r15.equals("TC77") == false) goto L_0x0220;
     */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x032e  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0155  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.md4 u(defpackage.ea6 r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            float r2 = r1.v
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            r3 = 30
            if (r2 == 0) goto L_0x001c
            int r2 = defpackage.v0g.a
            if (r2 >= r3) goto L_0x0028
            java.lang.String r2 = defpackage.v0g.b
            java.lang.String r4 = "joyeuse"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x0028
        L_0x001c:
            ba6 r1 = r19.a()
            r2 = 1106247680(0x41f00000, float:30.0)
            r1.u = r2
            ea6 r1 = r1.a()
        L_0x0028:
            r2 = 0
            r5 = -1
            int r6 = r1.t
            if (r6 == r5) goto L_0x0030
            r7 = 1
            goto L_0x0031
        L_0x0030:
            r7 = r2
        L_0x0031:
            defpackage.n79.g(r7)
            int r7 = r1.u
            if (r7 == r5) goto L_0x003a
            r8 = 1
            goto L_0x003b
        L_0x003a:
            r8 = r2
        L_0x003b:
            defpackage.n79.g(r8)
            if (r7 > r6) goto L_0x0042
            r8 = 1
            goto L_0x0043
        L_0x0042:
            r8 = r2
        L_0x0043:
            defpackage.n79.g(r8)
            int r8 = r1.w
            if (r8 != 0) goto L_0x004c
            r8 = 1
            goto L_0x004d
        L_0x004c:
            r8 = r2
        L_0x004d:
            defpackage.n79.g(r8)
            java.lang.String r8 = r1.n
            r8.getClass()
            rx0 r9 = r0.b
            defpackage.n79.o(r9)
            tb7 r9 = r9.f(r8)
            boolean r10 = r9.isEmpty()
            r11 = 4611686018427387904(0x4000000000000000, double:2.0)
            r13 = 4589708452245819884(0x3fb1eb851eb851ec, double:0.07)
            boolean r15 = r0.o
            r16 = 0
            if (r10 == 0) goto L_0x0073
        L_0x006f:
            r6 = r16
            goto L_0x0153
        L_0x0073:
            f5g r10 = r0.c
            if (r15 != 0) goto L_0x0084
            l15 r6 = new l15
            java.lang.Object r7 = r9.get(r2)
            android.media.MediaCodecInfo r7 = (android.media.MediaCodecInfo) r7
            r6.<init>(r7, r1, r10)
            goto L_0x0153
        L_0x0084:
            pb4 r3 = new pb4
            r3.<init>(r8, r6, r7)
            tb7 r3 = b(r9, r3)
            boolean r9 = r3.isEmpty()
            if (r9 == 0) goto L_0x0094
            goto L_0x006f
        L_0x0094:
            java.lang.Object r9 = r3.get(r2)
            android.media.MediaCodecInfo r9 = (android.media.MediaCodecInfo) r9
            android.util.Size r6 = defpackage.k65.h(r9, r8, r6, r7)
            defpackage.n79.j(r6)
            boolean r7 = r10.h
            float r9 = r1.v
            if (r7 != 0) goto L_0x00d2
            int r7 = r10.a
            if (r7 == r5) goto L_0x00ac
            goto L_0x00c1
        L_0x00ac:
            int r7 = r1.g
            if (r7 == r5) goto L_0x00b1
            goto L_0x00c1
        L_0x00b1:
            int r7 = r6.getWidth()
            int r17 = r6.getHeight()
            int r7 = r7 * r17
            float r7 = (float) r7
            float r7 = r7 * r9
            double r4 = (double) r7
            double r4 = r4 * r13
            double r4 = r4 * r11
            int r7 = (int) r4
        L_0x00c1:
            bf4 r4 = new bf4
            r5 = 0
            r4.<init>(r8, r7, r5)
            tb7 r3 = b(r3, r4)
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L_0x00d3
            goto L_0x006f
        L_0x00d2:
            r7 = -1
        L_0x00d3:
            bf4 r4 = new bf4
            int r5 = r10.b
            r11 = 1
            r4.<init>(r8, r5, r11)
            tb7 r3 = b(r3, r4)
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L_0x00e6
            goto L_0x006f
        L_0x00e6:
            e5g r4 = r10.a()
            ba6 r5 = r1.a()
            r5.d(r8)
            int r11 = r6.getWidth()
            r5.e(r11)
            int r11 = r6.getHeight()
            r5.c(r11)
            java.lang.Object r3 = r3.get(r2)
            android.media.MediaCodecInfo r3 = (android.media.MediaCodecInfo) r3
            boolean r11 = r10.h
            if (r11 == 0) goto L_0x011c
            java.lang.String r7 = r3.getName()
            int r11 = r6.getWidth()
            int r6 = r6.getHeight()
            int r7 = defpackage.te8.j(r7, r11, r6, r9)
            r4.b()
        L_0x011c:
            android.util.Range r6 = defpackage.k65.d(r3, r8)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.Comparable r6 = r6.clamp(r7)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r4.c(r6)
            r5.b(r6)
            int r6 = r10.c
            r7 = -1
            if (r6 == r7) goto L_0x0143
            int r9 = r10.d
            if (r9 == r7) goto L_0x0143
            int r6 = defpackage.k65.b(r3, r8, r6)
            if (r9 <= r6) goto L_0x0146
        L_0x0143:
            r4.d()
        L_0x0146:
            l15 r6 = new l15
            ea6 r5 = r5.a()
            f5g r4 = r4.a()
            r6.<init>(r3, r5, r4)
        L_0x0153:
            if (r6 == 0) goto L_0x032e
            java.lang.Object r3 = r6.b
            ea6 r3 = (defpackage.ea6) r3
            java.lang.String r4 = r3.n
            defpackage.n79.j(r4)
            java.lang.Object r5 = r6.a
            android.media.MediaCodecInfo r5 = (android.media.MediaCodecInfo) r5
            java.lang.Object r6 = r6.c
            f5g r6 = (defpackage.f5g) r6
            if (r15 == 0) goto L_0x016b
            int r7 = r6.a
            goto L_0x0192
        L_0x016b:
            int r7 = r6.a
            r8 = -1
            if (r7 == r8) goto L_0x0171
            goto L_0x0192
        L_0x0171:
            boolean r7 = r6.h
            float r9 = r3.v
            int r10 = r3.u
            int r11 = r3.t
            if (r7 == 0) goto L_0x0184
            java.lang.String r7 = r5.getName()
            int r7 = defpackage.te8.j(r7, r11, r10, r9)
            goto L_0x0192
        L_0x0184:
            int r7 = r3.g
            if (r7 == r8) goto L_0x0189
            goto L_0x0192
        L_0x0189:
            int r11 = r11 * r10
            float r7 = (float) r11
            float r7 = r7 * r9
            double r7 = (double) r7
            double r7 = r7 * r13
            r9 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r7 = r7 * r9
            int r7 = (int) r7
        L_0x0192:
            ba6 r3 = r3.a()
            r3.b(r7)
            ea6 r10 = r3.a()
            android.media.MediaFormat r11 = defpackage.hsg.i(r10)
            int r3 = r6.b
            java.lang.String r7 = "bitrate-mode"
            r11.setInteger(r7, r3)
            float r3 = r10.v
            int r3 = java.lang.Math.round(r3)
            java.lang.String r7 = "frame-rate"
            r11.setInteger(r7, r3)
            java.lang.String r3 = "level"
            java.lang.String r7 = "profile"
            r8 = 23
            int r9 = r6.c
            r12 = -1
            if (r9 == r12) goto L_0x01cc
            int r13 = r6.d
            if (r13 == r12) goto L_0x01cc
            int r12 = defpackage.v0g.a
            if (r12 < r8) goto L_0x01cc
            r11.setInteger(r7, r9)
            r11.setInteger(r3, r13)
        L_0x01cc:
            java.lang.String r9 = "video/avc"
            boolean r12 = r4.equals(r9)
            r13 = 26
            m53 r14 = r1.A
            if (r12 == 0) goto L_0x024d
            int r12 = defpackage.v0g.a
            r15 = 29
            r8 = 8
            if (r12 < r15) goto L_0x0206
            if (r14 == 0) goto L_0x01f8
            int r12 = r14.c
            k0d r12 = defpackage.k65.c(r12, r9)
            boolean r15 = r12.isEmpty()
            if (r15 != 0) goto L_0x01f8
            java.lang.Object r8 = r12.get(r2)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
        L_0x01f8:
            int r9 = defpackage.k65.b(r5, r9, r8)
            r12 = -1
            if (r9 == r12) goto L_0x024d
            r11.setInteger(r7, r8)
            r11.setInteger(r3, r9)
            goto L_0x024d
        L_0x0206:
            if (r12 < r13) goto L_0x021e
            r15 = 27
            if (r12 != r15) goto L_0x0220
            java.lang.String r15 = defpackage.v0g.b
            java.lang.String r2 = "ASUS_X00T_3"
            boolean r2 = r15.equals(r2)
            if (r2 != 0) goto L_0x021e
            java.lang.String r2 = "TC77"
            boolean r2 = r15.equals(r2)
            if (r2 == 0) goto L_0x0220
        L_0x021e:
            r8 = 1
            goto L_0x0236
        L_0x0220:
            int r2 = defpackage.k65.b(r5, r9, r8)
            r9 = -1
            if (r2 == r9) goto L_0x0234
            r11.setInteger(r7, r8)
            r11.setInteger(r3, r2)
            java.lang.String r2 = "latency"
            r8 = 1
            r11.setInteger(r2, r8)
            goto L_0x024d
        L_0x0234:
            r8 = 1
            goto L_0x024d
        L_0x0236:
            r2 = 24
            if (r12 < r2) goto L_0x024d
            int r2 = defpackage.k65.b(r5, r9, r8)
            r9 = -1
            if (r2 == r9) goto L_0x0243
            r9 = r8
            goto L_0x0244
        L_0x0243:
            r9 = 0
        L_0x0244:
            defpackage.n79.n(r9)
            r11.setInteger(r7, r8)
            r11.setInteger(r3, r2)
        L_0x024d:
            int r2 = defpackage.v0g.a
            java.lang.String r3 = "color-format"
            r7 = 31
            if (r2 < r7) goto L_0x0277
            boolean r8 = defpackage.m53.g(r14)
            if (r8 == 0) goto L_0x0277
            tb7 r4 = defpackage.k65.e(r5, r4)
            r8 = 2130750114(0x7f00aaa2, float:1.7102716E38)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
            boolean r4 = r4.contains(r9)
            if (r4 == 0) goto L_0x0270
            r11.setInteger(r3, r8)
            goto L_0x027d
        L_0x0270:
            java.lang.String r0 = "Encoding HDR is not supported on this device."
            androidx.media3.transformer.ExportException r0 = a(r1, r0)
            throw r0
        L_0x0277:
            r1 = 2130708361(0x7f000789, float:1.701803E38)
            r11.setInteger(r3, r1)
        L_0x027d:
            java.lang.String r1 = "i-frame-interval"
            r3 = 25
            float r4 = r6.e
            if (r2 < r3) goto L_0x028b
            r11.setFloat(r1, r4)
        L_0x0288:
            r1 = 23
            goto L_0x02a2
        L_0x028b:
            r8 = 0
            int r8 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r8 <= 0) goto L_0x0298
            r8 = 1065353216(0x3f800000, float:1.0)
            int r8 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r8 > 0) goto L_0x0298
            r8 = 1
            goto L_0x029e
        L_0x0298:
            double r8 = (double) r4
            double r8 = java.lang.Math.floor(r8)
            int r8 = (int) r8
        L_0x029e:
            r11.setInteger(r1, r8)
            goto L_0x0288
        L_0x02a2:
            if (r2 < r1) goto L_0x030e
            java.lang.String r1 = "operating-rate"
            java.lang.String r4 = "priority"
            int r8 = r6.g
            int r6 = r6.f
            r9 = -1
            if (r6 != r9) goto L_0x0303
            if (r8 != r9) goto L_0x0303
            if (r2 >= r3) goto L_0x02b4
            goto L_0x030e
        L_0x02b4:
            r3 = 1
            r11.setInteger(r4, r3)
            if (r2 != r13) goto L_0x02c0
            r3 = 30
            r11.setInteger(r1, r3)
            goto L_0x030e
        L_0x02c0:
            if (r2 < r7) goto L_0x02fc
            r3 = 34
            if (r2 > r3) goto L_0x02fc
            java.lang.String r3 = android.os.Build.SOC_MODEL
            java.lang.String r4 = "SM8550"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x02f6
            java.lang.String r3 = android.os.Build.SOC_MODEL
            java.lang.String r4 = "T612"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x02f6
            java.lang.String r3 = android.os.Build.SOC_MODEL
            java.lang.String r4 = "SM7450"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x02f6
            java.lang.String r3 = android.os.Build.SOC_MODEL
            java.lang.String r4 = "SM6450"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x02fc
        L_0x02f6:
            r3 = 1000(0x3e8, float:1.401E-42)
            r11.setInteger(r1, r3)
            goto L_0x030e
        L_0x02fc:
            r3 = 2147483647(0x7fffffff, float:NaN)
            r11.setInteger(r1, r3)
            goto L_0x030e
        L_0x0303:
            r3 = r9
            if (r6 == r3) goto L_0x0309
            r11.setInteger(r1, r6)
        L_0x0309:
            if (r8 == r3) goto L_0x030e
            r11.setInteger(r4, r8)
        L_0x030e:
            r1 = 35
            if (r2 < r1) goto L_0x031f
            int r1 = r0.v
            int r1 = -r1
            r2 = 0
            int r1 = java.lang.Math.max(r2, r1)
            java.lang.String r2 = "importance"
            r11.setInteger(r2, r1)
        L_0x031f:
            md4 r1 = new md4
            java.lang.String r12 = r5.getName()
            android.content.Context r9 = r0.a
            r13 = 0
            r14 = 0
            r8 = r1
            r8.<init>(r9, r10, r11, r12, r13, r14)
            return r1
        L_0x032e:
            java.lang.String r0 = "The requested video encoding format is not supported."
            androidx.media3.transformer.ExportException r0 = a(r1, r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cf4.u(ea6):md4");
    }

    public cf4(cf4 cf4) {
        this.a = cf4.a;
        this.b = cf4.b;
        this.c = cf4.c;
        this.o = cf4.o;
        this.v = cf4.v;
    }
}
