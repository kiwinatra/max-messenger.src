package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;

/* renamed from: e44  reason: default package */
public final class e44 extends ik4 {
    public final int Z;
    public Rect v0;
    public final RectF w0 = new RectF();
    public boolean x0;
    public float y0 = c44.DEFAULT_ASPECT_RATIO;

    public e44(ata ata, int i) {
        super(ata);
        this.Z = i;
    }

    public final void a(float f, float f2) {
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b() {
        /*
            r8 = this;
            android.graphics.Rect r0 = r8.v0
            if (r0 == 0) goto L_0x0051
            android.graphics.Matrix r0 = r8.Y
            android.graphics.RectF r1 = r8.w0
            android.graphics.RectF r2 = r8.y
            r0.mapRect(r1, r2)
            float r2 = r1.top
            android.graphics.Rect r3 = r8.v0
            int r4 = r3.top
            float r5 = (float) r4
            int r5 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            r6 = 0
            if (r5 <= 0) goto L_0x001c
        L_0x0019:
            float r4 = (float) r4
            float r4 = r4 - r2
            goto L_0x0027
        L_0x001c:
            float r2 = r1.bottom
            int r4 = r3.bottom
            float r5 = (float) r4
            int r5 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r5 >= 0) goto L_0x0026
            goto L_0x0019
        L_0x0026:
            r4 = r6
        L_0x0027:
            float r2 = r1.left
            int r5 = r3.left
            float r7 = (float) r5
            int r7 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r7 <= 0) goto L_0x0033
            float r1 = (float) r5
            float r1 = r1 - r2
            goto L_0x0041
        L_0x0033:
            float r1 = r1.right
            int r2 = r3.right
            float r3 = (float) r2
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 >= 0) goto L_0x0040
            float r2 = (float) r2
            float r1 = r2 - r1
            goto L_0x0041
        L_0x0040:
            r1 = r6
        L_0x0041:
            int r2 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r2 != 0) goto L_0x0049
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 == 0) goto L_0x0051
        L_0x0049:
            r0.postTranslate(r1, r4)
            ata r8 = r8.a
            r8.B()
        L_0x0051:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e44.b():void");
    }

    public final Rect c(int i) {
        RectF rectF = new RectF();
        this.Y.mapRect(rectF, this.y);
        if (this.v0 == null) {
            return null;
        }
        float width = ((float) i) / rectF.width();
        Rect rect = this.v0;
        int i2 = rect.left;
        float f = rectF.left;
        int width2 = (int) (((((float) i2) - f) + ((float) rect.width())) * width);
        Rect rect2 = this.v0;
        Rect rect3 = new Rect((int) ((((float) i2) - f) * width), (int) ((((float) rect.top) - rectF.top) * width), width2, (int) (((((float) rect2.top) - rectF.top) + ((float) rect2.height())) * width));
        if (this.x0 && rect3.height() != rect3.width()) {
            z68.a("e44", "cropped rect is not square: square it");
            if (rect3.width() > rect3.height()) {
                rect3.right -= rect3.width() - rect3.height();
            } else {
                rect3.bottom -= rect3.height() - rect3.width();
            }
        }
        return rect3;
    }

    public final void d(int i) {
        float width = (((float) c(i).width()) / ((float) this.Z)) - 0.05f;
        if (width > 1.0f) {
            this.w = width;
        }
    }

    public final void e() {
        Rect rect = this.v0;
        if (rect != null) {
            RectF rectF = this.y;
            int i = (((float) rect.height()) > rectF.height() ? 1 : (((float) rect.height()) == rectF.height() ? 0 : -1));
            Matrix matrix = this.Y;
            if (i > 0) {
                float height = ((float) this.v0.height()) / rectF.height();
                this.v = height;
                matrix.setScale(height, height, rectF.centerX(), rectF.centerY());
            } else if (((float) this.v0.width()) > rectF.width()) {
                float width = ((float) this.v0.width()) / rectF.width();
                this.v = width;
                matrix.setScale(width, width, rectF.centerX(), rectF.centerY());
            } else {
                if (rectF.height() > rectF.width()) {
                    this.v = ((float) this.v0.width()) / rectF.width();
                } else {
                    this.v = ((float) this.v0.height()) / rectF.height();
                }
                this.v += 0.05f;
            }
            b();
        }
    }

    public final void reset() {
        super.reset();
        this.y0 = c44.DEFAULT_ASPECT_RATIO;
    }
}
