package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import kotlin.math.MathKt;
import one.me.sdk.uikit.common.views.OneMeDraweeView;

/* renamed from: bqd  reason: default package */
public final class bqd extends pae {
    public final y3a v;
    public final Executor w;

    public bqd(y3a y3a, ExecutorService executorService) {
        super(executorService);
        this.v = y3a;
        this.w = executorService;
    }

    public final void J(kbe kbe, int i) {
        ((aqd) kbe).M((al6) ((lz7) E(i)));
    }

    public final void s(pzc pzc, int i) {
        ((aqd) pzc).M((al6) ((lz7) E(i)));
    }

    public final pzc u(ViewGroup viewGroup, int i) {
        int i2 = aqd.H0;
        Context context = viewGroup.getContext();
        OneMeDraweeView oneMeDraweeView = new OneMeDraweeView(context);
        float f = (float) 44;
        oneMeDraweeView.setLayoutParams(new LinearLayout.LayoutParams(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density)));
        oneMeDraweeView.setOutlineProvider(new n04(vo4.c().getDisplayMetrics().density * 8.0f));
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, (AttributeSet) null);
        puf.k.b(appCompatTextView, uy4.b);
        appCompatTextView.setPadding(MathKt.roundToInt(((float) 8) * vo4.c().getDisplayMetrics().density), appCompatTextView.getPaddingTop(), appCompatTextView.getPaddingRight(), appCompatTextView.getPaddingBottom());
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        linearLayout.setVerticalGravity(16);
        float f2 = (float) 12;
        float f3 = (float) 6;
        linearLayout.setPadding(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f3), MathKt.roundToInt(f2 * vo4.c().getDisplayMetrics().density), MathKt.roundToInt(f3 * vo4.c().getDisplayMetrics().density));
        linearLayout.addView(oneMeDraweeView);
        linearLayout.addView(appCompatTextView);
        return new aqd(this.v, oneMeDraweeView, appCompatTextView, linearLayout);
    }
}
