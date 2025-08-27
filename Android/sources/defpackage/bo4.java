package defpackage;

import android.app.Dialog;
import android.view.View;
import androidx.fragment.app.DialogFragment;

/* renamed from: bo4  reason: default package */
public final class bo4 extends ld8 {
    public final /* synthetic */ ld8 v0;
    public final /* synthetic */ DialogFragment w0;

    public bo4(DialogFragment dialogFragment, hc6 hc6) {
        this.w0 = dialogFragment;
        this.v0 = hc6;
    }

    public final View h0(int i) {
        ld8 ld8 = this.v0;
        if (ld8.i0()) {
            return ld8.h0(i);
        }
        Dialog dialog = this.w0.w1;
        if (dialog != null) {
            return dialog.findViewById(i);
        }
        return null;
    }

    public final boolean i0() {
        return this.v0.i0() || this.w0.A1;
    }
}
