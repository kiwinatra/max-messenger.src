package defpackage;

import android.view.View;
import android.view.Window;

/* renamed from: ob3  reason: default package */
public final /* synthetic */ class ob3 implements zu7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ob3(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void d(jv7 jv7, hu7 hu7) {
        Window window;
        View peekDecorView;
        switch (this.a) {
            case 0:
                if (hu7 == hu7.ON_STOP && (window = ((bc3) this.b).getWindow()) != null && (peekDecorView = window.peekDecorView()) != null) {
                    peekDecorView.cancelPendingInputEvents();
                    return;
                }
                return;
            case 1:
                bc3.t((bc3) this.b, hu7);
                return;
            default:
                hu7 hu72 = hu7.ON_START;
                mdd mdd = (mdd) this.b;
                if (hu7 == hu72) {
                    mdd.f = true;
                    return;
                } else if (hu7 == hu7.ON_STOP) {
                    mdd.f = false;
                    return;
                } else {
                    return;
                }
        }
    }
}
