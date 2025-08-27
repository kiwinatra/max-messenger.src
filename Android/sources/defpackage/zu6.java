package defpackage;

import com.google.android.material.tabs.TabLayout;
import java.lang.ref.WeakReference;

/* renamed from: zu6  reason: default package */
public final class zu6 extends xbg {
    public final /* synthetic */ int a = 1;
    public final WeakReference b;
    public int c;
    public int d;

    public zu6(fv6 fv6) {
        this.b = new WeakReference(fv6);
        this.c = 0;
        this.d = 0;
    }

    public final void a(int i) {
        switch (this.a) {
            case 0:
                this.c = this.d;
                this.d = i;
                return;
            default:
                this.c = this.d;
                this.d = i;
                TabLayout tabLayout = (TabLayout) this.b.get();
                if (tabLayout != null) {
                    tabLayout.g1 = this.d;
                    return;
                }
                return;
        }
    }

    public final void b(int i, float f, int i2) {
        switch (this.a) {
            case 0:
                fv6 fv6 = (fv6) this.b.get();
                if (fv6 != null) {
                    try {
                        fv6.a(fv6.c.a, i);
                        fv6.c(f, i);
                        return;
                    } catch (IllegalArgumentException e) {
                        String name = zu6.class.getName();
                        String message = e.getMessage();
                        z68.o(name, "updatePagesNumber error: " + message, e);
                        return;
                    }
                } else {
                    return;
                }
            default:
                TabLayout tabLayout = (TabLayout) this.b.get();
                if (tabLayout != null) {
                    int i3 = this.d;
                    tabLayout.o(i, f, i3 != 2 || this.c == 1, (i3 == 2 && this.c == 0) ? false : true, false);
                    return;
                }
                return;
        }
    }

    public final void c(int i) {
        switch (this.a) {
            case 0:
                fv6 fv6 = (fv6) this.b.get();
                try {
                    int i2 = this.d;
                    if (i2 != 0) {
                        if (i2 != 2 || this.c != 0) {
                            return;
                        }
                    }
                    if (fv6 != null) {
                        fv6.setSelectedPageIndex(i);
                        return;
                    }
                    return;
                } catch (IllegalArgumentException e) {
                    String name = zu6.class.getName();
                    String message = e.getMessage();
                    z68.o(name, "updatePagesNumber error: " + message, e);
                    return;
                }
            default:
                TabLayout tabLayout = (TabLayout) this.b.get();
                if (tabLayout != null && tabLayout.getSelectedTabPosition() != i && i < tabLayout.getTabCount()) {
                    int i3 = this.d;
                    tabLayout.m(tabLayout.h(i), i3 == 0 || (i3 == 2 && this.c == 0));
                    return;
                }
                return;
        }
    }

    public zu6(TabLayout tabLayout) {
        this.b = new WeakReference(tabLayout);
        this.d = 0;
        this.c = 0;
    }
}
