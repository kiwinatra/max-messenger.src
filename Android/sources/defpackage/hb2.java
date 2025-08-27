package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.math.MathKt;
import one.me.sdk.uikit.common.avatar.OneMeAvatarView;

/* renamed from: hb2  reason: default package */
public final class hb2 extends ConstraintLayout implements phf {
    public final Lazy E0;
    public final Lazy F0;
    public final OneMeAvatarView G0;
    public final AppCompatTextView H0;
    public final AppCompatImageView I0;
    public final ImageView J0;

    public hb2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        gb2 gb2 = new gb2(context, this, 0);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.E0 = LazyKt.lazy(lazyThreadSafetyMode, gb2);
        Lazy lazy = LazyKt.lazy(lazyThreadSafetyMode, new gb2(context, this, 1));
        this.F0 = lazy;
        OneMeAvatarView oneMeAvatarView = new OneMeAvatarView(context, (AttributeSet) null);
        oneMeAvatarView.setId(jxa.F);
        float f = (float) 40;
        oneMeAvatarView.setLayoutParams(new ViewGroup.LayoutParams(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density)));
        oneMeAvatarView.setAvatarShape(goa.a);
        addView(oneMeAvatarView);
        this.G0 = oneMeAvatarView;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, (AttributeSet) null);
        appCompatTextView.setId(jxa.L);
        appCompatTextView.setLayoutParams(new ViewGroup.LayoutParams(0, -2));
        appCompatTextView.setTextAlignment(2);
        appCompatTextView.setMaxLines(1);
        appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
        ogf ogf = tr2.a;
        puf.m.b(appCompatTextView, uy4.b);
        addView(appCompatTextView);
        this.H0 = appCompatTextView;
        AppCompatImageView appCompatImageView = new AppCompatImageView(context, (AttributeSet) null);
        appCompatImageView.setId(jxa.H);
        float f2 = (float) 24;
        appCompatImageView.setLayoutParams(new ViewGroup.LayoutParams(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2)));
        appCompatImageView.setImageDrawable(ew3.b(appCompatImageView.getContext(), cad.v));
        addView(appCompatImageView);
        this.I0 = appCompatImageView;
        ImageView imageView = new ImageView(context);
        imageView.setId(jxa.J);
        imageView.setLayoutParams(new ViewGroup.LayoutParams(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2), MathKt.roundToInt(f2 * vo4.c().getDisplayMetrics().density)));
        imageView.setImageDrawable(ew3.b(imageView.getContext(), cad.v0));
        addView(imageView);
        this.J0 = imageView;
        setLayoutParams(new ViewGroup.LayoutParams(-1, MathKt.roundToInt(((float) 48) * vo4.c().getDisplayMetrics().density)));
        L();
        if (lazy.isInitialized()) {
            aya aya = (aya) lazy.getValue();
            int roundToInt = MathKt.roundToInt(((float) 20) * vo4.c().getDisplayMetrics().density);
            ViewGroup.LayoutParams layoutParams = aya.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = roundToInt;
                layoutParams.height = roundToInt;
                aya.setLayoutParams(layoutParams);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        }
        requestLayout();
        onThemeChanged(fu4.k.e(getContext()).f());
    }

    public final void L() {
        ila t;
        float f;
        pj3 h = ct.h(this);
        OneMeAvatarView oneMeAvatarView = this.G0;
        ni0 ni0 = new ni0((Object) h, oneMeAvatarView.getId(), 4);
        float f2 = (float) 12;
        ni0.P(0).e(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2));
        ni0.R(0);
        ni0.b(0);
        Lazy lazy = this.E0;
        boolean isInitialized = lazy.isInitialized();
        AppCompatImageView appCompatImageView = this.I0;
        if (isInitialized) {
            ni0 ni02 = new ni0((Object) h, ((AppCompatTextView) lazy.getValue()).getId(), 4);
            ni02.O(oneMeAvatarView.getId()).e(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2));
            ni02.R(oneMeAvatarView.getId());
            ni02.v(appCompatImageView.getId()).e(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2));
            ((AppCompatTextView) lazy.getValue()).getId();
        } else {
            Lazy lazy2 = this.F0;
            ni0 ni03 = new ni0((Object) h, ((aya) lazy2.getValue()).getId(), 4);
            ni03.O(oneMeAvatarView.getId()).e(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2));
            ni03.R(0).e(MathKt.roundToInt(((float) 6) * vo4.c().getDisplayMetrics().density));
            ((aya) lazy2.getValue()).getId();
        }
        ni0 ni04 = new ni0((Object) h, this.H0.getId(), 4);
        ni04.O(oneMeAvatarView.getId()).e(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2));
        ni04.b(oneMeAvatarView.getId());
        ni04.v(appCompatImageView.getId()).e(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2));
        ni0 ni05 = new ni0((Object) h, appCompatImageView.getId(), 4);
        ImageView imageView = this.J0;
        if (imageView.getVisibility() == 0) {
            t = ni05.v(imageView.getId());
            f = vo4.c().getDisplayMetrics().density;
        } else {
            t = ni05.t(0);
            f = vo4.c().getDisplayMetrics().density;
        }
        tr1.u(f2, f, t);
        ni05.R(0);
        ni05.b(0);
        if (imageView.getVisibility() == 0) {
            ni0 ni06 = new ni0((Object) h, imageView.getId(), 4);
            ni06.t(0).e(MathKt.roundToInt(f2 * vo4.c().getDisplayMetrics().density));
            ni06.R(0);
            ni06.b(0);
        }
        h.a(this);
    }

    public final void onThemeChanged(k2b k2b) {
        int i = k2b.b().a.c;
        setBackground(new RippleDrawable(ColorStateList.valueOf(i), (Drawable) null, new ColorDrawable(-65536)));
        Lazy lazy = this.E0;
        if (lazy.isInitialized()) {
            k2b.getText().getClass();
            ((AppCompatTextView) lazy.getValue()).setTextColor(-16745729);
        }
        this.H0.setTextColor(k2b.getText().f);
        this.I0.setImageTintList(ColorStateList.valueOf(k2b.getIcon().f));
        this.J0.setImageTintList(ColorStateList.valueOf(k2b.getIcon().f));
    }

    public final void setChatTitle(String str) {
        this.H0.setText(str);
        L();
    }

    public final void setLink(String str) {
        AppCompatTextView appCompatTextView = (AppCompatTextView) this.E0.getValue();
        appCompatTextView.setText(str);
        appCompatTextView.setVisibility(0);
        Lazy lazy = this.F0;
        if (lazy.isInitialized()) {
            ((aya) lazy.getValue()).setVisibility(8);
        }
        L();
    }

    public final void setLoading(boolean z) {
        Lazy lazy = this.F0;
        Lazy lazy2 = this.E0;
        if (z) {
            if (lazy2.isInitialized()) {
                ((AppCompatTextView) lazy2.getValue()).setVisibility(8);
            }
            ((aya) lazy.getValue()).setVisibility(0);
        } else {
            if (lazy2.isInitialized()) {
                ((AppCompatTextView) lazy2.getValue()).setVisibility(0);
            }
            ((aya) lazy.getValue()).setVisibility(8);
        }
        L();
    }

    public final void setOnMoreActionsClickListener(Function0<Unit> function0) {
        ct.G(this.J0, 300, new e7(3, function0));
    }
}
