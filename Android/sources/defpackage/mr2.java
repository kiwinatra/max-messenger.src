package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import ru.ok.messages.views.widgets.SlideOutLayout;

/* renamed from: mr2  reason: default package */
public final class mr2 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ mr2(Object obj, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
    }

    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                iq.O((View) ((mqf) this.c).v, this.b);
                return;
            default:
                vde vde = ((SlideOutLayout) this.c).w0;
                if (vde != null) {
                    vde.A1(this.b);
                    return;
                }
                return;
        }
    }
}
