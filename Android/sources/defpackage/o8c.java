package defpackage;

import android.graphics.drawable.ShapeDrawable;
import android.util.FloatProperty;

/* renamed from: o8c  reason: default package */
public final class o8c extends FloatProperty {
    public float a;

    public /* synthetic */ o8c(String str) {
        this(str, c44.DEFAULT_ASPECT_RATIO);
    }

    public final Object get(Object obj) {
        ShapeDrawable shapeDrawable = (ShapeDrawable) obj;
        return Float.valueOf(this.a);
    }

    public final void setValue(Object obj, float f) {
        ShapeDrawable shapeDrawable = (ShapeDrawable) obj;
        this.a = f;
    }

    public o8c(String str, float f) {
        super(str);
        this.a = f;
    }
}
