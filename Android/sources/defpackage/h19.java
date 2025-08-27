package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;

/* renamed from: h19  reason: default package */
public final class h19 extends LinearLayout implements phf {
    public Function1 a;
    public final View b;
    public final LinearLayout c;

    public h19(Context context) {
        super(context, (AttributeSet) null, 0);
        View view = new View(context);
        view.setLayoutParams(new LinearLayout.LayoutParams(-1, MathKt.roundToInt(((float) 1) * vo4.c().getDisplayMetrics().density)));
        this.b = view;
        LinearLayout linearLayout = new LinearLayout(context);
        float f = (float) 12;
        linearLayout.setPadding(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), linearLayout.getPaddingTop(), MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density), linearLayout.getPaddingBottom());
        this.c = linearLayout;
        setOrientation(1);
        addView(view);
        addView(linearLayout);
        view.setBackgroundColor(fu4.k.e(getContext()).f().h().k);
    }

    public final Function1<x19, Unit> getOnClickListener() {
        return this.a;
    }

    public final void onThemeChanged(k2b k2b) {
        js9 js9 = fu4.k;
        fu4.e(js9.e(getContext()), this);
        this.b.setBackgroundColor(js9.e(getContext()).f().h().k);
    }

    public final void setOnClickListener(Function1<? super x19, Unit> function1) {
        this.a = function1;
    }

    public final void setSelected(x19 x19) {
        z69 z69 = new z69(1, this.c);
        while (z69.hasNext()) {
            View view = (View) z69.next();
            g19 g19 = view instanceof g19 ? (g19) view : null;
            if (g19 != null) {
                g19.setIsSelected(Intrinsics.areEqual((Object) g19.getState(), (Object) x19));
            }
        }
    }

    public final void setState(List<? extends x19> list) {
        LinearLayout linearLayout = this.c;
        linearLayout.removeAllViews();
        for (x19 x19 : list) {
            g19 g19 = new g19(getContext());
            g19.setIsSelected(false);
            g19.setState(x19);
            ct.G(g19, 300, new h24(17, (Object) this, (Object) x19));
            linearLayout.addView(g19);
        }
    }
}
