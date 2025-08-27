package defpackage;

import android.content.Context;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import kotlin.coroutines.Continuation;
import kotlin.math.MathKt;

/* renamed from: wr3  reason: default package */
public final class wr3 extends LinearLayout {
    public final qy7 a = new qy7(-16745729, 9);
    public final TextView b;
    public final rd5 c;

    public wr3(Context context) {
        super(context, (AttributeSet) null);
        fu4.k.e(getContext()).f().getText().getClass();
        TextView textView = new TextView(context);
        textView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        puf.o.b(textView, uy4.b);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        b0h.H(textView, new ra(3, (Continuation) null, 10));
        textView.setGravity(8388627);
        textView.setSingleLine(true);
        this.b = textView;
        rd5 rd5 = new rd5(context);
        rd5.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        setGravity(16);
        rd5.setCollapsedLines(5);
        rd5.setExpandWithAnimation(true);
        this.c = rd5;
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        setOrientation(1);
        float f = (float) 12;
        float f2 = (float) 8;
        setPaddingRelative(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2), MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density), MathKt.roundToInt(f2 * vo4.c().getDisplayMetrics().density));
        addView(textView);
        addView(rd5);
        ViewGroup.LayoutParams layoutParams = rd5.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = MathKt.roundToInt(((float) 2) * vo4.c().getDisplayMetrics().density);
            rd5.setLayoutParams(marginLayoutParams);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        SpannableString text = this.c.getText();
        if (!(text instanceof Spannable)) {
            text = null;
        }
        if (text != null) {
            this.a.b(text);
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        SpannableString text = this.c.getText();
        if (!(text instanceof Spannable)) {
            text = null;
        }
        if (text != null) {
            this.a.getClass();
            qy7.a(text);
        }
    }

    public final void setDescription(CharSequence charSequence) {
        this.c.setText(charSequence);
    }

    public final void setLinkClickListener(ny7 ny7) {
        qy7 qy7 = this.a;
        qy7.a = ny7;
        SpannableString text = this.c.getText();
        if (!(text instanceof Spannable)) {
            text = null;
        }
        if (text != null) {
            qy7.b(text);
        }
    }

    public final void setTitle(CharSequence charSequence) {
        this.b.setText(charSequence);
    }
}
