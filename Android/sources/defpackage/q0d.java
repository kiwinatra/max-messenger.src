package defpackage;

/* renamed from: q0d  reason: default package */
public final class q0d extends dc7 {
    public static final q0d X;
    public static final Object[] z;
    public final transient Object[] o;
    public final transient int v;
    public final transient Object[] w;
    public final transient int x;
    public final transient int y;

    static {
        Object[] objArr = new Object[0];
        z = objArr;
        X = new q0d(objArr, objArr, 0, 0, 0);
    }

    public q0d(Object[] objArr, Object[] objArr2, int i, int i2, int i3) {
        this.o = objArr;
        this.v = i;
        this.w = objArr2;
        this.x = i2;
        this.y = i3;
    }

    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.w;
            if (objArr.length != 0) {
                int d0 = iq.d0(obj);
                while (true) {
                    int i = d0 & this.x;
                    Object obj2 = objArr[i];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    d0 = i + 1;
                }
            }
        }
        return false;
    }

    public final int d(int i, Object[] objArr) {
        Object[] objArr2 = this.o;
        int i2 = this.y;
        System.arraycopy(objArr2, 0, objArr, i, i2);
        return i + i2;
    }

    public final Object[] e() {
        return this.o;
    }

    public final int f() {
        return this.y;
    }

    public final int g() {
        return 0;
    }

    public final int hashCode() {
        return this.v;
    }

    public final boolean l() {
        return false;
    }

    public final wvf m() {
        return b().listIterator(0);
    }

    public final tb7 q() {
        return tb7.n(this.y, this.o);
    }

    public final int size() {
        return this.y;
    }
}
