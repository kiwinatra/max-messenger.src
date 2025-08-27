package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: br3  reason: default package */
public final class br3 extends ibf {
    public List c;

    public final void c(pf9 pf9, String str) {
        str.getClass();
        if (!str.equals("contactIds")) {
            pf9.A();
            return;
        }
        this.c = new ArrayList();
        int X = ryg.X(pf9);
        for (int i = 0; i < X; i++) {
            this.c.add(Long.valueOf(pf9.x0()));
        }
    }

    public final String toString() {
        return a81.j(kv0.o(this.c), "{contactIds=", "}");
    }
}
