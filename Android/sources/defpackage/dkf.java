package defpackage;

/* renamed from: dkf  reason: default package */
public final class dkf implements jv0 {
    public Object a;
    public Object b;
    public int c;
    public long o;
    public long v;
    public boolean w;
    public p9 x = p9.w;

    public final long a(int i, int i2) {
        n9 a2 = this.x.a(i);
        if (a2.b != -1) {
            return a2.v[i2];
        }
        return -9223372036854775807L;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0036, code lost:
        r2 = r0.a(r8);
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int b(long r9) {
        /*
            r8 = this;
            p9 r0 = r8.x
            long r1 = r8.o
            r0.getClass()
            r3 = -9223372036854775808
            int r8 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            r5 = -1
            if (r8 == 0) goto L_0x004b
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r8 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x001c
            int r8 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r8 < 0) goto L_0x001c
            goto L_0x004b
        L_0x001c:
            int r8 = r0.o
        L_0x001e:
            int r1 = r0.a
            if (r8 >= r1) goto L_0x0048
            n9 r2 = r0.a(r8)
            long r6 = r2.a
            int r2 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x0036
            n9 r2 = r0.a(r8)
            long r6 = r2.a
            int r2 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r2 <= 0) goto L_0x0045
        L_0x0036:
            n9 r2 = r0.a(r8)
            int r6 = r2.b
            if (r6 == r5) goto L_0x0048
            int r2 = r2.a(r5)
            if (r2 >= r6) goto L_0x0045
            goto L_0x0048
        L_0x0045:
            int r8 = r8 + 1
            goto L_0x001e
        L_0x0048:
            if (r8 >= r1) goto L_0x004b
            r5 = r8
        L_0x004b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dkf.b(long):int");
    }

    public final int c(long j) {
        p9 p9Var = this.x;
        long j2 = this.o;
        int i = p9Var.a - 1;
        while (i >= 0 && j != Long.MIN_VALUE) {
            long j3 = p9Var.a(i).a;
            if (j3 != Long.MIN_VALUE) {
                if (j >= j3) {
                    break;
                }
            } else if (j2 != -9223372036854775807L && j >= j2) {
                break;
            }
            i--;
        }
        if (i >= 0) {
            n9 a2 = p9Var.a(i);
            int i2 = a2.b;
            if (i2 == -1) {
                return i;
            }
            for (int i3 = 0; i3 < i2; i3++) {
                int i4 = a2.o[i3];
                if (i4 == 0 || i4 == 1) {
                    return i;
                }
            }
        }
        return -1;
    }

    public final int d(int i, int i2) {
        n9 a2 = this.x.a(i);
        if (a2.b != -1) {
            return a2.o[i2];
        }
        return 0;
    }

    public final int e(int i) {
        return this.x.a(i).a(-1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (dkf.class.equals(obj.getClass())) {
                dkf dkf = (dkf) obj;
                return t0g.a(this.a, dkf.a) && t0g.a(this.b, dkf.b) && this.c == dkf.c && this.o == dkf.o && this.v == dkf.v && this.w == dkf.w && t0g.a(this.x, dkf.x);
            }
        }
        return false;
    }

    public final long f() {
        return this.v;
    }

    public final boolean g(int i) {
        return this.x.a(i).x;
    }

    public final void h(Object obj, Object obj2, int i, long j, long j2, p9 p9Var, boolean z) {
        this.a = obj;
        this.b = obj2;
        this.c = i;
        this.o = j;
        this.v = j2;
        this.x = p9Var;
        this.w = z;
    }

    public final int hashCode() {
        Object obj = this.a;
        int i = 0;
        int hashCode = (217 + (obj == null ? 0 : obj.hashCode())) * 31;
        Object obj2 = this.b;
        if (obj2 != null) {
            i = obj2.hashCode();
        }
        long j = this.o;
        long j2 = this.v;
        return this.x.hashCode() + ((((((((((hashCode + i) * 31) + this.c) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.w ? 1 : 0)) * 31);
    }
}
