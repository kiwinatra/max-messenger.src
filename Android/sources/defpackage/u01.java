package defpackage;

import kotlin.reflect.KProperty;
import one.me.calls.ui.ui.call.panels.CallBottomPanelWidget;

/* renamed from: u01  reason: default package */
public final /* synthetic */ class u01 implements m8d {
    public final /* synthetic */ int a;
    public final /* synthetic */ v01 b;

    public /* synthetic */ u01(v01 v01, int i) {
        this.a = i;
        this.b = v01;
    }

    public final void b() {
        y01 y01;
        y01 y012;
        v01 v01 = this.b;
        switch (this.a) {
            case 0:
                aj8 aj8 = v01.L0;
                if (aj8 != null && (y01 = v01.K0) != null) {
                    aj8.a.getClass();
                    aj8 v = nfd.v(aj8);
                    KProperty[] kPropertyArr = CallBottomPanelWidget.y;
                    ((CallBottomPanelWidget) ((grg) y01).b).e0().l(v);
                    return;
                }
                return;
            case 1:
                aj8 aj82 = v01.M0;
                if (aj82 != null && (y012 = v01.K0) != null) {
                    aj8.a.getClass();
                    aj8 v2 = nfd.v(aj82);
                    KProperty[] kPropertyArr2 = CallBottomPanelWidget.y;
                    ((CallBottomPanelWidget) ((grg) y012).b).e0().n(v2);
                    return;
                }
                return;
            case 2:
                v01.L(v01);
                return;
            default:
                y01 y013 = v01.K0;
                if (y013 != null) {
                    ((grg) y013).B();
                    return;
                }
                return;
        }
    }
}
