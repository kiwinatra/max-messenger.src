package defpackage;

import android.graphics.RectF;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;

/* renamed from: ay5  reason: default package */
public final class ay5 extends kbe {
    public static final ShapeDrawable D0;

    static {
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        float f = vo4.c().getDisplayMetrics().density * 16.0f;
        float[] fArr = new float[8];
        for (int i = 0; i < 8; i++) {
            fArr[i] = f;
        }
        shapeDrawable.setShape(new RoundRectShape(fArr, (RectF) null, (float[]) null));
        D0 = shapeDrawable;
    }

    public final void M(lz7 lz7) {
    }
}
