package defpackage;

import ru.ok.android.externcalls.sdk.audio.Logger;

/* renamed from: lo1  reason: default package */
public final class lo1 implements Logger {
    public final void d(String str, String str2) {
        z68.c(str, str2, new Object[0]);
    }

    public final void e(String str, String str2, Throwable th) {
        z68.f(str, str2, th);
    }

    public final void i(String str, String str2) {
        z68.i(str, str2, (Throwable) null);
    }

    public final void v(String str, String str2) {
        z68.l(str, str2, new Object[0]);
    }

    public final void w(String str, String str2) {
        z68.p(str, str2);
    }

    public final void d(String str, String str2, Throwable th) {
        z68.b(str, str2, th);
    }

    public final void e(String str, String str2) {
        z68.f(str, str2, (Throwable) null);
    }

    public final void i(String str, String str2, Throwable th) {
        z68.i(str, str2, (Throwable) null);
    }

    public final void v(String str, String str2, Throwable th) {
        a67 a67 = z68.b;
        if (a67 != null) {
            w78 w78 = w78.c;
            if (str2 == null) {
                str2 = "";
            }
            a67.b(a67, w78, str, str2, (Object[]) null, th, 8);
        }
    }

    public final void w(String str, String str2, Throwable th) {
        z68.o(str, str2, th);
    }

    public final void w(String str, Throwable th) {
        z68.p(str, th.getMessage());
    }
}
