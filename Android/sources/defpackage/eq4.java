package defpackage;

import android.graphics.Rect;
import android.view.View;

/* renamed from: eq4  reason: default package */
public final class eq4 implements wcg {
    public final /* synthetic */ Rect a;
    public final /* synthetic */ View b;
    public final /* synthetic */ View c;
    public final /* synthetic */ Rect d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;

    public eq4(Rect rect, View view, View view2, Rect rect2, int i, int i2) {
        this.a = rect;
        this.b = view;
        this.c = view2;
        this.d = rect2;
        this.e = i;
        this.f = i2;
    }

    public final void a() {
    }

    public final void c(Rect rect, View view) {
        View view2 = this.b;
        int width = view2.getWidth();
        int height = view2.getHeight();
        Rect rect2 = this.a;
        rect2.set(0, 0, width, height);
        View view3 = this.c;
        Rect rect3 = this.d;
        rcg.d(rect3, view3);
        int i = this.e;
        rect3.inset(i, i);
        boolean z = (rect3.centerX() < rect.centerX() ? true : true) | (rect3.centerY() < rect.centerY() ? true : true);
        if (z & true) {
            rect2.offsetTo(rect.right - rect2.width(), rect2.top);
        } else if (z & true) {
            rect2.offsetTo(rect.left, rect2.top);
        }
        boolean z2 = z & true;
        int i2 = this.f;
        if (z2) {
            rect2.offsetTo(rect2.left, (rect.top - rect2.height()) - i2);
        } else if (z & true) {
            rect2.offsetTo(rect2.left, rect.bottom + i2);
        }
        if (!rect3.contains(rect2)) {
            int i3 = rect2.left;
            int i4 = rect3.left;
            if (i3 < i4) {
                rect2.offsetTo(i4, rect2.top);
            }
            int i5 = rect2.top;
            int i6 = rect3.top;
            if (i5 < i6) {
                rect2.offsetTo(rect2.left, i6);
            }
            int i7 = rect2.bottom;
            int i8 = rect3.bottom;
            if (i7 > i8) {
                rect2.offsetTo(rect2.left, i8 - rect2.height());
            }
            int i9 = rect2.right;
            int i10 = rect3.right;
            if (i9 > i10) {
                rect2.offsetTo(i10 - rect2.width(), rect2.top);
            }
        }
        view2.setX((float) rect2.left);
        view2.setY((float) rect2.top);
    }
}
