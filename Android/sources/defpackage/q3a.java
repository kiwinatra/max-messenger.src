package defpackage;

import android.view.View;

/* renamed from: q3a  reason: default package */
public final class q3a extends View.AccessibilityDelegate {
    public final /* synthetic */ w1f a;
    public final /* synthetic */ s3a b;

    public q3a(s3a s3a, w1f w1f) {
        this.b = s3a;
        this.a = w1f;
    }

    public final void sendAccessibilityEvent(View view, int i) {
        super.sendAccessibilityEvent(view, i);
        if (i == 8192) {
            try {
                this.a.a(this.b.X.getSelectionStart());
            } catch (Exception unused) {
            }
        }
    }
}
