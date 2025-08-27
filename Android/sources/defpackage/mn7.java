package defpackage;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: mn7  reason: default package */
public final class mn7 implements oe7 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater b;
    public static final /* synthetic */ AtomicReferenceFieldUpdater c;
    public static final /* synthetic */ AtomicReferenceFieldUpdater o;
    private volatile /* synthetic */ Object _exceptionsHolder$volatile;
    private volatile /* synthetic */ int _isCompleting$volatile = 0;
    private volatile /* synthetic */ Object _rootCause$volatile;
    public final x9a a;

    static {
        Class<mn7> cls = mn7.class;
        b = AtomicIntegerFieldUpdater.newUpdater(cls, "_isCompleting$volatile");
        Class<Object> cls2 = Object.class;
        c = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_rootCause$volatile");
        o = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_exceptionsHolder$volatile");
    }

    public mn7(x9a x9a, Throwable th) {
        this.a = x9a;
        this._rootCause$volatile = th;
    }

    public final void a(Throwable th) {
        Throwable c2 = c();
        if (c2 == null) {
            c.set(this, th);
        } else if (th != c2) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = o;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                atomicReferenceFieldUpdater.set(this, th);
            } else if (obj instanceof Throwable) {
                if (th != obj) {
                    ArrayList arrayList = new ArrayList(4);
                    arrayList.add(obj);
                    arrayList.add(th);
                    atomicReferenceFieldUpdater.set(this, arrayList);
                }
            } else if (obj instanceof ArrayList) {
                ((ArrayList) obj).add(th);
            } else {
                throw new IllegalStateException(("State is " + obj).toString());
            }
        }
    }

    public final x9a b() {
        return this.a;
    }

    public final Throwable c() {
        return (Throwable) c.get(this);
    }

    public final boolean d() {
        return c() != null;
    }

    public final ArrayList e(Throwable th) {
        ArrayList arrayList;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = o;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if (obj == null) {
            arrayList = new ArrayList(4);
        } else if (obj instanceof Throwable) {
            ArrayList arrayList2 = new ArrayList(4);
            arrayList2.add(obj);
            arrayList = arrayList2;
        } else if (obj instanceof ArrayList) {
            arrayList = (ArrayList) obj;
        } else {
            throw new IllegalStateException(("State is " + obj).toString());
        }
        Throwable c2 = c();
        if (c2 != null) {
            arrayList.add(0, c2);
        }
        if (th != null && !Intrinsics.areEqual((Object) th, (Object) c2)) {
            arrayList.add(th);
        }
        atomicReferenceFieldUpdater.set(this, ld9.h);
        return arrayList;
    }

    public final boolean isActive() {
        return c() == null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Finishing[cancelling=");
        sb.append(d());
        sb.append(", completing=");
        sb.append(b.get(this) != 0);
        sb.append(", rootCause=");
        sb.append(c());
        sb.append(", exceptions=");
        sb.append(o.get(this));
        sb.append(", list=");
        sb.append(this.a);
        sb.append(']');
        return sb.toString();
    }
}
