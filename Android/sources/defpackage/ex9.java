package defpackage;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.math.MathKt;
import one.me.sdk.richvector.EnhancedVectorDrawable;

/* renamed from: ex9  reason: default package */
public final /* synthetic */ class ex9 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ hx9 b;

    public /* synthetic */ ex9(hx9 hx9, int i) {
        this.a = i;
        this.b = hx9;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                this.b.c.a();
                return Unit.INSTANCE;
            default:
                Context context = this.b.a.getContext();
                EnhancedVectorDrawable enhancedVectorDrawable = new EnhancedVectorDrawable(context, lya.l);
                js9 js9 = fu4.k;
                js9.e(context).f().getIcon().getClass();
                hi7.Y(enhancedVectorDrawable, "circle_background", -16745729);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(1);
                float f = (float) 24;
                gradientDrawable.setSize(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density));
                gradientDrawable.setColor(js9.e(context).f().c().d);
                gradientDrawable.setStroke(MathKt.roundToInt(((float) 2) * vo4.c().getDisplayMetrics().density), js9.e(context).f().h().a);
                StateListDrawable stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(new int[]{16842912}, enhancedVectorDrawable);
                stateListDrawable.addState(new int[]{-16842912}, gradientDrawable);
                return stateListDrawable;
        }
    }
}
