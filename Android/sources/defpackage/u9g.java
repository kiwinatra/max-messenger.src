package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* renamed from: u9g  reason: default package */
public final class u9g implements View.OnApplyWindowInsetsListener {
    public iog a = null;
    public final /* synthetic */ View b;
    public final /* synthetic */ vla c;

    public u9g(View view, vla vla) {
        this.b = view;
        this.c = vla;
    }

    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        iog g = iog.g(view, windowInsets);
        int i = Build.VERSION.SDK_INT;
        vla vla = this.c;
        if (i < 30) {
            v9g.a(windowInsets, this.b);
            if (g.equals(this.a)) {
                return vla.z(view, g).f();
            }
        }
        this.a = g;
        iog z = vla.z(view, g);
        if (i >= 30) {
            return z.f();
        }
        WeakHashMap weakHashMap = gag.a;
        t9g.c(view);
        return z.f();
    }
}
