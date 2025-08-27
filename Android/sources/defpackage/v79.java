package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;

/* renamed from: v79  reason: default package */
public final class v79 implements lt8, jt8 {
    public final lt8[] a;
    public final IdentityHashMap b;
    public final o9a c;
    public final ArrayList o = new ArrayList();
    public final HashMap v = new HashMap();
    public jt8 w;
    public tpf x;
    public lt8[] y;
    public wie z;

    public v79(o9a o9a, long[] jArr, lt8... lt8Arr) {
        this.c = o9a;
        this.a = lt8Arr;
        o9a.getClass();
        this.z = new wie(12, (Object) new psd[0]);
        this.b = new IdentityHashMap();
        this.y = new lt8[0];
        for (int i = 0; i < lt8Arr.length; i++) {
            long j = jArr[i];
            if (j != 0) {
                this.a[i] = new t79(lt8Arr[i], j);
            }
        }
    }

    public final void A(long j) {
        this.z.A(j);
    }

    public final long F(long j, tnd tnd) {
        lt8[] lt8Arr = this.y;
        return (lt8Arr.length > 0 ? lt8Arr[0] : this.a[0]).F(j, tnd);
    }

    public final boolean M(long j) {
        ArrayList arrayList = this.o;
        if (arrayList.isEmpty()) {
            return this.z.M(j);
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((lt8) arrayList.get(i)).M(j);
        }
        return false;
    }

