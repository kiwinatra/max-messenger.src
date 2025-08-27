package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: be3  reason: default package */
public abstract class be3 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a;
    public static final /* synthetic */ AtomicReferenceFieldUpdater b;
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    static {
        Class<be3> cls = be3.class;
        Class<Object> cls2 = Object.class;
        a = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_next$volatile");
        b = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_prev$volatile");
    }

    public be3(be3 be3) {
        this._prev$volatile = be3;
    }

    public final void a() {
        b.set(this, (Object) null);
    }

    public final be3 c() {
        Object obj = a.get(this);
        if (obj == ae3.a) {
            return null;
        }
        return (be3) obj;
    }

    public abstract boolean d();

    public final void e() {
        be3 c;
        if (c() != null) {
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
                be3 be3 = (be3) atomicReferenceFieldUpdater.get(this);
                while (be3 != null && be3.d()) {
                    be3 = (be3) atomicReferenceFieldUpdater.get(be3);
                }
                be3 c2 = c();
                while (c2.d() && (c = c2.c()) != null) {
                    c2 = c;
                }
                while (true) {
                    Object obj = atomicReferenceFieldUpdater.get(c2);
                    be3 be32 = ((be3) obj) == null ? null : be3;
                    while (true) {
                        if (atomicReferenceFieldUpdater.compareAndSet(c2, obj, be32)) {
                            break;
                        } else if (atomicReferenceFieldUpdater.get(c2) != obj) {
                        }
                    }
                }
                if (be3 != null) {
                    a.set(be3, c2);
                }
                if ((!c2.d() || c2.c() == null) && (be3 == null || !be3.d())) {
                    return;
                }
            }
        }
    }
}
