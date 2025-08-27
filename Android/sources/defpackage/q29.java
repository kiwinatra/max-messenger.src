package defpackage;

import java.util.Iterator;
import java.util.Map;

/* renamed from: q29  reason: default package */
public class q29 extends fz9 {
    public final xbd l = new xbd();

    public void g() {
        Iterator it = this.l.iterator();
        while (true) {
            tbd tbd = (tbd) it;
            if (tbd.hasNext()) {
                ((p29) ((Map.Entry) tbd.next()).getValue()).b();
            } else {
                return;
            }
        }
    }

    public void h() {
        Iterator it = this.l.iterator();
        while (true) {
            tbd tbd = (tbd) it;
            if (tbd.hasNext()) {
                p29 p29 = (p29) ((Map.Entry) tbd.next()).getValue();
                p29.a.j(p29);
            } else {
                return;
            }
        }
    }

    public void l(u08 u08, dla dla) {
        if (u08 != null) {
            p29 p29 = new p29(u08, dla);
            p29 p292 = (p29) this.l.d(u08, p29);
            if (p292 != null && p292.b != dla) {
                throw new IllegalArgumentException("This source was already added with the different observer");
            } else if (p292 == null && this.c > 0) {
                p29.b();
            }
        } else {
            throw new NullPointerException("source cannot be null");
        }
    }
}
