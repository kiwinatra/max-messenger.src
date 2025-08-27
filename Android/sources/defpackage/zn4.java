package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import androidx.fragment.app.DialogFragment;

/* renamed from: zn4  reason: default package */
public final class zn4 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ DialogFragment a;

    public zn4(DialogFragment dialogFragment) {
        this.a = dialogFragment;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        DialogFragment dialogFragment = this.a;
        Dialog dialog = dialogFragment.w1;
        if (dialog != null) {
            dialogFragment.onDismiss(dialog);
        }
    }
}
