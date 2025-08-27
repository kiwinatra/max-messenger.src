package defpackage;

import android.view.View;
import java.util.WeakHashMap;

/* renamed from: lbg  reason: default package */
public final class lbg {
    public final View a;
    public int b;
    public int c;
    public int d;

    public lbg(View view) {
        this.a = view;
    }

    public final void a() {
        int i = this.d;
        View view = this.a;
        int top = i - (view.getTop() - this.b);
        WeakHashMap weakHashMap = gag.a;
        view.offsetTopAndBottom(top);
        view.offsetLeftAndRight(0 - (view.getLeft() - this.c));
    }

    public final boolean b(int i) {
        if (this.d == i) {
            return false;
        }
        this.d = i;
        a();
        return true;
    }
}
