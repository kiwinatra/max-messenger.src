package defpackage;

/* renamed from: q3g  reason: default package */
public final class q3g implements iha {
    public au1 a;
    public boolean b;

    public final void a(Object obj) {
        bs0.r("SourceStreamRequirementObserver can be updated from main thread only", ev0.s());
        boolean equals = Boolean.TRUE.equals((Boolean) obj);
        if (this.b != equals) {
            this.b = equals;
            au1 au1 = this.a;
            if (au1 == null) {
                return;
            }
            if (equals) {
                au1.o();
            } else {
                au1.a();
            }
        }
    }

    public final void onError(Throwable th) {
    }
}
