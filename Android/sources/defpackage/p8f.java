package defpackage;

import com.google.android.material.tabs.TabLayout;
import java.lang.ref.WeakReference;

/* renamed from: p8f  reason: default package */
public final class p8f implements rbg {
    public final WeakReference a;
    public int b;
    public int c;

    public p8f(TabLayout tabLayout) {
        this.a = new WeakReference(tabLayout);
    }

    public final void f(float f, int i) {
        TabLayout tabLayout = (TabLayout) this.a.get();
        if (tabLayout != null) {
            int i2 = this.c;
            tabLayout.o(i, f, i2 != 2 || this.b == 1, (i2 == 2 && this.b == 0) ? false : true, false);
        }
    }

    public final void l(int i) {
        this.b = this.c;
        this.c = i;
        TabLayout tabLayout = (TabLayout) this.a.get();
        if (tabLayout != null) {
            tabLayout.g1 = this.c;
        }
    }

    public final void m(int i) {
        TabLayout tabLayout = (TabLayout) this.a.get();
        if (tabLayout != null && tabLayout.getSelectedTabPosition() != i && i < tabLayout.getTabCount()) {
            int i2 = this.c;
            tabLayout.m(tabLayout.h(i), i2 == 0 || (i2 == 2 && this.b == 0));
        }
    }
}
