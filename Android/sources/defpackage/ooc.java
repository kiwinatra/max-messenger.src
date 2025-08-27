package defpackage;

import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.Iterator;
import one.me.rlottie.RLottieDrawable;

/* renamed from: ooc  reason: default package */
public final /* synthetic */ class ooc implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ RLottieDrawable b;

    public /* synthetic */ ooc(RLottieDrawable rLottieDrawable, int i) {
        this.a = i;
        this.b = rLottieDrawable;
    }

    public final void run() {
        RLottieDrawable rLottieDrawable = this.b;
        switch (this.a) {
            case 0:
                rLottieDrawable.invalidateInternal();
                return;
            default:
                Gson gson = RLottieDrawable.gson;
                rLottieDrawable.getClass();
                Iterator it = new ArrayList(rLottieDrawable.C1).iterator();
                while (it.hasNext()) {
                    ((RLottieDrawable.DrawableLoadListener) it.next()).onLoaded(rLottieDrawable);
                }
                return;
        }
    }
}
