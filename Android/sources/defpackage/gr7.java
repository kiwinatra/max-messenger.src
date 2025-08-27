package defpackage;

import android.graphics.Rect;
import android.view.ViewTreeObserver;

/* renamed from: gr7  reason: default package */
public final class gr7 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int a;
    public final Rect b = new Rect();
    public final fr7 c;
    public final sk3 o;
    public int v;
    public boolean w;

    public gr7(int i, fr7 fr7, h6 h6Var) {
        this.a = i;
        this.c = fr7;
        this.o = h6Var;
    }

    public final void onGlobalLayout() {
        sk3 sk3 = this.o;
        Rect rect = this.b;
        sk3.accept(rect);
        int height = rect.height();
        int i = this.v;
        if (i != 0) {
            int i2 = this.a;
            int i3 = height + i2;
            fr7 fr7 = this.c;
            if (i > i3) {
                this.w = true;
                if (fr7 != null) {
                    fr7.P();
                }
            } else if (i + i2 < height) {
                this.w = false;
                if (fr7 != null) {
                    fr7.g1();
                }
            }
        }
        this.v = height;
    }
}
