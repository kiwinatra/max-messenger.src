package one.me.rlottie;

import one.me.rlottie.RLottie;

public final class h implements RLottie.Logger {
    public final void d(String str) {
    }

    public final void e(String str, Throwable th) {
    }

    public final void e(Throwable th) {
        if (th != null) {
            th.getMessage();
        }
    }
}
