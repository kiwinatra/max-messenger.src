package defpackage;

import android.graphics.Rect;
import android.view.View;

/* renamed from: cof  reason: default package */
public final class cof implements View.OnLayoutChangeListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ Rect b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    public cof(View view, Rect rect, int i, int i2) {
        this.a = view;
        this.b = rect;
        this.c = i;
        this.d = i2;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(this);
        View view2 = this.a;
        Rect rect = this.b;
        view2.getHitRect(rect);
        int width = rect.width();
        int i9 = this.c;
        if (width < i9) {
            int width2 = (i9 - rect.width()) / 2;
            rect.left -= width2;
            rect.right += width2;
        }
        int height = rect.height();
        int i10 = this.d;
        if (height < i10) {
            int height2 = (i10 - rect.height()) / 2;
            rect.top -= height2;
            rect.bottom += height2;
        }
        view2.setTouchDelegate(new od5(rect, view2));
    }
}
