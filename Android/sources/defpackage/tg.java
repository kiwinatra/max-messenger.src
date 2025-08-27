package defpackage;

import android.view.animation.Animation;

/* renamed from: tg  reason: default package */
public final class tg extends bh {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ tg(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void onAnimationEnd(Animation animation) {
        switch (this.a) {
            case 0:
                ((fqc) this.b).D();
                return;
            default:
                ((ok8) this.b).J0.post(new y86(23, (Object) this));
                return;
        }
    }

    public void onAnimationStart(Animation animation) {
        switch (this.a) {
            case 0:
                ((fqc) this.b).E();
                return;
            default:
                return;
        }
    }
}
