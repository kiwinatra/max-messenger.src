package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import kotlin.math.MathKt;

/* renamed from: x14  reason: default package */
public final class x14 extends LinearLayout implements phf {
    public final ImageView a;
    public final TextView b;
    public final TextView c;

    public x14(Context context) {
        super(context, (AttributeSet) null);
        ImageView imageView = new ImageView(context);
        float f = (float) 40;
        imageView.setLayoutParams(new LinearLayout.LayoutParams(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density)));
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        this.a = imageView;
        TextView textView = new TextView(context);
        puf.i.b(textView, uy4.b);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, 0, MathKt.roundToInt(((float) 12) * vo4.c().getDisplayMetrics().density), 0);
        layoutParams.weight = 1.0f;
        textView.setLayoutParams(layoutParams);
        this.b = textView;
        TextView textView2 = new TextView(context);
        puf.l.b(textView2, uy4.b);
        this.c = textView2;
        setMinimumHeight(MathKt.roundToInt(((float) 56) * vo4.c().getDisplayMetrics().density));
        setOrientation(0);
        setGravity(16);
        setOutlineProvider(new n04(16.0f));
        setClipToOutline(true);
        addView(imageView);
        addView(textView);
        addView(textView2);
        onThemeChanged(fu4.k.e(getContext()).f());
    }

    public final void onThemeChanged(k2b k2b) {
        this.b.setTextColor(k2b.getText().e);
        this.c.setTextColor(k2b.getText().f);
    }

    public final void setCountryInfo(ysa ysa) {
        Integer num = ysa.o;
        if (num != null) {
            int intValue = num.intValue();
            ImageView imageView = this.a;
            imageView.setImageResource(intValue);
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.setMargins(0, 0, MathKt.roundToInt(((float) 12) * vo4.c().getDisplayMetrics().density), 0);
                imageView.setLayoutParams(marginLayoutParams);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
        }
        this.b.setText(getContext().getString(ysa.c));
        TextView textView = this.c;
        textView.setText("+" + ysa.b);
    }
}
