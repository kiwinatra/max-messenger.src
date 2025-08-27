package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: el4  reason: default package */
public final class el4 extends ey3 {
    public final long o = 1000;
    public final Handler v = new Handler(Looper.getMainLooper());
    public dl4 w;

    public final void a() {
        dl4 dl4 = this.w;
        if (dl4 != null) {
            this.v.removeCallbacks(dl4);
        }
        dl4 dl42 = this.w;
        if (dl42 != null) {
            dl42.run();
        }
        this.w = null;
    }

    public final void f() {
        dl4 dl4 = this.w;
        if (dl4 != null) {
            this.v.removeCallbacks(dl4);
        }
        this.w = null;
    }

    public final void g(ViewGroup viewGroup, View view, View view2, boolean z, cy3 cy3) {
        dl4 dl4 = this.w;
        Handler handler = this.v;
        if (dl4 != null) {
            handler.removeCallbacks(dl4);
        }
        dl4 dl42 = new dl4(view, z, this, viewGroup, view2, cy3);
        handler.postDelayed(dl42, this.o);
        this.w = dl42;
    }
}
