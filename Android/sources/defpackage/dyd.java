package defpackage;

import android.graphics.Rect;
import android.util.Size;

/* renamed from: dyd  reason: default package */
public final class dyd extends sb6 {
    public final Object o = new Object();
    public final l97 v;
    public final int w;
    public final int x;

    public dyd(ha7 ha7, Size size, l97 l97) {
        super(ha7);
        if (size == null) {
            this.w = this.b.getWidth();
            this.x = this.b.getHeight();
        } else {
            this.w = size.getWidth();
            this.x = size.getHeight();
        }
        this.v = l97;
    }

    public final void b(Rect rect) {
        if (rect != null) {
            Rect rect2 = new Rect(rect);
            if (!rect2.intersect(0, 0, this.w, this.x)) {
                rect2.setEmpty();
            }
        }
        synchronized (this.o) {
        }
    }

    public final int getHeight() {
        return this.x;
    }

    public final l97 getImageInfo() {
        return this.v;
    }

    public final int getWidth() {
        return this.w;
    }
}
