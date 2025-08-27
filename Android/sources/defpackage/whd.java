package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import kotlin.jvm.functions.Function1;

/* renamed from: whd  reason: default package */
public final class whd implements Function1 {
    public final /* synthetic */ View a;
    public final /* synthetic */ xhd b;
    public final /* synthetic */ rhd c;
    public final /* synthetic */ xhd o;
    public final /* synthetic */ ohd v;

    public whd(ohd ohd, xhd xhd, rhd rhd, xhd xhd2, ohd ohd2) {
        this.a = ohd;
        this.b = xhd;
        this.c = rhd;
        this.o = xhd2;
        this.v = ohd2;
    }

    public final Object invoke(Object obj) {
        ValueAnimator valueAnimator = (ValueAnimator) obj;
        View view = this.a;
        float translationY = ((float) 1) - (view.getTranslationY() / (vo4.c().getDisplayMetrics().density * 4.0f));
        float animatedFraction = valueAnimator != null ? valueAnimator.getAnimatedFraction() : c44.DEFAULT_ASPECT_RATIO;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{view.getTranslationY(), vo4.c().getDisplayMetrics().density * 4.0f});
        ofFloat.setDuration((long) (((float) 200) * translationY));
        ofFloat.setInterpolator(xhd.v0);
        ohd ohd = (ohd) view;
        ofFloat.addListener(new uhd(ohd, this.b, this.c, this.o, this.v));
        ofFloat.addUpdateListener(new vhd(ohd, animatedFraction));
        ofFloat.start();
        return ofFloat;
    }
}
