package androidx.media3.exoplayer.hls;

import java.util.List;

public final class HlsMediaSource$Factory implements lz8 {
    public final rt6 a;
    public final qf4 b;
    public final v9a c = new v9a(10);
    public final ts1 d = vf4.z0;
    public final p9a e;
    public final jk3 f = new jk3(6);
    public final nfd g;
    public final boolean h;
    public final int i;
    public final long j;

    public HlsMediaSource$Factory(g74 g74) {
        this.a = new rt6(17, (Object) g74);
        qf4 qf4 = m07.a;
        this.b = qf4;
        this.g = new nfd(10);
        this.e = new p9a(10);
        this.i = 1;
        this.j = -9223372036854775807L;
        this.h = true;
        qf4.c = true;
    }

    public final lz8 a() {
        n79.k((Object) null, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
        throw null;
    }

    public final void b(boolean z) {
        this.b.c = z;
    }

    public final lz8 c() {
        n79.k((Object) null, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
        throw null;
    }

    public final void e(ece ece) {
        qf4 qf4 = this.b;
        ece.getClass();
        qf4.b = ece;
    }

    /* renamed from: f */
    public final e17 d(ir8 ir8) {
        ir8.b.getClass();
        q17 q17 = this.c;
        List list = ir8.b.e;
        if (!list.isEmpty()) {
            q17 = new p7d(12, (Object) q17, (Object) list);
        }
        qf4 qf4 = this.b;
        pw4 j2 = this.f.j(ir8);
        nfd nfd = this.g;
        this.d.getClass();
        vf4 vf4 = new vf4(this.a, nfd, q17);
        return new e17(ir8, this.a, qf4, this.e, j2, nfd, vf4, this.j, this.h, this.i);
    }
}
