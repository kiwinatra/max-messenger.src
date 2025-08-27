package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: mu7  reason: default package */
public final class mu7 extends eu1 {
    public jv7 E;

    public final lu7 q() {
        d19 d19;
        ArrayList arrayList;
        if (this.E == null || this.n == null) {
            return null;
        }
        if (!j() || this.p == null || this.o == null) {
            d19 = null;
        } else {
            d0g d0g = new d0g();
            bub bub = this.c;
            ArrayList arrayList2 = d0g.b;
            arrayList2.add(bub);
            ev0.g();
            if ((this.b & 1) != 0) {
                arrayList2.add(this.d);
            } else {
                this.n.b(this.d);
            }
            ev0.g();
            if ((this.b & 2) != 0) {
                arrayList2.add(this.e);
            } else {
                this.n.b(this.e);
            }
            ev0.g();
            if ((this.b & 4) != 0) {
                arrayList2.add(this.f);
            } else {
                this.n.b(this.f);
            }
            d0g.a = this.o;
            Iterator it = this.A.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                arrayList = d0g.c;
                if (!hasNext) {
                    break;
                }
                rae.w(it.next());
                arrayList.add((Object) null);
            }
            bs0.m("UseCase must not be empty.", true ^ arrayList2.isEmpty());
            Iterator it2 = arrayList.iterator();
            if (!it2.hasNext()) {
                d19 = new d19(false, d0g.a, arrayList2, arrayList);
            } else {
                rae.w(it2.next());
                throw null;
            }
        }
        if (d19 == null) {
            return null;
        }
        try {
            return this.n.a(this.E, this.a, d19);
        } catch (IllegalArgumentException e) {
            throw new IllegalStateException("The selected camera does not support the enabled use cases. Please disable use case and/or select a different camera. e.g. #setVideoCaptureEnabled(false)", e);
        }
    }
}
