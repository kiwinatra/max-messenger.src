package defpackage;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import kotlin.io.ConstantsKt;

/* renamed from: kog  reason: default package */
public final class kog extends ld8 {
    public final WindowInsetsController v0;
    public final p3a w0;
    public Window x0;

    public kog(WindowInsetsController windowInsetsController, p3a p3a) {
        this.v0 = windowInsetsController;
        this.w0 = p3a;
    }

    public final void Q(int i) {
        if ((i & 8) != 0) {
            ((yu9) this.w0.a).j();
        }
        this.v0.hide(i & -9);
    }

    public final boolean S() {
        this.v0.setSystemBarsAppearance(0, 0);
        return (this.v0.getSystemBarsAppearance() & 8) != 0;
    }

    public final void s0(boolean z) {
        Window window = this.x0;
        if (z) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            }
            this.v0.setSystemBarsAppearance(16, 16);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & -17);
        }
        this.v0.setSystemBarsAppearance(0, 16);
    }

    public final void t0(boolean z) {
        Window window = this.x0;
        if (z) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | ConstantsKt.DEFAULT_BUFFER_SIZE);
            }
            this.v0.setSystemBarsAppearance(8, 8);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & -8193);
        }
        this.v0.setSystemBarsAppearance(0, 8);
    }

    public final void u0() {
        this.v0.setSystemBarsBehavior(2);
    }

    public final void z0(int i) {
        if ((i & 8) != 0) {
            ((yu9) this.w0.a).m();
        }
        this.v0.show(i & -9);
    }
}
