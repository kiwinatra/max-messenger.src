package defpackage;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import kotlin.properties.Delegates;
import kotlin.reflect.KProperty;

/* renamed from: m7a  reason: default package */
public final class m7a extends f7e {
    public static final /* synthetic */ KProperty[] j = {rae.s(m7a.class, "cornerRadius", "getCornerRadius()F", 0)};
    public final Path g = new Path();
    public final RectF h = new RectF();
    public final bl i;

    public m7a() {
        Delegates delegates = Delegates.INSTANCE;
        this.i = new bl(this);
    }

    public final void draw(Canvas canvas) {
        RectF rectF = this.h;
        rectF.set(getBounds());
        Path path = this.g;
        path.reset();
        KProperty[] kPropertyArr = j;
        KProperty kProperty = kPropertyArr[0];
        bl blVar = this.i;
        path.addRoundRect(rectF, ((Number) blVar.getValue(this, kProperty)).floatValue(), ((Number) blVar.getValue(this, kPropertyArr[0])).floatValue(), Path.Direction.CW);
        canvas.clipPath(path);
        super.draw(canvas);
    }
}
