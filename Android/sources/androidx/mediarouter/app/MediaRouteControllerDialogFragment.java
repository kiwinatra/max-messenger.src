package androidx.mediarouter.app;

import android.app.Dialog;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;

public class MediaRouteControllerDialogFragment extends DialogFragment {
    public final boolean B1 = false;
    public go C1;
    public kw8 D1;

    public MediaRouteControllerDialogFragment() {
        this.r1 = true;
        Dialog dialog = this.w1;
        if (dialog != null) {
            dialog.setCancelable(true);
        }
    }

    public final Dialog V2(Bundle bundle) {
        if (this.B1) {
            dw8 dw8 = new dw8(O1());
            this.C1 = dw8;
            dw8.j(this.D1);
        } else {
            this.C1 = new d(O1());
        }
        return this.C1;
    }

    public final void onConfigurationChanged(Configuration configuration) {
        this.Q0 = true;
        go goVar = this.C1;
        if (goVar == null) {
            return;
        }
        if (this.B1) {
            ((dw8) goVar).k();
        } else {
            ((d) goVar).s();
        }
    }

    public final void z2() {
        super.z2();
        go goVar = this.C1;
        if (goVar != null && !this.B1) {
            ((d) goVar).j(false);
        }
    }
}
