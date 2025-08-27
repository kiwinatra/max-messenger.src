package defpackage;

import android.graphics.Color;

/* renamed from: yq1  reason: default package */
public final class yq1 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;

    public yq1(float f2, float f3, float f4, float f5, float f6, float f7) {
        this.a = f2;
        this.b = f3;
        this.c = f4;
        this.d = f5;
        this.e = f6;
        this.f = f7;
    }

    public static yq1 a(int i) {
        bdg bdg = bdg.k;
        float z = hi7.z(Color.red(i));
        float z2 = hi7.z(Color.green(i));
        float z3 = hi7.z(Color.blue(i));
        float[][] fArr = hi7.f;
        float[] fArr2 = fArr[0];
        float f2 = (fArr2[2] * z3) + (fArr2[1] * z2) + (fArr2[0] * z);
        float[] fArr3 = fArr[1];
        float f3 = (fArr3[2] * z3) + (fArr3[1] * z2) + (fArr3[0] * z);
        float[] fArr4 = fArr[2];
        float f4 = (z3 * fArr4[2]) + (z2 * fArr4[1]) + (z * fArr4[0]);
        float[][] fArr5 = hi7.c;
        float[] fArr6 = fArr5[0];
        float f5 = (fArr6[2] * f4) + (fArr6[1] * f3) + (fArr6[0] * f2);
        float[] fArr7 = fArr5[1];
        float f6 = fArr7[1] * f3;
        float f7 = fArr7[2] * f4;
        float[] fArr8 = fArr5[2];
        float f8 = f2 * fArr8[0];
        float f9 = f4 * fArr8[2];
        float[] fArr9 = bdg.g;
        float f10 = fArr9[0] * f5;
        float f11 = fArr9[1] * (f7 + f6 + (fArr7[0] * f2));
        float f12 = fArr9[2] * (f9 + (f3 * fArr8[1]) + f8);
        float abs = Math.abs(f10);
        float f13 = bdg.h;
        float pow = (float) Math.pow(((double) (abs * f13)) / 100.0d, 0.42d);
        float pow2 = (float) Math.pow(((double) (Math.abs(f11) * f13)) / 100.0d, 0.42d);
        float pow3 = (float) Math.pow(((double) (Math.abs(f12) * f13)) / 100.0d, 0.42d);
        float signum = ((Math.signum(f10) * 400.0f) * pow) / (pow + 27.13f);
        float signum2 = ((Math.signum(f11) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum3 = ((Math.signum(f12) * 400.0f) * pow3) / (pow3 + 27.13f);
        double d2 = (double) signum3;
        float f14 = ((float) (((((double) signum2) * -12.0d) + (((double) signum) * 11.0d)) + d2)) / 11.0f;
        float f15 = ((float) (((double) (signum + signum2)) - (d2 * 2.0d))) / 9.0f;
        float f16 = signum2 * 20.0f;
        float f17 = ((21.0f * signum3) + ((signum * 20.0f) + f16)) / 20.0f;
        float f18 = (((signum * 40.0f) + f16) + signum3) / 20.0f;
        float atan2 = (((float) Math.atan2((double) f15, (double) f14)) * 180.0f) / 3.1415927f;
        if (atan2 < c44.DEFAULT_ASPECT_RATIO) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f19 = atan2;
        float f20 = (3.1415927f * f19) / 180.0f;
        float f21 = f18 * bdg.b;
        float f22 = bdg.a;
        float f23 = bdg.d;
        float pow4 = ((float) Math.pow((double) (f21 / f22), (double) (bdg.j * f23))) * 100.0f;
        Math.sqrt((double) (pow4 / 100.0f));
        float f24 = f22 + 4.0f;
        float pow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, (double) bdg.f), 0.73d)) * ((float) Math.pow((double) ((((((((float) (Math.cos(((((double) (((double) f19) < 20.14d ? 360.0f + f19 : f19)) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * bdg.e) * bdg.c) * ((float) Math.sqrt((double) ((f15 * f15) + (f14 * f14))))) / (f17 + 0.305f)), 0.9d));
        float sqrt = pow5 * ((float) Math.sqrt(((double) pow4) / 100.0d));
        Math.sqrt((double) ((pow5 * f23) / f24));
        float f25 = (1.7f * pow4) / ((0.007f * pow4) + 1.0f);
        float log = ((float) Math.log((double) ((bdg.i * sqrt * 0.0228f) + 1.0f))) * 43.85965f;
        double d3 = (double) f20;
        return new yq1(f19, sqrt, pow4, f25, log * ((float) Math.cos(d3)), log * ((float) Math.sin(d3)));
    }

    public static yq1 b(float f2, float f3, float f4) {
        bdg bdg = bdg.k;
        float f5 = bdg.d;
        double d2 = ((double) f2) / 100.0d;
        Math.sqrt(d2);
        Math.sqrt((double) (((f3 / ((float) Math.sqrt(d2))) * bdg.d) / (bdg.a + 4.0f)));
        float f6 = (1.7f * f2) / ((0.007f * f2) + 1.0f);
        float log = ((float) Math.log((((double) (bdg.i * f3)) * 0.0228d) + 1.0d)) * 43.85965f;
        double d3 = (double) ((3.1415927f * f4) / 180.0f);
        return new yq1(f4, f3, f2, f6, log * ((float) Math.cos(d3)), log * ((float) Math.sin(d3)));
    }

    public final int c(bdg bdg) {
        float f2;
        bdg bdg2 = bdg;
        float f3 = this.b;
        int i = (((double) f3) > 0.0d ? 1 : (((double) f3) == 0.0d ? 0 : -1));
        float f4 = this.c;
        if (i != 0) {
            double d2 = (double) f4;
            if (d2 != 0.0d) {
                f2 = f3 / ((float) Math.sqrt(d2 / 100.0d));
                float pow = (float) Math.pow(((double) f2) / Math.pow(1.64d - Math.pow(0.29d, (double) bdg2.f), 0.73d), 1.1111111111111112d);
                double d3 = (double) ((this.a * 3.1415927f) / 180.0f);
                float pow2 = bdg2.a * ((float) Math.pow(((double) f4) / 100.0d, (1.0d / ((double) bdg2.d)) / ((double) bdg2.j)));
                float cos = ((float) (Math.cos(2.0d + d3) + 3.8d)) * 0.25f * 3846.1538f * bdg2.e * bdg2.c;
                float f5 = pow2 / bdg2.b;
                float sin = (float) Math.sin(d3);
                float cos2 = (float) Math.cos(d3);
                float f6 = 11.0f * pow * cos2;
                float f7 = (((0.305f + f5) * 23.0f) * pow) / (((pow * 108.0f) * sin) + (f6 + (cos * 23.0f)));
                float f8 = cos2 * f7;
                float f9 = f7 * sin;
                float f10 = f5 * 460.0f;
                float f11 = ((288.0f * f9) + ((451.0f * f8) + f10)) / 1403.0f;
                float f12 = ((f10 - (891.0f * f8)) - (261.0f * f9)) / 1403.0f;
                float f13 = ((f10 - (f8 * 220.0f)) - (f9 * 6300.0f)) / 1403.0f;
                float max = (float) Math.max(0.0d, (((double) Math.abs(f11)) * 27.13d) / (400.0d - ((double) Math.abs(f11))));
                float signum = Math.signum(f11);
                float f14 = 100.0f / bdg2.h;
                float pow3 = signum * f14 * ((float) Math.pow((double) max, 2.380952380952381d));
                float signum2 = Math.signum(f12) * f14 * ((float) Math.pow((double) ((float) Math.max(0.0d, (((double) Math.abs(f12)) * 27.13d) / (400.0d - ((double) Math.abs(f12))))), 2.380952380952381d));
                float signum3 = Math.signum(f13) * f14 * ((float) Math.pow((double) ((float) Math.max(0.0d, (((double) Math.abs(f13)) * 27.13d) / (400.0d - ((double) Math.abs(f13))))), 2.380952380952381d));
                float[] fArr = bdg2.g;
                float f15 = pow3 / fArr[0];
                float f16 = signum2 / fArr[1];
                float f17 = signum3 / fArr[2];
                float[][] fArr2 = hi7.d;
                float[] fArr3 = fArr2[0];
                float f18 = fArr3[1] * f16;
                float f19 = (fArr3[2] * f17) + f18 + (fArr3[0] * f15);
                float[] fArr4 = fArr2[1];
                float f20 = fArr4[1] * f16;
                float f21 = fArr4[2] * f17;
                float[] fArr5 = fArr2[2];
                float f22 = f15 * fArr5[0];
                return w53.b((double) f19, (double) (f21 + f20 + (fArr4[0] * f15)), (double) ((f17 * fArr5[2]) + (f16 * fArr5[1]) + f22));
            }
        }
        f2 = c44.DEFAULT_ASPECT_RATIO;
        float pow4 = (float) Math.pow(((double) f2) / Math.pow(1.64d - Math.pow(0.29d, (double) bdg2.f), 0.73d), 1.1111111111111112d);
        double d32 = (double) ((this.a * 3.1415927f) / 180.0f);
        float pow22 = bdg2.a * ((float) Math.pow(((double) f4) / 100.0d, (1.0d / ((double) bdg2.d)) / ((double) bdg2.j)));
        float cos3 = ((float) (Math.cos(2.0d + d32) + 3.8d)) * 0.25f * 3846.1538f * bdg2.e * bdg2.c;
        float f52 = pow22 / bdg2.b;
        float sin2 = (float) Math.sin(d32);
        float cos22 = (float) Math.cos(d32);
        float f62 = 11.0f * pow4 * cos22;
        float f72 = (((0.305f + f52) * 23.0f) * pow4) / (((pow4 * 108.0f) * sin2) + (f62 + (cos3 * 23.0f)));
        float f82 = cos22 * f72;
        float f92 = f72 * sin2;
        float f102 = f52 * 460.0f;
        float f112 = ((288.0f * f92) + ((451.0f * f82) + f102)) / 1403.0f;
        float f122 = ((f102 - (891.0f * f82)) - (261.0f * f92)) / 1403.0f;
        float f132 = ((f102 - (f82 * 220.0f)) - (f92 * 6300.0f)) / 1403.0f;
        float max2 = (float) Math.max(0.0d, (((double) Math.abs(f112)) * 27.13d) / (400.0d - ((double) Math.abs(f112))));
        float signum4 = Math.signum(f112);
        float f142 = 100.0f / bdg2.h;
        float pow32 = signum4 * f142 * ((float) Math.pow((double) max2, 2.380952380952381d));
        float signum22 = Math.signum(f122) * f142 * ((float) Math.pow((double) ((float) Math.max(0.0d, (((double) Math.abs(f122)) * 27.13d) / (400.0d - ((double) Math.abs(f122))))), 2.380952380952381d));
        float signum32 = Math.signum(f132) * f142 * ((float) Math.pow((double) ((float) Math.max(0.0d, (((double) Math.abs(f132)) * 27.13d) / (400.0d - ((double) Math.abs(f132))))), 2.380952380952381d));
        float[] fArr6 = bdg2.g;
        float f152 = pow32 / fArr6[0];
        float f162 = signum22 / fArr6[1];
        float f172 = signum32 / fArr6[2];
        float[][] fArr22 = hi7.d;
        float[] fArr32 = fArr22[0];
        float f182 = fArr32[1] * f162;
        float f192 = (fArr32[2] * f172) + f182 + (fArr32[0] * f152);
        float[] fArr42 = fArr22[1];
        float f202 = fArr42[1] * f162;
        float f212 = fArr42[2] * f172;
        float[] fArr52 = fArr22[2];
        float f222 = f152 * fArr52[0];
        return w53.b((double) f192, (double) (f212 + f202 + (fArr42[0] * f152)), (double) ((f172 * fArr52[2]) + (f162 * fArr52[1]) + f222));
    }
}
