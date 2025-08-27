package defpackage;

import android.content.Context;
import android.text.Spannable;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import kotlin.coroutines.Continuation;
import kotlin.math.MathKt;

/* renamed from: fm2  reason: default package */
public final class fm2 extends LinearLayout {
    public final qy7 a;
    public final TextView b;

    /* JADX WARNING: type inference failed for: r7v14, types: [hy7, android.text.method.LinkMovementMethod] */
    public fm2(Context context) {
        super(context, (AttributeSet) null);
        fu4.k.e(getContext()).f().getText().getClass();
        qy7 qy7 = new qy7(-16745729, 9);
        this.a = qy7;
        TextView textView = new TextView(context);
        textView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        puf.k.b(textView, uy4.b);
        if (hy7.a == null) {
            hy7.a = new LinkMovementMethod();
        }
        textView.setMovementMethod(hy7.a);
        textView.setTransformationMethod(qy7);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        b0h.H(textView, new ra(3, (Continuation) null, 5));
        textView.setGravity(16);
        this.b = textView;
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        setOrientation(1);
        float f = (float) 12;
        setPaddingRelative(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density));
        addView(textView);
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        CharSequence text = this.b.getText();
        Spannable spannable = text instanceof Spannable ? (Spannable) text : null;
        if (spannable != null) {
            this.a.b(spannable);
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        CharSequence text = this.b.getText();
        Spannable spannable = text instanceof Spannable ? (Spannable) text : null;
        if (spannable != null) {
            this.a.getClass();
            qy7.a(spannable);
        }
    }

    public final void setDescription(CharSequence charSequence) {
        this.b.setText(charSequence);
    }

    public final void setLinkClickListener(ny7 ny7) {
        qy7 qy7 = this.a;
        qy7.a = ny7;
        CharSequence text = this.b.getText();
        Spannable spannable = text instanceof Spannable ? (Spannable) text : null;
        if (spannable != null) {
            qy7.b(spannable);
        }
    }
}
