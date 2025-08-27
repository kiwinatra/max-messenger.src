package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import one.me.profileedit.screens.changelink.ProfileChangeLinkScreen;

/* renamed from: twb  reason: default package */
public final /* synthetic */ class twb implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ t56 b;

    public /* synthetic */ twb(t56 t56, int i) {
        this.a = i;
        this.b = t56;
    }

    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((ProfileChangeLinkScreen) ((vwb) this.b.w)).g0().b.l(((Integer) obj).intValue());
                return Unit.INSTANCE;
            default:
                ((ProfileChangeLinkScreen) ((vwb) this.b.w)).g0().b.k((String) obj);
                return Unit.INSTANCE;
        }
    }
}
