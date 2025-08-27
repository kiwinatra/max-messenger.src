package defpackage;

import one.me.rlottie.RLottieDrawable;
import one.me.rlottie.c;
import one.me.rlottie.d;

/* renamed from: qoc  reason: default package */
public final class qoc implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ RLottieDrawable b;

    public /* synthetic */ qoc(RLottieDrawable rLottieDrawable, int i) {
        this.a = i;
        this.b = rLottieDrawable;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                RLottieDrawable rLottieDrawable = this.b;
                rLottieDrawable.F0 = null;
                rLottieDrawable.i();
                Runnable runnable = rLottieDrawable.i1;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                RLottieDrawable rLottieDrawable2 = this.b;
                rLottieDrawable2.N0 = true;
                rLottieDrawable2.invalidateInternal();
                rLottieDrawable2.i();
                Runnable runnable2 = rLottieDrawable2.i1;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
            case 2:
                if (!this.b.a1) {
                    RLottieDrawable rLottieDrawable3 = this.b;
                    if (!rLottieDrawable3.L0 && rLottieDrawable3.canLoadFrames()) {
                        RLottieDrawable rLottieDrawable4 = this.b;
                        if (rLottieDrawable4.E0 == null) {
                            rLottieDrawable4.n1 = true;
                            if (RLottieDrawable.lottieCacheGenerateQueue == null) {
                                RLottieDrawable.lottieCacheGenerateQueue = new d("rlottie-generator-queue");
                            }
                            c.z++;
                            d dVar = RLottieDrawable.lottieCacheGenerateQueue;
                            RLottieDrawable rLottieDrawable5 = this.b;
                            o99 o99 = new o99(22, this);
                            rLottieDrawable5.E0 = o99;
                            dVar.a(o99);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                RLottieDrawable rLottieDrawable6 = this.b;
                if (rLottieDrawable6.E0 != null) {
                    c.c();
                    rLottieDrawable6.E0 = null;
                }
                rLottieDrawable6.n1 = false;
                rLottieDrawable6.i();
                Runnable runnable3 = rLottieDrawable6.whenCacheDone;
                if (runnable3 != null) {
                    runnable3.run();
                    rLottieDrawable6.whenCacheDone = null;
                    return;
                }
                return;
        }
    }
}
