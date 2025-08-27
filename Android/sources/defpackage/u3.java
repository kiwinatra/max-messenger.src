package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* renamed from: u3  reason: default package */
public final class u3 extends View.AccessibilityDelegate {
    public final v3 a;

    public u3(v3 v3Var) {
        this.a = v3Var;
    }

    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return this.a.a(view, accessibilityEvent);
    }

    public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
        grg b = this.a.b(view);
        if (b != null) {
            return (AccessibilityNodeProvider) b.b;
        }
        return null;
    }

    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.a.c(view, accessibilityEvent);
    }

    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        Object obj;
        g4 g4Var = new g4(accessibilityNodeInfo);
        WeakHashMap weakHashMap = gag.a;
        accessibilityNodeInfo.setScreenReaderFocusable(Boolean.valueOf(aag.d(view)).booleanValue());
        accessibilityNodeInfo.setHeading(Boolean.valueOf(aag.c(view)).booleanValue());
        accessibilityNodeInfo.setPaneTitle(aag.b(view));
        int i = ahc.tag_state_description;
        if (Build.VERSION.SDK_INT >= 30) {
            obj = cag.b(view);
        } else {
            obj = view.getTag(i);
            if (!CharSequence.class.isInstance(obj)) {
                obj = null;
            }
        }
        CharSequence charSequence = (CharSequence) obj;
        if (Build.VERSION.SDK_INT >= 30) {
            b4.c(accessibilityNodeInfo, charSequence);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
        this.a.d(view, g4Var);
        accessibilityNodeInfo.getText();
        List list = (List) view.getTag(ahc.tag_accessibility_actions);
        if (list == null) {
            list = Collections.emptyList();
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            g4Var.b((a4) list.get(i2));
        }
    }

    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.a.e(view, accessibilityEvent);
    }

    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.a.f(viewGroup, view, accessibilityEvent);
    }

    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        return this.a.g(view, i, bundle);
    }

    public final void sendAccessibilityEvent(View view, int i) {
        this.a.h(view, i);
    }

    public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        this.a.i(view, accessibilityEvent);
    }
}
