package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.IntCompanionObject;
import org.apache.http.HttpStatus;

/* renamed from: fy1  reason: default package */
public final class fy1 extends sy1 {
    public static final int[] A = {0, 4, 8, 12, 16, 20, 24, 28};
    public static final int[] B = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};
    public static final int[] C = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, HttpStatus.SC_SWITCHING_PROTOCOLS, HttpStatus.SC_PROCESSING, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};
    public static final int[] D = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};
    public static final int[] E = {193, HttpStatus.SC_CREATED, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, HttpStatus.SC_ACCEPTED, HttpStatus.SC_NON_AUTHORITATIVE_INFORMATION, 235, HttpStatus.SC_PARTIAL_CONTENT, HttpStatus.SC_MULTI_STATUS, 239, 212, 217, 249, 219, 171, 187};
    public static final int[] F = {195, 227, HttpStatus.SC_RESET_CONTENT, HttpStatus.SC_NO_CONTENT, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};
    public static final boolean[] G = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};
    public static final int[] z = {11, 1, 3, 12, 14, 5, 7, 9};
    public final l8b h = new l8b();
    public final int i;
    public final int j;
    public final int k;
    public final long l = 16000000;
    public final ArrayList m = new ArrayList();
    public dy1 n = new dy1(0, 4);
    public List o;
    public List p;
    public int q;
    public int r;
    public boolean s;
    public boolean t;
    public byte u;
    public byte v;
    public int w = 0;
    public boolean x;
    public long y;

    public fy1(String str, int i2) {
        this.i = "application/x-mp4-cea-608".equals(str) ? 2 : 3;
        if (i2 == 1) {
            this.k = 0;
            this.j = 0;
        } else if (i2 == 2) {
            this.k = 1;
            this.j = 0;
        } else if (i2 == 3) {
            this.k = 0;
            this.j = 1;
        } else if (i2 != 4) {
            i8b.V("Invalid channel. Defaulting to CC1.");
            this.k = 0;
            this.j = 0;
        } else {
            this.k = 1;
            this.j = 1;
        }
        l(0);
        k();
        this.x = true;
        this.y = -9223372036854775807L;
    }

    public final b8d e() {
        List list = this.o;
        this.p = list;
        list.getClass();
        return new b8d((Object) list);
    }

    public final void flush() {
        super.flush();
        this.o = null;
        this.p = null;
        l(0);
        this.r = 4;
        this.n.h = 4;
        k();
        this.s = false;
        this.t = false;
        this.u = 0;
        this.v = 0;
        this.w = 0;
        this.x = true;
        this.y = -9223372036854775807L;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0085  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g(defpackage.oy1 r15) {
        /*
            r14 = this;
            java.nio.ByteBuffer r15 = r15.v
            r15.getClass()
            byte[] r0 = r15.array()
            int r15 = r15.limit()
            l8b r1 = r14.h
            r1.E(r15, r0)
            r15 = 0
            r0 = r15
        L_0x0014:
            int r2 = r1.a()
            r3 = 3
            r4 = 1
            int r5 = r14.i
            if (r2 < r5) goto L_0x026c
            r2 = 2
            if (r5 != r2) goto L_0x0023
            r5 = -4
            goto L_0x0027
        L_0x0023:
            int r5 = r1.u()
        L_0x0027:
            int r6 = r1.u()
            int r7 = r1.u()
            r8 = r5 & 2
            if (r8 == 0) goto L_0x0034
            goto L_0x0014
        L_0x0034:
            r8 = r5 & 1
            int r9 = r14.j
            if (r8 == r9) goto L_0x003b
            goto L_0x0014
        L_0x003b:
            r8 = r6 & 127(0x7f, float:1.78E-43)
            byte r8 = (byte) r8
            r9 = r7 & 127(0x7f, float:1.78E-43)
            byte r9 = (byte) r9
            if (r8 != 0) goto L_0x0046
            if (r9 != 0) goto L_0x0046
            goto L_0x0014
        L_0x0046:
            boolean r10 = r14.s
            r5 = r5 & 4
            r11 = 4
            if (r5 != r11) goto L_0x0059
            boolean[] r5 = G
            boolean r6 = r5[r6]
            if (r6 == 0) goto L_0x0059
            boolean r5 = r5[r7]
            if (r5 == 0) goto L_0x0059
            r5 = r4
            goto L_0x005a
        L_0x0059:
            r5 = r15
        L_0x005a:
            r14.s = r5
            r6 = 16
            if (r5 == 0) goto L_0x007a
            r7 = r8 & 240(0xf0, float:3.36E-43)
            if (r7 != r6) goto L_0x007a
            boolean r7 = r14.t
            if (r7 == 0) goto L_0x0073
            byte r7 = r14.u
            if (r7 != r8) goto L_0x0073
            byte r7 = r14.v
            if (r7 != r9) goto L_0x0073
            r14.t = r15
            goto L_0x0014
        L_0x0073:
            r14.t = r4
            r14.u = r8
            r14.v = r9
            goto L_0x007c
        L_0x007a:
            r14.t = r15
        L_0x007c:
            if (r5 != 0) goto L_0x0085
            if (r10 == 0) goto L_0x0014
            r14.k()
        L_0x0083:
            r0 = r4
            goto L_0x0014
        L_0x0085:
            r5 = 32
            r7 = 20
            if (r4 > r8) goto L_0x0092
            r10 = 15
            if (r8 > r10) goto L_0x0092
            r14.x = r15
            goto L_0x00a8
        L_0x0092:
            r10 = r8 & 246(0xf6, float:3.45E-43)
            if (r10 != r7) goto L_0x00a8
            if (r9 == r5) goto L_0x00a6
            r10 = 47
            if (r9 == r10) goto L_0x00a6
            switch(r9) {
                case 37: goto L_0x00a6;
                case 38: goto L_0x00a6;
                case 39: goto L_0x00a6;
                default: goto L_0x009f;
            }
        L_0x009f:
            switch(r9) {
                case 41: goto L_0x00a6;
                case 42: goto L_0x00a3;
                case 43: goto L_0x00a3;
                default: goto L_0x00a2;
            }
        L_0x00a2:
            goto L_0x00a8
        L_0x00a3:
            r14.x = r15
            goto L_0x00a8
        L_0x00a6:
            r14.x = r4
        L_0x00a8:
            boolean r10 = r14.x
            if (r10 != 0) goto L_0x00ae
            goto L_0x0014
        L_0x00ae:
            r10 = r8 & 224(0xe0, float:3.14E-43)
            if (r10 != 0) goto L_0x00b7
            int r12 = r8 >> 3
            r12 = r12 & r4
            r14.w = r12
        L_0x00b7:
            int r12 = r14.w
            int r13 = r14.k
            if (r12 != r13) goto L_0x0014
            if (r10 != 0) goto L_0x024e
            r0 = r8 & 247(0xf7, float:3.46E-43)
            r10 = 17
            if (r0 != r10) goto L_0x00d8
            r12 = r9 & 240(0xf0, float:3.36E-43)
            r13 = 48
            if (r12 != r13) goto L_0x00d8
            dy1 r0 = r14.n
            r2 = r9 & 15
            int[] r3 = D
            r2 = r3[r2]
            char r2 = (char) r2
            r0.a(r2)
            goto L_0x0083
        L_0x00d8:
            r12 = r8 & 246(0xf6, float:3.45E-43)
            r13 = 18
            if (r12 != r13) goto L_0x0100
            r13 = r9 & 224(0xe0, float:3.14E-43)
            if (r13 != r5) goto L_0x0100
            dy1 r0 = r14.n
            r0.b()
            dy1 r0 = r14.n
            r2 = r8 & 1
            if (r2 != 0) goto L_0x00f5
            r2 = r9 & 31
            int[] r3 = E
            r2 = r3[r2]
        L_0x00f3:
            char r2 = (char) r2
            goto L_0x00fc
        L_0x00f5:
            r2 = r9 & 31
            int[] r3 = F
            r2 = r3[r2]
            goto L_0x00f3
        L_0x00fc:
            r0.a(r2)
            goto L_0x0083
        L_0x0100:
            if (r0 != r10) goto L_0x012a
            r10 = r9 & 240(0xf0, float:3.36E-43)
            if (r10 != r5) goto L_0x012a
            dy1 r0 = r14.n
            r0.a(r5)
            r0 = r9 & 1
            if (r0 != r4) goto L_0x0111
            r0 = r4
            goto L_0x0112
        L_0x0111:
            r0 = r15
        L_0x0112:
            int r2 = r9 >> 1
            r2 = r2 & 7
            dy1 r3 = r14.n
            java.util.ArrayList r5 = r3.a
            by1 r6 = new by1
            java.lang.StringBuilder r3 = r3.c
            int r3 = r3.length()
            r6.<init>(r2, r3, r0)
            r5.add(r6)
            goto L_0x0083
        L_0x012a:
            r10 = r8 & 240(0xf0, float:3.36E-43)
            if (r10 != r6) goto L_0x019a
            r10 = r9 & 192(0xc0, float:2.69E-43)
            r13 = 64
            if (r10 != r13) goto L_0x019a
            int[] r0 = z
            r2 = r8 & 7
            r0 = r0[r2]
            r2 = r9 & 32
            if (r2 == 0) goto L_0x0140
            int r0 = r0 + 1
        L_0x0140:
            dy1 r2 = r14.n
            int r3 = r2.d
            if (r0 == r3) goto L_0x0164
            int r3 = r14.q
            if (r3 == r4) goto L_0x0160
            boolean r2 = r2.e()
            if (r2 != 0) goto L_0x0160
            dy1 r2 = new dy1
            int r3 = r14.q
            int r5 = r14.r
            r2.<init>(r3, r5)
            r14.n = r2
            java.util.ArrayList r3 = r14.m
            r3.add(r2)
        L_0x0160:
            dy1 r2 = r14.n
            r2.d = r0
        L_0x0164:
            r0 = r9 & 16
            if (r0 != r6) goto L_0x016a
            r0 = r4
            goto L_0x016b
        L_0x016a:
            r0 = r15
        L_0x016b:
            r2 = r9 & 1
            if (r2 != r4) goto L_0x0171
            r2 = r4
            goto L_0x0172
        L_0x0171:
            r2 = r15
        L_0x0172:
            int r3 = r9 >> 1
            r3 = r3 & 7
            dy1 r5 = r14.n
            if (r0 == 0) goto L_0x017d
            r6 = 8
            goto L_0x017e
        L_0x017d:
            r6 = r3
        L_0x017e:
            java.util.ArrayList r7 = r5.a
            by1 r8 = new by1
            java.lang.StringBuilder r5 = r5.c
            int r5 = r5.length()
            r8.<init>(r6, r5, r2)
            r7.add(r8)
            if (r0 == 0) goto L_0x0083
            dy1 r0 = r14.n
            int[] r2 = A
            r2 = r2[r3]
            r0.e = r2
            goto L_0x0083
        L_0x019a:
            r6 = 23
            r8 = 33
            if (r0 != r6) goto L_0x01ae
            if (r9 < r8) goto L_0x01ae
            r0 = 35
            if (r9 > r0) goto L_0x01ae
            dy1 r0 = r14.n
            int r9 = r9 + -32
            r0.f = r9
            goto L_0x0083
        L_0x01ae:
            if (r12 != r7) goto L_0x0083
            r0 = r9 & 240(0xf0, float:3.36E-43)
            if (r0 != r5) goto L_0x0083
            if (r9 == r5) goto L_0x0249
            r0 = 41
            if (r9 == r0) goto L_0x0244
            switch(r9) {
                case 37: goto L_0x0239;
                case 38: goto L_0x022e;
                case 39: goto L_0x0223;
                default: goto L_0x01bd;
            }
        L_0x01bd:
            int r0 = r14.q
            if (r0 != 0) goto L_0x01c3
            goto L_0x0083
        L_0x01c3:
            if (r9 == r8) goto L_0x021c
            switch(r9) {
                case 44: goto L_0x020b;
                case 45: goto L_0x01da;
                case 46: goto L_0x01d5;
                case 47: goto L_0x01ca;
                default: goto L_0x01c8;
            }
        L_0x01c8:
            goto L_0x0083
        L_0x01ca:
            java.util.ArrayList r0 = r14.j()
            r14.o = r0
            r14.k()
            goto L_0x0083
        L_0x01d5:
            r14.k()
            goto L_0x0083
        L_0x01da:
            if (r0 != r4) goto L_0x0083
            dy1 r0 = r14.n
            boolean r0 = r0.e()
            if (r0 != 0) goto L_0x0083
            dy1 r0 = r14.n
            java.util.ArrayList r2 = r0.b
            android.text.SpannableString r3 = r0.d()
            r2.add(r3)
            java.lang.StringBuilder r3 = r0.c
            r3.setLength(r15)
            java.util.ArrayList r3 = r0.a
            r3.clear()
            int r3 = r0.h
            int r0 = r0.d
            int r0 = java.lang.Math.min(r3, r0)
        L_0x0201:
            int r3 = r2.size()
            if (r3 < r0) goto L_0x0083
            r2.remove(r15)
            goto L_0x0201
        L_0x020b:
            java.util.List r0 = java.util.Collections.emptyList()
            r14.o = r0
            int r0 = r14.q
            if (r0 == r4) goto L_0x0217
            if (r0 != r3) goto L_0x0083
        L_0x0217:
            r14.k()
            goto L_0x0083
        L_0x021c:
            dy1 r0 = r14.n
            r0.b()
            goto L_0x0083
        L_0x0223:
            r14.l(r4)
            r14.r = r11
            dy1 r0 = r14.n
            r0.h = r11
            goto L_0x0083
        L_0x022e:
            r14.l(r4)
            r14.r = r3
            dy1 r0 = r14.n
            r0.h = r3
            goto L_0x0083
        L_0x0239:
            r14.l(r4)
            r14.r = r2
            dy1 r0 = r14.n
            r0.h = r2
            goto L_0x0083
        L_0x0244:
            r14.l(r3)
            goto L_0x0083
        L_0x0249:
            r14.l(r2)
            goto L_0x0083
        L_0x024e:
            dy1 r0 = r14.n
            r2 = r8 & 127(0x7f, float:1.78E-43)
            int r2 = r2 - r5
            int[] r3 = C
            r2 = r3[r2]
            char r2 = (char) r2
            r0.a(r2)
            r0 = r9 & 224(0xe0, float:3.14E-43)
            if (r0 == 0) goto L_0x0083
            dy1 r0 = r14.n
            r2 = r9 & 127(0x7f, float:1.78E-43)
            int r2 = r2 - r5
            r2 = r3[r2]
            char r2 = (char) r2
            r0.a(r2)
            goto L_0x0083
        L_0x026c:
            if (r0 == 0) goto L_0x027e
            int r15 = r14.q
            if (r15 == r4) goto L_0x0274
            if (r15 != r3) goto L_0x027e
        L_0x0274:
            java.util.ArrayList r15 = r14.j()
            r14.o = r15
            long r0 = r14.e
            r14.y = r0
        L_0x027e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fy1.g(oy1):void");
    }

    /* renamed from: h */
    public final eze d() {
        eze eze;
        eze h2 = super.d();
        if (h2 != null) {
            return h2;
        }
        long j2 = this.l;
        if (j2 == -9223372036854775807L) {
            return null;
        }
        long j3 = this.y;
        if (j3 == -9223372036854775807L || this.e - j3 < j2 || (eze = (eze) this.b.pollFirst()) == null) {
            return null;
        }
        this.o = Collections.emptyList();
        this.y = -9223372036854775807L;
        b8d e = e();
        long j4 = this.e;
        eze.c = j4;
        eze.v = e;
        eze.w = j4;
        return eze;
    }

    public final boolean i() {
        return this.o != this.p;
    }

    public final ArrayList j() {
        ArrayList arrayList = this.m;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        int i2 = 2;
        for (int i3 = 0; i3 < size; i3++) {
            n44 c = ((dy1) arrayList.get(i3)).c(IntCompanionObject.MIN_VALUE);
            arrayList2.add(c);
            if (c != null) {
                i2 = Math.min(i2, c.i);
            }
        }
        ArrayList arrayList3 = new ArrayList(size);
        for (int i4 = 0; i4 < size; i4++) {
            n44 n44 = (n44) arrayList2.get(i4);
            if (n44 != null) {
                if (n44.i != i2) {
                    n44 = ((dy1) arrayList.get(i4)).c(i2);
                    n44.getClass();
                }
                arrayList3.add(n44);
            }
        }
        return arrayList3;
    }

    public final void k() {
        dy1 dy1 = this.n;
        dy1.g = this.q;
        dy1.a.clear();
        dy1.b.clear();
        dy1.c.setLength(0);
        dy1.d = 15;
        dy1.e = 0;
        dy1.f = 0;
        ArrayList arrayList = this.m;
        arrayList.clear();
        arrayList.add(this.n);
    }

    public final void l(int i2) {
        int i3 = this.q;
        if (i3 != i2) {
            this.q = i2;
            if (i2 == 3) {
                int i4 = 0;
                while (true) {
                    ArrayList arrayList = this.m;
                    if (i4 < arrayList.size()) {
                        ((dy1) arrayList.get(i4)).g = i2;
                        i4++;
                    } else {
                        return;
                    }
                }
            } else {
                k();
                if (i3 == 3 || i2 == 1 || i2 == 0) {
                    this.o = Collections.emptyList();
                }
            }
        }
    }

    public final void release() {
    }
}
