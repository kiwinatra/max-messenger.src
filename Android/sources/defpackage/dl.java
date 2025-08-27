package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: dl  reason: default package */
public final class dl extends bq5 implements dge, ze {
    public final long x;
    public final cl y;

    public dl(long j, cl clVar) {
        super((Drawable) clVar, vp5.a, true);
        this.x = j;
        this.y = clVar;
    }

    public final Drawable a() {
        return this.y;
    }

    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        canvas.save();
        canvas.translate(f, (float) i3);
        canvas.clipRect(this.c);
        sq6 sq6 = cl.x0;
        cl clVar = this.y;
        clVar.a(canvas, c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, (float) clVar.getBounds().height(), paint);
        canvas.restore();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dl)) {
            return false;
        }
        dl dlVar = (dl) obj;
        return this.x == dlVar.x && Intrinsics.areEqual((Object) this.y, (Object) dlVar.y);
    }

    public final Drawable getDrawable() {
        return this.y;
    }

    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        int size = super.getSize(paint, charSequence, i, i2, fontMetricsInt);
        cl clVar = this.y;
        if (size <= 0) {
            z68.c(dl.class.getName(), "Empty size when try get size from span", new Object[0]);
            size = clVar.getBounds().right;
        }
        clVar.getClass();
        if (yk.$EnumSwitchMapping$0[((xk) clVar.x.getValue(clVar, cl.y0[0])).ordinal()] != 1 || (clVar.c instanceof ij)) {
            return size;
        }
        return 0;
    }

    public final int hashCode() {
        int hashCode = dl.class.hashCode();
        return (Long.hashCode(this.x) * 31) + (this.y.hashCode() * 31) + hashCode;
    }
}
