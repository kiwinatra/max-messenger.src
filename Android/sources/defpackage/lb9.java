package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.WeakHashMap;
import kotlin.Lazy;

/* renamed from: lb9  reason: default package */
public final class lb9 extends LinearLayout implements View.OnClickListener {
    public kb9 a;
    public final AppCompatTextView b;
    public final AppCompatTextView c;
    public final AppCompatImageView o;
    public long v;

    public lb9(Context context) {
        super(context, (AttributeSet) null, 0);
        getContext();
        ro4 b2 = ro4.b();
        setOrientation(1);
        int i = b2.j;
        WeakHashMap weakHashMap = gag.a;
        setPaddingRelative(i, 0, i, 0);
        Context context2 = getContext();
        Lazy lazy = scf.b0;
        scf k0 = j4b.k0(context2);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), (AttributeSet) null);
        this.b = appCompatTextView;
        appCompatTextView.setTextSize(0, b2.T);
        this.b.setText(getContext().getString(qad.r3));
        this.b.setClickable(false);
        this.b.setTextColor(k0.l);
        addView(this.b, new LinearLayout.LayoutParams(-2, -2));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        addView(linearLayout, new LinearLayout.LayoutParams(-2, -2));
        AppCompatImageView appCompatImageView = new AppCompatImageView(getContext(), (AttributeSet) null);
        this.o = appCompatImageView;
        appCompatImageView.setImageResource(nad.E);
        AppCompatImageView appCompatImageView2 = this.o;
        int i2 = k0.l;
        appCompatImageView2.setColorFilter(i2);
        this.o.setVisibility(8);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        int i3 = b2.b;
        layoutParams.topMargin = i3;
        layoutParams.gravity = 16;
        layoutParams.setMarginEnd(i3);
        linearLayout.addView(this.o, layoutParams);
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(getContext(), (AttributeSet) null);
        this.c = appCompatTextView2;
        appCompatTextView2.setTextColor(i2);
        this.c.setTextSize(14.0f);
        cvg.x(this.c).b();
        this.c.setTypeface(Typeface.create("sans-serif-medium", 0));
        this.c.setCompoundDrawablePadding(b2.b);
        this.c.setClickable(false);
        linearLayout.addView(this.c, new LinearLayout.LayoutParams(-2, -2));
        setOnClickListener(this);
        setClickable(true);
    }

    public final void onClick(View view) {
        kb9 kb9 = this.a;
        if (kb9 != null) {
            gg9 gg9 = (gg9) kb9;
            if (gg9.b1 == null) {
                return;
            }
            if (gg9.isSelected()) {
                gg9.b1.getClass();
            } else {
                gg9.b1.getClass();
            }
        }
    }

    public void setListener(kb9 kb9) {
        this.a = kb9;
    }
}
