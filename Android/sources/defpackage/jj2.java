package defpackage;

import java.util.ArrayList;

/* renamed from: jj2  reason: default package */
public final class jj2 extends ibf {
    public ArrayList c;
    public long o = -1;

    public jj2(pf9 pf9) {
        super(pf9);
        if (this.c == null) {
            this.c = new ArrayList();
        }
    }

    public final void c(pf9 pf9, String str) {
        str.getClass();
        if (str.equals("marker")) {
            this.o = pf9.x0();
        } else if (!str.equals("members")) {
            pf9.A();
        } else {
            int X = ryg.X(pf9);
            this.c = new ArrayList();
            for (int i = 0; i < X; i++) {
                this.c.add(bj2.a(pf9));
            }
        }
    }

    public final String toString() {
        int o2 = kv0.o(this.c);
        long j = this.o;
        return "{members=" + o2 + ", marker=" + j + "}";
    }
}
