package defpackage;

/* renamed from: xm  reason: default package */
public final /* synthetic */ class xm {
    public final /* synthetic */ ym a;

    public /* synthetic */ xm(ym ymVar) {
        this.a = ymVar;
    }

    public final void a(Throwable th) {
        ym ymVar = this.a;
        ymVar.getClass();
        try {
            z68.f("Payload", "error while parse payload", th);
            ((qra) ((id3) ymVar.c.getValue())).E().d().a((String) null, th);
        } catch (Throwable th2) {
            z68.f("Payload", "failed to collect exception", th2);
        }
    }
}
