package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;

/* renamed from: z70  reason: default package */
public final class z70 extends FrameLayout implements bif {
    public y70 a;
    public final AppCompatTextView b;
    public final Drawable c;
    public boolean o;
    public final AppCompatImageView v;
    public boolean v0;
    public List w;
    public CharSequence x = "";
    public boolean y;
    public int z;

    public z70(Context context) {
        super(context, (AttributeSet) null, 0);
        Drawable b2 = ew3.b(context, nad.b0);
        this.c = b2;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, (AttributeSet) null);
        appCompatTextView.setId(lic.view_audio_attach__transcription_text);
        appCompatTextView.setTextSize(15.0f);
        appCompatTextView.setTextAlignment(5);
        float f = (float) 8;
        appCompatTextView.setPaddingRelative(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), b2.getIntrinsicWidth() + MathKt.roundToInt(((float) 10) * vo4.c().getDisplayMetrics().density), MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density));
        appCompatTextView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        appCompatTextView.setClickable(false);
        cvg.x(appCompatTextView).b();
        this.b = appCompatTextView;
        addView(appCompatTextView);
        AppCompatImageView appCompatImageView = new AppCompatImageView(context, (AttributeSet) null);
        appCompatImageView.setImageDrawable(b2);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388661;
        layoutParams.setMarginEnd(MathKt.roundToInt(((float) 6) * vo4.c().getDisplayMetrics().density));
        layoutParams.topMargin = ((((int) (appCompatTextView.getPaint().getFontMetrics().bottom - appCompatTextView.getPaint().getFontMetrics().top)) / 2) + appCompatTextView.getPaddingTop()) - (b2.getIntrinsicWidth() / 2);
        appCompatImageView.setLayoutParams(layoutParams);
        appCompatImageView.setClickable(false);
        this.v = appCompatImageView;
        addView(appCompatImageView);
        ct.G(this, 300, new x4(10, (Object) this));
        setOnLongClickListener(new z20(2, this));
        c();
    }

    public final void a(boolean z2) {
        CharSequence charSequence = this.x;
        AppCompatTextView appCompatTextView = this.b;
        CharSequence ellipsize = TextUtils.ellipsize(charSequence, appCompatTextView.getPaint(), (((float) appCompatTextView.getMeasuredWidth()) - ((float) appCompatTextView.getPaddingEnd())) - ((float) appCompatTextView.getPaddingStart()), TextUtils.TruncateAt.END);
        this.y = Intrinsics.areEqual((Object) this.x, (Object) ellipsize);
        if (z2) {
            ellipsize = this.x;
        }
        appCompatTextView.setText(ellipsize);
        this.v.setVisibility(this.y ^ true ? 0 : 8);
        float f = (float) 8;
        appCompatTextView.setPaddingRelative(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), this.c.getIntrinsicWidth() + MathKt.roundToInt(((float) 10) * vo4.c().getDisplayMetrics().density), MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density));
    }

    public final void b(CharSequence charSequence, boolean z2) {
        z68.c("AudioTranscriptionView", "setAudioTranscription: %b", Boolean.valueOf(z2));
        this.x = i8b.B(getContext(), charSequence, this.w);
        this.o = z2;
        AppCompatImageView appCompatImageView = this.v;
        if (z2) {
            appCompatImageView.setRotation(180.0f);
            a(true);
            return;
        }
        appCompatImageView.setRotation(c44.DEFAULT_ASPECT_RATIO);
        a(false);
    }

    public final void c() {
        scf scf;
        scf scf2;
        if (isInEditMode()) {
            scf = vi4.f0;
        } else {
            Context context = getContext();
            Lazy lazy = scf.b0;
            scf = j4b.k0(context);
        }
        ws0 c2 = scf.c(this.v0);
        this.c.setTint(c2.c.d);
        int i = c2.b.d;
        AppCompatTextView appCompatTextView = this.b;
        appCompatTextView.setTextColor(i);
        int i2 = c2.a.h;
        if (isInEditMode()) {
            scf2 = vi4.f0;
        } else {
            Context context2 = getContext();
            Lazy lazy2 = scf.b0;
            scf2 = j4b.k0(context2);
        }
        appCompatTextView.setBackground(i8b.f(i2, scf2.B, 0, MathKt.roundToInt(((float) 4) * vo4.c().getDisplayMetrics().density)));
    }

    public final int getCollapsedHeight() {
        return this.z;
    }

    public final List<String> getHighlights() {
        return this.w;
    }

    public final boolean getIncoming() {
        return this.v0;
    }

    public final boolean getPermanentlyExpanded() {
        return this.y;
    }

    public final CharSequence getTranscription() {
        return this.x;
    }

    public final void onMeasure(int i, int i2) {
        AppCompatTextView appCompatTextView = this.b;
        int paddingBottom = appCompatTextView.getPaddingBottom();
        this.z = appCompatTextView.getPaddingStart() + paddingBottom + ((int) (appCompatTextView.getPaint().getFontMetrics().bottom - appCompatTextView.getPaint().getFontMetrics().top));
        if (!this.o && !hasTransientState()) {
            i2 = View.MeasureSpec.makeMeasureSpec(this.z, 1073741824);
        } else if (!hasTransientState()) {
            i2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        }
        super.onMeasure(i, i2);
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i2 != i4) {
            a(this.o);
        }
    }

    public final void setArrowRotation(float f) {
        this.v.setRotation(f);
    }

    public final void setHighlights(List<String> list) {
        this.w = list;
    }

    public final void setIncoming(boolean z2) {
        if (this.v0 != z2) {
            this.v0 = z2;
            c();
        }
    }

    public final void setListener(y70 y70) {
        this.a = y70;
    }
}
