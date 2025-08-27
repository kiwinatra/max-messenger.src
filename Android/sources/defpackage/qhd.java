package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import kotlin.jvm.functions.Function0;
import kotlin.math.MathKt;

/* renamed from: qhd  reason: default package */
public final /* synthetic */ class qhd implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ xhd c;

    public /* synthetic */ qhd(Context context, xhd xhd, int i) {
        this.a = i;
        this.b = context;
        this.c = xhd;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                ohd ohd = new ohd(this.b);
                ohd.setImageDrawable(ew3.b(ohd.getContext(), lya.v));
                ct.G(ohd, 300, new phd(this.c, 1));
                ViewGroup.LayoutParams layoutParams = ohd.getLayoutParams();
                if (layoutParams != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, MathKt.roundToInt(((float) 4) * vo4.c().getDisplayMetrics().density));
                    ohd.setLayoutParams(marginLayoutParams);
                    return ohd;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            case 1:
                ohd ohd2 = new ohd(this.b);
                ohd2.setImageDrawable(ew3.b(ohd2.getContext(), lya.q));
                ct.G(ohd2, 300, new phd(this.c, 2));
                ViewGroup.LayoutParams layoutParams2 = ohd2.getLayoutParams();
                if (layoutParams2 != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                    marginLayoutParams2.setMargins(marginLayoutParams2.leftMargin, marginLayoutParams2.topMargin, marginLayoutParams2.rightMargin, MathKt.roundToInt(((float) 8) * vo4.c().getDisplayMetrics().density));
                    ohd2.setLayoutParams(marginLayoutParams2);
                    return ohd2;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            default:
                ohd ohd3 = new ohd(this.b);
                ohd3.setImageDrawable(ew3.b(ohd3.getContext(), lya.p));
                ct.G(ohd3, 300, new phd(this.c, 0));
                ViewGroup.LayoutParams layoutParams3 = ohd3.getLayoutParams();
                if (layoutParams3 != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
                    marginLayoutParams3.setMargins(marginLayoutParams3.leftMargin, marginLayoutParams3.topMargin, marginLayoutParams3.rightMargin, MathKt.roundToInt(((float) 8) * vo4.c().getDisplayMetrics().density));
                    ohd3.setLayoutParams(marginLayoutParams3);
                    return ohd3;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
    }
}
