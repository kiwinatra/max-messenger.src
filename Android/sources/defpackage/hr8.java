package defpackage;

/* renamed from: hr8  reason: default package */
public interface hr8 extends lz7 {
    boolean f(lz7 lz7) {
        if (!(lz7 instanceof hr8)) {
            return false;
        }
        hr8 hr8 = (hr8) lz7;
        return m() == hr8.m() && j() == hr8.j();
    }

    long j();

    long m();

    String v();
}
