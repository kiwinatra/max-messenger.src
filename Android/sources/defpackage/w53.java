package defpackage;

import android.graphics.Color;
import kotlin.KotlinVersion;

/* renamed from: w53  reason: default package */
public abstract class w53 {
    public static final ThreadLocal a = new ThreadLocal();

    public static void a(int i, int i2, int i3, float[] fArr) {
        float f;
        float f2;
        float f3 = ((float) i) / 255.0f;
        float f4 = ((float) i2) / 255.0f;
        float f5 = ((float) i3) / 255.0f;
        float max = Math.max(f3, Math.max(f4, f5));
        float min = Math.min(f3, Math.min(f4, f5));
        float f6 = max - min;
        float f7 = (max + min) / 2.0f;
        int i4 = (max > min ? 1 : (max == min ? 0 : -1));
        float f8 = c44.DEFAULT_ASPECT_RATIO;
        if (i4 == 0) {
            f = 0.0f;
            f2 = 0.0f;
        } else {
            f = max == f3 ? ((f4 - f5) / f6) % 6.0f : max == f4 ? ((f5 - f3) / f6) + 2.0f : 4.0f + ((f3 - f4) / f6);
            f2 = f6 / (1.0f - Math.abs((2.0f * f7) - 1.0f));
        }
        float f9 = (f * 60.0f) % 360.0f;
        if (f9 < c44.DEFAULT_ASPECT_RATIO) {
            f9 += 360.0f;
        }
        fArr[0] = f9 < c44.DEFAULT_ASPECT_RATIO ? 0.0f : Math.min(f9, 360.0f);
        fArr[1] = f2 < c44.DEFAULT_ASPECT_RATIO ? 0.0f : Math.min(f2, 1.0f);
        if (f7 >= c44.DEFAULT_ASPECT_RATIO) {
            f8 = Math.min(f7, 1.0f);
        }
        fArr[2] = f8;
    }

    public static int b(double d, double d2, double d3) {
        double d4 = ((-0.4986d * d3) + ((-1.5372d * d2) + (3.2406d * d))) / 100.0d;
        double d5 = ((0.0415d * d3) + ((1.8758d * d2) + (-0.9689d * d))) / 100.0d;
        double d6 = ((1.057d * d3) + ((-0.204d * d2) + (0.0557d * d))) / 100.0d;
        double pow = d4 > 0.0031308d ? (Math.pow(d4, 0.4166666666666667d) * 1.055d) - 0.055d : d4 * 12.92d;
        double pow2 = d5 > 0.0031308d ? (Math.pow(d5, 0.4166666666666667d) * 1.055d) - 0.055d : d5 * 12.92d;
        double pow3 = d6 > 0.0031308d ? (Math.pow(d6, 0.4166666666666667d) * 1.055d) - 0.055d : d6 * 12.92d;
        int round = (int) Math.round(pow * 255.0d);
        int i = 0;
        int min = round < 0 ? 0 : Math.min(round, KotlinVersion.MAX_COMPONENT_VALUE);
        int round2 = (int) Math.round(pow2 * 255.0d);
        int min2 = round2 < 0 ? 0 : Math.min(round2, KotlinVersion.MAX_COMPONENT_VALUE);
        int round3 = (int) Math.round(pow3 * 255.0d);
        if (round3 >= 0) {
            i = Math.min(round3, KotlinVersion.MAX_COMPONENT_VALUE);
        }
        return Color.rgb(min, min2, i);
    }

    public static double c(int i, int i2) {
        if (Color.alpha(i2) == 255) {
            if (Color.alpha(i) < 255) {
                i = f(i, i2);
            }
            double d = d(i) + 0.05d;
            double d2 = d(i2) + 0.05d;
            return Math.max(d, d2) / Math.min(d, d2);
        }
        throw new IllegalArgumentException("background can not be translucent: #" + Integer.toHexString(i2));
    }

    public static double d(int i) {
        ThreadLocal threadLocal = a;
        double[] dArr = (double[]) threadLocal.get();
        if (dArr == null) {
            dArr = new double[3];
            threadLocal.set(dArr);
        }
        int red = Color.red(i);
        int green = Color.green(i);
        int blue = Color.blue(i);
        if (dArr.length == 3) {
            double d = ((double) red) / 255.0d;
            double pow = d < 0.04045d ? d / 12.92d : Math.pow((d + 0.055d) / 1.055d, 2.4d);
            double d2 = ((double) green) / 255.0d;
            double pow2 = d2 < 0.04045d ? d2 / 12.92d : Math.pow((d2 + 0.055d) / 1.055d, 2.4d);
            double d3 = ((double) blue) / 255.0d;
            double pow3 = d3 < 0.04045d ? d3 / 12.92d : Math.pow((d3 + 0.055d) / 1.055d, 2.4d);
            dArr[0] = ((0.1805d * pow3) + (0.3576d * pow2) + (0.4124d * pow)) * 100.0d;
            double d4 = ((0.0722d * pow3) + (0.7152d * pow2) + (0.2126d * pow)) * 100.0d;
            dArr[1] = d4;
            dArr[2] = ((pow3 * 0.9505d) + (pow2 * 0.1192d) + (pow * 0.0193d)) * 100.0d;
            return d4 / 100.0d;
        }
        throw new IllegalArgumentException("outXyz must have a length of 3.");
    }

    public static int e(int i, float f, int i2) {
        int alpha = Color.alpha(i2);
        int i3 = KotlinVersion.MAX_COMPONENT_VALUE;
        if (alpha == 255) {
            double d = (double) f;
            if (c(h(i, KotlinVersion.MAX_COMPONENT_VALUE), i2) < d) {
                return -1;
            }
            int i4 = 0;
            for (int i5 = 0; i5 <= 10 && i3 - i4 > 1; i5++) {
                int i6 = (i4 + i3) / 2;
                if (c(h(i, i6), i2) < d) {
                    i4 = i6;
                } else {
                    i3 = i6;
                }
            }
            return i3;
        }
        throw new IllegalArgumentException("background can not be translucent: #" + Integer.toHexString(i2));
    }

    public static int f(int i, int i2) {
        int alpha = Color.alpha(i2);
        int alpha2 = Color.alpha(i);
        int i3 = 255 - (((255 - alpha2) * (255 - alpha)) / KotlinVersion.MAX_COMPONENT_VALUE);
        return Color.argb(i3, g(Color.red(i), alpha2, Color.red(i2), alpha, i3), g(Color.green(i), alpha2, Color.green(i2), alpha, i3), g(Color.blue(i), alpha2, Color.blue(i2), alpha, i3));
    }

    public static int g(int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            return 0;
        }
        return (((255 - i2) * (i3 * i4)) + ((i * KotlinVersion.MAX_COMPONENT_VALUE) * i2)) / (i5 * KotlinVersion.MAX_COMPONENT_VALUE);
    }

    public static int h(int i, int i2) {
        if (i2 >= 0 && i2 <= 255) {
            return (i & 16777215) | (i2 << 24);
        }
        throw new IllegalArgumentException("alpha must be between 0 and 255.");
    }
}
