package defpackage;

import android.view.View;
import androidx.gridlayout.widget.GridLayout;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: mu6  reason: default package */
public final class mu6 extends qu6 {
    public int d;

    public final int a(GridLayout gridLayout, View view, ryg ryg, int i, boolean z) {
        return Math.max(0, super.a(gridLayout, view, ryg, i, z));
    }

    public final void b(int i, int i2) {
        super.b(i, i2);
        this.d = Math.max(this.d, i + i2);
    }

    public final void c() {
        super.c();
        this.d = IntCompanionObject.MIN_VALUE;
    }

    public final int d(boolean z) {
        return Math.max(super.d(z), this.d);
    }
}
