package defpackage;

import kotlin.collections.CollectionsKt;
import kotlin.time.DurationKt;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.nano.Tasks;

/* renamed from: lv9  reason: default package */
public final class lv9 extends qm implements lcf, hdb {
    public final long o;
    public final long v;
    public final long w;
    public final bl4 x;
    public long y;

    public lv9(long j, long j2, long j3, long j4, bl4 bl4) {
        super(j);
        this.o = j2;
        this.v = j3;
        this.w = j4;
        this.x = bl4;
    }

    public final int b() {
        rm rmVar = this.c;
        if (rmVar == null) {
            rmVar = null;
        }
        a32 G = rmVar.c().G(this.o);
        if (G == null) {
            return 3;
        }
        this.y = G.b.a;
        return 1;
    }

    public final void c() {
        rm rmVar = this.c;
        if (rmVar == null) {
            rmVar = null;
        }
        rmVar.e().d(this.a);
    }

    public final byte[] d() {
        Tasks.MsgDeleteRange msgDeleteRange = new Tasks.MsgDeleteRange();
        msgDeleteRange.requestId = this.a;
        msgDeleteRange.chatId = this.o;
        msgDeleteRange.startTime = this.v;
        msgDeleteRange.endTime = this.w;
        msgDeleteRange.itemTypeId = this.x.a;
        return ad9.toByteArray(msgDeleteRange);
    }

    public final void e(ibf ibf) {
        mv9 mv9 = (mv9) ibf;
        rm rmVar = this.c;
        rm rmVar2 = null;
        if (rmVar == null) {
            rmVar = null;
        }
        rmVar.d().c(this.o, this.v, this.w);
        rm rmVar3 = this.c;
        if (rmVar3 != null) {
            rmVar2 = rmVar3;
        }
        rmVar2.c().n0(CollectionsKt.listOf(mv9.c));
    }

    public final int f() {
        return DurationKt.NANOS_IN_MILLIS;
    }

    public final fbf g() {
        long j = this.y;
        np2 np2 = new np2(x3b.MSG_DELETE_RANGE, 20);
        np2.p(j, ApiProtocol.PARAM_CHAT_ID);
        np2.p(this.v, "startTime");
        np2.p(this.w, "endTime");
        np2.t("itemType", this.x.name());
        return np2;
    }

    public final long getId() {
        return this.a;
    }

    public final idb getType() {
        return idb.TYPE_MSG_DELETE_RANGE;
    }

    public final void h(qaf qaf) {
        if (!m58.A(qaf.b)) {
            c();
        }
    }
}
