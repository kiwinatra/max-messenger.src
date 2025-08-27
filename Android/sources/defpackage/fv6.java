package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmStatic;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

/* renamed from: fv6  reason: default package */
public final class fv6 extends View {
    public static final /* synthetic */ int o = 0;
    public final Paint a;
    public final dv6 b;
    public ev6 c = pf6.d();

    public fv6(Context context) {
        super(context, (AttributeSet) null, 0);
        Paint paint = new Paint(1);
        this.a = paint;
        paint.setStyle(Paint.Style.FILL);
        this.b = getDrawConfiguration();
    }

    public static void a(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("Pages number is negative".toString());
        } else if (i2 >= i) {
            throw new IllegalArgumentException("Selected page index is equal or bigger than pages number".toString());
        } else if (i2 < 0) {
            throw new IllegalArgumentException("Selected page index is negative".toString());
        }
    }

    private final int getBigDotsNumber() {
        return Math.min(1, this.c.a);
    }

    @JvmStatic
    private static final ev6 getDefaultPageState() {
        return pf6.d();
    }

    private final float getDotsAnimationShift() {
        int ordinal = this.c.f.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            return c44.DEFAULT_ASPECT_RATIO;
        }
        dv6 dv6 = this.b;
        if (ordinal == 2) {
            return (-this.c.c) * ((float) dv6.d);
        }
        if (ordinal == 3) {
            return (1.0f - this.c.c) * ((float) dv6.d);
        }
        throw new NoWhenBranchMatchedException();
    }

    private final dv6 getDrawConfiguration() {
        return new dv6(vo4.c().getDisplayMetrics().density * 3.0f, vo4.c().getDisplayMetrics().density * 2.0f, vo4.c().getDisplayMetrics().density * 1.0f, MathKt.roundToInt(((float) 12) * vo4.c().getDisplayMetrics().density), l2b.f.g);
    }

    private final float getSelectedBigDotAnimationShift() {
        int ordinal = this.c.f.ordinal();
        if (ordinal == 0) {
            return c44.DEFAULT_ASPECT_RATIO;
        }
        if (ordinal == 1) {
            return this.c.c * ((float) this.b.d);
        }
        if (ordinal == 2 || ordinal == 3) {
            return c44.DEFAULT_ASPECT_RATIO;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void b(int i, int i2) {
        if (i == 0) {
            this.c = pf6.d();
            invalidate();
            return;
        }
        a(i, i2);
        ev6 ev6 = this.c;
        if (i == ev6.a) {
            c(c44.DEFAULT_ASPECT_RATIO, i2);
            return;
        }
        ev6.a = i;
        ev6.b = i2;
        ev6.c = c44.DEFAULT_ASPECT_RATIO;
        if (ev6.d >= i) {
            ev6.d = Math.min(i - 1, 0);
        } else if (i <= 1) {
            ev6.d = i2;
        }
        ev6 ev62 = this.c;
        ev62.f = bv6.a;
        ev62.e = false;
        invalidate();
    }

    public final void c(float f, int i) {
        ev6 ev6 = this.c;
        int i2 = ev6.b;
        ev6.b = i;
        int i3 = i - i2;
        int i4 = ev6.d;
        int i5 = i4 + i3;
        boolean z = true;
        if (ev6.e && i3 == 1) {
            ev6.e = false;
            i3 = 0;
            i5 = 0;
        }
        if (i3 != 0) {
            if (i5 >= 0) {
                z = false;
            }
            ev6.e = z;
        }
        ev6.d = RangesKt.coerceIn(i5, 0, 0);
        ev6 ev62 = this.c;
        bv6 bv6 = ev62.f;
        int i6 = ev62.b;
        int i7 = ev62.d;
        if (f == c44.DEFAULT_ASPECT_RATIO) {
            bv6 = bv6.a;
        } else if (bv6 == bv6.a || i6 != i2) {
            bv6 = i6 < i2 ? (i4 == 0 && i7 == 0) ? bv6.o : bv6.b : i7 == 0 ? bv6.c : bv6.b;
        }
        ev62.f = bv6;
        ev62.c = f;
        invalidate();
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x013f A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onDraw(android.graphics.Canvas r21) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            ev6 r2 = r0.c
            int r2 = r2.a
            r3 = 1
            if (r2 > r3) goto L_0x000c
            return
        L_0x000c:
            android.graphics.Paint r2 = r0.a
            dv6 r4 = r0.b
            int r5 = r4.e
            r2.setColor(r5)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            ev6 r6 = r0.c
            int r7 = r6.b
            int r6 = r6.d
            int r7 = r7 - r6
            r6 = 0
            r8 = 2
            if (r7 < r8) goto L_0x002e
            cv6 r9 = new cv6
            r10 = -3
            r9.<init>(r6, r10)
            r5.add(r9)
        L_0x002e:
            float r9 = r4.c
            if (r7 < r3) goto L_0x003b
            cv6 r10 = new cv6
            r11 = -2
            r10.<init>(r9, r11)
            r5.add(r10)
        L_0x003b:
            r10 = -1
            float r11 = r4.b
            if (r7 < 0) goto L_0x0048
            cv6 r7 = new cv6
            r7.<init>(r11, r10)
            r5.add(r7)
        L_0x0048:
            ev6 r7 = r0.c
            int r7 = r7.a
            int r7 = java.lang.Math.min(r3, r7)
            r12 = 0
            r13 = r12
        L_0x0052:
            float r14 = r4.a
            if (r13 >= r7) goto L_0x0061
            cv6 r15 = new cv6
            r15.<init>(r14, r13)
            r5.add(r15)
            int r13 = r13 + 1
            goto L_0x0052
        L_0x0061:
            ev6 r7 = r0.c
            bv6 r13 = r7.f
            bv6 r15 = defpackage.bv6.c
            if (r13 == r15) goto L_0x0070
            bv6 r15 = defpackage.bv6.o
            if (r13 != r15) goto L_0x006e
            goto L_0x0070
        L_0x006e:
            r13 = r12
            goto L_0x0071
        L_0x0070:
            r13 = r3
        L_0x0071:
            int r15 = r7.a
            if (r15 > r3) goto L_0x0077
        L_0x0075:
            r15 = r12
            goto L_0x0089
        L_0x0077:
            int r10 = r15 + -1
            int r6 = r7.b
            int r8 = r6 + 1
            if (r10 > r8) goto L_0x0082
            if (r13 == 0) goto L_0x0082
            goto L_0x0075
        L_0x0082:
            int r7 = r7.d
            int r7 = 0 - r7
            int r15 = r15 - r6
            int r15 = r15 - r3
            int r15 = r15 - r7
        L_0x0089:
            if (r15 < 0) goto L_0x0093
            cv6 r6 = new cv6
            r6.<init>(r11, r3)
            r5.add(r6)
        L_0x0093:
            if (r15 < r3) goto L_0x009f
            cv6 r6 = new cv6
            r7 = 2
            r6.<init>(r9, r7)
            r5.add(r6)
            goto L_0x00a0
        L_0x009f:
            r7 = 2
        L_0x00a0:
            if (r15 < r7) goto L_0x00ac
            cv6 r6 = new cv6
            r7 = 3
            r8 = 0
            r6.<init>(r8, r7)
            r5.add(r6)
        L_0x00ac:
            int r6 = r20.getBigDotsNumber()
            android.graphics.PointF r7 = new android.graphics.PointF
            int r8 = r21.getWidth()
            float r8 = (float) r8
            r9 = 1073741824(0x40000000, float:2.0)
            float r8 = r8 / r9
            int r10 = r21.getHeight()
            float r10 = (float) r10
            float r10 = r10 / r9
            r7.<init>(r8, r10)
            float r8 = r20.getDotsAnimationShift()
            int r6 = r6 - r3
            float r6 = (float) r6
            float r6 = r6 / r9
            int r10 = r5.size()
        L_0x00ce:
            int r11 = r4.d
            if (r12 >= r10) goto L_0x013f
            java.lang.Object r13 = r5.get(r12)
            cv6 r13 = (defpackage.cv6) r13
            int r15 = r13.b
            float r15 = (float) r15
            float r15 = r15 - r6
            float r11 = (float) r11
            float r15 = r15 * r11
            float r11 = r7.x
            float r11 = r11 + r15
            float r11 = r11 + r8
            int r15 = r12 + -1
            java.lang.Object r15 = kotlin.collections.CollectionsKt.getOrNull(r5, r15)
            cv6 r15 = (defpackage.cv6) r15
            int r12 = r12 + 1
            java.lang.Object r16 = kotlin.collections.CollectionsKt.getOrNull(r5, r12)
            r3 = r16
            cv6 r3 = (defpackage.cv6) r3
            ev6 r9 = r0.c
            r17 = r4
            bv6 r4 = r9.f
            r18 = r5
            bv6 r5 = defpackage.bv6.c
            r19 = r6
            r6 = 1065353216(0x3f800000, float:1.0)
            float r13 = r13.a
            if (r4 != r5) goto L_0x0113
            if (r15 == 0) goto L_0x0113
            float r3 = r9.c
            float r4 = r15.a
            float r4 = r4 * r3
            float r3 = defpackage.i2a.f(r6, r3, r13, r4)
        L_0x0111:
            r4 = 0
            goto L_0x012b
        L_0x0113:
            bv6 r5 = defpackage.bv6.o
            if (r4 != r5) goto L_0x0123
            if (r3 == 0) goto L_0x0123
            float r4 = r9.c
            float r13 = r13 * r4
            float r6 = r6 - r4
            float r3 = r3.a
            float r6 = r6 * r3
            float r3 = r6 + r13
            goto L_0x0111
        L_0x0123:
            if (r15 == 0) goto L_0x0129
            if (r3 == 0) goto L_0x0129
            r3 = r13
            goto L_0x0111
        L_0x0129:
            r3 = 0
            goto L_0x0111
        L_0x012b:
            int r5 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r5 != 0) goto L_0x0130
            goto L_0x0135
        L_0x0130:
            float r5 = r7.y
            r1.drawCircle(r11, r5, r3, r2)
        L_0x0135:
            r4 = r17
            r5 = r18
            r6 = r19
            r3 = 1
            r9 = 1073741824(0x40000000, float:2.0)
            goto L_0x00ce
        L_0x013f:
            r3 = -1
            r2.setColor(r3)
            int r3 = r20.getBigDotsNumber()
            android.graphics.PointF r4 = new android.graphics.PointF
            int r5 = r21.getWidth()
            float r5 = (float) r5
            r6 = 1073741824(0x40000000, float:2.0)
            float r5 = r5 / r6
            int r7 = r21.getHeight()
            float r7 = (float) r7
            float r7 = r7 / r6
            r4.<init>(r5, r7)
            float r5 = r20.getSelectedBigDotAnimationShift()
            r7 = 1
            int r3 = r3 - r7
            float r3 = (float) r3
            float r3 = r3 / r6
            ev6 r0 = r0.c
            int r0 = r0.d
            float r0 = (float) r0
            float r0 = r0 - r3
            float r3 = (float) r11
            float r0 = r0 * r3
            float r3 = r4.x
            float r3 = r3 + r0
            float r3 = r3 + r5
            float r0 = r4.y
            r1.drawCircle(r3, r0, r14, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fv6.onDraw(android.graphics.Canvas):void");
    }

    public final void setSelectedPageIndex(int i) {
        a(this.c.a, i);
        c(c44.DEFAULT_ASPECT_RATIO, i);
    }
}
