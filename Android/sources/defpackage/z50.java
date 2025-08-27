package defpackage;

import java.util.Iterator;
import java.util.List;

/* renamed from: z50  reason: default package */
public final class z50 {
    public boolean a;
    public boolean b;
    public boolean c;

    public z50(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public a60 a() {
        if (this.a || (!this.b && !this.c)) {
            return new a60(this);
        }
        throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
    }

    public void b(List list) {
        if ((this.a || this.b || this.c) && list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((lk4) it.next()).a();
            }
        }
    }
}
