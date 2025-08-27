package androidx.appcompat.app;

import android.app.Dialog;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;

public class AppCompatDialogFragment extends DialogFragment {
    public Dialog V2(Bundle bundle) {
        return new go(O1(), U2());
    }

    public final void X2(Dialog dialog, int i) {
        if (dialog instanceof go) {
            go goVar = (go) dialog;
            if (!(i == 1 || i == 2)) {
                if (i == 3) {
                    dialog.getWindow().addFlags(24);
                } else {
                    return;
                }
            }
            goVar.d().f(1);
            return;
        }
        super.X2(dialog, i);
    }
}
