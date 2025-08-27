package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.uuid.Uuid;

/* renamed from: f37  reason: default package */
public final class f37 {
    public int a;
    public boolean b;
    public int c;
    public zw6[] d;
    public int e;
    public int f;
    public int g;
    public final boolean h = true;
    public final rt0 i;

    public f37(rt0 rt0) {
        this.i = rt0;
        this.a = IntCompanionObject.MAX_VALUE;
        this.c = ConstantsKt.DEFAULT_BLOCK_SIZE;
        this.d = new zw6[8];
        this.e = 7;
    }

    public final void a(int i2) {
        int i3;
        if (i2 > 0) {
            int length = this.d.length - 1;
            int i4 = 0;
            while (true) {
                i3 = this.e;
                if (length < i3 || i2 <= 0) {
                    zw6[] zw6Arr = this.d;
                    int i5 = i3 + 1;
                    System.arraycopy(zw6Arr, i5, zw6Arr, i5 + i4, this.f);
                    zw6[] zw6Arr2 = this.d;
                    int i6 = this.e + 1;
                    Arrays.fill(zw6Arr2, i6, i6 + i4, (Object) null);
                    this.e += i4;
                } else {
                    int i7 = this.d[length].a;
                    i2 -= i7;
                    this.g -= i7;
                    this.f--;
                    i4++;
                    length--;
                }
            }
            zw6[] zw6Arr3 = this.d;
            int i52 = i3 + 1;
            System.arraycopy(zw6Arr3, i52, zw6Arr3, i52 + i4, this.f);
            zw6[] zw6Arr22 = this.d;
            int i62 = this.e + 1;
            Arrays.fill(zw6Arr22, i62, i62 + i4, (Object) null);
            this.e += i4;
        }
    }

