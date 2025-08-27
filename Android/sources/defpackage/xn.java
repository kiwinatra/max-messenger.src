package defpackage;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;
import kotlin.time.DurationKt;

/* renamed from: xn  reason: default package */
public abstract class xn {
    public static OnBackInvokedDispatcher a(Activity activity) {
        return activity.getOnBackInvokedDispatcher();
    }

    public static OnBackInvokedCallback b(Object obj, eo eoVar) {
        Objects.requireNonNull(eoVar);
        wn wnVar = new wn(0, eoVar);
        z3.n(obj).registerOnBackInvokedCallback(DurationKt.NANOS_IN_MILLIS, wnVar);
        return wnVar;
    }

    public static void c(Object obj, Object obj2) {
        z3.n(obj).unregisterOnBackInvokedCallback(z3.j(obj2));
    }
}
