package defpackage;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import java.util.Arrays;
import kotlin.KotlinVersion;

/* renamed from: ig5  reason: default package */
public final class ig5 extends ks {
    public int A0;
    public boolean B0;
    public final boolean C0 = true;
    public final int X;
    public int Y;
    public int Z;
    public long v0;
    public final int[] w0;
    public final int[] x0;
    public int y0;
    public final Drawable[] z;
    public final boolean[] z0;

    public ig5(Drawable[] drawableArr) {
        super(drawableArr);
        if (drawableArr.length >= 1) {
            this.z = drawableArr;
            int[] iArr = new int[drawableArr.length];
            this.w0 = iArr;
            int[] iArr2 = new int[drawableArr.length];
            this.x0 = iArr2;
            this.y0 = KotlinVersion.MAX_COMPONENT_VALUE;
            boolean[] zArr = new boolean[drawableArr.length];
            this.z0 = zArr;
            this.A0 = 0;
            this.X = 2;
            this.Y = 2;
            Arrays.fill(iArr, 0);
            iArr[0] = 255;
            Arrays.fill(iArr2, 0);
            iArr2[0] = 255;
            Arrays.fill(zArr, false);
            zArr[0] = true;
            return;
        }
        throw new IllegalStateException("At least one layer required!");
    }

    public final void c() {
        this.A0--;
        invalidateSelf();
    }

    public final void draw(Canvas canvas) {
        boolean z2;
        int i;
        int i2 = this.Y;
        int[] iArr = this.x0;
        Drawable[] drawableArr = this.z;
        int i3 = 2;
        if (i2 == 0) {
            System.arraycopy(iArr, 0, this.w0, 0, drawableArr.length);
            this.v0 = SystemClock.uptimeMillis();
            z2 = f(this.Z == 0 ? 1.0f : c44.DEFAULT_ASPECT_RATIO);
            if (!this.B0 && (i = this.X) >= 0) {
                boolean[] zArr = this.z0;
                if (i < zArr.length && zArr[i]) {
                    this.B0 = true;
                }
            }
            if (!z2) {
                i3 = 1;
            }
            this.Y = i3;
        } else if (i2 != 1) {
            z2 = true;
        } else {
            cvg.q(this.Z > 0);
            z2 = f(((float) (SystemClock.uptimeMillis() - this.v0)) / ((float) this.Z));
            if (!z2) {
                i3 = 1;
            }
            this.Y = i3;
        }
        for (int i4 = 0; i4 < drawableArr.length; i4++) {
            Drawable drawable = drawableArr[i4];
            int ceil = (int) Math.ceil(((double) (iArr[i4] * this.y0)) / 255.0d);
            if (drawable != null && ceil > 0) {
                this.A0++;
                if (this.C0) {
                    drawable.mutate();
                }
                drawable.setAlpha(ceil);
                this.A0--;
                drawable.draw(canvas);
            }
        }
        if (!z2) {
            invalidateSelf();
        } else if (this.B0) {
            this.B0 = false;
        }
    }

    public final void e() {
        this.Y = 2;
        for (int i = 0; i < this.z.length; i++) {
            this.x0[i] = this.z0[i] ? KotlinVersion.MAX_COMPONENT_VALUE : 0;
        }
        invalidateSelf();
    }

    public final boolean f(float f) {
        boolean z2 = true;
        for (int i = 0; i < this.z.length; i++) {
            boolean z3 = this.z0[i];
            int i2 = (int) ((((float) ((z3 ? 1 : -1) * KotlinVersion.MAX_COMPONENT_VALUE)) * f) + ((float) this.w0[i]));
            int[] iArr = this.x0;
            iArr[i] = i2;
            if (i2 < 0) {
                iArr[i] = 0;
            }
            if (iArr[i] > 255) {
                iArr[i] = 255;
            }
            if (z3 && iArr[i] < 255) {
                z2 = false;
            }
            if (!z3 && iArr[i] > 0) {
                z2 = false;
            }
        }
        return z2;
    }

    public final int getAlpha() {
        return this.y0;
    }

    public final void invalidateSelf() {
        if (this.A0 == 0) {
            super.invalidateSelf();
        }
    }

    public final void setAlpha(int i) {
        if (this.y0 != i) {
            this.y0 = i;
            invalidateSelf();
        }
    }
}
