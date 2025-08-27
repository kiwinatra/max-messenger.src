package defpackage;

import java.math.BigDecimal;

/* renamed from: pp6  reason: default package */
public abstract class pp6 extends ip7 {
    public int a;
    public boolean b;
    public yp7 c;

    static {
        int i = hp7.WRITE_NUMBERS_AS_STRINGS.b;
        int i2 = hp7.ESCAPE_NON_ASCII.b;
        int i3 = hp7.STRICT_DUPLICATE_DETECTION.b;
    }

    public final String u0(BigDecimal bigDecimal) {
        if (!hp7.WRITE_BIGDECIMAL_AS_PLAIN.a(this.a)) {
            return bigDecimal.toString();
        }
        int scale = bigDecimal.scale();
        if (scale >= -9999 && scale <= 9999) {
            return bigDecimal.toPlainString();
        }
        ip7.b(String.format("Attempt to write plain `java.math.BigDecimal` (see JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN) with illegal scale (%d): needs to be between [-%d, %d]", new Object[]{Integer.valueOf(scale), 9999, 9999}));
        throw null;
    }

    public final boolean v0(hp7 hp7) {
        return (this.a & hp7.b) != 0;
    }
}
