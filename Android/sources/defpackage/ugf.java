package defpackage;

import android.icu.text.DecimalFormatSymbols;
import android.text.PrecomputedText;
import android.widget.TextView;

/* renamed from: ugf  reason: default package */
public abstract class ugf {
    public static CharSequence a(PrecomputedText precomputedText) {
        return precomputedText;
    }

    public static String[] b(DecimalFormatSymbols decimalFormatSymbols) {
        return decimalFormatSymbols.getDigitStrings();
    }

    public static PrecomputedText.Params c(TextView textView) {
        return textView.getTextMetricsParams();
    }

    public static void d(TextView textView, int i) {
        textView.setFirstBaselineToTopHeight(i);
    }
}
