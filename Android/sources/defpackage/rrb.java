package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.coroutines.Continuation;
import kotlin.math.MathKt;

/* renamed from: rrb  reason: default package */
public final class rrb extends FrameLayout {
    public final boolean a;
    public Integer b;
    public AppCompatTextView c;
    public ImageView o;

    public rrb(Context context, boolean z) {
        super(context);
        this.a = z;
        setMinimumHeight(MathKt.roundToInt(((float) 48) * vo4.c().getDisplayMetrics().density));
        b0h.H(this, new mh0(3, (Continuation) null, 12));
    }

    /* access modifiers changed from: private */
    public final k2b getCurrentTheme() {
        return this.a ? l2b.a : fu4.k.e(getContext()).f();
    }

    public final void b(Integer num, Integer num2) {
        if (num != null) {
            int intValue = num.intValue();
            ImageView imageView = new ImageView(getContext());
            imageView.setImageResource(intValue);
            imageView.setImageTintList(ColorStateList.valueOf(getCurrentTheme().i(num2 != null ? num2.intValue() : jya.F)));
            b0h.H(imageView, new qrb((Object) this, (Continuation) null, 0));
            this.o = imageView;
            float f = (float) 24;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density));
            layoutParams.gravity = 8388627;
            layoutParams.setMarginStart(MathKt.roundToInt(((float) 12) * vo4.c().getDisplayMetrics().density));
            addView(this.o, layoutParams);
        }
    }

    public final void c(rrb rrb, ngf ngf, Integer num, boolean z, boolean z2) {
        AppCompatTextView appCompatTextView = new AppCompatTextView(rrb.getContext(), (AttributeSet) null);
        puf.k.b(appCompatTextView, uy4.b);
        appCompatTextView.setMaxLines(2);
        appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
        appCompatTextView.setText(ngf.a(appCompatTextView.getContext()));
        int intValue = num != null ? num.intValue() : jya.F;
        this.b = Integer.valueOf(intValue);
        appCompatTextView.setTextColor(getCurrentTheme().i(intValue));
        b0h.H(appCompatTextView, new qrb((Object) this, (Continuation) null, 1));
        this.c = appCompatTextView;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388627;
        layoutParams.setMarginStart((z || z2) ? MathKt.roundToInt(((float) 48) * vo4.c().getDisplayMetrics().density) : MathKt.roundToInt(((float) 12) * vo4.c().getDisplayMetrics().density));
        layoutParams.setMarginEnd(MathKt.roundToInt(((float) 12) * vo4.c().getDisplayMetrics().density));
        float f = (float) 4;
        layoutParams.topMargin = MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f);
        layoutParams.bottomMargin = MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density);
        rrb.addView(this.c, layoutParams);
    }
}
