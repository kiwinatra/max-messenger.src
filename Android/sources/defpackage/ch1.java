package defpackage;

import android.view.View;
import one.me.calls.ui.ui.call.CallScreen;

/* renamed from: ch1  reason: default package */
public final class ch1 implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ CallScreen b;

    public /* synthetic */ ch1(CallScreen callScreen, int i) {
        this.a = i;
        this.b = callScreen;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        switch (this.a) {
            case 0:
                view.removeOnLayoutChangeListener(this);
                this.b.Y.c();
                return;
            case 1:
                view.removeOnLayoutChangeListener(this);
                this.b.Y.c();
                return;
            default:
                view.removeOnLayoutChangeListener(this);
                this.b.Y.c();
                return;
        }
    }
}
