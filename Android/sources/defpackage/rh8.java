package defpackage;

import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: rh8  reason: default package */
public final class rh8 extends AtomicReference implements th8, mq4, gce, pi8 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ rh8(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void a(Object obj) {
        mq4 mq4;
        switch (this.a) {
            case 0:
                Object obj2 = get();
                qq4 qq4 = qq4.a;
                if (obj2 != qq4 && (mq4 = (mq4) getAndSet(qq4)) != qq4) {
                    pi8 pi8 = (pi8) this.b;
                    if (obj == null) {
                        try {
                            pi8.onError(p95.b("onSuccess called with a null value."));
                        } finally {
                            if (mq4 != null) {
                                mq4.dispose();
                            }
                        }
                    } else {
                        pi8.a(obj);
                    }
                    if (mq4 == null) {
                        return;
                    }
                    return;
                }
                return;
            case 1:
                try {
                    lazySet(qq4.a);
                    ((rm0) this.b).accept(obj, (Object) null);
                    return;
                } catch (Throwable th) {
                    hd8.Z(th);
                    n54.D(th);
                    return;
                }
            default:
                xia xia = (xia) this.b;
                xia.o.c(this);
                if (xia.get() == 0) {
                    boolean z = false;
                    if (xia.compareAndSet(0, 1)) {
                        xia.b.d(obj);
                        if (xia.v.decrementAndGet() == 0) {
                            z = true;
                        }
                        the the = (the) xia.y.get();
                        if (!z || (the != null && !the.isEmpty())) {
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
                the the2 = (the) atomicReference.get();
                if (the2 == null) {
                    the the3 = new the(wv5.a);
                    while (true) {
                        if (atomicReference.compareAndSet((Object) null, the3)) {
                            the2 = the3;
                        } else if (atomicReference.get() != null) {
                            the2 = (the) atomicReference.get();
                        }
                    }
                }
                synchronized (the2) {
                    the2.offer(obj);
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
        mq4 mq4;
        switch (this.a) {
            case 0:
                Object obj = get();
                qq4 qq4 = qq4.a;
                if (obj != qq4 && (mq4 = (mq4) getAndSet(qq4)) != qq4) {
                    try {
                        ((pi8) this.b).b();
                        if (mq4 == null) {
                            return;
                        }
                        return;
                    } finally {
                        if (mq4 != null) {
                            mq4.dispose();
                        }
                    }
                } else {
                    return;
                }
            default:
                xia xia = (xia) this.b;
                xia.o.c(this);
                int i = xia.get();
                AtomicInteger atomicInteger = xia.v;
                if (i == 0) {
                    boolean z = false;
                    if (xia.compareAndSet(0, 1)) {
                        if (atomicInteger.decrementAndGet() == 0) {
                            z = true;
                        }
                        the the = (the) xia.y.get();
                        if (z && (the == null || the.isEmpty())) {
                            xia.w.d(xia.b);
                            return;
                        } else if (xia.decrementAndGet() != 0) {
                            xia.a();
                            return;
                        } else {
                            return;
                        }
                    }
                }
                atomicInteger.decrementAndGet();
                if (xia.getAndIncrement() == 0) {
                    xia.a();
                    return;
                }
                return;
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
                return get() == qq4.a;
            default:
                return qq4.b((mq4) get());
        }
    }

    public final void onError(Throwable th) {
        mq4 mq4;
        switch (this.a) {
            case 0:
                Throwable b2 = th == null ? p95.b("onError called with a null Throwable.") : th;
                Object obj = get();
                qq4 qq4 = qq4.a;
                if (obj == qq4 || (mq4 = (mq4) getAndSet(qq4)) == qq4) {
                    n54.D(th);
                    return;
                }
                try {
                    ((pi8) this.b).onError(b2);
                    if (mq4 == null) {
                        return;
                    }
                    return;
                } finally {
                    if (mq4 != null) {
                        mq4.dispose();
                    }
                }
            case 1:
                try {
                    lazySet(qq4.a);
                    ((rm0) this.b).accept((Object) null, th);
                    return;
                } catch (Throwable th2) {
                    hd8.Z(th2);
                    n54.D(new CompositeException(th, th2));
                    return;
                }
            default:
                xia xia = (xia) this.b;
                kc3 kc3 = xia.o;
                kc3.c(this);
                if (xia.w.a(th)) {
                    if (!xia.c) {
                        xia.z.dispose();
                        kc3.dispose();
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
                String simpleName = rh8.class.getSimpleName();
                String atomicReference = super.toString();
                return simpleName + "{" + atomicReference + "}";
            default:
                return super.toString();
        }
    }

    public rh8(xia xia) {
        this.a = 2;
        this.b = xia;
    }
}
