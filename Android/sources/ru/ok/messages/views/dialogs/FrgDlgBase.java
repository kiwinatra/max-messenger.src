package ru.ok.messages.views.dialogs;

import android.app.Activity;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;

public class FrgDlgBase extends DialogFragment {
    public boolean B1 = true;
    public gdb C1;
    public boolean D1;
    public dm4 E1;

    public void Z2(m5 m5Var) {
        this.B1 = false;
    }

    public void a3(int i, String[] strArr, int[] iArr) {
    }

    public final void g2(Activity activity) {
        this.Q0 = true;
        z68.c("ru.ok.messages.views.dialogs.FrgDlgBase", "onAttach: ".concat(getClass().getName()), new Object[0]);
        if (activity instanceof m5) {
            this.B1 = true;
            Z2((m5) activity);
            return;
        }
        throw new IllegalStateException("Use FrgDlgBase only in ActBase subclasses.");
    }

    public void i2(Bundle bundle) {
        super.i2(bundle);
        m5 m5Var = (M1() == null || M1().isFinishing()) ? null : (m5) M1();
        if (m5Var == null) {
            T2(false, false);
            return;
        }
        this.E1 = m5Var.x;
        if (this.B1) {
            throw new IllegalStateException("super.onAttachBase() not called");
        }
    }

    public final void t2() {
        this.Q0 = true;
        this.D1 = false;
    }

    public final void v2(int i, String[] strArr, int[] iArr) {
        n54.E(O1(), strArr, iArr);
        if (this.D1) {
            a3(i, strArr, iArr);
        } else {
            this.C1 = new gdb(i, strArr, iArr);
        }
    }

    public final void w2() {
        this.Q0 = true;
        this.D1 = true;
        gdb gdb = this.C1;
        if (gdb != null) {
            a3(gdb.a, gdb.b, gdb.c);
            this.C1 = null;
        }
    }
}
