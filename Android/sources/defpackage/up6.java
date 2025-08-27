package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import java.util.Arrays;

/* renamed from: up6  reason: default package */
public abstract class up6 extends ov4 {
    public up6(Context context) {
        super(context);
        k(context, (AttributeSet) null);
    }

    /* JADX WARNING: type inference failed for: r8v1, types: [qb6, s90, android.graphics.drawable.Drawable] */
    public final void k(Context context, AttributeSet attributeSet) {
        int i;
        int i2;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        float f;
        int i3;
        int i4;
        int i5;
        boolean z5;
        Context context2 = context;
        AttributeSet attributeSet2 = attributeSet;
        tf6.P();
        tf6.P();
        tp6 tp6 = new tp6(context.getResources());
        if (attributeSet2 != null) {
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet2, qnc.GenericDraweeHierarchy);
            try {
                int indexCount = obtainStyledAttributes.getIndexCount();
                boolean z6 = true;
                int i6 = 0;
                boolean z7 = true;
                boolean z8 = true;
                boolean z9 = true;
                boolean z10 = true;
                boolean z11 = true;
                boolean z12 = true;
                boolean z13 = true;
                int i7 = 0;
                int i8 = 0;
                while (i6 < indexCount) {
                    try {
                        int index = obtainStyledAttributes.getIndex(i6);
                        if (index == qnc.GenericDraweeHierarchy_actualImageScaleType) {
                            tp6.l = f6e.u(obtainStyledAttributes, index);
                        } else if (index == qnc.GenericDraweeHierarchy_placeholderImage) {
                            tp6.d = f6e.p(context2, obtainStyledAttributes, index);
                        } else {
                            i3 = indexCount;
                            if (index == qnc.GenericDraweeHierarchy_pressedStateOverlayImage) {
                                Drawable p = f6e.p(context2, obtainStyledAttributes, index);
                                if (p == null) {
                                    tp6.o = null;
                                } else {
                                    StateListDrawable stateListDrawable = new StateListDrawable();
                                    stateListDrawable.addState(new int[]{16842919}, p);
                                    tp6.o = stateListDrawable;
                                }
                            } else if (index == qnc.GenericDraweeHierarchy_progressBarImage) {
                                tp6.j = f6e.p(context2, obtainStyledAttributes, index);
                            } else if (index == qnc.GenericDraweeHierarchy_fadeDuration) {
                                tp6.b = obtainStyledAttributes.getInt(index, 0);
                            } else if (index == qnc.GenericDraweeHierarchy_viewAspectRatio) {
                                tp6.c = obtainStyledAttributes.getFloat(index, c44.DEFAULT_ASPECT_RATIO);
                            } else if (index == qnc.GenericDraweeHierarchy_placeholderImageScaleType) {
                                tp6.e = f6e.u(obtainStyledAttributes, index);
                            } else if (index == qnc.GenericDraweeHierarchy_retryImage) {
                                tp6.f = f6e.p(context2, obtainStyledAttributes, index);
                            } else if (index == qnc.GenericDraweeHierarchy_retryImageScaleType) {
                                tp6.g = f6e.u(obtainStyledAttributes, index);
                            } else if (index == qnc.GenericDraweeHierarchy_failureImage) {
                                tp6.h = f6e.p(context2, obtainStyledAttributes, index);
                            } else if (index == qnc.GenericDraweeHierarchy_failureImageScaleType) {
                                tp6.i = f6e.u(obtainStyledAttributes, index);
                            } else if (index == qnc.GenericDraweeHierarchy_progressBarImageScaleType) {
                                tp6.k = f6e.u(obtainStyledAttributes, index);
                            } else {
                                if (index == qnc.GenericDraweeHierarchy_progressBarAutoRotateInterval) {
                                    i7 = obtainStyledAttributes.getInteger(index, i7);
                                } else {
                                    int i9 = i7;
                                    if (index == qnc.GenericDraweeHierarchy_backgroundImage) {
                                        tp6.m = f6e.p(context2, obtainStyledAttributes, index);
                                    } else if (index == qnc.GenericDraweeHierarchy_overlayImage) {
                                        Drawable p2 = f6e.p(context2, obtainStyledAttributes, index);
                                        if (p2 == null) {
                                            tp6.n = null;
                                        } else {
                                            tp6.n = Arrays.asList(new Drawable[]{p2});
                                        }
                                    } else if (index == qnc.GenericDraweeHierarchy_roundAsCircle) {
                                        f6e.t(tp6).b = obtainStyledAttributes.getBoolean(index, false);
                                    } else {
                                        if (index == qnc.GenericDraweeHierarchy_roundedCornerRadius) {
                                            i8 = obtainStyledAttributes.getDimensionPixelSize(index, i8);
                                        } else {
                                            int i10 = i8;
                                            if (index == qnc.GenericDraweeHierarchy_roundTopLeft) {
                                                z7 = obtainStyledAttributes.getBoolean(index, z7);
                                            } else if (index == qnc.GenericDraweeHierarchy_roundTopRight) {
                                                z9 = obtainStyledAttributes.getBoolean(index, z9);
                                            } else if (index == qnc.GenericDraweeHierarchy_roundBottomLeft) {
                                                z13 = obtainStyledAttributes.getBoolean(index, z13);
                                            } else if (index == qnc.GenericDraweeHierarchy_roundBottomRight) {
                                                z11 = obtainStyledAttributes.getBoolean(index, z11);
                                            } else if (index == qnc.GenericDraweeHierarchy_roundTopStart) {
                                                z8 = obtainStyledAttributes.getBoolean(index, z8);
                                            } else if (index == qnc.GenericDraweeHierarchy_roundTopEnd) {
                                                z10 = obtainStyledAttributes.getBoolean(index, z10);
                                            } else if (index == qnc.GenericDraweeHierarchy_roundBottomStart) {
                                                z6 = obtainStyledAttributes.getBoolean(index, z6);
                                            } else if (index == qnc.GenericDraweeHierarchy_roundBottomEnd) {
                                                z12 = obtainStyledAttributes.getBoolean(index, z12);
                                            } else if (index == qnc.GenericDraweeHierarchy_roundWithOverlayColor) {
                                                b9d t = f6e.t(tp6);
                                                i5 = i10;
                                                t.d = obtainStyledAttributes.getColor(index, 0);
                                                t.a = 1;
                                                i4 = i9;
                                                int i11 = i4;
                                                i8 = i5;
                                                i7 = i11;
                                            } else {
                                                i5 = i10;
                                                if (index == qnc.GenericDraweeHierarchy_roundingBorderWidth) {
                                                    b9d t2 = f6e.t(tp6);
                                                    float dimensionPixelSize = (float) obtainStyledAttributes.getDimensionPixelSize(index, 0);
                                                    t2.getClass();
                                                    if (dimensionPixelSize >= c44.DEFAULT_ASPECT_RATIO) {
                                                        i4 = i9;
                                                        z5 = true;
                                                    } else {
                                                        i4 = i9;
                                                        z5 = false;
                                                    }
                                                    cvg.m("the border width cannot be < 0", z5);
                                                    t2.e = dimensionPixelSize;
                                                } else {
                                                    i4 = i9;
                                                    if (index == qnc.GenericDraweeHierarchy_roundingBorderColor) {
                                                        f6e.t(tp6).f = obtainStyledAttributes.getColor(index, 0);
                                                    } else if (index == qnc.GenericDraweeHierarchy_roundingBorderPadding) {
                                                        b9d t3 = f6e.t(tp6);
                                                        float dimensionPixelSize2 = (float) obtainStyledAttributes.getDimensionPixelSize(index, 0);
                                                        t3.getClass();
                                                        cvg.m("the padding cannot be < 0", dimensionPixelSize2 >= c44.DEFAULT_ASPECT_RATIO);
                                                        t3.g = dimensionPixelSize2;
                                                    }
                                                }
                                                int i112 = i4;
                                                i8 = i5;
                                                i7 = i112;
                                            }
                                            i8 = i10;
                                        }
                                        i7 = i9;
                                    }
                                    i5 = i8;
                                    i4 = i9;
                                    int i1122 = i4;
                                    i8 = i5;
                                    i7 = i1122;
                                }
                                i6++;
                                context2 = context;
                                indexCount = i3;
                            }
                            int i12 = i8;
                            i4 = i7;
                            i5 = i12;
                            int i11222 = i4;
                            i8 = i5;
                            i7 = i11222;
                            i6++;
                            context2 = context;
                            indexCount = i3;
                        }
                        i3 = indexCount;
                        int i122 = i8;
                        i4 = i7;
                        i5 = i122;
                        int i112222 = i4;
                        i8 = i5;
                        i7 = i112222;
                        i6++;
                        context2 = context;
                        indexCount = i3;
                    } catch (Throwable th) {
                        th = th;
                        obtainStyledAttributes.recycle();
                        int layoutDirection = context.getResources().getConfiguration().getLayoutDirection();
                        throw th;
                    }
                }
                int i13 = i8;
                int i14 = i7;
                int i15 = i13;
                obtainStyledAttributes.recycle();
                if (context.getResources().getConfiguration().getLayoutDirection() == 1) {
                    z4 = z7 && z10;
                    z3 = z9 && z8;
                    z2 = z11 && z6;
                    z = z13 && z12;
                    i = i15;
                    i2 = i14;
                } else {
                    z4 = z7 && z8;
                    z3 = z9 && z10;
                    i = i15;
                    i2 = i14;
                    boolean z14 = z11 && z12;
                    z = z13 && z6;
                    z2 = z14;
                }
            } catch (Throwable th2) {
                th = th2;
                obtainStyledAttributes.recycle();
                int layoutDirection2 = context.getResources().getConfiguration().getLayoutDirection();
                throw th;
            }
        } else {
            z4 = true;
            z3 = true;
            z2 = true;
            z = true;
            i2 = 0;
            i = 0;
        }
        if (tp6.j == null || i2 <= 0) {
            f = c44.DEFAULT_ASPECT_RATIO;
        } else {
            Drawable drawable = tp6.j;
            drawable.getClass();
            ? qb6 = new qb6(drawable);
            f = c44.DEFAULT_ASPECT_RATIO;
            qb6.x = c44.DEFAULT_ASPECT_RATIO;
            qb6.y = false;
            qb6.v = i2;
            qb6.w = true;
            tp6.j = qb6;
        }
        if (i > 0) {
            f6e.t(tp6).c(z4 ? (float) i : f, z3 ? (float) i : f, z2 ? (float) i : f, z ? (float) i : f);
        }
        tf6.P();
        setAspectRatio(tp6.c);
        setHierarchy(tp6.a());
        tf6.P();
    }

    public up6(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        k(context, attributeSet);
    }

    public up6(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        k(context, attributeSet);
    }
}
