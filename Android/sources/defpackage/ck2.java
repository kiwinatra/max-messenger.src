package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: ck2  reason: default package */
public final class ck2 extends ibf {
    public b32 c;
    public b89 o;
    public List v;

    public ck2(pf9 pf9) {
        super(pf9);
        if (this.v == null) {
            this.v = Collections.emptyList();
        }
    }

    public final void c(pf9 pf9, String str) {
        ArrayList arrayList;
        str.getClass();
        char c2 = 65535;
        switch (str.hashCode()) {
            case -573649366:
                if (str.equals("deletedMessageIds")) {
                    c2 = 0;
                    break;
                }
                break;
            case 3052376:
                if (str.equals("chat")) {
                    c2 = 1;
                    break;
                }
                break;
            case 954925063:
                if (str.equals("message")) {
                    c2 = 2;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                if (pf9.n().a() == 7) {
                    arrayList = new ArrayList();
                    int t0 = pf9.t0();
                    for (int i = 0; i < t0; i++) {
                        arrayList.add(Long.valueOf(ryg.d0(pf9, 0)));
                    }
                } else {
                    pf9.A();
                    arrayList = null;
                }
                this.v = arrayList;
                return;
            case 1:
                this.c = b32.a(pf9);
                return;
            case 2:
                this.o = z79.a(pf9);
                return;
            default:
                pf9.A();
                return;
        }
    }

    public final String toString() {
        b32 b32 = this.c;
        b89 b89 = this.o;
        int o2 = kv0.o(this.v);
        StringBuilder sb = new StringBuilder("{chat=");
        sb.append(b32);
        sb.append(", message=");
        sb.append(b89);
        sb.append(", deletedMessageIds=");
        return wj6.l(sb, o2, "}");
    }
}
