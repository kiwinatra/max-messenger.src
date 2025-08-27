package defpackage;

import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KProperty;
import one.me.calls.ui.bottomsheet.opponents.CallOpponentsListWidget;

/* renamed from: je1  reason: default package */
public final /* synthetic */ class je1 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ CallOpponentsListWidget b;

    public /* synthetic */ je1(CallOpponentsListWidget callOpponentsListWidget, int i) {
        this.a = i;
        this.b = callOpponentsListWidget;
    }

    public final Object invoke(Object obj) {
        CallOpponentsListWidget callOpponentsListWidget = this.b;
        switch (this.a) {
            case 0:
                View view = (View) obj;
                KProperty[] kPropertyArr = CallOpponentsListWidget.B0;
                callOpponentsListWidget.getRouter().B(callOpponentsListWidget);
                return Unit.INSTANCE;
            case 1:
                View view2 = (View) obj;
                KProperty[] kPropertyArr2 = CallOpponentsListWidget.B0;
                xag.h(callOpponentsListWidget.f0().w0, xh1.b);
                return Unit.INSTANCE;
            default:
                i53 i53 = (i53) obj;
                KProperty[] kPropertyArr3 = CallOpponentsListWidget.B0;
                callOpponentsListWidget.getClass();
                Toolbar toolbar = new Toolbar(i53.getContext(), (AttributeSet) null);
                f53 f53 = new f53(-1, -2);
                f53.a = 1;
                toolbar.setLayoutParams(f53);
                toolbar.setNavigationIcon((Drawable) null);
                toolbar.u(0, 0);
                toolbar.addView(callOpponentsListWidget.e0());
                Unit unit = Unit.INSTANCE;
                i53.addView(toolbar);
                KProperty kProperty = CallOpponentsListWidget.B0[0];
                LinearLayout linearLayout = (LinearLayout) callOpponentsListWidget.w.getValue();
                KProperty[] kPropertyArr4 = CallOpponentsListWidget.B0;
                KProperty[] kPropertyArr5 = CallOpponentsListWidget.B0;
                KProperty kProperty2 = kPropertyArr5[4];
                linearLayout.addView((TextView) callOpponentsListWidget.Y.getValue());
                KProperty kProperty3 = kPropertyArr5[5];
                linearLayout.addView((TextView) callOpponentsListWidget.Z.getValue());
                KProperty kProperty4 = kPropertyArr5[2];
                linearLayout.addView((iqa) callOpponentsListWidget.z.getValue());
                KProperty kProperty5 = kPropertyArr5[6];
                linearLayout.addView((TextView) callOpponentsListWidget.v0.getValue());
                Unit unit2 = Unit.INSTANCE;
                i53.addView(linearLayout);
                return Unit.INSTANCE;
        }
    }
}
