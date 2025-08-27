package defpackage;

import android.view.PixelCopy;
import java.util.concurrent.Semaphore;

/* renamed from: b4f  reason: default package */
public final /* synthetic */ class b4f implements PixelCopy.OnPixelCopyFinishedListener {
    public final /* synthetic */ Semaphore a;

    public /* synthetic */ b4f(Semaphore semaphore) {
        this.a = semaphore;
    }

    public final void onPixelCopyFinished(int i) {
        this.a.release();
    }
}
