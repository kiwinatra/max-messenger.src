package defpackage;

import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import kotlin.jvm.internal.Ref;

/* renamed from: oy6  reason: default package */
public final class oy6 implements wcg {
    public final /* synthetic */ Ref.BooleanRef a;
    public final /* synthetic */ Path b;
    public final /* synthetic */ Path c;
    public final /* synthetic */ Rect d;
    public final /* synthetic */ Rect e;
    public final /* synthetic */ Integer f;
    public final /* synthetic */ Rect g;
    public final /* synthetic */ RectF h;
    public final /* synthetic */ Float i;
    public final /* synthetic */ float[] j;
    public final /* synthetic */ RectF k;
    public final /* synthetic */ View l;

    public oy6(Ref.BooleanRef booleanRef, Path path, Path path2, Rect rect, Rect rect2, Integer num, Rect rect3, RectF rectF, Float f2, float[] fArr, RectF rectF2, View view) {
        this.a = booleanRef;
        this.b = path;
        this.c = path2;
        this.d = rect;
        this.e = rect2;
        this.f = num;
        this.g = rect3;
        this.h = rectF;
        this.i = f2;
        this.j = fArr;
        this.k = rectF2;
        this.l = view;
    }

    public final void a() {
        this.b.reset();
        this.c.reset();
        this.a.element = false;
        Drawable background = this.l.getBackground();
        if (background != null) {
            background.invalidateSelf();
        }
    }

    public final void c(Rect rect, View view) {
        View view2;
        this.a.element = true;
        Path path = this.b;
        path.reset();
        Path path2 = this.c;
        path2.reset();
        Rect rect2 = this.d;
        rect2.set(rect);
        Rect rect3 = py6.b;
        Rect rect4 = this.e;
        if (rect4 != rect3) {
            rect2.left += rect4.left;
            rect2.top += rect4.top;
            rect2.right -= rect4.right;
            rect2.bottom -= rect4.bottom;
        }
        Integer num = this.f;
        if (num == null) {
            view2 = (View) view.getParent();
        } else {
            view2 = y7e.m(view, num.intValue());
            if (view2 == null) {
                view2 = (View) view.getParent();
            }
        }
        Rect rect5 = this.g;
        rcg.d(rect5, view2);
        RectF rectF = this.h;
        rectF.set(rect2);
        rectF.top = (float) Math.max(rect2.top, rect5.top);
        rectF.bottom = (float) Math.max(rect2.bottom, rect5.top);
        if (this.i != null) {
            Path.Direction direction = Path.Direction.CCW;
            path2.addRect(rectF, direction);
            RectF rectF2 = this.k;
            rectF2.set(rect2);
            path.addRoundRect(rectF2, this.j, direction);
            path.op(path2, Path.Op.INTERSECT);
        } else {
            path.addRect(rectF, Path.Direction.CCW);
        }
        Drawable background = this.l.getBackground();
        if (background != null) {
            background.invalidateSelf();
        }
    }
}
