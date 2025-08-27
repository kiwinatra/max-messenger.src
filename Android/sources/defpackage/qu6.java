package defpackage;

import android.util.LogPrinter;
import android.view.View;
import androidx.gridlayout.widget.GridLayout;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: qu6  reason: default package */
public class qu6 {
    public int a;
    public int b;
    public int c;

    public qu6() {
        c();
    }

    public int a(GridLayout gridLayout, View view, ryg ryg, int i, boolean z) {
        return this.a - ryg.n(view, i, gridLayout.getLayoutMode());
    }

    public void b(int i, int i2) {
        this.a = Math.max(this.a, i);
        this.b = Math.max(this.b, i2);
    }

    public void c() {
        this.a = IntCompanionObject.MIN_VALUE;
        this.b = IntCompanionObject.MIN_VALUE;
        this.c = 2;
    }

    public int d(boolean z) {
        if (!z) {
            int i = this.c;
            LogPrinter logPrinter = GridLayout.z;
            if ((i & 2) != 0) {
                return 100000;
            }
        }
        return this.a + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Bounds{before=");
        sb.append(this.a);
        sb.append(", after=");
        return tr1.k(sb, this.b, '}');
    }
}
