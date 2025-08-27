package defpackage;

/* renamed from: bi4  reason: default package */
public final class bi4 extends pfd {
    public static final bi4 c = new pfd(jef.e, jef.a, jef.c, jef.d);

    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    public final q04 s0(int i, String str) {
        y7e.f(i);
        return i >= jef.c ? str != null ? new i5a(this, str) : this : super.s0(i, str);
    }

    public final String toString() {
        return "Dispatchers.Default";
    }
}
