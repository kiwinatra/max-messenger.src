package defpackage;

import kotlin.reflect.KProperty;
import one.me.calls.ui.ui.call.panels.CallTopPanelWidget;

/* renamed from: ol1  reason: default package */
public final /* synthetic */ class ol1 implements m8d {
    public final /* synthetic */ int a;
    public final /* synthetic */ ql1 b;

    public /* synthetic */ ol1(ql1 ql1, int i) {
        this.a = i;
        this.b = ql1;
    }

    public final void b() {
        ql1 ql1 = this.b;
        switch (this.a) {
            case 0:
                sl1 sl1 = ql1.J0;
                if (sl1 != null) {
                    KProperty[] kPropertyArr = CallTopPanelWidget.o;
                    xag.h(((jj1) ((CallTopPanelWidget) ((wie) sl1).b).d0().b).K0, sh1.b);
                    return;
                }
                return;
            case 1:
                ql1.L(ql1);
                return;
            default:
                sl1 sl12 = ql1.J0;
                if (sl12 != null) {
                    KProperty[] kPropertyArr2 = CallTopPanelWidget.o;
                    xag.h(((jj1) ((CallTopPanelWidget) ((wie) sl12).b).d0().b).K0, hi1.b);
                    return;
                }
                return;
        }
    }
}
