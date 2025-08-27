package defpackage;

import android.os.SystemClock;

/* renamed from: lzf  reason: default package */
public final class lzf {
    public final /* synthetic */ int a;

    public /* synthetic */ lzf(int i) {
        this.a = i;
    }

    public final long a() {
        switch (this.a) {
            case 0:
                return SystemClock.elapsedRealtime();
            default:
                return System.currentTimeMillis();
        }
    }
}
