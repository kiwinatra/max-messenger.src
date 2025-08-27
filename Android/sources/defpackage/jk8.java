package defpackage;

import android.graphics.Rect;
import android.view.View;
import ru.ok.messages.actions.ExtraActionsView;
import ru.ok.messages.gallery.view.CameraContainerView;

/* renamed from: jk8  reason: default package */
public final /* synthetic */ class jk8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ok8 b;

    public /* synthetic */ jk8(ok8 ok8, int i) {
        this.a = i;
        this.b = ok8;
    }

    public final void run() {
        ExtraActionsView extraActionsView;
        switch (this.a) {
            case 0:
                ok8 ok8 = this.b;
                b4a b4a = ok8.x0;
                if (!b4a.Z() && (extraActionsView = ok8.O0) != null) {
                    Rect rect = rcg.a;
                    rcg.d(rect, extraActionsView);
                    int i = rect.top;
                    if (i != 0) {
                        CameraContainerView cameraContainerView = ok8.P0;
                        if (cameraContainerView != null) {
                            rcg.d(rect, cameraContainerView);
                            ok8.S0.t(rect.width(), rect.height(), rect.top, false, false);
                        } else {
                            ok8.S0.s(i, false, false);
                        }
                        if (b4a.D0.h()) {
                            ((View) b4a.c).setVisibility(0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 1:
                ok8 ok82 = this.b;
                if (ok82.x0.Z()) {
                    ok82.t();
                    return;
                }
                return;
            case 2:
                lk8 lk8 = this.b.w0;
                if (lk8 != null) {
                    ((i3a) lk8).N(new k2a(21));
                    return;
                }
                return;
            case 3:
                lk8 lk82 = this.b.w0;
                if (lk82 != null) {
                    ((i3a) lk82).N(new k2a(22));
                    return;
                }
                return;
            case 4:
                ok8 ok83 = this.b;
                ok83.getClass();
                ok83.setHalfScreen((grb) new arb(ok83, 3));
                return;
            default:
                ok8 ok84 = this.b;
                ok84.getClass();
                Rect rect2 = rcg.a;
                rcg.d(rect2, ok84.Q0);
                ok84.S0.s(rect2.top, false, true);
                return;
        }
    }
}
