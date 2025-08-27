package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: rfe  reason: default package */
public final class rfe extends yu9 {
    public View c;
    public WindowInsetsController o;

    public final void j() {
        WindowInsetsController windowInsetsController = this.o;
        View view = this.c;
        if (windowInsetsController == null) {
            windowInsetsController = view != null ? view.getWindowInsetsController() : null;
        }
        if (windowInsetsController != null) {
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            qfe qfe = new qfe(atomicBoolean);
            windowInsetsController.addOnControllableInsetsChangedListener(qfe);
            if (!atomicBoolean.get() && view != null) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
            }
            windowInsetsController.removeOnControllableInsetsChangedListener(qfe);
            windowInsetsController.hide(WindowInsets.Type.ime());
            return;
        }
        super.j();
    }

    public final void m() {
        View view = this.c;
        if (view != null && Build.VERSION.SDK_INT < 33) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).isActive();
        }
        WindowInsetsController windowInsetsController = this.o;
        if (windowInsetsController == null) {
            windowInsetsController = view != null ? view.getWindowInsetsController() : null;
        }
        if (windowInsetsController != null) {
            windowInsetsController.show(WindowInsets.Type.ime());
        }
        super.m();
    }
}
