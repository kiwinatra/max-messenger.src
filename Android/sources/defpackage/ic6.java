package defpackage;

import androidx.fragment.app.a;

/* renamed from: ic6  reason: default package */
public final class ic6 implements bj6 {
    public final /* synthetic */ a a;

    public ic6(a aVar) {
        this.a = aVar;
    }

    public final Object apply(Object obj) {
        Void voidR = (Void) obj;
        a aVar = this.a;
        oc6 oc6 = aVar.E0;
        return oc6 instanceof f9 ? oc6.z0.getActivityResultRegistry() : aVar.E2().getActivityResultRegistry();
    }
}
