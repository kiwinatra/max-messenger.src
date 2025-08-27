package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.DurationKt;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.nano.Tasks;

/* renamed from: yv9  reason: default package */
public final class yv9 extends qm implements lcf, hdb {
    public final long o;
    public final long v;
    public final long w;
    public final long x;
    public final nd9 y;
    public final String z = yv9.class.getName();

    public yv9(long j, long j2, long j3, long j4, long j5, nd9 nd9) {
        super(j);
        this.o = j2;
        this.v = j3;
        this.w = j4;
        this.x = j5;
        this.y = nd9;
    }

    public final int b() {
        fa9 o2 = o();
        long j = this.v;
        ha9 r = o2.r(j);
        r62 l = l();
        long j2 = this.o;
        a32 G = l.G(j2);
        Iterator it = s().h(this.a, idb.TYPE_MSG_REACT).iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            String str = this.z;
            if (hasNext) {
                yv9 yv9 = (yv9) ((tdf) it.next()).f;
                if (yv9.o == j2 && yv9.v == j) {
                    z68.c(str, "onPreExecute: later react task found, REMOVE", new Object[0]);
                    return 3;
                }
            } else if (r == null || r.Y == qe9.DELETED || G == null || (!G.E() && !G.S())) {
                z68.c(str, "onPreExecute: message or chat not found, REMOVE", new Object[0]);
                return 3;
            } else if (this.x == 0) {
                z68.c(str, "onPreExecute: message serverId == 0, REMOVE", new Object[0]);
                return 3;
            } else if (G.b.a != 0 || l().W(G)) {
                z68.c(str, "onPreExecute, READY", new Object[0]);
                return 1;
            } else {
                z68.c(str, "onPreExecute: chat serverId == 0, SKIP", new Object[0]);
                return 2;
            }
        }
    }

    public final void c() {
        xd9 xd9;
        s().d(this.a);
        ha9 r = o().r(this.v);
        if (r != null && (xd9 = r.Q0) != null) {
            rm rmVar = this.c;
            if (rmVar == null) {
                rmVar = null;
            }
            hqc b = ((yd9) rmVar.e0.getValue()).b(this.y.b);
            Iterable<wd9> iterable = xd9.a;
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                for (wd9 wd9 : iterable) {
                    if (Intrinsics.areEqual((Object) wd9.a.b, (Object) b)) {
                        z68.c(this.z, "reactions, onMaxFailCount, remove reaction from message", new Object[0]);
                        return;
                    }
                }
            }
        }
    }

    public final byte[] d() {
        Tasks.MsgReact msgReact = new Tasks.MsgReact();
        msgReact.requestId = this.a;
        msgReact.chatId = this.o;
        msgReact.chatServerId = this.w;
        msgReact.messageId = this.v;
        msgReact.messageServerId = this.x;
        nd9 nd9 = this.y;
        msgReact.reaction = nd9.b;
        msgReact.reactionType = nd9.a.ordinal();
        return ad9.toByteArray(msgReact);
    }

    public final void e(ibf ibf) {
        zv9 zv9 = (zv9) ibf;
        ud9 ud9 = zv9.c;
        rm rmVar = null;
        String str = this.z;
        if (ud9 == null) {
            sv0 k = k();
            String str2 = zv9.o;
            if (str2 == null) {
                str2 = "server bug";
            }
            k.c(new hj0(this.a, new qaf(str2, "", (String) null)));
            z68.p(str, "onSuccess: its server bug!, skip");
            return;
        }
        z68.c(str, "reactions, reactTamTask onSuccess, reactionInfoTotalCount = " + ud9.b + "}", new Object[0]);
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
        np2 np2 = new np2((x3b) null, 25);
        long j = this.x;
        if (j != 0) {
            nd9 nd9 = this.y;
            if (nd9.b.length() != 0) {
                np2.p(this.w, ApiProtocol.PARAM_CHAT_ID);
                np2.p(j, "messageId");
                np2.s("reaction", MapsKt.mapOf(TuplesKt.to("reactionType", nd9.a.name()), TuplesKt.to("id", nd9.b)));
                return np2;
            }
            throw new IllegalArgumentException("param reaction.id can't be empty");
        }
        throw new IllegalArgumentException("param messageId can't be 0");
    }

    public final long getId() {
        return this.a;
    }

    public final idb getType() {
        return idb.TYPE_MSG_REACT;
    }

    public final void h(qaf qaf) {
        String str = this.z;
        z68.h(str, qaf.v, "reactions, reactTamTask onFail: %s", qaf);
        k().c(new hj0(this.a, qaf));
        rm rmVar = this.c;
        if (rmVar == null) {
            rmVar = null;
        }
        if (((Set) ((akd) ((bud) rmVar.d.getValue())).k.getValue()).contains(qaf.b)) {
            z68.g(str, "это для диалогов/чатов невалидное сообщение или ошибка доступа к чату/диалогу", qaf);
            c();
        }
    }
}
