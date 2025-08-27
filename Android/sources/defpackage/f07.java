package defpackage;

import android.os.SystemClock;
import java.util.List;

/* renamed from: f07  reason: default package */
public final class f07 extends yk0 {
    public int g;

    public final int b() {
        return this.g;
    }

    public final int k() {
        return 0;
    }

    public final Object m() {
        return null;
    }

    public final void t(long j, long j2, long j3, List list, zm8[] zm8Arr) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (s(this.g, elapsedRealtime)) {
            for (int i = this.b - 1; i >= 0; i--) {
                if (!s(i, elapsedRealtime)) {
                    this.g = i;
                    return;
                }
            }
            throw new IllegalStateException();
        }
    }
}
