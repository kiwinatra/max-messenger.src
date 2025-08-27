package defpackage;

import android.graphics.Path;

/* renamed from: lab  reason: default package */
public final class lab {
    public char a;
    public final float[] b;

    public lab(char c, float[] fArr) {
        this.a = c;
        this.b = fArr;
    }

    public static void a(Path path, float f, float f2, float f3, float f4, float f5, float f6, float f7, boolean z, boolean z2) {
        double d;
        double d2;
        float f8 = f;
        float f9 = f3;
        float f10 = f5;
        boolean z3 = z2;
        double radians = Math.toRadians((double) f7);
        double cos = Math.cos(radians);
        double sin = Math.sin(radians);
        double d3 = (double) f8;
        double d4 = (double) f2;
        double d5 = (d4 * sin) + (d3 * cos);
        double d6 = d3;
        double d7 = (double) f10;
        double d8 = d5 / d7;
        double d9 = radians;
        double d10 = (double) f6;
        double d11 = ((d4 * cos) + (((double) (-f8)) * sin)) / d10;
        double d12 = d4;
        double d13 = (double) f4;
        double d14 = ((d13 * sin) + (((double) f9) * cos)) / d7;
        double d15 = ((d13 * cos) + (((double) (-f9)) * sin)) / d10;
        double d16 = d8 - d14;
        double d17 = d11 - d15;
        double d18 = (d8 + d14) / 2.0d;
        double d19 = (d11 + d15) / 2.0d;
        double d20 = (d17 * d17) + (d16 * d16);
        if (d20 != 0.0d) {
            double d21 = (1.0d / d20) - 0.25d;
            if (d21 < 0.0d) {
                float sqrt = (float) (Math.sqrt(d20) / 1.99999d);
                a(path, f, f2, f3, f4, f10 * sqrt, f6 * sqrt, f7, z, z2);
                return;
            }
            double sqrt2 = Math.sqrt(d21);
            double d22 = d16 * sqrt2;
            double d23 = sqrt2 * d17;
            if (z == z3) {
                d2 = d18 - d23;
                d = d19 + d22;
            } else {
                d2 = d18 + d23;
                d = d19 - d22;
            }
            double d24 = d11 - d;
            double d25 = sin;
            double atan2 = Math.atan2(d24, d8 - d2);
            double atan22 = Math.atan2(d15 - d, d14 - d2) - atan2;
            int i = (atan22 > 0.0d ? 1 : (atan22 == 0.0d ? 0 : -1));
            if (z3 != (i >= 0)) {
                atan22 = i > 0 ? atan22 - 6.283185307179586d : atan22 + 6.283185307179586d;
            }
            double d26 = d2 * d7;
            double d27 = d * d10;
            double d28 = (d26 * cos) - (d27 * d25);
            double d29 = (d27 * cos) + (d26 * d25);
            int ceil = (int) Math.ceil(Math.abs((atan22 * 4.0d) / 3.141592653589793d));
            double cos2 = Math.cos(d9);
            double sin2 = Math.sin(d9);
            double cos3 = Math.cos(atan2);
            double sin3 = Math.sin(atan2);
            double d30 = -d7;
            double d31 = d30 * cos2;
            double d32 = d10 * sin2;
            double d33 = (d31 * sin3) - (d32 * cos3);
            double d34 = d30 * sin2;
            double d35 = d10 * cos2;
            double d36 = (cos3 * d35) + (sin3 * d34);
            double d37 = d35;
            double d38 = atan22 / ((double) ceil);
            int i2 = 0;
            while (i2 < ceil) {
                double d39 = atan2 + d38;
                double sin4 = Math.sin(d39);
                double cos4 = Math.cos(d39);
                double d40 = d38;
                double d41 = (((d7 * cos2) * cos4) + d28) - (d32 * sin4);
                double d42 = d37;
                double d43 = d28;
                double d44 = (d42 * sin4) + (d7 * sin2 * cos4) + d29;
                double d45 = (d31 * sin4) - (d32 * cos4);
                double d46 = (cos4 * d42) + (sin4 * d34);
                double d47 = d39 - atan2;
                double tan = Math.tan(d47 / 2.0d);
                double sqrt3 = ((Math.sqrt(((tan * 3.0d) * tan) + 4.0d) - 1.0d) * Math.sin(d47)) / 3.0d;
                double d48 = d39;
                path.rLineTo(c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO);
                path.cubicTo((float) ((d33 * sqrt3) + d6), (float) ((d36 * sqrt3) + d12), (float) (d41 - (sqrt3 * d45)), (float) (d44 - (sqrt3 * d46)), (float) d41, (float) d44);
                i2++;
                atan2 = d48;
                d34 = d34;
                cos2 = cos2;
                ceil = ceil;
                d36 = d46;
                d7 = d7;
                d33 = d45;
                d6 = d41;
                d12 = d44;
                d28 = d43;
                d38 = d40;
                d37 = d42;
            }
        }
    }

    public final void b(lab lab, lab lab2, float f) {
        this.a = lab.a;
        int i = 0;
        while (true) {
            float[] fArr = lab.b;
            if (i < fArr.length) {
                this.b[i] = (lab2.b[i] * f) + ((1.0f - f) * fArr[i]);
                i++;
            } else {
                return;
            }
        }
    }

    public lab(lab lab) {
        this.a = lab.a;
        float[] fArr = lab.b;
        this.b = b59.l(fArr, fArr.length);
    }
}
