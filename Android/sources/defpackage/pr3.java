package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: pr3  reason: default package */
public final class pr3 extends ibf {
    public Map c;
    public long o;

    public final void c(pf9 pf9, String str) {
        str.getClass();
        if (str.equals("presence")) {
            this.c = new HashMap();
            int e0 = ryg.e0(pf9);
            for (int i = 0; i < e0; i++) {
                this.c.put(Long.valueOf(pf9.x0()), ntb.a(pf9));
            }
        } else if (!str.equals("time")) {
            pf9.A();
        } else {
            this.o = pf9.x0();
        }
    }

    public final String toString() {
        int Q = kv0.Q(this.c);
        long j = this.o;
        return "{presence=" + Q + ", time=" + j + "}";
    }
}
