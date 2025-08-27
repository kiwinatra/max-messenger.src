package defpackage;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* renamed from: h4  reason: default package */
public final class h4 extends AccessibilityNodeProvider {
    public final grg a;

    public h4(grg grg) {
        this.a = grg;
    }

    public final void addExtraDataToAccessibilityNodeInfo(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
        this.a.getClass();
    }

    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        g4 w = this.a.w(i);
        if (w == null) {
            return null;
        }
        return w.a;
    }

    public final List findAccessibilityNodeInfosByText(String str, int i) {
        this.a.getClass();
        return null;
    }

    public final AccessibilityNodeInfo findFocus(int i) {
        g4 x = this.a.x(i);
        if (x == null) {
            return null;
        }
        return x.a;
    }

    public final boolean performAction(int i, int i2, Bundle bundle) {
        return this.a.E(i, i2, bundle);
    }
}
