package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Ref;

/* renamed from: vme  reason: default package */
public abstract class vme {
    public static final sbd a(bs5 bs5, long j) {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        T b = kv0.b();
        b.h0();
        objectRef.element = b;
        return new sbd(new ume(new vt5(bs5, new pme(objectRef, (Continuation) null)), objectRef, j, (Continuation) null));
    }
}
