package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: ys2  reason: default package */
public final class ys2 extends ibf {
    public List c;
    public long o;

    public ys2(pf9 pf9) {
        super(pf9);
        if (this.c == null) {
            this.c = Collections.emptyList();
        }
    }

    public final void c(pf9 pf9, String str) {
        str.getClass();
        if (str.equals("marker")) {
            this.o = pf9.x0();
        } else if (!str.equals("chats")) {
            pf9.A();
        } else {
            this.c = a00.d(pf9);
        }
    }

    public final String toString() {
        long j = this.o;
        int o2 = kv0.o(this.c);
        return "marker=" + j + ", chats=" + o2;
    }
}
