package defpackage;

import android.view.KeyEvent;
import android.widget.TextView;

/* renamed from: vy5  reason: default package */
public final /* synthetic */ class vy5 implements TextView.OnEditorActionListener {
    public final /* synthetic */ int a;

    public /* synthetic */ vy5(int i) {
        this.a = i;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        switch (this.a) {
            case 0:
                if (i != 6) {
                    return false;
                }
                textView.clearFocus();
                return false;
            default:
                if (i != 6) {
                    return false;
                }
                textView.clearFocus();
                return false;
        }
    }
}
