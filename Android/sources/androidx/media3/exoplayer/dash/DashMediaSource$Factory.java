package androidx.media3.exoplayer.dash;

import androidx.work.WorkRequest;
import java.util.List;

public final class DashMediaSource$Factory implements lz8 {
    public final cs a;
    public final g74 b;
    public final jk3 c = new jk3(6);
    public final p9a d = new p9a(10);
    public final nfd e = new nfd(10);
    public final long f = WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS;
    public final long g = 5000000;

    public DashMediaSource$Factory(g74 g74) {
        cs csVar = new cs(g74);
        this.a = csVar;
        this.b = g74;
        ((qf4) csVar.o).c = true;
    }

    public final lz8 a() {
        n79.k((Object) null, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
        throw null;
    }

    public final void b(boolean z) {
        ((qf4) this.a.o).c = z;
    }

    public final lz8 c() {
        n79.k((Object) null, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
        throw null;
    }

    public final void e(ece ece) {
        ece.getClass();
        qf4 qf4 = (qf4) this.a.o;
        qf4.getClass();
        qf4.b = ece;
    }

    /* renamed from: f */
    public final o64 d(ir8 ir8) {
        ir8.b.getClass();
        o8b c64 = new c64();
        List list = ir8.b.e;
        return new o64(ir8, this.b, !list.isEmpty() ? new npg(12, (Object) c64, (Object) list) : c64, this.a, this.d, this.c.j(ir8), this.e, this.f, this.g);
    }
}
