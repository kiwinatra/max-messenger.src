package defpackage;

import android.view.ViewTreeObserver;

/* renamed from: yp0  reason: default package */
public final /* synthetic */ class yp0 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ yp0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final boolean onPreDraw() {
        switch (this.a) {
            case 0:
                ((aq0) this.b).c();
                return true;
            default:
                rd5 rd5 = (rd5) this.b;
                if (!rd5.v0 && rd5.getMeasuredWidth() > 0) {
                    rd5.b(rd5.getMeasuredWidth());
                    rd5.v0 = true;
                    rd5.requestLayout();
                }
                if (rd5.v0) {
                    rd5.getViewTreeObserver().removeOnPreDrawListener(rd5.z0);
                    rd5.z0 = null;
                }
                return true;
        }
    }
}
