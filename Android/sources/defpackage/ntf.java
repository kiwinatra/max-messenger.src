package defpackage;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: ntf  reason: default package */
public final class ntf implements tf5 {
    public stf A0;
    public int B0;
    public int C0;
    public final SparseBooleanArray X;
    public final ltf Y;
    public oq5 Z;
    public final int a;
    public final int b;
    public final List c;
    public final l8b o;
    public final SparseIntArray v;
    public xf5 v0;
    public final kk3 w;
    public int w0;
    public final gze x;
    public boolean x0;
    public final SparseArray y;
    public boolean y0;
    public final SparseBooleanArray z;
    public boolean z0;

    public ntf(int i, int i2, gze gze, rkf rkf, kk3 kk3) {
        this.w = kk3;
        this.a = i;
        this.b = i2;
        this.x = gze;
        if (i == 1 || i == 2) {
            this.c = Collections.singletonList(rkf);
        } else {
            ArrayList arrayList = new ArrayList();
            this.c = arrayList;
            arrayList.add(rkf);
        }
        this.o = new l8b(0, new byte[9400]);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.z = sparseBooleanArray;
        this.X = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.y = sparseArray;
        this.v = new SparseIntArray();
        this.Y = new ltf(1);
        this.v0 = xf5.u;
        this.C0 = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i3 = 0; i3 < size; i3++) {
            sparseArray.put(sparseArray2.keyAt(i3), (stf) sparseArray2.valueAt(i3));
        }
        sparseArray.put(0, new fnd(new zqd(this)));
        this.A0 = null;
    }

    public final void U(xf5 xf5) {
        if ((this.b & 1) == 0) {
            xf5 = new jk3(xf5, this.x);
        }
        this.v0 = xf5;
    }

    public final void d(long j, long j2) {
        oq5 oq5;
        long j3;
        n79.n(this.a != 2);
        List list = this.c;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            rkf rkf = (rkf) list.get(i);
            synchronized (rkf) {
                j3 = rkf.b;
            }
            boolean z2 = j3 == -9223372036854775807L;
            if (!z2) {
                long d = rkf.d();
                z2 = (d == -9223372036854775807L || d == 0 || d == j2) ? false : true;
            }
            if (z2) {
                rkf.f(j2);
            }
        }
        if (!(j2 == 0 || (oq5 = this.Z) == null)) {
            oq5.e(j2);
        }
        this.o.D(0);
        this.v.clear();
        int i2 = 0;
        while (true) {
            SparseArray sparseArray = this.y;
            if (i2 < sparseArray.size()) {
                ((stf) sparseArray.valueAt(i2)).a();
                i2++;
            } else {
                this.B0 = 0;
                return;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v5, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v6, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: stf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v20, resolved type: qn0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: oq5} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int g(defpackage.vf5 r28, defpackage.yl4 r29) {
        /*
            r27 = this;
            r0 = r27
            r1 = r29
            r2 = r28
            hf4 r2 = (defpackage.hf4) r2
            long r14 = r2.c
            r2 = 0
            r12 = 1
            int r13 = r0.a
            r10 = 2
            if (r13 != r10) goto L_0x0014
            r17 = r12
            goto L_0x0016
        L_0x0014:
            r17 = r2
        L_0x0016:
            boolean r3 = r0.x0
            r11 = 71
            r18 = -1
            if (r3 == 0) goto L_0x01a0
            int r3 = (r14 > r18 ? 1 : (r14 == r18 ? 0 : -1))
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            ltf r6 = r0.Y
            if (r3 == 0) goto L_0x0118
            if (r17 != 0) goto L_0x0118
            boolean r3 = r6.b
            if (r3 != 0) goto L_0x0118
            int r0 = r0.C0
            if (r0 > 0) goto L_0x003c
            r0 = r28
            hf4 r0 = (defpackage.hf4) r0
            r6.b(r0)
            goto L_0x0117
        L_0x003c:
            boolean r3 = r6.d
            java.lang.Object r7 = r6.i
            l8b r7 = (defpackage.l8b) r7
            int r8 = r6.a
            if (r3 != 0) goto L_0x009f
            r3 = r28
            hf4 r3 = (defpackage.hf4) r3
            long r8 = (long) r8
            long r13 = r3.c
            long r8 = java.lang.Math.min(r8, r13)
            int r8 = (int) r8
            long r9 = (long) r8
            long r13 = r13 - r9
            long r9 = r3.o
            int r9 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r9 == 0) goto L_0x005f
            r1.b = r13
        L_0x005c:
            r2 = r12
            goto L_0x0117
        L_0x005f:
            r7.D(r8)
            r3.w = r2
            byte[] r1 = r7.a
            r3.q(r1, r2, r8, r2)
            int r1 = r7.b
            int r3 = r7.c
            int r8 = r3 + -188
        L_0x006f:
            if (r8 < r1) goto L_0x0099
            byte[] r9 = r7.a
            r10 = -4
            r13 = r2
        L_0x0075:
            r14 = 4
            if (r10 > r14) goto L_0x0096
            int r14 = r10 * 188
            int r14 = r14 + r8
            if (r14 < r1) goto L_0x0092
            if (r14 >= r3) goto L_0x0092
            byte r14 = r9[r14]
            if (r14 == r11) goto L_0x0084
            goto L_0x0092
        L_0x0084:
            int r13 = r13 + r12
            r14 = 5
            if (r13 != r14) goto L_0x0093
            long r9 = defpackage.ryg.U(r7, r8, r0)
            int r13 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r13 == 0) goto L_0x0096
            r4 = r9
            goto L_0x0099
        L_0x0092:
            r13 = r2
        L_0x0093:
            int r10 = r10 + 1
            goto L_0x0075
        L_0x0096:
            int r8 = r8 + -1
            goto L_0x006f
        L_0x0099:
            r6.f = r4
            r6.d = r12
            goto L_0x0117
        L_0x009f:
            long r9 = r6.f
            int r3 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r3 != 0) goto L_0x00ae
            r0 = r28
            hf4 r0 = (defpackage.hf4) r0
            r6.b(r0)
            goto L_0x0117
        L_0x00ae:
            boolean r3 = r6.c
            if (r3 != 0) goto L_0x00f1
            long r8 = (long) r8
            r3 = r28
            hf4 r3 = (defpackage.hf4) r3
            long r13 = r3.c
            long r8 = java.lang.Math.min(r8, r13)
            int r8 = (int) r8
            long r9 = r3.o
            long r13 = (long) r2
            int r9 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r9 == 0) goto L_0x00c8
            r1.b = r13
            goto L_0x005c
        L_0x00c8:
            r7.D(r8)
            r3.w = r2
            byte[] r1 = r7.a
            r3.q(r1, r2, r8, r2)
            int r1 = r7.b
            int r3 = r7.c
        L_0x00d6:
            if (r1 >= r3) goto L_0x00ec
            byte[] r8 = r7.a
            byte r8 = r8[r1]
            if (r8 == r11) goto L_0x00df
            goto L_0x00e9
        L_0x00df:
            long r8 = defpackage.ryg.U(r7, r1, r0)
            int r10 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r10 == 0) goto L_0x00e9
            r4 = r8
            goto L_0x00ec
        L_0x00e9:
            int r1 = r1 + 1
            goto L_0x00d6
        L_0x00ec:
            r6.e = r4
            r6.c = r12
            goto L_0x0117
        L_0x00f1:
            long r0 = r6.e
            int r3 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r3 != 0) goto L_0x00ff
            r0 = r28
            hf4 r0 = (defpackage.hf4) r0
            r6.b(r0)
            goto L_0x0117
        L_0x00ff:
            java.lang.Object r3 = r6.h
            rkf r3 = (defpackage.rkf) r3
            long r0 = r3.b(r0)
            long r4 = r6.f
            long r3 = r3.c(r4)
            long r3 = r3 - r0
            r6.g = r3
            r0 = r28
            hf4 r0 = (defpackage.hf4) r0
            r6.b(r0)
        L_0x0117:
            return r2
        L_0x0118:
            boolean r3 = r0.y0
            if (r3 != 0) goto L_0x016e
            r0.y0 = r12
            long r7 = r6.g
            int r3 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r3 == 0) goto L_0x015f
            oq5 r9 = new oq5
            int r3 = r0.C0
            djd r4 = new djd
            r5 = 8
            r4.<init>((int) r5)
            ktf r5 = new ktf
            java.lang.Object r6 = r6.h
            rkf r6 = (defpackage.rkf) r6
            r5.<init>(r3, r6)
            r20 = 1
            long r20 = r7 + r20
            r16 = 940(0x3ac, float:1.317E-42)
            r22 = 0
            r24 = 188(0xbc, double:9.3E-322)
            r3 = r9
            r6 = r7
            r2 = r9
            r8 = r20
            r10 = r22
            r26 = r13
            r12 = r14
            r20 = r14
            r14 = r24
            r3.<init>((defpackage.mn0) r4, (defpackage.pn0) r5, (long) r6, (long) r8, (long) r10, (long) r12, (long) r14, (int) r16)
            r0.Z = r2
            xf5 r3 = r0.v0
            java.lang.Object r2 = r2.c
            jn0 r2 = (defpackage.jn0) r2
            r3.M(r2)
            goto L_0x0172
        L_0x015f:
            r26 = r13
            r20 = r14
            xf5 r2 = r0.v0
            me0 r3 = new me0
            r3.<init>(r7)
            r2.M(r3)
            goto L_0x0172
        L_0x016e:
            r26 = r13
            r20 = r14
        L_0x0172:
            boolean r2 = r0.z0
            if (r2 == 0) goto L_0x018c
            r2 = 0
            r0.z0 = r2
            r2 = 0
            r0.d(r2, r2)
            r4 = r28
            hf4 r4 = (defpackage.hf4) r4
            long r4 = r4.o
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x018c
            r1.b = r2
            r2 = 1
            return r2
        L_0x018c:
            r2 = 1
            oq5 r3 = r0.Z
            if (r3 == 0) goto L_0x01a5
            java.lang.Object r4 = r3.e
            kn0 r4 = (defpackage.kn0) r4
            if (r4 == 0) goto L_0x01a5
            r0 = r28
            hf4 r0 = (defpackage.hf4) r0
            int r0 = r3.b(r0, r1)
            return r0
        L_0x01a0:
            r2 = r12
            r26 = r13
            r20 = r14
        L_0x01a5:
            l8b r1 = r0.o
            byte[] r3 = r1.a
            int r4 = r1.b
            int r4 = 9400 - r4
            r5 = 188(0xbc, float:2.63E-43)
            if (r4 >= r5) goto L_0x01c0
            int r4 = r1.a()
            if (r4 <= 0) goto L_0x01bd
            int r6 = r1.b
            r7 = 0
            java.lang.System.arraycopy(r3, r6, r3, r7, r4)
        L_0x01bd:
            r1.E(r4, r3)
        L_0x01c0:
            int r4 = r1.a()
            android.util.SparseArray r6 = r0.y
            if (r4 >= r5) goto L_0x020c
            int r4 = r1.c
            int r7 = 9400 - r4
            r8 = r28
            hf4 r8 = (defpackage.hf4) r8
            int r7 = r8.read(r3, r4, r7)
            r8 = -1
            if (r7 != r8) goto L_0x0207
            r0 = 0
        L_0x01d8:
            int r1 = r6.size()
            if (r0 >= r1) goto L_0x0206
            java.lang.Object r1 = r6.valueAt(r0)
            stf r1 = (defpackage.stf) r1
            boolean r3 = r1 instanceof defpackage.ndb
            if (r3 == 0) goto L_0x0203
            ndb r1 = (defpackage.ndb) r1
            int r3 = r1.c
            r4 = 3
            if (r3 != r4) goto L_0x0203
            int r3 = r1.j
            if (r3 != r8) goto L_0x0203
            if (r17 == 0) goto L_0x01fb
            w05 r3 = r1.a
            boolean r3 = r3 instanceof defpackage.nv6
            if (r3 != 0) goto L_0x0203
        L_0x01fb:
            l8b r3 = new l8b
            r3.<init>()
            r1.b(r2, r3)
        L_0x0203:
            int r0 = r0 + 1
            goto L_0x01d8
        L_0x0206:
            return r8
        L_0x0207:
            int r4 = r4 + r7
            r1.F(r4)
            goto L_0x01c0
        L_0x020c:
            int r3 = r1.b
            int r4 = r1.c
            byte[] r5 = r1.a
            r7 = r3
        L_0x0213:
            if (r7 >= r4) goto L_0x021e
            byte r8 = r5[r7]
            r9 = 71
            if (r8 == r9) goto L_0x021e
            int r7 = r7 + 1
            goto L_0x0213
        L_0x021e:
            r1.G(r7)
            int r5 = r7 + 188
            r8 = 0
            if (r5 <= r4) goto L_0x023e
            int r4 = r0.B0
            int r7 = r7 - r3
            int r7 = r7 + r4
            r0.B0 = r7
            r3 = r26
            r4 = 2
            if (r3 != r4) goto L_0x0235
            r9 = 376(0x178, float:5.27E-43)
            if (r7 > r9) goto L_0x0237
        L_0x0235:
            r7 = 0
            goto L_0x0244
        L_0x0237:
            java.lang.String r0 = "Cannot find sync byte. Most likely not a Transport Stream."
            androidx.media3.common.ParserException r0 = androidx.media3.common.ParserException.a(r0, r8)
            throw r0
        L_0x023e:
            r3 = r26
            r4 = 2
            r7 = 0
            r0.B0 = r7
        L_0x0244:
            int r9 = r1.c
            if (r5 <= r9) goto L_0x0249
            return r7
        L_0x0249:
            int r10 = r1.g()
            r11 = 8388608(0x800000, float:1.17549435E-38)
            r11 = r11 & r10
            if (r11 == 0) goto L_0x0256
            r1.G(r5)
            return r7
        L_0x0256:
            r7 = 4194304(0x400000, float:5.877472E-39)
            r7 = r7 & r10
            if (r7 == 0) goto L_0x025d
            r12 = r2
            goto L_0x025e
        L_0x025d:
            r12 = 0
        L_0x025e:
            r7 = 2096896(0x1fff00, float:2.938377E-39)
            r7 = r7 & r10
            int r7 = r7 >> 8
            r11 = r10 & 32
            if (r11 == 0) goto L_0x026a
            r11 = r2
            goto L_0x026b
        L_0x026a:
            r11 = 0
        L_0x026b:
            r13 = r10 & 16
            if (r13 == 0) goto L_0x0276
            java.lang.Object r6 = r6.get(r7)
            r8 = r6
            stf r8 = (defpackage.stf) r8
        L_0x0276:
            if (r8 != 0) goto L_0x027d
            r1.G(r5)
            r6 = 0
            return r6
        L_0x027d:
            r6 = 0
            if (r3 == r4) goto L_0x029b
            r10 = r10 & 15
            android.util.SparseIntArray r13 = r0.v
            int r14 = r10 + -1
            int r14 = r13.get(r7, r14)
            r13.put(r7, r10)
            if (r14 != r10) goto L_0x0293
            r1.G(r5)
            return r6
        L_0x0293:
            int r14 = r14 + r2
            r6 = r14 & 15
            if (r10 == r6) goto L_0x029b
            r8.a()
        L_0x029b:
            if (r11 == 0) goto L_0x02b1
            int r6 = r1.u()
            int r10 = r1.u()
            r10 = r10 & 64
            if (r10 == 0) goto L_0x02ab
            r10 = r4
            goto L_0x02ac
        L_0x02ab:
            r10 = 0
        L_0x02ac:
            r12 = r12 | r10
            int r6 = r6 - r2
            r1.H(r6)
        L_0x02b1:
            boolean r6 = r0.x0
            if (r3 == r4) goto L_0x02c0
            if (r6 != 0) goto L_0x02c0
            android.util.SparseBooleanArray r10 = r0.X
            r11 = 0
            boolean r7 = r10.get(r7, r11)
            if (r7 != 0) goto L_0x02c9
        L_0x02c0:
            r1.F(r5)
            r8.b(r12, r1)
            r1.F(r9)
        L_0x02c9:
            if (r3 == r4) goto L_0x02d7
            if (r6 != 0) goto L_0x02d7
            boolean r3 = r0.x0
            if (r3 == 0) goto L_0x02d7
            int r3 = (r20 > r18 ? 1 : (r20 == r18 ? 0 : -1))
            if (r3 == 0) goto L_0x02d7
            r0.z0 = r2
        L_0x02d7:
            r1.G(r5)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ntf.g(vf5, yl4):int");
    }

    public final boolean n(vf5 vf5) {
        byte[] bArr = this.o.a;
        ((hf4) vf5).q(bArr, 0, 940, false);
        int i = 0;
        while (i < 188) {
            int i2 = 0;
            while (i2 < 5) {
                if (bArr[(i2 * 188) + i] != 71) {
                    i++;
                } else {
                    i2++;
                }
            }
            ((hf4) vf5).z(i);
            return true;
        }
        return false;
    }

    public final void release() {
    }
}
