package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* renamed from: b3f  reason: default package */
public final class b3f {
    public CharSequence A;
    public CharSequence B;
    public ColorStateList C = null;
    public PorterDuff.Mode D = null;
    public final /* synthetic */ c3f E;
    public final Menu a;
    public int b;
    public int c;
    public int d;
    public int e;
    public boolean f;
    public boolean g;
    public boolean h;
    public int i;
    public int j;
    public CharSequence k;
    public CharSequence l;
    public int m;
    public char n;
    public int o;
    public char p;
    public int q;
    public int r;
    public boolean s;
    public boolean t;
    public boolean u;
    public int v;
    public int w;
    public String x;
    public String y;
    public c8 z;

    public b3f(c3f c3f, Menu menu) {
        this.E = c3f;
        this.a = menu;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = true;
        this.g = true;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.E.c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception unused) {
            return null;
        }
    }

    public final void b(MenuItem menuItem) {
        boolean z2 = false;
        menuItem.setChecked(this.s).setVisible(this.t).setEnabled(this.u).setCheckable(this.r >= 1).setTitleCondensed(this.l).setIcon(this.m);
        int i2 = this.v;
        if (i2 >= 0) {
            menuItem.setShowAsAction(i2);
        }
        String str = this.y;
        c3f c3f = this.E;
        if (str != null) {
            if (!c3f.c.isRestricted()) {
                if (c3f.d == null) {
                    c3f.d = c3f.a(c3f.c);
                }
                Object obj = c3f.d;
                String str2 = this.y;
                a3f a3f = new a3f();
                a3f.b = obj;
                Class<?> cls = obj.getClass();
                try {
                    a3f.c = cls.getMethod(str2, a3f.o);
                    menuItem.setOnMenuItemClickListener(a3f);
                } catch (Exception e2) {
                    StringBuilder p2 = tr1.p("Couldn't resolve menu item onClick handler ", str2, " in class ");
                    p2.append(cls.getName());
                    InflateException inflateException = new InflateException(p2.toString());
                    inflateException.initCause(e2);
                    throw inflateException;
                }
            } else {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
        }
        if (this.r >= 2) {
            if (menuItem instanceof u69) {
                u69 u69 = (u69) menuItem;
                u69.G0 = (u69.G0 & -5) | 4;
            } else if (menuItem instanceof y69) {
                y69 y69 = (y69) menuItem;
                try {
                    Method method = y69.w;
                    d3f d3f = y69.v;
                    if (method == null) {
                        y69.w = d3f.getClass().getDeclaredMethod("setExclusiveCheckable", new Class[]{Boolean.TYPE});
                    }
                    y69.w.invoke(d3f, new Object[]{Boolean.TRUE});
                } catch (Exception unused) {
                }
            }
        }
        String str3 = this.x;
        if (str3 != null) {
            menuItem.setActionView((View) a(str3, c3f.e, c3f.a));
            z2 = true;
        }
        int i3 = this.w;
        if (i3 > 0 && !z2) {
            menuItem.setActionView(i3);
        }
        c8 c8Var = this.z;
        if (c8Var != null && (menuItem instanceof d3f)) {
            ((d3f) menuItem).b(c8Var);
        }
        CharSequence charSequence = this.A;
        boolean z3 = menuItem instanceof d3f;
        if (z3) {
            ((d3f) menuItem).setContentDescription(charSequence);
        } else {
            s69.h(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.B;
        if (z3) {
            ((d3f) menuItem).setTooltipText(charSequence2);
        } else {
            s69.m(menuItem, charSequence2);
        }
        char c2 = this.n;
        int i4 = this.o;
        if (z3) {
            ((d3f) menuItem).setAlphabeticShortcut(c2, i4);
        } else {
            s69.g(menuItem, c2, i4);
        }
        char c3 = this.p;
        int i5 = this.q;
        if (z3) {
            ((d3f) menuItem).setNumericShortcut(c3, i5);
        } else {
            s69.k(menuItem, c3, i5);
        }
        PorterDuff.Mode mode = this.D;
        if (mode != null) {
            if (z3) {
                ((d3f) menuItem).setIconTintMode(mode);
            } else {
                s69.j(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.C;
        if (colorStateList == null) {
            return;
        }
        if (z3) {
            ((d3f) menuItem).setIconTintList(colorStateList);
        } else {
            s69.i(menuItem, colorStateList);
        }
    }
}
