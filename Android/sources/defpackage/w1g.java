package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import java.util.ArrayDeque;
import org.apache.http.cookie.ClientCookie;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import ru.ok.tamtam.nano.Protos;

/* renamed from: w1g  reason: default package */
public final class w1g extends n1g {
    public static final PorterDuff.Mode X = PorterDuff.Mode.SRC_IN;
    public u1g b;
    public PorterDuffColorFilter c;
    public ColorFilter o;
    public boolean v;
    public boolean w = true;
    public final float[] x = new float[9];
    public final Matrix y = new Matrix();
    public final Rect z = new Rect();

    /* JADX WARNING: type inference failed for: r0v5, types: [android.graphics.drawable.Drawable$ConstantState, u1g] */
    public w1g() {
        ? constantState = new Drawable.ConstantState();
        constantState.c = null;
        constantState.d = X;
        constantState.b = new t1g();
        this.b = constantState;
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public final boolean canApplyTheme() {
        Drawable drawable = this.a;
        if (drawable == null) {
            return false;
        }
        ru4.b(drawable);
        return false;
    }

    public final void draw(Canvas canvas) {
        Paint paint;
        Canvas canvas2 = canvas;
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.draw(canvas2);
            return;
        }
        Rect rect = this.z;
        copyBounds(rect);
        if (rect.width() > 0 && rect.height() > 0) {
            ColorFilter colorFilter = this.o;
            if (colorFilter == null) {
                colorFilter = this.c;
            }
            Matrix matrix = this.y;
            canvas2.getMatrix(matrix);
            float[] fArr = this.x;
            matrix.getValues(fArr);
            float abs = Math.abs(fArr[0]);
            float abs2 = Math.abs(fArr[4]);
            float abs3 = Math.abs(fArr[1]);
            float abs4 = Math.abs(fArr[3]);
            if (!(abs3 == c44.DEFAULT_ASPECT_RATIO && abs4 == c44.DEFAULT_ASPECT_RATIO)) {
                abs = 1.0f;
                abs2 = 1.0f;
            }
            int min = Math.min(2048, (int) (((float) rect.width()) * abs));
            int min2 = Math.min(2048, (int) (((float) rect.height()) * abs2));
            if (min > 0 && min2 > 0) {
                int save = canvas.save();
                canvas2.translate((float) rect.left, (float) rect.top);
                if (isAutoMirrored() && su4.a(this) == 1) {
                    canvas2.translate((float) rect.width(), c44.DEFAULT_ASPECT_RATIO);
                    canvas2.scale(-1.0f, 1.0f);
                }
                rect.offsetTo(0, 0);
                u1g u1g = this.b;
                Bitmap bitmap = u1g.f;
                if (!(bitmap != null && min == bitmap.getWidth() && min2 == u1g.f.getHeight())) {
                    u1g.f = Bitmap.createBitmap(min, min2, Bitmap.Config.ARGB_8888);
                    u1g.k = true;
                }
                if (!this.w) {
                    u1g u1g2 = this.b;
                    u1g2.f.eraseColor(0);
                    Canvas canvas3 = new Canvas(u1g2.f);
                    t1g t1g = u1g2.b;
                    t1g.a(t1g.g, t1g.p, canvas3, min, min2);
                } else {
                    u1g u1g3 = this.b;
                    if (!(!u1g3.k && u1g3.g == u1g3.c && u1g3.h == u1g3.d && u1g3.j == u1g3.e && u1g3.i == u1g3.b.getRootAlpha())) {
                        u1g u1g4 = this.b;
                        u1g4.f.eraseColor(0);
                        Canvas canvas4 = new Canvas(u1g4.f);
                        t1g t1g2 = u1g4.b;
                        t1g2.a(t1g2.g, t1g.p, canvas4, min, min2);
                        u1g u1g5 = this.b;
                        u1g5.g = u1g5.c;
                        u1g5.h = u1g5.d;
                        u1g5.i = u1g5.b.getRootAlpha();
                        u1g5.j = u1g5.e;
                        u1g5.k = false;
                    }
                }
                u1g u1g6 = this.b;
                if (u1g6.b.getRootAlpha() >= 255 && colorFilter == null) {
                    paint = null;
                } else {
                    if (u1g6.l == null) {
                        Paint paint2 = new Paint();
                        u1g6.l = paint2;
                        paint2.setFilterBitmap(true);
                    }
                    u1g6.l.setAlpha(u1g6.b.getRootAlpha());
                    u1g6.l.setColorFilter(colorFilter);
                    paint = u1g6.l;
                }
                canvas2.drawBitmap(u1g6.f, (Rect) null, rect, paint);
                canvas2.restoreToCount(save);
            }
        }
    }

