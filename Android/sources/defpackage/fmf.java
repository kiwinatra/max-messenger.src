package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;

/* renamed from: fmf  reason: default package */
public final class fmf implements i79 {
    public m69 a;
    public u69 b;
    public final /* synthetic */ Toolbar c;

    public fmf(Toolbar toolbar) {
        this.c = toolbar;
    }

    public final boolean c(lye lye) {
        return false;
    }

    public final boolean d() {
        return false;
    }

    public final boolean e(u69 u69) {
        Toolbar toolbar = this.c;
        View view = toolbar.z;
        if (view instanceof c53) {
            ((c53) view).onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.z);
        toolbar.removeView(toolbar.y);
        toolbar.z = null;
        ArrayList arrayList = toolbar.Q0;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.b = null;
        toolbar.requestLayout();
        u69.L0 = false;
        u69.w0.p(false);
        toolbar.x();
        return true;
    }

    public final boolean g(u69 u69) {
        Toolbar toolbar = this.c;
        toolbar.c();
        ViewParent parent = toolbar.y.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.y);
            }
            toolbar.addView(toolbar.y);
        }
        View actionView = u69.getActionView();
        toolbar.z = actionView;
        this.b = u69;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.z);
            }
            gmf h = Toolbar.h();
            h.a = (toolbar.z0 & 112) | 8388611;
            h.b = 2;
            toolbar.z.setLayoutParams(h);
            toolbar.addView(toolbar.z);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (!(((gmf) childAt.getLayoutParams()).b == 2 || childAt == toolbar.a)) {
                toolbar.removeViewAt(childCount);
                toolbar.Q0.add(childAt);
            }
        }
        toolbar.requestLayout();
        u69.L0 = true;
        u69.w0.p(false);
        View view = toolbar.z;
        if (view instanceof c53) {
            ((c53) view).onActionViewExpanded();
        }
        toolbar.x();
        return true;
    }

    public final void h() {
        if (this.b != null) {
            m69 m69 = this.a;
            if (m69 != null) {
                int size = m69.w.size();
                int i = 0;
                while (i < size) {
                    if (this.a.getItem(i) != this.b) {
                        i++;
                    } else {
                        return;
                    }
                }
            }
            e(this.b);
        }
    }

    public final void j(Context context, m69 m69) {
        u69 u69;
        m69 m692 = this.a;
        if (!(m692 == null || (u69 = this.b) == null)) {
            m692.d(u69);
        }
        this.a = m69;
    }

    public final void m(m69 m69, boolean z) {
    }
}
