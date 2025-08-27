package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.time.DurationKt;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.nano.Tasks;

/* renamed from: bk2  reason: default package */
public final class bk2 extends qm implements lcf, hdb {
    public final int X;
    public final int Y;
    public final String Z = bk2.class.getName();
    public final long o;
    public long v;
    public final int w;
    public final List x;
    public final ij2 y;
    public final boolean z;

    public bk2(long j, long j2, long j3, int i, List list, ij2 ij2, boolean z2, int i2, int i3) {
        super(j);
        this.o = j2;
        this.v = j3;
        this.w = i;
        this.x = list;
        this.y = ij2;
        this.z = z2;
        this.X = i2;
        this.Y = i3;
    }

    public final int b() {
        m72 m72;
        k72 k72;
        a32 G = l().G(this.o);
        if (G == null || (k72 = m72.c) == k72.w || k72 == k72.v || k72 == k72.o) {
            return 3;
        }
        if (this.v == 0) {
            long j = (m72 = G.b).a;
            if (j != 0) {
                this.v = j;
            }
        }
        return this.v != 0 ? 1 : 2;
    }

    public final void c() {
        z68.c(this.Z, "onMaxFailCount", new Object[0]);
        int ordinal = this.y.ordinal();
        int i = this.w;
        List list = this.x;
        long j = this.o;
        if (ordinal == 0) {
            int y2 = tr1.y(i);
            if (y2 == 0) {
                l().h0(j, list);
            } else if (y2 == 1) {
                l().e(j, list);
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else if (ordinal == 1) {
            int y3 = tr1.y(i);
            if (y3 == 0) {
                l().d0(j, list);
            } else if (y3 == 1) {
                r62 l = l();
                a32 G = l.G(j);
                if (G != null) {
                    l.i(j, false, new oj0((Object) l, (Object) list, this.Y, 2));
                    l.m.c(new xy2(Collections.singletonList(Long.valueOf(G.a)), false));
                }
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else if (ordinal != 2) {
            throw new NoWhenBranchMatchedException();
        }
        ((jna) i()).l(this.v);
        s().d(this.a);
    }

    public final byte[] d() {
        Tasks.ChatMembersUpdate chatMembersUpdate = new Tasks.ChatMembersUpdate();
        chatMembersUpdate.requestId = this.a;
        chatMembersUpdate.chatId = this.o;
        chatMembersUpdate.chatServerId = this.v;
        chatMembersUpdate.operation = a81.c(this.w);
        chatMembersUpdate.userIds = cjf.i(this.x);
        chatMembersUpdate.chatMemberType = this.y.a;
        chatMembersUpdate.showHistory = this.z;
        return ad9.toByteArray(chatMembersUpdate);
    }

    public final void e(ibf ibf) {
        a32 G;
        ck2 ck2 = (ck2) ibf;
        boolean z2 = !ck2.v.isEmpty();
        long j = this.o;
        if (z2) {
            ArrayList l = o().l(j, ck2.v);
            if (!l.isEmpty()) {
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(l, 10));
                Iterator it = l.iterator();
                while (it.hasNext()) {
                    arrayList.add(Long.valueOf(((ha9) it.next()).b));
                }
                o().d(j, arrayList);
                k().c(new kv9(j, arrayList, (bl4) null));
            }
        }
        if (ck2.c != null) {
            l().n0(CollectionsKt.listOf(ck2.c));
        }
        if (this.y == ij2.ADMIN && this.w == 1 && (G = l().G(j)) != null) {
            Iterator it2 = this.x.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (!G.b.R.containsKey(Long.valueOf(((Number) it2.next()).longValue()))) {
                    k().c(new hj0(this.a, new qaf("friend.blocks.me", "friend.blocks.me", (String) null)));
                    break;
                }
            }
        }
        k().c(new dk2(this.a, this.x, this.y, this.o, this.w));
    }

    public final int f() {
        return DurationKt.NANOS_IN_MILLIS;
    }

    public final fbf g() {
        long j = this.v;
        yt ytVar = new yt((x3b) null, 27);
        ytVar.p(j, ApiProtocol.PARAM_CHAT_ID);
        int i = this.w;
        ytVar.t("operation", a81.c(i));
        ytVar.i("userIds", this.x);
        ytVar.t("type", this.y.a);
        if (i == 1) {
            ytVar.d("showHistory", this.z);
        }
        int i2 = this.X;
        if (i2 != 0) {
            ytVar.h(i2, "cleanMsgPeriod");
        }
        int i3 = this.Y;
        if (i3 != 0) {
            ytVar.h(i3, "permissions");
        }
        return ytVar;
    }

    public final long getId() {
        return this.a;
    }

    public final idb getType() {
        return idb.TYPE_CHAT_MEMBERS_UPDATE;
    }

    public final void h(qaf qaf) {
        if (!m58.A(qaf.b)) {
            c();
        }
        k().c(new hj0(this.a, qaf));
        if (this.y == ij2.MEMBER) {
            k().c(new px3(qaf, this.o, this.x));
        }
    }
}
