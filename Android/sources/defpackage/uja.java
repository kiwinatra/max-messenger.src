package defpackage;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: uja  reason: default package */
public final class uja extends AtomicInteger implements mq4 {
    public final xja a;
    public final cla b;
    public Serializable c;
    public volatile boolean o;

    public uja(xja xja, cla cla) {
        this.a = xja;
        this.b = cla;
    }

    public final void dispose() {
        if (!this.o) {
            this.o = true;
            this.a.a(this);
            this.c = null;
        }
    }

    public final boolean f() {
        return this.o;
    }
}
