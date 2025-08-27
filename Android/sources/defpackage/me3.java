package defpackage;

/* renamed from: me3  reason: default package */
public final class me3 extends ibf {
    public String c;
    public n0g o;

    public final void c(pf9 pf9, String str) {
        str.getClass();
        if (str.equals("hash")) {
            this.c = pf9.A0();
        } else if (!str.equals("user")) {
            pf9.A();
        } else {
            this.o = af3.a(pf9);
        }
    }

    public final String toString() {
        String str = this.c;
        n0g n0g = this.o;
        return "{hash='" + str + "', userSettings=" + n0g + "}";
    }
}
