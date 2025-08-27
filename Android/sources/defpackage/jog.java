package defpackage;

import android.view.View;
import android.view.Window;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: jog  reason: default package */
public final class jog extends ld8 {
    public final Window v0;
    public final p3a w0;

    public jog(Window window, p3a p3a) {
        this.v0 = window;
        this.w0 = p3a;
    }

    public final void D0(int i) {
        View decorView = this.v0.getDecorView();
        decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
    }

    public final void E0(int i) {
        View decorView = this.v0.getDecorView();
        decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
    }

    public final void Q(int i) {
        for (int i2 = 1; i2 <= 256; i2 <<= 1) {
            if ((i & i2) != 0) {
                if (i2 == 1) {
                    D0(4);
                } else if (i2 == 2) {
                    D0(2);
                } else if (i2 == 8) {
                    ((yu9) this.w0.a).j();
                }
            }
        }
    }

    public final boolean S() {
        return (this.v0.getDecorView().getSystemUiVisibility() & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0;
    }

    public final void s0(boolean z) {
        if (z) {
            Window window = this.v0;
            window.clearFlags(134217728);
            window.addFlags(IntCompanionObject.MIN_VALUE);
            D0(16);
            return;
        }
        E0(16);
    }

    public final void t0(boolean z) {
        if (z) {
            Window window = this.v0;
            window.clearFlags(67108864);
            window.addFlags(IntCompanionObject.MIN_VALUE);
            D0(ConstantsKt.DEFAULT_BUFFER_SIZE);
            return;
        }
        E0(ConstantsKt.DEFAULT_BUFFER_SIZE);
    }

    public final void u0() {
        E0(2048);
        D0(ConstantsKt.DEFAULT_BLOCK_SIZE);
    }

    public final void z0(int i) {
        for (int i2 = 1; i2 <= 256; i2 <<= 1) {
            if ((i & i2) != 0) {
                if (i2 == 1) {
                    E0(4);
                    this.v0.clearFlags(1024);
                } else if (i2 == 2) {
                    E0(2);
                } else if (i2 == 8) {
                    ((yu9) this.w0.a).m();
                }
            }
        }
    }
}
