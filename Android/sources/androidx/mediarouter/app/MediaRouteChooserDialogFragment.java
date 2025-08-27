package androidx.mediarouter.app;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import java.util.List;

public class MediaRouteChooserDialogFragment extends DialogFragment {
    public final boolean B1 = false;
    public go C1;
    public kw8 D1;

    public MediaRouteChooserDialogFragment() {
        this.r1 = true;
        Dialog dialog = this.w1;
        if (dialog != null) {
            dialog.setCancelable(true);
        }
    }

    public final Dialog V2(Bundle bundle) {
        if (this.B1) {
            uv8 uv8 = new uv8(O1());
            this.C1 = uv8;
            Z2();
            uv8.h(this.D1);
        } else {
            ev8 ev8 = new ev8(O1());
            this.C1 = ev8;
            Z2();
            ev8.h(this.D1);
        }
        return this.C1;
    }

    public final void Z2() {
        if (this.D1 == null) {
            Bundle bundle = this.x;
            if (bundle != null) {
                Bundle bundle2 = bundle.getBundle("selector");
                kw8 kw8 = null;
                if (bundle2 != null) {
                    kw8 = new kw8((List) null, bundle2);
                } else {
                    kw8 kw82 = kw8.c;
                }
                this.D1 = kw8;
            }
            if (this.D1 == null) {
                this.D1 = kw8.c;
            }
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
        this.Q0 = true;
        go goVar = this.C1;
        if (goVar != null) {
            int i = -2;
            if (this.B1) {
                uv8 uv8 = (uv8) goVar;
                Context context = uv8.y;
                int t = !context.getResources().getBoolean(idc.is_tablet) ? -1 : b0h.t(context);
                if (!context.getResources().getBoolean(idc.is_tablet)) {
                    i = -1;
                }
                uv8.getWindow().setLayout(t, i);
                return;
            }
            ev8 ev8 = (ev8) goVar;
            ev8.getWindow().setLayout(b0h.t(ev8.getContext()), -2);
        }
    }
}
