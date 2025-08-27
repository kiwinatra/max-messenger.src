package defpackage;

import androidx.work.WorkRequest;

/* renamed from: mo5  reason: default package */
public final class mo5 extends pl0 {
    public final rl a;
    public final lfd b;
    public final gcf c;
    public final long d;

    public mo5(rl rlVar, lfd lfd, gcf gcf, long j) {
        this.a = rlVar;
        this.b = lfd;
        this.c = gcf;
        this.d = j;
    }

    public final lbe a() {
        fce U = ((jna) this.a).U(new np2(this.d, 15), this.b);
        long currentTimeMillis = System.currentTimeMillis();
        gcf gcf = this.c;
        gcf.getClass();
        return new wbe(U, new ac2(4, WorkRequest.MIN_BACKOFF_MILLIS, currentTimeMillis), 2).k(new ecf(gcf, 1, 0)).i(new ci5(28));
    }
}
