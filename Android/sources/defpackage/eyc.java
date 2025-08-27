package defpackage;

/* renamed from: eyc  reason: default package */
public final /* synthetic */ class eyc implements Runnable {
    public final /* synthetic */ lyc a;
    public final /* synthetic */ zb0 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int o;
    public final /* synthetic */ Throwable v;

    public /* synthetic */ eyc(lyc lyc, zb0 zb0, long j, int i, RuntimeException runtimeException) {
        this.a = lyc;
        this.b = zb0;
        this.c = j;
        this.o = i;
        this.v = runtimeException;
    }

    public final void run() {
        this.a.F(this.b, this.c, this.o, (Exception) this.v);
    }
}
