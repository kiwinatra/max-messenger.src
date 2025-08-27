package com.google.android.material.bottomsheet;

import android.app.Dialog;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatDialogFragment;
import ru.ok.TamBottomSheetDialogFragment;

public class BottomSheetDialogFragment extends AppCompatDialogFragment {
    public boolean B1;

    public Dialog V2(Bundle bundle) {
        return new xr0(O1(), U2());
    }

    public final void Z2() {
        if (this.B1) {
            T2(true, false);
        } else {
            T2(false, false);
        }
    }

    public final void a3() {
        Dialog dialog = this.w1;
        if (dialog instanceof xr0) {
            xr0 xr0 = (xr0) dialog;
            BottomSheetBehavior h = xr0.h();
            if (h.I && xr0.X) {
                this.B1 = true;
                if (h.L == 5) {
                    Z2();
                    return;
                }
                Dialog dialog2 = this.w1;
                if (dialog2 instanceof xr0) {
                    xr0 xr02 = (xr0) dialog2;
                    BottomSheetBehavior bottomSheetBehavior = xr02.w;
                    bottomSheetBehavior.W.remove(xr02.z0);
                }
                h.w(new vr0(1, (TamBottomSheetDialogFragment) this));
                h.K(5);
                return;
            }
        }
        T2(true, false);
    }
}
