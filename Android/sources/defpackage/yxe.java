package defpackage;

import java.math.RoundingMode;
import java.text.DecimalFormat;

/* renamed from: yxe  reason: default package */
public abstract class yxe {
    public static final DecimalFormat a;

    static {
        DecimalFormat decimalFormat = new DecimalFormat("#.#");
        RoundingMode roundingMode = RoundingMode.DOWN;
        decimalFormat.setRoundingMode(roundingMode);
        a = decimalFormat;
        new DecimalFormat("0.0").setRoundingMode(roundingMode);
    }
}
