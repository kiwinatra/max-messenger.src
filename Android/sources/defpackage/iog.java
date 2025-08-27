package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import java.util.WeakHashMap;

/* renamed from: iog  reason: default package */
public final class iog {
    public static final iog b;
    public final fog a;

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            b = eog.q;
        } else {
            b = fog.b;
        }
    }

    public iog(WindowInsets windowInsets) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.a = new eog(this, windowInsets);
        } else {
            this.a = new dog(this, windowInsets);
        }
    }

    public static iog g(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        iog iog = new iog(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            WeakHashMap weakHashMap = gag.a;
            iog a2 = w9g.a(view);
            fog fog = iog.a;
            fog.q(a2);
            fog.d(view.getRootView());
        }
        return iog;
    }

    public final int a() {
        return this.a.j().d;
    }

    public final int b() {
        return this.a.j().a;
    }

    public final int c() {
        return this.a.j().c;
    }

    public final int d() {
        return this.a.j().b;
    }

    public final iog e(int i, int i2, int i3, int i4) {
        zng yng = Build.VERSION.SDK_INT >= 30 ? new yng(this) : new xng(this);
        yng.f(wh7.b(i, i2, i3, i4));
        return yng.b();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iog)) {
            return false;
        }
        return Objects.equals(this.a, ((iog) obj).a);
    }

    public final WindowInsets f() {
        fog fog = this.a;
        if (fog instanceof aog) {
            return ((aog) fog).c;
        }
        return null;
    }

    public final int hashCode() {
        fog fog = this.a;
        if (fog == null) {
            return 0;
        }
        return fog.hashCode();
    }

    public iog() {
        this.a = new fog(this);
    }
}
