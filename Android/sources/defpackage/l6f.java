package defpackage;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: l6f  reason: default package */
public final class l6f extends ibf {
    public List c;
    public Map o;

    public final void c(pf9 pf9, String str) {
        str.getClass();
        if (str.equals("phones")) {
            this.o = new HashMap();
            int e0 = ryg.e0(pf9);
            for (int i = 0; i < e0; i++) {
                this.o.put(pf9.A0(), Long.valueOf(pf9.x0()));
            }
        } else if (!str.equals("contacts")) {
            pf9.A();
        } else {
            this.c = a00.e(pf9);
        }
    }

    public final String toString() {
        return a81.l("{contacts=", kv0.o(this.c), ", phones=", kv0.Q(this.o), "}");
    }
}
