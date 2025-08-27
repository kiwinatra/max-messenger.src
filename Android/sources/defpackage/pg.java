package defpackage;

import android.graphics.drawable.ShapeDrawable;
import android.util.IntProperty;

/* renamed from: pg  reason: default package */
public final class pg extends IntProperty {
    public int a;

    public pg(String str, int i) {
        super(str);
        this.a = i;
    }

    public final Object get(Object obj) {
        ShapeDrawable shapeDrawable = (ShapeDrawable) obj;
        return Integer.valueOf(this.a);
    }

    public final void setValue(Object obj, int i) {
        ShapeDrawable shapeDrawable = (ShapeDrawable) obj;
        this.a = i;
    }
}
