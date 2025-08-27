package defpackage;

/* renamed from: dye  reason: default package */
public abstract class dye extends fm {
    public final Object b;

    public dye(String str, String str2) {
        super(str);
        this.b = str2;
    }

    public final void d(zp7 zp7) {
        Object obj = this.b;
        if (obj == null || ((CharSequence) obj).length() == 0) {
            zp7.getClass();
            return;
        }
        zp7.h0(this.a);
        ((v1) zp7).i((String) obj);
    }

    public final String toString() {
        return this.a + " = " + this.b;
    }
}
