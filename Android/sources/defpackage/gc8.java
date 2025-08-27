package defpackage;

/* renamed from: gc8  reason: default package */
public abstract class gc8 extends q04 {
    public q04 s0(int i, String str) {
        y7e.f(i);
        return str != null ? new i5a(this, str) : this;
    }

    public abstract gc8 t0();

    public String toString() {
        String str;
        gc8 gc8;
        bi4 bi4 = dq4.a;
        gc8 gc82 = lc8.a;
        if (this == gc82) {
            str = "Dispatchers.Main";
        } else {
            try {
                gc8 = gc82.t0();
            } catch (UnsupportedOperationException unused) {
                gc8 = null;
            }
            str = this == gc8 ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        return getClass().getSimpleName() + '@' + n79.A(this);
    }
}
