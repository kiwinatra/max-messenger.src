package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: u3g  reason: default package */
public final class u3g extends ibf {
    public List c;
    public long o;
    public long v;
    public boolean w;

    public u3g(pf9 pf9) {
        super(pf9);
        if (this.c == null) {
            this.c = Collections.emptyList();
        }
    }

    public final void c(pf9 pf9, String str) {
        str.getClass();
        char c2 = 65535;
        switch (str.hashCode()) {
            case -582276257:
                if (str.equals("forwardMarker")) {
                    c2 = 0;
                    break;
                }
                break;
            case 696739087:
                if (str.equals("hasMore")) {
                    c2 = 1;
                    break;
                }
                break;
            case 926934164:
                if (str.equals("history")) {
                    c2 = 2;
                    break;
                }
                break;
            case 1024366077:
                if (str.equals("backwardMarker")) {
                    c2 = 3;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                this.o = ryg.d0(pf9, 0);
                return;
            case 1:
                this.w = ryg.Y(pf9);
                return;
            case 2:
                this.c = ryg.l0(pf9, new sx6(21));
                return;
            case 3:
                this.v = ryg.d0(pf9, 0);
                return;
            default:
                pf9.A();
                return;
        }
    }

    public final String toString() {
        int o2 = kv0.o(this.c);
        long j = this.o;
        long j2 = this.v;
        boolean z = this.w;
        StringBuilder sb = new StringBuilder("{calls=");
        sb.append(o2);
        sb.append(", forwardMarker=");
        sb.append(j);
        tr1.v(sb, ", backwardMarker=", j2, ", hasMore=");
        return tr1.m(sb, z, "}");
    }
}
