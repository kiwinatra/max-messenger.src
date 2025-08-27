package defpackage;

/* renamed from: tl2  reason: default package */
public final class tl2 extends ibf {
    public b32 c;

    public final void c(pf9 pf9, String str) {
        str.getClass();
        if (!str.equals("chat")) {
            pf9.A();
        } else {
            this.c = b32.a(pf9);
        }
    }

    public final String toString() {
        b32 b32 = this.c;
        return "{chat=" + b32 + "}";
    }
}
