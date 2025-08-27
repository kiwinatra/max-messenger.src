package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* renamed from: j4e  reason: default package */
public final class j4e {
    public static final s0d m = new s0d(0.5f);
    public b59 a = new w8d();
    public b59 b = new w8d();
    public b59 c = new w8d();
    public b59 d = new w8d();
    public m04 e = new d0(c44.DEFAULT_ASPECT_RATIO);
    public m04 f = new d0(c44.DEFAULT_ASPECT_RATIO);
    public m04 g = new d0(c44.DEFAULT_ASPECT_RATIO);
    public m04 h = new d0(c44.DEFAULT_ASPECT_RATIO);
    public mz4 i = new Object();
    public mz4 j = new Object();
    public mz4 k = new Object();
    public mz4 l = new Object();

    public static ypg a(Context context, int i2, int i3, m04 m04) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i2);
        if (i3 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i3);
        }
        TypedArray obtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(tnc.ShapeAppearance);
        try {
            int i4 = obtainStyledAttributes.getInt(tnc.ShapeAppearance_cornerFamily, 0);
            int i5 = obtainStyledAttributes.getInt(tnc.ShapeAppearance_cornerFamilyTopLeft, i4);
            int i6 = obtainStyledAttributes.getInt(tnc.ShapeAppearance_cornerFamilyTopRight, i4);
            int i7 = obtainStyledAttributes.getInt(tnc.ShapeAppearance_cornerFamilyBottomRight, i4);
            int i8 = obtainStyledAttributes.getInt(tnc.ShapeAppearance_cornerFamilyBottomLeft, i4);
            m04 c2 = c(obtainStyledAttributes, tnc.ShapeAppearance_cornerSize, m04);
            m04 c3 = c(obtainStyledAttributes, tnc.ShapeAppearance_cornerSizeTopLeft, c2);
            m04 c4 = c(obtainStyledAttributes, tnc.ShapeAppearance_cornerSizeTopRight, c2);
            m04 c5 = c(obtainStyledAttributes, tnc.ShapeAppearance_cornerSizeBottomRight, c2);
            m04 c6 = c(obtainStyledAttributes, tnc.ShapeAppearance_cornerSizeBottomLeft, c2);
            ypg ypg = new ypg();
            b59 i9 = o5a.i(i5);
            ypg.a = i9;
            ypg.d(i9);
            ypg.e = c3;
            b59 i10 = o5a.i(i6);
            ypg.b = i10;
            ypg.d(i10);
            ypg.f = c4;
            b59 i11 = o5a.i(i7);
            ypg.c = i11;
            ypg.d(i11);
            ypg.g = c5;
            b59 i12 = o5a.i(i8);
            ypg.d = i12;
            ypg.d(i12);
            ypg.h = c6;
            return ypg;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static ypg b(Context context, AttributeSet attributeSet, int i2, int i3) {
        d0 d0Var = new d0((float) 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, tnc.MaterialShape, i2, i3);
        int resourceId = obtainStyledAttributes.getResourceId(tnc.MaterialShape_shapeAppearance, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(tnc.MaterialShape_shapeAppearanceOverlay, 0);
        obtainStyledAttributes.recycle();
        return a(context, resourceId, resourceId2, d0Var);
    }

    public static m04 c(TypedArray typedArray, int i2, m04 m04) {
        TypedValue peekValue = typedArray.peekValue(i2);
        if (peekValue == null) {
            return m04;
        }
        int i3 = peekValue.type;
        return i3 == 5 ? new d0((float) TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics())) : i3 == 6 ? new s0d(peekValue.getFraction(1.0f, 1.0f)) : m04;
    }

    public final boolean d(RectF rectF) {
        Class<mz4> cls = mz4.class;
        boolean z = this.l.getClass().equals(cls) && this.j.getClass().equals(cls) && this.i.getClass().equals(cls) && this.k.getClass().equals(cls);
        float a2 = this.e.a(rectF);
        return z && ((this.f.a(rectF) > a2 ? 1 : (this.f.a(rectF) == a2 ? 0 : -1)) == 0 && (this.h.a(rectF) > a2 ? 1 : (this.h.a(rectF) == a2 ? 0 : -1)) == 0 && (this.g.a(rectF) > a2 ? 1 : (this.g.a(rectF) == a2 ? 0 : -1)) == 0) && ((this.b instanceof w8d) && (this.a instanceof w8d) && (this.c instanceof w8d) && (this.d instanceof w8d));
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [ypg, java.lang.Object] */
    public final ypg e() {
        ? obj = new Object();
        obj.a = this.a;
        obj.b = this.b;
        obj.c = this.c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f = this.f;
        obj.g = this.g;
        obj.h = this.h;
        obj.i = this.i;
        obj.j = this.j;
        obj.k = this.k;
        obj.l = this.l;
        return obj;
    }
}
