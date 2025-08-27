package defpackage;

import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;

/* renamed from: pq0  reason: default package */
public final class pq0 extends qm implements lcf {
    public final /* synthetic */ int o;
    public final long v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pq0(int i, long j, long j2) {
        super(j);
        this.o = i;
        this.v = j2;
    }

    private final void t(qaf qaf) {
    }

    private final void u(qaf qaf) {
    }

    private final void v(ibf ibf) {
    }

    public final void e(ibf ibf) {
        switch (this.o) {
            case 0:
                qq0 qq0 = (qq0) ibf;
                fo3 fo3 = qq0.o;
                if (fo3 != null) {
                    m().D(CollectionsKt.listOf(fo3));
                    r62 l = l();
                    long j = this.v;
                    a32 K = l.K(j);
                    Map mapOf = MapsKt.mapOf(TuplesKt.to(Long.valueOf(j), fo3));
                    k().c(new e42(this.a, K.a, qq0.c, mapOf));
                    return;
                }
                return;
            case 1:
                k().c(new cr3(this.a, ((br3) ibf).c));
                return;
            default:
                return;
        }
    }

    public final fbf g() {
        long j = this.v;
        switch (this.o) {
            case 0:
                yt ytVar = new yt(x3b.BOT_INFO, 9);
                ytVar.p(j, "botId");
                return ytVar;
            case 1:
                np2 np2 = new np2((x3b) null, 8);
                np2.p(j, "userId");
                return np2;
            default:
                if (j == 0) {
                    return new np2(0, 27);
                }
                a32 G = l().G(j);
                if (G != null) {
                    m72 m72 = G.b;
                    if (m72.a != 0 || l().W(G)) {
                        return new np2(m72.a, 27);
                    }
                }
                z68.f("pq0", "createRequest: No chat or serverId == 0. return null", (Throwable) null);
                return null;
        }
    }

    public final void h(qaf qaf) {
        switch (this.o) {
            case 0:
                return;
            case 1:
                k().c(new hj0(this.a, qaf));
                return;
            default:
                return;
        }
    }
}
