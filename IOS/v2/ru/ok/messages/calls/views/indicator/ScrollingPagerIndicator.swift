package ru.ok.messages.calls.views.indicator;

import android.animation.ArgbEvaluator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class ScrollingPagerIndicator extends View {
    public int A0;
    public boolean B0;
    public ij3 C0;
    public sb0 D0;
    public boolean E0;
    public int a;
    public int b;
    public int c;
    public int o;
    public int v;
    public SparseArray v0;
    public int w;
    public int w0;
    public float x;
    public final Paint x0;
    public float y;
    public final ArgbEvaluator y0 = new ArgbEvaluator();
    public float z;
    public int z0;

    public ScrollingPagerIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, wnc.ScrollingPagerIndicator, 0, knc.ScrollingPagerIndicator);
        int color = obtainStyledAttributes.getColor(wnc.ScrollingPagerIndicator_spi_dotColor, 0);
        this.z0 = color;
        this.A0 = obtainStyledAttributes.getColor(wnc.ScrollingPagerIndicator_spi_dotSelectedColor, color);
        this.b = obtainStyledAttributes.getDimensionPixelSize(wnc.ScrollingPagerIndicator_spi_dotSize, 0);
        this.c = obtainStyledAttributes.getDimensionPixelSize(wnc.ScrollingPagerIndicator_spi_dotSelectedSize, 0);
        this.o = obtainStyledAttributes.getDimensionPixelSize(wnc.ScrollingPagerIndicator_spi_dotSpacing, 0) + this.b;
        this.B0 = obtainStyledAttributes.getBoolean(wnc.ScrollingPagerIndicator_spi_looped, false);
        int i = obtainStyledAttributes.getInt(wnc.ScrollingPagerIndicator_spi_visibleDotCount, 0);
        setVisibleDotCount(i);
        this.w = obtainStyledAttributes.getInt(wnc.ScrollingPagerIndicator_spi_visibleDotThreshold, 2);
        obtainStyledAttributes.recycle();
        Paint paint = new Paint();
        this.x0 = paint;
        paint.setAntiAlias(true);
        if (isInEditMode()) {
            setDotCount(i);
            d(c44.DEFAULT_ASPECT_RATIO, i / 2);
        }
    }

    private int getDotCount() {
        return (!this.B0 || this.w0 <= this.v) ? this.w0 : this.a;
    }

    public final void a(float f, int i) {
        int i2 = this.w0;
        int i3 = this.v;
        if (i2 <= i3) {
            this.x = c44.DEFAULT_ASPECT_RATIO;
        } else if (this.B0 || i2 <= i3) {
            this.x = ((((float) this.o) * f) + c(this.a / 2)) - (this.y / 2.0f);
        } else {
            this.x = ((((float) this.o) * f) + c(i)) - (this.y / 2.0f);
            int i4 = this.v / 2;
            float c2 = c((getDotCount() - 1) - i4);
            if ((this.y / 2.0f) + this.x < c(i4)) {
                this.x = c(i4) - (this.y / 2.0f);
                return;
            }
            float f2 = this.x;
            float f3 = this.y;
            if ((f3 / 2.0f) + f2 > c2) {
                this.x = c2 - (f3 / 2.0f);
            }
        }
    }

    public final void b(Object obj, sb0 sb0) {
        sb0 sb02 = this.D0;
        if (sb02 != null) {
            ((tyc) sb02.e).D((t45) sb02.g);
            ((RecyclerView) sb02.c).u0((k61) sb02.f);
            this.D0 = null;
            this.C0 = null;
        }
        this.E0 = false;
        RecyclerView recyclerView = (RecyclerView) obj;
        if (recyclerView.getLayoutManager() instanceof LinearLayoutManager) {
            sb0.d = (LinearLayoutManager) recyclerView.getLayoutManager();
            sb0.c = recyclerView;
            tyc adapter = recyclerView.getAdapter();
            sb0.e = adapter;
            sb0.b = this;
            t45 t45 = new t45(1, sb0);
            sb0.g = t45;
            adapter.A(t45);
            sb0.e();
            k61 k61 = new k61(1, sb0);
            sb0.f = k61;
            ((RecyclerView) sb0.c).m(k61);
            this.D0 = sb0;
            this.C0 = new ij3(6, this, obj, sb0, false);
            return;
        }
        throw new IllegalStateException("Only LinearLayoutManager is supported");
    }

    public final float c(int i) {
        return this.z + ((float) (i * this.o));
    }

    public final void d(float f, int i) {
        int i2;
        if (f < c44.DEFAULT_ASPECT_RATIO || f > 1.0f) {
            throw new IllegalArgumentException(String.format("Offset is %f. Offset must be [0, 1]", new Object[]{Float.valueOf(f)}));
        } else if (i < 0 || (i != 0 && i >= this.w0)) {
            throw new IndexOutOfBoundsException(String.format("Page is %d. Page must be [0, dots count = %d)", new Object[]{Integer.valueOf(i), Integer.valueOf(getDotCount())}));
        } else {
            if (!this.B0 || ((i2 = this.w0) <= this.v && i2 > 1)) {
                this.v0.clear();
                f(f, i);
                int i3 = this.w0;
                if (i < i3 - 1) {
                    f(1.0f - f, i + 1);
                } else if (i3 > 1) {
                    f(1.0f - f, 0);
                }
                invalidate();
            }
            a(f, i);
            invalidate();
        }
    }

    public final void e() {
        ij3 ij3 = this.C0;
        if (ij3 != null) {
            ij3.run();
            invalidate();
        }
    }

    public final void f(float f, int i) {
        if (this.v0 != null && getDotCount() != 0) {
            float abs = 1.0f - Math.abs(f);
            if (abs == c44.DEFAULT_ASPECT_RATIO) {
                this.v0.remove(i);
            } else {
                this.v0.put(i, Float.valueOf(abs));
            }
        }
    }

    public int getDotColor() {
        return this.z0;
    }

    public int getSelectedDotColor() {
        return this.A0;
    }

    public int getVisibleDotCount() {
        return this.v;
    }

    public int getVisibleDotThreshold() {
        return this.w;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00bb, code lost:
        if (r9 < r7) goto L_0x00da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00d8, code lost:
        if (r9 < r7) goto L_0x00da;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onDraw(android.graphics.Canvas r15) {
        /*
            r14 = this;
            int r0 = r14.getDotCount()
            int r1 = r14.w
            if (r0 >= r1) goto L_0x0009
            return
        L_0x0009:
            int r1 = r14.o
            int r2 = r14.c
            int r3 = r14.b
            int r3 = r2 - r3
            int r3 = r3 / 2
            int r3 = r3 + r1
            float r3 = (float) r3
            r4 = 1060320051(0x3f333333, float:0.7)
            float r3 = r3 * r4
            int r2 = r2 / 2
            float r2 = (float) r2
            r4 = 1062956471(0x3f5b6db7, float:0.85714287)
            float r5 = (float) r1
            float r5 = r5 * r4
            float r4 = r14.x
            float r6 = r14.z
            float r6 = r4 - r6
            int r6 = (int) r6
            int r6 = r6 / r1
            float r1 = r14.y
            float r4 = r4 + r1
            float r1 = r14.c(r6)
            float r4 = r4 - r1
            int r1 = (int) r4
            int r4 = r14.o
            int r1 = r1 / r4
            int r1 = r1 + r6
            if (r6 != 0) goto L_0x003e
            int r4 = r1 + 1
            if (r4 <= r0) goto L_0x003e
            int r1 = r0 + -1
        L_0x003e:
            if (r6 > r1) goto L_0x010a
            float r4 = r14.c(r6)
            float r7 = r14.x
            int r8 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r8 < 0) goto L_0x0106
            float r8 = r14.y
            float r9 = r7 + r8
            int r9 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r9 >= 0) goto L_0x0106
            boolean r9 = r14.B0
            r10 = 0
            r11 = 1073741824(0x40000000, float:2.0)
            if (r9 == 0) goto L_0x0083
            int r9 = r14.w0
            int r12 = r14.v
            if (r9 <= r12) goto L_0x0083
            float r8 = r8 / r11
            float r8 = r8 + r7
            float r7 = r8 - r5
            int r7 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r7 < 0) goto L_0x0071
            int r7 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r7 > 0) goto L_0x0071
            float r7 = r4 - r8
            float r7 = r7 + r5
            float r10 = r7 / r5
            goto L_0x0091
        L_0x0071:
            int r7 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r7 <= 0) goto L_0x0091
            float r7 = r8 + r5
            int r7 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r7 >= 0) goto L_0x0091
            float r7 = r4 - r8
            float r7 = r7 / r5
            r8 = 1065353216(0x3f800000, float:1.0)
            float r10 = r8 - r7
            goto L_0x0091
        L_0x0083:
            android.util.SparseArray r7 = r14.v0
            java.lang.Object r7 = r7.get(r6)
            java.lang.Float r7 = (java.lang.Float) r7
            if (r7 == 0) goto L_0x0091
            float r10 = r7.floatValue()
        L_0x0091:
            int r7 = r14.b
            float r8 = (float) r7
            int r9 = r14.c
            int r9 = r9 - r7
            float r7 = (float) r9
            float r7 = r7 * r10
            float r7 = r7 + r8
            int r8 = r14.w0
            int r9 = r14.v
            if (r8 <= r9) goto L_0x00db
            boolean r8 = r14.B0
            if (r8 != 0) goto L_0x00ac
            if (r6 == 0) goto L_0x00aa
            int r8 = r0 + -1
            if (r6 != r8) goto L_0x00ac
        L_0x00aa:
            r8 = r2
            goto L_0x00ad
        L_0x00ac:
            r8 = r3
        L_0x00ad:
            float r9 = r14.x
            float r12 = r4 - r9
            int r12 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r12 >= 0) goto L_0x00be
            float r9 = r4 - r9
            float r9 = r9 * r7
            float r9 = r9 / r8
            int r8 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r8 >= 0) goto L_0x00db
            goto L_0x00da
        L_0x00be:
            float r9 = r4 - r9
            int r12 = r15.getWidth()
            float r12 = (float) r12
            float r12 = r12 - r8
            int r9 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r9 <= 0) goto L_0x00db
            float r9 = -r4
            float r12 = r14.x
            float r9 = r9 + r12
            int r12 = r15.getWidth()
            float r12 = (float) r12
            float r9 = r9 + r12
            float r9 = r9 * r7
            float r9 = r9 / r8
            int r8 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r8 >= 0) goto L_0x00db
        L_0x00da:
            r7 = r9
        L_0x00db:
            android.graphics.Paint r8 = r14.x0
            android.animation.ArgbEvaluator r9 = r14.y0
            int r12 = r14.z0
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            int r13 = r14.A0
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            java.lang.Object r9 = r9.evaluate(r10, r12, r13)
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            r8.setColor(r9)
            float r9 = r14.x
            float r4 = r4 - r9
            int r9 = r14.getMeasuredHeight()
            int r9 = r9 / 2
            float r9 = (float) r9
            float r7 = r7 / r11
            r15.drawCircle(r4, r9, r7, r8)
        L_0x0106:
            int r6 = r6 + 1
            goto L_0x003e
        L_0x010a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.messages.calls.views.indicator.ScrollingPagerIndicator.onDraw(android.graphics.Canvas):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0037  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r4, int r5) {
        /*
            r3 = this;
            boolean r4 = r3.isInEditMode()
            if (r4 == 0) goto L_0x0011
            int r4 = r3.v
            int r4 = r4 + -1
            int r0 = r3.o
            int r4 = r4 * r0
            int r0 = r3.c
        L_0x000f:
            int r4 = r4 + r0
            goto L_0x0023
        L_0x0011:
            int r4 = r3.w0
            int r0 = r3.v
            if (r4 < r0) goto L_0x001b
            float r4 = r3.y
            int r4 = (int) r4
            goto L_0x0023
        L_0x001b:
            int r4 = r4 + -1
            int r0 = r3.o
            int r4 = r4 * r0
            int r0 = r3.c
            goto L_0x000f
        L_0x0023:
            int r0 = android.view.View.MeasureSpec.getMode(r5)
            int r5 = android.view.View.MeasureSpec.getSize(r5)
            int r1 = r3.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r2) goto L_0x0037
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 == r2) goto L_0x003b
            r5 = r1
            goto L_0x003b
        L_0x0037:
            int r5 = java.lang.Math.min(r1, r5)
        L_0x003b:
            r3.setMeasuredDimension(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.messages.calls.views.indicator.ScrollingPagerIndicator.onMeasure(int, int):void");
    }

    public void setCurrentPosition(int i) {
        if (i != 0 && (i < 0 || i >= this.w0)) {
            throw new IndexOutOfBoundsException("Position must be [0, adapter.getItemCount()]");
        } else if (this.w0 != 0) {
            a(c44.DEFAULT_ASPECT_RATIO, i);
            if (!this.B0 || this.w0 < this.v) {
                this.v0.clear();
                this.v0.put(i, Float.valueOf(1.0f));
                invalidate();
            }
        }
    }

    public void setDotColor(int i) {
        this.z0 = i;
        invalidate();
    }

    public void setDotCount(int i) {
        if (this.w0 != i || !this.E0) {
            this.w0 = i;
            this.E0 = true;
            this.v0 = new SparseArray();
            if (i < this.w) {
                requestLayout();
                invalidate();
                return;
            }
            this.z = (!this.B0 || this.w0 <= this.v) ? (float) (this.c / 2) : c44.DEFAULT_ASPECT_RATIO;
            this.y = (float) (((this.v - 1) * this.o) + this.c);
            requestLayout();
            invalidate();
        }
    }

    public void setDotNormalSize(int i) {
        this.b = i;
        if (this.C0 != null) {
            e();
        } else {
            requestLayout();
        }
    }

    public void setDotSelectedSize(int i) {
        this.c = i;
        if (this.C0 != null) {
            e();
        } else {
            requestLayout();
        }
    }

    public void setLooped(boolean z2) {
        this.B0 = z2;
        e();
        invalidate();
    }

    public void setSelectedDotColor(int i) {
        this.A0 = i;
        invalidate();
    }

    public void setSpaceBetweenDotCenters(int i) {
        this.o = i;
        if (this.C0 != null) {
            e();
        } else {
            requestLayout();
        }
    }

    public void setVisibleDotCount(int i) {
        if (i % 2 != 0) {
            this.v = i;
            this.a = i + 2;
            if (this.C0 != null) {
                e();
            } else {
                requestLayout();
            }
        } else {
            throw new IllegalArgumentException("visibleDotCount must be odd");
        }
    }

    public void setVisibleDotThreshold(int i) {
        this.w = i;
        if (this.C0 != null) {
            e();
        } else {
            requestLayout();
        }
    }
}