    public final void S(jt8 jt8, long j) {
        this.w = jt8;
        ArrayList arrayList = this.o;
        lt8[] lt8Arr = this.a;
        Collections.addAll(arrayList, lt8Arr);
        for (lt8 S : lt8Arr) {
            S.S(this, j);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v13, resolved type: java.lang.Integer} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long T(defpackage.ld5[] r25, boolean[] r26, defpackage.kcd[] r27, boolean[] r28, long r29) {
        /*
            r24 = this;
            r0 = r24
            r1 = r25
            r2 = r27
            int r3 = r1.length
            int[] r3 = new int[r3]
            int r4 = r1.length
            int[] r4 = new int[r4]
            r6 = 0
        L_0x000d:
            int r7 = r1.length
            java.util.HashMap r8 = r0.v
            java.util.IdentityHashMap r9 = r0.b
            lt8[] r11 = r0.a
            if (r6 >= r7) goto L_0x005a
            r7 = r2[r6]
            if (r7 != 0) goto L_0x001c
            r10 = 0
            goto L_0x0023
        L_0x001c:
            java.lang.Object r7 = r9.get(r7)
            r10 = r7
            java.lang.Integer r10 = (java.lang.Integer) r10
        L_0x0023:
            r7 = -1
            if (r10 != 0) goto L_0x0028
            r9 = r7
            goto L_0x002c
        L_0x0028:
            int r9 = r10.intValue()
        L_0x002c:
            r3[r6] = r9
            r4[r6] = r7
            r9 = r1[r6]
            if (r9 == 0) goto L_0x0057
            rpf r9 = r9.a()
            java.lang.Object r8 = r8.get(r9)
            rpf r8 = (defpackage.rpf) r8
            r8.getClass()
            r9 = 0
        L_0x0042:
            int r10 = r11.length
            if (r9 >= r10) goto L_0x0057
            r10 = r11[r9]
            tpf r10 = r10.x()
            int r10 = r10.b(r8)
            if (r10 == r7) goto L_0x0054
            r4[r6] = r9
            goto L_0x0057
        L_0x0054:
            int r9 = r9 + 1
            goto L_0x0042
        L_0x0057:
            int r6 = r6 + 1
            goto L_0x000d
        L_0x005a:
            r9.clear()
            int r6 = r1.length
            kcd[] r7 = new defpackage.kcd[r6]
            int r12 = r1.length
            kcd[] r12 = new defpackage.kcd[r12]
            int r13 = r1.length
            ld5[] r15 = new defpackage.ld5[r13]
            java.util.ArrayList r14 = new java.util.ArrayList
            int r13 = r11.length
            r14.<init>(r13)
            r20 = r29
            r13 = 0
        L_0x006f:
            int r5 = r11.length
            if (r13 >= r5) goto L_0x011b
            r5 = 0
        L_0x0073:
            int r10 = r1.length
            if (r5 >= r10) goto L_0x00b1
            r10 = r3[r5]
            if (r10 != r13) goto L_0x007d
            r10 = r2[r5]
            goto L_0x007e
        L_0x007d:
            r10 = 0
        L_0x007e:
            r12[r5] = r10
            r10 = r4[r5]
            if (r10 != r13) goto L_0x00a3
            r10 = r1[r5]
            r10.getClass()
            r16 = r14
            rpf r14 = r10.a()
            java.lang.Object r14 = r8.get(r14)
            rpf r14 = (defpackage.rpf) r14
            r14.getClass()
            r23 = r8
            r79 r8 = new r79
            r8.<init>(r10, r14)
            r15[r5] = r8
            r8 = 0
            goto L_0x00aa
        L_0x00a3:
            r23 = r8
            r16 = r14
            r8 = 0
            r15[r5] = r8
        L_0x00aa:
            int r5 = r5 + 1
            r14 = r16
            r8 = r23
            goto L_0x0073
        L_0x00b1:
            r23 = r8
            r16 = r14
            r8 = 0
            r5 = r11[r13]
            r10 = r13
            r13 = r5
            r5 = r16
            r14 = r15
            r22 = r15
            r15 = r26
            r16 = r12
            r17 = r28
            r18 = r20
            long r13 = r13.T(r14, r15, r16, r17, r18)
            if (r10 != 0) goto L_0x00d0
            r20 = r13
            goto L_0x00d4
        L_0x00d0:
            int r13 = (r13 > r20 ? 1 : (r13 == r20 ? 0 : -1))
            if (r13 != 0) goto L_0x0113
        L_0x00d4:
            r13 = 0
            r14 = 0
        L_0x00d6:
            int r15 = r1.length
            if (r13 >= r15) goto L_0x0103
            r15 = r4[r13]
            r16 = 1
            if (r15 != r10) goto L_0x00f2
            r14 = r12[r13]
            r14.getClass()
            r15 = r12[r13]
            r7[r13] = r15
            java.lang.Integer r15 = java.lang.Integer.valueOf(r10)
            r9.put(r14, r15)
            r14 = r16
            goto L_0x0100
        L_0x00f2:
            r15 = r3[r13]
            if (r15 != r10) goto L_0x0100
            r15 = r12[r13]
            if (r15 != 0) goto L_0x00fb
            goto L_0x00fd
        L_0x00fb:
            r16 = 0
        L_0x00fd:
            defpackage.y64.j(r16)
        L_0x0100:
            int r13 = r13 + 1
            goto L_0x00d6
        L_0x0103:
            if (r14 == 0) goto L_0x010a
            r13 = r11[r10]
            r5.add(r13)
        L_0x010a:
            int r13 = r10 + 1
            r14 = r5
            r15 = r22
            r8 = r23
            goto L_0x006f
        L_0x0113:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Children enabled at different positions."
            r0.<init>(r1)
            throw r0
        L_0x011b:
            r5 = r14
            r1 = 0
            java.lang.System.arraycopy(r7, r1, r2, r1, r6)
            lt8[] r1 = new defpackage.lt8[r1]
            java.lang.Object[] r1 = r5.toArray(r1)
            lt8[] r1 = (defpackage.lt8[]) r1
            r0.y = r1
            o9a r2 = r0.c
            r2.getClass()
            wie r2 = new wie
            r3 = 12
            r2.<init>((int) r3, (java.lang.Object) r1)
            r0.z = r2
            return r20
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v79.T(ld5[], boolean[], kcd[], boolean[], long):long");
    }

    public final void b(psd psd) {
        lt8 lt8 = (lt8) psd;
        jt8 jt8 = this.w;
        jt8.getClass();
        jt8.b(this);
    }

    public final void c(lt8 lt8) {
        ArrayList arrayList = this.o;
        arrayList.remove(lt8);
        if (arrayList.isEmpty()) {
            lt8[] lt8Arr = this.a;
            int i = 0;
            for (lt8 x2 : lt8Arr) {
                i += x2.x().a;
            }
            rpf[] rpfArr = new rpf[i];
            int i2 = 0;
            for (int i3 = 0; i3 < lt8Arr.length; i3++) {
                tpf x3 = lt8Arr[i3].x();
                int i4 = x3.a;
                int i5 = 0;
                while (i5 < i4) {
                    rpf a2 = x3.a(i5);
                    String str = a2.b;
                    StringBuilder sb = new StringBuilder(g63.f(12, str));
                    sb.append(i3);
                    sb.append(":");
                    sb.append(str);
                    rpf rpf = new rpf(sb.toString(), a2.c);
                    this.v.put(rpf, a2);
                    rpfArr[i2] = rpf;
                    i5++;
                    i2++;
                }
            }
            this.x = new tpf(rpfArr);
            jt8 jt8 = this.w;
            jt8.getClass();
            jt8.c(this);
        }
    }

    public final boolean d() {
        return this.z.d();
    }

    public final long i() {
        return this.z.i();
    }

    public final void r() {
        for (lt8 r : this.a) {
            r.r();
        }
    }

    public final long s(long j) {
        long s = this.y[0].s(j);
        int i = 1;
        while (true) {
            lt8[] lt8Arr = this.y;
            if (i >= lt8Arr.length) {
                return s;
            }
            if (lt8Arr[i].s(s) == s) {
                i++;
            } else {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
    }

    public final long w() {
        long j = -9223372036854775807L;
        for (lt8 lt8 : this.y) {
            long w2 = lt8.w();
            if (w2 != -9223372036854775807L) {
                if (j == -9223372036854775807L) {
                    lt8[] lt8Arr = this.y;
                    int length = lt8Arr.length;
                    int i = 0;
                    while (i < length) {
                        lt8 lt82 = lt8Arr[i];
                        if (lt82 == lt8) {
                            break;
                        } else if (lt82.s(w2) == w2) {
                            i++;
                        } else {
                            throw new IllegalStateException("Unexpected child seekToUs result.");
                        }
                    }
                    j = w2;
                } else if (w2 != j) {
                    throw new IllegalStateException("Conflicting discontinuities.");
                }
            } else if (!(j == -9223372036854775807L || lt8.s(j) == j)) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
        return j;
    }

    public final tpf x() {
        tpf tpf = this.x;
        tpf.getClass();
        return tpf;
    }

    public final long y() {
        return this.z.y();
    }

    public final void z(long j, boolean z2) {
        for (lt8 z3 : this.y) {
            z3.z(j, z2);
        }
    }
}
