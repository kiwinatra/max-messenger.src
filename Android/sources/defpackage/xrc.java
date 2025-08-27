package defpackage;

import android.graphics.Rect;
import android.view.View;

/* renamed from: xrc  reason: default package */
public final class xrc implements View.OnLayoutChangeListener {
    public final /* synthetic */ yrc a;
    public final /* synthetic */ View b;
    public final /* synthetic */ long c;

    public xrc(yrc yrc, View view, long j) {
        this.a = yrc;
        this.b = view;
        this.c = j;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(this);
        View view2 = this.b;
        yrc yrc = this.a;
        Rect c2 = yrc.c(yrc, view2);
        if (c2 != null) {
            yrc.b.d(this.c, c2);
        }
    }
}
