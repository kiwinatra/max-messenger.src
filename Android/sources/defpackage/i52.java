package defpackage;

import kotlin.collections.CollectionsKt;
import kotlin.time.DurationKt;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.nano.Tasks;

/* renamed from: i52  reason: default package */
public final class i52 extends qm implements lcf, hdb {
    public final long o;
    public final long v;
    public final long w;
    public final boolean x;

    public i52(long j, long j2, long j3, long j4, boolean z) {
        super(j);
        this.o = j2;
        this.v = j3;
        this.w = j4;
        this.x = z;
    }

    public final int b() {
        a32 G = l().G(this.o);
        if (G == null) {
            return 1;
        }
        k72 k72 = G.b.c;
        return (k72 == k72.o || k72 == k72.v) ? 3 : 1;
    }

    public final void c() {
        s().d(this.a);
        o().A(this.o, this.w, qe9.ACTIVE);
        r62 l = l();
        long j = this.o;
        l.A(j);
        k().c(new xy2(CollectionsKt.listOf(Long.valueOf(j)), true, false, (bl4) null, (zub) null, 124));
    }

    public final byte[] d() {
        Tasks.ChatClear chatClear = new Tasks.ChatClear();
        chatClear.requestId = this.a;
        chatClear.chatId = this.o;
        chatClear.chatServerId = this.v;
        chatClear.lastEventTime = this.w;
        chatClear.forAll = this.x;
        return ad9.toByteArray(chatClear);
    }

    public final void e(ibf ibf) {
        rm rmVar = this.c;
        if (rmVar == null) {
            rmVar = null;
        }
        ((y13) rmVar.P.getValue()).a(this.o, this.w);
    }

    public final int f() {
        return DurationKt.NANOS_IN_MILLIS;
    }

    public final fbf g() {
        yt ytVar = new yt((x3b) null, 14);
        ytVar.p(this.v, ApiProtocol.PARAM_CHAT_ID);
        ytVar.p(this.w, "lastEventTime");
        ytVar.d("forAll", this.x);
        return ytVar;
    }

    public final long getId() {
        return this.a;
    }

    public final idb getType() {
        return idb.TYPE_CHAT_CLEAR;
    }

    public final void h(qaf qaf) {
        if (!(qaf instanceof aaf)) {
            c();
        }
    }
}
