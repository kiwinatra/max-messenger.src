package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.math.MathKt;
import kotlin.reflect.KProperty;
import one.me.calls.ui.ui.indicator.CallIndicatorWidget;

/* renamed from: w81  reason: default package */
public final /* synthetic */ class w81 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ CallIndicatorWidget b;

    public /* synthetic */ w81(CallIndicatorWidget callIndicatorWidget, int i) {
        this.a = i;
        this.b = callIndicatorWidget;
    }

    public final Object invoke() {
        CallIndicatorWidget callIndicatorWidget = this.b;
        switch (this.a) {
            case 0:
                KProperty[] kPropertyArr = CallIndicatorWidget.v;
                r81 r81 = new r81(callIndicatorWidget.getContext(), (AttributeSet) null);
                r81.setId(qqa.z);
                r81.setLayoutParams(new ViewGroup.LayoutParams(-1, MathKt.roundToInt(((float) 100) * vo4.c().getDisplayMetrics().density)));
                ct.G(r81, 300, new x4(14, (Object) callIndicatorWidget));
                jdb jdb = jdb.b;
                jdb jdb2 = anf.a;
                h88.f(r81, new yh7(jdb, (nr0) null, 2), (Function1) null);
                return r81;
            case 1:
                KProperty[] kPropertyArr2 = CallIndicatorWidget.v;
                View view = new View(callIndicatorWidget.getContext());
                view.setId(qqa.B);
                view.setLayoutParams(new ViewGroup.LayoutParams(-1, a81.e((float) 15, vo4.c().getDisplayMetrics().density, MathKt.roundToInt(((float) 100) * vo4.c().getDisplayMetrics().density))));
                view.setBackground(new ColorDrawable(l2b.d.i));
                return view;
            default:
                KProperty[] kPropertyArr3 = CallIndicatorWidget.v;
                m21 m21 = m21.a;
                return new t81((by4) m21.getAccessor().g(by4.class), (a21) m21.getAccessor().g(a21.class), m21.c(), new hl1(callIndicatorWidget.getContext()));
        }
    }
}
