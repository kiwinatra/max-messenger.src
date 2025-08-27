package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: as3  reason: default package */
public final class as3 extends ibf {
    public List c;
    public int o;

    public final void c(pf9 pf9, String str) {
        str.getClass();
        if (str.equals("result")) {
            int i = a00.a;
            int X = ryg.X(pf9);
            ArrayList arrayList = new ArrayList(X);
            for (int i2 = 0; i2 < X; i2++) {
                arrayList.add(cs3.a(pf9));
            }
            this.c = arrayList;
        } else if (!str.equals("total")) {
            pf9.A();
        } else {
            this.o = pf9.w0();
        }
    }

    public final String toString() {
        return a81.l("{contacts=", kv0.o(this.c), ", total=", this.o, "}");
    }
}
