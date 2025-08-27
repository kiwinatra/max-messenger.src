package defpackage;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: n3g  reason: default package */
public final class n3g extends bt1 {
    public boolean a = true;
    public final /* synthetic */ AtomicBoolean b;
    public final /* synthetic */ do1 c;
    public final /* synthetic */ bwd d;

    public n3g(AtomicBoolean atomicBoolean, do1 do1, bwd bwd) {
        this.b = atomicBoolean;
        this.c = do1;
        this.d = bwd;
    }

    public final void b(int i, it1 it1) {
        Object obj;
        if (this.a) {
            this.a = false;
            it1.getTimestamp();
            SystemClock.uptimeMillis();
            SystemClock.elapsedRealtime();
        }
        AtomicBoolean atomicBoolean = this.b;
        if (!atomicBoolean.get() && (obj = it1.d().a.get("androidx.camera.video.VideoCapture.streamUpdate")) != null) {
            int intValue = ((Integer) obj).intValue();
            do1 do1 = this.c;
            if (intValue == do1.hashCode() && do1.b((Object) null) && !atomicBoolean.getAndSet(true)) {
                ryg.G().execute(new s6e(20, this, this.d));
            }
        }
    }
}
