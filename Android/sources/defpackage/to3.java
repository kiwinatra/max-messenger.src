package defpackage;

import java.util.List;

/* renamed from: to3  reason: default package */
public final class to3 extends ibf {
    public List c;

    public final void c(pf9 pf9, String str) {
        str.getClass();
        if (!str.equals("contacts")) {
            pf9.A();
        } else {
            this.c = a00.e(pf9);
        }
    }

    public final String toString() {
        return a81.j(kv0.o(this.c), "{contactInfos=", "}");
    }
}
