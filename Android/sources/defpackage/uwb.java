package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import one.me.profileedit.screens.changelink.ProfileChangeLinkScreen;

/* renamed from: uwb  reason: default package */
public final /* synthetic */ class uwb implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ t56 b;

    public /* synthetic */ uwb(t56 t56, int i) {
        this.a = i;
        this.b = t56;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                ((ProfileChangeLinkScreen) ((vwb) this.b.w)).g0().b.a();
                return Unit.INSTANCE;
            case 1:
                d02 g0 = ((ProfileChangeLinkScreen) ((vwb) this.b.w)).g0();
                ev0.v(g0.a, (CoroutineContext) null, (f14) null, new b02(g0, (Continuation) null), 3);
                return Unit.INSTANCE;
            default:
                ((ProfileChangeLinkScreen) ((vwb) this.b.w)).g0().b.e();
                return Unit.INSTANCE;
        }
    }
}
