package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import java.util.ArrayList;

/* renamed from: w7  reason: default package */
public final class w7 implements i79 {
    public final SparseBooleanArray A0 = new SparseBooleanArray();
    public t7 B0;
    public t7 C0;
    public vj6 D0;
    public u7 E0;
    public final u6h F0 = new u6h(1, this);
    public Drawable X;
    public boolean Y;
    public boolean Z;
    public final Context a;
    public Context b;
    public m69 c;
    public final LayoutInflater o;
    public h79 v;
    public boolean v0;
    public final int w;
    public int w0;
    public final int x;
    public int x0;
    public l79 y;
    public int y0;
    public v7 z;
    public boolean z0;

    public w7(Context context) {
        int i = vjc.abc_action_menu_layout;
        int i2 = vjc.abc_action_menu_item_layout;
        this.a = context;
        this.o = LayoutInflater.from(context);
        this.w = i;
        this.x = i2;
    }

    public final View a(u69 u69, View view, ViewGroup viewGroup) {
        k79 k79;
        View actionView = u69.getActionView();
        int i = 0;
        if (actionView == null || u69.e()) {
            if (view instanceof k79) {
                k79 = (k79) view;
            } else {
                k79 = (k79) this.o.inflate(this.x, viewGroup, false);
            }
            k79.d(u69);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) k79;
            actionMenuItemView.setItemInvoker((ActionMenuView) this.y);
            if (this.E0 == null) {
                this.E0 = new u7(this);
            }
            actionMenuItemView.setPopupCallback(this.E0);
            actionView = (View) k79;
        }
        if (u69.L0) {
            i = 8;
        }
        actionView.setVisibility(i);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof y7)) {
            actionView.setLayoutParams(ActionMenuView.e(layoutParams));
        }
        return actionView;
    }

    public final boolean b() {
        l79 l79;
        vj6 vj6 = this.D0;
        if (vj6 == null || (l79 = this.y) == null) {
            t7 t7Var = this.B0;
            if (t7Var == null) {
                return false;
            }
            if (t7Var.b()) {
                t7Var.j.dismiss();
            }
            return true;
        }
        ((View) l79).removeCallbacks(vj6);
        this.D0 = null;
        return true;
    }

    public final boolean c(lye lye) {
        boolean z2;
        if (!lye.hasVisibleItems()) {
            return false;
        }
        lye lye2 = lye;
        while (true) {
            m69 m69 = lye2.I0;
            if (m69 == this.c) {
                break;
            }
            lye2 = m69;
        }
        ViewGroup viewGroup = (ViewGroup) this.y;
        View view = null;
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    break;
                }
                View childAt = viewGroup.getChildAt(i);
                if ((childAt instanceof k79) && ((k79) childAt).getItemData() == lye2.J0) {
                    view = childAt;
                    break;
                }
                i++;
            }
        }
        if (view == null) {
            return false;
        }
        lye.J0.getClass();
        int size = lye.w.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                z2 = false;
                break;
            }
            MenuItem item = lye.getItem(i2);
            if (item.isVisible() && item.getIcon() != null) {
                z2 = true;
                break;
            }
            i2++;
        }
        t7 t7Var = new t7(this, this.b, lye, view);
        this.C0 = t7Var;
        t7Var.h = z2;
        a79 a79 = t7Var.j;
        if (a79 != null) {
            a79.o(z2);
        }
        t7 t7Var2 = this.C0;
        if (!t7Var2.b()) {
            if (t7Var2.f != null) {
                t7Var2.d(0, 0, false, false);
            } else {
                throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
            }
        }
        h79 h79 = this.v;
        if (h79 != null) {
            h79.a0(lye);
        }
        return true;
    }

    public final boolean d() {
        int i;
        ArrayList arrayList;
        int i2;
        boolean z2;
        m69 m69 = this.c;
        if (m69 != null) {
            arrayList = m69.l();
            i = arrayList.size();
        } else {
            i = 0;
            arrayList = null;
        }
        int i3 = this.y0;
        int i4 = this.x0;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) this.y;
        int i5 = 0;
        boolean z3 = false;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            i2 = 2;
            z2 = true;
            if (i5 >= i) {
                break;
            }
            u69 u69 = (u69) arrayList.get(i5);
            int i8 = u69.H0;
            if ((i8 & 2) == 2) {
                i6++;
            } else if ((i8 & 1) == 1) {
                i7++;
            } else {
                z3 = true;
            }
            if (this.z0 && u69.L0) {
                i3 = 0;
            }
            i5++;
        }
        if (this.Z && (z3 || i7 + i6 > i3)) {
            i3--;
        }
        int i9 = i3 - i6;
        SparseBooleanArray sparseBooleanArray = this.A0;
        sparseBooleanArray.clear();
        int i10 = 0;
        int i11 = 0;
        while (i10 < i) {
            u69 u692 = (u69) arrayList.get(i10);
            int i12 = u692.H0;
            boolean z4 = (i12 & 2) == i2 ? z2 : false;
            int i13 = u692.b;
            if (z4) {
                View a2 = a(u692, (View) null, viewGroup);
                a2.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = a2.getMeasuredWidth();
                i4 -= measuredWidth;
                if (i11 == 0) {
                    i11 = measuredWidth;
                }
                if (i13 != 0) {
                    sparseBooleanArray.put(i13, z2);
                }
                u692.g(z2);
            } else if ((i12 & true) == z2) {
                boolean z5 = sparseBooleanArray.get(i13);
                boolean z6 = ((i9 > 0 || z5) && i4 > 0) ? z2 : false;
                if (z6) {
                    View a3 = a(u692, (View) null, viewGroup);
                    a3.measure(makeMeasureSpec, makeMeasureSpec);
                    int measuredWidth2 = a3.getMeasuredWidth();
                    i4 -= measuredWidth2;
                    if (i11 == 0) {
                        i11 = measuredWidth2;
                    }
                    z6 &= i4 + i11 > 0;
                }
                if (z6 && i13 != 0) {
                    sparseBooleanArray.put(i13, true);
                } else if (z5) {
                    sparseBooleanArray.put(i13, false);
                    for (int i14 = 0; i14 < i10; i14++) {
                        u69 u693 = (u69) arrayList.get(i14);
                        if (u693.b == i13) {
                            if (u693.f()) {
                                i9++;
                            }
                            u693.g(false);
                        }
                    }
                }
                if (z6) {
                    i9--;
                }
                u692.g(z6);
            } else {
                u692.g(false);
                i10++;
                i2 = 2;
                z2 = true;
            }
            i10++;
            i2 = 2;
            z2 = true;
        }
        return z2;
    }

    public final boolean e(u69 u69) {
        return false;
    }

    public final void f(h79 h79) {
        this.v = h79;
    }

    public final boolean g(u69 u69) {
        return false;
    }

    public final void h() {
        l79 l79;
        int i;
        ViewGroup viewGroup = (ViewGroup) this.y;
        ArrayList arrayList = null;
        boolean z2 = false;
        if (viewGroup != null) {
            m69 m69 = this.c;
            if (m69 != null) {
                m69.i();
                ArrayList l = this.c.l();
                int size = l.size();
                i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    u69 u69 = (u69) l.get(i2);
                    if (u69.f()) {
                        View childAt = viewGroup.getChildAt(i);
                        u69 itemData = childAt instanceof k79 ? ((k79) childAt).getItemData() : null;
                        View a2 = a(u69, childAt, viewGroup);
                        if (u69 != itemData) {
                            a2.setPressed(false);
                            a2.jumpDrawablesToCurrentState();
                        }
                        if (a2 != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) a2.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(a2);
                            }
                            ((ViewGroup) this.y).addView(a2, i);
                        }
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i) == this.z) {
                    i++;
                } else {
                    viewGroup.removeViewAt(i);
                }
            }
        }
        ((View) this.y).requestLayout();
        m69 m692 = this.c;
        if (m692 != null) {
            m692.i();
            ArrayList arrayList2 = m692.z;
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                c8 c8Var = ((u69) arrayList2.get(i3)).J0;
            }
        }
        m69 m693 = this.c;
        if (m693 != null) {
            m693.i();
            arrayList = m693.X;
        }
        if (this.Z && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z2 = !((u69) arrayList.get(0)).L0;
            } else if (size3 > 0) {
                z2 = true;
            }
        }
        if (z2) {
            if (this.z == null) {
                this.z = new v7(this, this.a);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.z.getParent();
            if (viewGroup3 != this.y) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.z);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.y;
                v7 v7Var = this.z;
                actionMenuView.getClass();
                y7 c2 = ActionMenuView.c();
                c2.a = true;
                actionMenuView.addView(v7Var, c2);
            }
        } else {
            v7 v7Var2 = this.z;
            if (v7Var2 != null && v7Var2.getParent() == (l79 = this.y)) {
                ((ViewGroup) l79).removeView(this.z);
            }
        }
        ((ActionMenuView) this.y).setOverflowReserved(this.Z);
    }

    public final boolean i() {
        t7 t7Var = this.B0;
        return t7Var != null && t7Var.b();
    }

    public final void j(Context context, m69 m69) {
        this.b = context;
        LayoutInflater.from(context);
        this.c = m69;
        Resources resources = context.getResources();
        if (!this.v0) {
            this.Z = true;
        }
        int i = 2;
        this.w0 = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        int i3 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i2 > 600 || ((i2 > 960 && i3 > 720) || (i2 > 720 && i3 > 960))) {
            i = 5;
        } else if (i2 >= 500 || ((i2 > 640 && i3 > 480) || (i2 > 480 && i3 > 640))) {
            i = 4;
        } else if (i2 >= 360) {
            i = 3;
        }
        this.y0 = i;
        int i4 = this.w0;
        if (this.Z) {
            if (this.z == null) {
                v7 v7Var = new v7(this, this.a);
                this.z = v7Var;
                if (this.Y) {
                    v7Var.setImageDrawable(this.X);
                    this.X = null;
                    this.Y = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.z.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i4 -= this.z.getMeasuredWidth();
        } else {
            this.z = null;
        }
        this.x0 = i4;
        float f = resources.getDisplayMetrics().density;
    }

    public final boolean k() {
        m69 m69;
        if (!this.Z || i() || (m69 = this.c) == null || this.y == null || this.D0 != null) {
            return false;
        }
        m69.i();
        if (m69.X.isEmpty()) {
            return false;
        }
        vj6 vj6 = new vj6((Object) this, (Object) new t7(this, this.b, this.c, (View) this.z), false, 1);
        this.D0 = vj6;
        ((View) this.y).post(vj6);
        return true;
    }

    public final void m(m69 m69, boolean z2) {
        b();
        t7 t7Var = this.C0;
        if (t7Var != null && t7Var.b()) {
            t7Var.j.dismiss();
        }
        h79 h79 = this.v;
        if (h79 != null) {
            h79.m(m69, z2);
        }
    }
}
