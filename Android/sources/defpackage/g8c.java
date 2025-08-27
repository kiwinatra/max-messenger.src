package defpackage;

/* renamed from: g8c  reason: default package */
public final class g8c implements lz8 {
    public final g74 a;
    public final y3a b;
    public final jk3 c;
    public final nfd d;
    public final int e = 1048576;

    public g8c(g74 g74, jf4 jf4) {
        y3a y3a = new y3a(19, (Object) jf4);
        jk3 jk3 = new jk3(6);
        nfd nfd = new nfd(10);
        this.a = g74;
        this.b = y3a;
        this.c = jk3;
        this.d = nfd;
    }

    public final lz8 a() {
        n79.k((Object) null, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
        throw null;
    }

    public final lz8 c() {
        n79.k((Object) null, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
        throw null;
    }

    public final yj0 d(ir8 ir8) {
        ir8.b.getClass();
        return new i8c(ir8, this.a, this.b, this.c.j(ir8), this.d, this.e);
    }
}
