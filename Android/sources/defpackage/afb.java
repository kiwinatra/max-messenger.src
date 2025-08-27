package defpackage;

import kotlin.Lazy;
import kotlin.jvm.internal.Ref;

/* renamed from: afb  reason: default package */
public final class afb extends pz {
    public final Lazy c;
    public wx d;

    public afb(l20 l20, Lazy lazy) {
        super(l20);
        this.c = lazy;
    }

    public final void a() {
        b(this.d, new Throwable("cancelled"));
    }

    public final jha d() {
        jha d2 = super.d();
        if (d2 != null) {
            return d2;
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        T t = this.d;
        objectRef.element = t;
        if (t != null) {
            return t;
        }
        T wxVar = new wx();
        this.d = wxVar;
        objectRef.element = wxVar;
        ((s97) this.c.getValue()).a(this.a.b.a(), new zeb(this, objectRef));
        return (jha) objectRef.element;
    }
}
