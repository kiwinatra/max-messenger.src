package defpackage;

import one.me.rlottie.RLottie;

/* renamed from: gpa  reason: default package */
public final class gpa implements RLottie.Logger {
    public final void d(String str) {
        z68.c("RLottie", str, new Object[0]);
    }

    public final void e(String str, Throwable th) {
        z68.f("RLottie", str, th);
    }

    public final void e(Throwable th) {
        z68.f("RLottie", "fail!", th);
    }
}
