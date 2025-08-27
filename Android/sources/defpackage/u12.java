package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.math.MathKt;

/* renamed from: u12  reason: default package */
public final class u12 extends ConstraintLayout implements phf {
    public final AppCompatTextView E0;
    public final AppCompatTextView F0;
    public final AppCompatImageView G0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public u12(Context context) {
        super(context);
        Context context2 = context;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context2, (AttributeSet) null);
        appCompatTextView.setId(jxa.u);
        appCompatTextView.setLayoutParams(new ViewGroup.LayoutParams(0, -2));
        appCompatTextView.setTextAlignment(2);
        appCompatTextView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        appCompatTextView.setEllipsize(truncateAt);
        appCompatTextView.setText(context2.getText(lxa.D));
        js9 js9 = fu4.k;
        appCompatTextView.setTextColor(js9.e(appCompatTextView.getContext()).f().getText().f);
        ogf ogf = tr2.a;
        puf.f.b(appCompatTextView, uy4.b);
        this.E0 = appCompatTextView;
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(context2, (AttributeSet) null);
        appCompatTextView2.setId(jxa.v);
        appCompatTextView2.setLayoutParams(new ViewGroup.LayoutParams(0, -2));
        appCompatTextView2.setTextAlignment(2);
        appCompatTextView2.setSingleLine(true);
        appCompatTextView2.setEllipsize(truncateAt);
        js9.e(appCompatTextView2.getContext()).f().getText().getClass();
        appCompatTextView2.setTextColor(-16745729);
        puf.g.b(appCompatTextView2, uy4.b);
        this.F0 = appCompatTextView2;
        AppCompatImageView appCompatImageView = new AppCompatImageView(context2, (AttributeSet) null);
        appCompatImageView.setId(jxa.w);
        float f = (float) 24;
        appCompatImageView.setLayoutParams(new ViewGroup.LayoutParams(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density)));
        appCompatImageView.setImageResource(cad.j0);
        float f2 = (float) 2;
        appCompatImageView.setPadding(MathKt.roundToInt(((double) vo4.c().getDisplayMetrics().density) * 3.5d), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2), MathKt.roundToInt(((double) vo4.c().getDisplayMetrics().density) * 3.5d), MathKt.roundToInt(f2 * vo4.c().getDisplayMetrics().density));
        js9.e(appCompatImageView.getContext()).f().getText().getClass();
        appCompatImageView.setImageTintList(ColorStateList.valueOf(-16745729));
        this.G0 = appCompatImageView;
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        float f3 = (float) 12;
        float f4 = (float) 8;
        setPadding(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f3), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f4), MathKt.roundToInt(f3 * vo4.c().getDisplayMetrics().density), MathKt.roundToInt(f4 * vo4.c().getDisplayMetrics().density));
        addView(appCompatTextView);
        addView(appCompatTextView2);
        addView(appCompatImageView);
        pj3 h = ct.h(this);
        int id = appCompatTextView.getId();
        h.e(id, 6, 0, 6);
        h.e(id, 3, 0, 3);
        h.e(id, 4, appCompatTextView2.getId(), 3);
        float f5 = (float) 1;
        new ila(h, 4, id, 4).e(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f5));
        h.e(id, 7, appCompatImageView.getId(), 6);
        ila ila = new ila(h, 7, id, 4);
        float f6 = (float) 16;
        ila.e(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f6));
        int id2 = appCompatTextView2.getId();
        h.e(id2, 6, 0, 6);
        h.e(id2, 3, appCompatTextView.getId(), 4);
        tr1.u(f5, vo4.c().getDisplayMetrics().density, new ila(h, 3, id2, 4));
        h.e(id2, 4, 0, 4);
        h.e(id2, 7, appCompatImageView.getId(), 6);
        new ila(h, 7, id2, 4).e(MathKt.roundToInt(f6 * vo4.c().getDisplayMetrics().density));
        int id3 = appCompatImageView.getId();
        h.e(id3, 3, 0, 3);
        h.e(id3, 4, 0, 4);
        h.e(id3, 7, 0, 7);
        h.a(this);
        onThemeChanged(js9.e(getContext()).f());
    }

    public final void onThemeChanged(k2b k2b) {
        js9 js9 = fu4.k;
        this.E0.setTextColor(js9.e(getContext()).f().getText().f);
        js9.e(getContext()).f().getText().getClass();
        this.F0.setTextColor(-16745729);
        k2b.getIcon().getClass();
        this.G0.setImageTintList(ColorStateList.valueOf(-16745729));
    }

    public final void setLink(CharSequence charSequence) {
        this.F0.setText(charSequence);
    }

    public final void setOnShareLinkClickListener(Function1<? super CharSequence, Unit> function1) {
        ct.G(this.G0, 300, new pb(this, function1));
    }
}
