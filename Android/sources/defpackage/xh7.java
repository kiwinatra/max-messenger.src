package defpackage;

import android.view.View;
import java.util.Iterator;
import java.util.List;

/* renamed from: xh7  reason: default package */
public final class xh7 extends n22 {
    public final View c;
    public int d;
    public int e;
    public final int[] f = new int[2];

    public xh7(View view) {
        super(0);
        this.c = view;
    }

    public final void b(vng vng) {
        this.c.setTranslationY(c44.DEFAULT_ASPECT_RATIO);
    }

    public final void c(vng vng) {
        View view = this.c;
        int[] iArr = this.f;
        view.getLocationOnScreen(iArr);
        this.d = iArr[1];
    }

    public final iog d(iog iog, List list) {
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            vng vng = (vng) it.next();
            if ((vng.a.c() & 8) != 0) {
                this.c.setTranslationY((float) xg.c(this.e, vng.a.b(), 0));
                break;
            }
        }
        return iog;
    }

    public final h0h e(vng vng, h0h h0h) {
        View view = this.c;
        int[] iArr = this.f;
        view.getLocationOnScreen(iArr);
        int i = this.d - iArr[1];
        this.e = i;
        view.setTranslationY((float) i);
        return h0h;
    }
}
