package defpackage;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

/* renamed from: wxg  reason: default package */
public abstract class wxg {
    public static final DecimalFormat a;
    public static final DecimalFormat b;

    static {
        Locale locale = Locale.ROOT;
        a = new DecimalFormat(".000000", DecimalFormatSymbols.getInstance(locale));
        DecimalFormat decimalFormat = new DecimalFormat(".##", DecimalFormatSymbols.getInstance(locale));
        b = decimalFormat;
        decimalFormat.setRoundingMode(RoundingMode.DOWN);
    }
}
