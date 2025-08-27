package defpackage;

/* renamed from: ir4  reason: default package */
public abstract class ir4 {
    public static final /* synthetic */ int a = 0;

    static {
        Math.log(2.0d);
    }

    public static boolean a(double d) {
        if (Math.getExponent(d) > 1023) {
            return false;
        }
        if (d != 0.0d) {
            if (Math.getExponent(d) <= 1023) {
                int exponent = Math.getExponent(d);
                long doubleToRawLongBits = Double.doubleToRawLongBits(d) & 4503599627370495L;
                if (52 - Long.numberOfTrailingZeros(exponent == -1023 ? doubleToRawLongBits << 1 : doubleToRawLongBits | 4503599627370496L) > Math.getExponent(d)) {
                    return false;
                }
            } else {
                throw new IllegalArgumentException("not a normal value");
            }
        }
        return true;
    }
}
