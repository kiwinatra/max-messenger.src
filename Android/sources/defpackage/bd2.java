package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* renamed from: bd2  reason: default package */
public final class bd2 extends ibf {
    public ArrayList c;
    public int o;
    public int v;
    public long w;
    public long x;

    public bd2(pf9 pf9) {
        super(pf9);
        if (this.c == null) {
            this.c = new ArrayList();
        }
    }

    public final void c(pf9 pf9, String str) {
        if (str != null) {
            switch (str.hashCode()) {
                case -677145915:
                    if (str.equals("forward")) {
                        this.w = pf9.x0();
                        return;
                    }
                    break;
                case -462094004:
                    if (str.equals("messages")) {
                        this.c = a00.g(pf9);
                        return;
                    }
                    break;
                case 111188:
                    if (str.equals("pos")) {
                        this.o = pf9.w0();
                        return;
                    }
                    break;
                case 110549828:
                    if (str.equals("total")) {
                        this.v = pf9.w0();
                        return;
                    }
                    break;
                case 2121976803:
                    if (str.equals("backward")) {
                        this.x = pf9.x0();
                        return;
                    }
                    break;
            }
        }
        pf9.A();
    }

    public final List d() {
        ArrayList arrayList = this.c;
        if (arrayList == null) {
            arrayList = null;
        }
        return CollectionsKt.toList(arrayList);
    }

    public final String toString() {
        int o2 = kv0.o(d());
        int i = this.o;
        int i2 = this.v;
        long j = this.w;
        long j2 = this.x;
        StringBuilder n = a81.n("{messages=", o2, ", pos=", i, ", total=");
        n.append(i2);
        n.append(", forward=");
        n.append(j);
        n.append(", backward=");
        n.append(j2);
        n.append("}");
        return n.toString();
    }
}
