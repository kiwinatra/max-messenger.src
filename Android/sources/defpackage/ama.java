package defpackage;

import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: ama  reason: default package */
public final class ama {
    public static final ama a = new Object();

    public final OnBackInvokedCallback a(Function0<Unit> function0) {
        return new wn(2, function0);
    }

    public final void b(Object obj, int i, Object obj2) {
        ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(i, (OnBackInvokedCallback) obj2);
    }

    public final void c(Object obj, Object obj2) {
        ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }
}
