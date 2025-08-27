package defpackage;

import android.os.SystemClock;

/* renamed from: nc4  reason: default package */
public final class nc4 {
    public final /* synthetic */ int a;
    public Exception b;
    public long c;

    public /* synthetic */ nc4(int i) {
        this.a = i;
    }

    public final void a(Exception exc) {
        switch (this.a) {
            case 0:
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (this.b == null) {
                    this.b = exc;
                    this.c = 100 + elapsedRealtime;
                }
                if (elapsedRealtime >= this.c) {
                    Exception exc2 = this.b;
                    if (exc2 != exc) {
                        exc2.addSuppressed(exc);
                    }
                    Exception exc3 = this.b;
                    this.b = null;
                    throw exc3;
                }
                return;
            default:
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                if (this.b == null) {
                    this.b = exc;
                    this.c = 100 + elapsedRealtime2;
                }
                if (elapsedRealtime2 >= this.c) {
                    Exception exc4 = this.b;
                    if (exc4 != exc) {
                        exc4.addSuppressed(exc);
                    }
                    Exception exc5 = this.b;
                    this.b = null;
                    throw exc5;
                }
                return;
        }
    }
}
