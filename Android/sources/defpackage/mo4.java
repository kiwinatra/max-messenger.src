package defpackage;

import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.List;

/* renamed from: mo4  reason: default package */
public final class mo4 {
    public final int a;
    public boolean b;
    public int c;
    public final Object d;
    public final Serializable e;
    public Object f;
    public final Object g;

    /* JADX WARNING: type inference failed for: r12v0, types: [int[], java.io.Serializable] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public mo4(defpackage.o5a r10, java.util.ArrayList r11, int[] r12, int[] r13) {
        /*
            r9 = this;
            r9.<init>()
            r9.d = r11
            r9.e = r12
            r9.f = r13
            r0 = 0
            java.util.Arrays.fill(r12, r0)
            java.util.Arrays.fill(r13, r0)
            r9.g = r10
            int r12 = r10.t()
            r9.a = r12
            int r10 = r10.s()
            r9.c = r10
            r13 = 1
            r9.b = r13
            boolean r1 = r11.isEmpty()
            if (r1 == 0) goto L_0x0029
            r1 = 0
            goto L_0x002f
        L_0x0029:
            java.lang.Object r1 = r11.get(r0)
            lo4 r1 = (defpackage.lo4) r1
        L_0x002f:
            if (r1 == 0) goto L_0x0039
            int r2 = r1.a
            if (r2 != 0) goto L_0x0039
            int r1 = r1.b
            if (r1 == 0) goto L_0x0041
        L_0x0039:
            lo4 r1 = new lo4
            r1.<init>(r0, r0, r0)
            r11.add(r0, r1)
        L_0x0041:
            lo4 r1 = new lo4
            r1.<init>(r12, r10, r0)
            r11.add(r1)
            java.util.Iterator r10 = r11.iterator()
        L_0x004d:
            boolean r12 = r10.hasNext()
            java.lang.Object r1 = r9.f
            int[] r1 = (int[]) r1
            java.io.Serializable r2 = r9.e
            int[] r2 = (int[]) r2
            java.lang.Object r3 = r9.g
            o5a r3 = (defpackage.o5a) r3
            if (r12 == 0) goto L_0x0086
            java.lang.Object r12 = r10.next()
            lo4 r12 = (defpackage.lo4) r12
            r4 = r0
        L_0x0066:
            int r5 = r12.c
            if (r4 >= r5) goto L_0x004d
            int r5 = r12.a
            int r5 = r5 + r4
            int r6 = r12.b
            int r6 = r6 + r4
            boolean r7 = r3.c(r5, r6)
            if (r7 == 0) goto L_0x0078
            r7 = r13
            goto L_0x0079
        L_0x0078:
            r7 = 2
        L_0x0079:
            int r8 = r6 << 4
            r8 = r8 | r7
            r2[r5] = r8
            int r5 = r5 << 4
            r5 = r5 | r7
            r1[r6] = r5
            int r4 = r4 + 1
            goto L_0x0066
        L_0x0086:
            boolean r9 = r9.b
            if (r9 == 0) goto L_0x00e4
            java.util.Iterator r9 = r11.iterator()
            r10 = r0
        L_0x008f:
            boolean r12 = r9.hasNext()
            if (r12 == 0) goto L_0x00e4
            java.lang.Object r12 = r9.next()
            lo4 r12 = (defpackage.lo4) r12
        L_0x009b:
            int r13 = r12.a
            if (r10 >= r13) goto L_0x00e0
            r13 = r2[r10]
            if (r13 != 0) goto L_0x00dd
            int r13 = r11.size()
            r4 = r0
            r5 = r4
        L_0x00a9:
            if (r4 >= r13) goto L_0x00dd
            java.lang.Object r6 = r11.get(r4)
            lo4 r6 = (defpackage.lo4) r6
        L_0x00b1:
            int r7 = r6.b
            if (r5 >= r7) goto L_0x00d7
            r7 = r1[r5]
            if (r7 != 0) goto L_0x00d4
            boolean r7 = r3.d(r10, r5)
            if (r7 == 0) goto L_0x00d4
            boolean r13 = r3.c(r10, r5)
            if (r13 == 0) goto L_0x00c8
            r13 = 8
            goto L_0x00c9
        L_0x00c8:
            r13 = 4
        L_0x00c9:
            int r4 = r5 << 4
            r4 = r4 | r13
            r2[r10] = r4
            int r4 = r10 << 4
            r13 = r13 | r4
            r1[r5] = r13
            goto L_0x00dd
        L_0x00d4:
            int r5 = r5 + 1
            goto L_0x00b1
        L_0x00d7:
            int r5 = r6.c
            int r5 = r5 + r7
            int r4 = r4 + 1
            goto L_0x00a9
        L_0x00dd:
            int r10 = r10 + 1
            goto L_0x009b
        L_0x00e0:
            int r10 = r12.c
            int r10 = r10 + r13
            goto L_0x008f
        L_0x00e4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mo4.<init>(o5a, java.util.ArrayList, int[], int[]):void");
    }

    public static no4 b(ArrayDeque arrayDeque, int i, boolean z) {
        no4 no4;
        Iterator it = arrayDeque.iterator();
        while (true) {
            if (!it.hasNext()) {
                no4 = null;
                break;
            }
            no4 = (no4) it.next();
            if (no4.a == i && no4.c == z) {
                it.remove();
                break;
            }
        }
        while (it.hasNext()) {
            no4 no42 = (no4) it.next();
            if (z) {
                no42.b--;
            } else {
                no42.b++;
            }
        }
        return no4;
    }

    public void a(y35 y35) {
        int[] iArr;
        o5a o5a;
        int i;
        int i2;
        int i3;
        List list;
        mo4 mo4 = this;
        hm0 hm0 = new hm0(y35);
        ArrayDeque arrayDeque = new ArrayDeque();
        List list2 = (List) mo4.d;
        int size = list2.size() - 1;
        int i4 = mo4.a;
        int i5 = mo4.c;
        int i6 = i4;
        while (size >= 0) {
            lo4 lo4 = (lo4) list2.get(size);
            int i7 = lo4.a;
            int i8 = lo4.c;
            int i9 = i7 + i8;
            int i10 = lo4.b;
            int i11 = i10 + i8;
            while (true) {
                iArr = (int[]) mo4.e;
                o5a = (o5a) mo4.g;
                i = 0;
                if (i6 <= i9) {
                    break;
                }
                i6--;
                int i12 = iArr[i6];
                if ((i12 & 12) != 0) {
                    list = list2;
                    int i13 = i12 >> 4;
                    no4 b2 = b(arrayDeque, i13, false);
                    if (b2 != null) {
                        i3 = i5;
                        int i14 = (i4 - b2.b) - 1;
                        hm0.c(i6, i14);
                        if ((i12 & 4) != 0) {
                            hm0.m(i14, 1, o5a.n(i6, i13));
                        }
                    } else {
                        i3 = i5;
                        arrayDeque.add(new no4(i6, (i4 - i6) - 1, true));
                    }
                } else {
                    list = list2;
                    i3 = i5;
                    hm0.h(i6, 1);
                    i4--;
                }
                list2 = list;
                i5 = i3;
            }
            List list3 = list2;
            int i15 = i5;
            while (i5 > i11) {
                i5--;
                int i16 = ((int[]) mo4.f)[i5];
                if ((i16 & 12) != 0) {
                    int i17 = i16 >> 4;
                    no4 b3 = b(arrayDeque, i17, true);
                    if (b3 == null) {
                        arrayDeque.add(new no4(i5, i4 - i6, false));
                        i2 = 0;
                    } else {
                        i2 = 0;
                        hm0.c((i4 - b3.b) - 1, i6);
                        if ((i16 & 4) != 0) {
                            hm0.m(i6, 1, o5a.n(i17, i5));
                        }
                    }
                } else {
                    i2 = i;
                    hm0.f(i6, 1);
                    i4++;
                }
                mo4 = this;
                i = i2;
            }
            int i18 = i;
            i6 = lo4.a;
            int i19 = i6;
            int i20 = i10;
            while (i < i8) {
                if ((iArr[i19] & 15) == 2) {
                    hm0.m(i19, 1, o5a.n(i19, i20));
                }
                i19++;
                i20++;
                i++;
            }
            size--;
            mo4 = this;
            i5 = i10;
            list2 = list3;
        }
        hm0.a();
    }

    public mo4(lyc lyc, z3f z3f, xjf xjf, int i) {
        this.g = lyc;
        this.b = false;
        this.c = 0;
        this.f = null;
        this.d = z3f;
        this.e = xjf;
        this.a = i;
    }
}
