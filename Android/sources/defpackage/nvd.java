package defpackage;

/* renamed from: nvd  reason: default package */
public final class nvd extends gud {
    public final long b;

    public nvd(long j) {
        this.b = j;
    }

    public final void z() {
        r62 e = e();
        e.getClass();
        StringBuilder sb = new StringBuilder("storeChatFromCache chatId = ");
        long j = this.b;
        sb.append(j);
        z68.c("r62", sb.toString(), new Object[0]);
        n72 E = e.E(j);
        if (E == null) {
            z68.f("r62", "storeChatFromCache, chatId = " + j, (Throwable) null);
            return;
        }
        ((a74) ((s74) e.l.get())).b.g(j, E.c);
    }
}
