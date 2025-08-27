package defpackage;

import android.graphics.PointF;
import android.graphics.RectF;
import java.util.Arrays;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

/* renamed from: xde  reason: default package */
public final class xde {
    public final PointF a = new PointF();
    public final RectF b = new RectF();
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public float i;
    public float j;
    public float k;
    public float l;
    public float m;
    public float n;
    public float o;
    public int p;
    public final az9 q;
    public final RectF r;
    public float s;

    /* JADX WARNING: type inference failed for: r0v2, types: [az9, java.lang.Object, gr5] */
    public xde() {
        ? obj = new Object();
        obj.a = new float[16];
        this.q = obj;
        this.r = new RectF();
    }

    public final float a(float f2) {
        int i2 = this.p;
        RectF rectF = this.r;
        if (i2 <= 1) {
            return rectF.left;
        }
        az9 az9 = this.q;
        int i3 = 0;
        float a2 = (az9.a(1) - az9.a(0)) / 2.0f;
        int i4 = az9.b - 1;
        float f3 = rectF.left;
        while (i3 <= i4) {
            int i5 = (i3 + i4) / 2;
            float a3 = az9.a(i5);
            float f4 = a3 - f2;
            if (Math.abs(f4) <= a2) {
                return a3;
            }
            if (Math.abs(f4) < Math.abs(f3 - f2)) {
                f3 = a3;
            }
            if (a3 < f2) {
                i3 = i5 + 1;
            } else {
                i4 = i5 - 1;
            }
        }
        return f3;
    }

    public final void b(int i2) {
        this.p = i2;
        RectF rectF = this.r;
        float roundToInt = ((float) MathKt.roundToInt(rectF.width())) / ((float) RangesKt.coerceAtLeast(this.p - 1, 1));
        int roundToInt2 = MathKt.roundToInt(((float) 12) * vo4.c().getDisplayMetrics().density);
        int i3 = this.f;
        float f2 = (((float) ((this.d - i3) - this.h)) / 2.0f) + ((float) i3);
        float f3 = ((float) roundToInt2) / 2.0f;
        this.n = f2 - f3;
        this.o = f2 + f3;
        float f4 = rectF.left;
        int i4 = this.p;
        az9 az9 = this.q;
        float[] fArr = az9.a;
        if (fArr.length < i4) {
            az9.a = Arrays.copyOf(fArr, Math.max(i4, (fArr.length * 3) / 2));
        }
        int i5 = this.p;
        for (int i6 = 0; i6 < i5; i6++) {
            float f5 = (((float) i6) * roundToInt) + f4;
            int i7 = az9.b;
            if (i7 <= i6) {
                int i8 = i7 + 1;
                float[] fArr2 = az9.a;
                if (fArr2.length < i8) {
                    az9.a = Arrays.copyOf(fArr2, Math.max(i8, (fArr2.length * 3) / 2));
                }
                float[] fArr3 = az9.a;
                int i9 = az9.b;
                fArr3[i9] = f5;
                az9.b = i9 + 1;
            } else if (i6 < 0 || i6 >= i7) {
                StringBuilder o2 = wj6.o(i6, "set index ", " must be between 0 .. ");
                o2.append(az9.b - 1);
                throw new IndexOutOfBoundsException(o2.toString());
            } else {
                float[] fArr4 = az9.a;
                float f6 = fArr4[i6];
                fArr4[i6] = f5;
            }
        }
    }

    public final void c(float f2) {
        RectF rectF = this.r;
        this.s = RangesKt.coerceIn(f2, rectF.left, rectF.right);
    }

    public final void d() {
        RectF rectF = this.r;
        int i2 = this.f;
        float f2 = (((float) ((this.d - i2) - this.h)) / 2.0f) + ((float) i2);
        rectF.top = f2;
        rectF.bottom = f2;
        float coerceAtLeast = RangesKt.coerceAtLeast(((float) this.e) + this.i, (float) c44.DEFAULT_ASPECT_RATIO);
        rectF.left = coerceAtLeast;
        float coerceAtLeast2 = RangesKt.coerceAtLeast(((float) (this.c - this.g)) - this.k, coerceAtLeast);
        rectF.right = coerceAtLeast2;
        this.s = RangesKt.coerceIn(this.s, rectF.left, coerceAtLeast2);
    }
}
