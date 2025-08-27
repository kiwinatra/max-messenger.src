package defpackage;

/* renamed from: t62  reason: default package */
public final class t62 extends ibf {
    public b32 c;

    public final void c(pf9 pf9, String str) {
        if (str.equals("chat")) {
            this.c = b32.a(pf9);
        } else {
            pf9.A();
        }
    }

    public final String toString() {
        b32 b32 = this.c;
        return "{chat=" + b32 + "}";
    }
}
