package defpackage;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.math.MathKt;
import kotlin.properties.Delegates;
import kotlin.reflect.KProperty;

/* renamed from: r81  reason: default package */
public final class r81 extends ConstraintLayout implements oi1 {
    public static final /* synthetic */ KProperty[] H0 = {rae.s(r81.class, "indicatorState", "getIndicatorState()Lone/me/calls/ui/view/indicator/CallIndicatorView$Companion$CallIndicatorState;", 0)};
    public final AppCompatTextView E0;
    public final AppCompatTextView F0;
    public final bl G0 = new bl(this);

    public r81(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Delegates delegates = Delegates.INSTANCE;
        q81 q81 = q81.a;
        setBackground(new v81(context));
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, (AttributeSet) null);
        appCompatTextView.setId(qqa.C);
        appCompatTextView.setMaxLines(1);
        appCompatTextView.setGravity(17);
        appCompatTextView.setLayoutParams(new fj3(-2, -2));
        ogf ogf = puf.m;
        ogf.b(appCompatTextView, uy4.b);
        appCompatTextView.setTextColor(getTitleColor());
        this.F0 = appCompatTextView;
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(context, (AttributeSet) null);
        appCompatTextView2.setId(qqa.D);
        appCompatTextView2.setEllipsize(TextUtils.TruncateAt.END);
        appCompatTextView2.setMaxLines(1);
        appCompatTextView2.setGravity(17);
        appCompatTextView2.setLayoutParams(new fj3(-2, -1));
        ogf.b(appCompatTextView2, uy4.b);
        appCompatTextView2.setTextColor(getTitleColor());
        this.E0 = appCompatTextView2;
        addView(appCompatTextView);
        addView(appCompatTextView2);
        float f = (float) 24;
        float f2 = (float) 0;
        setPadding(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2), MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density), MathKt.roundToInt(f2 * vo4.c().getDisplayMetrics().density));
        pj3 h = ct.h(this);
        int id = appCompatTextView2.getId();
        h.e(id, 3, 0, 3);
        h.e(id, 6, 0, 6);
        h.e(id, 7, appCompatTextView.getId(), 6);
        h.j(id).d.l0 = true;
        h.j(id).d.V = 2;
        int id2 = appCompatTextView.getId();
        h.e(id2, 4, appCompatTextView2.getId(), 4);
        h.e(id2, 3, appCompatTextView2.getId(), 3);
        h.e(id2, 6, appCompatTextView2.getId(), 7);
        h.e(id2, 7, 0, 7);
        h.a(this);
    }

    private final int getTitleColor() {
        return l2b.i.e;
    }

    public final void C(long j, List list, boolean z) {
        float f = 1.0f;
        float f2 = z ? 0.0f : 1.0f;
        if (!z) {
            f = 0.0f;
        }
        list.add(ObjectAnimator.ofFloat(this, View.ALPHA, new float[]{f2, f}));
    }

    public final void a(boolean z) {
        v81 background = getBackground();
        if (background != null) {
            u81 u81 = u81.b;
            background.x.setValue(background, v81.y[0], u81);
        }
        v81 background2 = getBackground();
        if (background2 != null) {
            background2.start();
        }
        this.F0.setTranslationY(c44.DEFAULT_ASPECT_RATIO);
        this.E0.setTranslationY(c44.DEFAULT_ASPECT_RATIO);
        setAlpha(1.0f);
    }

    public final void b(boolean z) {
        v81 background = getBackground();
        if (background != null) {
            u81 u81 = u81.a;
            background.x.setValue(background, v81.y[0], u81);
        }
        v81 background2 = getBackground();
        if (background2 != null) {
            background2.stop();
        }
    }

    public final q81 getIndicatorState() {
        return (q81) this.G0.getValue(this, H0[0]);
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        v81 background = getBackground();
        if (background != null) {
            background.start();
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        v81 background = getBackground();
        if (background != null) {
            background.stop();
        }
    }

    public final void setIndicatorState(q81 q81) {
        this.G0.setValue(this, H0[0], q81);
    }

    public final void setTime(CharSequence charSequence) {
        this.F0.setText(charSequence);
    }

    public final void setTitle(CharSequence charSequence) {
        this.E0.setText(charSequence);
    }

    public v81 getBackground() {
        Drawable background = super.getBackground();
        if (background instanceof v81) {
            return (v81) background;
        }
        return null;
    }
}
