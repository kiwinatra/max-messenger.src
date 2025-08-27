package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.math.MathKt;

/* renamed from: z56  reason: default package */
public final class z56 extends ViewGroup implements phf {
    public final w4d a;
    public final v3d b;
    public final TextView c;
    public final TextView o;
    public final SimpleDraweeView v;

    public z56(Context context) {
        super(context);
        w4d w4d = new w4d();
        this.a = w4d;
        float f = (float) 28;
        int roundToInt = MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f);
        this.b = roundToInt <= 0 ? null : new v3d(c44.DEFAULT_ASPECT_RATIO, roundToInt, roundToInt, 12);
        TextView textView = new TextView(context);
        textView.setId(ngc.oneme_folder_widget_title);
        textView.setMaxLines(2);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        puf.p.b(textView, uy4.b);
        this.c = textView;
        TextView textView2 = new TextView(context);
        textView2.setId(ngc.oneme_folder_widget_description);
        textView2.setMaxLines(2);
        textView2.setEllipsize(truncateAt);
        puf.r.b(textView2, uy4.b);
        this.o = textView2;
        SimpleDraweeView simpleDraweeView = new SimpleDraweeView(context);
        simpleDraweeView.setId(ngc.oneme_folder_widget_icon);
        knb a2 = ld9.p.get();
        a2.g = w4d;
        a2.k = true;
        simpleDraweeView.setController(a2.a());
        this.v = simpleDraweeView;
        setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        int roundToInt2 = MathKt.roundToInt(((float) 12) * vo4.c().getDisplayMetrics().density);
        setPadding(roundToInt2, roundToInt2, roundToInt2, roundToInt2);
        addView(simpleDraweeView, new ViewGroup.LayoutParams(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density)));
        addView(textView, new ViewGroup.LayoutParams(-2, -2));
        addView(textView2, new ViewGroup.LayoutParams(-2, -2));
        setOutlineProvider(new n04(vo4.c().getDisplayMetrics().density * 20.0f));
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        onThemeChanged(fu4.k.e(getContext()).f());
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float f = (float) 12;
        int roundToInt = MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f);
        TextView textView = this.c;
        ev0.x(textView, MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), roundToInt, 0, 12);
        ev0.x(this.o, MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), tr1.e((float) 4, vo4.c().getDisplayMetrics().density, textView.getMeasuredHeight(), roundToInt), 0, 12);
        SimpleDraweeView simpleDraweeView = this.v;
        simpleDraweeView.layout(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), a81.e(f, vo4.c().getDisplayMetrics().density, getMeasuredHeight() - simpleDraweeView.getMeasuredHeight()), simpleDraweeView.getMeasuredWidth() + MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), a81.e(f, vo4.c().getDisplayMetrics().density, getMeasuredHeight()));
    }

    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        float f = (float) 12;
        this.c.measure(View.MeasureSpec.makeMeasureSpec(size - (MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f) * 2), IntCompanionObject.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        this.o.measure(View.MeasureSpec.makeMeasureSpec(size - (MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density) * 2), IntCompanionObject.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        float f2 = (float) 28;
        this.v.measure(View.MeasureSpec.makeMeasureSpec(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2), 1073741824), View.MeasureSpec.makeMeasureSpec(MathKt.roundToInt(f2 * vo4.c().getDisplayMetrics().density), 1073741824));
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
