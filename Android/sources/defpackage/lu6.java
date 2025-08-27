package defpackage;

import android.view.View;
import java.util.WeakHashMap;

/* renamed from: lu6  reason: default package */
public final class lu6 extends ryg {
    public final /* synthetic */ ryg j;
    public final /* synthetic */ ryg k;

    public lu6(ryg ryg, ryg ryg2) {
        super(11);
        this.j = ryg;
        this.k = ryg2;
    }

    public final int n(View view, int i, int i2) {
        WeakHashMap weakHashMap = gag.a;
        return (view.getLayoutDirection() == 1 ? this.k : this.j).n(view, i, i2);
    }

    public final String r() {
        return "SWITCHING[L:" + this.j.r() + ", R:" + this.k.r() + "]";
    }

    public final int s(View view, int i) {
        WeakHashMap weakHashMap = gag.a;
        return (view.getLayoutDirection() == 1 ? this.k : this.j).s(view, i);
    }
}
