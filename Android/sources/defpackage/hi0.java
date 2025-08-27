package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager2.widget.ViewPager2;
import java.util.List;

/* renamed from: hi0  reason: default package */
public final class hi0 extends kbe {
    public final fi0 D0 = ((fi0) yh0.a.getAccessor().g(fi0.class));
    public final c73 E0;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public hi0(android.content.Context r4, defpackage.ys3 r5) {
        /*
            r3 = this;
            yh0 r0 = defpackage.yh0.a
            q4 r0 = r0.getAccessor()
            java.lang.Class<fi0> r1 = defpackage.fi0.class
            java.lang.Object r0 = r0.g(r1)
            fi0 r0 = (defpackage.fi0) r0
            androidx.viewpager2.widget.ViewPager2 r1 = new androidx.viewpager2.widget.ViewPager2
            r1.<init>(r4)
            defpackage.hsg.m(r1)
            r3.<init>(r1)
            r3.D0 = r0
            c73 r4 = new c73
            r4.<init>(r5)
            r3.E0 = r4
            int r5 = defpackage.qoa.a
            r1.setId(r5)
            android.view.ViewGroup$LayoutParams r5 = new android.view.ViewGroup$LayoutParams
            r0 = -1
            r2 = -2
            r5.<init>(r0, r2)
            r1.setLayoutParams(r5)
            r1.setAdapter(r4)
            r4 = 0
            r1.setOrientation(r4)
            r5 = 2
            r1.setOffscreenPageLimit(r5)
            r1.setClipToPadding(r4)
            r1.setClipChildren(r4)
            ba r4 = new ba
            r4.<init>(r5, r1, r3)
            r1.setPageTransformer(r4)
            gi0 r4 = new gi0
            r5 = 0
            r4.<init>(r5, r3)
            r1.b(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hi0.<init>(android.content.Context, ys3):void");
    }

    /* renamed from: P */
    public final void M(xh0 xh0) {
        List list = xh0.b;
        this.E0.H(list, new b(14, (Object) this));
        View view = this.a;
        ((ViewPager2) view).setUserInputEnabled(list.size() > 1);
        if (list.size() == 1 && ((zs3) list.get(0)).a == xs3.a) {
            ((ViewPager2) view).setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        } else {
            ((ViewPager2) view).setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        }
    }
}
