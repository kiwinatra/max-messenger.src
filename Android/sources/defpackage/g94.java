package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: g94  reason: default package */
public final class g94 extends ibf {
    public jq5 c;
    public List o;

    public g94(pf9 pf9) {
        super(pf9);
        if (this.o == null) {
            this.o = Collections.emptyList();
        }
    }

    public final void c(pf9 pf9, String str) {
        str.getClass();
        if (str.equals("cmd")) {
            String g0 = ryg.g0(pf9);
            jq5 jq5 = jq5.e;
            if (g0 != null) {
                if (g0.equals("SYNC_CONTACTS")) {
                    jq5 = jq5.g;
                } else if (g0.equals("SEND_LOG")) {
                    jq5 = jq5.f;
                }
            }
            this.c = jq5;
        } else if (!str.equals("args")) {
            pf9.A();
        } else {
            int X = ryg.X(pf9);
            this.o = new ArrayList(X);
            for (int i = 0; i < X; i++) {
                this.o.add(ryg.g0(pf9));
            }
        }
    }

    public final String toString() {
        jq5 jq5 = this.c;
        List list = this.o;
        return "{cmd='" + jq5 + "', args=" + list + "}";
    }
}
