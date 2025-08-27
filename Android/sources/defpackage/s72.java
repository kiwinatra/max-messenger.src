package defpackage;

import kotlin.time.DurationKt;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.nano.Tasks;

/* renamed from: s72  reason: default package */
public final class s72 extends qm implements lcf, hdb {
    public final long o;
    public final long v;
    public final long w;
    public final boolean x;

    public s72(long j, long j2, long j3, long j4, boolean z) {
        super(j);
        this.o = j2;
        this.v = j3;
        this.w = j4;
        this.x = z;
    }

    public final int b() {
        r62 l = l();
        long j = this.o;
        a32 G = l.G(j);
        if (G == null || G.b.c != k72.o) {
            return 1;
        }
        rm rmVar = this.c;
        if (rmVar == null) {
            rmVar = null;
        }
        ((y13) rmVar.P.getValue()).a(j, this.w);
        return 3;
    }

    public final void c() {
        s().d(this.a);
    }

    public final byte[] d() {
        Tasks.ChatDelete chatDelete = new Tasks.ChatDelete();
        chatDelete.requestId = this.a;
        chatDelete.chatId = this.o;
        chatDelete.chatServerId = this.v;
        chatDelete.lastEventTime = this.w;
        chatDelete.forAll = this.x;
        return ad9.toByteArray(chatDelete);
    }

    public final void e(ibf ibf) {
        r62 l = l();
        k72 k72 = k72.o;
        long j = this.o;
        l.k(j, k72);
        rm rmVar = this.c;
        if (rmVar == null) {
            rmVar = null;
        }
        ((y13) rmVar.P.getValue()).a(j, this.w);
        k().c(new c1d(j));
    }

    public final int f() {
        return DurationKt.NANOS_IN_MILLIS;
    }

    public final fbf g() {
        yt ytVar = new yt((x3b) null, 18);
        ytVar.p(this.v, ApiProtocol.PARAM_CHAT_ID);
        ytVar.p(this.w, "lastEventTime");
        ytVar.d("forAll", this.x);
        return ytVar;
    }

    public final long getId() {
        return this.a;
    }

    public final idb getType() {
        return idb.TYPE_CHAT_DELETE;
    }

    public final void h(qaf qaf) {
        if (!m58.A(qaf.b)) {
            c();
        }
    }
}
