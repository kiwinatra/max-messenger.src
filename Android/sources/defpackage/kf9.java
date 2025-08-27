package defpackage;

import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;

/* renamed from: kf9  reason: default package */
public final /* synthetic */ class kf9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Drawable b;

    public /* synthetic */ kf9(Drawable drawable, int i) {
        this.a = i;
        this.b = drawable;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                lf9.setStartDrawable$lambda$5(this.b);
                return;
            default:
                ((AnimationDrawable) this.b).start();
                return;
        }
    }
}
