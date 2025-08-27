package defpackage;

/* renamed from: ovc  reason: default package */
public final class ovc extends ibf {
    public String c;
    public boolean o;

    public final void c(pf9 pf9, String str) {
        str.getClass();
        if (str.equals("tls")) {
            this.o = pf9.v0();
        } else if (!str.equals("redirectHost")) {
            pf9.A();
        } else {
            this.c = ryg.g0(pf9);
        }
    }

    public final String d() {
        int indexOf;
        if (cvg.A(this.c) || (indexOf = this.c.indexOf(":")) <= 0) {
            return null;
        }
        String str = this.c;
        return str.substring(indexOf + 1, str.length());
    }

    public final String toString() {
        String str = this.c;
        boolean z = this.o;
        return "{redirectHost='" + str + "', tls=" + z + "}";
    }
}
