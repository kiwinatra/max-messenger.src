package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;
import kotlin.jvm.functions.Function1;
import kotlin.math.MathKt;

/* renamed from: n2g  reason: default package */
public final class n2g extends ImageSpan implements phf {
    public final Context a;
    public final m2g b;
    public final boolean c;
    public final boolean o;
    public final Function1 v;
    public final Resources w;
    public l2g x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n2g(Context context, m2g m2g, boolean z, Function1 function1) {
        super(context, m2g == m2g.SMALL ? cad.h2 : cad.i2, 2);
        this.a = context;
        this.b = m2g;
        this.c = true;
        this.o = z;
        this.v = function1;
        this.w = Resources.getSystem();
        this.x = new l2g(context, m2g, function1);
        onThemeChanged(fu4.k.e(context).f());
    }

    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        int save = canvas.save();
        try {
            Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
            int i6 = fontMetricsInt.descent;
            float f2 = (float) 2;
            canvas.translate(f, (((float) (i4 + i6)) - (((float) (i6 - fontMetricsInt.ascent)) / f2)) - (((float) (this.x.getBounds().bottom - this.x.getBounds().top)) / f2));
            this.x.draw(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public final Drawable getDrawable() {
        return this.x;
    }

    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        m2g S = m5a.S(paint.getTextSize() / this.w.getDisplayMetrics().density);
        if (S != this.b) {
            this.x = new l2g(this.a, S, this.v);
        }
        int roundToInt = MathKt.roundToInt(((float) S.b) * vo4.c().getDisplayMetrics().density);
        int i3 = this.c ? roundToInt : 0;
        if (!this.o) {
            roundToInt = 0;
        }
        l2g l2g = this.x;
        float f = (float) S.a;
        l2g.setBounds(i3, 0, g63.b(f, vo4.c().getDisplayMetrics().density, i3), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f));
        return tr1.e(f, vo4.c().getDisplayMetrics().density, i3, roundToInt);
    }

    public final void onThemeChanged(k2b k2b) {
        l2g l2g = this.x;
        if (!(l2g instanceof l2g)) {
            l2g = null;
        }
        if (l2g != null) {
            l2g.onThemeChanged(k2b);
        }
    }
}
