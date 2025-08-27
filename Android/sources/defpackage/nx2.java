package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import kotlin.math.MathKt;

/* renamed from: nx2  reason: default package */
public final class nx2 extends View implements phf {
    public final h13 a;
    public final ue7 b;

    /* JADX WARNING: type inference failed for: r9v4, types: [java.lang.Object, ye] */
    public nx2(Context context) {
        super(context);
        h13 h13 = new h13(context, (AttributeSet) null);
        float f = (float) 28;
        h13.h = MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f);
        h13.j = 0;
        h13.c = new int[]{fu4.k.e(context).f().d().f.g};
        h13.b = MathKt.roundToInt(((float) 20) * vo4.c().getDisplayMetrics().density);
        h13.a = MathKt.roundToInt(((float) 3) * vo4.c().getDisplayMetrics().density);
        h13.g = MathKt.roundToInt(((float) 2) * vo4.c().getDisplayMetrics().density);
        this.a = h13;
        ue7 ue7 = new ue7(context, h13, new qv4(h13), new d13(h13));
        Resources resources = context.getResources();
        int i = qfc.indeterminate_static;
        w1g w1g = new w1g();
        ThreadLocal threadLocal = h4d.a;
        w1g.a = c4d.a(resources, i, (Resources.Theme) null);
        new v1g(w1g.a.getConstantState());
        ue7.w0 = w1g;
        ue7.c(new Object());
        ue7.setBounds(0, 0, MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f));
        ue7.d(true, true, true);
        ue7.setCallback(this);
        this.b = ue7;
        setLayerType(2, (Paint) null);
        float f2 = (float) 10;
        setPadding(0, MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2), 0, MathKt.roundToInt(f2 * vo4.c().getDisplayMetrics().density));
        setLayoutParams(new ViewGroup.LayoutParams(-1, g63.b(f, vo4.c().getDisplayMetrics().density, getPaddingBottom() + getPaddingTop())));
    }

    /* JADX INFO: finally extract failed */
    public final void onDraw(Canvas canvas) {
        ue7 ue7 = this.b;
        int save = canvas.save();
        canvas.translate((((float) getWidth()) / 2.0f) - (((float) ue7.getBounds().width()) / 2.0f), (((float) getHeight()) / 2.0f) - (((float) ue7.getBounds().height()) / 2.0f));
        try {
            ue7.draw(canvas);
            canvas.restoreToCount(save);
            ue7.invalidateSelf();
        } catch (Throwable th) {
            canvas.restoreToCount(save);
            throw th;
        }
    }

    public final void onThemeChanged(k2b k2b) {
        this.a.c = new int[]{k2b.d().f.g};
    }

    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.b;
    }
}
