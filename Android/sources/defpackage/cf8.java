package defpackage;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.math.MathKt;

/* renamed from: cf8  reason: default package */
public final class cf8 extends LinearLayout implements bif {
    public final AppCompatTextView a;
    public boolean b;
    public ObjectAnimator c;

    public cf8(Context context) {
        super(context, (AttributeSet) null, 0);
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(zdc.markdown_dot_size);
        int i = zdc.markdown_button_size;
        setOrientation(0);
        setGravity(17);
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, (AttributeSet) null, 0);
        appCompatTextView.setIncludeFontPadding(false);
        appCompatTextView.setTextAlignment(6);
        appCompatTextView.setTextSize(14.0f);
        appCompatTextView.setLineHeight(MathKt.roundToInt(((float) 14) * vo4.c().getDisplayMetrics().density));
        appCompatTextView.setGravity(17);
        appCompatTextView.setPaddingRelative(MathKt.roundToInt(((float) 16) * vo4.c().getDisplayMetrics().density), appCompatTextView.getPaddingTop(), appCompatTextView.getPaddingEnd(), appCompatTextView.getPaddingBottom());
        this.a = appCompatTextView;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        layoutParams.gravity = 17;
        layoutParams.setMarginEnd(MathKt.roundToInt(((float) 26) * vo4.c().getDisplayMetrics().density));
        Unit unit = Unit.INSTANCE;
        addView(appCompatTextView, layoutParams);
        View view = new View(context, (AttributeSet) null, 0);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        iq.a0(shapeDrawable, -1);
        view.setBackground(shapeDrawable);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(new LinearLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize));
        layoutParams2.gravity = 17;
        layoutParams2.setMarginEnd((getContext().getResources().getDimensionPixelSize(i) - dimensionPixelSize) / 2);
        addView(view, layoutParams2);
        if (isInEditMode()) {
            appCompatTextView.setText(StringsKt__StringsJVMKt.repeat("s", 20));
            appCompatTextView.setTextColor(-1);
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, znc.MarkdownItemView);
        if (obtainStyledAttributes.hasValue(znc.MarkdownItemView_miv_title)) {
            setTitle(obtainStyledAttributes.getResourceId(znc.MarkdownItemView_miv_title, 0));
        }
        a(obtainStyledAttributes.getBoolean(znc.MarkdownItemView_miv_highlight_title, false), false);
        obtainStyledAttributes.recycle();
        c();
    }

    public final void a(boolean z, boolean z2) {
        this.b = z;
        Float valueOf = Float.valueOf(0.6f);
        Float valueOf2 = Float.valueOf(1.0f);
        wf wfVar = new wf(valueOf, valueOf2);
        if (!this.b) {
            wfVar = new wf(valueOf2, valueOf);
        }
        float alpha = getAlpha();
        Number number = wfVar.b;
        if (alpha != number.floatValue()) {
            if (isInEditMode() || !z2 || kne.s(getContext()).p()) {
                setAlpha(number.floatValue());
                invalidate();
                return;
            }
            ch s = kne.s(getContext());
            ObjectAnimator objectAnimator = this.c;
            if (objectAnimator != null && objectAnimator.isRunning()) {
                ObjectAnimator objectAnimator2 = this.c;
                if (objectAnimator2 != null) {
                    objectAnimator2.cancel();
                }
                this.c = null;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, LinearLayout.ALPHA, new float[]{wfVar.a.floatValue(), number.floatValue()});
            this.c = ofFloat;
            ofFloat.setDuration(s.a.b());
            boolean z3 = this.b;
            ug ugVar = s.a;
            ofFloat.setInterpolator(z3 ? ugVar.d() : ugVar.l());
            ofFloat.addListener(new tf(3, this, wfVar));
            ofFloat.start();
        }
    }

    public final void c() {
        scf scf;
        if (!isInEditMode()) {
            if (isInEditMode()) {
                scf = vi4.f0;
            } else {
                Context context = getContext();
                Lazy lazy = scf.b0;
                scf = j4b.k0(context);
            }
            this.a.setTextColor(scf.m);
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ObjectAnimator objectAnimator = this.c;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    public final void setTitle(int i) {
        this.a.setText(i);
    }
}
