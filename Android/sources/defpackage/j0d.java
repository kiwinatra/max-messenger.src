package defpackage;

/* renamed from: j0d  reason: default package */
public final class j0d extends db7 {
    public static final j0d X = new j0d();
    public final transient Object v;
    public final transient Object[] w;
    public final transient int x;
    public final transient int y;
    public final transient j0d z;

    public j0d() {
        this.v = null;
        this.w = new Object[0];
        this.x = 0;
        this.y = 0;
        this.z = this;
    }

    public final dc7 c() {
        return new m0d(this, this.w, this.x, this.y);
    }

    public final dc7 d() {
        return new n0d(this, new o0d(this.w, this.x, this.y));
    }

    public final boolean g() {
        return false;
    }

    public final Object get(Object obj) {
        Object k = p0d.k(this.v, this.w, this.y, this.x, obj);
        if (k == null) {
            return null;
        }
        return k;
    }

    public final int size() {
        return this.y;
    }

    public j0d(Object obj, Object[] objArr, int i, j0d j0d) {
        this.v = obj;
        this.w = objArr;
        this.x = 1;
        this.y = i;
        this.z = j0d;
    }

    public j0d(Object[] objArr, int i) {
        this.w = objArr;
        this.y = i;
        this.x = 0;
        int n = i >= 2 ? dc7.n(i) : 0;
        Object j = p0d.j(objArr, i, n, 0);
        if (!(j instanceof Object[])) {
            this.v = j;
            Object j2 = p0d.j(objArr, i, n, 1);
            if (!(j2 instanceof Object[])) {
                this.z = new j0d(j2, objArr, i, this);
                return;
            }
            throw ((vb7) ((Object[]) j2)[2]).a();
        }
        throw ((vb7) ((Object[]) j)[2]).a();
    }
}
