package defpackage;

import android.widget.PopupWindow;
import one.me.pinbars.PinBarsWidget;
import ru.ok.messages.suggests.SuggestsFragment;
import ru.ok.messages.suggests.SuggestsViewModel;

/* renamed from: b79  reason: default package */
public final class b79 implements PopupWindow.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b79(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void onDismiss() {
        b2f b2f;
        switch (this.a) {
            case 0:
                ((c79) this.b).c();
                return;
            case 1:
                ((PinBarsWidget) this.b).a = null;
                return;
            default:
                SuggestsFragment suggestsFragment = (SuggestsFragment) this.b;
                SuggestsViewModel V2 = suggestsFragment.V2();
                if ((((o85) V2.s.a.getValue()).a instanceof z1f) && (b2f = V2.u) != null) {
                    V2.o(b2f);
                }
                suggestsFragment.p1 = null;
                return;
        }
    }
}
