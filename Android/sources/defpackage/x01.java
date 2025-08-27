package defpackage;

import kotlin.reflect.KProperty;
import one.me.calls.ui.ui.call.panels.CallBottomPanelWidget;

/* renamed from: x01  reason: default package */
public final /* synthetic */ class x01 implements m8d {
    public final /* synthetic */ int a;
    public final /* synthetic */ z01 b;

    public /* synthetic */ x01(z01 z01, int i) {
        this.a = i;
        this.b = z01;
    }

    public final void b() {
        y01 y01;
        y01 y012;
        z01 z01 = this.b;
        switch (this.a) {
            case 0:
                z01.a(z01);
                return;
            case 1:
                aj8 aj8 = z01.y;
                if (aj8 != null && (y01 = z01.x) != null) {
                    aj8.a.getClass();
                    aj8 v = nfd.v(aj8);
                    KProperty[] kPropertyArr = CallBottomPanelWidget.y;
                    ((CallBottomPanelWidget) ((grg) y01).b).e0().l(v);
                    return;
                }
                return;
            case 2:
                aj8 aj82 = z01.z;
                if (aj82 != null && (y012 = z01.x) != null) {
                    aj8.a.getClass();
                    aj8 v2 = nfd.v(aj82);
                    KProperty[] kPropertyArr2 = CallBottomPanelWidget.y;
                    ((CallBottomPanelWidget) ((grg) y012).b).e0().n(v2);
                    return;
                }
                return;
            default:
                y01 y013 = z01.x;
                if (y013 != null) {
                    ((grg) y013).B();
                    return;
                }
                return;
        }
    }
}
