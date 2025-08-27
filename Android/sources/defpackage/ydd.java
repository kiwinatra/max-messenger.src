package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;

/* renamed from: ydd  reason: default package */
public final class ydd extends m58 {
    public static final ydd l = new ydd(0);
    public static final ydd m = new ydd(1);
    public static final ydd n = new ydd(2);
    public static final ydd o = new ydd(3);
    public static final ydd p = new ydd(4);
    public static final ydd q = new ydd(5);
    public static final ydd r = new ydd(6);
    public static final ydd s = new ydd(7);
    public static final ydd t = new ydd(8);
    public final /* synthetic */ int k;

    public /* synthetic */ ydd(int i) {
        this.k = i;
    }

    public String toString() {
        switch (this.k) {
            case 0:
                return "center";
            case 1:
                return "center_crop";
            case 2:
                return "center_inside";
            case 3:
                return "fit_bottom_start";
            case 4:
                return "fit_center";
            case 5:
                return "fit_end";
            case 6:
                return "fit_start";
            case 7:
                return "fit_xy";
            case 8:
                return "focus_crop";
            default:
                return super.toString();
        }
    }

    public final void w(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
        float f5;
        float f6;
        float f7;
        float f8;
        float width;
        float f9;
        switch (this.k) {
            case 0:
                matrix.setTranslate((float) ((int) ((((float) (rect.width() - i)) * 0.5f) + ((float) rect.left) + 0.5f)), (float) ((int) ((((float) (rect.height() - i2)) * 0.5f) + ((float) rect.top) + 0.5f)));
                return;
            case 1:
                if (f4 > f3) {
                    f5 = ((((float) rect.width()) - (((float) i) * f4)) * 0.5f) + ((float) rect.left);
                    f6 = (float) rect.top;
                    f3 = f4;
                } else {
                    float height = (((float) rect.height()) - (((float) i2) * f3)) * 0.5f;
                    f5 = (float) rect.left;
                    f6 = height + ((float) rect.top);
                }
                matrix.setScale(f3, f3);
                matrix.postTranslate((float) ((int) (f5 + 0.5f)), (float) ((int) (f6 + 0.5f)));
                return;
            case 2:
                float min = Math.min(Math.min(f3, f4), 1.0f);
                float width2 = ((((float) rect.width()) - (((float) i) * min)) * 0.5f) + ((float) rect.left);
                float height2 = (((float) rect.height()) - (((float) i2) * min)) * 0.5f;
                matrix.setScale(min, min);
                matrix.postTranslate((float) ((int) (width2 + 0.5f)), (float) ((int) (height2 + ((float) rect.top) + 0.5f)));
                return;
            case 3:
                float min2 = Math.min(f3, f4);
                float height3 = ((float) rect.height()) - (((float) i2) * min2);
                matrix.setScale(min2, min2);
                matrix.postTranslate((float) ((int) (((float) rect.left) + 0.5f)), (float) ((int) (height3 + ((float) rect.top) + 0.5f)));
                return;
            case 4:
                float min3 = Math.min(f3, f4);
                float width3 = ((((float) rect.width()) - (((float) i) * min3)) * 0.5f) + ((float) rect.left);
                float height4 = (((float) rect.height()) - (((float) i2) * min3)) * 0.5f;
                matrix.setScale(min3, min3);
                matrix.postTranslate((float) ((int) (width3 + 0.5f)), (float) ((int) (height4 + ((float) rect.top) + 0.5f)));
                return;
            case 5:
                float min4 = Math.min(f3, f4);
                float width4 = ((float) rect.width()) - (((float) i) * min4);
                float height5 = (((float) rect.height()) - (((float) i2) * min4)) + ((float) rect.top);
                matrix.setScale(min4, min4);
                matrix.postTranslate((float) ((int) (width4 + ((float) rect.left) + 0.5f)), (float) ((int) (height5 + 0.5f)));
                return;
            case 6:
                float min5 = Math.min(f3, f4);
                matrix.setScale(min5, min5);
                matrix.postTranslate((float) ((int) (((float) rect.left) + 0.5f)), (float) ((int) (((float) rect.top) + 0.5f)));
                return;
            case 7:
                matrix.setScale(f3, f4);
                matrix.postTranslate((float) ((int) (((float) rect.left) + 0.5f)), (float) ((int) (((float) rect.top) + 0.5f)));
                return;
            case 8:
                if (f4 > f3) {
                    float f10 = ((float) i) * f4;
                    f8 = Math.max(Math.min((((float) rect.width()) * 0.5f) - (f * f10), c44.DEFAULT_ASPECT_RATIO), ((float) rect.width()) - f10) + ((float) rect.left);
                    f7 = (float) rect.top;
                    f3 = f4;
                } else {
                    f8 = (float) rect.left;
                    float f11 = ((float) i2) * f3;
                    f7 = Math.max(Math.min((((float) rect.height()) * 0.5f) - (f2 * f11), c44.DEFAULT_ASPECT_RATIO), ((float) rect.height()) - f11) + ((float) rect.top);
                }
                matrix.setScale(f3, f3);
                matrix.postTranslate((float) ((int) (f8 + 0.5f)), (float) ((int) (f7 + 0.5f)));
                return;
            default:
                if (rect.height() * i2 > rect.width() * i2) {
                    width = (float) rect.height();
                    f9 = (float) i2;
                } else {
                    width = (float) rect.width();
                    f9 = (float) i;
                }
                float f12 = width / f9;
                matrix.setScale(f12, f12);
                return;
        }
    }
}
