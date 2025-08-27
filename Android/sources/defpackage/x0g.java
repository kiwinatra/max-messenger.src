package defpackage;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* renamed from: x0g  reason: default package */
public final class x0g {
    public static final long b = TimeUnit.HOURS.toSeconds(1);
    public static final Pattern c = Pattern.compile("\\AA[\\w-]{38}\\z");
    public static x0g d;
    public final pf6 a;

    public x0g(pf6 pf6) {
        this.a = pf6;
    }

    public final boolean a(tb0 tb0) {
        if (TextUtils.isEmpty(tb0.c)) {
            return true;
        }
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.a.getClass();
        return tb0.f + tb0.e < timeUnit.toSeconds(System.currentTimeMillis()) + b;
    }
}
