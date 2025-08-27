package defpackage;

import android.view.View;
import android.view.autofill.AutofillId;
import java.util.Objects;

/* renamed from: aag  reason: default package */
public abstract class aag {
    /* JADX WARNING: type inference failed for: r1v0, types: [android.view.View$OnUnhandledKeyEventListener, java.lang.Object] */
    public static void a(View view, fag fag) {
        qae qae = (qae) view.getTag(ahc.tag_unhandled_key_listeners);
        if (qae == null) {
            qae = new qae();
            view.setTag(ahc.tag_unhandled_key_listeners, qae);
        }
        Objects.requireNonNull(fag);
        ? obj = new Object();
        qae.put(fag, obj);
        view.addOnUnhandledKeyEventListener(obj);
    }

    public static CharSequence b(View view) {
        return view.getAccessibilityPaneTitle();
    }

    public static boolean c(View view) {
        return view.isAccessibilityHeading();
    }

    public static boolean d(View view) {
        return view.isScreenReaderFocusable();
    }

    public static void e(View view, fag fag) {
        View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
        qae qae = (qae) view.getTag(ahc.tag_unhandled_key_listeners);
        if (qae != null && (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) qae.get(fag)) != null) {
            view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }
    }

    public static <T> T f(View view, int i) {
        return view.requireViewById(i);
    }

    public static void g(View view, boolean z) {
        view.setAccessibilityHeading(z);
    }

    public static void h(View view, CharSequence charSequence) {
        view.setAccessibilityPaneTitle(charSequence);
    }

    public static void i(View view, ad0 ad0) {
        view.setAutofillId((AutofillId) null);
    }

    public static void j(View view, boolean z) {
        view.setScreenReaderFocusable(z);
    }
}
