package defpackage;

import android.view.View;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.reflect.KProperty;
import one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget;

/* renamed from: twc  reason: default package */
public final /* synthetic */ class twc implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ RecordControlsWidget b;

    public /* synthetic */ twc(RecordControlsWidget recordControlsWidget, int i) {
        this.a = i;
        this.b = recordControlsWidget;
    }

    public final void onClick(View view) {
        boolean z = false;
        switch (this.a) {
            case 0:
                KProperty[] kPropertyArr = RecordControlsWidget.g1;
                this.b.D0().t();
                return;
            case 1:
                KProperty[] kPropertyArr2 = RecordControlsWidget.g1;
                pwc D0 = this.b.D0();
                D0.w();
                fwc fwc = new fwc(2, D0.q(), false);
                xme xme = D0.Z;
                xme.getClass();
                xme.m((Object) null, fwc);
                return;
            case 2:
                KProperty[] kPropertyArr3 = RecordControlsWidget.g1;
                this.b.D0().r();
                return;
            case 3:
                KProperty[] kPropertyArr4 = RecordControlsWidget.g1;
                pwc D02 = this.b.D0();
                KProperty[] kPropertyArr5 = pwc.H0;
                D02.v(true);
                return;
            default:
                RecordControlsWidget recordControlsWidget = this.b;
                KProperty[] kPropertyArr6 = RecordControlsWidget.g1;
                c50 c50 = (c50) recordControlsWidget.D0().n();
                xy9 xy9 = (xy9) c50.b();
                xy9.getClass();
                ev0.v(xy9.j, (CoroutineContext) null, (f14) null, new uy9(xy9, 1.0f, (Continuation) null), 3);
                long l = ((xy9) c50.b()).l();
                Long l2 = c50.f;
                if (l2 != null && l == l2.longValue()) {
                    z = true;
                }
                if (((xy9) c50.b()).z && z) {
                    ((xy9) c50.b()).q();
                    return;
                } else if (!((xy9) c50.b()).y || !z) {
                    Long l3 = c50.f;
                    if (l3 != null) {
                        ((xy9) c50.b()).s(new ay9(l3.longValue()));
                        return;
                    }
                    return;
                } else {
                    ((xy9) c50.b()).r();
                    return;
                }
        }
    }
}
