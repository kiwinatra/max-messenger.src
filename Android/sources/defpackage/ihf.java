package defpackage;

import android.text.Spannable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: ihf  reason: default package */
public abstract class ihf {
    public static final Pattern a = Pattern.compile("#(?i)([\\p{L}0-9_]+)");

    public static void a(Spannable spannable, sy7 sy7, boolean z, int i) {
        oj0 oj0 = new oj0((Object) spannable, (Object) sy7, i, 12);
        if (sy7 == sy7.o) {
            c(spannable.toString(), b(sy7, z), nab.b, false, oj0);
            return;
        }
        String obj = spannable.toString();
        Pattern b = b(sy7, z);
        Pattern pattern = nab.a;
        c(obj, b, (Pattern) null, false, oj0);
    }

    public static Pattern b(sy7 sy7, boolean z) {
        int ordinal = sy7.ordinal();
        return ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? hhf.a : hhf.a : z ? hhf.f : hhf.d : a;
    }

    public static void c(CharSequence charSequence, Pattern pattern, Pattern pattern2, boolean z, qk3 qk3) {
        Pattern pattern3 = nab.a;
        Matcher matcher = pattern.matcher(charSequence);
        while (matcher.find()) {
            Matcher matcher2 = pattern3.matcher(charSequence);
            while (true) {
                if (matcher2.find()) {
                    if ((matcher.start() >= matcher2.start() && matcher.end() <= matcher2.end()) || ((matcher.end() <= matcher2.end() && matcher.end() >= matcher2.start()) || (matcher.start() <= matcher2.end() && matcher.end() >= matcher2.end()))) {
                        break;
                    }
                } else {
                    if (!z && pattern == hhf.a) {
                        Matcher matcher3 = hhf.f.matcher(charSequence);
                        while (true) {
                            if (matcher3.find() && matcher.start() >= matcher3.start() && matcher.end() <= matcher3.end()) {
                                if (matcher3.group().contains(matcher.group())) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    if (pattern2 != null) {
                        Matcher matcher4 = pattern2.matcher(charSequence);
                        while (true) {
                            if (matcher4.find() && matcher.start() >= matcher4.start() && matcher.end() <= matcher4.end()) {
                                if (matcher4.group().contains(matcher.group())) {
                                    break;
                                }
                            }
                        }
                    }
                    try {
                        qk3.accept(new ehf(matcher.start(), matcher.end(), matcher.group()));
                        break;
                    } catch (Throwable th) {
                        z68.f("ihf", th.getMessage(), th);
                    }
                }
            }
        }
    }
}
