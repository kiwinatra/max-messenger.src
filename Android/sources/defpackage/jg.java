package defpackage;

import android.graphics.drawable.ShapeDrawable;
import android.util.FloatProperty;

/* renamed from: jg  reason: default package */
public final class jg extends FloatProperty {
    public float a;

    public jg(String str, float f) {
        super(str);
        this.a = f;
    }

    public final Object get(Object obj) {
        ShapeDrawable shapeDrawable = (ShapeDrawable) obj;
        return Float.valueOf(this.a);
    }

    public final void setValue(Object obj, float f) {
        ShapeDrawable shapeDrawable = (ShapeDrawable) obj;
        this.a = f;
    }
}
