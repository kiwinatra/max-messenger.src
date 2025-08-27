package defpackage;

import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.time.DurationKt;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.nano.Tasks;

/* renamed from: fv9  reason: default package */
public final class fv9 extends qm implements lcf, hdb {
    public static final /* synthetic */ int y = 0;
    public final long o;
    public final long v;
    public final long w;
    public final long x;

    public fv9(long j, long j2, long j3, long j4, long j5) {
        super(j);
        this.o = j2;
        this.v = j3;
        this.w = j4;
        this.x = j5;
    }

    public final int b() {
        fa9 o2 = o();
        long j = this.v;
        ha9 r = o2.r(j);
        r62 l = l();
        long j2 = this.o;
        a32 G = l.G(j2);
        for (tdf tdf : s().h(this.a, idb.TYPE_MSG_CANCEL_REACTION)) {
            fv9 fv9 = (fv9) tdf.f;
            if (fv9.o == j2 && fv9.v == j) {
                z68.c("fv9", "onPreExecute: later cancel_reaction task found, REMOVE", new Object[0]);
                return 3;
            }
        }
        if (r == null || r.Y == qe9.DELETED || G == null || (!G.E() && !G.S())) {
            z68.c("fv9", "onPreExecute: message or chat not found, REMOVE", new Object[0]);
            return 3;
        } else if (this.x == 0) {
            z68.c("fv9", "onPreExecute: message serverId == 0, REMOVE", new Object[0]);
            return 3;
        } else if (G.b.a != 0 || l().W(G)) {
            return 1;
        } else {
            z68.c("fv9", "onPreExecute: chat serverId == 0, SKIP", new Object[0]);
            return 2;
        }
    }

    public final void c() {
        s().d(this.a);
    }

    public final byte[] d() {
        Tasks.MsgCancelReaction msgCancelReaction = new Tasks.MsgCancelReaction();
        msgCancelReaction.requestId = this.a;
        msgCancelReaction.chatId = this.o;
        msgCancelReaction.chatServerId = this.w;
        msgCancelReaction.messageId = this.v;
        msgCancelReaction.messageServerId = this.x;
        return ad9.toByteArray(msgCancelReaction);
    }

    public final void e(ibf ibf) {
        ud9 ud9 = ((gv9) ibf).c;
        rm rmVar = null;
        Integer valueOf = ud9 != null ? Integer.valueOf(ud9.b) : null;
        z68.c("fv9", "reactions, cancelTask onSuccess, reactionInfoTotalCount = " + valueOf + "}", new Object[0]);
        rm rmVar2 = this.c;
        if (rmVar2 != null) {
            rmVar = rmVar2;
        }
        ((ae9) rmVar.M.getValue()).f(this.o, MapsKt.mapOf(TuplesKt.to(Long.valueOf(this.x), ud9)));
    }

    public final int f() {
        return DurationKt.NANOS_IN_MILLIS;
    }

    public final fbf g() {
        np2 np2 = new np2((x3b) null, 18);
        long j = this.x;
        if (j != 0) {
            np2.p(this.w, ApiProtocol.PARAM_CHAT_ID);
            np2.p(j, "messageId");
            return np2;
        }
        throw new IllegalArgumentException("param messageId can't be 0".toString());
    }

    public final long getId() {
        return this.a;
    }

    public final idb getType() {
        return idb.TYPE_MSG_CANCEL_REACTION;
    }

    public final void h(qaf qaf) {
        z68.h("fv9", qaf.v, "reactions, cancelTask onFail %s", qaf);
        k().c(new hj0(this.a, qaf));
    }
}
