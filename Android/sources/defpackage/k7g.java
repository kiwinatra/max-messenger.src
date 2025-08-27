package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: k7g  reason: default package */
public final class k7g extends ibf {
    public Map c;
    public boolean o;
    public long v;

    public final void c(pf9 pf9, String str) {
        str.getClass();
        if (str.equals("startTime")) {
            this.v = ryg.d0(pf9, 0);
        } else if (!str.equals("live")) {
            String g0 = ryg.g0(pf9);
            if (!cvg.A(g0)) {
                if (this.c == null) {
                    this.c = new HashMap();
                }
                this.c.put(str, g0);
            }
        } else {
            this.o = ryg.Y(pf9);
        }
    }

    public final String toString() {
        int Q = kv0.Q(this.c);
        boolean z = this.o;
        long j = this.v;
        StringBuilder sb = new StringBuilder("{urls=");
        sb.append(Q);
        sb.append(", live=");
        sb.append(z);
        sb.append(", startTime=");
        return wj6.m(sb, j, "}");
    }
}
