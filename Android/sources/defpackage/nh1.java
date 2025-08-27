package defpackage;

import android.content.Context;
import android.content.Intent;
import one.me.calls.ui.ui.call.CallScreen;
import one.me.sdk.arch.Widget;
import org.apache.http.protocol.HTTP;

/* renamed from: nh1  reason: default package */
public final class nh1 implements pk1 {
    public final /* synthetic */ CallScreen a;

    public nh1(CallScreen callScreen) {
        this.a = callScreen;
    }

    public final void a() {
        CallScreen callScreen = this.a;
        Context context = callScreen.getContext();
        String J = f6e.J(callScreen.p0().l().k);
        hr6 hr6 = new hr6(context);
        hr6.u(context.getString(ykc.call_link_share_dialog_share_link_description, new Object[]{J}));
        hr6.c = context.getString(ykc.call_link_share_dialog_share_link_dialog_intent_title);
        ((Intent) hr6.b).setType(HTTP.PLAIN_TEXT_TYPE);
        hr6.w();
    }

    public final void b() {
        gga gga = CallScreen.J0;
        CallScreen callScreen = this.a;
        b59.k(callScreen.getContext(), f6e.J(callScreen.p0().l().k));
        if (b59.C()) {
            String string = callScreen.getContext().getString(ykc.call_link_share_dialog_share_link_copy);
            e0b e0b = new e0b((Widget) callScreen);
            e0b.i(string);
            e0b.c(new n0b(0, 0, 3));
            e0b.j();
        }
    }

    public final void c() {
        gga gga = CallScreen.J0;
        this.a.p0().k();
    }

    public final void g() {
        id1.b.getClass();
    }

    public final void h() {
        gga gga = CallScreen.J0;
        jj1 p0 = this.a.p0();
        xag.h(p0.K0, new ei1(f6e.J(p0.l().k)));
    }
}
