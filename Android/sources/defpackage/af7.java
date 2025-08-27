package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;

/* renamed from: af7  reason: default package */
public final class af7 extends View.AccessibilityDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ af7(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.a) {
            case 0:
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                EditText editText = ((bf7) this.b).h.getEditText();
                if (editText != null) {
                    accessibilityNodeInfo.setLabeledBy(editText);
                    return;
                }
                return;
            default:
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                return;
        }
    }

    public void sendAccessibilityEvent(View view, int i) {
        Object value;
        switch (this.a) {
            case 1:
                if (i == 8192) {
                    dc9 dc9 = (dc9) this.b;
                    xme xme = dc9.J0;
                    do {
                        value = xme.getValue();
                        ((Number) value).intValue();
                    } while (!xme.b(value, Integer.valueOf(dc9.c.getSelectionEnd())));
                    return;
                }
                return;
            default:
                super.sendAccessibilityEvent(view, i);
                return;
        }
    }
}
