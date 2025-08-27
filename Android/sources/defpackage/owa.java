package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.math.MathKt;
import kotlin.text.StringsKt;
import kotlin.uuid.Uuid;
import one.me.sdk.richvector.EnhancedVectorDrawable;

/* renamed from: owa  reason: default package */
public final class owa extends ConstraintLayout implements phf {
    public final int E0 = getContext().getResources().getDimensionPixelSize(kya.e);
    public final int F0 = getContext().getResources().getDimensionPixelSize(kya.d);
    public final int G0 = getContext().getResources().getDimensionPixelSize(kya.b);
    public final Lazy H0;
    public final Lazy I0;
    public final Lazy J0;
    public final Lazy K0;
    public final LayerDrawable L0;
    public final Lazy M0;
    public final View N0;
    public final d77 O0;
    public final GradientDrawable P0;
    public final Lazy Q0;
    public final Lazy R0;
    public nwa S0;

    public owa(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mwa mwa = new mwa(context, this, 0);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.H0 = LazyKt.lazy(lazyThreadSafetyMode, mwa);
        this.I0 = LazyKt.lazy(lazyThreadSafetyMode, new mwa(context, this, 1));
        this.J0 = LazyKt.lazy(lazyThreadSafetyMode, new p35(context, 27));
        this.K0 = LazyKt.lazy(lazyThreadSafetyMode, new mwa(context, this, 2));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setOrientation(GradientDrawable.Orientation.TL_BR);
        gradientDrawable.setColors(new int[]{452984831, 16777215}, new float[]{c44.DEFAULT_ASPECT_RATIO, 1.0f});
        gradientDrawable.setGradientType(0);
        Unit unit = Unit.INSTANCE;
        this.L0 = new LayerDrawable(new Drawable[]{gradientDrawable, ew3.b(getContext(), cad.H)});
        this.M0 = LazyKt.lazy(lazyThreadSafetyMode, new mwa(context, this, 3));
        View view = new View(context);
        view.setId(View.generateViewId());
        fj3 fj3 = new fj3(1, 1);
        fj3.i = 0;
        fj3.v = 0;
        fj3.l = 0;
        fj3.t = 0;
        view.setLayoutParams(fj3);
        this.N0 = view;
        d77 d77 = new d77(context, new oo9(14));
        d77.setId(View.generateViewId());
        float f = (float) Uuid.SIZE_BITS;
        fj3 fj32 = new fj3(0, MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f));
        fj32.i = 0;
        fj32.l = 0;
        d77.setLayoutParams(fj32);
        d77.setInitialRadius$common_release(vo4.c().getDisplayMetrics().density * 49.0f);
        this.O0 = d77;
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setOrientation(GradientDrawable.Orientation.BL_TR);
        this.P0 = gradientDrawable2;
        this.Q0 = LazyKt.lazy(lazyThreadSafetyMode, new p35(context, 28));
        this.R0 = LazyKt.lazy(lazyThreadSafetyMode, new mwa(this, context));
        this.S0 = nwa.a;
        setClipToOutline(true);
        setOutlineProvider(new n04((float) getContext().getResources().getDimensionPixelSize(kya.a)));
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = -1;
            layoutParams.height = MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f);
            setMaxHeight(MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density));
        } else {
            layoutParams = new ViewGroup.LayoutParams(-1, MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f));
            setMaxHeight(MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density));
        }
        setLayoutParams(layoutParams);
        setBackground(gradientDrawable2);
        f6e.c(this, view, (Integer) null);
        f6e.c(this, d77, (Integer) null);
        onThemeChanged(fu4.k.e(context).f());
    }

    public static ImageView L(owa owa, Context context) {
        ImageView imageView = new ImageView(context);
        imageView.setId(dad.W);
        imageView.setImageDrawable(owa.getCloseBadgeDrawable());
        float f = (float) 24;
        fj3 fj3 = new fj3(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density));
        fj3.i = 0;
        fj3.v = 0;
        int i = owa.F0;
        fj3.setMarginEnd(i);
        fj3.topMargin = i;
        imageView.setLayoutParams(fj3);
        return imageView;
    }

    private final Drawable getChevronDrawable() {
        return (Drawable) this.R0.getValue();
    }

    private final EnhancedVectorDrawable getCloseBadgeDrawable() {
        return (EnhancedVectorDrawable) this.Q0.getValue();
    }

    public final void M(Drawable drawable, int i, int i2) {
        d77 d77 = this.O0;
        Lazy lazy = this.M0;
        Lazy lazy2 = this.J0;
        if (drawable != null) {
            FrameLayout frameLayout = (FrameLayout) lazy.getValue();
            frameLayout.setVisibility(0);
            ImageView imageView = (ImageView) lazy2.getValue();
            imageView.setVisibility(0);
            imageView.setImageDrawable(drawable);
            d77.setIcon$common_release(drawable);
            f6e.c(this, frameLayout, (Integer) null);
            f6e.c(this, imageView, (Integer) null);
            N();
        } else if (lazy2.isInitialized()) {
            ((FrameLayout) lazy.getValue()).setVisibility(8);
            ImageView imageView2 = (ImageView) lazy2.getValue();
            imageView2.setVisibility(8);
            imageView2.setImageDrawable((Drawable) null);
            d77.setIcon$common_release((Drawable) null);
            N();
        }
    }

    public final void N() {
        int i;
        int i2;
        int i3;
        Lazy lazy = this.H0;
        boolean isInitialized = lazy.isInitialized();
        Lazy lazy2 = this.I0;
        int i4 = -1;
        Lazy lazy3 = this.M0;
        if (isInitialized) {
            View view = (View) lazy.getValue();
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                fj3 fj3 = (fj3) layoutParams;
                if (y7e.L(lazy3)) {
                    i2 = ((FrameLayout) lazy3.getValue()).getId();
                } else {
                    fj3.v = 0;
                    i2 = -1;
                }
                fj3.u = i2;
                if (y7e.L(lazy2)) {
                    fj3.topMargin = MathKt.roundToInt(((float) 26) * vo4.c().getDisplayMetrics().density);
                    i3 = ((TextView) lazy2.getValue()).getId();
                } else {
                    fj3.topMargin = 0;
                    fj3.l = 0;
                    i3 = -1;
                }
                fj3.k = i3;
                view.setLayoutParams(fj3);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
        }
        if (lazy2.isInitialized()) {
            View view2 = (View) lazy2.getValue();
            ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
            if (layoutParams2 != null) {
                fj3 fj32 = (fj3) layoutParams2;
                if (y7e.L(lazy)) {
                    fj32.topMargin = this.E0;
                    fj32.bottomMargin = MathKt.roundToInt(((float) 26) * vo4.c().getDisplayMetrics().density);
                    i = ((TextView) lazy.getValue()).getId();
                } else {
                    fj32.topMargin = 0;
                    fj32.bottomMargin = 0;
                    fj32.i = 0;
                    i = -1;
                }
                fj32.j = i;
                if (y7e.L(lazy3)) {
                    i4 = ((FrameLayout) lazy3.getValue()).getId();
                } else {
                    fj32.v = 0;
                }
                fj32.u = i4;
                view2.setLayoutParams(fj32);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
        }
        O();
    }

    public final void O() {
        d77 d77 = this.O0;
        ViewGroup.LayoutParams layoutParams = d77.getLayoutParams();
        if (layoutParams != null) {
            fj3 fj3 = (fj3) layoutParams;
            if (this.M0.isInitialized()) {
                fj3.t = this.N0.getId();
                fj3.setMarginStart(-MathKt.roundToInt(((float) 54) * vo4.c().getDisplayMetrics().density));
            }
            d77.setLayoutParams(fj3);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
    }

    public final void onDraw(Canvas canvas) {
        Drawable chevronDrawable = getChevronDrawable();
        if (chevronDrawable != null) {
            int ordinal = this.S0.ordinal();
            if (ordinal == 0) {
                Lazy lazy = this.H0;
                Layout layout = ((TextView) lazy.getValue()).getLayout();
                if (layout != null) {
                    int roundToInt = MathKt.roundToInt(((float) 16) * vo4.c().getDisplayMetrics().density);
                    chevronDrawable.setBounds(0, 0, roundToInt, roundToInt);
                    int lineCount = layout.getLineCount() - 1;
                    float lineRight = layout.getLineRight(lineCount);
                    int lineTop = layout.getLineTop(lineCount);
                    float x = ((TextView) lazy.getValue()).getX();
                    float y = ((TextView) lazy.getValue()).getY();
                    float lineBottom = ((float) ((layout.getLineBottom(lineCount) - lineTop) - roundToInt)) / 2.0f;
                    int save = canvas.save();
                    canvas.translate(Math.min(lineRight + x, x + ((float) ((TextView) lazy.getValue()).getWidth())), lineBottom + y + ((float) lineTop));
                    try {
                        chevronDrawable.draw(canvas);
                    } finally {
                        canvas.restoreToCount(save);
                    }
                }
            } else if (ordinal == 1) {
                Lazy lazy2 = this.I0;
                Layout layout2 = ((TextView) lazy2.getValue()).getLayout();
                if (layout2 != null) {
                    int roundToInt2 = MathKt.roundToInt(((float) 12) * vo4.c().getDisplayMetrics().density);
                    chevronDrawable.setBounds(0, 0, roundToInt2, roundToInt2);
                    int lineCount2 = layout2.getLineCount() - 1;
                    float lineRight2 = layout2.getLineRight(lineCount2);
                    int lineTop2 = layout2.getLineTop(lineCount2);
                    float x2 = ((TextView) lazy2.getValue()).getX();
                    float y2 = ((TextView) lazy2.getValue()).getY();
                    float lineBottom2 = ((float) ((layout2.getLineBottom(lineCount2) - lineTop2) - roundToInt2)) / 2.0f;
                    int save2 = canvas.save();
                    canvas.translate(Math.min(lineRight2 + x2, x2 + ((float) ((TextView) lazy2.getValue()).getWidth())), lineBottom2 + y2 + ((float) lineTop2));
                    try {
                        chevronDrawable.draw(canvas);
                    } finally {
                        canvas.restoreToCount(save2);
                    }
                }
            } else if (ordinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    public final void onThemeChanged(k2b k2b) {
        Lazy lazy = this.H0;
        if (lazy.isInitialized()) {
            k2b.getText().getClass();
            ((TextView) lazy.getValue()).setTextColor(-1);
        }
        Lazy lazy2 = this.I0;
        if (lazy2.isInitialized()) {
            k2b.getText().getClass();
            ((TextView) lazy2.getValue()).setTextColor(i8b.Y(0.7f, -1));
        }
        EnhancedVectorDrawable closeBadgeDrawable = getCloseBadgeDrawable();
        hi7.Y(closeBadgeDrawable, "cross", k2b.getIcon().h);
        hi7.Y(closeBadgeDrawable, "circle_background", k2b.c().a.c);
        Drawable chevronDrawable = getChevronDrawable();
        if (chevronDrawable != null) {
            chevronDrawable.setTint(k2b.getIcon().f);
        }
    }

    public final void setBannerClickListener(View.OnClickListener onClickListener) {
        setOnClickListener(onClickListener);
    }

    public final void setChevronAppearance(nwa nwa) {
        this.S0 = nwa;
        invalidate();
    }

    public final void setCloseButtonClickListener(View.OnClickListener onClickListener) {
        ((ImageView) this.K0.getValue()).setOnClickListener(onClickListener);
    }

    public final void setCloseButtonVisibility(boolean z) {
        Lazy lazy = this.K0;
        if (z || lazy.isInitialized()) {
            ImageView imageView = (ImageView) lazy.getValue();
            imageView.setVisibility(z ? 0 : 8);
            f6e.c(this, imageView, (Integer) null);
        }
    }

    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        O();
    }

    public final void setSubtitle(String str) {
        Lazy lazy = this.I0;
        if (str != null && !StringsKt.isBlank(str)) {
            TextView textView = (TextView) lazy.getValue();
            textView.setText(str);
            textView.setVisibility(0);
            f6e.c(this, textView, (Integer) null);
            N();
        } else if (lazy.isInitialized()) {
            TextView textView2 = (TextView) lazy.getValue();
            textView2.setVisibility(8);
            textView2.setText((CharSequence) null);
            N();
        }
    }

    public final void setTitle(String str) {
        Lazy lazy = this.H0;
        if (str != null && !StringsKt.isBlank(str)) {
            TextView textView = (TextView) lazy.getValue();
            textView.setText(str);
            textView.setVisibility(0);
            f6e.c(this, textView, (Integer) null);
            N();
        } else if (lazy.isInitialized()) {
            TextView textView2 = (TextView) lazy.getValue();
            textView2.setText((CharSequence) null);
            textView2.setVisibility(8);
            N();
        }
    }
}
