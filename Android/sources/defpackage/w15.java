package defpackage;

import android.text.Spanned;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: w15  reason: default package */
public final class w15 implements u25 {
    public final s15 a;

    public w15(s15 s15) {
        this.a = s15;
    }

    public final List a(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            return Collections.emptyList();
        }
        try {
            CharSequence g = this.a.g(0, charSequence.length(), charSequence, IntCompanionObject.MAX_VALUE, 1);
            if (!(g instanceof Spanned)) {
                return Collections.emptyList();
            }
            Spanned spanned = (Spanned) g;
            kuf[] kufArr = (kuf[]) spanned.getSpans(0, spanned.length(), kuf.class);
            if (kufArr == null || kufArr.length == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList(kufArr.length);
            for (kuf kuf : kufArr) {
                int spanStart = spanned.getSpanStart(kuf);
                int spanEnd = spanned.getSpanEnd(kuf);
                try {
                    arrayList.add(spanned.subSequence(spanStart, spanEnd));
                } catch (Exception unused) {
                    z68.e("w15", String.format(Locale.ENGLISH, "Can't create emoji span: start = %d, end = %d, text = %s", new Object[]{Integer.valueOf(spanStart), Integer.valueOf(spanEnd), charSequence}));
                }
            }
            return arrayList;
        } catch (Throwable th) {
            z68.h("w15", th, "Can't get emoji tokens %s", charSequence);
            return Collections.emptyList();
        }
    }

    public final CharSequence c(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            return "";
        }
        try {
            CharSequence g = this.a.g(0, charSequence.length(), charSequence, IntCompanionObject.MAX_VALUE, 1);
            return g == null ? "" : g;
        } catch (Exception e) {
            z68.f("w15", String.format(Locale.ENGLISH, "Can't process emoji %s", new Object[]{charSequence}), e);
            return charSequence;
        }
    }

    public final boolean f(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            return false;
        }
        List<CharSequence> a2 = a(charSequence);
        if (a2.isEmpty()) {
            return false;
        }
        String trim = charSequence.toString().trim();
        for (CharSequence charSequence2 : a2) {
            String charSequence3 = charSequence2.toString();
            if (!trim.startsWith(charSequence3)) {
                return false;
            }
            trim = trim.replaceFirst(Pattern.quote(charSequence3), "").trim();
        }
        return trim.length() == 0;
    }

    public final boolean g(CharSequence charSequence, int i) {
        if (!TextUtils.isEmpty(charSequence) && i >= 0 && i < charSequence.length()) {
            try {
                CharSequence g = this.a.g(0, charSequence.length(), charSequence, IntCompanionObject.MAX_VALUE, 1);
                if (g instanceof Spanned) {
                    Spanned spanned = (Spanned) g;
                    kuf[] kufArr = (kuf[]) spanned.getSpans(0, spanned.length(), kuf.class);
                    if (!(kufArr == null || kufArr.length == 0)) {
                        for (kuf kuf : kufArr) {
                            int spanStart = spanned.getSpanStart(kuf);
                            int spanEnd = spanned.getSpanEnd(kuf);
                            if (i >= spanStart && i < spanEnd) {
                                return true;
                            }
                            if (i >= spanEnd) {
                                return false;
                            }
                        }
                    }
                }
                return false;
            } catch (Exception e) {
                z68.f("w15", String.format(Locale.ENGLISH, "Can't know is emoji at position %s", new Object[]{charSequence}), e);
            }
        }
        return false;
    }
}
