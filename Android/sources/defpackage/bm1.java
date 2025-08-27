package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;
import one.me.calls.ui.ui.call.panels.CallTopPanelWidget;

/* renamed from: bm1  reason: default package */
public final /* synthetic */ class bm1 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ CallTopPanelWidget b;

    public /* synthetic */ bm1(CallTopPanelWidget callTopPanelWidget, int i) {
        this.a = i;
        this.b = callTopPanelWidget;
    }

    public final Object invoke() {
        CallTopPanelWidget callTopPanelWidget = this.b;
        switch (this.a) {
            case 0:
                KProperty[] kPropertyArr = CallTopPanelWidget.o;
                return new am1((ph1) callTopPanelWidget.a.getValue());
            default:
                KProperty[] kPropertyArr2 = CallTopPanelWidget.o;
                vl1 vl1 = new vl1(callTopPanelWidget.getContext());
                vl1.setId(kgc.call_top_control);
                return vl1;
        }
    }
}
