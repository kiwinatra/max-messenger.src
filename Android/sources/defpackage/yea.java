package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.BitSet;
import java.util.LinkedHashMap;
import kotlin.math.MathKt;

/* renamed from: yea  reason: default package */
public final class yea extends ViewGroup implements phf {
    public final Path a = new Path();
    public final Rect b = new Rect();
    public final LinkedHashMap c = new LinkedHashMap();
    public xea o = new xea(0, false, false, false);
    public final BitSet v;
    public final wsa v0;
    public final int w;
    public final int x;
    public final ye8 y;
    public final ye8 z;

    public yea(Context context) {
        super(context, (AttributeSet) null);
        BitSet bitSet = new BitSet(3);
        this.v = bitSet;
        this.w = 1;
        this.x = 2;
        ye8 ye8 = new ye8(context);
        ye8.setId(dad.i0);
        ye8.setIcon(cad.m1);
        ye8.setFocusable(0);
        this.y = ye8;
        ye8 ye82 = new ye8(context);
        ye82.setId(dad.j0);
        ye82.setIcon(cad.U);
        ye82.setFocusable(0);
        float f = (float) 20;
        ye82.setLayoutParams(new ViewGroup.MarginLayoutParams(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density)));
        this.z = ye82;
        wsa wsa = new wsa(context);
        wsa.setId(dad.h0);
        wsa.setFocusable(0);
        this.v0 = wsa;
        addView(wsa);
        addView(ye8);
        addView(ye82);
        bitSet.set(0, bitSet.size(), false);
    }

    private final void setupMention(boolean z2) {
        BitSet bitSet = this.v;
        boolean z3 = false;
        bitSet.set(0, z2);
        if (!z2 && this.o.b) {
            z3 = true;
        }
        bitSet.set(this.w, z3);
        js9 js9 = fu4.k;
        ye8 ye8 = this.y;
        js9.f(ye8).c().a.getClass();
        ye8.setBackgroundColor(-16745729);
        js9.e(ye8.getContext()).f().getIcon().getClass();
        ye8.setIconColor(-1);
        requestLayout();
    }

    private final void setupReaction(boolean z2) {
        int i;
        this.v.set(this.w, z2 && !this.o.c);
        boolean z3 = this.o.d;
        js9 js9 = fu4.k;
        ye8 ye8 = this.z;
        k2b f = js9.f(ye8);
        if (z3) {
            i = f.getIcon().i;
        } else {
            f.getIcon().getClass();
            i = -1;
        }
        boolean z4 = this.o.d;
        k2b f2 = js9.e(ye8.getContext()).f();
        ye8.setBackgroundColor(z4 ? f2.c().a.g : f2.e().a);
        ye8.setIconColor(i);
        requestLayout();
    }

    public final void a(View view) {
        Path path = this.a;
        path.reset();
        int left = view.getLeft();
        int top = view.getTop();
        int right = view.getRight();
        int bottom = view.getBottom();
        Rect rect = this.b;
        rect.set(left, top, right, bottom);
        if (view instanceof ye8) {
            path.addCircle(rect.exactCenterX(), rect.exactCenterY(), ((float) Math.min(rect.width(), rect.height())) / 2.0f, Path.Direction.CCW);
        } else if (view instanceof wsa) {
            float f = (float) rect.left;
            float f2 = (float) rect.top;
            float f3 = (float) rect.right;
            float f4 = (float) rect.bottom;
            Path.Direction direction = Path.Direction.CCW;
            path.addRect(f, f2, f3, f4, direction);
            BitSet bitSet = this.v;
            ye8 ye8 = bitSet.get(0) ? this.y : bitSet.get(this.w) ? this.z : null;
            if (ye8 != null) {
                Rect rect2 = new Rect(ye8.getLeft(), ye8.getTop(), ye8.getRight(), ye8.getBottom());
                Path path2 = new Path();
                path2.addCircle(rect2.exactCenterX(), rect2.exactCenterY(), (((float) Math.min(rect2.width(), rect2.height())) / 2.0f) + ((float) MathKt.roundToInt(((float) 2) * vo4.c().getDisplayMetrics().density)), direction);
                path.op(path2, Path.Op.DIFFERENCE);
            }
        }
        Path path3 = (Path) this.c.get(view);
        if (path3 != null) {
            path3.set(path);
        }
    }

    public final void b(boolean z2, k2b k2b) {
        int i;
        u67 icon = k2b.getIcon();
        if (z2) {
            i = icon.i;
        } else {
            icon.getClass();
            i = -1;
        }
        int i2 = z2 ? k2b.c().a.g : k2b.e().a;
        ye8 ye8 = this.z;
        ye8.setBackgroundColor(i2);
        ye8.setIconColor(i);
        k2b.c().a.getClass();
        ye8 ye82 = this.y;
        ye82.setBackgroundColor(-16745729);
        k2b.getIcon().getClass();
        ye82.setIconColor(-1);
        this.v0.setAppearance(z2 ? qsa.c : qsa.a);
        invalidate();
    }

    public final void c(boolean z2) {
        xea xea = this.o;
        boolean z3 = xea.c;
        this.o = xea.a(xea, 0, false, z2, false, 11);
        if (z3 != z2) {
            setupMention(z2);
        }
    }

    public final void d(boolean z2) {
        xea xea = this.o;
        boolean z3 = xea.b;
        this.o = xea.a(xea, 0, z2, false, false, 13);
        if (z3 != z2) {
            setupReaction(z2);
        }
    }

    public final boolean drawChild(Canvas canvas, View view, long j) {
        Object obj = this.c.get(view);
        if (obj != null) {
            int save = canvas.save();
            canvas.clipPath((Path) obj);
            try {
                return super.drawChild(canvas, view, j);
            } finally {
                canvas.restoreToCount(save);
            }
        } else {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        int paddingStart = getPaddingStart();
        BitSet bitSet = this.v;
        if (bitSet.get(this.w)) {
            int paddingStart2 = getPaddingStart();
            int paddingTop = getPaddingTop();
            int paddingStart3 = getPaddingStart();
            ye8 ye8 = this.z;
            ct.A(paddingStart2, paddingTop, ye8.getMeasuredWidth() + paddingStart3, ye8.getMeasuredHeight() + getPaddingTop(), this.z, this);
            a(ye8);
            paddingStart += ye8.getMeasuredWidth();
        }
        if (bitSet.get(0)) {
            int paddingStart4 = getPaddingStart();
            int paddingTop2 = getPaddingTop();
            int paddingStart5 = getPaddingStart();
            ye8 ye82 = this.y;
            ct.A(paddingStart4, paddingTop2, ye82.getMeasuredWidth() + paddingStart5, ye82.getMeasuredHeight() + getPaddingTop(), this.y, this);
            a(ye82);
            paddingStart += ye82.getMeasuredWidth();
        }
        int i5 = paddingStart;
        if (bitSet.get(this.x)) {
            int measuredWidth = getMeasuredWidth() - getPaddingEnd();
            int paddingTop3 = getPaddingTop();
            int paddingTop4 = getPaddingTop();
            wsa wsa = this.v0;
            ct.A(i5, paddingTop3, measuredWidth, wsa.getMeasuredHeight() + paddingTop4, this.v0, this);
            a(wsa);
        }
    }

    public final void onMeasure(int i, int i2) {
        int i3;
        BitSet bitSet = this.v;
        int i4 = 8;
        int i5 = bitSet.get(0) ? 0 : 8;
        ye8 ye8 = this.y;
        ye8.setVisibility(i5);
        int i6 = bitSet.get(this.w) ? 0 : 8;
        ye8 ye82 = this.z;
        ye82.setVisibility(i6);
        int i7 = this.x;
        if (bitSet.get(i7)) {
            i4 = 0;
        }
        wsa wsa = this.v0;
        wsa.setVisibility(i4);
        float f = (float) 20;
        int roundToInt = MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f);
        if (bitSet.get(0)) {
            ye8.measure(View.MeasureSpec.makeMeasureSpec(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), 1073741824), View.MeasureSpec.makeMeasureSpec(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), 1073741824));
            i3 = ye8.getMeasuredWidth();
        } else {
            i3 = 0;
        }
        if (ye82.getVisibility() == 0) {
            ye82.measure(View.MeasureSpec.makeMeasureSpec(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), 1073741824), View.MeasureSpec.makeMeasureSpec(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), 1073741824));
            i3 += ye82.getMeasuredWidth();
        }
        if (bitSet.get(i7)) {
            wsa.measure(0, View.MeasureSpec.makeMeasureSpec(MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density), 1073741824));
            i3 += wsa.getMeasuredWidth();
        }
        setMeasuredDimension(i3, roundToInt);
    }

    public final void onThemeChanged(k2b k2b) {
        b(this.o.d, k2b);
        this.v0.f(k2b);
    }

    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        this.c.put(view, new Path());
    }

    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.c.remove(view);
    }
}
