package defpackage;

import android.graphics.RectF;
import android.view.View;

/* renamed from: qmb  reason: default package */
public final class qmb {
    public static final void a(qmb qmb, View view, rf1 rf1, RectF rectF) {
        view.setPivotX(rectF.top);
        view.setPivotY(rectF.left);
        view.setX(rectF.top);
        view.setY(rectF.left);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        kne.L(view, c44.DEFAULT_ASPECT_RATIO);
        rf1.setAlpha(1.0f);
    }
}
