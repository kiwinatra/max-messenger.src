package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* renamed from: d42  reason: default package */
public final class d42 extends ibf {
    public List c;
    public HashMap o;

    public d42(pf9 pf9) {
        super(pf9);
        if (this.c == null) {
            this.c = Collections.emptyList();
        }
    }

    /* JADX WARNING: type inference failed for: r7v1, types: [java.lang.Object, wv9] */
    public final void c(pf9 pf9, String str) {
        str.getClass();
        if (str.equals("commands")) {
            this.c = ryg.l0(pf9, new Object());
        } else if (!str.equals("contacts")) {
            pf9.A();
        } else {
            this.o = new HashMap();
            int e0 = ryg.e0(pf9);
            for (int i = 0; i < e0; i++) {
                long x0 = pf9.x0();
                this.o.put(Long.valueOf(x0), fo3.e(pf9));
            }
        }
    }

    public final String toString() {
        return a81.l("{commands=", kv0.o(this.c), ", contacts=", kv0.Q(this.o), "}");
    }
}
