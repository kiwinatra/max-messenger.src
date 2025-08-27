package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: mrc  reason: default package */
public final class mrc extends AnimatorListenerAdapter {
    public final /* synthetic */ orc a;
    public final /* synthetic */ pzc b;
    public final /* synthetic */ float c;
    public final /* synthetic */ src o;

    public mrc(src src, orc orc, pzc pzc, float f) {
        this.o = src;
        this.a = orc;
        this.b = pzc;
        this.c = f;
    }

    public final void onAnimationCancel(Animator animator) {
        this.a.a();
        this.b.a.setTranslationZ(this.c);
    }

    public final void onAnimationEnd(Animator animator) {
        pzc pzc = this.b;
        pzc.a.setTranslationZ(this.c);
        src src = this.o;
        src.g(pzc);
        src.o.remove(pzc);
        src.x();
    }

    public final void onAnimationStart(Animator animator) {
        this.o.getClass();
    }
}
