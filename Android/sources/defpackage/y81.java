package defpackage;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.List;
import kotlin.math.MathKt;
import kotlin.reflect.KProperty;
import one.me.calls.ui.ui.indicator.CallIndicatorWidget;

/* renamed from: y81  reason: default package */
public final class y81 extends FrameLayout implements oi1 {
    public final /* synthetic */ CallIndicatorWidget a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public y81(CallIndicatorWidget callIndicatorWidget, Context context) {
        super(context);
        this.a = callIndicatorWidget;
        setId(qqa.A);
        setBackground(new ColorDrawable(0));
        KProperty[] kPropertyArr = CallIndicatorWidget.v;
        callIndicatorWidget.getClass();
        KProperty kProperty = CallIndicatorWidget.v[1];
        addView((View) callIndicatorWidget.c.getValue());
        addView(CallIndicatorWidget.c0(callIndicatorWidget));
    }

    public final void C(long j, List list, boolean z) {
        CallIndicatorWidget callIndicatorWidget = this.a;
        CallIndicatorWidget.c0(callIndicatorWidget).C(j, list, z);
        float f = (float) 100;
        int e = a81.e(f, vo4.c().getDisplayMetrics().density, ((wgd) ((c91) ((b91) callIndicatorWidget.a.getValue())).c.getValue()).a);
        int roundToInt = z ? e : MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f);
        if (z) {
            e = MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density);
        }
        r81 c0 = CallIndicatorWidget.c0(callIndicatorWidget);
        pg pgVar = new pg("height", roundToInt);
        ObjectAnimator ofInt = ObjectAnimator.ofInt((Object) null, pgVar, new int[]{roundToInt, e});
        ofInt.setDuration(j);
        ofInt.addUpdateListener(new yg(c0, pgVar, 1));
        list.add(ofInt);
        ObjectAnimator ofInt2 = ObjectAnimator.ofInt((Object) null, new pg("backgroundChange", 0), new int[]{0});
        ofInt2.addUpdateListener(new x81(callIndicatorWidget, z, 0));
        list.add(ofInt2);
    }

    public final void a(boolean z) {
        CallIndicatorWidget callIndicatorWidget = this.a;
        CallIndicatorWidget.d0(callIndicatorWidget, true);
        float f = (float) 100;
        if (CallIndicatorWidget.c0(callIndicatorWidget).getHeight() != MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f)) {
            r81 c0 = CallIndicatorWidget.c0(callIndicatorWidget);
            ViewGroup.LayoutParams layoutParams = c0.getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.height = MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density);
                c0.setLayoutParams(marginLayoutParams);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
        }
        CallIndicatorWidget.c0(callIndicatorWidget).a(true);
    }

    public final void b(boolean z) {
        CallIndicatorWidget callIndicatorWidget = this.a;
        CallIndicatorWidget.d0(callIndicatorWidget, true);
        CallIndicatorWidget.c0(callIndicatorWidget).b(z);
    }
}
