package defpackage;

import java.util.Iterator;
import java.util.Objects;

/* renamed from: dja  reason: default package */
public final class dja extends yl0 {
    public final cla a;
    public final Iterator b;
    public volatile boolean c;
    public boolean o;
    public boolean v;
    public boolean w;

    public dja(cla cla, Iterator it) {
        this.a = cla;
        this.b = it;
    }

    public final void clear() {
        this.v = true;
    }

    public final void dispose() {
        this.c = true;
    }

    public final boolean f() {
        return this.c;
    }

    public final boolean isEmpty() {
        return this.v;
    }

    public final int p(int i) {
        this.o = true;
        return 1;
    }

    public final Object poll() {
        if (this.v) {
            return null;
        }
        boolean z = this.w;
        Iterator it = this.b;
        if (!z) {
            this.w = true;
        } else if (!it.hasNext()) {
            this.v = true;
            return null;
        }
        Object next = it.next();
        Objects.requireNonNull(next, "The iterator returned a null value");
        return next;
    }
}
