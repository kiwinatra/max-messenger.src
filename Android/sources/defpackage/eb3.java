package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: eb3  reason: default package */
public final class eb3 extends ma3 {
    public final ma3 a;
    public final long b = 3;
    public final TimeUnit c;
    public final lfd o;
    public final ma3 v;

    public eb3(ma3 ma3, TimeUnit timeUnit, lfd lfd) {
        this.a = ma3;
        this.c = timeUnit;
        this.o = lfd;
        this.v = null;
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [mq4, java.lang.Object, kc3] */
    public final void k(ya3 ya3) {
        ? obj = new Object();
        ya3.c(obj);
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        obj.a(this.o.d(new iqg(2, (Object) this, (Object) atomicBoolean, (Object) obj, (Object) ya3), this.b, this.c));
        this.a.j(new aqg(obj, atomicBoolean, ya3));
    }
}
