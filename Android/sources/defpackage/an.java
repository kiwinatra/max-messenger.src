package defpackage;

import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import com.google.android.material.appbar.AppBarLayout;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: an  reason: default package */
public final /* synthetic */ class an implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ AppBarLayout a;
    public final /* synthetic */ ColorStateList b;
    public final /* synthetic */ ColorStateList c;
    public final /* synthetic */ bh8 o;
    public final /* synthetic */ Integer v;

    public /* synthetic */ an(AppBarLayout appBarLayout, ColorStateList colorStateList, ColorStateList colorStateList2, bh8 bh8, Integer num) {
        this.a = appBarLayout;
        this.b = colorStateList;
        this.c = colorStateList2;
        this.o = bh8;
        this.v = num;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Integer num;
        int i = AppBarLayout.L0;
        AppBarLayout appBarLayout = this.a;
        appBarLayout.getClass();
        int K = ld9.K(this.b.getDefaultColor(), ((Float) valueAnimator.getAnimatedValue()).floatValue(), this.c.getDefaultColor());
        ColorStateList valueOf = ColorStateList.valueOf(K);
        bh8 bh8 = this.o;
        bh8.l(valueOf);
        if (!(appBarLayout.H0 == null || (num = appBarLayout.I0) == null || !num.equals(this.v))) {
            ru4.g(appBarLayout.H0, K);
        }
        ArrayList arrayList = appBarLayout.D0;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                rae.w(it.next());
                if (bh8.a.c != null) {
                    throw null;
                }
            }
        }
    }
}
