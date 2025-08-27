package defpackage;

import androidx.constraintlayout.widget.ConstraintLayout;

/* renamed from: tpc  reason: default package */
public final class tpc extends ConstraintLayout {
    public int E0;
    public spc F0;

    public final int getSelected() {
        return this.E0 + 1;
    }

    public final void setOnSelectListener(spc spc) {
        this.F0 = spc;
    }
}
