package defpackage;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;

/* renamed from: x63  reason: default package */
public final class x63 extends a73 implements wcf {
    public final void L0(scf scf) {
        View view = this.a;
        AppCompatTextView appCompatTextView = view instanceof AppCompatTextView ? (AppCompatTextView) view : null;
        if (appCompatTextView != null) {
            appCompatTextView.setTextColor(scf.N);
        }
    }
}
