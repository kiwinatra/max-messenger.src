package defpackage;

import android.os.Process;
import com.google.gson.Gson;
import kotlin.Lazy;
import one.me.rlottie.RLottieDrawable;
import one.me.rlottie.a;

/* renamed from: i40  reason: default package */
public final /* synthetic */ class i40 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Runnable b;

    public /* synthetic */ i40(Runnable runnable, int i) {
        this.a = i;
        this.b = runnable;
    }

    public final void run() {
        Runnable runnable = this.b;
        switch (this.a) {
            case 0:
                Process.setThreadPriority(-16);
                runnable.run();
                return;
            case 1:
                try {
                    runnable.run();
                    return;
                } catch (InterruptedException e) {
                    throw e;
                } catch (IllegalStateException e2) {
                    z68.f("Fresco", "failed to execute fresco task", e2);
                    return;
                }
            case 2:
                try {
                    runnable.run();
                    return;
                } catch (InterruptedException e3) {
                    throw e3;
                } catch (IllegalStateException e4) {
                    z68.f("Fresco", "failed to execute fresco task", e4);
                    return;
                }
            case 3:
                try {
                    runnable.run();
                    return;
                } catch (InterruptedException e5) {
                    throw e5;
                } catch (IllegalStateException e6) {
                    z68.f("Fresco", "failed to execute fresco task", e6);
                    return;
                }
            case 4:
                Gson gson = RLottieDrawable.gson;
                a.d(runnable);
                return;
            case 5:
                Gson gson2 = RLottieDrawable.gson;
                a.d(runnable);
                return;
            default:
                Lazy lazy = ipf.a;
                ipf.a(runnable);
                return;
        }
    }
}
