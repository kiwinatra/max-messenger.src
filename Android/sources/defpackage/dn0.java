package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.math.MathKt;

/* renamed from: dn0  reason: default package */
public final class dn0 extends FrameLayout implements phf {
    public final w4d a;
    public final v3d b;
    public final TextView c;
    public final TextView o;
    public final SimpleDraweeView v;

    public dn0(Context context) {
        super(context);
        w4d w4d = new w4d();
        this.a = w4d;
        float f = (float) 32;
        int roundToInt = MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f);
        this.b = roundToInt <= 0 ? null : new v3d(c44.DEFAULT_ASPECT_RATIO, roundToInt, roundToInt, 12);
        TextView textView = new TextView(context);
        textView.setId(ngc.oneme_folder_widget_title);
        textView.setMaxLines(2);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        puf.y.b(textView, uy4.b);
        this.c = textView;
        TextView textView2 = new TextView(context);
        textView2.setId(ngc.oneme_folder_widget_description);
        textView2.setMaxLines(2);
        textView2.setEllipsize(truncateAt);
        puf.m.b(textView2, uy4.b);
        this.o = textView2;
        SimpleDraweeView simpleDraweeView = new SimpleDraweeView(context);
        simpleDraweeView.setId(ngc.oneme_folder_widget_icon);
        knb a2 = ld9.p.get();
        a2.g = w4d;
        a2.k = true;
        simpleDraweeView.setController(a2.a());
        this.v = simpleDraweeView;
        setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        addView(simpleDraweeView, new FrameLayout.LayoutParams(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density)));
        addView(textView, new FrameLayout.LayoutParams(-2, -2));
        addView(textView2, new FrameLayout.LayoutParams(-2, -2));
        setOutlineProvider(new n04(vo4.c().getDisplayMetrics().density * 20.0f));
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        onThemeChanged(fu4.k.e(getContext()).f());
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        TextView textView = this.c;
        int measuredHeight = textView.getMeasuredHeight();
        TextView textView2 = this.o;
        int measuredHeight2 = textView2.getMeasuredHeight() + measuredHeight;
        float f = (float) 4;
        int measuredHeight3 = (getMeasuredHeight() / 2) - ((MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f) + measuredHeight2) / 2);
        float f2 = (float) 16;
        ev0.x(textView, MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2), measuredHeight3, 0, 12);
        ev0.x(textView2, MathKt.roundToInt(f2 * vo4.c().getDisplayMetrics().density), tr1.e(f, vo4.c().getDisplayMetrics().density, textView.getMeasuredHeight(), measuredHeight3), 0, 12);
        SimpleDraweeView simpleDraweeView = this.v;
        float f3 = (float) 32;
        simpleDraweeView.layout(a81.e(f3, vo4.c().getDisplayMetrics().density, getMeasuredWidth()) - simpleDraweeView.getMeasuredWidth(), (getMeasuredHeight() / 2) - (simpleDraweeView.getMeasuredHeight() / 2), a81.e(f3, vo4.c().getDisplayMetrics().density, getMeasuredWidth()), (simpleDraweeView.getMeasuredHeight() / 2) + (getMeasuredHeight() / 2));
    }

    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        float f = (float) 32;
        int e = a81.e((float) 12, vo4.c().getDisplayMetrics().density, a81.e(f, vo4.c().getDisplayMetrics().density, a81.e(f, vo4.c().getDisplayMetrics().density, a81.e((float) 16, vo4.c().getDisplayMetrics().density, size))));
        this.c.measure(View.MeasureSpec.makeMeasureSpec(e, IntCompanionObject.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        this.o.measure(View.MeasureSpec.makeMeasureSpec(e, IntCompanionObject.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        this.v.measure(View.MeasureSpec.makeMeasureSpec(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), 1073741824), View.MeasureSpec.makeMeasureSpec(MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density), 1073741824));
        setMeasuredDimension(size, size2);
    }

    public final void onThemeChanged(k2b k2b) {
        TextView textView = this.c;
        k2b.getText().getClass();
        textView.setTextColor(-1);
        TextView textView2 = this.o;
        k2b.getText().getClass();
        textView2.setTextColor(i8b.Y(0.7f, -1));
    }
}
