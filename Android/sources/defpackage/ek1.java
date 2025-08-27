package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.RectF;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.math.MathKt;
import one.me.sdk.uikit.common.button.OneMeButton;

/* renamed from: ek1  reason: default package */
public final class ek1 extends ConstraintLayout {
    public dk1 E0;
    public boolean F0;
    public final r1e G0;

    public ek1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l2b l2b = l2b.a;
        setBackgroundColor(l2b.d.i);
        kne.L(this, vo4.c().getDisplayMetrics().density * 16.0f);
        h88.f(this, new yh7((jdb) null, new nr0(jdb.o, mr0.b, false), 1), (Function1) null);
        AppCompatImageView appCompatImageView = new AppCompatImageView(context, (AttributeSet) null);
        appCompatImageView.setId(qqa.y);
        float f = (float) 48;
        appCompatImageView.setLayoutParams(new fj3(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density)));
        appCompatImageView.setImageResource(pqa.S);
        appCompatImageView.setImageTintList(ColorStateList.valueOf(l2b.f.f));
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, (AttributeSet) null);
        appCompatTextView.setId(qqa.N0);
        appCompatTextView.setLayoutParams(new fj3(-1, -2));
        appCompatTextView.setGravity(17);
        puf.c.b(appCompatTextView, uy4.b);
        xef xef = l2b.i;
        appCompatTextView.setTextColor(xef.e);
        appCompatTextView.setText(sqa.w);
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(context, (AttributeSet) null);
        appCompatTextView2.setId(qqa.M0);
        appCompatTextView2.setLayoutParams(new fj3(-1, -2));
        appCompatTextView2.setGravity(17);
        puf.o.b(appCompatTextView2, uy4.b);
        appCompatTextView2.setTextColor(xef.f);
        appCompatTextView2.setText(sqa.v);
        OneMeButton oneMeButton = new OneMeButton(context, (AttributeSet) null);
        oneMeButton.setId(qqa.L0);
        oneMeButton.setLayoutParams(new fj3(-2, -2));
        oneMeButton.setMode(zpa.a);
        oneMeButton.setSize(aqa.b);
        oneMeButton.setCustomTheme(l2b);
        oneMeButton.setAppearance(xpa.v);
        oneMeButton.setText(sqa.u);
        ct.G(oneMeButton, 300, new ck1(this, 0));
        r1e r1e = new r1e(context, (AttributeSet) null);
        r1e.setId(qqa.O0);
        r1e.setStartIcon(pqa.T);
        r1e.setTitle((ngf) new igf(sqa.o));
        r1e.setType(h1e.b);
        r1e.setEndView(new d1e(this.F0, true));
        r1e.setOnSwitchCheckedListener((Function2<? super Long, ? super Boolean, Unit>) new r6(5, this));
        float[] fArr = new float[8];
        for (int i = 0; i < 8; i++) {
            fArr[i] = vo4.c().getDisplayMetrics().density * 16.0f;
        }
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, (RectF) null, (float[]) null));
        shapeDrawable.getPaint().setColor(l2b.d.a.g);
        r1e.setBackground(shapeDrawable);
        r1e.setThemeDepended(m1e.b);
        ct.G(r1e, 300, new ck1(this, 1));
        this.G0 = r1e;
        addView(appCompatImageView);
        addView(appCompatTextView);
        addView(appCompatTextView2);
        addView(oneMeButton);
        addView(r1e);
        pj3 h = ct.h(this);
        int id = appCompatImageView.getId();
        h.e(id, 3, 0, 3);
        float f2 = (float) 16;
        tr1.u(f2, vo4.c().getDisplayMetrics().density, new ila(h, 3, id, 4));
        h.e(id, 7, 0, 7);
        h.e(id, 6, 0, 6);
        h.e(id, 4, appCompatTextView.getId(), 3);
        h.j(id).d.W = 2;
        int id2 = appCompatTextView.getId();
        h.e(id2, 3, appCompatImageView.getId(), 4);
        tr1.u(f2, vo4.c().getDisplayMetrics().density, new ila(h, 3, id2, 4));
        h.e(id2, 7, 0, 7);
        tr1.u(f2, vo4.c().getDisplayMetrics().density, new ila(h, 7, id2, 4));
        h.e(id2, 6, 0, 6);
        new ila(h, 6, id2, 4).e(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2));
        h.e(id2, 4, appCompatTextView2.getId(), 3);
        int id3 = appCompatTextView2.getId();
        h.e(id3, 3, appCompatTextView.getId(), 4);
        tr1.u((float) 8, vo4.c().getDisplayMetrics().density, new ila(h, 3, id3, 4));
        h.e(id3, 6, 0, 6);
        tr1.u(f2, vo4.c().getDisplayMetrics().density, new ila(h, 6, id3, 4));
        h.e(id3, 7, 0, 7);
        new ila(h, 7, id3, 4).e(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2));
        h.e(id3, 4, oneMeButton.getId(), 3);
        new ila(h, 4, id3, 4).e(MathKt.roundToInt(((float) 5) * vo4.c().getDisplayMetrics().density));
        int id4 = oneMeButton.getId();
        h.e(id4, 3, appCompatTextView2.getId(), 4);
        tr1.u((float) 24, vo4.c().getDisplayMetrics().density, new ila(h, 3, id4, 4));
        h.e(id4, 6, 0, 6);
        tr1.u(f2, vo4.c().getDisplayMetrics().density, new ila(h, 6, id4, 4));
        h.e(id4, 7, 0, 7);
        tr1.u(f2, vo4.c().getDisplayMetrics().density, new ila(h, 7, id4, 4));
        h.e(id4, 4, 0, 4);
        new ila(h, 4, id4, 4).e(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2));
        int id5 = r1e.getId();
        h.e(id5, 6, 0, 6);
        tr1.u(f2, vo4.c().getDisplayMetrics().density, new ila(h, 6, id5, 4));
        h.e(id5, 7, 0, 7);
        tr1.u(f2, vo4.c().getDisplayMetrics().density, new ila(h, 7, id5, 4));
        h.e(id5, 4, 0, 4);
        new ila(h, 4, id5, 4).e(MathKt.roundToInt(((float) 112) * vo4.c().getDisplayMetrics().density));
        h.a(this);
    }

    public final void setListener(dk1 dk1) {
        this.E0 = dk1;
    }
}
