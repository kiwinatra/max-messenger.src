package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.math.MathKt;
import one.me.sdk.richvector.EnhancedVectorDrawable;

/* renamed from: h0g  reason: default package */
public final class h0g extends FrameLayout implements phf {
    public f0g a;
    public final AppCompatImageView b;
    public final AppCompatTextView c;
    public final AppCompatImageView o;

    public h0g(f0g f0g, Context context) {
        super(context);
        this.a = f0g;
        AppCompatImageView appCompatImageView = new AppCompatImageView(context, (AttributeSet) null);
        appCompatImageView.setId(View.generateViewId());
        float f = (float) 36;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density));
        float f2 = (float) 12;
        layoutParams.setMarginStart(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2));
        layoutParams.gravity = 8388627;
        appCompatImageView.setLayoutParams(layoutParams);
        int roundToInt = MathKt.roundToInt(((float) 6) * vo4.c().getDisplayMetrics().density);
        appCompatImageView.setPadding(roundToInt, roundToInt, roundToInt, roundToInt);
        this.b = appCompatImageView;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, (AttributeSet) null);
        appCompatTextView.setId(View.generateViewId());
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams2.setMarginEnd(MathKt.roundToInt(((float) 52) * vo4.c().getDisplayMetrics().density));
        layoutParams2.gravity = 16;
        appCompatTextView.setLayoutParams(layoutParams2);
        puf.i.b(appCompatTextView, uy4.b);
        this.c = appCompatTextView;
        AppCompatImageView appCompatImageView2 = new AppCompatImageView(context, (AttributeSet) null);
        appCompatImageView2.setId(View.generateViewId());
        float f3 = (float) 28;
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f3), MathKt.roundToInt(f3 * vo4.c().getDisplayMetrics().density));
        layoutParams3.setMarginEnd(MathKt.roundToInt(f2 * vo4.c().getDisplayMetrics().density));
        layoutParams3.gravity = 8388629;
        appCompatImageView2.setLayoutParams(layoutParams3);
        this.o = appCompatImageView2;
        setId(View.generateViewId());
        setLayoutParams(new FrameLayout.LayoutParams(-1, MathKt.roundToInt(((float) 48) * vo4.c().getDisplayMetrics().density)));
        addView(appCompatImageView);
        addView(appCompatTextView);
        addView(appCompatImageView2);
        onThemeChanged(fu4.k.e(getContext()).f());
    }

    public final void onThemeChanged(k2b k2b) {
        setBackground(new RippleDrawable(ColorStateList.valueOf(fu4.k.e(getContext()).f().b().a.f), new ColorDrawable(k2b.c().f), new ColorDrawable(-65536)));
        int ordinal = this.a.ordinal();
        AppCompatImageView appCompatImageView = this.o;
        AppCompatTextView appCompatTextView = this.c;
        AppCompatImageView appCompatImageView2 = this.b;
        if (ordinal == 0 || ordinal == 1) {
            appCompatImageView2.setImageTintList(ColorStateList.valueOf(k2b.getIcon().f));
            appCompatTextView.setTextColor(k2b.getText().e);
            appCompatImageView.setImageTintList(ColorStateList.valueOf(k2b.getIcon().f));
        } else if (ordinal == 2) {
            k2b.getIcon().getClass();
            appCompatImageView2.setImageTintList(ColorStateList.valueOf(-16745729));
            k2b.getText().getClass();
            appCompatTextView.setTextColor(-16745729);
            k2b.getIcon().getClass();
            appCompatImageView.setImageTintList(ColorStateList.valueOf(-16745729));
        } else if (ordinal == 3) {
            appCompatImageView2.setImageTintList(ColorStateList.valueOf(k2b.getIcon().f));
            appCompatTextView.setTextColor(k2b.getText().e);
            Drawable drawable = appCompatImageView.getDrawable();
            EnhancedVectorDrawable enhancedVectorDrawable = drawable instanceof EnhancedVectorDrawable ? (EnhancedVectorDrawable) drawable : null;
            if (enhancedVectorDrawable != null) {
                hi7.Y(enhancedVectorDrawable, "background", k2b.c().a.f);
                hi7.Y(enhancedVectorDrawable, "plus", k2b.getIcon().b);
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final void setActionMenuIconClickListener(Function1<? super View, Unit> function1) {
        ct.G(this.o, 300, new kqc((Function1) function1, (Object) this, 21));
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void setOnDragIconTouchListener(Function2<? super View, ? super MotionEvent, Boolean> function2) {
        this.b.setOnTouchListener(new ng1(11, function2));
    }

    public final void setTitle(CharSequence charSequence) {
        this.c.setText(charSequence);
    }

    public final void setType(f0g f0g) {
        int i;
        this.a = f0g;
        AppCompatImageView appCompatImageView = this.b;
        f0g f0g2 = f0g.o;
        int i2 = 0;
        appCompatImageView.setVisibility(f0g != f0g2 ? 0 : 8);
        int ordinal = f0g.ordinal();
        if (ordinal == 0) {
            i = cad.p1;
        } else if (ordinal == 1) {
            i = nad.o1;
        } else if (ordinal == 2) {
            i = nad.n;
        } else if (ordinal == 3) {
            i = 0;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        appCompatImageView.setImageResource(i);
        ((FrameLayout.LayoutParams) this.c.getLayoutParams()).setMarginStart(f0g != f0g2 ? MathKt.roundToInt(((float) 60) * vo4.c().getDisplayMetrics().density) : MathKt.roundToInt(((float) 12) * vo4.c().getDisplayMetrics().density));
        AppCompatImageView appCompatImageView2 = this.o;
        if (!(f0g == f0g.b || f0g == f0g2)) {
            i2 = 8;
        }
        appCompatImageView2.setVisibility(i2);
        int ordinal2 = f0g.ordinal();
        js9 js9 = fu4.k;
        if (ordinal2 == 1) {
            int i3 = js9.e(appCompatImageView2.getContext()).f().b().a.f;
            ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
            shapeDrawable.getPaint().setColor(-1);
            appCompatImageView2.setBackground(new RippleDrawable(ColorStateList.valueOf(i3), (Drawable) null, shapeDrawable));
            appCompatImageView2.setImageResource(cad.a);
        } else if (ordinal2 == 3) {
            appCompatImageView2.setImageDrawable(new EnhancedVectorDrawable(appCompatImageView2.getContext(), ffc.ic_add_button_28));
        }
        onThemeChanged(js9.e(getContext()).f());
    }
}
