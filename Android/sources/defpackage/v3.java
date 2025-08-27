package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeProvider;

/* renamed from: v3  reason: default package */
public class v3 {
    public static final View.AccessibilityDelegate c = new View.AccessibilityDelegate();
    public final View.AccessibilityDelegate a;
    public final u3 b;

    public v3() {
        this(c);
    }

    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return this.a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public grg b(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.a.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new grg(1, accessibilityNodeProvider);
        }
        return null;
    }

    public void c(View view, AccessibilityEvent accessibilityEvent) {
        this.a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void d(View view, g4 g4Var) {
        this.a.onInitializeAccessibilityNodeInfo(view, g4Var.a);
    }

    public void e(View view, AccessibilityEvent accessibilityEvent) {
        this.a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    /* JADX WARNING: type inference failed for: r8v11, types: [java.lang.Object[]] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean g(android.view.View r7, int r8, android.os.Bundle r9) {
        /*
            r6 = this;
            int r0 = defpackage.ahc.tag_accessibility_actions
            java.lang.Object r0 = r7.getTag(r0)
            java.util.List r0 = (java.util.List) r0
            if (r0 != 0) goto L_0x000e
            java.util.List r0 = java.util.Collections.emptyList()
        L_0x000e:
            r1 = 0
            r2 = r1
        L_0x0010:
            int r3 = r0.size()
            r4 = 0
            if (r2 >= r3) goto L_0x0040
            java.lang.Object r3 = r0.get(r2)
            a4 r3 = (defpackage.a4) r3
            int r5 = r3.a()
            if (r5 != r8) goto L_0x003d
            p4 r0 = r3.d
            if (r0 == 0) goto L_0x0040
            java.lang.Class r2 = r3.c
            if (r2 != 0) goto L_0x002c
            goto L_0x0038
        L_0x002c:
            java.lang.reflect.Constructor r2 = r2.getDeclaredConstructor(r4)     // Catch:{ Exception -> 0x0038 }
            java.lang.Object r2 = r2.newInstance(r4)     // Catch:{ Exception -> 0x0038 }
            defpackage.rae.w(r2)     // Catch:{ Exception -> 0x0038 }
            throw r4     // Catch:{ Exception -> 0x0038 }
        L_0x0038:
            boolean r0 = r0.e(r7)
            goto L_0x0041
        L_0x003d:
            int r2 = r2 + 1
            goto L_0x0010
        L_0x0040:
            r0 = r1
        L_0x0041:
            if (r0 != 0) goto L_0x0049
            android.view.View$AccessibilityDelegate r6 = r6.a
            boolean r0 = r6.performAccessibilityAction(r7, r8, r9)
        L_0x0049:
            if (r0 != 0) goto L_0x00a5
            int r6 = defpackage.ahc.accessibility_action_clickable_span
            if (r8 != r6) goto L_0x00a5
            if (r9 == 0) goto L_0x00a5
            java.lang.String r6 = "ACCESSIBILITY_CLICKABLE_SPAN_ID"
            r8 = -1
            int r6 = r9.getInt(r6, r8)
            int r8 = defpackage.ahc.tag_accessibility_clickable_spans
            java.lang.Object r8 = r7.getTag(r8)
            android.util.SparseArray r8 = (android.util.SparseArray) r8
            if (r8 == 0) goto L_0x00a4
            java.lang.Object r6 = r8.get(r6)
            java.lang.ref.WeakReference r6 = (java.lang.ref.WeakReference) r6
            if (r6 == 0) goto L_0x00a4
            java.lang.Object r6 = r6.get()
            android.text.style.ClickableSpan r6 = (android.text.style.ClickableSpan) r6
            if (r6 == 0) goto L_0x00a4
            android.view.accessibility.AccessibilityNodeInfo r8 = r7.createAccessibilityNodeInfo()
            java.lang.CharSequence r8 = r8.getText()
            boolean r9 = r8 instanceof android.text.Spanned
            if (r9 == 0) goto L_0x008e
            r9 = r8
            android.text.Spanned r9 = (android.text.Spanned) r9
            int r8 = r8.length()
            java.lang.Class<android.text.style.ClickableSpan> r0 = android.text.style.ClickableSpan.class
            java.lang.Object[] r8 = r9.getSpans(r1, r8, r0)
            r4 = r8
            android.text.style.ClickableSpan[] r4 = (android.text.style.ClickableSpan[]) r4
        L_0x008e:
            r8 = r1
        L_0x008f:
            if (r4 == 0) goto L_0x00a4
            int r9 = r4.length
            if (r8 >= r9) goto L_0x00a4
            r9 = r4[r8]
            boolean r9 = r6.equals(r9)
            if (r9 == 0) goto L_0x00a1
            r6.onClick(r7)
            r1 = 1
            goto L_0x00a4
        L_0x00a1:
            int r8 = r8 + 1
            goto L_0x008f
        L_0x00a4:
            r0 = r1
        L_0x00a5:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v3.g(android.view.View, int, android.os.Bundle):boolean");
    }

    public void h(View view, int i) {
        this.a.sendAccessibilityEvent(view, i);
    }

    public void i(View view, AccessibilityEvent accessibilityEvent) {
        this.a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public v3(View.AccessibilityDelegate accessibilityDelegate) {
        this.a = accessibilityDelegate;
        this.b = new u3(this);
    }
}
