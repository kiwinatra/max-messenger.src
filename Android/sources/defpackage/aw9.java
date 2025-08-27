package defpackage;

import me.leolin.shortcutbadger.impl.NewHtcHomeBadger;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* renamed from: aw9  reason: default package */
public final class aw9 extends qm implements lcf {
    public final long o;
    public final String v;
    public final int w = 100;
    public final long x;
    public final String y;

    public aw9(long j, long j2, long j3, String str) {
        super(j);
        this.o = j2;
        this.v = str;
        this.x = j3;
        this.y = aw9.class.getName();
    }

    public final void e(ibf ibf) {
        bw9 bw9 = (bw9) ibf;
        k().c(new sk2(this.a, this.v, bw9.c, bw9.o, bw9.v));
    }

    public final fbf g() {
        a32 G = l().G(this.o);
        if (G != null) {
            m72 m72 = G.b;
            if (m72.a != 0 || l().W(G)) {
                np2 np2 = new np2((x3b) null, 26);
                np2.p(m72.a, ApiProtocol.PARAM_CHAT_ID);
                np2.t("query", this.v);
                np2.h(this.w, NewHtcHomeBadger.COUNT);
                long j = this.x;
                if (j != 0) {
                    np2.p(j, "marker");
                }
                return np2;
            }
        }
        z68.f(this.y, "createRequest: No chat or serverId == 0. return null", (Throwable) null);
        return null;
    }

    public final void h(qaf qaf) {
        k().c(new hj0(this.a, qaf));
    }
}
