package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.DecelerateInterpolator;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Iterator;
import kotlin.Lazy;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import ru.ok.messages.suggests.SuggestsView;

/* renamed from: h5a  reason: default package */
public final class h5a extends PopupWindow {
    public final ch a;
    public final boolean b;
    public final ConstraintLayout c;
    public final TextView d;
    public final TextView e;
    public final TextView f;
    public final View g;
    public final View h;
    public AnimatorSet i;
    public AnimatorSet j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h5a(Context context, SuggestsView suggestsView, zuf zuf, npg npg, ch chVar, boolean z) {
        super(LayoutInflater.from(context).inflate(ujc.popup_suggest_name_picker, suggestsView, false), -1, -1);
        zuf zuf2 = zuf;
        npg npg2 = npg;
        this.a = chVar;
        this.b = z;
        View contentView = getContentView();
        TextView textView = (TextView) contentView.findViewById(lic.popup_suggest_name_picker__shortlink);
        this.f = textView;
        TextView textView2 = (TextView) contentView.findViewById(lic.popup_suggest_name_picker__name);
        this.e = textView2;
        View findViewById = contentView.findViewById(lic.popup_suggest_name_picker__divider1);
        this.g = findViewById;
        View findViewById2 = contentView.findViewById(lic.popup_suggest_name_picker__divider2);
        this.h = findViewById2;
        TextView textView3 = (TextView) contentView.findViewById(lic.popup_suggest_name_picker__title);
        this.d = textView3;
        ConstraintLayout constraintLayout = (ConstraintLayout) contentView.findViewById(lic.popup_suggest_name_picker__picker_layout);
        this.c = constraintLayout;
        CharSequence charSequence = zuf2.d;
        textView.setText(charSequence != null ? charSequence.toString() : null);
        CharSequence charSequence2 = zuf2.c;
        textView2.setText(charSequence2 != null ? charSequence2.toString() : null);
        Lazy lazy = scf.b0;
        scf k0 = j4b.k0(context);
        textView.setTextColor(k0.G);
        textView2.setTextColor(k0.G);
        textView3.setTextColor(k0.N);
        int i2 = k0.n;
        textView.setBackground(i8b.H(i2, k0.j));
        float f2 = (float) 8;
        textView2.setBackground(i8b.N(k0.n, k0.j, c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, (float) MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2), (float) MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2)));
        constraintLayout.setBackground(i8b.O(Integer.valueOf(i2), (Integer) null, (Integer) null, MathKt.roundToInt(f2 * vo4.c().getDisplayMetrics().density)));
        int i3 = k0.L;
        findViewById.setBackgroundColor(i3);
        findViewById2.setBackgroundColor(i3);
        ct.G(contentView, 300, new u99(7, (Object) this));
        ct.G(textView, 300, new c5a(this, npg2, 0));
        ct.G(textView2, 300, new c5a(this, npg2, 1));
    }

    public final void a(int i2) {
        int measuredHeight = getContentView().getMeasuredHeight();
        ConstraintLayout constraintLayout = this.c;
        if (!constraintLayout.isLaidOut() || constraintLayout.isLayoutRequested()) {
            constraintLayout.addOnLayoutChangeListener(new f5a(i2, measuredHeight, this));
        } else if (constraintLayout.getMeasuredHeight() + i2 > measuredHeight || (this.b && !h88.L(constraintLayout))) {
            constraintLayout.setY((((float) i2) - ((float) constraintLayout.getMeasuredHeight())) - ((float) ld9.E(constraintLayout.getContext())));
        } else {
            constraintLayout.setY(RangesKt.coerceAtLeast((float) i2, (float) MathKt.roundToInt(((float) 8) * vo4.c().getDisplayMetrics().density)));
        }
    }

    public final void showAtLocation(View view, int i2, int i3, int i4) {
        Object obj;
        try {
            Result.Companion companion = Result.Companion;
            super.showAtLocation(view, i2, 0, 0);
            obj = Result.m23constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.m23constructorimpl(ResultKt.createFailure(th));
        }
        Object obj2 = null;
        if (Result.m29isFailureimpl(obj)) {
            obj = null;
        }
        if (((Unit) obj) != null) {
            View rootView = getContentView().getRootView();
            WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) rootView.getLayoutParams();
            layoutParams.flags |= 2;
            layoutParams.dimAmount = 0.1f;
            f6e.v(getContentView()).updateViewLayout(rootView, layoutParams);
            View contentView = getContentView();
            if (!contentView.isLaidOut() || contentView.isLayoutRequested()) {
                contentView.addOnLayoutChangeListener(new f5a(this, i4, i3));
                return;
            }
            int e2 = a81.e((float) 16, vo4.c().getDisplayMetrics().density, getContentView().getMeasuredWidth());
            TextView textView = this.f;
            ViewGroup.LayoutParams layoutParams2 = textView.getLayoutParams();
            if (layoutParams2 != null) {
                fj3 fj3 = (fj3) layoutParams2;
                fj3.P = e2;
                textView.setLayoutParams(fj3);
                TextView textView2 = this.e;
                ViewGroup.LayoutParams layoutParams3 = textView2.getLayoutParams();
                if (layoutParams3 != null) {
                    fj3 fj32 = (fj3) layoutParams3;
                    fj32.P = e2;
                    textView2.setLayoutParams(fj32);
                    Iterator it = CollectionsKt.listOf(this.d, textView, textView2).iterator();
                    if (it.hasNext()) {
                        obj2 = it.next();
                        if (it.hasNext()) {
                            int measuredWidth = ((View) obj2).getMeasuredWidth();
                            do {
                                Object next = it.next();
                                int measuredWidth2 = ((View) next).getMeasuredWidth();
                                if (measuredWidth < measuredWidth2) {
                                    obj2 = next;
                                    measuredWidth = measuredWidth2;
                                }
                            } while (it.hasNext());
                        }
                    }
                    View view2 = (View) obj2;
                    if (view2 != null) {
                        int id = view2.getId();
                        pj3 pj3 = new pj3();
                        ConstraintLayout constraintLayout = this.c;
                        pj3.d(constraintLayout);
                        View view3 = this.g;
                        pj3.e(view3.getId(), 6, id, 6);
                        pj3.e(view3.getId(), 7, id, 7);
                        View view4 = this.h;
                        pj3.e(view4.getId(), 6, id, 6);
                        pj3.e(view4.getId(), 7, id, 7);
                        pj3.a(constraintLayout);
                        int measuredHeight = getContentView().getMeasuredHeight();
                        int measuredHeight2 = constraintLayout.getMeasuredHeight() + i4;
                        boolean z = this.b;
                        if (measuredHeight2 > measuredHeight || (z && !h88.L(constraintLayout))) {
                            float f2 = (float) i3;
                            float f3 = (float) 8;
                            float coerceAtLeast = RangesKt.coerceAtLeast(f2 - ((float) constraintLayout.getMeasuredWidth()), (float) MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f3));
                            constraintLayout.setY((((float) i4) - ((float) ld9.E(constraintLayout.getContext()))) - ((float) constraintLayout.getMeasuredHeight()));
                            if (!z || h88.L(constraintLayout)) {
                                constraintLayout.setPivotX((float) constraintLayout.getMeasuredWidth());
                            } else {
                                coerceAtLeast = ((float) constraintLayout.getMeasuredWidth()) + f2 > ((float) a81.e(f3, vo4.c().getDisplayMetrics().density, getContentView().getMeasuredWidth())) ? (float) MathKt.roundToInt(f3 * vo4.c().getDisplayMetrics().density) : RangesKt.coerceAtLeast(f2, (float) MathKt.roundToInt(f3 * vo4.c().getDisplayMetrics().density));
                                constraintLayout.setPivotX(c44.DEFAULT_ASPECT_RATIO);
                            }
                            constraintLayout.setX(coerceAtLeast);
                            constraintLayout.setPivotY((float) constraintLayout.getMeasuredHeight());
                        } else {
                            constraintLayout.setX(RangesKt.coerceAtLeast(((float) i3) - ((float) constraintLayout.getMeasuredWidth()), (float) MathKt.roundToInt(((float) 8) * vo4.c().getDisplayMetrics().density)));
                            constraintLayout.setY(((float) i4) - ((float) ld9.E(constraintLayout.getContext())));
                            constraintLayout.setPivotX((float) constraintLayout.getMeasuredWidth());
                            constraintLayout.setPivotY(c44.DEFAULT_ASPECT_RATIO);
                        }
                        if (this.a.q()) {
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.5f, 1.0f});
                            ofFloat.addListener(new e5a(this, 1));
                            ofFloat.addUpdateListener(new g5a(this, 1));
                            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{c44.DEFAULT_ASPECT_RATIO, 1.0f});
                            ofFloat2.addUpdateListener(new g5a(this, 0));
                            AnimatorSet animatorSet = new AnimatorSet();
                            animatorSet.setDuration(150);
                            animatorSet.setInterpolator(new DecelerateInterpolator());
                            animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2});
                            animatorSet.start();
                            this.j = animatorSet;
                            return;
                        }
                        return;
                    }
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
    }
}
