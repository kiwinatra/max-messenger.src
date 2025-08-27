package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.Lazy;

/* renamed from: kza  reason: default package */
public final /* synthetic */ class kza implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ pza b;

    public /* synthetic */ kza(pza pza, int i) {
        this.a = i;
        this.b = pza;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                pza pza = this.b;
                int width = pza.getWidth();
                float animatedFraction = valueAnimator.getAnimatedFraction();
                ((AppCompatImageView) pza.z0.getValue()).setAlpha(animatedFraction);
                ((AppCompatImageView) pza.D0.getValue()).setAlpha(animatedFraction);
                Lazy lazy = pza.A0;
                View view = (View) lazy.getValue();
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams != null) {
                    ViewGroup.LayoutParams layoutParams2 = ((View) lazy.getValue()).getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                    layoutParams.width = (int) (((float) (width - (marginLayoutParams != null ? marginLayoutParams.leftMargin : 0))) * animatedFraction);
                    view.setLayoutParams(layoutParams);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            default:
                float animatedFraction2 = ((float) 1) - valueAnimator.getAnimatedFraction();
                pza pza2 = this.b;
                AppCompatImageView appCompatImageView = (AppCompatImageView) pza2.z0.getValue();
                appCompatImageView.setAlpha(appCompatImageView.getAlpha() * animatedFraction2);
                AppCompatImageView appCompatImageView2 = (AppCompatImageView) pza2.D0.getValue();
                appCompatImageView2.setAlpha(appCompatImageView2.getAlpha() * animatedFraction2);
                Lazy lazy2 = pza2.A0;
                View view2 = (View) lazy2.getValue();
                ViewGroup.LayoutParams layoutParams3 = view2.getLayoutParams();
                if (layoutParams3 != null) {
                    layoutParams3.width = (int) (((float) ((AppCompatEditText) lazy2.getValue()).getWidth()) * animatedFraction2);
                    view2.setLayoutParams(layoutParams3);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
    }
}
