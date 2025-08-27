package defpackage;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* renamed from: t93  reason: default package */
public final class t93 extends AbstractMap implements Serializable {
    public static final Object X = new Object();
    public transient Object a;
    public transient int[] b;
    public transient Object[] c;
    public transient Object[] o;
    public transient int v;
    public transient int w;
    public transient q93 x;
    public transient q93 y;
    public transient o2 z;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.AbstractMap, t93] */
    public static t93 a(int i) {
        ? abstractMap = new AbstractMap();
        if (i >= 0) {
            abstractMap.v = Math.min(Math.max(i, 1), 1073741823);
            return abstractMap;
        }
        throw new IllegalArgumentException("Expected size must be >= 0");
    }

    public final Map b() {
        Object obj = this.a;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public final int c() {
        return (1 << (this.v & 31)) - 1;
    }

    public final void clear() {
        if (!f()) {
            this.v += 32;
            Map b2 = b();
            if (b2 != null) {
                this.v = Math.min(Math.max(size(), 3), 1073741823);
                b2.clear();
                this.a = null;
                this.w = 0;
                return;
            }
            Arrays.fill(i(), 0, this.w, (Object) null);
            Arrays.fill(j(), 0, this.w, (Object) null);
            Object obj = this.a;
            Objects.requireNonNull(obj);
            if (obj instanceof byte[]) {
                Arrays.fill((byte[]) obj, (byte) 0);
            } else if (obj instanceof short[]) {
                Arrays.fill((short[]) obj, 0);
            } else {
                Arrays.fill((int[]) obj, 0);
            }
            Arrays.fill(h(), 0, this.w, 0);
            this.w = 0;
        }
    }

    public final boolean containsKey(Object obj) {
        Map b2 = b();
        return b2 != null ? b2.containsKey(obj) : d(obj) != -1;
    }

    public final boolean containsValue(Object obj) {
        Map b2 = b();
        if (b2 != null) {
            return b2.containsValue(obj);
        }
        for (int i = 0; i < this.w; i++) {
            if (cjf.n(obj, j()[i])) {
                return true;
            }
        }
        return false;
    }

    public final int d(Object obj) {
        if (f()) {
            return -1;
        }
        int d0 = iq.d0(obj);
        int c2 = c();
        Object obj2 = this.a;
        Objects.requireNonNull(obj2);
        int Y = y7e.Y(d0 & c2, obj2);
        if (Y == 0) {
            return -1;
        }
        int i = ~c2;
        int i2 = d0 & i;
        do {
            int i3 = Y - 1;
            int i4 = h()[i3];
            if ((i4 & i) == i2 && cjf.n(obj, i()[i3])) {
                return i3;
            }
            Y = i4 & c2;
        } while (Y != 0);
        return -1;
    }

    public final void e(int i, int i2) {
        Object obj = this.a;
        Objects.requireNonNull(obj);
        int[] h = h();
        Object[] i3 = i();
        Object[] j = j();
        int size = size();
        int i4 = size - 1;
        if (i < i4) {
            Object obj2 = i3[i4];
            i3[i] = obj2;
            j[i] = j[i4];
            i3[i4] = null;
            j[i4] = null;
            h[i] = h[i4];
            h[i4] = 0;
            int d0 = iq.d0(obj2) & i2;
            int Y = y7e.Y(d0, obj);
            if (Y == size) {
                y7e.Z(d0, i + 1, obj);
                return;
            }
            while (true) {
                int i5 = Y - 1;
                int i6 = h[i5];
                int i7 = i6 & i2;
                if (i7 == size) {
                    h[i5] = y7e.M(i6, i + 1, i2);
                    return;
                }
                Y = i7;
            }
        } else {
            i3[i] = null;
            j[i] = null;
            h[i] = 0;
        }
    }

    public final Set entrySet() {
        q93 q93 = this.y;
        if (q93 != null) {
            return q93;
        }
        q93 q932 = new q93(this, 0);
        this.y = q932;
        return q932;
    }

    public final boolean f() {
        return this.a == null;
    }

    public final Object g(Object obj) {
        boolean f = f();
        Object obj2 = X;
        if (f) {
            return obj2;
        }
        int c2 = c();
        Object obj3 = this.a;
        Objects.requireNonNull(obj3);
        int T = y7e.T(obj, (Object) null, c2, obj3, h(), i(), (Object[]) null);
        if (T == -1) {
            return obj2;
        }
        Object obj4 = j()[T];
        e(T, c2);
        this.w--;
        this.v += 32;
        return obj4;
    }

    public final Object get(Object obj) {
        Map b2 = b();
        if (b2 != null) {
            return b2.get(obj);
        }
        int d = d(obj);
        if (d == -1) {
            return null;
        }
        return j()[d];
    }

    public final int[] h() {
        int[] iArr = this.b;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    public final Object[] i() {
        Object[] objArr = this.c;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public final boolean isEmpty() {
        return size() == 0;
    }

    public final Object[] j() {
        Object[] objArr = this.o;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public final int k(int i, int i2, int i3, int i4) {
        Object g = y7e.g(i2);
        int i5 = i2 - 1;
        if (i4 != 0) {
            y7e.Z(i3 & i5, i4 + 1, g);
        }
        Object obj = this.a;
        Objects.requireNonNull(obj);
        int[] h = h();
        for (int i6 = 0; i6 <= i; i6++) {
            int Y = y7e.Y(i6, obj);
            while (Y != 0) {
                int i7 = Y - 1;
                int i8 = h[i7];
                int i9 = ((~i) & i8) | i6;
                int i10 = i9 & i5;
                int Y2 = y7e.Y(i10, g);
                y7e.Z(i10, Y, g);
                h[i7] = y7e.M(i9, Y2, i5);
                Y = i8 & i;
            }
        }
        this.a = g;
        this.v = y7e.M(this.v, 32 - Integer.numberOfLeadingZeros(i5), 31);
        return i5;
    }

    public final Set keySet() {
        q93 q93 = this.x;
        if (q93 != null) {
            return q93;
        }
        q93 q932 = new q93(this, 1);
        this.x = q932;
        return q932;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0107 A[SYNTHETIC] */
    public final java.lang.Object put(java.lang.Object r21, java.lang.Object r22) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r22
            boolean r3 = r20.f()
            r4 = 4
            r5 = 2
            r6 = 32
            r7 = 1
            if (r3 == 0) goto L_0x0063
            boolean r3 = r20.f()
            if (r3 == 0) goto L_0x005b
            int r3 = r0.v
            int r8 = r3 + 1
            int r8 = java.lang.Math.max(r8, r5)
            int r9 = java.lang.Integer.highestOneBit(r8)
            double r10 = (double) r9
            r12 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r12 = r12 * r10
            int r10 = (int) r12
            if (r8 <= r10) goto L_0x0033
            int r8 = r9 << 1
            if (r8 <= 0) goto L_0x0030
        L_0x002e:
            r9 = r8
            goto L_0x0033
        L_0x0030:
            r8 = 1073741824(0x40000000, float:2.0)
            goto L_0x002e
        L_0x0033:
            int r8 = java.lang.Math.max(r4, r9)
            java.lang.Object r9 = defpackage.y7e.g(r8)
            r0.a = r9
            int r8 = r8 - r7
            int r8 = java.lang.Integer.numberOfLeadingZeros(r8)
            int r8 = 32 - r8
            int r9 = r0.v
            r10 = 31
            int r8 = defpackage.y7e.M(r9, r8, r10)
            r0.v = r8
            int[] r8 = new int[r3]
            r0.b = r8
            java.lang.Object[] r8 = new java.lang.Object[r3]
            r0.c = r8
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r0.o = r3
            goto L_0x0063
        L_0x005b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Arrays already allocated"
            r0.<init>(r1)
            throw r0
        L_0x0063:
            java.util.Map r3 = r20.b()
            if (r3 == 0) goto L_0x006e
            java.lang.Object r0 = r3.put(r1, r2)
            return r0
        L_0x006e:
            int[] r3 = r20.h()
            java.lang.Object[] r8 = r20.i()
            java.lang.Object[] r9 = r20.j()
            int r10 = r0.w
            int r11 = r10 + 1
            int r12 = defpackage.iq.d0(r21)
            int r13 = r20.c()
            r14 = r12 & r13
            java.lang.Object r15 = r0.a
            java.util.Objects.requireNonNull(r15)
            int r15 = defpackage.y7e.Y(r14, r15)
            if (r15 != 0) goto L_0x00b0
            if (r11 <= r13) goto L_0x00a6
            if (r13 >= r6) goto L_0x009a
            r16 = 4
            goto L_0x009c
        L_0x009a:
            r16 = 2
        L_0x009c:
            int r3 = r13 + 1
            int r3 = r3 * r16
            int r13 = r0.k(r13, r3, r12, r10)
            goto L_0x0133
        L_0x00a6:
            java.lang.Object r3 = r0.a
            java.util.Objects.requireNonNull(r3)
            defpackage.y7e.Z(r14, r11, r3)
            goto L_0x0133
        L_0x00b0:
            int r14 = ~r13
            r4 = r12 & r14
            r18 = 0
        L_0x00b5:
            int r15 = r15 - r7
            r6 = r3[r15]
            r5 = r6 & r14
            if (r5 != r4) goto L_0x00c9
            r5 = r8[r15]
            boolean r5 = defpackage.cjf.n(r1, r5)
            if (r5 == 0) goto L_0x00c9
            r0 = r9[r15]
            r9[r15] = r2
            return r0
        L_0x00c9:
            r5 = r6 & r13
            r19 = r4
            int r4 = r18 + 1
            if (r5 != 0) goto L_0x018c
            r5 = 9
            if (r4 < r5) goto L_0x011c
            int r3 = r20.c()
            int r3 = r3 + r7
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r5 = 1065353216(0x3f800000, float:1.0)
            r4.<init>(r3, r5)
            boolean r3 = r20.isEmpty()
            r5 = -1
            if (r3 == 0) goto L_0x00eb
        L_0x00e8:
            r17 = r5
            goto L_0x00ed
        L_0x00eb:
            r17 = 0
        L_0x00ed:
            if (r17 < 0) goto L_0x0107
            java.lang.Object[] r3 = r20.i()
            r3 = r3[r17]
            java.lang.Object[] r6 = r20.j()
            r6 = r6[r17]
            r4.put(r3, r6)
            int r3 = r17 + 1
            int r6 = r0.w
            if (r3 >= r6) goto L_0x00e8
            r17 = r3
            goto L_0x00ed
        L_0x0107:
            r0.a = r4
            r3 = 0
            r0.b = r3
            r0.c = r3
            r0.o = r3
            int r3 = r0.v
            r5 = 32
            int r3 = r3 + r5
            r0.v = r3
            java.lang.Object r0 = r4.put(r1, r2)
            return r0
        L_0x011c:
            r5 = 32
            if (r11 <= r13) goto L_0x012d
            if (r13 >= r5) goto L_0x0124
            r4 = 4
            goto L_0x0125
        L_0x0124:
            r4 = 2
        L_0x0125:
            int r3 = r13 + 1
            int r3 = r3 * r4
            int r13 = r0.k(r13, r3, r12, r10)
            goto L_0x0133
        L_0x012d:
            int r4 = defpackage.y7e.M(r6, r11, r13)
            r3[r15] = r4
        L_0x0133:
            int[] r3 = r20.h()
            int r3 = r3.length
            if (r11 <= r3) goto L_0x0169
            int r4 = r3 >>> 1
            int r4 = java.lang.Math.max(r7, r4)
            int r4 = r4 + r3
            r4 = r4 | r7
            r5 = 1073741823(0x3fffffff, float:1.9999999)
            int r4 = java.lang.Math.min(r5, r4)
            if (r4 == r3) goto L_0x0169
            int[] r3 = r20.h()
            int[] r3 = java.util.Arrays.copyOf(r3, r4)
            r0.b = r3
            java.lang.Object[] r3 = r20.i()
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r4)
            r0.c = r3
            java.lang.Object[] r3 = r20.j()
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r4)
            r0.o = r3
        L_0x0169:
            r6 = 0
            int r3 = defpackage.y7e.M(r12, r6, r13)
            int[] r4 = r20.h()
            r4[r10] = r3
            java.lang.Object[] r3 = r20.i()
            r3[r10] = r1
            java.lang.Object[] r1 = r20.j()
            r1[r10] = r2
            r0.w = r11
            int r1 = r0.v
            r15 = 32
            int r1 = r1 + r15
            r0.v = r1
            r17 = 0
            return r17
        L_0x018c:
            r18 = r4
            r15 = r5
            r4 = r19
            r6 = 32
            goto L_0x00b5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t93.put(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public final Object remove(Object obj) {
        Map b2 = b();
        if (b2 != null) {
            return b2.remove(obj);
        }
        Object g = g(obj);
        if (g == X) {
            return null;
        }
        return g;
    }

    public final int size() {
        Map b2 = b();
        return b2 != null ? b2.size() : this.w;
    }

    public final Collection values() {
        o2 o2Var = this.z;
        if (o2Var != null) {
            return o2Var;
        }
        o2 o2Var2 = new o2(1, this);
        this.z = o2Var2;
        return o2Var2;
    }
}
