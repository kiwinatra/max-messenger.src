package defpackage;

import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* renamed from: xz3  reason: default package */
public final class xz3 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xz3(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final boolean onPreDraw() {
        switch (this.a) {
            case 0:
                ((CoordinatorLayout) this.b).j(0);
                return true;
            default:
                qr5 qr5 = (qr5) this.b;
                float rotation = qr5.s.getRotation();
                if (qr5.o == rotation) {
                    return true;
                }
                qr5.o = rotation;
                qr5.p();
                return true;
        }
    }
}
