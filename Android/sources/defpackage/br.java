package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.math.MathKt;

/* renamed from: br  reason: default package */
public final class br extends ConstraintLayout implements phf {
    public final AppCompatTextView E0;
    public final AppCompatImageView F0;

    public br(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, (AttributeSet) null);
        appCompatTextView.setId(mna.c);
        appCompatTextView.setGravity(8388611);
        puf.i.b(appCompatTextView, uy4.b);
        js9 js9 = fu4.k;
        appCompatTextView.setTextColor(js9.e(appCompatTextView.getContext()).f().getText().e);
        this.E0 = appCompatTextView;
        AppCompatImageView appCompatImageView = new AppCompatImageView(context, (AttributeSet) null);
        appCompatImageView.setId(mna.b);
        float f = (float) 24;
        appCompatImageView.setLayoutParams(new fj3(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density)));
        js9.e(appCompatImageView.getContext()).f().getIcon().getClass();
        appCompatImageView.setImageTintList(ColorStateList.valueOf(-16745729));
        appCompatImageView.setImageResource(cad.n);
        this.F0 = appCompatImageView;
        setId(mna.a);
        setLayoutParams(new ViewGroup.LayoutParams(-1, MathKt.roundToInt(((float) 48) * vo4.c().getDisplayMetrics().density)));
        setBackgroundColor(js9.e(getContext()).f().c().f);
        addView(appCompatTextView);
        addView(appCompatImageView);
        pj3 h = ct.h(this);
        int id = appCompatImageView.getId();
        h.e(id, 3, 0, 3);
        h.e(id, 4, 0, 4);
        h.e(id, 6, 0, 6);
        ila ila = new ila(h, 6, id, 4);
        float f2 = (float) 12;
        ila.e(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2));
        int id2 = appCompatTextView.getId();
        h.e(id2, 3, 0, 3);
        h.e(id2, 4, 0, 4);
        h.e(id2, 6, appCompatImageView.getId(), 7);
        new ila(h, 6, id2, 4).e(MathKt.roundToInt(f2 * vo4.c().getDisplayMetrics().density));
        h.a(this);
    }

    public final void onThemeChanged(k2b k2b) {
        setBackgroundColor(k2b.c().f);
        AppCompatImageView appCompatImageView = this.F0;
        k2b.getIcon().getClass();
        appCompatImageView.setImageTintList(ColorStateList.valueOf(-16745729));
        this.E0.setTextColor(k2b.getText().e);
    }

    public void setSelected(boolean z) {
        this.F0.setVisibility(z ^ true ? 4 : 0);
    }

    public final void setTitle(CharSequence charSequence) {
        this.E0.setText(charSequence);
    }
}
