package defpackage;

import kotlin.reflect.KProperty;
import one.me.calls.ui.ui.call.panels.CallTopPanelWidget;

/* renamed from: rl1  reason: default package */
public final /* synthetic */ class rl1 implements m8d {
    public final /* synthetic */ int a;
    public final /* synthetic */ tl1 b;

    public /* synthetic */ rl1(tl1 tl1, int i) {
        this.a = i;
        this.b = tl1;
    }

    public final void b() {
        tl1 tl1 = this.b;
        switch (this.a) {
            case 0:
                sl1 sl1 = tl1.E0;
                if (sl1 != null) {
                    KProperty[] kPropertyArr = CallTopPanelWidget.o;
                    xag.h(((jj1) ((CallTopPanelWidget) ((wie) sl1).b).d0().b).K0, sh1.b);
                    return;
                }
                return;
            default:
                sl1 sl12 = tl1.E0;
                if (sl12 != null) {
                    KProperty[] kPropertyArr2 = CallTopPanelWidget.o;
                    xag.h(((jj1) ((CallTopPanelWidget) ((wie) sl12).b).d0().b).K0, hi1.b);
                    return;
                }
                return;
        }
    }
}
