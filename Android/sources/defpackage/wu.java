package defpackage;

import ru.ok.tamtam.util.HandledException;

/* renamed from: wu  reason: default package */
public final /* synthetic */ class wu implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ se2 b;
    public final /* synthetic */ gz6 c;

    public /* synthetic */ wu(se2 se2, a89 a89, int i) {
        this.a = i;
        this.b = se2;
        this.c = a89;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                gz6 gz6 = this.c;
                se2 se2 = this.b;
                se2.getClass();
                try {
                    se2.b.b(gz6);
                    return;
                } catch (Throwable th) {
                    z68.f(se2.a, "addHistoryItem: exception", th);
                    se2.w.a(new HandledException(th));
                    return;
                }
            default:
                gz6 gz62 = this.c;
                se2 se22 = this.b;
                se22.getClass();
                try {
                    se22.b.r(gz62);
                    return;
                } catch (Throwable th2) {
                    z68.f(se22.a, "updateHistoryItemSync: exception", th2);
                    se22.w.a(new HandledException(th2));
                    return;
                }
        }
    }
}
