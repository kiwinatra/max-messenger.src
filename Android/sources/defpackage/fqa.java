package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.properties.Delegates;
import kotlin.reflect.KProperty;

/* renamed from: fqa  reason: default package */
public final class fqa extends LinearLayout implements phf {
    public static final /* synthetic */ KProperty[] w;
    public final Lazy a;
    public final Lazy b;
    public final eqa c = new eqa(this, 0);
    public final eqa o;
    public final eqa v;

    static {
        Class<fqa> cls = fqa.class;
        w = new KProperty[]{rae.s(cls, "customTheme", "getCustomTheme()Lone/me/sdk/design/OneMeTheme;", 0), rae.s(cls, "mode", "getMode()Lone/me/sdk/uikit/common/buttontool/OneMeButtonTool$Mode;", 0), rae.s(cls, "appearance", "getAppearance()Lone/me/sdk/uikit/common/buttontool/OneMeButtonTool$Appearance;", 0)};
    }

    public fqa(Context context) {
        super(context, (AttributeSet) null);
        p35 p35 = new p35(context, 21);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.a = LazyKt.lazy(lazyThreadSafetyMode, p35);
        this.b = LazyKt.lazy(lazyThreadSafetyMode, new p35(context, 22));
        Delegates delegates = Delegates.INSTANCE;
        dqa dqa = dqa.a;
        this.o = new eqa(this, 1);
        cqa cqa = cqa.a;
        this.v = new eqa(this, 2);
        setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        setGravity(17);
        c(this, getAppearance());
        setClipToOutline(true);
        setOutlineProvider(new n04((float) MathKt.roundToInt(((float) 16) * vo4.c().getDisplayMetrics().density)));
        setClickable(true);
        setOrientation(1);
        addView(getIconView());
    }

    private final k2b getCurrentTheme() {
        k2b customTheme = getCustomTheme();
        return customTheme == null ? fu4.k.e(getContext()).f() : customTheme;
    }

    private final ImageView getIconView() {
        return (ImageView) this.a.getValue();
    }

    /* access modifiers changed from: private */
    public final AppCompatTextView getTextView() {
        return (AppCompatTextView) this.b.getValue();
    }

    public final void b() {
        invalidate();
        requestLayout();
    }

    public final void c(View view, cqa cqa) {
        RippleDrawable rippleDrawable;
        int ordinal = cqa.ordinal();
        js9 js9 = fu4.k;
        if (ordinal == 0) {
            js9.f(view);
            rippleDrawable = new RippleDrawable(ColorStateList.valueOf(getCurrentTheme().b().a.f), new ColorDrawable(getCurrentTheme().c().f), new ColorDrawable(-65536));
        } else if (ordinal == 1) {
            rippleDrawable = new RippleDrawable(ColorStateList.valueOf(js9.f(view).b().a.c), new ColorDrawable(getCurrentTheme().b().a.c), new ColorDrawable(-65536));
        } else {
            throw new NoWhenBranchMatchedException();
        }
        view.setBackground(rippleDrawable);
    }

    public final cqa getAppearance() {
        return (cqa) this.v.getValue(this, w[2]);
    }

    public final k2b getCustomTheme() {
        return (k2b) this.c.getValue(this, w[0]);
    }

    public final dqa getMode() {
        return (dqa) this.o.getValue(this, w[1]);
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int max = Math.max(getMeasuredHeight(), MathKt.roundToInt(((float) 60) * vo4.c().getDisplayMetrics().density));
        if (getMeasuredWidth() < max) {
            setMeasuredDimension(max, max);
        } else {
            setMeasuredDimension(getMeasuredWidth(), max);
        }
    }

    public final void onThemeChanged(k2b k2b) {
        getIconView().setImageTintList(ColorStateList.valueOf(getCurrentTheme().getIcon().f));
        Drawable background = getIconView().getBackground();
        if (background != null) {
            background.setTint(getCurrentTheme().getIcon().f);
        }
        c(this, getAppearance());
        getTextView().setTextColor(getCurrentTheme().getText().e);
    }

    public final void setAppearance(cqa cqa) {
        this.v.setValue(this, w[2], cqa);
    }

    public final void setCustomTheme(k2b k2b) {
        this.c.setValue(this, w[0], k2b);
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        setAlpha(z ? 1.0f : 0.48f);
    }

    public final void setIcon(Drawable drawable) {
        if (getIconView().getDrawable() != drawable) {
            if (drawable != null) {
                drawable.setTint(fu4.k.e(getContext()).f().getIcon().f);
            }
            getIconView().setImageDrawable(drawable);
            b();
        }
    }

    public final void setMode(dqa dqa) {
        this.o.setValue(this, w[1], dqa);
    }

    public final void setText(CharSequence charSequence) {
        if (getMode() == dqa.b && !Intrinsics.areEqual((Object) getTextView().getText(), (Object) charSequence)) {
            getTextView().setText(charSequence);
            if (getTextView().getParent() == null) {
                addView(getTextView());
            }
            b();
        }
    }

    public final void setText(int i) {
        setText((CharSequence) getContext().getString(i));
    }

    public final void setIcon(int i) {
        setIcon(ew3.b(getContext(), i));
    }
}
