package one.me.rlottie;

import android.os.SystemClock;
import androidx.work.WorkRequest;

public final class f implements Runnable {
    public final /* synthetic */ g a;

    public f(g gVar) {
        this.a = gVar;
    }

    public final void run() {
        g gVar = this.a;
        if (!gVar.a.isEmpty()) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            int i = 0;
            while (i < gVar.a.size()) {
                d dVar = (d) gVar.a.get(i);
                if (dVar.c < elapsedRealtime - WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS) {
                    dVar.a.getLooper().quit();
                    gVar.a.remove(i);
                    gVar.e--;
                    i--;
                }
                i++;
            }
        }
        if (!gVar.a.isEmpty() || !gVar.c.isEmpty()) {
            RLottie.config.workQueue.post(this, WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS);
            gVar.h = true;
            return;
        }
        gVar.h = false;
    }
}
