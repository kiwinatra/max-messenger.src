package defpackage;

import android.os.Bundle;
import android.view.View;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import one.me.profile.ProfileScreen;

/* renamed from: u5c  reason: default package */
public final /* synthetic */ class u5c implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ x5c b;

    public /* synthetic */ u5c(x5c x5c, int i) {
        this.a = i;
        this.b = x5c;
    }

    public final void onClick(View view) {
        x5c x5c = this.b;
        switch (this.a) {
            case 0:
                w5c w5c = x5c.v;
                int id = view.getId();
                ProfileScreen profileScreen = (ProfileScreen) w5c;
                profileScreen.getClass();
                if (id == jxa.l) {
                    profileScreen.g0().o(false);
                    return;
                } else if (id == jxa.q1) {
                    profileScreen.g0().o(true);
                    return;
                } else if (id == jxa.m1) {
                    k7c g0 = profileScreen.g0();
                    Long i = g0.I0.i();
                    if (i != null) {
                        xag.h(g0.x0, new d5c(i.longValue()));
                        return;
                    }
                    return;
                } else if (id == jxa.W0) {
                    k7c g02 = profileScreen.g0();
                    swb swb = (swb) g02.B0.getValue();
                    swb.getClass();
                    igf igf = new igf(lxa.q2);
                    List createListBuilder = CollectionsKt.createListBuilder();
                    int i2 = jxa.S0;
                    igf igf2 = new igf(lxa.s2);
                    og3 og3 = og3.c;
                    createListBuilder.add(new pg3(i2, igf2, og3));
                    createListBuilder.add(new pg3(jxa.T0, new igf(lxa.t2), og3));
                    createListBuilder.add(new pg3(jxa.R0, new igf(lxa.r2), og3));
                    createListBuilder.add(new pg3(jxa.U0, new igf(lxa.u2), og3.a));
                    createListBuilder.add(swb.b());
                    Unit unit = Unit.INSTANCE;
                    xag.h(g02.w0, new c6c(igf, (ngf) null, CollectionsKt.build(createListBuilder), (Bundle) null));
                    return;
                } else if (id == jxa.V0) {
                    k7c g03 = profileScreen.g0();
                    Long i3 = g03.I0.i();
                    if (i3 != null) {
                        ((my2) g03.m()).n().q0(i3.longValue());
                        xag.h(g03.w0, new g6c(new igf(lxa.w2), Integer.valueOf(cad.o)));
                        return;
                    }
                    return;
                } else if (id == jxa.o1) {
                    k7c g04 = profileScreen.g0();
                    ev0.v(g04.a, ((osa) g04.n()).a(), (f14) null, new e7c(g04, (Continuation) null), 2);
                    return;
                } else if (id == jxa.n1) {
                    k7c g05 = profileScreen.g0();
                    ev0.v(g05.a, ((osa) g05.n()).b(), (f14) null, new h7c(g05, (Continuation) null), 2);
                    return;
                } else if (id == jxa.p1) {
                    k7c g06 = profileScreen.g0();
                    ev0.v(g06.a, ((osa) g06.n()).b(), (f14) null, new j7c(g06, (Continuation) null), 2);
                    return;
                } else if (id == jxa.Q0) {
                    k7c g07 = profileScreen.g0();
                    List z = g07.I0.z();
                    if (true ^ z.isEmpty()) {
                        xag.h(g07.w0, new d6c(z));
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 1:
                k7c g08 = ((ProfileScreen) x5c.v).g0();
                ev0.v(g08.a, ((osa) g08.n()).a(), (f14) null, new b7c(g08, (Continuation) null), 2);
                return;
            case 2:
                k7c g09 = ((ProfileScreen) x5c.v).g0();
                Long i4 = g09.I0.i();
                if (i4 != null) {
                    xag.h(g09.x0, new z4c(i4.longValue()));
                    return;
                }
                return;
            case 3:
                k7c g010 = ((ProfileScreen) x5c.v).g0();
                Long i5 = g010.I0.i();
                if (i5 != null) {
                    xag.h(g010.x0, new w4c(i5.longValue(), ij2.ADMIN));
                    return;
                }
                return;
            case 4:
                k7c g011 = ((ProfileScreen) x5c.v).g0();
                aje v = ev0.v(g011.a, ((osa) g011.n()).b(), (f14) null, new u6c(g011, (Continuation) null), 2);
                g011.z0.setValue(g011, k7c.M0[1], v);
                return;
            case 5:
                k7c g012 = ((ProfileScreen) x5c.v).g0();
                xag.h(g012.w0, new f6c((List) ((nxb) g012.A0.getValue()).l.getValue()));
                return;
            default:
                k7c g013 = ((ProfileScreen) x5c.v).g0();
                Long i6 = g013.I0.i();
                if (i6 != null) {
                    xag.h(g013.x0, new w4c(i6.longValue(), ij2.MEMBER));
                    return;
                }
                return;
        }
    }
}
