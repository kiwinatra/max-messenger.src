package defpackage;

import android.os.SystemClock;

/* renamed from: en7  reason: default package */
public final class en7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ gn7 b;

    public /* synthetic */ en7(gn7 gn7, int i) {
        this.a = i;
        this.b = gn7;
    }

    public final void run() {
        j55 j55;
        int i;
        switch (this.a) {
            case 0:
                gn7 gn7 = this.b;
                gn7.getClass();
                long uptimeMillis = SystemClock.uptimeMillis();
                synchronized (gn7) {
                    j55 = gn7.e;
                    i = gn7.f;
                    gn7.e = null;
                    gn7.f = 0;
                    gn7.g = 3;
                    gn7.i = uptimeMillis;
                }
                try {
                    if (gn7.d(j55, i)) {
                        gn7.b.c(j55, i);
                    }
                    return;
                } finally {
                    j55.b(j55);
                    gn7.b();
                }
            default:
                gn7 gn72 = this.b;
                gn72.a.execute(gn72.c);
                return;
        }
    }
}