    public final int getAlpha() {
        Drawable drawable = this.a;
        return drawable != null ? drawable.getAlpha() : this.b.b.getRootAlpha();
    }

    public final int getChangingConfigurations() {
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return this.b.getChangingConfigurations() | super.getChangingConfigurations();
    }

    public final ColorFilter getColorFilter() {
        Drawable drawable = this.a;
        return drawable != null ? ru4.c(drawable) : this.o;
    }

    public final Drawable.ConstantState getConstantState() {
        if (this.a != null) {
            return new v1g(this.a.getConstantState());
        }
        this.b.a = getChangingConfigurations();
        return this.b;
    }

    public final int getIntrinsicHeight() {
        Drawable drawable = this.a;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.b.b.i;
    }

    public final int getIntrinsicWidth() {
        Drawable drawable = this.a;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.b.b.h;
    }

    public final int getOpacity() {
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, (Resources.Theme) null);
        }
    }

    public final void invalidateSelf() {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    public final boolean isAutoMirrored() {
        Drawable drawable = this.a;
        return drawable != null ? drawable.isAutoMirrored() : this.b.e;
    }

    public final boolean isStateful() {
        ColorStateList colorStateList;
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (!super.isStateful()) {
            u1g u1g = this.b;
            if (u1g != null) {
                t1g t1g = u1g.b;
                if (t1g.n == null) {
                    t1g.n = Boolean.valueOf(t1g.g.a());
                }
                if (t1g.n.booleanValue() || ((colorStateList = this.b.c) != null && colorStateList.isStateful())) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [android.graphics.drawable.Drawable$ConstantState, u1g] */
    public final Drawable mutate() {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.v && super.mutate() == this) {
            u1g u1g = this.b;
            ? constantState = new Drawable.ConstantState();
            constantState.c = null;
            constantState.d = X;
            if (u1g != null) {
                constantState.a = u1g.a;
                t1g t1g = new t1g(u1g.b);
                constantState.b = t1g;
                if (u1g.b.e != null) {
                    t1g.e = new Paint(u1g.b.e);
                }
                if (u1g.b.d != null) {
                    constantState.b.d = new Paint(u1g.b.d);
                }
                constantState.c = u1g.c;
                constantState.d = u1g.d;
                constantState.e = u1g.e;
            }
            this.b = constantState;
            this.v = true;
        }
        return this;
    }

    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    public final boolean onStateChange(int[] iArr) {
        boolean z2;
        PorterDuff.Mode mode;
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        u1g u1g = this.b;
        ColorStateList colorStateList = u1g.c;
        if (colorStateList == null || (mode = u1g.d) == null) {
            z2 = false;
        } else {
            this.c = a(colorStateList, mode);
            invalidateSelf();
            z2 = true;
        }
        t1g t1g = u1g.b;
        if (t1g.n == null) {
            t1g.n = Boolean.valueOf(t1g.g.a());
        }
        if (t1g.n.booleanValue()) {
            boolean b2 = u1g.b.g.b(iArr);
            u1g.k |= b2;
            if (b2) {
                invalidateSelf();
                return true;
            }
        }
        return z2;
    }

    public final void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    public final void setAlpha(int i) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.b.b.getRootAlpha() != i) {
            this.b.b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    public final void setAutoMirrored(boolean z2) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setAutoMirrored(z2);
        } else {
            this.b.e = z2;
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        this.o = colorFilter;
        invalidateSelf();
    }

    public final void setTint(int i) {
        Drawable drawable = this.a;
        if (drawable != null) {
            f6e.D(drawable, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.a;
        if (drawable != null) {
            ru4.h(drawable, colorStateList);
            return;
        }
        u1g u1g = this.b;
        if (u1g.c != colorStateList) {
            u1g.c = colorStateList;
            this.c = a(colorStateList, u1g.d);
            invalidateSelf();
        }
    }

    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.a;
        if (drawable != null) {
            ru4.i(drawable, mode);
            return;
        }
        u1g u1g = this.b;
        if (u1g.d != mode) {
            u1g.d = mode;
            this.c = a(u1g.c, mode);
            invalidateSelf();
        }
    }

    public final boolean setVisible(boolean z2, boolean z3) {
        Drawable drawable = this.a;
        return drawable != null ? drawable.setVisible(z2, z3) : super.setVisible(z2, z3);
    }

    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    /* JADX WARNING: type inference failed for: r9v39, types: [p1g, s1g, java.lang.Object] */
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int i;
        t1g t1g;
        int i2;
        int i3;
        boolean z2;
        int i4;
        boolean z3;
        int i5;
        int i6;
        Paint.Join join;
        Paint.Cap cap;
        int i7;
        Paint.Join join2;
        Resources resources2 = resources;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        AttributeSet attributeSet2 = attributeSet;
        Resources.Theme theme2 = theme;
        Drawable drawable = this.a;
        if (drawable != null) {
            ru4.d(drawable, resources2, xmlPullParser2, attributeSet2, theme2);
            return;
        }
        u1g u1g = this.b;
        u1g.b = new t1g();
        TypedArray F = b0h.F(resources2, theme2, attributeSet2, o54.a);
        u1g u1g2 = this.b;
        t1g t1g2 = u1g2.b;
        if (!b0h.D(xmlPullParser2, "tintMode")) {
            i = -1;
        } else {
            i = F.getInt(6, -1);
        }
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        int i8 = 3;
        if (i == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (i != 5) {
            if (i != 9) {
                switch (i) {
                    case Protos.Attaches.Attach.LOCATION /*14*/:
                        mode = PorterDuff.Mode.MULTIPLY;
                        break;
                    case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                        mode = PorterDuff.Mode.SCREEN;
                        break;
                    case 16:
                        mode = PorterDuff.Mode.ADD;
                        break;
                }
            } else {
                mode = PorterDuff.Mode.SRC_ATOP;
            }
        }
        u1g2.d = mode;
        int i9 = 1;
        ColorStateList colorStateList = null;
        boolean z4 = false;
        if (b0h.D(xmlPullParser2, "tint")) {
            TypedValue typedValue = new TypedValue();
            F.getValue(1, typedValue);
            int i10 = typedValue.type;
            if (i10 == 2) {
                throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
            } else if (i10 < 28 || i10 > 31) {
                Resources resources3 = F.getResources();
                int resourceId = F.getResourceId(1, 0);
                ThreadLocal threadLocal = v53.a;
                try {
                    colorStateList = v53.a(resources3, resources3.getXml(resourceId), theme2);
                } catch (Exception unused) {
                }
            } else {
                colorStateList = ColorStateList.valueOf(typedValue.data);
            }
        }
        ColorStateList colorStateList2 = colorStateList;
        if (colorStateList2 != null) {
            u1g2.c = colorStateList2;
        }
        boolean z5 = u1g2.e;
        if (b0h.D(xmlPullParser2, "autoMirrored")) {
            z5 = F.getBoolean(5, z5);
        }
        u1g2.e = z5;
        float f = t1g2.j;
        if (b0h.D(xmlPullParser2, "viewportWidth")) {
            f = F.getFloat(7, f);
        }
        t1g2.j = f;
        float f2 = t1g2.k;
        if (b0h.D(xmlPullParser2, "viewportHeight")) {
            f2 = F.getFloat(8, f2);
        }
        t1g2.k = f2;
        if (t1g2.j <= c44.DEFAULT_ASPECT_RATIO) {
            throw new XmlPullParserException(F.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        } else if (f2 > c44.DEFAULT_ASPECT_RATIO) {
            t1g2.h = F.getDimension(3, t1g2.h);
            float dimension = F.getDimension(2, t1g2.i);
            t1g2.i = dimension;
            if (t1g2.h <= c44.DEFAULT_ASPECT_RATIO) {
                throw new XmlPullParserException(F.getPositionDescription() + "<vector> tag requires width > 0");
            } else if (dimension > c44.DEFAULT_ASPECT_RATIO) {
                float alpha = t1g2.getAlpha();
                if (b0h.D(xmlPullParser2, "alpha")) {
                    alpha = F.getFloat(4, alpha);
                }
                t1g2.setAlpha(alpha);
                String string = F.getString(0);
                if (string != null) {
                    t1g2.m = string;
                    t1g2.o.put(string, t1g2);
                }
                F.recycle();
                u1g.a = getChangingConfigurations();
                u1g.k = true;
                u1g u1g3 = this.b;
                t1g t1g3 = u1g3.b;
                ArrayDeque arrayDeque = new ArrayDeque();
                arrayDeque.push(t1g3.g);
                int eventType = xmlPullParser.getEventType();
                int depth = xmlPullParser.getDepth() + 1;
                boolean z6 = true;
                while (eventType != i9 && (xmlPullParser.getDepth() >= depth || eventType != i8)) {
                    if (eventType == 2) {
                        String name = xmlPullParser.getName();
                        q1g q1g = (q1g) arrayDeque.peek();
                        boolean equals = ClientCookie.PATH_ATTR.equals(name);
                        i2 = depth;
                        ts tsVar = t1g3.o;
                        if (equals) {
                            ? s1g = new s1g();
                            s1g.f = c44.DEFAULT_ASPECT_RATIO;
                            s1g.h = 1.0f;
                            s1g.i = 1.0f;
                            s1g.j = c44.DEFAULT_ASPECT_RATIO;
                            s1g.k = 1.0f;
                            s1g.l = c44.DEFAULT_ASPECT_RATIO;
                            Paint.Cap cap2 = Paint.Cap.BUTT;
                            s1g.m = cap2;
                            Paint.Join join3 = Paint.Join.MITER;
                            s1g.n = join3;
                            t1g = t1g3;
                            s1g.o = 4.0f;
                            TypedArray F2 = b0h.F(resources2, theme2, attributeSet2, o54.c);
                            if (b0h.D(xmlPullParser2, "pathData")) {
                                Paint.Cap cap3 = cap2;
                                String string2 = F2.getString(0);
                                if (string2 != null) {
                                    s1g.b = string2;
                                }
                                String string3 = F2.getString(2);
                                if (string3 != null) {
                                    s1g.a = b59.o(string3);
                                }
                                s1g.g = b0h.y(F2, xmlPullParser2, theme2, "fillColor", 1);
                                float f3 = s1g.i;
                                if (b0h.D(xmlPullParser2, "fillAlpha")) {
                                    f3 = F2.getFloat(12, f3);
                                }
                                s1g.i = f3;
                                if (!b0h.D(xmlPullParser2, "strokeLineCap")) {
                                    i6 = -1;
                                } else {
                                    i6 = F2.getInt(8, -1);
                                }
                                Paint.Cap cap4 = s1g.m;
                                if (i6 != 0) {
                                    join = join3;
                                    cap = i6 != 1 ? i6 != 2 ? cap4 : Paint.Cap.SQUARE : Paint.Cap.ROUND;
                                } else {
                                    join = join3;
                                    cap = cap3;
                                }
                                s1g.m = cap;
                                if (!b0h.D(xmlPullParser2, "strokeLineJoin")) {
                                    i7 = -1;
                                } else {
                                    i7 = F2.getInt(9, -1);
                                }
                                Paint.Join join4 = s1g.n;
                                if (i7 != 0) {
                                    join2 = i7 != 1 ? i7 != 2 ? join4 : Paint.Join.BEVEL : Paint.Join.ROUND;
                                } else {
                                    join2 = join;
                                }
                                s1g.n = join2;
                                float f4 = s1g.o;
                                if (b0h.D(xmlPullParser2, "strokeMiterLimit")) {
                                    f4 = F2.getFloat(10, f4);
                                }
                                s1g.o = f4;
                                s1g.e = b0h.y(F2, xmlPullParser2, theme2, "strokeColor", 3);
                                float f5 = s1g.h;
                                if (b0h.D(xmlPullParser2, "strokeAlpha")) {
                                    f5 = F2.getFloat(11, f5);
                                }
                                s1g.h = f5;
                                float f6 = s1g.f;
                                if (b0h.D(xmlPullParser2, "strokeWidth")) {
                                    f6 = F2.getFloat(4, f6);
                                }
                                s1g.f = f6;
                                float f7 = s1g.k;
                                if (b0h.D(xmlPullParser2, "trimPathEnd")) {
                                    f7 = F2.getFloat(6, f7);
                                }
                                s1g.k = f7;
                                float f8 = s1g.l;
                                if (b0h.D(xmlPullParser2, "trimPathOffset")) {
                                    f8 = F2.getFloat(7, f8);
                                }
                                s1g.l = f8;
                                float f9 = s1g.j;
                                if (b0h.D(xmlPullParser2, "trimPathStart")) {
                                    f9 = F2.getFloat(5, f9);
                                }
                                s1g.j = f9;
                                int i11 = s1g.c;
                                if (b0h.D(xmlPullParser2, "fillType")) {
                                    i11 = F2.getInt(13, i11);
                                }
                                s1g.c = i11;
                            }
                            F2.recycle();
                            q1g.b.add(s1g);
                            if (s1g.getPathName() != null) {
                                tsVar.put(s1g.getPathName(), s1g);
                            }
                            u1g3.a |= s1g.d;
                            z3 = false;
                            i3 = 1;
                            z6 = false;
                        } else {
                            t1g = t1g3;
                            if ("clip-path".equals(name)) {
                                s1g s1g2 = new s1g();
                                if (b0h.D(xmlPullParser2, "pathData")) {
                                    TypedArray F3 = b0h.F(resources2, theme2, attributeSet2, o54.d);
                                    String string4 = F3.getString(0);
                                    if (string4 != null) {
                                        s1g2.b = string4;
                                    }
                                    String string5 = F3.getString(1);
                                    if (string5 != null) {
                                        s1g2.a = b59.o(string5);
                                    }
                                    if (!b0h.D(xmlPullParser2, "fillType")) {
                                        i5 = 0;
                                    } else {
                                        i5 = F3.getInt(2, 0);
                                    }
                                    s1g2.c = i5;
                                    F3.recycle();
                                }
                                q1g.b.add(s1g2);
                                if (s1g2.getPathName() != null) {
                                    tsVar.put(s1g2.getPathName(), s1g2);
                                }
                                u1g3.a = s1g2.d | u1g3.a;
                            } else if ("group".equals(name)) {
                                q1g q1g2 = new q1g();
                                TypedArray F4 = b0h.F(resources2, theme2, attributeSet2, o54.b);
                                float f10 = q1g2.c;
                                if (b0h.D(xmlPullParser2, "rotation")) {
                                    f10 = F4.getFloat(5, f10);
                                }
                                q1g2.c = f10;
                                i3 = 1;
                                q1g2.d = F4.getFloat(1, q1g2.d);
                                q1g2.e = F4.getFloat(2, q1g2.e);
                                float f11 = q1g2.f;
                                if (b0h.D(xmlPullParser2, "scaleX")) {
                                    f11 = F4.getFloat(3, f11);
                                }
                                q1g2.f = f11;
                                float f12 = q1g2.g;
                                if (b0h.D(xmlPullParser2, "scaleY")) {
                                    f12 = F4.getFloat(4, f12);
                                }
                                q1g2.g = f12;
                                float f13 = q1g2.h;
                                if (b0h.D(xmlPullParser2, "translateX")) {
                                    f13 = F4.getFloat(6, f13);
                                }
                                q1g2.h = f13;
                                float f14 = q1g2.i;
                                if (b0h.D(xmlPullParser2, "translateY")) {
                                    f14 = F4.getFloat(7, f14);
                                }
                                q1g2.i = f14;
                                z3 = false;
                                String string6 = F4.getString(0);
                                if (string6 != null) {
                                    q1g2.l = string6;
                                }
                                q1g2.c();
                                F4.recycle();
                                q1g.b.add(q1g2);
                                arrayDeque.push(q1g2);
                                if (q1g2.getGroupName() != null) {
                                    tsVar.put(q1g2.getGroupName(), q1g2);
                                }
                                u1g3.a = q1g2.k | u1g3.a;
                            }
                            z3 = false;
                            i3 = 1;
                        }
                        z2 = z3;
                        i4 = 3;
                    } else {
                        t1g = t1g3;
                        i2 = depth;
                        i3 = i9;
                        z2 = z4;
                        i4 = 3;
                        if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                            arrayDeque.pop();
                        }
                    }
                    eventType = xmlPullParser.next();
                    i8 = i4;
                    z4 = z2;
                    i9 = i3;
                    depth = i2;
                    t1g3 = t1g;
                }
                if (!z6) {
                    this.c = a(u1g.c, u1g.d);
                    return;
                }
                throw new XmlPullParserException("no path defined");
            } else {
                throw new XmlPullParserException(F.getPositionDescription() + "<vector> tag requires height > 0");
            }
        } else {
            throw new XmlPullParserException(F.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
    }

    public w1g(u1g u1g) {
        this.b = u1g;
        this.c = a(u1g.c, u1g.d);
    }
}
