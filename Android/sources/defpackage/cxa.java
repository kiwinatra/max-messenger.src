package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.BitSet;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.math.MathKt;

/* renamed from: cxa  reason: default package */
public final class cxa extends ViewGroup implements phf {
    public final BitSet a;
    public final BitSet b;
    public final int c = 1;
    public final int o = 2;
    public final TextView v;
    public final TextView w;
    public final ImageView x;

    public cxa(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        BitSet bitSet = new BitSet(4);
        this.a = bitSet;
        BitSet bitSet2 = new BitSet(3);
        this.b = bitSet2;
        TextView textView = new TextView(context);
        textView.setText(q8.p(ead.n0, textView.getContext()));
        puf.n.b(textView, uy4.b);
        js9 js9 = fu4.k;
        js9.e(textView.getContext()).f().getText().getClass();
        textView.setTextColor(-16745729);
        textView.setSingleLine();
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        this.v = textView;
        TextView textView2 = new TextView(context);
        puf.l.b(textView2, uy4.b);
        textView2.setTextColor(js9.e(textView2.getContext()).f().getText().e);
        textView2.setSingleLine();
        textView2.setEllipsize(truncateAt);
        gsg.h(textView2);
        this.w = textView2;
        ImageView imageView = new ImageView(context);
        imageView.setImageDrawable(ew3.b(imageView.getContext(), cad.x));
        imageView.setImageTintList(ColorStateList.valueOf(js9.e(imageView.getContext()).f().getIcon().i));
        int roundToInt = MathKt.roundToInt(((float) 6) * vo4.c().getDisplayMetrics().density);
        float f = (float) 12;
        int roundToInt2 = MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f);
        int roundToInt3 = MathKt.roundToInt(((float) 16) * vo4.c().getDisplayMetrics().density);
        int roundToInt4 = MathKt.roundToInt(((float) 10) * vo4.c().getDisplayMetrics().density);
        imageView.setPadding(roundToInt, roundToInt4, roundToInt2, roundToInt4);
        imageView.setLayoutParams(new ViewGroup.MarginLayoutParams(roundToInt2 + roundToInt3 + roundToInt, (roundToInt4 * 2) + roundToInt3));
        this.x = imageView;
        addView(textView);
        addView(textView2);
        addView(imageView);
        float f2 = (float) 5;
        setPaddingRelative(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2), MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density), MathKt.roundToInt(f2 * vo4.c().getDisplayMetrics().density));
        bitSet.set(0, bitSet.size(), true);
        bitSet2.set(0, true);
        bitSet2.set(2, false);
        bitSet2.set(1, false);
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingStart = getPaddingStart();
        TextView textView = this.v;
        ct.A(paddingStart, getPaddingTop(), textView.getMeasuredWidth() + paddingStart, textView.getMeasuredHeight() + getPaddingTop(), textView, this);
        if (this.b.get(this.c)) {
            int b2 = g63.b((float) 2, vo4.c().getDisplayMetrics().density, textView.getBottom());
            TextView textView2 = this.w;
            int measuredHeight = textView2.getMeasuredHeight() + b2;
            ct.A(paddingStart, b2, textView2.getMeasuredWidth() + paddingStart, measuredHeight, textView2, this);
        }
        int measuredWidth = getMeasuredWidth();
        ImageView imageView = this.x;
        int measuredHeight2 = (getMeasuredHeight() / 2) - (imageView.getMeasuredHeight() / 2);
        ct.A(measuredWidth - imageView.getMeasuredWidth(), measuredHeight2, measuredWidth, imageView.getMeasuredHeight() + measuredHeight2, imageView, this);
    }

    public final void onMeasure(int i, int i2) {
        TextView textView = this.v;
        BitSet bitSet = this.b;
        int i3 = 8;
        textView.setVisibility(bitSet.get(0) ? 0 : 8);
        TextView textView2 = this.w;
        int i4 = this.c;
        textView2.setVisibility(bitSet.get(i4) ? 0 : 8);
        ImageView imageView = this.x;
        int i5 = this.o;
        if (bitSet.get(i5)) {
            i3 = 0;
        }
        imageView.setVisibility(i3);
        int size = View.MeasureSpec.getSize(i);
        int roundToInt = MathKt.roundToInt(((float) 52) * vo4.c().getDisplayMetrics().density);
        int e = a81.e((float) 12, vo4.c().getDisplayMetrics().density, a81.e((float) 16, vo4.c().getDisplayMetrics().density, (size - getPaddingStart()) - getPaddingEnd()));
        if (bitSet.get(i5)) {
            imageView.measure(View.MeasureSpec.makeMeasureSpec(imageView.getLayoutParams().width, 1073741824), View.MeasureSpec.makeMeasureSpec(imageView.getLayoutParams().height, 1073741824));
        }
        if (bitSet.get(0)) {
            textView.measure(View.MeasureSpec.makeMeasureSpec(e, IntCompanionObject.MIN_VALUE), 0);
        }
        if (bitSet.get(i4)) {
            textView2.measure(View.MeasureSpec.makeMeasureSpec(e, IntCompanionObject.MIN_VALUE), 0);
        }
        BitSet bitSet2 = this.a;
        bitSet2.set(0, bitSet2.size(), false);
        setMeasuredDimension(size, roundToInt);
    }

    public final void onThemeChanged(k2b k2b) {
        TextView textView = this.v;
        k2b.getText().getClass();
        textView.setTextColor(-16745729);
        this.w.setTextColor(k2b.getText().e);
        this.x.setImageTintList(ColorStateList.valueOf(k2b.getIcon().i));
        BitSet bitSet = this.a;
        bitSet.set(0, bitSet.size(), true);
        invalidate();
    }

    public final void setCloseBtnClickListener(View.OnClickListener onClickListener) {
        ct.G(this.x, 300, onClickListener);
    }

    public final void setCloseButtonVisibility(boolean z) {
        BitSet bitSet = this.a;
        int i = this.o;
        bitSet.set(i, true);
        this.b.set(i, z);
        requestLayout();
    }

    public final void setOnPinnedMsgClickListener(View.OnClickListener onClickListener) {
        setOnClickListener(onClickListener);
    }

    public final void setSubtitle(CharSequence charSequence) {
        this.w.setText(charSequence);
        BitSet bitSet = this.a;
        int i = this.c;
        boolean z = true;
        bitSet.set(i, true);
        BitSet bitSet2 = this.b;
        if (charSequence.length() <= 0) {
            z = false;
        }
        bitSet2.set(i, z);
        requestLayout();
    }
}
