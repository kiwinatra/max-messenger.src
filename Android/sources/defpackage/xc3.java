package defpackage;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;

/* renamed from: xc3  reason: default package */
public final /* synthetic */ class xc3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int o;
    public final /* synthetic */ int v;
    public final /* synthetic */ int w;
    public final /* synthetic */ View x;

    public /* synthetic */ xc3(View view, int i, int i2, int i3, int i4, View view2, int i5) {
        this.a = i5;
        this.b = view;
        this.c = i;
        this.o = i2;
        this.v = i3;
        this.w = i4;
        this.x = view2;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                Rect rect = new Rect();
                View view = this.b;
                view.getHitRect(rect);
                rect.left -= this.c;
                rect.top -= this.o;
                rect.right += this.v;
                rect.bottom += this.w;
                View view2 = this.x;
                if (!(view2.getTouchDelegate() instanceof wc3)) {
                    view2.setTouchDelegate(new wc3(view2));
                }
                ((wc3) view2.getTouchDelegate()).a.add(new TouchDelegate(rect, view));
                return;
            default:
                Rect rect2 = new Rect();
                View view3 = this.b;
                view3.getHitRect(rect2);
                rect2.left -= this.c;
                rect2.top -= this.o;
                rect2.right += this.v;
                rect2.bottom += this.w;
                this.x.setTouchDelegate(new TouchDelegate(rect2, view3));
                return;
        }
    }
}
