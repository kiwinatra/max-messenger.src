package defpackage;

import android.util.Rational;
import android.util.Size;

/* renamed from: ht  reason: default package */
public abstract class ht {
    public static final Rational a = new Rational(4, 3);
    public static final Rational b = new Rational(3, 4);
    public static final Rational c = new Rational(16, 9);
    public static final Rational d = new Rational(9, 16);

    public static boolean a(Size size, Rational rational, Size size2) {
        if (rational == null) {
            return false;
        }
        if (!rational.equals(new Rational(size.getWidth(), size.getHeight()))) {
            Size size3 = pde.a;
            if (size.getHeight() * size.getWidth() < pde.a(size2)) {
                return false;
            }
            int width = size.getWidth();
            int height = size.getHeight();
            Rational rational2 = new Rational(rational.getDenominator(), rational.getNumerator());
            int i = width % 16;
            if (i == 0 && height % 16 == 0) {
                if (!b(Math.max(0, height - 16), width, rational) && !b(Math.max(0, width - 16), height, rational2)) {
                    return false;
                }
            } else if (i == 0) {
                return b(height, width, rational);
            } else {
                if (height % 16 == 0) {
                    return b(width, height, rational2);
                }
                return false;
            }
        }
        return true;
    }

    public static boolean b(int i, int i2, Rational rational) {
        bs0.n(i2 % 16 == 0);
        double numerator = ((double) (rational.getNumerator() * i)) / ((double) rational.getDenominator());
        return numerator > ((double) Math.max(0, i2 + -16)) && numerator < ((double) (i2 + 16));
    }
}
