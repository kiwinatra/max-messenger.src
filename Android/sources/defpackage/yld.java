package defpackage;

import android.view.KeyEvent;
import android.widget.TextView;

/* renamed from: yld  reason: default package */
public final class yld implements TextView.OnEditorActionListener {
    public final /* synthetic */ gmd a;

    public yld(gmd gmd) {
        this.a = gmd;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        this.a.onSubmitQuery();
        return true;
    }
}
