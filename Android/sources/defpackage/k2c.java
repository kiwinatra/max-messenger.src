package defpackage;

import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import one.me.profile.screens.invite.ProfileInviteScreen;

/* renamed from: k2c  reason: default package */
public final /* synthetic */ class k2c implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ m2c b;

    public /* synthetic */ k2c(m2c m2c, int i) {
        this.a = i;
        this.b = m2c;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                z2c c0 = ((ProfileInviteScreen) this.b.v).c0();
                String l = c0.l();
                if (l != null) {
                    b2c b2c = new b2c(l);
                    s85 s85 = c0.B0;
                    xag.h(s85, b2c);
                    if (b59.C()) {
                        a32 k = c0.k();
                        s85.b.d(new e2c(cad.t, new igf((k == null || !k.K()) ? lxa.R0 : lxa.P0)));
                    }
                }
                return Unit.INSTANCE;
            default:
                z2c c02 = ((ProfileInviteScreen) this.b.v).c0();
                c02.getClass();
                xag.h(c02.B0, new d2c(CollectionsKt.listOf(new ow3(jxa.K, (ngf) new igf(lxa.U0), Integer.valueOf(jya.I), Integer.valueOf(cad.O1), Integer.valueOf(jya.E)))));
                return Unit.INSTANCE;
        }
    }
}
