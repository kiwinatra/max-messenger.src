package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import kotlin.math.MathKt;

/* renamed from: cob  reason: default package */
public final class cob extends LayerDrawable implements phf {
    public final Context a;
    public final int b;
    public final int c;

    public cob(Context context) {
        super(new Drawable[0]);
        this.a = context;
        int addLayer = addLayer(new ShapeDrawable(new OvalShape()));
        this.b = addLayer;
        int addLayer2 = addLayer(new RippleDrawable(ColorStateList.valueOf(-16777216), ew3.b(context, cad.O0), (Drawable) null));
        this.c = addLayer2;
        float f = (float) 44;
        setLayerSize(addLayer, MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density));
        setLayerGravity(addLayer, 17);
        float f2 = (float) 24;
        setLayerSize(addLayer2, MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2), MathKt.roundToInt(f2 * vo4.c().getDisplayMetrics().density));
        setLayerGravity(addLayer2, 17);
        onThemeChanged(fu4.k.e(context).f());
    }

    public final void a(int i) {
        Context context = this.a;
        setDrawable(this.c, new RippleDrawable(ColorStateList.valueOf(-16777216), ew3.b(context, i), (Drawable) null));
        onThemeChanged(fu4.k.e(context).f());
    }

    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        setHotspot((float) rect.centerX(), (float) rect.centerY());
    }

    public final void onThemeChanged(k2b k2b) {
        Paint paint = ((ShapeDrawable) getDrawable(this.b)).getPaint();
        js9 js9 = fu4.k;
        Context context = this.a;
        js9.e(context).f().a().l().a.getClass();
        paint.setColor(1543503872);
        RippleDrawable rippleDrawable = (RippleDrawable) getDrawable(this.c);
        rippleDrawable.setColor(ColorStateList.valueOf(js9.e(context).f().b().a.b));
        Drawable drawable = rippleDrawable.getDrawable(0);
        js9.e(context).f().getIcon().getClass();
        ru4.g(drawable, -1);
    }
}
