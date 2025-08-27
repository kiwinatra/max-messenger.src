package defpackage;

import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;

/* renamed from: xe  reason: default package */
public final class xe extends Animatable2.AnimationCallback {
    public final /* synthetic */ ye a;

    public xe(ye yeVar) {
        this.a = yeVar;
    }

    public final void onAnimationEnd(Drawable drawable) {
        this.a.a(drawable);
    }

    public final void onAnimationStart(Drawable drawable) {
        this.a.b(drawable);
    }
}
