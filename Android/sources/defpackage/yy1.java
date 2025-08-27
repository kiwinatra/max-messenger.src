package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: yy1  reason: default package */
public final class yy1 extends gng {
    public final ArrayList k = new ArrayList();
    public int l;

    public yy1(tj3 tj3, int i) {
        super(tj3);
        tj3 tj32;
        this.f = i;
        tj3 tj33 = this.b;
        tj3 m = tj33.m(i);
        while (true) {
            tj3 tj34 = m;
            tj32 = tj33;
            tj33 = tj34;
            if (tj33 == null) {
                break;
            }
            m = tj33.m(this.f);
        }
        this.b = tj32;
        int i2 = this.f;
        Object obj = i2 == 0 ? tj32.d : i2 == 1 ? tj32.e : null;
        ArrayList arrayList = this.k;
        arrayList.add(obj);
        tj3 l2 = tj32.l(this.f);
        while (l2 != null) {
            int i3 = this.f;
            arrayList.add(i3 == 0 ? l2.d : i3 == 1 ? l2.e : null);
            l2 = l2.l(this.f);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            gng gng = (gng) it.next();
            int i4 = this.f;
            if (i4 == 0) {
                gng.b.b = this;
            } else if (i4 == 1) {
                gng.b.c = this;
            }
        }
        if (this.f == 0 && ((uj3) this.b.T).v0 && arrayList.size() > 1) {
            this.b = ((gng) a81.h(1, arrayList)).b;
        }
        this.l = this.f == 0 ? this.b.i0 : this.b.j0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:59:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00da  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.cm4 r27) {
        /*
            r26 = this;
            r0 = r26
            fm4 r1 = r0.h
            boolean r2 = r1.j
            if (r2 == 0) goto L_0x03c6
            fm4 r2 = r0.i
            boolean r3 = r2.j
            if (r3 != 0) goto L_0x0010
            goto L_0x03c6
        L_0x0010:
            tj3 r3 = r0.b
            tj3 r3 = r3.T
            boolean r4 = r3 instanceof defpackage.uj3
            if (r4 == 0) goto L_0x001d
            uj3 r3 = (defpackage.uj3) r3
            boolean r3 = r3.v0
            goto L_0x001e
        L_0x001d:
            r3 = 0
        L_0x001e:
            int r4 = r2.g
            int r6 = r1.g
            int r4 = r4 - r6
            java.util.ArrayList r6 = r0.k
            int r7 = r6.size()
            r8 = 0
        L_0x002a:
            r9 = -1
            r10 = 8
            if (r8 >= r7) goto L_0x003e
            java.lang.Object r11 = r6.get(r8)
            gng r11 = (defpackage.gng) r11
            tj3 r11 = r11.b
            int r11 = r11.g0
            if (r11 != r10) goto L_0x003f
            int r8 = r8 + 1
            goto L_0x002a
        L_0x003e:
            r8 = r9
        L_0x003f:
            int r11 = r7 + -1
            r12 = r11
        L_0x0042:
            if (r12 < 0) goto L_0x0054
            java.lang.Object r13 = r6.get(r12)
            gng r13 = (defpackage.gng) r13
            tj3 r13 = r13.b
            int r13 = r13.g0
            if (r13 != r10) goto L_0x0053
            int r12 = r12 + -1
            goto L_0x0042
        L_0x0053:
            r9 = r12
        L_0x0054:
            r12 = 0
        L_0x0055:
            r5 = 2
            if (r12 >= r5) goto L_0x0107
            r5 = 0
            r14 = 0
            r17 = 0
            r18 = 0
            r19 = 0
        L_0x0060:
            if (r5 >= r7) goto L_0x00ef
            java.lang.Object r20 = r6.get(r5)
            r13 = r20
            gng r13 = (defpackage.gng) r13
            tj3 r15 = r13.b
            r21 = r6
            int r6 = r15.g0
            if (r6 != r10) goto L_0x0076
            r23 = r8
            goto L_0x00e5
        L_0x0076:
            int r18 = r18 + 1
            if (r5 <= 0) goto L_0x0081
            if (r5 < r8) goto L_0x0081
            fm4 r6 = r13.h
            int r6 = r6.f
            int r14 = r14 + r6
        L_0x0081:
            uo4 r6 = r13.e
            int r10 = r6.g
            r22 = r10
            int r10 = r13.d
            r23 = r8
            r8 = 3
            if (r10 == r8) goto L_0x0090
            r8 = 1
            goto L_0x0091
        L_0x0090:
            r8 = 0
        L_0x0091:
            if (r8 == 0) goto L_0x00af
            int r6 = r0.f
            if (r6 != 0) goto L_0x00a0
            s27 r10 = r15.d
            uo4 r10 = r10.e
            boolean r10 = r10.j
            if (r10 != 0) goto L_0x00a0
            return
        L_0x00a0:
            r10 = 1
            if (r6 != r10) goto L_0x00ac
            w2g r6 = r15.e
            uo4 r6 = r6.e
            boolean r6 = r6.j
            if (r6 != 0) goto L_0x00ac
            return
        L_0x00ac:
            r24 = r8
            goto L_0x00c6
        L_0x00af:
            r24 = r8
            r10 = 1
            int r8 = r13.a
            if (r8 != r10) goto L_0x00bf
            if (r12 != 0) goto L_0x00bf
            int r10 = r6.m
            int r17 = r17 + 1
        L_0x00bc:
            r24 = 1
            goto L_0x00c8
        L_0x00bf:
            boolean r6 = r6.j
            if (r6 == 0) goto L_0x00c6
            r10 = r22
            goto L_0x00bc
        L_0x00c6:
            r10 = r22
        L_0x00c8:
            if (r24 != 0) goto L_0x00da
            int r17 = r17 + 1
            float[] r6 = r15.k0
            int r8 = r0.f
            r6 = r6[r8]
            r8 = 0
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 < 0) goto L_0x00db
            float r19 = r19 + r6
            goto L_0x00db
        L_0x00da:
            int r14 = r14 + r10
        L_0x00db:
            if (r5 >= r11) goto L_0x00e5
            if (r5 >= r9) goto L_0x00e5
            fm4 r6 = r13.i
            int r6 = r6.f
            int r6 = -r6
            int r14 = r14 + r6
        L_0x00e5:
            int r5 = r5 + 1
            r6 = r21
            r8 = r23
            r10 = 8
            goto L_0x0060
        L_0x00ef:
            r21 = r6
            r23 = r8
            if (r14 < r4) goto L_0x0102
            if (r17 != 0) goto L_0x00f8
            goto L_0x0102
        L_0x00f8:
            int r12 = r12 + 1
            r6 = r21
            r8 = r23
            r10 = 8
            goto L_0x0055
        L_0x0102:
            r5 = r17
            r6 = r18
            goto L_0x0110
        L_0x0107:
            r21 = r6
            r23 = r8
            r5 = 0
            r6 = 0
            r14 = 0
            r19 = 0
        L_0x0110:
            int r1 = r1.g
            if (r3 == 0) goto L_0x0116
            int r1 = r2.g
        L_0x0116:
            r2 = 1056964608(0x3f000000, float:0.5)
            if (r14 <= r4) goto L_0x012d
            r8 = 1073741824(0x40000000, float:2.0)
            if (r3 == 0) goto L_0x0126
            int r10 = r14 - r4
            float r10 = (float) r10
            float r10 = r10 / r8
            float r10 = r10 + r2
            int r8 = (int) r10
            int r1 = r1 + r8
            goto L_0x012d
        L_0x0126:
            int r10 = r14 - r4
            float r10 = (float) r10
            float r10 = r10 / r8
            float r10 = r10 + r2
            int r8 = (int) r10
            int r1 = r1 - r8
        L_0x012d:
            if (r5 <= 0) goto L_0x020f
            int r8 = r4 - r14
            float r8 = (float) r8
            float r10 = (float) r5
            float r10 = r8 / r10
            float r10 = r10 + r2
            int r10 = (int) r10
            r12 = 0
            r13 = 0
        L_0x0139:
            if (r12 >= r7) goto L_0x01bc
            r15 = r21
            java.lang.Object r17 = r15.get(r12)
            r2 = r17
            gng r2 = (defpackage.gng) r2
            r17 = r10
            tj3 r10 = r2.b
            r21 = r14
            int r14 = r10.g0
            r22 = r1
            r1 = 8
            if (r14 != r1) goto L_0x0158
        L_0x0153:
            r24 = r3
            r25 = r8
            goto L_0x01aa
        L_0x0158:
            int r1 = r2.d
            r14 = 3
            if (r1 != r14) goto L_0x0153
            uo4 r1 = r2.e
            boolean r14 = r1.j
            if (r14 != 0) goto L_0x0153
            r14 = 0
            int r16 = (r19 > r14 ? 1 : (r19 == r14 ? 0 : -1))
            if (r16 <= 0) goto L_0x0178
            float[] r14 = r10.k0
            r24 = r3
            int r3 = r0.f
            r3 = r14[r3]
            float r3 = r3 * r8
            float r3 = r3 / r19
            r14 = 1056964608(0x3f000000, float:0.5)
            float r3 = r3 + r14
            int r3 = (int) r3
            goto L_0x017c
        L_0x0178:
            r24 = r3
            r3 = r17
        L_0x017c:
            int r14 = r0.f
            if (r14 != 0) goto L_0x0185
            int r14 = r10.v
            int r10 = r10.u
            goto L_0x0189
        L_0x0185:
            int r14 = r10.y
            int r10 = r10.x
        L_0x0189:
            int r2 = r2.a
            r25 = r8
            r8 = 1
            if (r2 != r8) goto L_0x0197
            int r2 = r1.m
            int r2 = java.lang.Math.min(r3, r2)
            goto L_0x0198
        L_0x0197:
            r2 = r3
        L_0x0198:
            int r2 = java.lang.Math.max(r10, r2)
            if (r14 <= 0) goto L_0x01a2
            int r2 = java.lang.Math.min(r14, r2)
        L_0x01a2:
            if (r2 == r3) goto L_0x01a7
            int r13 = r13 + 1
            r3 = r2
        L_0x01a7:
            r1.d(r3)
        L_0x01aa:
            int r12 = r12 + 1
            r10 = r17
            r14 = r21
            r1 = r22
            r3 = r24
            r8 = r25
            r2 = 1056964608(0x3f000000, float:0.5)
            r21 = r15
            goto L_0x0139
        L_0x01bc:
            r22 = r1
            r24 = r3
            r15 = r21
            r21 = r14
            if (r13 <= 0) goto L_0x01fe
            int r5 = r5 - r13
            r1 = 0
            r14 = 0
        L_0x01c9:
            if (r1 >= r7) goto L_0x01fb
            java.lang.Object r2 = r15.get(r1)
            gng r2 = (defpackage.gng) r2
            tj3 r3 = r2.b
            int r3 = r3.g0
            r8 = 8
            if (r3 != r8) goto L_0x01dc
            r8 = r23
            goto L_0x01f6
        L_0x01dc:
            r8 = r23
            if (r1 <= 0) goto L_0x01e7
            if (r1 < r8) goto L_0x01e7
            fm4 r3 = r2.h
            int r3 = r3.f
            int r14 = r14 + r3
        L_0x01e7:
            uo4 r3 = r2.e
            int r3 = r3.g
            int r14 = r14 + r3
            if (r1 >= r11) goto L_0x01f6
            if (r1 >= r9) goto L_0x01f6
            fm4 r2 = r2.i
            int r2 = r2.f
            int r2 = -r2
            int r14 = r14 + r2
        L_0x01f6:
            int r1 = r1 + 1
            r23 = r8
            goto L_0x01c9
        L_0x01fb:
            r8 = r23
            goto L_0x0202
        L_0x01fe:
            r8 = r23
            r14 = r21
        L_0x0202:
            int r1 = r0.l
            r2 = 2
            if (r1 != r2) goto L_0x020d
            if (r13 != 0) goto L_0x020d
            r1 = 0
            r0.l = r1
            goto L_0x021b
        L_0x020d:
            r1 = 0
            goto L_0x021b
        L_0x020f:
            r22 = r1
            r24 = r3
            r15 = r21
            r8 = r23
            r1 = 0
            r2 = 2
            r21 = r14
        L_0x021b:
            if (r14 <= r4) goto L_0x021f
            r0.l = r2
        L_0x021f:
            if (r6 <= 0) goto L_0x0227
            if (r5 != 0) goto L_0x0227
            if (r8 != r9) goto L_0x0227
            r0.l = r2
        L_0x0227:
            int r2 = r0.l
            r3 = 1
            if (r2 != r3) goto L_0x02b3
            if (r6 <= r3) goto L_0x0232
            int r4 = r4 - r14
            int r6 = r6 - r3
            int r4 = r4 / r6
            goto L_0x0239
        L_0x0232:
            if (r6 != r3) goto L_0x0238
            int r4 = r4 - r14
            r0 = 2
            int r4 = r4 / r0
            goto L_0x0239
        L_0x0238:
            r4 = r1
        L_0x0239:
            if (r5 <= 0) goto L_0x023c
            r4 = r1
        L_0x023c:
            r5 = r1
            r1 = r22
        L_0x023f:
            if (r5 >= r7) goto L_0x03c6
            if (r24 == 0) goto L_0x0248
            int r0 = r5 + 1
            int r0 = r7 - r0
            goto L_0x0249
        L_0x0248:
            r0 = r5
        L_0x0249:
            java.lang.Object r0 = r15.get(r0)
            gng r0 = (defpackage.gng) r0
            tj3 r2 = r0.b
            int r2 = r2.g0
            fm4 r3 = r0.i
            fm4 r6 = r0.h
            r10 = 8
            if (r2 != r10) goto L_0x0262
            r6.d(r1)
            r3.d(r1)
            goto L_0x02b0
        L_0x0262:
            if (r5 <= 0) goto L_0x0269
            if (r24 == 0) goto L_0x0268
            int r1 = r1 - r4
            goto L_0x0269
        L_0x0268:
            int r1 = r1 + r4
        L_0x0269:
            if (r5 <= 0) goto L_0x0276
            if (r5 < r8) goto L_0x0276
            if (r24 == 0) goto L_0x0273
            int r2 = r6.f
            int r1 = r1 - r2
            goto L_0x0276
        L_0x0273:
            int r2 = r6.f
            int r1 = r1 + r2
        L_0x0276:
            if (r24 == 0) goto L_0x027c
            r3.d(r1)
            goto L_0x027f
        L_0x027c:
            r6.d(r1)
        L_0x027f:
            uo4 r2 = r0.e
            int r10 = r2.g
            int r12 = r0.d
            r13 = 3
            if (r12 != r13) goto L_0x028f
            int r12 = r0.a
            r13 = 1
            if (r12 != r13) goto L_0x028f
            int r10 = r2.m
        L_0x028f:
            if (r24 == 0) goto L_0x0293
            int r1 = r1 - r10
            goto L_0x0294
        L_0x0293:
            int r1 = r1 + r10
        L_0x0294:
            if (r24 == 0) goto L_0x029b
            r6.d(r1)
        L_0x0299:
            r2 = 1
            goto L_0x029f
        L_0x029b:
            r3.d(r1)
            goto L_0x0299
        L_0x029f:
            r0.g = r2
            if (r5 >= r11) goto L_0x02b0
            if (r5 >= r9) goto L_0x02b0
            if (r24 == 0) goto L_0x02ac
            int r0 = r3.f
            int r0 = -r0
            int r1 = r1 - r0
            goto L_0x02b0
        L_0x02ac:
            int r0 = r3.f
            int r0 = -r0
            int r1 = r1 + r0
        L_0x02b0:
            int r5 = r5 + 1
            goto L_0x023f
        L_0x02b3:
            if (r2 != 0) goto L_0x0331
            int r4 = r4 - r14
            r0 = 1
            int r6 = r6 + r0
            int r4 = r4 / r6
            if (r5 <= 0) goto L_0x02bc
            r4 = r1
        L_0x02bc:
            r5 = r1
            r1 = r22
        L_0x02bf:
            if (r5 >= r7) goto L_0x03c6
            if (r24 == 0) goto L_0x02c8
            int r0 = r5 + 1
            int r0 = r7 - r0
            goto L_0x02c9
        L_0x02c8:
            r0 = r5
        L_0x02c9:
            java.lang.Object r0 = r15.get(r0)
            gng r0 = (defpackage.gng) r0
            tj3 r2 = r0.b
            int r2 = r2.g0
            fm4 r3 = r0.i
            fm4 r6 = r0.h
            r10 = 8
            if (r2 != r10) goto L_0x02e2
            r6.d(r1)
            r3.d(r1)
            goto L_0x032e
        L_0x02e2:
            if (r24 == 0) goto L_0x02e6
            int r1 = r1 - r4
            goto L_0x02e7
        L_0x02e6:
            int r1 = r1 + r4
        L_0x02e7:
            if (r5 <= 0) goto L_0x02f4
            if (r5 < r8) goto L_0x02f4
            if (r24 == 0) goto L_0x02f1
            int r2 = r6.f
            int r1 = r1 - r2
            goto L_0x02f4
        L_0x02f1:
            int r2 = r6.f
            int r1 = r1 + r2
        L_0x02f4:
            if (r24 == 0) goto L_0x02fa
            r3.d(r1)
            goto L_0x02fd
        L_0x02fa:
            r6.d(r1)
        L_0x02fd:
            uo4 r2 = r0.e
            int r10 = r2.g
            int r12 = r0.d
            r13 = 3
            if (r12 != r13) goto L_0x0311
            int r0 = r0.a
            r12 = 1
            if (r0 != r12) goto L_0x0311
            int r0 = r2.m
            int r10 = java.lang.Math.min(r10, r0)
        L_0x0311:
            if (r24 == 0) goto L_0x0315
            int r1 = r1 - r10
            goto L_0x0316
        L_0x0315:
            int r1 = r1 + r10
        L_0x0316:
            if (r24 == 0) goto L_0x031c
            r6.d(r1)
            goto L_0x031f
        L_0x031c:
            r3.d(r1)
        L_0x031f:
            if (r5 >= r11) goto L_0x032e
            if (r5 >= r9) goto L_0x032e
            if (r24 == 0) goto L_0x032a
            int r0 = r3.f
            int r0 = -r0
            int r1 = r1 - r0
            goto L_0x032e
        L_0x032a:
            int r0 = r3.f
            int r0 = -r0
            int r1 = r1 + r0
        L_0x032e:
            int r5 = r5 + 1
            goto L_0x02bf
        L_0x0331:
            r3 = 2
            if (r2 != r3) goto L_0x03c6
            int r2 = r0.f
            tj3 r0 = r0.b
            if (r2 != 0) goto L_0x033d
            float r0 = r0.d0
            goto L_0x033f
        L_0x033d:
            float r0 = r0.e0
        L_0x033f:
            if (r24 == 0) goto L_0x0345
            r2 = 1065353216(0x3f800000, float:1.0)
            float r0 = r2 - r0
        L_0x0345:
            int r4 = r4 - r14
            float r2 = (float) r4
            float r2 = r2 * r0
            r0 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 + r0
            int r0 = (int) r2
            if (r0 < 0) goto L_0x0350
            if (r5 <= 0) goto L_0x0351
        L_0x0350:
            r0 = r1
        L_0x0351:
            if (r24 == 0) goto L_0x0356
            int r0 = r22 - r0
            goto L_0x0358
        L_0x0356:
            int r0 = r22 + r0
        L_0x0358:
            r5 = r1
        L_0x0359:
            if (r5 >= r7) goto L_0x03c6
            if (r24 == 0) goto L_0x0362
            int r1 = r5 + 1
            int r1 = r7 - r1
            goto L_0x0363
        L_0x0362:
            r1 = r5
        L_0x0363:
            java.lang.Object r1 = r15.get(r1)
            gng r1 = (defpackage.gng) r1
            tj3 r2 = r1.b
            int r2 = r2.g0
            fm4 r3 = r1.i
            fm4 r4 = r1.h
            r6 = 8
            if (r2 != r6) goto L_0x037e
            r4.d(r0)
            r3.d(r0)
            r12 = 1
            r13 = 3
            goto L_0x03c3
        L_0x037e:
            if (r5 <= 0) goto L_0x038b
            if (r5 < r8) goto L_0x038b
            if (r24 == 0) goto L_0x0388
            int r2 = r4.f
            int r0 = r0 - r2
            goto L_0x038b
        L_0x0388:
            int r2 = r4.f
            int r0 = r0 + r2
        L_0x038b:
            if (r24 == 0) goto L_0x0391
            r3.d(r0)
            goto L_0x0394
        L_0x0391:
            r4.d(r0)
        L_0x0394:
            uo4 r2 = r1.e
            int r10 = r2.g
            int r12 = r1.d
            r13 = 3
            if (r12 != r13) goto L_0x03a5
            int r1 = r1.a
            r12 = 1
            if (r1 != r12) goto L_0x03a6
            int r10 = r2.m
            goto L_0x03a6
        L_0x03a5:
            r12 = 1
        L_0x03a6:
            if (r24 == 0) goto L_0x03aa
            int r0 = r0 - r10
            goto L_0x03ab
        L_0x03aa:
            int r0 = r0 + r10
        L_0x03ab:
            if (r24 == 0) goto L_0x03b1
            r4.d(r0)
            goto L_0x03b4
        L_0x03b1:
            r3.d(r0)
        L_0x03b4:
            if (r5 >= r11) goto L_0x03c3
            if (r5 >= r9) goto L_0x03c3
            if (r24 == 0) goto L_0x03bf
            int r1 = r3.f
            int r1 = -r1
            int r0 = r0 - r1
            goto L_0x03c3
        L_0x03bf:
            int r1 = r3.f
            int r1 = -r1
            int r0 = r0 + r1
        L_0x03c3:
            int r5 = r5 + 1
            goto L_0x0359
        L_0x03c6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yy1.a(cm4):void");
    }

    public final void d() {
        ArrayList arrayList = this.k;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((gng) it.next()).d();
        }
        int size = arrayList.size();
        if (size >= 1) {
            tj3 tj3 = ((gng) arrayList.get(0)).b;
            tj3 tj32 = ((gng) arrayList.get(size - 1)).b;
            int i = this.f;
            fm4 fm4 = this.i;
            fm4 fm42 = this.h;
            if (i == 0) {
                aj3 aj3 = tj3.I;
                aj3 aj32 = tj32.K;
                fm4 i2 = gng.i(aj3, 0);
                int e = aj3.e();
                tj3 m = m();
                if (m != null) {
                    e = m.I.e();
                }
                if (i2 != null) {
                    gng.b(fm42, i2, e);
                }
                fm4 i3 = gng.i(aj32, 0);
                int e2 = aj32.e();
                tj3 n = n();
                if (n != null) {
                    e2 = n.K.e();
                }
                if (i3 != null) {
                    gng.b(fm4, i3, -e2);
                }
            } else {
                aj3 aj33 = tj3.J;
                aj3 aj34 = tj32.L;
                fm4 i4 = gng.i(aj33, 1);
                int e3 = aj33.e();
                tj3 m2 = m();
                if (m2 != null) {
                    e3 = m2.J.e();
                }
                if (i4 != null) {
                    gng.b(fm42, i4, e3);
                }
                fm4 i5 = gng.i(aj34, 1);
                int e4 = aj34.e();
                tj3 n2 = n();
                if (n2 != null) {
                    e4 = n2.L.e();
                }
                if (i5 != null) {
                    gng.b(fm4, i5, -e4);
                }
            }
            fm42.a = this;
            fm4.a = this;
        }
    }

    public final void e() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.k;
            if (i < arrayList.size()) {
                ((gng) arrayList.get(i)).e();
                i++;
            } else {
                return;
            }
        }
    }

    public final void f() {
        this.c = null;
        Iterator it = this.k.iterator();
        while (it.hasNext()) {
            ((gng) it.next()).f();
        }
    }

    public final long j() {
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            gng gng = (gng) arrayList.get(i);
            j = ((long) gng.i.f) + gng.j() + j + ((long) gng.h.f);
        }
        return j;
    }

    public final boolean k() {
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (!((gng) arrayList.get(i)).k()) {
                return false;
            }
        }
        return true;
    }

    public final tj3 m() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.k;
            if (i >= arrayList.size()) {
                return null;
            }
            tj3 tj3 = ((gng) arrayList.get(i)).b;
            if (tj3.g0 != 8) {
                return tj3;
            }
            i++;
        }
    }

    public final tj3 n() {
        ArrayList arrayList = this.k;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            tj3 tj3 = ((gng) arrayList.get(size)).b;
            if (tj3.g0 != 8) {
                return tj3;
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChainRun ");
        sb.append(this.f == 0 ? "horizontal : " : "vertical : ");
        Iterator it = this.k.iterator();
        while (it.hasNext()) {
            sb.append("<");
            sb.append((gng) it.next());
            sb.append("> ");
        }
        return sb.toString();
    }
}
