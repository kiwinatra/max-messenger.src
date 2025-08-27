package defpackage;

import android.hardware.display.DisplayManager;
import android.view.Display;

/* renamed from: gub  reason: default package */
public final class gub implements DisplayManager.DisplayListener {
    public final /* synthetic */ kub a;

    public gub(kub kub) {
        this.a = kub;
    }

    public final void onDisplayAdded(int i) {
    }

    public final void onDisplayChanged(int i) {
        kub kub = this.a;
        Display display = kub.getDisplay();
        if (display != null && display.getDisplayId() == i) {
            kub.b();
        }
    }

    public final void onDisplayRemoved(int i) {
    }
}
