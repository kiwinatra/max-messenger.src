package defpackage;

/* renamed from: v1  reason: default package */
public abstract class v1 implements zp7 {
    public abstract void a(String str);

    public final void b(double d) {
        if (Double.isInfinite(d) || Double.isNaN(d)) {
            throw new IllegalArgumentException("Numeric value to be finite but was " + d);
        }
        a(Double.toString(d));
    }

    public void d0() {
        a("null");
    }
}
