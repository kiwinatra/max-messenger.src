package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.math.MathKt;
import one.me.sdk.uikit.common.button.OneMeButton;

/* renamed from: yte  reason: default package */
public final class yte extends ViewGroup implements phf {
    public final TextView a;
    public final TextView b;
    public final OneMeButton c;
    public final int o = MathKt.roundToInt(((float) 10) * vo4.c().getDisplayMetrics().density);

    public yte(Context context) {
        super(context, (AttributeSet) null);
        TextView textView = new TextView(context);
        textView.setId(fza.e);
        puf.j.b(textView, uy4.b);
        js9 js9 = fu4.k;
        textView.setTextColor(js9.e(textView.getContext()).f().getText().e);
        this.a = textView;
        TextView textView2 = new TextView(context);
        textView2.setId(fza.d);
        puf.o.b(textView2, uy4.b);
        textView2.setTextColor(js9.e(textView2.getContext()).f().getText().h);
        this.b = textView2;
        OneMeButton oneMeButton = new OneMeButton(context, (AttributeSet) null);
        oneMeButton.setId(fza.c);
        oneMeButton.setSize(aqa.a);
        oneMeButton.setMode(zpa.a);
        oneMeButton.setAppearance(xpa.c);
        oneMeButton.setVisibility(4);
        this.c = oneMeButton;
        addView(textView);
        addView(textView2);
        addView(oneMeButton);
    }

    public final OneMeButton getHeaderButton() {
        return this.c;
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingStart = getPaddingStart();
        TextView textView = this.a;
        int i5 = paddingStart;
        ct.A(i5, getPaddingTop(), textView.getMeasuredWidth() + paddingStart, textView.getMeasuredHeight() + getPaddingTop(), textView, this);
        TextView textView2 = this.b;
        ct.A(i5, textView.getBottom(), textView2.getMeasuredWidth() + paddingStart, textView2.getMeasuredHeight() + textView.getBottom(), textView2, this);
        OneMeButton oneMeButton = this.c;
        int bottom = (textView2.getBottom() / 2) - (oneMeButton.getMeasuredHeight() / 2);
        ct.A(getMeasuredWidth() - (oneMeButton.getMeasuredWidth() + getPaddingEnd()), bottom, getMeasuredWidth() - getPaddingEnd(), oneMeButton.getMeasuredHeight() + bottom, this.c, this);
    }

    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, IntCompanionObject.MIN_VALUE);
        OneMeButton oneMeButton = this.c;
        oneMeButton.measure(makeMeasureSpec, i2);
        int measuredWidth = size - (oneMeButton.getMeasuredWidth() + this.o);
        TextView textView = this.a;
        textView.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, IntCompanionObject.MIN_VALUE), i2);
        TextView textView2 = this.b;
        textView2.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, IntCompanionObject.MIN_VALUE), i2);
        setMeasuredDimension(size, textView2.getMeasuredHeight() + textView.getMeasuredHeight());
    }

    public final void onThemeChanged(k2b k2b) {
        TextView textView = this.a;
        js9 js9 = fu4.k;
        textView.setTextColor(js9.e(getContext()).f().getText().e);
        this.b.setTextColor(js9.e(getContext()).f().getText().h);
        this.c.e();
    }
}
