package defpackage;

import android.os.Handler;
import android.widget.AbsListView;

/* renamed from: rz7  reason: default package */
public final class rz7 implements AbsListView.OnScrollListener {
    public final /* synthetic */ sz7 a;

    public rz7(sz7 sz7) {
        this.a = sz7;
    }

    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }

    public final void onScrollStateChanged(AbsListView absListView, int i) {
        if (i == 1) {
            sz7 sz7 = this.a;
            if (sz7.I0.getInputMethodMode() != 2 && sz7.I0.getContentView() != null) {
                Handler handler = sz7.E0;
                qz7 qz7 = sz7.A0;
                handler.removeCallbacks(qz7);
                qz7.run();
            }
        }
    }
}
