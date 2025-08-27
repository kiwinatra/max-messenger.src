package defpackage;

/* renamed from: qk4  reason: default package */
public class qk4 extends vl0 {
    public final cla a;
    public Object b;

    public qk4(cla cla) {
        this.a = cla;
    }

    public void a(Object obj) {
        e(obj);
    }

    public final void clear() {
        lazySet(32);
        this.b = null;
    }

    public void dispose() {
        set(4);
        this.b = null;
    }

    public final void e(Object obj) {
        int i = get();
        if ((i & 54) == 0) {
            cla cla = this.a;
            if (i == 8) {
                this.b = obj;
                lazySet(16);
                cla.d((Object) null);
            } else {
                lazySet(2);
                cla.d(obj);
            }
            if (get() != 4) {
                cla.b();
            }
        }
    }

    public final boolean f() {
        return get() == 4;
    }

    public final boolean isEmpty() {
        return get() != 16;
    }

    public final int p(int i) {
        lazySet(8);
        return 2;
    }

    public final Object poll() {
        if (get() != 16) {
            return null;
        }
        Object obj = this.b;
        this.b = null;
        lazySet(32);
        return obj;
    }
}
