package defpackage;

import android.widget.PopupWindow;

/* renamed from: t01  reason: default package */
public final /* synthetic */ class t01 implements PopupWindow.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ v01 b;

    public /* synthetic */ t01(v01 v01, int i) {
        this.a = i;
        this.b = v01;
    }

    public final void onDismiss() {
        switch (this.a) {
            case 0:
                this.b.O0 = null;
                return;
            case 1:
                v01 v01 = this.b;
                u41 u41 = v01.N0;
                if (u41 != null) {
                    boolean z = u41 instanceof q41;
                    p8d p8d = v01.G0;
                    if (z) {
                        q41 q41 = (q41) u41;
                        v01.M(p8d, q41.c, q41.f);
                        return;
                    }
                    v01.O(p8d, u41.a(), u41.getContentDescription());
                    return;
                }
                return;
            default:
                v01.M(this.b.J0, cad.u0, new igf(ykc.call_more_accessibility));
                return;
        }
    }
}
