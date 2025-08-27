package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: mc8  reason: default package */
public final class mc8 implements eq7, Serializable {
    public final List a;

    public mc8(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final List a() {
        return this.a;
    }

    public final boolean b(eq7 eq7) {
        List a2 = eq7.a();
        List list = this.a;
        if (list.size() != a2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            ew0 ew0 = (ew0) list.get(i);
            if (ew0.size() != ((ew0) a2.get(i)).size()) {
                return false;
            }
            for (int i2 = 0; i2 < ew0.size(); i2++) {
                xv0 xv0 = (xv0) ew0.get(i2);
                xv0 xv02 = (xv0) ((ew0) a2.get(i)).get(i2);
                if (!xv0.equals(xv02) || xv0.y != xv02.y) {
                    return false;
                }
            }
        }
        return true;
    }

    public final String c() {
        return null;
    }
}
