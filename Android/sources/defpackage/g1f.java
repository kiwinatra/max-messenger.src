package defpackage;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import ru.ok.messages.suggests.SuggestsFragment;
import ru.ok.messages.suggests.SuggestsView;
import ru.ok.messages.suggests.SuggestsViewModel;

/* renamed from: g1f  reason: default package */
public final class g1f implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ SuggestsFragment b;

    public /* synthetic */ g1f(SuggestsFragment suggestsFragment, int i) {
        this.a = i;
        this.b = suggestsFragment;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        switch (this.a) {
            case 0:
                view.removeOnLayoutChangeListener(this);
                SuggestsViewModel V2 = this.b.V2();
                view.getHeight();
                V2.getClass();
                return;
            default:
                view.removeOnLayoutChangeListener(this);
                SuggestsFragment suggestsFragment = this.b;
                SuggestsView f = suggestsFragment.l1.f();
                f1f f1f = suggestsFragment.l1;
                Animator animator = f1f.w;
                if (animator != null) {
                    animator.removeAllListeners();
                    animator.cancel();
                }
                ch d = ((qra) ryg.x(suggestsFragment)).d();
                if (f.isAttachedToWindow() && d.q()) {
                    float height = (float) f.getHeight();
                    f.setTranslationY(height);
                    ObjectAnimator d2 = f1f.d(height, c44.DEFAULT_ASPECT_RATIO);
                    d2.setInterpolator(d.a.d());
                    d2.start();
                }
                SuggestsViewModel V22 = suggestsFragment.V2();
                Boolean bool = Boolean.TRUE;
                xme xme = V22.n;
                xme.getClass();
                xme.m((Object) null, bool);
                return;
        }
    }
}
