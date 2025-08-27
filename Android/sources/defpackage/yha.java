package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: yha  reason: default package */
public final class yha extends AtomicReference implements oia, mq4, gce {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ yha(AtomicInteger atomicInteger, int i) {
        this.a = i;
        this.b = atomicInteger;
    }

    public void a(Object obj) {
        switch (this.a) {
            case 1:
                kw5 kw5 = (kw5) this.b;
                kw5.v.c(this);
                if (kw5.get() == 0) {
                    boolean z = false;
                    if (kw5.compareAndSet(0, 1)) {
                        if (kw5.w.decrementAndGet() == 0) {
                            z = true;
                        }
                        if (kw5.o.get() != 0) {
                            kw5.a.d(obj);
                            the the = (the) kw5.z.get();
                            if (!z || (the != null && !the.isEmpty())) {
                                h88.P(kw5.o, 1);
                                if (kw5.c != Integer.MAX_VALUE) {
                                    kw5.X.g(1);
                                }
                            } else {
                                kw5.x.e(kw5.a);
                                return;
                            }
                        } else {
                            the h = kw5.h();
                            synchronized (h) {
                                h.offer(obj);
                            }
                        }
                        if (kw5.decrementAndGet() == 0) {
                            return;
                        }
                        kw5.f();
                        return;
                    }
                }
                the h2 = kw5.h();
                synchronized (h2) {
                    h2.offer(obj);
                }
                kw5.w.decrementAndGet();
                if (kw5.getAndIncrement() != 0) {
                    return;
                }
                kw5.f();
                return;
            default:
                xia xia = (xia) this.b;
                xia.o.c(this);
                if (xia.get() == 0) {
                    boolean z2 = false;
                    if (xia.compareAndSet(0, 1)) {
                        xia.b.d(obj);
                        if (xia.v.decrementAndGet() == 0) {
                            z2 = true;
                        }
                        the the2 = (the) xia.y.get();
                        if (!z2 || (the2 != null && !the2.isEmpty())) {
                            if (xia.decrementAndGet() == 0) {
                                return;
                            }
                            xia.a();
                            return;
                        }
                        xia.w.d(xia.b);
                        return;
                    }
                }
                AtomicReference atomicReference = xia.y;
                the the3 = (the) atomicReference.get();
                if (the3 == null) {
                    the the4 = new the(wv5.a);
                    while (true) {
                        if (atomicReference.compareAndSet((Object) null, the4)) {
                            the3 = the4;
                        } else if (atomicReference.get() != null) {
                            the3 = (the) atomicReference.get();
                        }
                    }
                }
                synchronized (the3) {
                    the3.offer(obj);
                }
                xia.v.decrementAndGet();
                if (xia.getAndIncrement() != 0) {
                    return;
                }
                xia.a();
                return;
        }
    }

    public void b() {
        if (!f()) {
            try {
                ((cla) this.b).b();
            } finally {
                qq4.a(this);
            }
        }
    }

    public void c(mq4 mq4) {
        switch (this.a) {
            case 1:
                qq4.e(this, mq4);
                return;
            default:
                qq4.e(this, mq4);
                return;
        }
    }

    public void d(Object obj) {
        if (obj == null) {
            onError(p95.b("onNext called with a null value."));
        } else if (!f()) {
            ((cla) this.b).d(obj);
        }
    }

    public final void dispose() {
        switch (this.a) {
            case 0:
                qq4.a(this);
                return;
            case 1:
                qq4.a(this);
                return;
            default:
                qq4.a(this);
                return;
        }
    }

    public final boolean f() {
        switch (this.a) {
            case 0:
                return qq4.b((mq4) get());
            case 1:
                return qq4.b((mq4) get());
            default:
                return qq4.b((mq4) get());
        }
    }

    public final void onError(Throwable th) {
        switch (this.a) {
            case 0:
                if (!f()) {
                    try {
                        ((cla) this.b).onError(th);
                        return;
                    } finally {
                        qq4.a(this);
                    }
                } else {
                    n54.D(th);
                    return;
                }
            case 1:
                kw5 kw5 = (kw5) this.b;
                kc3 kc3 = kw5.v;
                kc3.c(this);
                if (kw5.x.a(th)) {
                    if (!kw5.b) {
                        kw5.X.cancel();
                        kc3.dispose();
                    } else if (kw5.c != Integer.MAX_VALUE) {
                        kw5.X.g(1);
                    }
                    kw5.w.decrementAndGet();
                    kw5.c();
                    return;
                }
                return;
            default:
                xia xia = (xia) this.b;
                kc3 kc32 = xia.o;
                kc32.c(this);
                if (xia.w.a(th)) {
                    if (!xia.c) {
                        xia.z.dispose();
                        kc32.dispose();
                    }
                    xia.v.decrementAndGet();
                    if (xia.getAndIncrement() == 0) {
                        xia.a();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                String simpleName = yha.class.getSimpleName();
                String atomicReference = super.toString();
                return simpleName + "{" + atomicReference + "}";
            default:
                return super.toString();
        }
    }

    public yha(cla cla) {
        this.a = 0;
        this.b = cla;
    }
}
