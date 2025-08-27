package defpackage;

import android.os.Bundle;
import android.view.Window;

/* renamed from: yed  reason: default package */
public final class yed extends xr0 {
    public final void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        try {
            i = getContext().getResources().getDimensionPixelSize(aec.picker_width);
        } catch (Throwable unused) {
            i = -1;
        }
        Window window = getWindow();
        if (window != null) {
            window.setLayout(i, -1);
        }
    }
}
