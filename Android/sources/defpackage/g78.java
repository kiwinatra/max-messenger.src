package defpackage;

import android.os.SystemClock;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;

/* renamed from: g78  reason: default package */
public final class g78 implements wq {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g78(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void b() {
    }

    public final void a() {
        switch (this.a) {
            case 0:
                k78.h((k78) this.b, false, 3);
                return;
            default:
                ((z5a) this.b).i = SystemClock.elapsedRealtime();
                z5a.g((z5a) this.b, jgd.APPLICATION_BACKGROUND);
                return;
        }
    }

    public final void c() {
        switch (this.a) {
            case 0:
                return;
            default:
                z5a z5a = (z5a) this.b;
                if (z5a.i != 0) {
                    une une = (une) z5a.l.get();
                    String str = z5a.f;
                    a67 a67 = z68.b;
                    if (a67 != null && a67.c()) {
                        w78 w78 = w78.o;
                        long j = z5a.i;
                        a67.d(w78, str, "Navigation stats. Try update session id on warmStart, lastTime:" + j + "|lastCondition:" + une, (Throwable) null);
                    }
                    if (!z5a.e()) {
                        une.getClass();
                        if (une != une.b && une != une.c) {
                            ev0.v(z5a.e, (CoroutineContext) null, (f14) null, new w5a(z5a, (Continuation) null), 3);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