    public final void b(zw6 zw6) {
        int i2 = this.c;
        int i3 = zw6.a;
        if (i3 > i2) {
            ArraysKt___ArraysJvmKt.fill$default((Object[]) this.d, (Object) null, 0, 0, 6, (Object) null);
            this.e = this.d.length - 1;
            this.f = 0;
            this.g = 0;
            return;
        }
        a((this.g + i3) - i2);
        int i4 = this.f + 1;
        zw6[] zw6Arr = this.d;
        if (i4 > zw6Arr.length) {
            zw6[] zw6Arr2 = new zw6[(zw6Arr.length * 2)];
            System.arraycopy(zw6Arr, 0, zw6Arr2, zw6Arr.length, zw6Arr.length);
            this.e = this.d.length - 1;
            this.d = zw6Arr2;
        }
        int i5 = this.e;
        this.e = i5 - 1;
        this.d[i5] = zw6;
        this.f++;
        this.g += i3;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v8, resolved type: byte} */
    /* JADX WARNING: type inference failed for: r1v6, types: [java.lang.Object, rt0] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(defpackage.vw0 r13) {
        /*
            r12 = this;
            r0 = 8
            boolean r1 = r12.h
            rt0 r2 = r12.i
            r3 = 127(0x7f, float:1.78E-43)
            r4 = 0
            if (r1 == 0) goto L_0x008d
            int[] r1 = defpackage.t57.a
            int r1 = r13.c()
            r5 = 0
            r7 = r4
            r8 = r5
        L_0x0015:
            if (r7 >= r1) goto L_0x0028
            byte r10 = r13.f(r7)
            byte[] r11 = defpackage.u0g.a
            r10 = r10 & 255(0xff, float:3.57E-43)
            byte[] r11 = defpackage.t57.b
            byte r10 = r11[r10]
            long r10 = (long) r10
            long r8 = r8 + r10
            int r7 = r7 + 1
            goto L_0x0015
        L_0x0028:
            r1 = 7
            long r10 = (long) r1
            long r8 = r8 + r10
            r1 = 3
            long r7 = r8 >> r1
            int r1 = (int) r7
            int r7 = r13.c()
            if (r1 >= r7) goto L_0x008d
            rt0 r1 = new rt0
            r1.<init>()
            int[] r7 = defpackage.t57.a
            int r7 = r13.c()
            r8 = r5
            r5 = r4
        L_0x0042:
            if (r4 >= r7) goto L_0x0065
            byte r6 = r13.f(r4)
            byte[] r10 = defpackage.u0g.a
            r6 = r6 & 255(0xff, float:3.57E-43)
            int[] r10 = defpackage.t57.a
            r10 = r10[r6]
            byte[] r11 = defpackage.t57.b
            byte r6 = r11[r6]
            long r8 = r8 << r6
            long r10 = (long) r10
            long r8 = r8 | r10
            int r5 = r5 + r6
        L_0x0058:
            if (r5 < r0) goto L_0x0062
            int r5 = r5 - r0
            long r10 = r8 >> r5
            int r6 = (int) r10
            r1.u0(r6)
            goto L_0x0058
        L_0x0062:
            int r4 = r4 + 1
            goto L_0x0042
        L_0x0065:
            if (r5 <= 0) goto L_0x0073
            int r0 = r0 - r5
            long r6 = r8 << r0
            r8 = 255(0xff, double:1.26E-321)
            long r4 = r8 >>> r5
            long r4 = r4 | r6
            int r13 = (int) r4
            r1.u0(r13)
        L_0x0073:
            long r4 = r1.b
            vw0 r13 = r1.f(r4)
            int r0 = r13.c()
            r1 = 128(0x80, float:1.794E-43)
            r12.e(r0, r3, r1)
            r2.getClass()
            int r12 = r13.c()
            r13.k(r2, r12)
            goto L_0x009e
        L_0x008d:
            int r0 = r13.c()
            r12.e(r0, r3, r4)
            r2.getClass()
            int r12 = r13.c()
            r13.k(r2, r12)
        L_0x009e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f37.c(vw0):void");
    }

    public final void d(ArrayList arrayList) {
        int i2;
        int i3;
        if (this.b) {
            int i4 = this.a;
            if (i4 < this.c) {
                e(i4, 31, 32);
            }
            this.b = false;
            this.a = IntCompanionObject.MAX_VALUE;
            e(this.c, 31, 32);
        }
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            zw6 zw6 = (zw6) arrayList.get(i5);
            vw0 i6 = zw6.b.i();
            Integer num = (Integer) g37.b.get(i6);
            vw0 vw0 = zw6.c;
            if (num != null) {
                int intValue = num.intValue();
                i2 = intValue + 1;
                if (2 <= i2 && 7 >= i2) {
                    zw6[] zw6Arr = g37.a;
                    if (Intrinsics.areEqual((Object) zw6Arr[intValue].c, (Object) vw0)) {
                        i3 = i2;
                    } else if (Intrinsics.areEqual((Object) zw6Arr[i2].c, (Object) vw0)) {
                        int i7 = i2;
                        i2 = intValue + 2;
                        i3 = i7;
                    }
                }
                i3 = i2;
                i2 = -1;
            } else {
                i3 = -1;
                i2 = -1;
            }
            if (i2 == -1) {
                int i8 = this.e + 1;
                int length = this.d.length;
                while (true) {
                    if (i8 >= length) {
                        break;
                    }
                    if (Intrinsics.areEqual((Object) this.d[i8].b, (Object) i6)) {
                        if (Intrinsics.areEqual((Object) this.d[i8].c, (Object) vw0)) {
                            i2 = g37.a.length + (i8 - this.e);
                            break;
                        } else if (i3 == -1) {
                            i3 = (i8 - this.e) + g37.a.length;
                        }
                    }
                    i8++;
                }
            }
            if (i2 != -1) {
                e(i2, 127, Uuid.SIZE_BITS);
            } else if (i3 == -1) {
                this.i.u0(64);
                c(i6);
                c(vw0);
                b(zw6);
            } else {
                vw0 vw02 = zw6.d;
                i6.getClass();
                if (!i6.h(vw02.c(), vw02) || !(!Intrinsics.areEqual((Object) zw6.i, (Object) i6))) {
                    e(i3, 63, 64);
                    c(vw0);
                    b(zw6);
                } else {
                    e(i3, 15, 0);
                    c(vw0);
                }
            }
        }
    }

    public final void e(int i2, int i3, int i4) {
        rt0 rt0 = this.i;
        if (i2 < i3) {
            rt0.u0(i2 | i4);
            return;
        }
        rt0.u0(i4 | i3);
        int i5 = i2 - i3;
        while (i5 >= 128) {
            rt0.u0(128 | (i5 & 127));
            i5 >>>= 7;
        }
        rt0.u0(i5);
    }
}
