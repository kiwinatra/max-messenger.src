package defpackage;

import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import java.util.WeakHashMap;

/* renamed from: w3  reason: default package */
public final class w3 implements AccessibilityManager.TouchExplorationStateChangeListener {
    public final rt3 a;

    public w3(rt3 rt3) {
        this.a = rt3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w3)) {
            return false;
        }
        return this.a.equals(((w3) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final void onTouchExplorationStateChanged(boolean z) {
        kx4 kx4 = (kx4) this.a.b;
        AutoCompleteTextView autoCompleteTextView = kx4.h;
        if (autoCompleteTextView != null && !q8.t(autoCompleteTextView)) {
            int i = z ? 2 : 1;
            WeakHashMap weakHashMap = gag.a;
            kx4.d.setImportantForAccessibility(i);
        }
    }
}
