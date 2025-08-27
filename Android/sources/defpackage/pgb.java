package defpackage;

import android.view.View;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.reflect.KProperty;
import one.me.startconversation.channel.PickSubscribersScreen;

/* renamed from: pgb  reason: default package */
public final /* synthetic */ class pgb implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ PickSubscribersScreen b;

    public /* synthetic */ pgb(PickSubscribersScreen pickSubscribersScreen, int i) {
        this.a = i;
        this.b = pickSubscribersScreen;
    }

    public final void onClick(View view) {
        aje aje = null;
        PickSubscribersScreen pickSubscribersScreen = this.b;
        switch (this.a) {
            case 0:
                KProperty[] kPropertyArr = PickSubscribersScreen.w0;
                egb egb = (egb) pickSubscribersScreen.l0().c;
                d14 d14 = egb.k;
                if (d14 != null) {
                    ev0.v(d14, (CoroutineContext) null, (f14) null, new dgb(egb, (Continuation) null), 3);
                    return;
                }
                return;
            default:
                KProperty[] kPropertyArr2 = PickSubscribersScreen.w0;
                pickSubscribersScreen.n0().setProgressEnabled(true);
                egb egb2 = (egb) pickSubscribersScreen.l0().c;
                KProperty kProperty = PickSubscribersScreen.w0[0];
                long[] jArr = (long[]) pickSubscribersScreen.y.a(pickSubscribersScreen);
                a32 a32 = (a32) ((my2) ((qx2) egb2.d.getValue())).o(egb2.a).a.getValue();
                if (a32 != null) {
                    ((rh3) egb2.f.getValue()).e();
                    d14 d142 = egb2.k;
                    if (d142 != null) {
                        aje = ev0.v(d142, ((osa) ((gaf) egb2.c.getValue())).b(), (f14) null, new bgb(egb2, a32, jArr, (Continuation) null), 2);
                    }
                    egb2.j.setValue(egb2, egb.l[0], aje);
                    return;
                }
                return;
        }
    }
}
