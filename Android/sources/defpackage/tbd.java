package defpackage;

import java.util.Iterator;

/* renamed from: tbd  reason: default package */
public final class tbd extends wbd implements Iterator {
    public ubd a;
    public ubd b;
    public final /* synthetic */ int c;

    public tbd(ubd ubd, ubd ubd2, int i) {
        this.c = i;
        this.a = ubd2;
        this.b = ubd;
    }

    public final void a(ubd ubd) {
        ubd ubd2 = null;
        if (this.a == ubd && ubd == this.b) {
            this.b = null;
            this.a = null;
        }
        ubd ubd3 = this.a;
        if (ubd3 == ubd) {
            this.a = b(ubd3);
        }
        ubd ubd4 = this.b;
        if (ubd4 == ubd) {
            ubd ubd5 = this.a;
            if (!(ubd4 == ubd5 || ubd5 == null)) {
                ubd2 = c(ubd4);
            }
            this.b = ubd2;
        }
    }

    public final ubd b(ubd ubd) {
        switch (this.c) {
            case 0:
                return ubd.o;
            default:
                return ubd.c;
        }
    }

    public final ubd c(ubd ubd) {
        switch (this.c) {
            case 0:
                return ubd.c;
            default:
                return ubd.o;
        }
    }

    public final boolean hasNext() {
        return this.b != null;
    }

    public final Object next() {
        ubd ubd = this.b;
        ubd ubd2 = this.a;
        this.b = (ubd == ubd2 || ubd2 == null) ? null : c(ubd);
        return ubd;
    }
}
