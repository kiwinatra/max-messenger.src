package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;

/* renamed from: xy3  reason: default package */
public final /* synthetic */ class xy3 implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ zy3 b;

    public /* synthetic */ xy3(zy3 zy3, int i) {
        this.a = i;
        this.b = zy3;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        switch (this.a) {
            case 0:
                int measuredHeight = view.getMeasuredHeight();
                zy3 zy3 = this.b;
                ty3 ty3 = zy3.k;
                if (measuredHeight != ty3.a) {
                    zy3.k = ty3.a(ty3, measuredHeight, Build.VERSION.SDK_INT >= 30 ? view.getRootWindowInsets().getInsetsIgnoringVisibility(WindowInsets.Type.systemBars()).bottom : view.getRootWindowInsets().getStableInsetBottom(), false, 4);
                    for (uy3 m : zy3.a) {
                        m.m(zy3.k);
                    }
                    return;
                }
                return;
            default:
                int measuredHeight2 = view.getMeasuredHeight();
                int measuredHeight3 = view.getMeasuredHeight();
                zy3 zy32 = this.b;
                ty3 ty32 = zy32.j;
                if (measuredHeight3 != ty32.a) {
                    zy32.j = ty3.a(ty32, measuredHeight2, Build.VERSION.SDK_INT >= 30 ? view.getRootWindowInsets().getInsetsIgnoringVisibility(WindowInsets.Type.systemBars()).top : view.getRootWindowInsets().getStableInsetTop(), false, 4);
                    for (uy3 q : zy32.a) {
                        q.q(zy32.j);
                    }
                    return;
                }
                return;
        }
    }
}
