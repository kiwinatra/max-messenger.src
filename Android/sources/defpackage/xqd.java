package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import one.me.sdk.uikit.common.views.OneMeDraweeView;

/* renamed from: xqd  reason: default package */
public final class xqd extends jj0 {
    public final il8 v;
    public Function2 w = new ui0(20);

    public xqd(il8 il8) {
        super((j4b) w63.O);
        this.v = il8;
    }

    public final void F(List list, List list2) {
        this.w.invoke(list, list2);
    }

    public final void s(pzc pzc, int i) {
        wqd wqd = (wqd) pzc;
        tqd tqd = (tqd) E(i);
        wqd.G0 = tqd;
        boolean areEqual = Intrinsics.areEqual((Object) wqd.H0, (Object) tqd.o);
        Uri uri = tqd.y;
        if (!areEqual || !Intrinsics.areEqual((Object) wqd.I0, (Object) uri)) {
            Uri uri2 = tqd.o;
            wqd.H0 = uri2;
            wqd.I0 = uri;
            ra7 d = ra7.d(uri2);
            d.i = true;
            OneMeDraweeView oneMeDraweeView = wqd.E0;
            if (uri != null) {
                d.l = new p6b(oneMeDraweeView.getContext(), uri);
            }
            qa7 a = d.a();
            int i2 = OneMeDraweeView.z0;
            oneMeDraweeView.o(a, (qa7) null);
        }
        wqd.F0.setVisibility(tqd.a.Z == j48.v ? 0 : 8);
    }

    public final pzc u(ViewGroup viewGroup, int i) {
        int i2 = wqd.J0;
        Context context = viewGroup.getContext();
        OneMeDraweeView oneMeDraweeView = new OneMeDraweeView(context);
        oneMeDraweeView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        Drawable b = ew3.b(context, kra.g);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(vo4.c().getDisplayMetrics().density * 10.0f);
        AppCompatImageView appCompatImageView = new AppCompatImageView(context, (AttributeSet) null);
        float f = (float) 20;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density), 8388613);
        float f2 = (float) 4;
        int roundToInt = MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2);
        layoutParams.setMargins(roundToInt, roundToInt, roundToInt, roundToInt);
        appCompatImageView.setLayoutParams(layoutParams);
        int roundToInt2 = MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2);
        appCompatImageView.setPadding(roundToInt2, roundToInt2, roundToInt2, roundToInt2);
        appCompatImageView.setImageDrawable(b);
        appCompatImageView.setBackground(gradientDrawable);
        Drawable b2 = ew3.b(context, kra.l);
        AppCompatImageView appCompatImageView2 = new AppCompatImageView(context, (AttributeSet) null);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2, 8388693);
        int roundToInt3 = MathKt.roundToInt(f2 * vo4.c().getDisplayMetrics().density);
        layoutParams2.setMargins(roundToInt3, roundToInt3, roundToInt3, roundToInt3);
        appCompatImageView2.setLayoutParams(layoutParams2);
        appCompatImageView2.setImageDrawable(b2);
        FrameLayout frameLayout = new FrameLayout(context);
        float f3 = (float) 64;
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f3), MathKt.roundToInt(f3 * vo4.c().getDisplayMetrics().density));
        float f4 = (float) 2;
        layoutParams3.setMargins(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f4), layoutParams3.topMargin, MathKt.roundToInt(f4 * vo4.c().getDisplayMetrics().density), layoutParams3.bottomMargin);
        frameLayout.setLayoutParams(layoutParams3);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setCornerRadius(vo4.c().getDisplayMetrics().density * 12.0f);
        frameLayout.setBackground(gradientDrawable2);
        frameLayout.setClipToOutline(true);
        frameLayout.addView(oneMeDraweeView);
        frameLayout.addView(appCompatImageView);
        frameLayout.addView(appCompatImageView2);
        b0h.H(frameLayout, new ce1(b, b2, gradientDrawable, (Continuation) null, 7));
        return new wqd(this.v, oneMeDraweeView, appCompatImageView, appCompatImageView2, frameLayout);
    }
}
