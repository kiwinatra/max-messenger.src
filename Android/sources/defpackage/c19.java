package defpackage;

import java.util.concurrent.CountDownLatch;

/* renamed from: c19  reason: default package */
public final class c19 {
    public final a19 a;
    public final String b = getClass().getName();
    public final /* synthetic */ int c;
    public final /* synthetic */ d19 d;
    public final /* synthetic */ Object e;

    public c19(a19 a19, d19 d19, Object obj, int i) {
        this.c = i;
        this.d = d19;
        this.e = obj;
        this.a = a19;
    }

    public final void a() {
        switch (this.c) {
            case 0:
                String str = (String) this.d.c;
                a67 a67 = z68.b;
                if (a67 != null && a67.c()) {
                    a67.d(w78.o, str, "executeWithDetachableLooper.done, quit loop ...", (Throwable) null);
                }
                ((pm4) this.e).b.quitSafely();
                return;
            default:
                String str2 = (String) this.d.c;
                a67 a672 = z68.b;
                if (a672 != null && a672.c()) {
                    a672.d(w78.o, str2, "executeWithMainLooper.done", (Throwable) null);
                }
                ((CountDownLatch) this.e).countDown();
                return;
        }
    }
}
