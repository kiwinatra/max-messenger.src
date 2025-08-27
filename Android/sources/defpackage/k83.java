package defpackage;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;

/* renamed from: k83  reason: default package */
public final class k83 extends pzc implements wcf {
    public final void L0(scf scf) {
        View view = this.a;
        AppCompatTextView appCompatTextView = view instanceof AppCompatTextView ? (AppCompatTextView) view : null;
        if (appCompatTextView != null) {
            appCompatTextView.setTextColor(scf.l);
        }
    }
}
