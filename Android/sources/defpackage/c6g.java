package defpackage;

import android.hardware.display.DisplayManager;
import android.os.Handler;

/* renamed from: c6g  reason: default package */
public final class c6g implements DisplayManager.DisplayListener, b6g {
    public final /* synthetic */ int a = 1;
    public final DisplayManager b;
    public Object c;

    public c6g(f6g f6g, DisplayManager displayManager) {
        this.c = f6g;
        this.b = displayManager;
    }

    private final void a(int i) {
    }

    private final void b(int i) {
    }

    private final void c(int i) {
    }

    private final void d(int i) {
    }

    public void g(jrf jrf) {
        this.c = jrf;
        Handler m = t0g.m((Handler.Callback) null);
        DisplayManager displayManager = this.b;
        displayManager.registerDisplayListener(this, m);
        jrf.c(displayManager.getDisplay(0));
    }

    public void l() {
        this.b.unregisterDisplayListener(this);
        this.c = null;
    }

    public final void onDisplayAdded(int i) {
        int i2 = this.a;
    }

    public final void onDisplayChanged(int i) {
        switch (this.a) {
            case 0:
                if (i == 0) {
                    f6g.a((f6g) this.c, this.b.getDisplay(0));
                    return;
                }
                return;
            default:
                jrf jrf = (jrf) this.c;
                if (jrf != null && i == 0) {
                    jrf.c(this.b.getDisplay(0));
                    return;
                }
                return;
        }
    }

    public final void onDisplayRemoved(int i) {
        int i2 = this.a;
    }

    public c6g(DisplayManager displayManager) {
        this.b = displayManager;
    }
}
