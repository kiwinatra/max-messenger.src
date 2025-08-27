package defpackage;

import android.os.Build;
import android.view.animation.Interpolator;

/* renamed from: vng  reason: default package */
public final class vng {
    public ung a;

    public vng(int i, Interpolator interpolator, long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.a = new tng(vgd.j(i, interpolator, j));
        } else {
            this.a = new ung(i, interpolator, j);
        }
    }
}
