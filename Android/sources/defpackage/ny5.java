package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import java.util.concurrent.ExecutorService;
import kotlin.coroutines.Continuation;
import kotlin.math.MathKt;
import one.me.sdk.uikit.common.button.OneMeButton;

/* renamed from: ny5  reason: default package */
public final class ny5 extends pae {
    public final my5 v;

    public ny5(ExecutorService executorService, my5 my5) {
        super(executorService);
        this.v = my5;
    }

    /* renamed from: J */
    public final void s(kbe kbe, int i) {
        int l = l(i) & 536870911;
        boolean r = y64.r(l, 1);
        my5 my5 = this.v;
        if (r) {
            kz5 kz5 = (kz5) kbe;
            kz5.M((jz5) ((lz7) E(i)));
            kz5.E0 = my5;
        } else if (y64.r(l, 8)) {
            oy5 oy5 = (oy5) ((lz7) E(i));
            ct.G(((py5) kbe).a, 300, new xu3(7, (Object) my5));
        } else if (y64.r(l, 4)) {
            s16 s16 = (s16) kbe;
            m16 m16 = (m16) ((lz7) E(i));
            s16.M(m16);
            ((uy1) s16.a).setOnTrailClick(new h24(5, (Object) my5, (Object) m16));
        } else {
            super.s(kbe, i);
        }
    }

    public final pzc u(ViewGroup viewGroup, int i) {
        int i2 = 536870911 & i;
        if (y64.r(i2, 1)) {
            return new kz5(viewGroup);
        }
        if (y64.r(i2, 4)) {
            uy1 uy1 = new uy1(viewGroup.getContext());
            pzc pzc = new pzc(uy1);
            uy1.setTrail(cad.y);
            return pzc;
        } else if (y64.r(i2, 2)) {
            s01 s01 = new s01(22, (Object) this.v);
            Context context = viewGroup.getContext();
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -2);
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setLayoutParams(layoutParams);
            AppCompatImageView appCompatImageView = new AppCompatImageView(context, (AttributeSet) null);
            appCompatImageView.setImageResource(nad.n);
            TextView textView = new TextView(context);
            puf.i.b(textView, uy4.b);
            textView.setText(iua.g);
            b0h.H(frameLayout, new ce1((Object) appCompatImageView, (Object) textView, (Continuation) null, 3));
            float f = (float) 24;
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), 8388627);
            float f2 = (float) 18;
            layoutParams2.leftMargin = MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2);
            layoutParams2.rightMargin = MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2);
            float f3 = (float) 12;
            layoutParams2.topMargin = MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f3);
            layoutParams2.bottomMargin = MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f3);
            frameLayout.addView(appCompatImageView, layoutParams2);
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -2, 8388627);
            layoutParams3.leftMargin = g63.b(f, vo4.c().getDisplayMetrics().density, MathKt.roundToInt(f2 * vo4.c().getDisplayMetrics().density) * 2);
            layoutParams3.rightMargin = MathKt.roundToInt(f3 * vo4.c().getDisplayMetrics().density);
            frameLayout.addView(textView, layoutParams3);
            pzc pzc2 = new pzc(frameLayout);
            ct.G(frameLayout, 300, new e7(10, s01));
            return pzc2;
        } else if (y64.r(i2, 8)) {
            OneMeButton oneMeButton = new OneMeButton(viewGroup.getContext(), (AttributeSet) null);
            pzc pzc3 = new pzc(oneMeButton);
            oneMeButton.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            oneMeButton.setGravity(17);
            oneMeButton.setSize(aqa.c);
            oneMeButton.setMode(zpa.c);
            oneMeButton.setAppearance(xpa.b);
            oneMeButton.setText(iua.i);
            return pzc3;
        } else {
            throw new IllegalArgumentException(a81.j(i, "Unknown view type ", "!"));
        }
    }
}
