package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewStub;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.math.MathKt;
import kotlin.text.StringsKt;
import one.me.sdk.uikit.common.avatar.OneMeAvatarView;

/* renamed from: kl3  reason: default package */
public final class kl3 extends ConstraintLayout implements phf {
    public final OneMeAvatarView E0;
    public final AppCompatTextView F0;
    public final AppCompatTextView G0;
    public final Lazy H0;
    public final Lazy I0;
    public final Lazy J0;
    public final ViewStub K0;
    public final ViewStub L0;
    public final ViewStub M0;
    public er7 N0;
    public boolean O0;
    public long P0 = LongCompanionObject.MAX_VALUE;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public kl3(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Context context2 = context;
        il3 il3 = new il3(context2, this, 0);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.H0 = LazyKt.lazy(lazyThreadSafetyMode, il3);
        this.I0 = LazyKt.lazy(lazyThreadSafetyMode, new il3(context2, this, 1));
        this.J0 = LazyKt.lazy(lazyThreadSafetyMode, new il3(context2, this, 2));
        setLayoutParams(new fj3(-1, -2));
        float f = (float) 12;
        float f2 = (float) 10;
        setPadding(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(f2 * vo4.c().getDisplayMetrics().density));
        setBackground(getBackgroundDrawable());
        setOnLongClickListener(new z20(6, this));
        ct.G(this, 300, new jl3(this, 0));
        OneMeAvatarView oneMeAvatarView = new OneMeAvatarView(context2, (AttributeSet) null);
        oneMeAvatarView.setId(dad.r);
        oneMeAvatarView.setAvatarShape(goa.a);
        this.E0 = oneMeAvatarView;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context2, (AttributeSet) null);
        appCompatTextView.setId(dad.w);
        puf.i.b(appCompatTextView, uy4.b);
        appCompatTextView.setTextColor(getTitleText());
        appCompatTextView.setMaxLines(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        appCompatTextView.setEllipsize(truncateAt);
        this.F0 = appCompatTextView;
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(context2, (AttributeSet) null);
        appCompatTextView2.setId(dad.s);
        puf.l.b(appCompatTextView2, uy4.b);
        appCompatTextView2.setTextColor(getDescriptionColor());
        appCompatTextView2.setMaxLines(1);
        appCompatTextView2.setEllipsize(truncateAt);
        this.G0 = appCompatTextView2;
        ViewStub viewStub = new ViewStub(context2);
        viewStub.setId(dad.u);
        this.K0 = viewStub;
        ViewStub viewStub2 = new ViewStub(context2);
        viewStub2.setId(dad.t);
        this.L0 = viewStub2;
        ViewStub viewStub3 = new ViewStub(context2);
        viewStub3.setId(dad.v);
        this.M0 = viewStub3;
        float f3 = (float) 40;
        addView(oneMeAvatarView, MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f3), MathKt.roundToInt(f3 * vo4.c().getDisplayMetrics().density));
        addView(appCompatTextView, 0, -2);
        addView(appCompatTextView2, 0, -2);
        addView(viewStub);
        addView(viewStub2);
        addView(viewStub3);
        pj3 h = ct.h(this);
        int id = oneMeAvatarView.getId();
        h.e(id, 3, 0, 3);
        h.e(id, 6, 0, 6);
        h.e(id, 4, 0, 4);
        int id2 = appCompatTextView.getId();
        h.e(id2, 3, oneMeAvatarView.getId(), 3);
        h.e(id2, 6, oneMeAvatarView.getId(), 7);
        new ila(h, 6, id2, 4).e(MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density));
        h.e(id2, 7, viewStub.getId(), 6);
        float f4 = (float) 8;
        new ila(h, 7, id2, 4).e(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f4));
        h.e(id2, 4, appCompatTextView2.getId(), 3);
        h.j(id2).d.W = 2;
        h.j(id2).d.l0 = true;
        int id3 = appCompatTextView2.getId();
        h.e(id3, 3, appCompatTextView.getId(), 4);
        new ila(h, 3, id3, 4).e(MathKt.roundToInt(((float) 4) * vo4.c().getDisplayMetrics().density));
        h.e(id3, 6, appCompatTextView.getId(), 6);
        h.e(id3, 7, appCompatTextView.getId(), 7);
        h.e(id3, 4, oneMeAvatarView.getId(), 4);
        h.j(id3).d.l0 = true;
        int id4 = viewStub.getId();
        h.e(id4, 3, 0, 3);
        h.e(id4, 7, viewStub2.getId(), 6);
        tr1.u(f4, vo4.c().getDisplayMetrics().density, new ila(h, 7, id4, 4));
        h.e(id4, 4, 0, 4);
        int id5 = viewStub2.getId();
        h.e(id5, 3, 0, 3);
        h.e(id5, 7, viewStub3.getId(), 6);
        h.e(id5, 4, 0, 4);
        int id6 = viewStub3.getId();
        h.e(id6, 3, 0, 3);
        h.e(id6, 7, 0, 7);
        h.e(id6, 4, 0, 4);
        h.a(this);
    }

    public static AppCompatImageView L(Context context, kl3 kl3) {
        AppCompatImageView appCompatImageView = new AppCompatImageView(context, (AttributeSet) null);
        float f = (float) 40;
        appCompatImageView.setLayoutParams(new fj3(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density)));
        int roundToInt = MathKt.roundToInt(((float) 8) * vo4.c().getDisplayMetrics().density);
        appCompatImageView.setPadding(roundToInt, roundToInt, roundToInt, roundToInt);
        appCompatImageView.setImageResource(cad.c0);
        appCompatImageView.setBackground(kl3.getRippleDrawableButton());
        appCompatImageView.setContentDescription(context.getString(ead.a));
        appCompatImageView.setVisibility(8);
        appCompatImageView.setImageTintList(ColorStateList.valueOf(fu4.k.e(appCompatImageView.getContext()).f().getIcon().f));
        ct.G(appCompatImageView, 300, new jl3(kl3, 1));
        return appCompatImageView;
    }

    public static AppCompatTextView M(Context context, kl3 kl3) {
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, (AttributeSet) null);
        appCompatTextView.setLayoutParams(new fj3(-2, -2));
        puf.o.b(appCompatTextView, uy4.b);
        appCompatTextView.setTextColor(kl3.getDescriptionColor());
        return appCompatTextView;
    }

    public static AppCompatImageView N(Context context, kl3 kl3) {
        AppCompatImageView appCompatImageView = new AppCompatImageView(context, (AttributeSet) null);
        float f = (float) 40;
        appCompatImageView.setLayoutParams(new fj3(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density)));
        appCompatImageView.setImageResource(cad.m2);
        int roundToInt = MathKt.roundToInt(((float) 8) * vo4.c().getDisplayMetrics().density);
        appCompatImageView.setPadding(roundToInt, roundToInt, roundToInt, roundToInt);
        appCompatImageView.setBackground(kl3.getRippleDrawableButton());
        appCompatImageView.setContentDescription(context.getString(ead.b));
        appCompatImageView.setVisibility(8);
        appCompatImageView.setImageTintList(ColorStateList.valueOf(fu4.k.e(appCompatImageView.getContext()).f().getIcon().f));
        ct.G(appCompatImageView, 300, new jl3(kl3, 2));
        return appCompatImageView;
    }

    private final AppCompatImageView getAudioCallButton() {
        return (AppCompatImageView) this.I0.getValue();
    }

    private final RippleDrawable getBackgroundDrawable() {
        int i = fu4.k.e(getContext()).f().b().a.f;
        return new RippleDrawable(ColorStateList.valueOf(i), (Drawable) null, new ColorDrawable(-1));
    }

    private final int getDescriptionColor() {
        return fu4.k.e(getContext()).f().getText().f;
    }

    private final RippleDrawable getRippleDrawableButton() {
        int i = fu4.k.e(getContext()).f().b().a.f;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.getPaint().setColor(-1);
        return new RippleDrawable(ColorStateList.valueOf(i), (Drawable) null, shapeDrawable);
    }

    private final AppCompatTextView getTimeTextView() {
        return (AppCompatTextView) this.H0.getValue();
    }

    private final int getTitleText() {
        boolean z = this.O0;
        js9 js9 = fu4.k;
        return z ? js9.e(getContext()).f().getText().b : js9.e(getContext()).f().getText().e;
    }

    private final AppCompatImageView getVideoCallButton() {
        return (AppCompatImageView) this.J0.getValue();
    }

    public final void O(boolean z) {
        ViewStub viewStub = this.L0;
        if (y7e.I(viewStub) || z) {
            y7e.C(viewStub, getAudioCallButton(), (Function0) null);
            getAudioCallButton().setVisibility(z ? 0 : 8);
        }
    }

    public final void P(boolean z) {
        ViewStub viewStub = this.M0;
        if (y7e.I(viewStub) || z) {
            y7e.C(viewStub, getVideoCallButton(), (Function0) null);
            getVideoCallButton().setVisibility(z ? 0 : 8);
        }
    }

    public final void Q(boolean z) {
        this.O0 = z;
        this.F0.setTextColor(getTitleText());
    }

    public final void R(long j, CharSequence charSequence, String str) {
        if (charSequence == null) {
            charSequence = "";
        }
        gd0 gd0 = new gd0(charSequence, j);
        OneMeAvatarView oneMeAvatarView = this.E0;
        oneMeAvatarView.f(gd0, true);
        oneMeAvatarView.setAvatarUrl(str != null ? str.toString() : null);
    }

    public final void onThemeChanged(k2b k2b) {
        this.F0.setTextColor(getTitleText());
        getTimeTextView().setTextColor(getDescriptionColor());
        this.G0.setTextColor(getDescriptionColor());
        getAudioCallButton().setBackground(getRippleDrawableButton());
        getVideoCallButton().setBackground(getRippleDrawableButton());
        setBackground(getBackgroundDrawable());
        getAudioCallButton().setImageTintList(ColorStateList.valueOf(k2b.getIcon().f));
        getVideoCallButton().setImageTintList(ColorStateList.valueOf(k2b.getIcon().f));
    }

    public final void setAvatarOverlay(be0 be0) {
        this.E0.setCustomOverlay(be0);
    }

    public final void setAvatarPlaceholder(Drawable drawable) {
        OneMeAvatarView.g(this.E0, drawable, (joa) null, 30);
    }

    public final void setDescription(CharSequence charSequence) {
        this.G0.setText(charSequence);
    }

    public final void setTime(CharSequence charSequence) {
        ViewStub viewStub = this.K0;
        if (y7e.I(viewStub) || !StringsKt.isBlank(charSequence)) {
            y7e.C(viewStub, getTimeTextView(), (Function0) null);
            getTimeTextView().setText(charSequence);
        }
    }

    public final void setTitle(CharSequence charSequence) {
        this.F0.setText(charSequence);
    }
}
