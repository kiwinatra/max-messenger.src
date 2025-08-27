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
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.math.MathKt;
import one.me.sdk.uikit.common.avatar.OneMeAvatarView;

/* renamed from: je2  reason: default package */
public final class je2 extends ConstraintLayout implements phf {
    public boolean E0;
    public final TextView F0;
    public final TextView G0;
    public final Drawable H0;
    public final Lazy I0;
    public final OneMeAvatarView J0;
    public final LinearLayout K0;
    public final ImageView L0;

    public je2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TextView textView = new TextView(context);
        fj3 fj3 = new fj3(-1, -2);
        fj3.bottomMargin = MathKt.roundToInt(((float) 4) * vo4.c().getDisplayMetrics().density);
        textView.setLayoutParams(fj3);
        puf.i.b(textView, uy4.b);
        textView.setSingleLine(true);
        textView.setMaxLines(1);
        textView.setLetterSpacing(c44.DEFAULT_ASPECT_RATIO);
        textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        this.F0 = textView;
        TextView textView2 = new TextView(context);
        textView2.setLayoutParams(new fj3(-1, -2));
        puf.m.b(textView2, uy4.b);
        textView2.setMaxLines(1);
        this.G0 = textView2;
        int roundToInt = MathKt.roundToInt(((float) 48) * vo4.c().getDisplayMetrics().density);
        Drawable b = ew3.b(getContext(), cad.N);
        this.H0 = b;
        this.I0 = LazyKt.lazy(LazyThreadSafetyMode.NONE, new v4(context, 26));
        OneMeAvatarView oneMeAvatarView = new OneMeAvatarView(context, (AttributeSet) null);
        oneMeAvatarView.setId(jxa.g0);
        fj3 fj32 = new fj3(roundToInt, roundToInt);
        fj32.setMarginStart(MathKt.roundToInt(((float) 12) * vo4.c().getDisplayMetrics().density));
        oneMeAvatarView.setLayoutParams(fj32);
        oneMeAvatarView.setAvatarShape(ioa.a);
        OneMeAvatarView.g(oneMeAvatarView, b, (joa) null, 30);
        this.J0 = oneMeAvatarView;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(jxa.e0);
        linearLayout.setLayoutParams(new fj3(0, -2));
        linearLayout.setOrientation(1);
        linearLayout.addView(textView);
        linearLayout.addView(textView2);
        this.K0 = linearLayout;
        ImageView imageView = new ImageView(context);
        imageView.setId(jxa.f0);
        float f = (float) 24;
        imageView.setLayoutParams(new ViewGroup.LayoutParams(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density)));
        imageView.setVisibility(4);
        this.L0 = imageView;
        setLayoutParams(new fj3(-1, -2));
        js9 js9 = fu4.k;
        int i = js9.e(getContext()).f().b().a.f;
        setBackground(new RippleDrawable(ColorStateList.valueOf(i), (Drawable) null, new ColorDrawable(-1)));
        setMinimumHeight(MathKt.roundToInt(((float) 72) * vo4.c().getDisplayMetrics().density));
        float f2 = (float) 15;
        setPaddingRelative(0, MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2), 0, MathKt.roundToInt(f2 * vo4.c().getDisplayMetrics().density));
        addView(oneMeAvatarView);
        addView(linearLayout);
        addView(imageView);
        L();
        onThemeChanged(js9.e(getContext()).f());
    }

    public final void L() {
        pj3 h = ct.h(this);
        OneMeAvatarView oneMeAvatarView = this.J0;
        ni0 ni0 = new ni0((Object) h, oneMeAvatarView.getId(), 4);
        ni0.P(0);
        ni0.R(0);
        ni0.b(0);
        ni0 ni02 = new ni0((Object) h, this.K0.getId(), 4);
        ni02.R(0);
        ni02.b(0);
        float f = (float) 12;
        tr1.u(f, vo4.c().getDisplayMetrics().density, ni02.O(oneMeAvatarView.getId()));
        ImageView imageView = this.L0;
        ni02.v(imageView.getId()).e(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f));
        ni0 ni03 = new ni0((Object) h, imageView.getId(), 4);
        ni03.R(0);
        ni03.b(0);
        ni03.t(0).e(MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density));
        h.a(this);
    }

    public final void onThemeChanged(k2b k2b) {
        this.F0.setTextColor(k2b.getText().e);
        this.G0.setTextColor(k2b.getText().f);
        this.J0.onThemeChanged(k2b);
        this.L0.setImageTintList(ColorStateList.valueOf(k2b.getIcon().f));
        Lazy lazy = this.I0;
        if (lazy.isInitialized()) {
            ((km5) lazy.getValue()).onThemeChanged(k2b);
        }
    }

    public final void setFileDescription(CharSequence charSequence) {
        this.G0.setText(charSequence);
    }

    public final void setFileDownloadStatus(g29 g29) {
        boolean z = g29 instanceof d29;
        ImageView imageView = this.L0;
        if (z) {
            if (!this.E0) {
                imageView.setImageDrawable((Drawable) null);
                imageView.setVisibility(4);
                imageView.setScaleType(ImageView.ScaleType.CENTER);
            }
        } else if (g29 instanceof e29) {
            if (!(imageView.getDrawable() instanceof a10)) {
                a10 a10 = new a10();
                int i = lya.b;
                js9 js9 = fu4.k;
                int i2 = js9.e(imageView.getContext()).f().getIcon().f;
                Drawable b = ew3.b(imageView.getContext(), i);
                iq.a0(b, i2);
                a10.a = b;
                a10.invalidateSelf();
                a10.c = MathKt.roundToInt(((float) 36) * vo4.c().getDisplayMetrics().density);
                a10.b = true;
                a10.invalidateSelf();
                a10.b(js9.e(imageView.getContext()).f().getIcon().f);
                a10.e = true;
                a10.invalidateSelf();
                imageView.setImageDrawable(a10);
                imageView.setAdjustViewBounds(false);
            }
            imageView.getDrawable().setLevel((int) (((e29) g29).b * ((float) 100)));
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            imageView.setVisibility(0);
        } else if (g29 instanceof f29) {
            imageView.setImageDrawable(ew3.b(getContext(), lya.f));
            imageView.setVisibility(0);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final void setTitle(CharSequence charSequence) {
        this.F0.setText(charSequence);
    }
}
