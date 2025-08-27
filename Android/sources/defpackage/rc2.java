package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;

/* renamed from: rc2  reason: default package */
public final class rc2 extends ConstraintLayout implements phf {
    public final TextView E0;
    public final TextView F0;
    public final GradientDrawable G0;
    public final AppCompatImageView H0;
    public p50 I0;
    public pm7 J0;
    public Long K0;

    public rc2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TextView textView = new TextView(context);
        fj3 fj3 = new fj3(-1, -2);
        float f = (float) 4;
        fj3.bottomMargin = MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f);
        textView.setLayoutParams(fj3);
        puf.i.b(textView, uy4.b);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        this.E0 = textView;
        TextView textView2 = new TextView(context);
        fj3 fj32 = new fj3(-1, -2);
        fj32.bottomMargin = MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density);
        textView2.setLayoutParams(fj32);
        puf.m.b(textView2, uy4.b);
        textView2.setMaxLines(2);
        textView2.setEllipsize(truncateAt);
        textView2.setVisibility(8);
        this.F0 = textView2;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setCornerRadius(vo4.c().getDisplayMetrics().density * 48.0f);
        js9 js9 = fu4.k;
        js9.e(getContext()).f().getIcon().getClass();
        gradientDrawable.setColor(ColorStateList.valueOf(-16745729));
        this.G0 = gradientDrawable;
        AppCompatImageView appCompatImageView = new AppCompatImageView(context, (AttributeSet) null);
        appCompatImageView.setId(jxa.i0);
        float f2 = (float) 40;
        appCompatImageView.setLayoutParams(new fj3(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2), MathKt.roundToInt(f2 * vo4.c().getDisplayMetrics().density)));
        appCompatImageView.setBackground(gradientDrawable);
        js9.e(appCompatImageView.getContext()).f().getIcon().getClass();
        appCompatImageView.setImageTintList(ColorStateList.valueOf(-1));
        appCompatImageView.setScaleType(ImageView.ScaleType.CENTER);
        this.H0 = appCompatImageView;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(jxa.h0);
        linearLayout.setLayoutParams(new fj3(0, -2));
        linearLayout.setOrientation(1);
        linearLayout.addView(textView);
        linearLayout.addView(textView2);
        setLayoutParams(new fj3(-1, -2));
        float f3 = (float) 12;
        int roundToInt = MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f3);
        setPadding(roundToInt, roundToInt, roundToInt, roundToInt);
        int i = js9.e(getContext()).f().b().a.f;
        setBackground(new RippleDrawable(ColorStateList.valueOf(i), (Drawable) null, new ColorDrawable(-1)));
        addView(appCompatImageView);
        addView(linearLayout);
        pj3 h = ct.h(this);
        int id = appCompatImageView.getId();
        h.e(id, 6, 0, 6);
        h.e(id, 3, 0, 3);
        h.e(id, 4, 0, 4);
        int id2 = linearLayout.getId();
        h.e(id2, 3, 0, 3);
        h.e(id2, 4, 0, 4);
        h.e(id2, 7, 0, 7);
        h.e(id2, 6, appCompatImageView.getId(), 7);
        new ila(h, 6, id2, 4).e(MathKt.roundToInt(f3 * vo4.c().getDisplayMetrics().density));
        h.a(this);
        onThemeChanged(js9.e(getContext()).f());
    }

    public static final void L(rc2 rc2, w50 w50) {
        rc2.getClass();
        m30 m30 = w50 != null ? w50.c : null;
        if (m30 == null || !Intrinsics.areEqual((Object) w50.a, (Object) rc2.K0)) {
            rc2.setButtonState(cd4.b);
        } else {
            rc2.setButtonState(m30);
        }
    }

    private final void setButtonState(m30 m30) {
        boolean areEqual = Intrinsics.areEqual((Object) m30, (Object) v02.a);
        AppCompatImageView appCompatImageView = this.H0;
        if (areEqual) {
            appCompatImageView.setImageDrawable(ew3.b(getContext(), cad.c2));
        } else if (Intrinsics.areEqual((Object) m30, (Object) ejd.b) || Intrinsics.areEqual((Object) m30, (Object) cd4.b) || Intrinsics.areEqual((Object) m30, (Object) mz4.a)) {
            appCompatImageView.setImageDrawable(ew3.b(getContext(), cad.I1));
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    private final void setState(ome ome) {
        p50 p50;
        this.I0 = new p50(1, this, ome);
        if (isAttachedToWindow() && (p50 = this.I0) != null) {
            p50.onViewAttachedToWindow(this);
        }
        addOnAttachStateChangeListener(this.I0);
    }

    private final void setSubtitle(CharSequence charSequence) {
        TextView textView = this.F0;
        int i = 0;
        if (!(true ^ (charSequence == null || charSequence.length() == 0))) {
            i = 8;
        }
        textView.setVisibility(i);
        textView.setText(charSequence);
    }

    private final void setTitle(CharSequence charSequence) {
        this.E0.setText(charSequence);
    }

    public final void onThemeChanged(k2b k2b) {
        this.E0.setTextColor(k2b.getText().e);
        this.F0.setTextColor(k2b.getText().f);
        k2b.getIcon().getClass();
        this.G0.setColor(ColorStateList.valueOf(-16745729));
        k2b.getIcon().getClass();
        this.H0.setImageTintList(ColorStateList.valueOf(-1));
    }

    public final void setupAudio(c29 c29) {
        this.K0 = Long.valueOf(c29.b);
        setTitle(c29.w);
        setSubtitle(c29.x);
        setState(c29.z);
    }
}
