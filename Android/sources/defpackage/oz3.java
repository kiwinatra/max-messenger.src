package defpackage;

import kotlin.jvm.internal.Ref;

/* renamed from: oz3  reason: default package */
public final class oz3 implements zi6 {
    public final /* synthetic */ Ref.ObjectRef a;

    public oz3(Ref.ObjectRef objectRef) {
        this.a = objectRef;
    }

    public final Object apply(Object obj) {
        j4g j4g = (j4g) obj;
        we8 a2 = ((qf9) this.a.element).a();
        a2.a = cjf.C(j4g.d);
        a2.b = j4g.d;
        return a2.b();
    }
}
