package defpackage;

import android.graphics.Matrix;
import android.util.Property;
import android.widget.ImageView;

/* renamed from: v97  reason: default package */
public final class v97 extends Property {
    public final Matrix a = new Matrix();

    public v97() {
        super(Matrix.class, "imageMatrixProperty");
    }

    public final Object get(Object obj) {
        Matrix matrix = this.a;
        matrix.set(((ImageView) obj).getImageMatrix());
        return matrix;
    }

    public final void set(Object obj, Object obj2) {
        ((ImageView) obj).setImageMatrix((Matrix) obj2);
    }
}
