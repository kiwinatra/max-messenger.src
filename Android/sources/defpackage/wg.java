package defpackage;

import android.view.View;
import android.view.animation.Animation;

/* renamed from: wg  reason: default package */
public final class wg extends bh {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ wg(View view, int i) {
        this.a = i;
        this.b = view;
    }

    public final void onAnimationEnd(Animation animation) {
        switch (this.a) {
            case 0:
                this.b.setAnimation((Animation) null);
                return;
            case 1:
                View view = this.b;
                view.setAnimation((Animation) null);
                view.setVisibility(8);
                return;
            case 2:
                this.b.setAnimation((Animation) null);
                return;
            case 3:
                View view2 = this.b;
                view2.setAnimation((Animation) null);
                view2.setVisibility(8);
                return;
            case 4:
                this.b.setAnimation((Animation) null);
                return;
            default:
                this.b.setAnimation((Animation) null);
                return;
        }
    }

    public void onAnimationStart(Animation animation) {
        switch (this.a) {
            case 0:
                this.b.setVisibility(0);
                return;
            case 2:
                this.b.setVisibility(0);
                return;
            default:
                return;
        }
    }
}
