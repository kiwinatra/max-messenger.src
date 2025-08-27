package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import ru.ok.messages.media.attaches.ActAttachesView;

/* renamed from: f5  reason: default package */
public final class f5 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ActAttachesView b;

    public /* synthetic */ f5(ActAttachesView actAttachesView, int i) {
        this.a = i;
        this.b = actAttachesView;
    }

    public void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 1:
                this.b.S0.setVisibility(4);
                return;
            default:
                super.onAnimationEnd(animator);
                return;
        }
    }

    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.S0.setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
