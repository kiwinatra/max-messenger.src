package defpackage;

import android.animation.ValueAnimator;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.TuplesKt;
import kotlin.coroutines.Continuation;
import kotlin.math.MathKt;
import one.me.inappreview.ui.FakeInAppReviewBottomSheet;

/* renamed from: r13  reason: default package */
public final /* synthetic */ class r13 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    public /* synthetic */ r13(Object obj, int i, Object obj2, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
        this.o = obj2;
    }

    public final void onClick(View view) {
        int i = this.b;
        Object obj = this.o;
        Object obj2 = this.c;
        switch (this.a) {
            case 0:
                t13 t13 = (t13) obj2;
                t13.getClass();
                dx0 dx0 = (dx0) obj;
                t13.v.set(i, new dx0(dx0.a, dx0.b, dx0.c, !dx0.d));
                return;
            case 1:
                FakeInAppReviewBottomSheet fakeInAppReviewBottomSheet = (FakeInAppReviewBottomSheet) obj2;
                fakeInAppReviewBottomSheet.E0 = false;
                qc7 qc7 = (qc7) mc7.a.getAccessor().j(qc7.class);
                if (qc7 != null) {
                    qc7.c(xc7.b, Integer.valueOf(i));
                }
                FrameLayout frameLayout = (FrameLayout) obj;
                int height = frameLayout.getHeight();
                FrameLayout frameLayout2 = new FrameLayout(fakeInAppReviewBottomSheet.getContext());
                frameLayout2.setId(nua.h);
                frameLayout2.setLayoutParams(new FrameLayout.LayoutParams(-1, height));
                AppCompatTextView appCompatTextView = new AppCompatTextView(frameLayout2.getContext(), (AttributeSet) null);
                appCompatTextView.setId(nua.k);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                layoutParams.topMargin = MathKt.roundToInt(((float) 24) * vo4.c().getDisplayMetrics().density);
                layoutParams.gravity = 49;
                appCompatTextView.setLayoutParams(layoutParams);
                puf.c.b(appCompatTextView, uy4.b);
                appCompatTextView.setText(pua.e);
                appCompatTextView.setTextColor(fu4.k.e(appCompatTextView.getContext()).f().getText().e);
                frameLayout2.addView(appCompatTextView);
                AppCompatImageView appCompatImageView = new AppCompatImageView(frameLayout2.getContext(), (AttributeSet) null);
                appCompatImageView.setId(nua.j);
                float f = (float) 77;
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density));
                layoutParams2.gravity = 17;
                appCompatImageView.setLayoutParams(layoutParams2);
                appCompatImageView.setImageResource(mua.a);
                frameLayout2.addView(appCompatImageView);
                AppCompatTextView appCompatTextView2 = new AppCompatTextView(frameLayout2.getContext(), (AttributeSet) null);
                appCompatTextView2.setId(nua.i);
                FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
                layoutParams3.bottomMargin = MathKt.roundToInt(((float) 35) * vo4.c().getDisplayMetrics().density);
                layoutParams3.gravity = 81;
                appCompatTextView2.setLayoutParams(layoutParams3);
                puf.e.b(appCompatTextView2, uy4.b);
                appCompatTextView2.setText(pua.a);
                appCompatTextView2.setTextColor(-16611745);
                ct.G(appCompatTextView2, 300, new vg5(fakeInAppReviewBottomSheet, 1));
                frameLayout2.addView(appCompatTextView2);
                b0h.H(frameLayout2, new xg5(appCompatTextView, (Continuation) null));
                frameLayout.addView(frameLayout2);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{c44.DEFAULT_ASPECT_RATIO, 1.0f});
                ofFloat.setDuration(200);
                ofFloat.addUpdateListener(new bn(3, fakeInAppReviewBottomSheet, ofFloat));
                ofFloat.addListener(new tf(2, fakeInAppReviewBottomSheet, frameLayout));
                ofFloat.start();
                return;
            case 2:
                ((jk6) obj2).v.r(i, (um6) obj);
                return;
            default:
                gp6 gp6 = ((kk6) obj2).v;
                gp6.getClass();
                StringBuilder sb = new StringBuilder("onItemClicked: ");
                vm6 vm6 = (vm6) obj;
                sb.append(vm6);
                z68.c("gp6", sb.toString(), new Object[0]);
                xag.h(gp6.O0, TuplesKt.to(Integer.valueOf(i), vm6));
                return;
        }
    }
}
