package defpackage;

import com.google.gson.Gson;
import one.me.rlottie.RLottie;
import one.me.rlottie.RLottieDrawable;
import one.me.rlottie.a;
import one.me.rlottie.c;

/* renamed from: poc  reason: default package */
public final /* synthetic */ class poc implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ RLottieDrawable b;
    public final /* synthetic */ Runnable c;

    public /* synthetic */ poc(RLottieDrawable rLottieDrawable, Runnable runnable, int i) {
        this.a = i;
        this.b = rLottieDrawable;
        this.c = runnable;
    }

    public final void run() {
        Runnable runnable = this.c;
        RLottieDrawable rLottieDrawable = this.b;
        switch (this.a) {
            case 0:
                Gson gson = RLottieDrawable.gson;
                rLottieDrawable.getClass();
                try {
                    c cVar = rLottieDrawable.q1;
                    if (cVar != null) {
                        cVar.b();
                    }
                } catch (Throwable th) {
                    RLottie.getLogger().e(th);
                }
                a.d(new poc(rLottieDrawable, runnable, 1));
                return;
            default:
                Gson gson2 = RLottieDrawable.gson;
                rLottieDrawable.getClass();
                runnable.run();
                if (rLottieDrawable.E0 != null) {
                    rLottieDrawable.E0 = null;
                    c.c();
                    return;
                }
                return;
        }
    }
}
