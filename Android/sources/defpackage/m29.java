package defpackage;

/* renamed from: m29  reason: default package */
public abstract class m29 implements lz7 {
    public final boolean f(lz7 lz7) {
        if (!(lz7 instanceof m29)) {
            return false;
        }
        m29 m29 = (m29) lz7;
        return m() == m29.m() && j() == m29.j();
    }

    public abstract long j();

    public abstract long m();
}
