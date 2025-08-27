package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* renamed from: sng  reason: default package */
public final class sng extends WindowInsetsAnimation$Callback {
    public final n22 a;
    public List b;
    public ArrayList c;
    public final HashMap d = new HashMap();

    public sng(n22 n22) {
        super(n22.a);
        this.a = n22;
    }

    public final vng a(WindowInsetsAnimation windowInsetsAnimation) {
        vng vng = (vng) this.d.get(windowInsetsAnimation);
        if (vng == null) {
            vng = new vng(0, (Interpolator) null, 0);
            if (Build.VERSION.SDK_INT >= 30) {
                vng.a = new tng(windowInsetsAnimation);
            }
            this.d.put(windowInsetsAnimation, vng);
        }
        return vng;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        this.a.b(a(windowInsetsAnimation));
        this.d.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        this.a.c(a(windowInsetsAnimation));
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        ArrayList arrayList = this.c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.c = arrayList2;
            this.b = Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation k = vgd.k(list.get(size));
            vng a2 = a(k);
            a2.a.d(k.getFraction());
            this.c.add(a2);
        }
        return this.a.d(iog.g((View) null, windowInsets), this.b).f();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        h0h e = this.a.e(a(windowInsetsAnimation), new h0h(bounds));
        e.getClass();
        vgd.n();
        return vgd.i(((wh7) e.b).d(), ((wh7) e.c).d());
    }
}
