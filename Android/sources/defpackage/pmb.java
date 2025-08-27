package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.RectF;
import android.view.View;
import kotlin.jvm.functions.Function0;

/* renamed from: pmb  reason: default package */
public final class pmb extends AnimatorListenerAdapter {
    public final /* synthetic */ qmb a;
    public final /* synthetic */ View b;
    public final /* synthetic */ View c;
    public final /* synthetic */ RectF o;
    public final /* synthetic */ Function0 v;

    public pmb(qmb qmb, View view, rf1 rf1, RectF rectF, sz0 sz0) {
        this.a = qmb;
        this.b = view;
        this.c = rf1;
        this.o = rectF;
        this.v = sz0;
    }

    public final void onAnimationCancel(Animator animator) {
        qmb qmb = this.a;
        qmb.getClass();
        qmb.a(qmb, this.b, (rf1) this.c, this.o);
        this.v.invoke();
    }

    public final void onAnimationEnd(Animator animator) {
        qmb qmb = this.a;
        qmb.getClass();
        qmb.a(qmb, this.b, (rf1) this.c, this.o);
        this.v.invoke();
    }
}
