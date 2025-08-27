package defpackage;

import androidx.viewpager2.widget.ViewPager2;

/* renamed from: av6  reason: default package */
public final class av6 {
    public final ViewPager2 a;
    public final fv6 b;
    public boolean c;
    public tyc d;
    public zu6 e;
    public t45 f;

    public av6(ViewPager2 viewPager2, fv6 fv6) {
        this.a = viewPager2;
        this.b = fv6;
    }

    public final void a() {
        tyc tyc = this.d;
        if (tyc != null) {
            try {
                int j = tyc.j();
                this.b.b(j, j == 0 ? 0 : Math.min(this.a.getCurrentItem(), j - 1));
            } catch (IllegalArgumentException e2) {
                String name = av6.class.getName();
                String message = e2.getMessage();
                z68.o(name, "updatePagesNumber error: " + message, e2);
            }
        }
    }
}
