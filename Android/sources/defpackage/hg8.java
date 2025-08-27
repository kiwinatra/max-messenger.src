package defpackage;

import android.view.View;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;
import kotlin.time.DurationKt;

/* renamed from: hg8  reason: default package */
public class hg8 {
    public OnBackInvokedCallback a;

    public OnBackInvokedCallback a(gg8 gg8) {
        Objects.requireNonNull(gg8);
        return new wn(1, gg8);
    }

    public void b(gg8 gg8, View view, boolean z) {
        OnBackInvokedDispatcher m;
        if (this.a == null && (m = view.findOnBackInvokedDispatcher()) != null) {
            OnBackInvokedCallback a2 = a(gg8);
            this.a = a2;
            m.registerOnBackInvokedCallback(z ? DurationKt.NANOS_IN_MILLIS : 0, a2);
        }
    }

    public void c(View view) {
        OnBackInvokedDispatcher m = view.findOnBackInvokedDispatcher();
        if (m != null) {
            m.unregisterOnBackInvokedCallback(this.a);
            this.a = null;
        }
    }
}
