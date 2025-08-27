package defpackage;

import java.util.Iterator;

/* renamed from: vbd  reason: default package */
public final class vbd extends wbd implements Iterator {
    public ubd a;
    public boolean b = true;
    public final /* synthetic */ xbd c;

    public vbd(xbd xbd) {
        this.c = xbd;
    }

    public final void a(ubd ubd) {
        ubd ubd2 = this.a;
        if (ubd == ubd2) {
            ubd ubd3 = ubd2.o;
            this.a = ubd3;
            this.b = ubd3 == null;
        }
    }

    public final boolean hasNext() {
        if (this.b) {
            return this.c.a != null;
        }
        ubd ubd = this.a;
        return (ubd == null || ubd.c == null) ? false : true;
    }

    public final Object next() {
        if (this.b) {
            this.b = false;
            this.a = this.c.a;
        } else {
            ubd ubd = this.a;
            this.a = ubd != null ? ubd.c : null;
        }
        return this.a;
    }
}
