package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: uq6  reason: default package */
public final class uq6 extends ibf {
    public final /* synthetic */ int c;
    public Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uq6(pf9 pf9, int i) {
        super(pf9);
        this.c = i;
    }

    public final void c(pf9 pf9, String str) {
        int i = 0;
        switch (this.c) {
            case 0:
                str.getClass();
                if (!str.equals("calls")) {
                    pf9.A();
                    return;
                }
                this.o = new ArrayList();
                int X = ryg.X(pf9);
                while (i < X) {
                    ((ArrayList) this.o).add(i3g.a(pf9));
                    i++;
                }
                return;
            case 1:
                str.getClass();
                if (!str.equals("mentions")) {
                    pf9.A();
                    return;
                } else {
                    this.o = a00.g(pf9);
                    return;
                }
            default:
                str.getClass();
                if (!str.equals("stats")) {
                    pf9.A();
                    return;
                }
                this.o = new HashMap();
                int e0 = ryg.e0(pf9);
                while (i < e0) {
                    ((Map) this.o).put(Long.valueOf(pf9.x0()), pe9.a(pf9));
                    i++;
                }
                return;
        }
    }

    public final String toString() {
        switch (this.c) {
            case 0:
                return "Response{calls=" + ((ArrayList) this.o) + "}";
            case 1:
                return a81.j(kv0.o((a00) this.o), "Response{mentions=", "}");
            default:
                return a81.j(kv0.Q((Map) this.o), "{stats=", "}");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public uq6(pf9 pf9) {
        super(pf9);
        this.c = 2;
        if (((Map) this.o) == null) {
            this.o = Collections.emptyMap();
        }
    }
}
