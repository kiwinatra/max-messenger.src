package defpackage;

import java.lang.ref.ReferenceQueue;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.collections.AbstractMutableMap;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: ge3  reason: default package */
public final class ge3 extends AbstractMutableMap {
    public static final /* synthetic */ AtomicIntegerFieldUpdater b;
    public static final /* synthetic */ AtomicReferenceFieldUpdater c;
    private volatile /* synthetic */ int _size$volatile;
    public final ReferenceQueue a;
    private volatile /* synthetic */ Object core$volatile = new de3(this, 16);

    static {
        Class<ge3> cls = ge3.class;
        b = AtomicIntegerFieldUpdater.newUpdater(cls, "_size$volatile");
        c = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "core$volatile");
    }

    public ge3(boolean z) {
        this.a = z ? new ReferenceQueue() : null;
    }

    public final synchronized Object a(Object obj, Object obj2) {
        Object a2;
        de3 de3 = (de3) c.get(this);
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = de3.g;
            a2 = de3.a(obj, obj2, (yw6) null);
            if (a2 == te8.c) {
                de3 = de3.b();
                c.set(this, de3);
            }
        }
        return a2;
    }

    public final void clear() {
        for (Object remove : keySet()) {
            remove(remove);
        }
    }

    public final Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        de3 de3 = (de3) c.get(this);
        de3.getClass();
        int hashCode = (obj.hashCode() * -1640531527) >>> de3.b;
        while (true) {
            yw6 yw6 = (yw6) de3.d.get(hashCode);
            if (yw6 == null) {
                return null;
            }
            Object obj2 = yw6.get();
            if (Intrinsics.areEqual(obj, obj2)) {
                Object obj3 = de3.e.get(hashCode);
                if (obj3 instanceof lf8) {
                    obj3 = ((lf8) obj3).a;
                }
                return obj3;
            }
            if (obj2 == null) {
                de3.c(hashCode);
            }
            if (hashCode == 0) {
                hashCode = de3.a;
            }
            hashCode--;
        }
    }

    public final Set getEntries() {
        return new fe3(this, new ui0(5));
    }

    public final Set getKeys() {
        return new fe3(this, new ui0(4));
    }

    public final int getSize() {
        return b.get(this);
    }

    public final Object put(Object obj, Object obj2) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = de3.g;
        Object a2 = ((de3) c.get(this)).a(obj, obj2, (yw6) null);
        if (a2 == te8.c) {
            a2 = a(obj, obj2);
        }
        if (a2 == null) {
            b.incrementAndGet(this);
        }
        return a2;
    }

    public final Object remove(Object obj) {
        if (obj == null) {
            return null;
        }
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = de3.g;
        Object a2 = ((de3) c.get(this)).a(obj, (Object) null, (yw6) null);
        if (a2 == te8.c) {
            a2 = a(obj, (Object) null);
        }
        if (a2 != null) {
            b.decrementAndGet(this);
        }
        return a2;
    }
}
