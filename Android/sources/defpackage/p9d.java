package defpackage;

/* renamed from: p9d  reason: default package */
public final /* synthetic */ class p9d implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ q9d b;
    public final /* synthetic */ long c;

    public /* synthetic */ p9d(q9d q9d, long j, int i) {
        this.a = i;
        this.b = q9d;
        this.c = j;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                q9d q9d = this.b;
                q9d.m.offer(Long.valueOf(this.c));
                q9d.b();
                return;
            default:
                q9d q9d2 = this.b;
                q9d2.getClass();
                q9d2.f.post(new p9d(q9d2, this.c, 0));
                return;
        }
    }
}
