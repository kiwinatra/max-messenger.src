package defpackage;

import android.widget.ImageView;
import one.me.rlottie.ImageReceiver;

/* renamed from: bj  reason: default package */
public final class bj implements ImageReceiver {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ bj(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void invalidate() {
        switch (this.a) {
            case 0:
                ((cj) this.b).invalidate();
                return;
            case 1:
                ((ImageView) ((g15) this.b).a).invalidate();
                return;
            case 2:
                ((sc9) this.b).invalidate();
                return;
            default:
                ((lf9) this.b).invalidate();
                return;
        }
    }
}
