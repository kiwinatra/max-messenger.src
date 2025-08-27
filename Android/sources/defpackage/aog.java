package defpackage;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: aog  reason: default package */
public abstract class aog extends fog {
    public static boolean h = false;
    public static Method i;
    public static Class j;
    public static Field k;
    public static Field l;
    public final WindowInsets c;
    public wh7[] d;
    public wh7 e = null;
    public iog f;
    public wh7 g;

    public aog(iog iog, WindowInsets windowInsets) {
        super(iog);
        this.c = windowInsets;
    }

    @SuppressLint({"WrongConstant"})
    private wh7 r(int i2, boolean z) {
        wh7 wh7 = wh7.e;
        for (int i3 = 1; i3 <= 256; i3 <<= 1) {
            if ((i2 & i3) != 0) {
                wh7 = wh7.a(wh7, s(i3, z));
            }
        }
        return wh7;
    }

    private wh7 t() {
        iog iog = this.f;
        return iog != null ? iog.a.h() : wh7.e;
    }

    private wh7 u(View view) {
        if (Build.VERSION.SDK_INT < 30) {
            if (!h) {
                w();
            }
            Method method = i;
            if (!(method == null || j == null || k == null)) {
                try {
                    Object invoke = method.invoke(view, (Object[]) null);
                    if (invoke == null) {
                        return null;
                    }
                    Rect rect = (Rect) k.get(l.get(invoke));
                    if (rect != null) {
                        return wh7.b(rect.left, rect.top, rect.right, rect.bottom);
                    }
                    return null;
                } catch (ReflectiveOperationException e2) {
                    e2.getMessage();
                }
            }
            return null;
        }
        throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
    }

    @SuppressLint({"PrivateApi"})
    private static void w() {
        try {
            i = View.class.getDeclaredMethod("getViewRootImpl", (Class[]) null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            j = cls;
            k = cls.getDeclaredField("mVisibleInsets");
            l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            k.setAccessible(true);
            l.setAccessible(true);
        } catch (ReflectiveOperationException e2) {
            e2.getMessage();
        }
        h = true;
    }

    public void d(View view) {
        wh7 u = u(view);
        if (u == null) {
            u = wh7.e;
        }
        x(u);
    }

    public wh7 f(int i2) {
        return r(i2, false);
    }

    public final wh7 j() {
        if (this.e == null) {
            WindowInsets windowInsets = this.c;
            this.e = wh7.b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.e;
    }

    public boolean n() {
        return this.c.isRound();
    }

    @SuppressLint({"WrongConstant"})
    public boolean o(int i2) {
        for (int i3 = 1; i3 <= 256; i3 <<= 1) {
            if ((i2 & i3) != 0 && !v(i3)) {
                return false;
            }
        }
        return true;
    }

    public void p(wh7[] wh7Arr) {
        this.d = wh7Arr;
    }

    public void q(iog iog) {
        this.f = iog;
    }

    public wh7 s(int i2, boolean z) {
        int i3;
        if (i2 == 1) {
            return z ? wh7.b(0, Math.max(t().b, j().b), 0, 0) : wh7.b(0, j().b, 0, 0);
        }
        wh7 wh7 = null;
        if (i2 != 2) {
            wh7 wh72 = wh7.e;
            if (i2 == 8) {
                wh7[] wh7Arr = this.d;
                if (wh7Arr != null) {
                    wh7 = wh7Arr[3];
                }
                if (wh7 != null) {
                    return wh7;
                }
                wh7 j2 = j();
                wh7 t = t();
                int i4 = j2.d;
                if (i4 > t.d) {
                    return wh7.b(0, 0, 0, i4);
                }
                wh7 wh73 = this.g;
                return (wh73 == null || wh73.equals(wh72) || (i3 = this.g.d) <= t.d) ? wh72 : wh7.b(0, 0, 0, i3);
            } else if (i2 == 16) {
                return i();
            } else {
                if (i2 == 32) {
                    return g();
                }
                if (i2 == 64) {
                    return k();
                }
                if (i2 != 128) {
                    return wh72;
                }
                iog iog = this.f;
                gq4 e2 = iog != null ? iog.a.e() : e();
                if (e2 == null) {
                    return wh72;
                }
                DisplayCutout displayCutout = e2.a;
                return wh7.b(fq4.d(displayCutout), fq4.f(displayCutout), fq4.e(displayCutout), fq4.c(displayCutout));
            }
        } else if (z) {
            wh7 t2 = t();
            wh7 h2 = h();
            return wh7.b(Math.max(t2.a, h2.a), 0, Math.max(t2.c, h2.c), Math.max(t2.d, h2.d));
        } else {
            wh7 j3 = j();
            iog iog2 = this.f;
            if (iog2 != null) {
                wh7 = iog2.a.h();
            }
            int i5 = j3.d;
            if (wh7 != null) {
                i5 = Math.min(i5, wh7.d);
            }
            return wh7.b(j3.a, 0, j3.c, i5);
        }
    }

    public boolean v(int i2) {
        if (!(i2 == 1 || i2 == 2)) {
            if (i2 == 4) {
                return false;
            }
            if (!(i2 == 8 || i2 == 128)) {
                return true;
            }
        }
        return !s(i2, false).equals(wh7.e);
    }

    public void x(wh7 wh7) {
        this.g = wh7;
    }
}
